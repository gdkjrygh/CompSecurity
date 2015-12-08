// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.product;

import com.dominos.android.sdk.app.ApplicationService;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.Manager;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.cart.CartManager;
import com.dominos.android.sdk.core.coupon.CouponWizardManager;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.LabsTopping;
import com.dominos.android.sdk.core.models.LabsVariant;
import com.dominos.android.sdk.core.models.coupon.Coupon;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.android.sdk.data.sharedpref.DominosPrefs_;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ProductWizardManager extends Manager
{

    private static final int DEFAULT_MIN_QUANTITY = 1;
    private HashMap ambiguousConfirm;
    ApplicationService appService;
    private List couponGroupVariants;
    private boolean createdFromMenu;
    private boolean editMode;
    private String flavorCode;
    private boolean fromCouponWizard;
    private boolean fromPartialWizard;
    private boolean hasFlavors;
    private boolean hasSizes;
    private CartManager mCartManager;
    private CouponWizardManager mCouponWizardManager;
    private OrderManager mOrderManager;
    private MenuManager menuManager;
    private LabsVariant newVariantFromVariantListActivity;
    DominosPrefs_ prefs;
    private LabsProduct product;
    private LabsProductLine productLine;
    private int productLineId;
    private LabsProductLine productLineInEdit;
    private boolean restoreMode;
    private String sizeCode;
    private List variants;

    public ProductWizardManager()
    {
    }

    private void addDefaultToppings()
    {
        Iterator iterator = getProductLine().getToppingsList().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        LabsTopping labstopping = (LabsTopping)iterator.next();
        if (!labstopping.isSauce() || !getProductLine().getDefaultToppingsMap().containsKey(labstopping.getCode())) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        if (!flag)
        {
            Iterator iterator1 = getProductLine().getDefaultToppingsMap().values().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                LabsTopping labstopping1 = (LabsTopping)iterator1.next();
                if (labstopping1.isSauce())
                {
                    labstopping1.reset();
                    getProductLine().getToppingsList().add(labstopping1);
                }
            } while (true);
        }
        Iterator iterator2 = getProductLine().getDefaultToppingsMap().keySet().iterator();
        do
        {
            if (!iterator2.hasNext())
            {
                break;
            }
            Object obj = (String)iterator2.next();
            obj = (LabsTopping)getProductLine().getDefaultToppingsMap().get(obj);
            if (!isDefaultToppingAdded(getProductLine(), ((LabsTopping) (obj))))
            {
                getProductLine().getToppingsList().add(obj);
            }
        } while (true);
        return;
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private LabsProductLine createProductLine(LabsVariant labsvariant)
    {
        labsvariant = new LabsProductLine(labsvariant);
        menuManager.loadOptionsFromMenu(labsvariant);
        labsvariant.resetToDefaultOptions();
        labsvariant.setId(-1);
        int i;
        if (productLine == null)
        {
            i = 1;
        } else
        {
            i = productLine.getQuantity();
        }
        labsvariant.setQuantity(i);
        labsvariant.setProduct(new LabsProduct(product));
        if (editMode && productLineInEdit != null)
        {
            labsvariant.setId(productLineInEdit.getId());
        }
        return labsvariant;
    }

    private void fixOddMenuItems()
    {
        if (product != null && getCurrentVariants().size() > 1 && (StringHelper.equalsIgnoreCase(product.getProductType(), "GSalad") || StringHelper.equalsIgnoreCase(product.getCode(), "F_STJUDE")))
        {
            injectVariant((LabsVariant)getCurrentVariants().get(0));
        }
    }

    private List getFilteredVariants(String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        Object obj;
        if (fromCouponWizard)
        {
            obj = couponGroupVariants;
        } else
        {
            obj = getVariantsFromStore(product);
        }
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            LabsVariant labsvariant = (LabsVariant)((Iterator) (obj)).next();
            boolean flag1 = true;
            boolean flag = flag1;
            if (StringHelper.isNotEmpty(s))
            {
                flag = flag1;
                if (!StringHelper.equalsIgnoreCase(s, labsvariant.getFlavorCode()))
                {
                    flag = false;
                }
            }
            flag1 = flag;
            if (StringHelper.isNotEmpty(s1))
            {
                flag1 = flag;
                if (!StringHelper.equalsIgnoreCase(s1, labsvariant.getSizeCode()))
                {
                    flag1 = false;
                }
            }
            if (flag1)
            {
                arraylist.add(labsvariant);
            }
        } while (true);
        return arraylist;
    }

    private List getVariantsFromStore(LabsProduct labsproduct)
    {
        ArrayList arraylist = new ArrayList();
        if (labsproduct != null)
        {
            labsproduct = labsproduct.getVariants().iterator();
            do
            {
                if (!labsproduct.hasNext())
                {
                    break;
                }
                Object obj = (String)labsproduct.next();
                obj = menuManager.getVariant(((String) (obj)));
                if (obj != null)
                {
                    arraylist.add(obj);
                }
            } while (true);
        }
        return arraylist;
    }

    private void initiateProductLineCreation()
    {
        if (variants != null && !variants.isEmpty() && variants.size() <= 1)
        {
            if (isRestoreMode())
            {
                setNewVariantFromVariantListActivity((LabsVariant)variants.get(0));
            }
            Object obj;
            if (productLine == null)
            {
                obj = null;
            } else
            {
                obj = productLine.getToppingsList();
            }
            productLine = createProductLine((LabsVariant)variants.get(0));
            if (obj != null)
            {
                ArrayList arraylist = new ArrayList();
                obj = ((List) (obj)).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    LabsTopping labstopping = (LabsTopping)((Iterator) (obj)).next();
                    if (menuManager.isToppingValidForProduct(productLine.getProduct(), labstopping))
                    {
                        arraylist.add(labstopping);
                    }
                } while (true);
                productLine.setToppingsList(arraylist);
                return;
            }
        }
    }

    private boolean isDefaultToppingAdded(LabsProductLine labsproductline, LabsTopping labstopping)
    {
        for (labsproductline = labsproductline.getToppingsList().iterator(); labsproductline.hasNext();)
        {
            if (StringHelper.equals(((LabsTopping)labsproductline.next()).getCode(), labstopping.getCode()))
            {
                return true;
            }
        }

        return false;
    }

    private void setProductCapabilities(LabsVariant labsvariant)
    {
        hasFlavors = StringHelper.isNotEmpty(labsvariant.getFlavorCode());
        hasSizes = StringHelper.isNotEmpty(labsvariant.getSizeCode());
    }

    public void addTopping(LabsTopping labstopping)
    {
        if (!getProductLine().getToppingsList().contains(labstopping))
        {
            getProductLine().getToppingsList().add(labstopping);
        }
    }

    public void clearAmbiguousConfirm()
    {
        ambiguousConfirm = null;
    }

    public HashMap getAmbiguousConfirm()
    {
        return ambiguousConfirm;
    }

    public List getCurrentVariants()
    {
        if (variants == null)
        {
            return new ArrayList();
        } else
        {
            return variants;
        }
    }

    public String getFlavorCode()
    {
        return flavorCode;
    }

    public String getName()
    {
        return "product_wizard_manager";
    }

    public LabsVariant getNewVariantFromVariantListActivity()
    {
        return newVariantFromVariantListActivity;
    }

    public int getNextProductId()
    {
        int i = productLineId + 1;
        productLineId = i;
        return i;
    }

    public LabsProduct getProduct()
    {
        return product;
    }

    public LabsProductLine getProductLine()
    {
        if (!isInitialized())
        {
            return null;
        }
        if (productLine == null)
        {
            List list = getFilteredVariants(flavorCode, sizeCode);
            if (list.size() == 1)
            {
                productLine = createProductLine((LabsVariant)list.get(0));
                flavorCode = productLine.getVariant().getFlavorCode();
                sizeCode = productLine.getVariant().getSizeCode();
            }
        }
        return productLine;
    }

    public int getProductLineId()
    {
        return productLineId;
    }

    public LabsProductLine getProductLineInEdit()
    {
        return productLineInEdit;
    }

    public String getSizeCode()
    {
        return sizeCode;
    }

    public boolean hasFlavors()
    {
        return hasFlavors;
    }

    public boolean hasSizes()
    {
        return hasSizes;
    }

    public void initialize(LabsProduct labsproduct)
    {
        initialize(labsproduct, getVariantsFromStore(labsproduct));
    }

    public void initialize(LabsProduct labsproduct, List list)
    {
        reset();
        product = labsproduct;
        variants = list;
        if (fromCouponWizard)
        {
            couponGroupVariants = list;
        }
        productLine = getProductLine();
        if (!list.isEmpty())
        {
            setProductCapabilities((LabsVariant)list.get(0));
        }
        fixOddMenuItems();
    }

    public void injectVariant(LabsVariant labsvariant)
    {
        if (isRestoreMode())
        {
            setNewVariantFromVariantListActivity(labsvariant);
        }
        variants.clear();
        variants.add(labsvariant);
        productLine = createProductLine(labsvariant);
    }

    public boolean isCreatedFromMenu()
    {
        return createdFromMenu;
    }

    public boolean isEditMode()
    {
        return editMode;
    }

    public boolean isFromCouponWizard()
    {
        return fromCouponWizard;
    }

    public boolean isFromPartialWizard()
    {
        return fromPartialWizard;
    }

    public boolean isInitialized()
    {
        return variants != null && variants.size() > 0;
    }

    public boolean isRestoreMode()
    {
        return restoreMode;
    }

    protected void onSessionSet()
    {
        menuManager = (MenuManager)getSession().getManager("menu_manager");
        mOrderManager = (OrderManager)getSession().getManager("order_manager");
        mCartManager = (CartManager)getSession().getManager("cart_manager");
        mCouponWizardManager = (CouponWizardManager)getSession().getManager("coupon_wizard_manager");
    }

    public void replaceProductLine(LabsProductLine labsproductline)
    {
        product = labsproductline.getProduct();
        variants = new ArrayList();
        variants.add(labsproductline.getVariant());
        sizeCode = labsproductline.getVariant().getSizeCode();
        flavorCode = labsproductline.getVariant().getFlavorCode();
        productLine = labsproductline;
        setProductCapabilities((LabsVariant)variants.get(0));
    }

    public void reset()
    {
        product = null;
        productLine = null;
        variants = null;
        couponGroupVariants = null;
        flavorCode = null;
        sizeCode = null;
        hasSizes = false;
        hasFlavors = false;
        editMode = false;
        restoreMode = false;
        fromPartialWizard = false;
        createdFromMenu = false;
        ambiguousConfirm = null;
    }

    public boolean saveProduct(LabsProductLine labsproductline)
    {
        int i = 0;
        LabsProductLine labsproductline1 = labsproductline;
        if (labsproductline == null)
        {
            labsproductline1 = productLine;
        }
        if (labsproductline1.getId() <= 0)
        {
            labsproductline1.setId(getNextProductId());
        }
        addDefaultToppings();
        labsproductline = labsproductline1.validateSidesOptionsQuantity();
        if (labsproductline.equals("VALID_TOPPINGS_QUANTITY_CODE"))
        {
            labsproductline = mOrderManager.getOrder();
            if (editMode)
            {
                editMode = false;
                mCartManager.updateProductLine(labsproductline, labsproductline1);
            } else
            {
                mCartManager.addProductline(labsproductline, labsproductline1);
            }
            productLine = null;
            labsproductline.clearPrices();
            mOrderManager.setOrder(labsproductline);
            if (fromCouponWizard)
            {
                labsproductline = mCouponWizardManager.getCouponLine();
                Coupon coupon = mCouponWizardManager.getUpdatedCouponByCode(labsproductline.getCoupon().getCode());
                for (; i < labsproductline1.getQuantity(); i++)
                {
                    mCartManager.addCouponDetailToProductLine(coupon, labsproductline, labsproductline1);
                }

                mCouponWizardManager.synchronize();
            }
            return true;
        } else
        {
            throw new InvalidToppingException(labsproductline);
        }
    }

    public void setAmbiguousConfirm(HashMap hashmap)
    {
        ambiguousConfirm = hashmap;
    }

    public void setCreatedFromMenu(boolean flag)
    {
        createdFromMenu = flag;
    }

    public void setEditMode(boolean flag)
    {
        editMode = flag;
    }

    public void setFlavor(String s)
    {
        List list;
        if (s == null)
        {
            if (fromCouponWizard)
            {
                variants = couponGroupVariants;
            } else
            {
                variants = getVariantsFromStore(product);
            }
        }
        list = getFilteredVariants(s, sizeCode);
        if (list.isEmpty() && sizeCode != null)
        {
            list = getFilteredVariants(s, null);
        }
        if (list.isEmpty())
        {
            throw new InvalidFlavorException();
        }
        if (list.size() == 1)
        {
            sizeCode = ((LabsVariant)list.get(0)).getSizeCode();
        } else
        {
            sizeCode = null;
        }
        variants = list;
        if (variants.size() == 1)
        {
            initiateProductLineCreation();
        }
        flavorCode = s;
    }

    public void setFromCouponWizard(boolean flag)
    {
        fromCouponWizard = flag;
    }

    public void setFromPartialWizard(boolean flag)
    {
        fromPartialWizard = flag;
    }

    public void setNewVariantFromVariantListActivity(LabsVariant labsvariant)
    {
        newVariantFromVariantListActivity = labsvariant;
    }

    public void setProductLine(LabsProductLine labsproductline)
    {
        productLine = labsproductline;
    }

    public void setProductLineId(int i)
    {
        productLineId = i;
    }

    public void setProductLineInEdit(LabsProductLine labsproductline)
    {
        productLineInEdit = labsproductline;
    }

    public void setRestoreMode(boolean flag)
    {
        restoreMode = flag;
    }

    public void setSize(String s)
    {
        List list;
        if (s == null)
        {
            if (fromCouponWizard)
            {
                variants = couponGroupVariants;
            } else
            {
                variants = getVariantsFromStore(product);
            }
        }
        list = getFilteredVariants(flavorCode, s);
        if (list.isEmpty())
        {
            throw new InvalidSizeException();
        }
        variants = list;
        if (variants.size() == 1)
        {
            initiateProductLineCreation();
        }
        sizeCode = s;
    }

    private class InvalidToppingException extends Exception
    {

        private String quantityCode;
        final ProductWizardManager this$0;

        public String getQuantityCode()
        {
            return quantityCode;
        }

        public InvalidToppingException(String s)
        {
            this$0 = ProductWizardManager.this;
            super();
            quantityCode = s;
        }
    }


    private class InvalidFlavorException extends Exception
    {

        final ProductWizardManager this$0;

        public InvalidFlavorException()
        {
            this$0 = ProductWizardManager.this;
            super();
        }
    }


    private class InvalidSizeException extends Exception
    {

        final ProductWizardManager this$0;

        public InvalidSizeException()
        {
            this$0 = ProductWizardManager.this;
            super();
        }
    }

}
