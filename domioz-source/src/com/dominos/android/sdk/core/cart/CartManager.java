// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.cart;

import android.content.SharedPreferences;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.LocalizationUtil;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.Manager;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.common.power.StoreProfile;
import com.dominos.android.sdk.core.coupon.CouponWizardManager;
import com.dominos.android.sdk.core.loyalty.LoyaltyManager;
import com.dominos.android.sdk.core.loyalty.LoyaltyUtil;
import com.dominos.android.sdk.core.models.FoodMenu;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.LabsUpsellData;
import com.dominos.android.sdk.core.models.LabsVariant;
import com.dominos.android.sdk.core.models.ProductCouponMatch;
import com.dominos.android.sdk.core.models.ReplacedProducts;
import com.dominos.android.sdk.core.models.coupon.Coupon;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
import com.dominos.android.sdk.core.models.coupon.LabsCouponProductGroup;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.product.ProductWizardManager;
import com.dominos.android.sdk.core.setup.ConfigurationManager;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.android.sdk.core.store.StoreManager;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import com.dominos.android.sdk.extension.nina.DomProductManager;
import com.dominos.android.sdk.extension.nina.model.NinaPartialProduct;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.dominos.android.sdk.core.cart:
//            CartAPI, CartErrorType

public class CartManager extends Manager
{

    private static final String TAG = com/dominos/android/sdk/core/cart/CartManager.getSimpleName();
    CartAPI mCartApi;
    protected ConfigurationManager mConfigurationManager;
    private CouponWizardManager mCouponWizardManager;
    private LoyaltyManager mLoyaltyManager;
    private MenuManager mMenuManager;
    private DomProductManager mNinaHelper;
    private OrderManager mOrderManager;
    DominosPrefs_ mPrefs;
    private List mProductCouponMatches;
    private ProductWizardManager mProductManager;
    private ProductWizardManager mProductWizardManager;
    private StoreManager mStoreManager;
    private String mUpSellCode;
    private boolean originatedAsReorder;
    public boolean panWarning;
    public boolean panWithMarinara;
    public boolean promotionLegaleseDisplayed;
    public boolean promotionalAlertDisplayed;
    private volatile boolean upsellAnswered;
    private volatile boolean upsellDismissed;
    private volatile boolean upsellDisplayed;
    private boolean wasWarnedInordinatePanQty;
    private boolean wasWarnedTooManyToppings;

    public CartManager()
    {
        wasWarnedInordinatePanQty = false;
        wasWarnedTooManyToppings = false;
        originatedAsReorder = false;
        upsellDisplayed = false;
        upsellAnswered = false;
        upsellDismissed = false;
        panWarning = false;
        panWithMarinara = false;
        promotionLegaleseDisplayed = false;
        promotionalAlertDisplayed = false;
        mProductCouponMatches = new ArrayList();
    }

    private void buildCouponRelations(List list, boolean flag)
    {
        list = list.iterator();
_L2:
        LabsCouponLine labscouponline;
        Coupon coupon;
        Iterator iterator;
        if (!list.hasNext())
        {
            break MISSING_BLOCK_LABEL_191;
        }
        labscouponline = (LabsCouponLine)list.next();
        coupon = mCouponWizardManager.getUpdatedCouponByCode(labscouponline.getCoupon().getCode());
        iterator = coupon.getProductGroups().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        LabsCouponProductGroup labscouponproductgroup;
        Iterator iterator1;
        int j;
        labscouponproductgroup = (LabsCouponProductGroup)iterator.next();
        j = labscouponproductgroup.getRequiredQty();
        iterator1 = mProductCouponMatches.iterator();
_L6:
        if (!iterator1.hasNext()) goto _L4; else goto _L3
_L3:
        int i;
        ProductCouponMatch productcouponmatch = (ProductCouponMatch)iterator1.next();
        i = j;
        if (!productcouponmatch.isProductAvailable())
        {
            break MISSING_BLOCK_LABEL_184;
        }
        i = j;
        if (!labscouponproductgroup.getProductCodes().contains(productcouponmatch.getProductLine().getCode()))
        {
            break MISSING_BLOCK_LABEL_184;
        }
        productcouponmatch.setCouponRelation(coupon, labscouponline);
        j--;
        i = j;
        if (j > 0)
        {
            break MISSING_BLOCK_LABEL_184;
        }
        if (!flag) goto _L4; else goto _L5
_L5:
        i = j;
        j = i;
          goto _L6
    }

    private void buildCouponStatusLists(LabsOrder labsorder)
    {
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist2 = new ArrayList();
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = labsorder.getCouponLineList().iterator(); iterator.hasNext();)
        {
            LabsCouponLine labscouponline1 = (LabsCouponLine)iterator.next();
            if (labscouponline1.isFulfilled())
            {
                arraylist1.add(labscouponline1);
            } else
            {
                arraylist2.add(labscouponline1);
            }
        }

        buildCouponRelations(arraylist1, false);
        buildCouponRelations(arraylist2, false);
        labsorder = labsorder.getCouponLineList().iterator();
        do
        {
            if (!labsorder.hasNext())
            {
                break;
            }
            LabsCouponLine labscouponline = (LabsCouponLine)labsorder.next();
            if (!mCouponWizardManager.getUpdatedCouponByCode(labscouponline.getCoupon().getCode()).isBundled())
            {
                arraylist.add(labscouponline);
            }
        } while (true);
        buildCouponRelations(arraylist, true);
    }

    private boolean canThisProductBeUpsold(com.dominos.android.sdk.core.models.LabsUpsellData.UpsellEntry upsellentry)
    {
        for (upsellentry = upsellentry.excludedByList.iterator(); upsellentry.hasNext();)
        {
            String s = (String)upsellentry.next();
            if (mOrderManager.getOrder().doesOrderHaveThisProduct(s, false))
            {
                return false;
            }
        }

        return true;
    }

    private int getHighestUsedId(List list)
    {
        list = list.iterator();
        int i = 0;
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            LabsProductLine labsproductline = (LabsProductLine)list.next();
            if (labsproductline.getId() > i)
            {
                i = labsproductline.getId();
            }
        } while (true);
        if (i < 0)
        {
            return 0;
        } else
        {
            return i;
        }
    }

    private int getIdFromUpdatedProductLines(ProductCouponMatch productcouponmatch, List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            LabsProductLine labsproductline = (LabsProductLine)list.next();
            if (productcouponmatch.getProductLine().isEqualTo(labsproductline))
            {
                return labsproductline.getId();
            }
        }

        return 0;
    }

    private List getProductCouponMatchesForProductLine(int i)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = mProductCouponMatches.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ProductCouponMatch productcouponmatch = (ProductCouponMatch)iterator.next();
            if (productcouponmatch.getProductLine().getId() == i)
            {
                arraylist.add(productcouponmatch);
            }
        } while (true);
        return arraylist;
    }

    private boolean isAbleToAddProducts(Coupon coupon, LabsCouponLine labscouponline)
    {
        Iterator iterator = coupon.getProductGroups().iterator();
        int j = 1;
        do
        {
            int i = j;
            if (!iterator.hasNext())
            {
                break;
            }
            LabsCouponProductGroup labscouponproductgroup = (LabsCouponProductGroup)iterator.next();
            i = labscouponproductgroup.getRequiredQty();
            Iterator iterator1 = getCouponProductLines(labscouponline).iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                ProductCouponMatch productcouponmatch = (ProductCouponMatch)iterator1.next();
                if (labscouponproductgroup.getProductCodes().contains(productcouponmatch.getProductLine().getCode()))
                {
                    i--;
                }
            } while (true);
            if (i > 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            j = i;
        } while (i == 0);
        return i != 0 || !coupon.isBundled();
    }

    private boolean isCartHoldingLoyaltyCoupon(LabsOrder labsorder)
    {
        for (labsorder = labsorder.getCouponLineList().iterator(); labsorder.hasNext();)
        {
            LabsCouponLine labscouponline = (LabsCouponLine)labsorder.next();
            if (mLoyaltyManager.isCouponALoyaltyCoupon(labscouponline.getCoupon()))
            {
                return true;
            }
        }

        return false;
    }

    private boolean isProductLineIdStillValid(ProductCouponMatch productcouponmatch, List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            LabsProductLine labsproductline = (LabsProductLine)list.next();
            if (productcouponmatch.getProductLine().getId() == labsproductline.getId())
            {
                return true;
            }
        }

        return false;
    }

    private boolean isProductReplaced(String s)
    {
        Object obj = mConfigurationManager.getReplacedProducts();
        if (obj == null || ((ReplacedProducts) (obj)).getProducts() == null || ((ReplacedProducts) (obj)).getProducts().isEmpty())
        {
            return false;
        }
        for (obj = ((ReplacedProducts) (obj)).getProducts().iterator(); ((Iterator) (obj)).hasNext();)
        {
            if (StringHelper.equals(((com.dominos.android.sdk.core.models.ReplacedProducts.ReplacedProduct)((Iterator) (obj)).next()).getProductCode(), s))
            {
                return true;
            }
        }

        return false;
    }

    private void processCouponProducts(LabsCouponLine labscouponline)
    {
        Iterator iterator = mCouponWizardManager.getUpdatedCouponByCode(labscouponline.getCoupon().getCode()).getProductGroups().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (LabsCouponProductGroup)iterator.next();
            if (((LabsCouponProductGroup) (obj)).getProductCodes().size() == 1 && getCouponProductLines(labscouponline).isEmpty())
            {
                obj = (String)((LabsCouponProductGroup) (obj)).getProductCodes().get(0);
                LabsVariant labsvariant = mMenuManager.getVariant(((String) (obj)));
                HashMap hashmap = new HashMap();
                hashmap.put(NinaPartialProduct.PR_VARIANT, new String[] {
                    obj
                });
                hashmap.put(NinaPartialProduct.PR_FLAVOR, new String[] {
                    labsvariant.getFlavorCode()
                });
                hashmap.put(NinaPartialProduct.PR_SIZE, new String[] {
                    labsvariant.getSizeCode()
                });
                obj = new NinaPartialProduct(getSession(), hashmap);
                mProductWizardManager.reset();
                obj = mNinaHelper.menuOptionsForPartialProduct(((NinaPartialProduct) (obj)), mProductWizardManager);
                if ((((com.dominos.android.sdk.extension.nina.DomProductManager.MenuSearchResult) (obj)).getResult() instanceof LabsProductLine) && ((com.dominos.android.sdk.extension.nina.DomProductManager.MenuSearchResult) (obj)).getNextPrompt().equals(com.dominos.android.sdk.extension.nina.DomProductManager.ProductGranularity.COMPLETED))
                {
                    try
                    {
                        if (mProductWizardManager.saveProduct((LabsProductLine)((com.dominos.android.sdk.extension.nina.DomProductManager.MenuSearchResult) (obj)).getResult()) && !mNinaHelper.getNinaPartialProducts().isEmpty())
                        {
                            LogUtil.d("NinaX", "Nina partial product removed", new Object[0]);
                            mNinaHelper.clearPartialProductsResetProductController();
                        }
                    }
                    catch (com.dominos.android.sdk.core.product.ProductWizardManager.InvalidToppingException invalidtoppingexception)
                    {
                        LogUtil.e(TAG, "InvalidToppingException caught in CouponWizardController", new Object[0]);
                    }
                }
                mProductWizardManager.reset();
            }
        } while (true);
        mCouponWizardManager.initialize(labscouponline);
    }

    public void addCouponDetailToProductLine(Coupon coupon, LabsCouponLine labscouponline, LabsProductLine labsproductline)
    {
        Iterator iterator = mProductCouponMatches.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ProductCouponMatch productcouponmatch = (ProductCouponMatch)iterator.next();
            if (!productcouponmatch.getProductLine().equals(labsproductline) || !productcouponmatch.isProductAvailable() || !isAbleToAddProducts(coupon, labscouponline))
            {
                continue;
            }
            productcouponmatch.setCouponRelation(coupon, labscouponline);
            break;
        } while (true);
    }

    public void addCouponToOrder(LabsOrder labsorder, String s, final com.dominos.android.sdk.core.coupon.CouponWizardManager.AddCouponToOrderCallback callback)
    {
        if (callback == null)
        {
            return;
        }
        callback.onBegin();
        if (!mMenuManager.isMenuLoaded() || labsorder == null || StringHelper.isEmpty(s))
        {
            callback.onCouponFailed(null, com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.UnKnown);
            callback.onFinish();
            return;
        } else
        {
            loadCoupon(s, new _cls1());
            return;
        }
    }

    public void addProductline(LabsOrder labsorder, LabsProductLine labsproductline)
    {
        labsorder.addProductLine(labsproductline);
        for (int i = 0; i < labsproductline.getQuantity(); i++)
        {
            mProductCouponMatches.add(new ProductCouponMatch(labsproductline));
        }

    }

    public boolean canShowProductRemovedAlert(String s, String s1)
    {
        return !StringHelper.equals(mPrefs.getSharedPreferences().getString(s, ""), s1) && isProductReplaced(s);
    }

    public String determineUpsellProduct()
    {
        Object obj = mConfigurationManager.getUpsellData();
        if (obj == null)
        {
            return null;
        }
        for (obj = ((LabsUpsellData) (obj)).getUpsellList().iterator(); ((Iterator) (obj)).hasNext();)
        {
            com.dominos.android.sdk.core.models.LabsUpsellData.UpsellEntry upsellentry = (com.dominos.android.sdk.core.models.LabsUpsellData.UpsellEntry)((Iterator) (obj)).next();
            if (canThisProductBeUpsold(upsellentry) && mMenuManager.getMenu().hasVariant(upsellentry.upsellCode))
            {
                return upsellentry.upsellCode;
            }
        }

        return null;
    }

    public List getCouponProductLines(LabsCouponLine labscouponline)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = mProductCouponMatches.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ProductCouponMatch productcouponmatch = (ProductCouponMatch)iterator.next();
            if (labscouponline == null)
            {
                if (productcouponmatch.getCouponLine() == null)
                {
                    arraylist.add(productcouponmatch);
                }
            } else
            if (productcouponmatch.getCouponLine() != null && productcouponmatch.getCouponLine().equals(labscouponline))
            {
                arraylist.add(productcouponmatch);
            }
        } while (true);
        return arraylist;
    }

    public List getCoupons()
    {
        return null;
    }

    public String getName()
    {
        return "cart_manager";
    }

    public String getPrice()
    {
        Object obj;
label0:
        {
            obj = mOrderManager.getOrder();
            String s = "";
            if (obj != null)
            {
                if (!((LabsOrder) (obj)).getProductLineList().isEmpty())
                {
                    break label0;
                }
                s = NumberFormat.getCurrencyInstance(Locale.US).format(0.0D);
            }
            return s;
        }
        obj = Double.valueOf(((LabsOrder) (obj)).getPrice());
        Double double1 = ((Double) (obj));
        if (obj == null)
        {
            double1 = Double.valueOf(0.0D);
        }
        return NumberFormat.getCurrencyInstance(Locale.US).format(double1);
    }

    public List getProductCouponMatches()
    {
        return mProductCouponMatches;
    }

    public List getProducts()
    {
        return null;
    }

    public String getReplacedProductMessage(String s)
    {
        Object obj = mConfigurationManager.getReplacedProducts();
        if (obj == null || ((ReplacedProducts) (obj)).getProducts() == null || ((ReplacedProducts) (obj)).getProducts().isEmpty())
        {
            return null;
        }
        for (obj = ((ReplacedProducts) (obj)).getProducts().iterator(); ((Iterator) (obj)).hasNext();)
        {
            com.dominos.android.sdk.core.models.ReplacedProducts.ReplacedProduct replacedproduct = (com.dominos.android.sdk.core.models.ReplacedProducts.ReplacedProduct)((Iterator) (obj)).next();
            if (StringHelper.equals(replacedproduct.getProductCode(), s))
            {
                return replacedproduct.getErrorMessage();
            }
        }

        return null;
    }

    public String getUpsellCode()
    {
        return mUpSellCode;
    }

    public void handleNewCouponOnPricedOrder(LabsOrder labsorder, Coupon coupon, LabsCouponLine labscouponline, List list, com.dominos.android.sdk.core.coupon.CouponWizardManager.AddCouponToOrderCallback addcoupontoordercallback)
    {
        List list1 = labsorder.getCouponLineList();
label0:
        for (int i = list1.size() - 1; i >= 0; i--)
        {
            LabsCouponLine labscouponline1 = (LabsCouponLine)list1.get(i);
            if (labscouponline1.getCoupon().getCode().equals(coupon.getCode()))
            {
                labscouponline1.setCoupon(coupon);
            }
            if (labscouponline1.getStatusItemList() == null)
            {
                continue;
            }
            Iterator iterator = labscouponline1.getStatusItemList().iterator();
            Object obj;
            do
            {
                do
                {
                    if (!iterator.hasNext())
                    {
                        continue label0;
                    }
                    obj = (String)((Map)iterator.next()).get("Code");
                } while (obj == null);
                obj = CouponWizardManager.getCouponErrorTypeFromCode(labscouponline1, ((String) (obj)));
            } while (obj == com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.ValidCoupon);
            addcoupontoordercallback.onCouponFailed(labscouponline1, ((com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType) (obj)));
            addcoupontoordercallback.onFinish();
            return;
        }

        mMenuManager.updateOrderFromMenu(labsorder);
        mOrderManager.setOrder(labsorder);
        labscouponline.setId(mOrderManager.getNewCouponLineId(list, labsorder));
        updateProductCouponRelationshipAfterPricing(labsorder);
        if (labsorder.needsCustomization())
        {
            processCouponProducts(labscouponline);
        }
        labsorder = labscouponline.getCoupon().getCode();
        if (mCouponWizardManager.isCouponFulfilled(mCouponWizardManager.getUpdatedCouponByCode(labsorder), labscouponline) && labscouponline.getCoupon().isBundled() && !LoyaltyUtil.isLoyaltyCouponLine(labscouponline))
        {
            addcoupontoordercallback.onCouponAdded(labscouponline, com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.Fulfilled);
        } else
        {
            addcoupontoordercallback.onCouponAdded(labscouponline, com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.ValidCoupon);
        }
        addcoupontoordercallback.onFinish();
    }

    public boolean isCartAbleToCheckout()
    {
        LabsOrder labsorder = mOrderManager.getOrder();
        return isCartWithProducts() && (isCartWithValidPrice(labsorder) || isCartHoldingLoyaltyCoupon(labsorder));
    }

    public boolean isCartWithProducts()
    {
        return mOrderManager.getOrder().getLineCount() > 0;
    }

    public boolean isCartWithValidPrice(LabsOrder labsorder)
    {
        return labsorder.getPrice() > 0.0D;
    }

    public boolean isOrginatedFromReorder()
    {
        return originatedAsReorder;
    }

    public boolean isProductLineAvailableForCoupon(LabsProductLine labsproductline)
    {
        for (Iterator iterator = mProductCouponMatches.iterator(); iterator.hasNext();)
        {
            ProductCouponMatch productcouponmatch = (ProductCouponMatch)iterator.next();
            if (productcouponmatch.getProductLine().equals(labsproductline) && productcouponmatch.isProductAvailable())
            {
                return true;
            }
        }

        return false;
    }

    public boolean isRequiredToPriceOrder()
    {
        String s = mOrderManager.getOrder().getStoreId();
        StoreProfile storeprofile = mStoreManager.getStoreProfile();
        return storeprofile == null || !StringHelper.equals(storeprofile.getStoreId(), s) || mOrderManager.getOrder().isPricingNeeded() && isCartWithProducts();
    }

    public boolean isUpsellAnswered()
    {
        return upsellAnswered;
    }

    public boolean isUpsellDismissed()
    {
        return upsellDismissed;
    }

    public boolean isUpsellDisplayed()
    {
        return upsellDisplayed;
    }

    public void loadCoupon(String s, LoadCouponCallback loadcouponcallback)
    {
        loadcouponcallback.onBegin();
        s = mCartApi.getStoreCoupon(mOrderManager.getOrder().getStoreId(), s, LocalizationUtil.getPhoneLang());
        if (s != null)
        {
            loadcouponcallback.onCouponLoaded(s);
        } else
        {
            loadcouponcallback.onLoadCouponFailed();
        }
        loadcouponcallback.onFinish();
    }

    protected void onSessionSet()
    {
        mConfigurationManager = (ConfigurationManager)getSession().getManager("configuration_manager");
        mOrderManager = (OrderManager)getSession().getManager("order_manager");
        mStoreManager = (StoreManager)getSession().getManager("store_manager");
        mMenuManager = (MenuManager)getSession().getManager("menu_manager");
        mCouponWizardManager = (CouponWizardManager)getSession().getManager("coupon_wizard_manager");
        mProductManager = (ProductWizardManager)getSession().getManager("product_wizard_manager");
        mLoyaltyManager = (LoyaltyManager)getSession().getManager("loyalty_manager");
        mNinaHelper = (DomProductManager)getSession().getManager("dom_product_manager");
        mProductWizardManager = (ProductWizardManager)getSession().getManager("product_wizard_manager");
    }

    public void removeCoupon(LabsOrder labsorder, LabsCouponLine labscouponline)
    {
        labsorder.autoRemove();
        labsorder.removeIfNeedsCustomization();
        labsorder.removeCouponLine(labscouponline);
        Iterator iterator = mProductCouponMatches.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ProductCouponMatch productcouponmatch = (ProductCouponMatch)iterator.next();
            if (productcouponmatch.getCouponLine() != null && productcouponmatch.getCouponLine().equals(labscouponline))
            {
                productcouponmatch.setCouponRelation(null, null);
            }
        } while (true);
        labsorder.clearPrices();
        mOrderManager.setOrder(labsorder);
    }

    public void removeCouponProductLine(LabsOrder labsorder, LabsProductLine labsproductline)
    {
        if (labsproductline.getQuantity() > 1)
        {
            labsproductline.setQuantity(labsproductline.getQuantity() - 1);
            updateProductLine(labsorder, labsproductline);
        } else
        {
            removeProductline(labsorder, labsproductline);
        }
        mCouponWizardManager.synchronize();
    }

    public void removeLineItem(LabsOrder labsorder, Object obj)
    {
        if (obj instanceof LabsCouponLine)
        {
            removeCoupon(labsorder, (LabsCouponLine)obj);
        } else
        if (obj instanceof LabsProductLine)
        {
            removeProductline(labsorder, (LabsProductLine)obj);
            return;
        }
    }

    public void removeProductline(LabsOrder labsorder, LabsProductLine labsproductline)
    {
        labsorder.removeProductLine(labsproductline);
        Iterator iterator = mProductCouponMatches.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (!((ProductCouponMatch)iterator.next()).getProductLine().isEqualTo(labsproductline))
            {
                continue;
            }
            iterator.remove();
            break;
        } while (true);
        labsorder.clearPrices();
    }

    public void resetCart(LabsOrder labsorder)
    {
        labsorder.clearCart();
        setUpsellDisplayed(false);
        setUpsellAnswered(false);
        setUpsellDismissed(false);
        setPromotionLegaleseDisplayed(false);
        promotionalAlertDisplayed = false;
    }

    public void setOriginatedAsReorder(boolean flag)
    {
        originatedAsReorder = flag;
    }

    public void setPanWarning(boolean flag)
    {
        panWarning = flag;
    }

    public void setPanWithMarinara(boolean flag)
    {
        panWithMarinara = flag;
    }

    public void setProductRemovedAlertShown(String s, String s1)
    {
        mPrefs.getSharedPreferences().edit().putString(s, s1).commit();
    }

    public void setPromotionLegaleseDisplayed(boolean flag)
    {
        promotionLegaleseDisplayed = flag;
    }

    public void setUpSellCode(String s)
    {
        mUpSellCode = s;
    }

    public void setUpsellAnswered(boolean flag)
    {
        upsellAnswered = flag;
    }

    public void setUpsellDismissed(boolean flag)
    {
        upsellDismissed = flag;
    }

    public void setUpsellDisplayed(boolean flag)
    {
        upsellDisplayed = flag;
    }

    public void setWasWarnedInordinatePanQty(boolean flag)
    {
        wasWarnedInordinatePanQty = flag;
    }

    public void setWasWarnedTooManyToppings(boolean flag)
    {
        wasWarnedTooManyToppings = flag;
    }

    public void updateCouponProductRelation(LabsOrder labsorder)
    {
        int i = getHighestUsedId(labsorder.getProductLineList());
        if (i > 0)
        {
            mProductManager.setProductLineId(i + 1);
        }
        Object obj = new ArrayList(labsorder.getProductLineList());
        labsorder.getProductLineList().clear();
        mProductCouponMatches.clear();
        Collections.reverse(((List) (obj)));
        LabsProductLine labsproductline;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); addProductline(labsorder, labsproductline))
        {
            labsproductline = (LabsProductLine)((Iterator) (obj)).next();
            if (labsproductline.getId() <= 0)
            {
                labsproductline.setId(mProductManager.getNextProductId());
            }
        }

    }

    public void updateProductCouponRelationshipAfterPricing(LabsOrder labsorder)
    {
        updateCouponProductRelation(labsorder);
        ProductCouponMatch productcouponmatch;
        for (Iterator iterator = mProductCouponMatches.iterator(); iterator.hasNext(); productcouponmatch.setCouponRelation(null, null))
        {
            productcouponmatch = (ProductCouponMatch)iterator.next();
            if (!isProductLineIdStillValid(productcouponmatch, labsorder.getProductLineList()))
            {
                productcouponmatch.getProductLine().setId(getIdFromUpdatedProductLines(productcouponmatch, labsorder.getProductLineList()));
            }
        }

        buildCouponStatusLists(labsorder);
    }

    public void updateProductLine(LabsOrder labsorder, LabsProductLine labsproductline)
    {
        int k;
        labsorder.replaceLineById(labsproductline);
        labsorder = getProductCouponMatchesForProductLine(labsproductline.getId());
        ProductCouponMatch productcouponmatch1;
        for (Iterator iterator = labsorder.iterator(); iterator.hasNext(); productcouponmatch1.setProductLine(labsproductline))
        {
            productcouponmatch1 = (ProductCouponMatch)iterator.next();
            if (!productcouponmatch1.isProductAvailable() && !mCouponWizardManager.isProductLineOnCouponDomain(productcouponmatch1.getCouponDetail(), labsproductline))
            {
                productcouponmatch1.setCouponRelation(null, null);
            }
        }

        k = labsproductline.getQuantity() - labsorder.size();
        if (k >= 0) goto _L2; else goto _L1
_L1:
        int i;
        i = Math.abs(k);
        labsproductline = labsorder.iterator();
_L6:
        if (!labsproductline.hasNext()) goto _L4; else goto _L3
_L3:
        ProductCouponMatch productcouponmatch = (ProductCouponMatch)labsproductline.next();
        if (productcouponmatch.isProductAvailable())
        {
            mProductCouponMatches.remove(productcouponmatch);
            i--;
        }
        if (i != 0) goto _L6; else goto _L5
_L5:
        return;
_L4:
        labsorder = labsorder.iterator();
        do
        {
            if (!labsorder.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            labsproductline = (ProductCouponMatch)labsorder.next();
            mProductCouponMatches.remove(labsproductline);
            k = i - 1;
            i = k;
        } while (k != 0);
        return;
_L2:
        if (k > 0)
        {
            int j = 0;
            while (j < k) 
            {
                mProductCouponMatches.add(new ProductCouponMatch(labsproductline));
                j++;
            }
        }
        if (true) goto _L5; else goto _L7
_L7:
    }

    public CartErrorType validateCurrentOrder(LabsOrder labsorder)
    {
        if (labsorder.isCouponRemoved() && labsorder.isProductRemoved())
        {
            labsorder.setProductRemoved(false);
            labsorder.setCouponRemoved(false);
            labsorder.getRemovedProductLineList().clear();
            return CartErrorType.COUPON_PRODUCT_REMOVED;
        }
        if (labsorder.isCouponRemoved())
        {
            labsorder.setCouponRemoved(false);
            return CartErrorType.COUPON_REMOVED;
        }
        if (labsorder.isProductRemoved() && !mOrderManager.getOrder().getRemovedProductLineList().isEmpty())
        {
            return CartErrorType.PRODUCT_REMOVED;
        } else
        {
            return CartErrorType.SUCCESS;
        }
    }

    public boolean wasWarnedInordinatePanQty()
    {
        return wasWarnedInordinatePanQty;
    }

    public boolean wasWarnedTooManyToppings()
    {
        return wasWarnedTooManyToppings;
    }




    private class _cls1 extends LoadCouponCallback
    {
        private class LoadCouponCallback extends BaseCallback
        {

            public abstract void onCouponLoaded(Coupon coupon);

            public abstract void onLoadCouponFailed();

            public LoadCouponCallback()
            {
            }
        }


        final CartManager this$0;
        final com.dominos.android.sdk.core.coupon.CouponWizardManager.AddCouponToOrderCallback val$callback;
        final Coupon val$menuCoupon;
        final LabsOrder val$order;

        public void onCouponLoaded(Coupon coupon)
        {
            mCouponWizardManager.putCoupon(coupon);
            final LabsCouponLine couponLine = new LabsCouponLine();
            LabsOrder labsorder;
            final ArrayList originalCouponIds;
            final Coupon couponBeforePriceOrder;
            if (menuCoupon == null)
            {
                couponLine.setCoupon(coupon);
            } else
            {
                couponLine.setCoupon(menuCoupon);
            }
            labsorder = new LabsOrder(order);
            labsorder.addCouponLine(couponLine);
            originalCouponIds = new ArrayList();
            couponBeforePriceOrder = order.getCouponLineList().iterator();
            do
            {
                if (!couponBeforePriceOrder.hasNext())
                {
                    break;
                }
                LabsCouponLine labscouponline = (LabsCouponLine)couponBeforePriceOrder.next();
                if (labscouponline.getId() != 0)
                {
                    originalCouponIds.add(Integer.valueOf(labscouponline.getId()));
                }
            } while (true);
            couponBeforePriceOrder = couponLine.getCoupon();
            if (LoyaltyUtil.isLoyaltyCoupon(coupon))
            {
                mOrderManager.setOrder(labsorder);
                callback.onCouponAdded(couponLine, com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.ValidCoupon);
                callback.onFinish();
                return;
            } else
            {
                class _cls1 extends com.dominos.android.sdk.core.order.OrderManager.PriceOrderCallback
                {

                    final _cls1 this$1;
                    final Coupon val$couponBeforePriceOrder;
                    final LabsCouponLine val$couponLine;
                    final List val$originalCouponIds;

                    public void onPriceOrderRequestFailed()
                    {
                        callback.onCouponFailed(couponLine, com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.UnKnown);
                    }

                    public void onPriceSuccess(LabsOrder labsorder1)
                    {
                        handleNewCouponOnPricedOrder(labsorder1, couponBeforePriceOrder, couponLine, originalCouponIds, callback);
                    }

                    public void onPricingFailure(LabsOrder labsorder1)
                    {
                        handleNewCouponOnPricedOrder(labsorder1, couponBeforePriceOrder, couponLine, originalCouponIds, callback);
                    }

                    public void onPricingWarning(LabsOrder labsorder1, PriceOrderErrorCode priceordererrorcode)
                    {
                    }

                _cls1()
                {
                    this$1 = _cls1.this;
                    couponLine = labscouponline;
                    couponBeforePriceOrder = coupon;
                    originalCouponIds = list;
                    super();
                }
                }

                mOrderManager.priceOrder(labsorder, new _cls1());
                return;
            }
        }

        public void onLoadCouponFailed()
        {
            callback.onCouponFailed(null, com.dominos.android.sdk.core.coupon.CouponWizardManager.CouponErrorType.CouponNotInStore);
            callback.onFinish();
        }

        _cls1()
        {
            this$0 = CartManager.this;
            callback = addcoupontoordercallback;
            menuCoupon = coupon;
            order = labsorder;
            super();
        }
    }

}
