// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.coupon;

import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.Manager;
import com.dominos.android.sdk.common.OrderUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.cart.CartManager;
import com.dominos.android.sdk.core.loyalty.LoyaltyUtil;
import com.dominos.android.sdk.core.models.CouponWizardLineHolder;
import com.dominos.android.sdk.core.models.FoodMenu;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.ProductCouponMatch;
import com.dominos.android.sdk.core.models.coupon.Coupon;
import com.dominos.android.sdk.core.models.coupon.CouponTags;
import com.dominos.android.sdk.core.models.coupon.Day;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
import com.dominos.android.sdk.core.models.coupon.LabsCouponProductGroup;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.android.sdk.data.http.power.PowerRestClient;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class CouponWizardManager extends Manager
{

    private static final String DATE_FORMAT_WEEKDAY = "EEE";
    public static final String TAG = com/dominos/android/sdk/core/coupon/CouponWizardManager.getSimpleName();
    private Map couponByCodeList;
    private CartManager mCartManager;
    private LabsCouponLine mCouponLine;
    private List mCouponWizardLineHolders;
    private List mDisplayedCouponList;
    private MenuManager mMenuManager;
    OrderUtil mOrderUtil;
    PowerRestClient powerRestClient;

    public CouponWizardManager()
    {
        couponByCodeList = new HashMap();
    }

    private List buildCouponWizardHolderList()
    {
        ArrayList arraylist = new ArrayList();
        Coupon coupon = getUpdatedCouponByCode(mCouponLine.getCoupon().getCode());
        ArrayList arraylist1 = new ArrayList(mCartManager.getCouponProductLines(mCouponLine));
        Iterator iterator = coupon.getProductGroups().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            LabsCouponProductGroup labscouponproductgroup = (LabsCouponProductGroup)iterator.next();
            Iterator iterator1 = arraylist1.iterator();
            int i = labscouponproductgroup.getRequiredQty();
            int k;
label0:
            do
            {
label1:
                {
                    k = i;
                    if (!iterator1.hasNext())
                    {
                        break label0;
                    }
                    LabsProductLine labsproductline = ((ProductCouponMatch)iterator1.next()).getProductLine();
                    k = i;
                    if (!labscouponproductgroup.getProductCodes().contains(labsproductline.getCode()))
                    {
                        break label1;
                    }
                    if (i <= 0)
                    {
                        k = i;
                        if (coupon.isBundled())
                        {
                            break label1;
                        }
                    }
                    k = i;
                    if (setUpProductLines(labsproductline, labscouponproductgroup, arraylist))
                    {
                        k = i - 1;
                        iterator1.remove();
                    }
                }
                if (k <= 0 && coupon.isBundled())
                {
                    break;
                }
                i = k;
            } while (true);
            if (k > 0)
            {
                int j = 0;
                while (j < k) 
                {
                    LabsCouponLine labscouponline = new LabsCouponLine();
                    labscouponline.setCoupon(mCouponLine.getCoupon());
                    arraylist.add(new CouponWizardLineHolder(labscouponline, labscouponproductgroup));
                    j++;
                }
            }
        } while (true);
        return arraylist;
    }

    public static CouponErrorType getCouponErrorTypeFromCode(LabsCouponLine labscouponline, String s)
    {
        CouponErrorType couponerrortype;
        if (s == null)
        {
            couponerrortype = null;
        } else
        {
            CouponErrorType couponerrortype1 = CouponErrorType.ValidCoupon;
            if (s.equalsIgnoreCase("CouponExclusivityViolation"))
            {
                return CouponErrorType.CouponExclusivityViolation;
            }
            if (s.equalsIgnoreCase("CouponIsInvalidForDayPart"))
            {
                return CouponErrorType.CouponIsInvalidForDayPart;
            }
            if (s.equalsIgnoreCase("CouponIsInvalidForDayOfWeek"))
            {
                return CouponErrorType.CouponIsInvalidForDayOfWeek;
            }
            if (s.equalsIgnoreCase("UsageCountViolation"))
            {
                return CouponErrorType.UsageCountViolation;
            }
            if (s.equalsIgnoreCase("InvalidServiceMethodForCoupon"))
            {
                return CouponErrorType.InvalidServiceMethodForCoupon;
            }
            if (s.equalsIgnoreCase("BelowMinimumOrderAmount"))
            {
                return CouponErrorType.BelowMinimumOrderAmount;
            }
            if (s.equalsIgnoreCase("CouponIsNotEffectiveOrExpired"))
            {
                return CouponErrorType.CouponIsNotEffectiveOrExpired;
            }
            couponerrortype = couponerrortype1;
            if (labscouponline.getStatus() != 0)
            {
                couponerrortype = couponerrortype1;
                if (!s.equalsIgnoreCase("Unfulfilled"))
                {
                    return CouponErrorType.InValidCoupon;
                }
            }
        }
        return couponerrortype;
    }

    private boolean productLineHasRemainingLines(LabsProductLine labsproductline, List list)
    {
        int j;
        if (labsproductline != null)
        {
            int i = labsproductline.getQuantity();
            list = list.iterator();
            do
            {
                j = i;
                if (!list.hasNext())
                {
                    break;
                }
                CouponWizardLineHolder couponwizardlineholder = (CouponWizardLineHolder)list.next();
                if ((couponwizardlineholder.getLine() instanceof LabsProductLine) && ((LabsProductLine)couponwizardlineholder.getLine()).getId() == labsproductline.getId())
                {
                    i--;
                }
            } while (true);
        } else
        {
            j = 0;
        }
        return j > 0;
    }

    private boolean setUpProductLines(LabsProductLine labsproductline, LabsCouponProductGroup labscouponproductgroup, List list)
    {
        if (labsproductline != null && productLineHasRemainingLines(labsproductline, list))
        {
            LabsProductLine labsproductline1 = labsproductline;
            if (labsproductline.isNeedsCustomization())
            {
                labsproductline = labsproductline.getCode();
                labsproductline1 = mMenuManager.createProductLineFromVariantCode(labsproductline);
                labsproductline1.setQuantity(1);
            }
            list.add(new CouponWizardLineHolder(labsproductline1, labscouponproductgroup));
            return true;
        } else
        {
            return false;
        }
    }

    public void assignNonUsedProducts(Coupon coupon, LabsCouponLine labscouponline)
    {
        List list = mCartManager.getCouponProductLines(null);
        for (Iterator iterator = coupon.getProductGroups().iterator(); iterator.hasNext();)
        {
            LabsCouponProductGroup labscouponproductgroup = (LabsCouponProductGroup)iterator.next();
            Iterator iterator1 = list.iterator();
            while (iterator1.hasNext()) 
            {
                ProductCouponMatch productcouponmatch = (ProductCouponMatch)iterator1.next();
                if (labscouponproductgroup.getProductCodes().contains(productcouponmatch.getProductLine().getCode()))
                {
                    productcouponmatch.setCouponRelation(coupon, labscouponline);
                }
            }
        }

    }

    public LabsCouponLine getCouponLine()
    {
        return mCouponLine;
    }

    public List getCouponWizardHolderList()
    {
        return mCouponWizardLineHolders;
    }

    public List getCouponsFromMenu()
    {
        if (mMenuManager.isMenuLoaded())
        {
            ArrayList arraylist = new ArrayList();
            Iterator iterator = mMenuManager.getMenu().getCouponMap().keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = (String)iterator.next();
                obj = mMenuManager.getCoupon(((String) (obj)));
                if (isCouponDayValid(((Coupon) (obj))))
                {
                    arraylist.add(obj);
                }
            } while (true);
            return arraylist;
        } else
        {
            return null;
        }
    }

    public List getDisplayedCouponList()
    {
        return mDisplayedCouponList;
    }

    public String getName()
    {
        return "coupon_wizard_manager";
    }

    public Coupon getUpdatedCouponByCode(String s)
    {
        return (Coupon)couponByCodeList.get(s);
    }

    public void initialize(LabsCouponLine labscouponline)
    {
        mCouponLine = labscouponline;
        synchronize();
    }

    public boolean isCouponDayValid(Coupon coupon)
    {
        if (coupon.getTags().getDays() == null)
        {
            return true;
        }
        String s = (new SimpleDateFormat("EEE", Locale.US)).format(new Date());
        for (coupon = coupon.getTags().getDays().iterator(); coupon.hasNext();)
        {
            if (StringHelper.startsWithIgnoreCase(s, ((Day)coupon.next()).getName()))
            {
                return true;
            }
        }

        return false;
    }

    public boolean isCouponFulfilled(Coupon coupon, LabsCouponLine labscouponline)
    {
        labscouponline = new ArrayList(mCartManager.getCouponProductLines(labscouponline));
        for (coupon = coupon.getProductGroups().iterator(); coupon.hasNext();)
        {
            LabsCouponProductGroup labscouponproductgroup = (LabsCouponProductGroup)coupon.next();
            Iterator iterator = labscouponline.iterator();
            int i = labscouponproductgroup.getRequiredQty();
label0:
            do
            {
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                } while (!labscouponproductgroup.getProductCodes().contains(((ProductCouponMatch)iterator.next()).getProductLine().getCode()));
                i--;
                iterator.remove();
            } while (i != 0);
            if (i > 0)
            {
                return false;
            }
        }

        return true;
    }

    public boolean isCouponFulfilledButStillEditing()
    {
        return mCouponLine != null && isCouponFulfilled(getUpdatedCouponByCode(mCouponLine.getCoupon().getCode()), mCouponLine) && isStillOnCoupon();
    }

    public boolean isLoyaltyCoupon()
    {
        return LoyaltyUtil.isLoyaltyCouponLine(mCouponLine);
    }

    public boolean isProductLineOnCouponDomain(Coupon coupon, LabsProductLine labsproductline)
    {
        for (coupon = coupon.getProductGroups().iterator(); coupon.hasNext();)
        {
            if (((LabsCouponProductGroup)coupon.next()).getProductCodes().contains(labsproductline.getCode()))
            {
                return true;
            }
        }

        return false;
    }

    public boolean isStillOnCoupon()
    {
        if (mCouponLine != null)
        {
            Coupon coupon = getUpdatedCouponByCode(mCouponLine.getCoupon().getCode());
            boolean flag = isLoyaltyCoupon();
            boolean flag1 = isCouponFulfilled(coupon, mCouponLine);
            boolean flag2 = coupon.isBundled();
            if (!flag && (!flag1 || !flag2))
            {
                return true;
            }
        }
        return false;
    }

    protected void onSessionSet()
    {
        mCartManager = (CartManager)getSession().getManager("cart_manager");
        mMenuManager = (MenuManager)getSession().getManager("menu_manager");
    }

    public void putCoupon(Coupon coupon)
    {
        if (coupon != null)
        {
            for (Iterator iterator = coupon.getProductGroups().iterator(); iterator.hasNext();)
            {
                Iterator iterator1 = ((LabsCouponProductGroup)iterator.next()).getProductCodes().iterator();
                while (iterator1.hasNext()) 
                {
                    if (mMenuManager.getVariant((String)iterator1.next()) == null)
                    {
                        iterator1.remove();
                    }
                }
            }

            couponByCodeList.put(coupon.getCode(), coupon);
        }
    }

    public void reset()
    {
        mCouponLine = null;
    }

    public void setDisplayedCouponList(List list)
    {
        mDisplayedCouponList = list;
    }

    public void synchronize()
    {
        Coupon coupon = mCouponLine.getCoupon();
        if (!isLoyaltyCoupon())
        {
            assignNonUsedProducts(getUpdatedCouponByCode(coupon.getCode()), mCouponLine);
        }
        mCouponWizardLineHolders = buildCouponWizardHolderList();
    }


    private class CouponErrorType extends Enum
    {

        private static final CouponErrorType $VALUES[];
        public static final CouponErrorType BelowMinimumOrderAmount;
        public static final CouponErrorType CouponExclusivityViolation;
        public static final CouponErrorType CouponIsInvalidForDayOfWeek;
        public static final CouponErrorType CouponIsInvalidForDayPart;
        public static final CouponErrorType CouponIsNotEffectiveOrExpired;
        public static final CouponErrorType CouponNotInStore;
        public static final CouponErrorType ExpiredPromotionalRedemptionCoupon;
        public static final CouponErrorType Fulfilled;
        public static final CouponErrorType InValidCoupon;
        public static final CouponErrorType InvalidServiceMethodForCoupon;
        public static final CouponErrorType MinimumOrderAmount;
        public static final CouponErrorType PromotionalUsageViolation;
        public static final CouponErrorType UnKnown;
        public static final CouponErrorType Unfulfilled;
        public static final CouponErrorType UsageCountViolation;
        public static final CouponErrorType ValidCoupon;

        public static CouponErrorType valueOf(String s)
        {
            return (CouponErrorType)Enum.valueOf(com/dominos/android/sdk/core/coupon/CouponWizardManager$CouponErrorType, s);
        }

        public static CouponErrorType[] values()
        {
            return (CouponErrorType[])$VALUES.clone();
        }

        static 
        {
            CouponExclusivityViolation = new CouponErrorType("CouponExclusivityViolation", 0);
            CouponIsInvalidForDayPart = new CouponErrorType("CouponIsInvalidForDayPart", 1);
            CouponIsInvalidForDayOfWeek = new CouponErrorType("CouponIsInvalidForDayOfWeek", 2);
            PromotionalUsageViolation = new CouponErrorType("PromotionalUsageViolation", 3);
            UsageCountViolation = new CouponErrorType("UsageCountViolation", 4);
            InvalidServiceMethodForCoupon = new CouponErrorType("InvalidServiceMethodForCoupon", 5);
            BelowMinimumOrderAmount = new CouponErrorType("BelowMinimumOrderAmount", 6);
            MinimumOrderAmount = new CouponErrorType("MinimumOrderAmount", 7);
            CouponIsNotEffectiveOrExpired = new CouponErrorType("CouponIsNotEffectiveOrExpired", 8);
            ExpiredPromotionalRedemptionCoupon = new CouponErrorType("ExpiredPromotionalRedemptionCoupon", 9);
            Unfulfilled = new CouponErrorType("Unfulfilled", 10);
            Fulfilled = new CouponErrorType("Fulfilled", 11);
            ValidCoupon = new CouponErrorType("ValidCoupon", 12);
            InValidCoupon = new CouponErrorType("InValidCoupon", 13);
            CouponNotInStore = new CouponErrorType("CouponNotInStore", 14);
            UnKnown = new CouponErrorType("UnKnown", 15);
            $VALUES = (new CouponErrorType[] {
                CouponExclusivityViolation, CouponIsInvalidForDayPart, CouponIsInvalidForDayOfWeek, PromotionalUsageViolation, UsageCountViolation, InvalidServiceMethodForCoupon, BelowMinimumOrderAmount, MinimumOrderAmount, CouponIsNotEffectiveOrExpired, ExpiredPromotionalRedemptionCoupon, 
                Unfulfilled, Fulfilled, ValidCoupon, InValidCoupon, CouponNotInStore, UnKnown
            });
        }

        private CouponErrorType(String s, int i)
        {
            super(s, i);
        }
    }

}
