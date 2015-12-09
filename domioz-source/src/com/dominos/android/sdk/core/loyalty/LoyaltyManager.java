// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.loyalty;

import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.Manager;
import com.dominos.android.sdk.common.NumberUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.dom.useraccounts.UserObject;
import com.dominos.android.sdk.common.power.StoreProfile;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.coupon.Coupon;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
import com.dominos.android.sdk.core.models.loyalty.Burn;
import com.dominos.android.sdk.core.models.loyalty.CustomerLoyalty;
import com.dominos.android.sdk.core.models.loyalty.Earn;
import com.dominos.android.sdk.core.models.loyalty.History;
import com.dominos.android.sdk.core.models.loyalty.HistoryLoyalty;
import com.dominos.android.sdk.core.models.loyalty.LoyaltyCoupon;
import com.dominos.android.sdk.core.models.loyalty.Potential;
import com.dominos.android.sdk.core.models.loyalty.PricePlaceLoyalty;
import com.dominos.android.sdk.core.user.UserProfileManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.dominos.android.sdk.core.loyalty:
//            LoyaltyAPI, LoyaltyUtil

public class LoyaltyManager extends Manager
{

    public static final int POINTS_EXPIRE_DAY_THRESHOLD = 30;
    public static final int SHORT_HISTORY_SIZE = 3;
    private CustomerLoyalty mCustomerLoyalty;
    private AtomicBoolean mCustomerLoyaltyFailed;
    private HistoryLoyalty mHistoryLoyalty;
    LoyaltyAPI mLoyaltyAPI;
    private AtomicBoolean mLoyaltyCouponAdded;
    private AtomicBoolean mNewLoyaltyMember;
    private AtomicBoolean mNewLoyaltyMemberSingleUse;
    private PricePlaceLoyalty mPricePlaceLoyalty;
    private UserProfileManager mProfileManager;

    public LoyaltyManager()
    {
        mLoyaltyCouponAdded = new AtomicBoolean();
        mNewLoyaltyMemberSingleUse = new AtomicBoolean();
        mNewLoyaltyMember = new AtomicBoolean();
        mCustomerLoyaltyFailed = new AtomicBoolean(false);
    }

    private List getActiveHistory()
    {
        ArrayList arraylist = new ArrayList();
        if (mHistoryLoyalty != null && mHistoryLoyalty.getHistory() != null)
        {
            Iterator iterator = mHistoryLoyalty.getHistory().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                History history = (History)iterator.next();
                if (history.isActive())
                {
                    arraylist.add(history);
                }
            } while (true);
        }
        return arraylist;
    }

    private List getPendingHistory()
    {
        ArrayList arraylist = new ArrayList();
        if (mHistoryLoyalty != null && mHistoryLoyalty.getHistory() != null)
        {
            Iterator iterator = mHistoryLoyalty.getHistory().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                History history = (History)iterator.next();
                if (history.isPending())
                {
                    arraylist.add(history);
                }
            } while (true);
        }
        return arraylist;
    }

    private boolean isCustomerActive()
    {
        return mCustomerLoyalty != null && StringHelper.equalsIgnoreCase(mCustomerLoyalty.getAccountStatus(), "ACTIVE");
    }

    public int calculateNumberOfFreePizza()
    {
        if (getBaseCoupon() == null) goto _L2; else goto _L1
_L1:
        LoyaltyCoupon loyaltycoupon;
        int i;
        loyaltycoupon = getBaseCoupon();
        i = getNumberOfRemainingPoints();
        if (loyaltycoupon.getPointValue() <= 0) goto _L2; else goto _L3
_L3:
        i /= loyaltycoupon.getPointValue();
_L5:
        if (i >= 0)
        {
            return i;
        } else
        {
            return 0;
        }
_L2:
        i = 0;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public LoyaltyCoupon getBaseCoupon()
    {
label0:
        {
            if (!isLoyaltyAvailable() || mCustomerLoyalty == null)
            {
                break label0;
            }
            Iterator iterator = mCustomerLoyalty.getLoyaltyCoupons().iterator();
            LoyaltyCoupon loyaltycoupon;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                loyaltycoupon = (LoyaltyCoupon)iterator.next();
            } while (!loyaltycoupon.isBaseCoupon());
            return loyaltycoupon;
        }
        return null;
    }

    public int getBaseCouponLimit()
    {
        LoyaltyCoupon loyaltycoupon = getBaseCoupon();
        if (loyaltycoupon != null && NumberUtil.isNumber(loyaltycoupon.getLimitPerOrder()))
        {
            int i = Integer.parseInt(loyaltycoupon.getLimitPerOrder());
            if (i > 0)
            {
                return i;
            }
        }
        return 0;
    }

    public CustomerLoyalty getCustomerLoyalty()
    {
        if (mCustomerLoyalty == null)
        {
            mCustomerLoyalty = new CustomerLoyalty();
        }
        return mCustomerLoyalty;
    }

    public int getEarnedBasePointsOfPlacedOrder()
    {
        if (mPricePlaceLoyalty != null && mPricePlaceLoyalty.getEarn() != null)
        {
            return mPricePlaceLoyalty.getEarn().getBasePoints();
        } else
        {
            return 0;
        }
    }

    public int getEarnedBonusPointsOfPlacedOrder()
    {
        if (mPricePlaceLoyalty != null && mPricePlaceLoyalty.getEarn() != null)
        {
            return mPricePlaceLoyalty.getEarn().getBonusPoints();
        } else
        {
            return 0;
        }
    }

    public int getEarnedTotalPointsOfPlacedOrder()
    {
        if (mPricePlaceLoyalty != null && mPricePlaceLoyalty.getEarn() != null)
        {
            return mPricePlaceLoyalty.getEarn().getTotalPoints();
        } else
        {
            return 0;
        }
    }

    public String getExpirationDate()
    {
        return getCustomerLoyalty().getPointExpirationDate();
    }

    public void getLoyaltyHistory(UserObject userobject, LoyaltyHistoryCallback loyaltyhistorycallback)
    {
        if (loyaltyhistorycallback == null)
        {
            return;
        }
        loyaltyhistorycallback.onBegin();
        if (!isLoyaltyAvailable())
        {
            loyaltyhistorycallback.onLoyaltyHistoryFail();
            loyaltyhistorycallback.onFinish();
            return;
        }
        mHistoryLoyalty = mLoyaltyAPI.getLoyaltyHistory(userobject.getCustomerId());
        if (mHistoryLoyalty == null)
        {
            loyaltyhistorycallback.onLoyaltyHistoryFail();
        } else
        {
            loyaltyhistorycallback.onLoyaltyHistorySuccess();
        }
        loyaltyhistorycallback.onFinish();
    }

    public String getName()
    {
        return "loyalty_manager";
    }

    public int getNumberOfBaseCouponPoints()
    {
        if (getBaseCoupon() != null)
        {
            return getBaseCoupon().getPointValue();
        } else
        {
            return 0;
        }
    }

    public int getNumberOfPendingPoints()
    {
        return getCustomerLoyalty().getPendingPointBalance();
    }

    public int getNumberOfPotentialBonusPoints()
    {
        Object obj = getPricePlaceLoyalty();
        if (obj != null)
        {
            obj = ((PricePlaceLoyalty) (obj)).getPotential();
            if (obj != null)
            {
                obj = ((Potential) (obj)).getEarn();
                if (obj != null)
                {
                    return ((Earn) (obj)).getBonusPoints();
                }
            }
        }
        return 0;
    }

    public int getNumberOfPotentialPointsEarned()
    {
        return LoyaltyUtil.getNumberOfPotentialTotalPoints(mPricePlaceLoyalty);
    }

    public int getNumberOfRemainingPoints()
    {
        int j = getCustomerLoyalty().getVestedPointBalance();
        int i = j;
        if (getPricePlaceLoyalty() != null)
        {
            i = j;
            if (getPricePlaceLoyalty().getPotential() != null)
            {
                i = j;
                if (getPricePlaceLoyalty().getPotential().getBurn() != null)
                {
                    i = j - getPricePlaceLoyalty().getPotential().getBurn().getRedemptionPoints();
                }
            }
        }
        return i;
    }

    public int getNumberOfVestedPoints()
    {
        return getCustomerLoyalty().getVestedPointBalance();
    }

    public PricePlaceLoyalty getPricePlaceLoyalty()
    {
        if (mPricePlaceLoyalty == null)
        {
            mPricePlaceLoyalty = new PricePlaceLoyalty();
        }
        return mPricePlaceLoyalty;
    }

    public List getShortHistory()
    {
        int i = 3;
        if (hasHistory())
        {
            int j = mHistoryLoyalty.getHistory().size();
            if (j <= 3)
            {
                i = j;
            }
            return mHistoryLoyalty.getHistory().subList(0, i);
        } else
        {
            return null;
        }
    }

    public List getSortedHistory()
    {
        ArrayList arraylist = new ArrayList();
        List list = getPendingHistory();
        if (list.size() > 0)
        {
            list.add(0, new History(com.dominos.android.sdk.core.models.loyalty.History.HistoryHeaderType.PENDING));
            arraylist.addAll(list);
        }
        list = getActiveHistory();
        if (list.size() > 0)
        {
            list.add(0, new History(com.dominos.android.sdk.core.models.loyalty.History.HistoryHeaderType.ACTIVE));
            arraylist.addAll(list);
        }
        return arraylist;
    }

    public void getUserLoyaltyInformation(UserObject userobject, LoyaltyCallback loyaltycallback)
    {
        loyaltycallback.onBegin();
        if (userobject == null)
        {
            loyaltycallback.onLoyaltyFail();
            loyaltycallback.onFinish();
            return;
        }
        mCustomerLoyalty = mLoyaltyAPI.getCustomerLoyaltyInformation(userobject.getCustomerId());
        if (mCustomerLoyalty != null)
        {
            mCustomerLoyaltyFailed.set(false);
            mLoyaltyAPI.setLoyaltyAvailable(true);
            if (isCustomerEnrolledInLoyalty())
            {
                loyaltycallback.onLoyaltySuccess();
            } else
            {
                loyaltycallback.onLoyaltyFail();
            }
        } else
        {
            mCustomerLoyaltyFailed.set(true);
            mLoyaltyAPI.setLoyaltyAvailable(false);
            loyaltycallback.onLoyaltyFail();
        }
        loyaltycallback.onFinish();
    }

    public boolean hasHistory()
    {
        return mHistoryLoyalty != null && mHistoryLoyalty.getHistory() != null && mHistoryLoyalty.getHistory().size() > 0;
    }

    public boolean isAbleToAddAnotherRedemptionCoupon(List list)
    {
label0:
        {
            int j = getBaseCouponLimit();
            if (j <= 0)
            {
                break label0;
            }
            list = list.iterator();
            int i = 0;
            do
            {
                if (!list.hasNext())
                {
                    break label0;
                }
                if (LoyaltyUtil.isLoyaltyCouponLine((LabsCouponLine)list.next()))
                {
                    i++;
                }
            } while (i != j);
            return false;
        }
        return true;
    }

    public boolean isCouponALoyaltyCoupon(Coupon coupon)
    {
label0:
        {
            if (mCustomerLoyalty == null || mCustomerLoyalty.getLoyaltyCoupons() == null)
            {
                break label0;
            }
            Iterator iterator = mCustomerLoyalty.getLoyaltyCoupons().iterator();
            LoyaltyCoupon loyaltycoupon;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                loyaltycoupon = (LoyaltyCoupon)iterator.next();
            } while (!StringHelper.equalsIgnoreCase(coupon.getCode(), loyaltycoupon.getCouponCode()));
            return true;
        }
        return false;
    }

    public boolean isCustomerEnrolledInLoyalty()
    {
        return isCustomerActive() || isCustomerSuspended();
    }

    public boolean isCustomerLoyaltyFailed()
    {
        return mCustomerLoyaltyFailed.get();
    }

    public boolean isCustomerLoyaltyOptOutSuccess(CustomerLoyalty customerloyalty)
    {
        return StringHelper.equalsIgnoreCase(customerloyalty.getStatus(), "Success") && StringHelper.equalsIgnoreCase(customerloyalty.getAccountStatus(), "CLOSED");
    }

    public boolean isCustomerSuspended()
    {
        return mCustomerLoyalty != null && StringHelper.equalsIgnoreCase(mCustomerLoyalty.getAccountStatus(), "SUSPENDED");
    }

    public boolean isLoyaltyAvailable()
    {
        return isLoyaltyEnabled() && mLoyaltyAPI.isLoyaltyAvailable();
    }

    public boolean isLoyaltyCouponAdded()
    {
        return mLoyaltyCouponAdded.getAndSet(false);
    }

    public boolean isLoyaltyEnabled()
    {
        return mLoyaltyAPI.isLoyaltyEnabled();
    }

    public boolean isNewLoyaltyMember()
    {
        return mNewLoyaltyMember.get();
    }

    public boolean isNewLoyaltyMemberSingleUse()
    {
        return mNewLoyaltyMemberSingleUse.getAndSet(false);
    }

    protected void onSessionSet()
    {
        mProfileManager = (UserProfileManager)getSession().getManager("user_manager");
    }

    public void reset()
    {
        mCustomerLoyalty = null;
        mLoyaltyCouponAdded.set(false);
        mNewLoyaltyMemberSingleUse.set(false);
        mNewLoyaltyMember.set(false);
    }

    public void setCustomerLoyalty(CustomerLoyalty customerloyalty)
    {
        mCustomerLoyalty = customerloyalty;
    }

    public void setLoyaltyCouponAdded()
    {
        mLoyaltyCouponAdded.set(true);
    }

    public void setNewLoyaltyMemberFlags()
    {
        mNewLoyaltyMemberSingleUse.set(isCustomerEnrolledInLoyalty());
        mNewLoyaltyMember.set(isCustomerEnrolledInLoyalty());
    }

    public void setPricePlaceOrderLoyalty(PricePlaceLoyalty priceplaceloyalty)
    {
        mPricePlaceLoyalty = priceplaceloyalty;
    }

    public void validateRedemption(StoreProfile storeprofile, LabsOrder labsorder, ValidateRedemptionCallback validateredemptioncallback)
    {
        validateredemptioncallback.onBegin();
        if (!isLoyaltyAvailable())
        {
            validateredemptioncallback.onInvalidRedemption(InvalidRedemptionCause.REDEMPTION_NOT_AVAILABLE);
            return;
        }
        if (!LoyaltyUtil.isStoreALoyaltyStore(storeprofile))
        {
            validateredemptioncallback.onInvalidRedemption(InvalidRedemptionCause.STORE_NOT_POP);
            return;
        }
        if (!isCustomerActive())
        {
            validateredemptioncallback.onInvalidRedemption(InvalidRedemptionCause.CUSTOMER_NOT_ENROLLED);
            return;
        }
        if (calculateNumberOfFreePizza() == 0)
        {
            validateredemptioncallback.onInvalidRedemption(InvalidRedemptionCause.CUSTOMER_NOT_ENOUGH_POINTS);
            return;
        }
        if (isAbleToAddAnotherRedemptionCoupon(labsorder.getCouponLineList()))
        {
            if (mProfileManager.isUserLoggedIn())
            {
                validateredemptioncallback.onValidRedemption();
            } else
            {
                validateredemptioncallback.onInvalidRedemption(InvalidRedemptionCause.CUSTOMER_AUTH_REQUIRED);
            }
        } else
        {
            validateredemptioncallback.onInvalidRedemption(InvalidRedemptionCause.REDEMPTION_COUPON_LIMIT);
        }
        validateredemptioncallback.onFinish();
    }

    private class LoyaltyHistoryCallback extends BaseCallback
    {

        public abstract void onLoyaltyHistoryFail();

        public abstract void onLoyaltyHistorySuccess();

        public LoyaltyHistoryCallback()
        {
        }
    }


    private class LoyaltyCallback extends BaseCallback
    {

        public abstract void onLoyaltyFail();

        public abstract void onLoyaltySuccess();

        public LoyaltyCallback()
        {
        }
    }


    private class ValidateRedemptionCallback extends BaseCallback
    {

        public abstract void onInvalidRedemption(InvalidRedemptionCause invalidredemptioncause);

        public abstract void onValidRedemption();

        public ValidateRedemptionCallback()
        {
        }
    }


    private class InvalidRedemptionCause extends Enum
    {

        private static final InvalidRedemptionCause $VALUES[];
        public static final InvalidRedemptionCause CUSTOMER_AUTH_REQUIRED;
        public static final InvalidRedemptionCause CUSTOMER_NOT_ENOUGH_POINTS;
        public static final InvalidRedemptionCause CUSTOMER_NOT_ENROLLED;
        public static final InvalidRedemptionCause REDEMPTION_COUPON_LIMIT;
        public static final InvalidRedemptionCause REDEMPTION_NOT_AVAILABLE;
        public static final InvalidRedemptionCause STORE_NOT_POP;

        public static InvalidRedemptionCause valueOf(String s)
        {
            return (InvalidRedemptionCause)Enum.valueOf(com/dominos/android/sdk/core/loyalty/LoyaltyManager$InvalidRedemptionCause, s);
        }

        public static InvalidRedemptionCause[] values()
        {
            return (InvalidRedemptionCause[])$VALUES.clone();
        }

        static 
        {
            REDEMPTION_NOT_AVAILABLE = new InvalidRedemptionCause("REDEMPTION_NOT_AVAILABLE", 0);
            REDEMPTION_COUPON_LIMIT = new InvalidRedemptionCause("REDEMPTION_COUPON_LIMIT", 1);
            CUSTOMER_NOT_ENOUGH_POINTS = new InvalidRedemptionCause("CUSTOMER_NOT_ENOUGH_POINTS", 2);
            CUSTOMER_NOT_ENROLLED = new InvalidRedemptionCause("CUSTOMER_NOT_ENROLLED", 3);
            CUSTOMER_AUTH_REQUIRED = new InvalidRedemptionCause("CUSTOMER_AUTH_REQUIRED", 4);
            STORE_NOT_POP = new InvalidRedemptionCause("STORE_NOT_POP", 5);
            $VALUES = (new InvalidRedemptionCause[] {
                REDEMPTION_NOT_AVAILABLE, REDEMPTION_COUPON_LIMIT, CUSTOMER_NOT_ENOUGH_POINTS, CUSTOMER_NOT_ENROLLED, CUSTOMER_AUTH_REQUIRED, STORE_NOT_POP
            });
        }

        private InvalidRedemptionCause(String s, int i)
        {
            super(s, i);
        }
    }

}
