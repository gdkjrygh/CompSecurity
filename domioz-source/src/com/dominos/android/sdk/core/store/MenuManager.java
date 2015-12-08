// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.store;

import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.CouponUtil;
import com.dominos.android.sdk.common.LocalizationUtil;
import com.dominos.android.sdk.common.Manager;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.cart.CartAPI;
import com.dominos.android.sdk.core.coupon.CouponWizardManager;
import com.dominos.android.sdk.core.models.FoodMenu;
import com.dominos.android.sdk.core.models.LabsCategory;
import com.dominos.android.sdk.core.models.LabsFlavor;
import com.dominos.android.sdk.core.models.LabsOrder;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.LabsSide;
import com.dominos.android.sdk.core.models.LabsSize;
import com.dominos.android.sdk.core.models.LabsTopping;
import com.dominos.android.sdk.core.models.LabsVariant;
import com.dominos.android.sdk.core.models.coupon.Coupon;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
import com.dominos.android.sdk.core.order.OrderManager;
import com.dominos.android.sdk.data.http.power.PowerRestClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

public class MenuManager extends Manager
{

    private static final String FOOD = "Food";
    private static final String TAG = com/dominos/android/sdk/core/store/MenuManager.getSimpleName();
    CartAPI mCartApi;
    private CouponWizardManager mCouponWizardManager;
    private CountDownLatch mDisplayOrderLatch;
    private FoodMenu mLabsMenu;
    private OrderManager mOrderManager;
    PowerRestClient mPowerService;

    public MenuManager()
    {
    }

    private LabsCategory getCategoryForProduct(String s, LabsCategory labscategory)
    {
        if (labscategory.getProducts().contains(s))
        {
            return labscategory;
        }
        for (labscategory = labscategory.getCategoryList().iterator(); labscategory.hasNext();)
        {
            LabsCategory labscategory1 = getCategoryForProduct(s, (LabsCategory)labscategory.next());
            if (labscategory1 != null)
            {
                return labscategory1;
            }
        }

        return null;
    }

    private String getFoodCategory(String s, LabsCategory labscategory)
    {
        for (Iterator iterator = labscategory.getCategoryList().iterator(); iterator.hasNext();)
        {
            LabsCategory labscategory1 = (LabsCategory)iterator.next();
            if (labscategory1.getCode().equalsIgnoreCase(s))
            {
                if (labscategory.getCode().equals("Food"))
                {
                    return s;
                } else
                {
                    return labscategory.getCode();
                }
            }
            if (!getFoodCategory(s, labscategory1).equals(""))
            {
                return labscategory1.getCode();
            }
        }

        if (labscategory.getCode().equalsIgnoreCase(s))
        {
            return labscategory.getCode();
        } else
        {
            return "";
        }
    }

    private void getStoreCoupon(LabsCouponLine labscouponline)
    {
        Coupon coupon = mCartApi.getStoreCoupon(mOrderManager.getOrder().getStoreId(), labscouponline.getCoupon().getCode(), LocalizationUtil.getPhoneLang());
        mCouponWizardManager.putCoupon(coupon);
        if (CouponUtil.isCouponHidden(coupon))
        {
            labscouponline.setCoupon(coupon);
        }
    }

    private boolean isBuildYourOwnPasta(LabsProduct labsproduct)
    {
        return labsproduct.isPasta() && StringHelper.equalsIgnoreCase(labsproduct.getCode(), "S_BUILD");
    }

    private boolean isPanPizza(String s)
    {
        if (StringHelper.isNotEmpty(s))
        {
            return StringHelper.equalsIgnoreCase(s, "NPAN");
        } else
        {
            return false;
        }
    }

    private void updateAnySpecialCoupons(LabsOrder labsorder)
    {
        labsorder = labsorder.getCouponLineList().iterator();
        do
        {
            if (!labsorder.hasNext())
            {
                break;
            }
            LabsCouponLine labscouponline = (LabsCouponLine)labsorder.next();
            Coupon coupon = mCouponWizardManager.getUpdatedCouponByCode(labscouponline.getCoupon().getCode());
            if (coupon == null || CouponUtil.isCouponHidden(coupon))
            {
                getStoreCoupon(labscouponline);
            }
        } while (true);
    }

    public LabsProductLine createProductLineFromVariantCode(String s)
    {
        if (!mLabsMenu.hasVariant(s))
        {
            return null;
        } else
        {
            s = new LabsProductLine(getVariant(s));
            loadOptionsFromMenu(s);
            s.loadDefaultOptions();
            return s;
        }
    }

    public List flavorVariants(String s, String s1)
    {
        HashMap hashmap = new HashMap();
        ArrayList arraylist = new ArrayList();
        s = s.split(":");
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            LabsVariant labsvariant = getVariant(s[i]);
            if (labsvariant == null || StringHelper.isNotEmpty(s1) && !s1.equals(labsvariant.getSizeCode()))
            {
                continue;
            }
            String s2 = labsvariant.getFlavorCode();
            if (StringHelper.isNotEmpty(s2) && !hashmap.containsKey(s2))
            {
                hashmap.put(s2, null);
                arraylist.add(labsvariant);
            }
        }

        return arraylist;
    }

    public List getAvailableSidesForProduct(String s)
    {
        ArrayList arraylist = new ArrayList();
        s = (LabsProduct)mLabsMenu.getProductMap().get(s);
        if (s == null)
        {
            return arraylist;
        }
        if (s.getAvailableSides() != null && StringHelper.isNotEmpty(s.getAvailableSides()))
        {
            String as[] = s.getAvailableSides().split(",");
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                String s1 = as[i];
                arraylist.add(new LabsSide((LabsSide)((Map)mLabsMenu.getSidesMap().get(s.getProductType())).get(s1)));
            }

        }
        return arraylist;
    }

    public List getAvailableToppingsForProduct(String s)
    {
        ArrayList arraylist = new ArrayList();
        s = (LabsProduct)mLabsMenu.getProductMap().get(s);
        if (s == null)
        {
            return arraylist;
        }
        if (s.getAvailableToppings() != null && StringHelper.isNotEmpty(s.getAvailableToppings()))
        {
            String as[] = s.getAvailableToppings().split(",");
            int k = as.length;
            for (int i = 0; i < k; i++)
            {
                String as1[] = as[i].split("=");
                LabsTopping labstopping = new LabsTopping((LabsTopping)((Map)mLabsMenu.getToppingMap().get(s.getProductType())).get(as1[0]));
                ArrayList arraylist1 = new ArrayList();
                if (as1.length == 2)
                {
                    as1 = as1[1].split(":");
                    int l = as1.length;
                    for (int j = 0; j < l; j++)
                    {
                        String s1 = as1[j];
                        if (!isBuildYourOwnPasta(s) || !labstopping.isSauce() || Double.parseDouble(s1) != 0.0D)
                        {
                            arraylist1.add(Double.valueOf(Double.parseDouble(s1)));
                        }
                    }

                } else
                {
                    for (Iterator iterator = s.getOptionQtys().iterator(); iterator.hasNext(); arraylist1.add(Double.valueOf(Double.parseDouble((String)iterator.next())))) { }
                }
                labstopping.setOptionAvailability(arraylist1);
                arraylist.add(labstopping);
            }

        }
        return arraylist;
    }

    public LabsCategory getCategory(String s)
    {
        return getCategory(s, (LabsCategory)mLabsMenu.getCategoryMap().get("Food"));
    }

    public LabsCategory getCategory(String s, LabsCategory labscategory)
    {
        if (labscategory.getCode().equals(s))
        {
            return labscategory;
        }
        for (labscategory = labscategory.getCategoryList().iterator(); labscategory.hasNext();)
        {
            LabsCategory labscategory1 = getCategory(s, (LabsCategory)labscategory.next());
            if (labscategory1 != null)
            {
                return labscategory1;
            }
        }

        return null;
    }

    public LabsCategory getCategoryForProduct(String s)
    {
        return getCategoryForProduct(s, (LabsCategory)mLabsMenu.getCategoryMap().get("Food"));
    }

    public Coupon getCoupon(String s)
    {
        if (mLabsMenu != null)
        {
            return (Coupon)mLabsMenu.getCouponMap().get(s);
        } else
        {
            return null;
        }
    }

    public LabsCategory getCouponWithinCategory(String s)
    {
        return (LabsCategory)mLabsMenu.getCategoryMap().get(s);
    }

    public Map getDefaultSidesForProduct(String s)
    {
        HashMap hashmap = new HashMap();
        s = (LabsProduct)mLabsMenu.getProductMap().get(s);
        if (s == null)
        {
            return hashmap;
        }
        if (s.getAvailableSides() != null && StringHelper.isNotEmpty(s.getAvailableSides()))
        {
            String as[] = s.getAvailableSides().split(",");
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                String as1[] = as[i].split("=");
                LabsSide labsside = new LabsSide((LabsSide)((Map)mLabsMenu.getSidesMap().get(s.getProductType())).get(as1[0]));
                if (as1.length == 2)
                {
                    labsside.setDefaultQuantity(Integer.parseInt(as1[1]));
                }
                hashmap.put(labsside.getCode(), labsside);
            }

        }
        return hashmap;
    }

    public Map getDefaultSidesForVariant(String s)
    {
        HashMap hashmap = new HashMap();
        s = (LabsVariant)mLabsMenu.getVariantsMap().get(s);
        if (s == null)
        {
            return hashmap;
        }
        LabsProduct labsproduct = (LabsProduct)mLabsMenu.getProductMap().get(s.getProductCode());
        if (s.getDefaultSides() != null && StringHelper.isNotEmpty(s.getDefaultSides()))
        {
            if (StringHelper.isNotEmpty(s.getDefaultSides()))
            {
                s = s.getDefaultSides().split(",");
            } else
            {
                s = labsproduct.getDefaultSides().split(",");
            }
            if (s != null)
            {
                int j = s.length;
                for (int i = 0; i < j; i++)
                {
                    String as[] = s[i].split("=");
                    LabsSide labsside = new LabsSide((LabsSide)((Map)mLabsMenu.getSidesMap().get(labsproduct.getProductType())).get(as[0]));
                    if (as.length == 2)
                    {
                        labsside.setDefaultQuantity(Integer.parseInt(as[1]));
                    }
                    hashmap.put(labsside.getCode(), labsside);
                }

            }
        }
        return hashmap;
    }

    public Map getDefaultToppingsForProduct(String s)
    {
        HashMap hashmap = new HashMap();
        s = (LabsProduct)mLabsMenu.getProductMap().get(s);
        if (s == null)
        {
            return hashmap;
        }
        if (s.getDefaultToppings() != null && StringHelper.isNotEmpty(s.getDefaultToppings()))
        {
            String as[] = s.getDefaultToppings().split(",");
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                String as1[] = as[i].split("=");
                if (as1.length == 2)
                {
                    LabsTopping labstopping = new LabsTopping((LabsTopping)((Map)mLabsMenu.getToppingMap().get(s.getProductType())).get(as1[0]));
                    labstopping.setDefaultQuantity(Double.parseDouble(as1[1]));
                    hashmap.put(labstopping.getCode(), labstopping);
                }
            }

        }
        return hashmap;
    }

    public LabsCategory getExtrasCategory()
    {
        return ((LabsCategory)mLabsMenu.getCategoryMap().get("Food")).getCategory("Sides");
    }

    public LabsFlavor getFlavor(LabsVariant labsvariant)
    {
        if (!mLabsMenu.getProductMap().containsKey(labsvariant.getProductCode()))
        {
            return null;
        }
        if (!mLabsMenu.getFlavorMap().containsKey(((LabsProduct)mLabsMenu.getProductMap().get(labsvariant.getProductCode())).getProductType()))
        {
            return null;
        } else
        {
            return (LabsFlavor)((Map)mLabsMenu.getFlavorMap().get(((LabsProduct)mLabsMenu.getProductMap().get(labsvariant.getProductCode())).getProductType())).get(labsvariant.getFlavorCode());
        }
    }

    public LabsCategory getFoodCategory()
    {
        return (LabsCategory)mLabsMenu.getCategoryMap().get("Food");
    }

    public String getFoodCategory(String s)
    {
        return getFoodCategory(s, (LabsCategory)mLabsMenu.getCategoryMap().get("Food"));
    }

    public FoodMenu getMenu()
    {
        if (mLabsMenu == null)
        {
            mLabsMenu = new FoodMenu();
        }
        return mLabsMenu;
    }

    public String getName()
    {
        return "menu_manager";
    }

    public LabsProduct getProduct(String s)
    {
        if (mLabsMenu.getProductMap().containsKey(s))
        {
            return (LabsProduct)mLabsMenu.getProductMap().get(s);
        } else
        {
            return null;
        }
    }

    public LabsSize getSize(LabsVariant labsvariant)
    {
        if (!mLabsMenu.getProductMap().containsKey(labsvariant.getProductCode()))
        {
            return null;
        }
        if (!mLabsMenu.getSizesMap().containsKey(((LabsProduct)mLabsMenu.getProductMap().get(labsvariant.getProductCode())).getProductType()))
        {
            return null;
        } else
        {
            return (LabsSize)((Map)mLabsMenu.getSizesMap().get(((LabsProduct)mLabsMenu.getProductMap().get(labsvariant.getProductCode())).getProductType())).get(labsvariant.getSizeCode());
        }
    }

    public String getStoreId()
    {
        if (mLabsMenu != null)
        {
            return mLabsMenu.getStoreID();
        } else
        {
            return null;
        }
    }

    public LabsTopping getValidOptionInProductTypeTopping(String s, String s1)
    {
        if (mLabsMenu != null)
        {
            return (LabsTopping)((Map)mLabsMenu.getToppingMap().get(s)).get(s1);
        } else
        {
            return null;
        }
    }

    public LabsVariant getVariant(String s)
    {
        if (mLabsMenu.getVariantsMap().containsKey(s))
        {
            return (LabsVariant)mLabsMenu.getVariantsMap().get(s);
        } else
        {
            return null;
        }
    }

    public List getVariantsForVariantCodes(List list)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            LabsVariant labsvariant = getVariant((String)list.next());
            if (labsvariant != null)
            {
                arraylist.add(labsvariant);
            }
        } while (true);
        return arraylist;
    }

    public boolean hasCoupons()
    {
        return mLabsMenu.getCategoryMap().containsKey("Coupons") && ((LabsCategory)mLabsMenu.getCategoryMap().get("Coupons")).getCategoryList().size() > 0;
    }

    public boolean isMenuLoaded()
    {
        return mLabsMenu != null && mLabsMenu.getCategoryMap() != null && mLabsMenu.getProductMap() != null && mLabsMenu.getVariantsMap() != null;
    }

    public boolean isProductTypeInTopping(String s)
    {
        return mLabsMenu != null && mLabsMenu.getToppingMap().containsKey(s);
    }

    public boolean isToppingValidForProduct(LabsProduct labsproduct, LabsTopping labstopping)
    {
        Object obj;
        if (!labstopping.isToppingAdded())
        {
            return false;
        }
        obj = getAvailableToppingsForProduct(labsproduct.getCode());
        String s = labstopping.getCode();
        if (!((Map)mLabsMenu.getToppingMap().get(labsproduct.getProductType())).containsKey(s) || !((List) (obj)).contains(((Map)mLabsMenu.getToppingMap().get(labsproduct.getProductType())).get(s)))
        {
            break MISSING_BLOCK_LABEL_254;
        }
        labsproduct = new LabsTopping((LabsTopping)((Map)mLabsMenu.getToppingMap().get(labsproduct.getProductType())).get(s));
        obj = ((List) (obj)).iterator();
_L2:
        List list;
        Object obj1;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_252;
            }
            obj1 = (LabsTopping)((Iterator) (obj)).next();
        } while (!((LabsTopping) (obj1)).getCode().equals(labsproduct.getCode()));
        list = ((LabsTopping) (obj1)).getOptionAvailability();
        obj1 = ((LabsTopping) (obj1)).getOptionKeyList().iterator();
_L4:
        if (!((Iterator) (obj1)).hasNext()) goto _L2; else goto _L1
_L1:
        String s1;
        Iterator iterator;
        s1 = (String)((Iterator) (obj1)).next();
        iterator = list.iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        if (((Double)iterator.next()).doubleValue() != labstopping.getQuantityForPart(s1)) goto _L6; else goto _L5
_L5:
        return true;
        return false;
        return true;
    }

    public boolean isvalidOptionInProductTypeTopping(String s, String s1)
    {
        return mLabsMenu != null && ((Map)mLabsMenu.getToppingMap().get(s)).containsKey(s1);
    }

    public void loadCouponFromMenu(LabsCouponLine labscouponline)
    {
        if (labscouponline == null || labscouponline.getCoupon() == null)
        {
            return;
        } else
        {
            labscouponline.setCoupon(getCoupon(labscouponline.getCoupon().getCode()));
            return;
        }
    }

    public void loadOptionsFromMenu(LabsProductLine labsproductline)
    {
        if (labsproductline.getVariant() == null)
        {
            labsproductline.setAutoRemove(true);
        } else
        {
            labsproductline.setProduct(getProduct(labsproductline.getVariant().getProductCode()));
            labsproductline.setFlavor(getFlavor(labsproductline.getVariant()));
            labsproductline.setSize(getSize(labsproductline.getVariant()));
            labsproductline.setPrice(Double.parseDouble(labsproductline.getVariant().getPrice()));
            HashMap hashmap = new HashMap();
            if (labsproductline.getAvailableToppingsList() == null)
            {
                labsproductline.setAvailableToppingsList(getAvailableToppingsForProduct(labsproductline.getVariant().getProductCode()));
            } else
            {
                labsproductline.getAvailableToppingsList().clear();
                labsproductline.getAvailableToppingsList().addAll(getAvailableToppingsForProduct(labsproductline.getVariant().getProductCode()));
            }
            if (labsproductline.isPanPizza())
            {
                for (int i = 0; i < labsproductline.getAvailableToppingsList().size(); i++)
                {
                    if (StringHelper.equalsIgnoreCase(((LabsTopping)labsproductline.getAvailableToppingsList().get(i)).getCode(), "Cp") || StringHelper.equalsIgnoreCase(((LabsTopping)labsproductline.getAvailableToppingsList().get(i)).getCode(), "Xm"))
                    {
                        labsproductline.getAvailableToppingsList().remove(i);
                    }
                }

            }
            for (int j = 0; j < labsproductline.getAvailableToppingsList().size(); j++)
            {
                hashmap.put(((LabsTopping)labsproductline.getAvailableToppingsList().get(j)).getCode(), Integer.valueOf(j));
            }

            HashMap hashmap1 = new HashMap();
            int k;
            if (labsproductline.getAvailableSidesList() == null)
            {
                labsproductline.setAvailableSidesList(getAvailableSidesForProduct(labsproductline.getVariant().getProductCode()));
            } else
            {
                labsproductline.getAvailableSidesList().clear();
                labsproductline.getAvailableSidesList().addAll(getAvailableSidesForProduct(labsproductline.getVariant().getProductCode()));
            }
            for (k = 0; k < labsproductline.getAvailableSidesList().size(); k++)
            {
                hashmap1.put(((LabsSide)labsproductline.getAvailableSidesList().get(k)).getCode(), Integer.valueOf(k));
            }

            if (labsproductline.getDefaultToppingsMap() == null)
            {
                labsproductline.setDefaultToppingsMap(getDefaultToppingsForProduct(labsproductline.getVariant().getProductCode()));
            } else
            {
                labsproductline.getDefaultToppingsMap().clear();
                labsproductline.getDefaultToppingsMap().putAll(getDefaultToppingsForProduct(labsproductline.getVariant().getProductCode()));
            }
            if (labsproductline.isPanPizza())
            {
                labsproductline.getDefaultToppingsMap().remove("Cp");
                labsproductline.getDefaultToppingsMap().remove("Xm");
            }
            if (labsproductline.getDefaultSidesMap() == null)
            {
                if (StringHelper.isNotEmpty(labsproductline.getVariant().getDefaultSides()))
                {
                    labsproductline.setDefaultSidesMap(getDefaultSidesForVariant(labsproductline.getVariant().getCode()));
                } else
                {
                    labsproductline.setDefaultSidesMap(getDefaultSidesForProduct(labsproductline.getProduct().getCode()));
                }
            } else
            {
                labsproductline.getDefaultSidesMap().clear();
                if (StringHelper.isNotEmpty(labsproductline.getVariant().getDefaultSides()))
                {
                    labsproductline.getDefaultSidesMap().putAll(getDefaultSidesForVariant(labsproductline.getVariant().getCode()));
                } else
                {
                    labsproductline.getDefaultSidesMap().putAll(getDefaultSidesForProduct(labsproductline.getProduct().getCode()));
                }
            }
            if (labsproductline.getToppingsList() != null && !labsproductline.getToppingsList().isEmpty())
            {
                Iterator iterator = labsproductline.getToppingsList().iterator();
                ArrayList arraylist = new ArrayList();
                ArrayList arraylist1 = new ArrayList();
                while (iterator.hasNext()) 
                {
                    Object obj = (LabsTopping)iterator.next();
                    HashMap hashmap2 = new HashMap();
                    String s;
                    for (Iterator iterator1 = ((LabsTopping) (obj)).getOptionKeyList().iterator(); iterator1.hasNext(); hashmap2.put(s, Double.valueOf(((LabsTopping) (obj)).getQuantityForPart(s))))
                    {
                        s = (String)iterator1.next();
                    }

                    if (hashmap.containsKey(((LabsTopping) (obj)).getCode()))
                    {
                        obj = (LabsTopping)labsproductline.getAvailableToppingsList().get(((Integer)hashmap.get(((LabsTopping) (obj)).getCode())).intValue());
                        Iterator iterator2;
                        if (labsproductline.getDefaultToppingsMap().containsKey(((LabsTopping) (obj)).getCode()))
                        {
                            ((LabsTopping) (obj)).setDefaultQuantity(((LabsTopping)labsproductline.getDefaultToppingsMap().get(((LabsTopping) (obj)).getCode())).getDefaultQuantity());
                        } else
                        {
                            ((LabsTopping) (obj)).setDefaultQuantity(0.0D);
                        }
                        for (iterator2 = hashmap2.keySet().iterator(); iterator2.hasNext();)
                        {
                            String s1 = (String)iterator2.next();
                            if (((Double)hashmap2.get(s1)).doubleValue() == -1D)
                            {
                                ((LabsTopping) (obj)).setQuantityForPart(s1, ((LabsTopping) (obj)).getDefaultQuantity());
                            } else
                            {
                                ((LabsTopping) (obj)).setQuantityForPart(s1, ((Double)hashmap2.get(s1)).doubleValue());
                            }
                        }

                        arraylist.add(obj);
                    } else
                    if (hashmap1.containsKey(((LabsTopping) (obj)).getCode()))
                    {
                        LabsSide labsside = (LabsSide)labsproductline.getAvailableSidesList().get(((Integer)hashmap1.get(((LabsTopping) (obj)).getCode())).intValue());
                        String s2;
                        if (labsproductline.getDefaultSidesMap().containsKey(((LabsTopping) (obj)).getCode()))
                        {
                            labsside.setDefaultQuantity(((LabsSide)labsproductline.getDefaultSidesMap().get(((LabsTopping) (obj)).getCode())).getDefaultQuantity());
                        } else
                        {
                            labsside.setDefaultQuantity(0);
                        }
                        for (obj = hashmap2.keySet().iterator(); ((Iterator) (obj)).hasNext(); labsside.setQuantityForPart(s2, ((Double)hashmap2.get(s2)).doubleValue()))
                        {
                            s2 = (String)((Iterator) (obj)).next();
                        }

                        arraylist1.add(labsside);
                    }
                    iterator.remove();
                }
                labsproductline.getSidesList().addAll(arraylist1);
                labsproductline.getToppingsList().addAll(arraylist);
                return;
            }
        }
    }

    protected void onSessionSet()
    {
        mOrderManager = (OrderManager)getSession().getManager("order_manager");
        mCouponWizardManager = (CouponWizardManager)getSession().getManager("coupon_wizard_manager");
    }

    public void setMenu(FoodMenu foodmenu)
    {
        mLabsMenu = foodmenu;
    }

    public List sizeVariants(String s, String s1)
    {
        HashMap hashmap = new HashMap();
        ArrayList arraylist = new ArrayList();
        s = s.split(":");
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            LabsVariant labsvariant = getVariant(s[i]);
            if (labsvariant == null || StringHelper.isNotEmpty(s1) && !s1.equals(labsvariant.getFlavorCode()))
            {
                continue;
            }
            String s2 = labsvariant.getSizeCode();
            if (StringHelper.isNotEmpty(s2) && !hashmap.containsKey(s2))
            {
                hashmap.put(s2, null);
                arraylist.add(labsvariant);
            }
        }

        return arraylist;
    }

    public boolean supportedByMenu(LabsOrder labsorder)
    {
        Map map = mLabsMenu.getToppingMap();
        Map map1 = mLabsMenu.getSidesMap();
        for (Iterator iterator = labsorder.getCouponLineList().iterator(); iterator.hasNext();)
        {
            LabsCouponLine labscouponline = (LabsCouponLine)iterator.next();
            if (!CouponUtil.isCouponHidden(labscouponline.getCoupon()))
            {
                loadCouponFromMenu(labscouponline);
                if (labscouponline.getCoupon() == null)
                {
                    return false;
                }
            }
        }

        labsorder = labsorder.getProductLineList().iterator();
label0:
        do
        {
            if (labsorder.hasNext())
            {
                Object obj = (LabsProductLine)labsorder.next();
                if (getVariant(((LabsProductLine) (obj)).getVariant().getCode()) == null)
                {
                    return false;
                }
                LabsProduct labsproduct = ((LabsProductLine) (obj)).getProduct();
                for (Iterator iterator1 = ((LabsProductLine) (obj)).getToppingsList().iterator(); iterator1.hasNext();)
                {
                    LabsTopping labstopping = (LabsTopping)iterator1.next();
                    if (!((Map)map.get(labsproduct.getProductType())).containsKey(labstopping.getCode()))
                    {
                        return false;
                    }
                }

                obj = ((LabsProductLine) (obj)).getSidesList().iterator();
                LabsSide labsside;
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        continue label0;
                    }
                    labsside = (LabsSide)((Iterator) (obj)).next();
                } while (((Map)map1.get(labsproduct.getProductType())).containsKey(labsside.getCode()));
                break;
            } else
            {
                return true;
            }
        } while (true);
        return false;
    }

    public void updateOrderFromMenu(LabsOrder labsorder)
    {
        Iterator iterator = labsorder.getCouponLineList().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            LabsCouponLine labscouponline = (LabsCouponLine)iterator.next();
            if (labscouponline.getCoupon() == null || !CouponUtil.isCouponHidden(labscouponline.getCoupon()))
            {
                loadCouponFromMenu(labscouponline);
                if (labscouponline.getCoupon() == null)
                {
                    iterator.remove();
                    labsorder.setCouponRemoved(true);
                }
            }
        } while (true);
        for (int i = 0; i < labsorder.getProductLineList().size(); i++)
        {
            LabsProductLine labsproductline = (LabsProductLine)labsorder.getProductLineList().get(i);
            if (labsproductline.isNeedsCustomization())
            {
                continue;
            }
            labsproductline.setVariant(getVariant(labsproductline.getVariant().getCode()));
            int j = labsproductline.getQuantity();
            double d = labsproductline.getPrice();
            loadOptionsFromMenu(labsproductline);
            Object obj = new HashMap();
            LabsTopping labstopping;
            for (Iterator iterator1 = labsproductline.getToppingsList().iterator(); iterator1.hasNext(); ((Map) (obj)).put(labstopping.getCode(), new LabsTopping(labstopping)))
            {
                labstopping = (LabsTopping)iterator1.next();
            }

            HashMap hashmap = new HashMap();
            LabsSide labsside1;
            for (Iterator iterator2 = labsproductline.getSidesList().iterator(); iterator2.hasNext(); hashmap.put(labsside1.getCode(), new LabsSide(labsside1)))
            {
                labsside1 = (LabsSide)iterator2.next();
            }

            labsproductline.setQuantity(j);
            labsproductline.setPrice(d);
            List list = labsproductline.getToppingsList();
            for (int k = 0; k < list.size(); k++)
            {
                if (!((Map) (obj)).containsKey(((LabsTopping)list.get(k)).getCode()))
                {
                    continue;
                }
                LabsTopping labstopping1 = (LabsTopping)list.get(k);
                String s;
                for (Iterator iterator3 = ((LabsTopping)list.get(k)).getOptionKeyList().iterator(); iterator3.hasNext(); labstopping1.setQuantityForPart(s, ((LabsTopping)list.get(k)).getQuantityForPart(s)))
                {
                    s = (String)iterator3.next();
                }

                list.set(k, labstopping1);
            }

            labsproductline.setToppingsList(list);
            obj = labsproductline.getSidesList();
            for (int l = 0; l < ((List) (obj)).size(); l++)
            {
                if (hashmap.containsKey(((LabsSide)((List) (obj)).get(l)).getCode()))
                {
                    LabsSide labsside = (LabsSide)((List) (obj)).get(l);
                    labsside.setQuantityForPart("1/1", ((LabsSide)hashmap.get(((LabsSide)((List) (obj)).get(l)).getCode())).getQuantityForPart("1/1"));
                    ((List) (obj)).set(l, labsside);
                }
            }

            labsproductline.setSidesList(((List) (obj)));
            labsproductline.loadDefaultOptions();
            labsorder.getProductLineList().set(i, labsproductline);
        }

        updateAnySpecialCoupons(labsorder);
    }

    public String validStoreMenuCategoriesForProducts(String s, String s1)
    {
        HashSet hashset = new HashSet();
        s = s.split(":");
        int k = s.length;
        for (int i = 0; i < k; i++)
        {
            Object obj = s[i];
            String as[] = s1.split(":");
            int l = as.length;
            for (int j = 0; j < l; j++)
            {
                LabsCategory labscategory = getCategoryForProduct(as[j]);
                if (labscategory != null && (labscategory.getCode().equals(obj) || labscategory.getParentCode() != null && labscategory.getParentCode().equals(obj)))
                {
                    hashset.add(obj);
                }
            }

        }

        if (!hashset.isEmpty())
        {
            return StringHelper.join(hashset, ":");
        } else
        {
            return null;
        }
    }

    public String validStoreMenuVariantsForProducts(String s, String s1)
    {
        ArrayList arraylist = new ArrayList();
        Collections.addAll(arraylist, s1.split(":"));
        s1 = new HashSet();
        s = s.split(":");
        int j = s.length;
label0:
        for (int i = 0; i < j; i++)
        {
            Iterator iterator = getProduct(s[i]).getVariants().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    continue label0;
                }
                String s2 = (String)iterator.next();
                if (arraylist.isEmpty() || arraylist.contains(s2))
                {
                    s1.add(s2);
                }
            } while (true);
        }

        if (!s1.isEmpty())
        {
            return StringHelper.join(s1, ":");
        } else
        {
            return null;
        }
    }

    public LabsTopping validateToppingForProduct(LabsProduct labsproduct, String s, String s1)
    {
        if (s1.contains("_")) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        Object obj;
        obj = getAvailableToppingsForProduct(labsproduct.getCode());
        String as[] = s1.split("_");
        s1 = Double.valueOf(Double.parseDouble(as[0]));
        String s2 = as[1];
        if (!((Map)mLabsMenu.getToppingMap().get(labsproduct.getProductType())).containsKey(s2) || !((List) (obj)).contains(((Map)mLabsMenu.getToppingMap().get(labsproduct.getProductType())).get(s2)))
        {
            break MISSING_BLOCK_LABEL_316;
        }
        labsproduct = new LabsTopping((LabsTopping)((Map)mLabsMenu.getToppingMap().get(labsproduct.getProductType())).get(s2));
        if (s1.doubleValue() != 0.0D) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L8:
        if (!flag) goto _L1; else goto _L5
_L5:
        labsproduct.setQuantityForPart(labsproduct.getPartWithQuantity(), s1.doubleValue());
_L13:
        return labsproduct;
_L4:
        obj = ((List) (obj)).iterator();
_L7:
        LabsTopping labstopping;
        Iterator iterator;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_310;
            }
            labstopping = (LabsTopping)((Iterator) (obj)).next();
        } while (!labstopping.getCode().equals(labsproduct.getCode()));
        iterator = labstopping.getOptionAvailability().iterator();
_L10:
        if (!iterator.hasNext()) goto _L7; else goto _L6
_L6:
        if (!((Double)iterator.next()).equals(s1))
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = true;
          goto _L8
        if (!isPanPizza(s)) goto _L10; else goto _L9
_L9:
        if (StringHelper.equalsIgnoreCase(labstopping.getCode(), "Xm")) goto _L1; else goto _L11
_L11:
        if (!StringHelper.equalsIgnoreCase(labstopping.getCode(), "Cp")) goto _L10; else goto _L12
_L12:
        return null;
        flag = false;
          goto _L8
        labsproduct = null;
          goto _L13
    }

}
