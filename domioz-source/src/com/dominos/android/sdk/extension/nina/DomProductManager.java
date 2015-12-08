// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.extension.nina;

import android.content.Context;
import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.Manager;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.CouponWizardLineHolder;
import com.dominos.android.sdk.core.models.LabsCategory;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.LabsTopping;
import com.dominos.android.sdk.core.models.LabsVariant;
import com.dominos.android.sdk.core.models.coupon.LabsCouponLine;
import com.dominos.android.sdk.core.models.coupon.LabsCouponProductGroup;
import com.dominos.android.sdk.core.product.ProductWizardManager;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.android.sdk.extension.nina.model.NinaPartialProduct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DomProductManager extends Manager
{

    public static final String GRAMMAR_DIVIDER_ITEM = ":";
    private static final int INDEX_FIRST_COUPON_MATCH = 0;
    public static final String TOPPING_ANALYZER_KEY_INVALID = "invalid";
    public static final String TOPPING_ANALYZER_KEY_VALID = "valid";
    private Context mContext;
    private MenuManager mMenuManager;
    private ProductWizardManager mProductWizardManager;
    private ArrayList ninaPartialProducts;

    public DomProductManager(Context context)
    {
        ninaPartialProducts = new ArrayList();
        mContext = context;
    }

    private void addProductCategoryIfMissing(NinaPartialProduct ninapartialproduct, String s)
    {
        ArrayList arraylist = new ArrayList(Arrays.asList(ninapartialproduct.getCategory().split(":")));
        s = mMenuManager.getProduct(s).getProductType();
        if (!arraylist.contains(s))
        {
            arraylist.add(s);
        }
        ninapartialproduct.setCategory(StringHelper.join(arraylist, ":"));
    }

    private void checkForNoSauce(List list)
    {
        Object obj = new ArrayList();
        Iterator iterator = list.iterator();
        int i;
        int j;
        for (j = 0; iterator.hasNext(); j = i)
        {
            LabsTopping labstopping = (LabsTopping)iterator.next();
            i = j;
            if (!labstopping.isSauce())
            {
                continue;
            }
            j++;
            i = j;
            if (labstopping.getQuantityForPart("1/1") == 0.0D)
            {
                ((List) (obj)).add(labstopping);
                i = j;
            }
        }

        if (((List) (obj)).size() == j)
        {
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); list.remove((LabsTopping)((Iterator) (obj)).next())) { }
        }
    }

    private int codeCount(String s)
    {
        if (s == null || StringHelper.isEmpty(s))
        {
            return 0;
        } else
        {
            return s.split(":").length;
        }
    }

    private MenuSearchResult couponOptionsForPartialProduct(boolean flag, List list, NinaPartialProduct ninapartialproduct, boolean flag1, ProductWizardManager productwizardmanager)
    {
_L22:
        if (codeCount(ninapartialproduct.getVariant()) <= 0) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = exposeProductToCoupon(flag, list, ninapartialproduct);
        if (obj == null)
        {
            if (flag1)
            {
                obj = ninapartialproduct.getCategory();
                ninapartialproduct.clear();
                ninapartialproduct.setCategory(((String) (obj)));
                return couponOptionsForPartialProduct(flag, list, ninapartialproduct, productwizardmanager);
            } else
            {
                return new MenuSearchErrorResult(ProductGranularity.ERROR_NOT_ON_COUPON);
            }
        }
        int i = codeCount(((NinaPartialProduct) (obj)).getVariant());
        int j = codeCount(((NinaPartialProduct) (obj)).getProduct());
        if (StringHelper.isEmpty(((NinaPartialProduct) (obj)).getVariant()))
        {
            return new MenuSearchErrorResult(ProductGranularity.ERROR_NOT_ON_COUPON);
        }
        if (j == 1)
        {
            if (!productwizardmanager.isInitialized())
            {
                list = productwizardmanager.getProductLine();
                productwizardmanager.initialize(mMenuManager.getProduct(((NinaPartialProduct) (obj)).getProduct()), mMenuManager.getVariantsForVariantCodes(((NinaPartialProduct) (obj)).getVariantAsList()));
                if (list != null)
                {
                    productwizardmanager.replaceProductLine(list);
                }
            }
        } else
        if (j > 1)
        {
            return new MenuSearchResult(((NinaPartialProduct) (obj)), ProductGranularity.PRODUCT, null, ProductGranularity.PRODUCT);
        }
        if (i == 1)
        {
            return returnFinalResultForPartialProduct(((NinaPartialProduct) (obj)), productwizardmanager);
        }
        list = mMenuManager.getVariant((String)((NinaPartialProduct) (obj)).getVariantAsList().get(0));
        if (!StringHelper.isNotEmpty(list.getFlavorCode())) goto _L4; else goto _L3
_L3:
        if (!StringHelper.isNotEmpty(((NinaPartialProduct) (obj)).getFlavor())) goto _L6; else goto _L5
_L5:
        if (isFlavorOnVariantList(((NinaPartialProduct) (obj)).getVariantAsList(), ((NinaPartialProduct) (obj)).getFlavor()))
        {
            ninapartialproduct = updatePartialProductWithFlavorCode(((NinaPartialProduct) (obj)), ((NinaPartialProduct) (obj)).getFlavor(), productwizardmanager);
            if (ninapartialproduct == null)
            {
                return new MenuSearchErrorResult(ProductGranularity.ERROR_NOT_ON_COUPON);
            }
            if (ninapartialproduct.getVariantAsList().size() > 1)
            {
                if (StringHelper.isNotEmpty(list.getSizeCode()))
                {
                    if (StringHelper.isNotEmpty(ninapartialproduct.getSize()))
                    {
                        if (isSizeOnVariantList(ninapartialproduct.getVariantAsList(), ninapartialproduct.getSize()))
                        {
                            list = updatePartialProductWithSizeCode(ninapartialproduct, ninapartialproduct.getSize(), productwizardmanager);
                            if (list != null && list.getVariantAsList().size() == 1)
                            {
                                return returnFinalResultForPartialProduct(list, productwizardmanager);
                            }
                        }
                    } else
                    if (getSizeListOnVariantList(ninapartialproduct.getVariantAsList()).size() == 1)
                    {
                        ninapartialproduct.setVariant(StringHelper.join(ninapartialproduct.getVariantAsList(), ":"));
                        return returnFinalResultForPartialProduct(ninapartialproduct, productwizardmanager);
                    } else
                    {
                        return new MenuSearchResult(ninapartialproduct, ProductGranularity.SIZE, null, ProductGranularity.SIZE);
                    }
                } else
                if (getSizeListOnVariantList(ninapartialproduct.getVariantAsList()).size() == 1)
                {
                    list = updatePartialProductWithSizeCode(ninapartialproduct, ninapartialproduct.getSize(), productwizardmanager);
                    if (list != null && list.getVariantAsList().size() == 1)
                    {
                        return returnFinalResultForPartialProduct(list, productwizardmanager);
                    }
                } else
                {
                    return new MenuSearchResult(ninapartialproduct, ProductGranularity.SIZE, null, ProductGranularity.SIZE);
                }
            } else
            {
                return returnFinalResultForPartialProduct(ninapartialproduct, productwizardmanager);
            }
        }
          goto _L7
_L6:
        if (!StringHelper.isNotEmpty(list.getSizeCode()))
        {
            break MISSING_BLOCK_LABEL_1081;
        }
        if (!StringHelper.isNotEmpty(((NinaPartialProduct) (obj)).getSize())) goto _L9; else goto _L8
_L8:
        if (!isSizeOnVariantList(((NinaPartialProduct) (obj)).getVariantAsList(), ((NinaPartialProduct) (obj)).getSize())) goto _L11; else goto _L10
_L10:
        list = updatePartialProductWithSizeCode(((NinaPartialProduct) (obj)), ((NinaPartialProduct) (obj)).getSize(), productwizardmanager);
_L18:
        obj = getFlavorListOnVariantList(list.getVariantAsList());
        if (((List) (obj)).size() <= 1) goto _L13; else goto _L12
_L12:
        ninapartialproduct = list;
        if (!list.isBYOP()) goto _L15; else goto _L14
_L14:
        if (StringHelper.isNotEmpty(list.getSize())) goto _L17; else goto _L16
_L16:
        ninapartialproduct = list;
        if (!list.isOptionsOnCreate()) goto _L15; else goto _L17
_L17:
        ninapartialproduct = list;
        if (((List) (obj)).contains("HANDTOSS"))
        {
            list = updatePartialProductWithFlavorCode(list, "HANDTOSS", productwizardmanager);
            ninapartialproduct = list;
            if (list.getVariantAsList().size() == 1)
            {
                return returnFinalResultForPartialProduct(list, productwizardmanager);
            }
        }
          goto _L15
_L11:
        return new MenuSearchErrorResult(ProductGranularity.ERROR_NOT_ON_COUPON);
_L9:
        list = getSizeListOnVariantList(((NinaPartialProduct) (obj)).getVariantAsList());
        if (list.size() != 1)
        {
            break MISSING_BLOCK_LABEL_1081;
        }
        list = updatePartialProductWithSizeCode(((NinaPartialProduct) (obj)), (String)list.get(0), productwizardmanager);
          goto _L18
_L15:
        return new MenuSearchResult(ninapartialproduct, ProductGranularity.FLAVOR, null, ProductGranularity.FLAVOR);
_L13:
        return returnFinalResultForPartialProduct(list, productwizardmanager);
_L4:
        if (StringHelper.isNotEmpty(list.getSizeCode()))
        {
            if (StringHelper.isNotEmpty(((NinaPartialProduct) (obj)).getSize()))
            {
                if (isSizeOnVariantList(((NinaPartialProduct) (obj)).getVariantAsList(), ((NinaPartialProduct) (obj)).getSize()))
                {
                    list = updatePartialProductWithSizeCode(((NinaPartialProduct) (obj)), ((NinaPartialProduct) (obj)).getSize(), productwizardmanager);
                    if (list != null && list.getVariantAsList().size() == 1)
                    {
                        return returnFinalResultForPartialProduct(list, productwizardmanager);
                    }
                }
            } else
            {
                list = getSizeListOnVariantList(((NinaPartialProduct) (obj)).getVariantAsList());
                if (list.size() == 1)
                {
                    list = updatePartialProductWithSizeCode(((NinaPartialProduct) (obj)), (String)list.get(0), productwizardmanager);
                    if (list != null && list.getVariantAsList().size() == 1)
                    {
                        return returnFinalResultForPartialProduct(list, productwizardmanager);
                    }
                } else
                {
                    return new MenuSearchResult(((NinaPartialProduct) (obj)), ProductGranularity.SIZE, null, ProductGranularity.SIZE);
                }
            }
        }
          goto _L7
_L2:
        if (!StringHelper.isNotEmpty(ninapartialproduct.getProduct())) goto _L20; else goto _L19
_L19:
        obj = mMenuManager.getProduct(ninapartialproduct.getProduct());
        if (obj == null) goto _L7; else goto _L21
_L21:
        ninapartialproduct.setVariant(StringHelper.join(((LabsProduct) (obj)).getVariants(), ':'));
          goto _L22
_L20:
        if (StringHelper.isNotEmpty(ninapartialproduct.getSubcategory()))
        {
            obj = ninapartialproduct.getSubcategory();
        } else
        {
            obj = ninapartialproduct.getCategory();
        }
        obj = mMenuManager.getCategory(((String) (obj)));
        if (obj == null || ((LabsCategory) (obj)).getAllProducts() == null || ((LabsCategory) (obj)).getAllProducts().isEmpty()) goto _L7; else goto _L23
_L23:
label0:
        {
            if (((LabsCategory) (obj)).getProducts().size() != 1)
            {
                break label0;
            }
            ninapartialproduct.setProduct((String)((LabsCategory) (obj)).getProducts().get(0));
            flag1 = StringHelper.isNotEmpty(ninapartialproduct.getSubcategory());
        }
          goto _L22
        list = exposeProductToCoupon(flag, list, ninapartialproduct);
        if (list != null)
        {
            return new MenuSearchResult(list, ProductGranularity.PRODUCT, null, ProductGranularity.PRODUCT);
        }
_L7:
        return new MenuSearchErrorResult(ProductGranularity.ERROR_NOT_ON_COUPON);
        list = ((List) (obj));
          goto _L18
    }

    private NinaPartialProduct exposeProductToCoupon(boolean flag, List list, NinaPartialProduct ninapartialproduct)
    {
        int i;
        int j;
        i = codeCount(ninapartialproduct.getProduct());
        j = codeCount(ninapartialproduct.getVariant());
        if (!StringHelper.isNotEmpty(ninapartialproduct.getProduct())) goto _L2; else goto _L1
_L1:
        if (i != 1) goto _L4; else goto _L3
_L3:
        if (!StringHelper.isNotEmpty(ninapartialproduct.getVariant())) goto _L6; else goto _L5
_L5:
        if (j != 1) goto _L8; else goto _L7
_L7:
        if (!isVariantCodeOnCouponMatches(flag, list, ninapartialproduct.getVariant())) goto _L10; else goto _L9
_L9:
        return ninapartialproduct;
_L8:
        list = getCouponProductGroupForVariantList(flag, list, mMenuManager.getProduct(ninapartialproduct.getProduct()).getVariants());
        if (list != null)
        {
            list = filterVariantCodesWithCouponProductGroup(list, ninapartialproduct.getVariantAsList());
            if (!list.isEmpty())
            {
                ninapartialproduct.setVariant(StringHelper.join(list, ":"));
                return ninapartialproduct;
            }
        }
        break; /* Loop/switch isn't completed */
_L6:
        list = getCouponProductGroupForProductCode(flag, list, ninapartialproduct.getProduct());
        if (list != null)
        {
            ninapartialproduct.setVariant(StringHelper.join(filterVariantCodesWithCouponProductGroup(list, mMenuManager.getProduct(ninapartialproduct.getProduct()).getVariants()), ":"));
            return ninapartialproduct;
        }
        break; /* Loop/switch isn't completed */
_L4:
        ArrayList arraylist = new ArrayList(ninapartialproduct.getProductAsList());
        Iterator iterator = arraylist.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj1 = (String)iterator.next();
            addProductCategoryIfMissing(ninapartialproduct, ((String) (obj1)));
            Object obj3 = getCouponProductGroupForProductCode(flag, list, ((String) (obj1)));
            if (obj3 != null)
            {
                obj3 = filterVariantCodesWithCouponProductGroup(((LabsCouponProductGroup) (obj3)), getVariantsForProductCode(ninapartialproduct.getVariantAsList(), ((String) (obj1))));
                if (!((List) (obj3)).isEmpty())
                {
                    obj1 = removeProductCodeVariantsFromVariantList(ninapartialproduct.getVariantAsList(), ((String) (obj1)));
                    ((ArrayList) (obj1)).addAll(((java.util.Collection) (obj3)));
                    ninapartialproduct.setVariant(StringHelper.join(((java.util.Collection) (obj1)), ":"));
                    continue;
                }
            }
            removeProductCategoryFromCategoryList(ninapartialproduct, ((String) (obj1)));
            ninapartialproduct.setVariant(StringHelper.join(removeProductCodeVariantsFromVariantList(ninapartialproduct.getVariantAsList(), ((String) (obj1))), ":"));
            iterator.remove();
        } while (true);
        ninapartialproduct.setProduct(StringHelper.join(arraylist, ":"));
        if (StringHelper.isNotEmpty(ninapartialproduct.getVariant())) goto _L9; else goto _L10
_L10:
        return null;
_L2:
        Object obj;
        if (StringHelper.isNotEmpty(ninapartialproduct.getSubcategory()))
        {
            obj = ninapartialproduct.getSubcategory();
        } else
        {
            obj = ninapartialproduct.getCategory();
        }
        list = getCouponProductGroupForCategory(flag, list, ((String) (obj)));
        if (list != null)
        {
            Object obj2 = list.getProductCodes();
            list = new ArrayList();
            ArrayList arraylist1 = new ArrayList();
            obj = mMenuManager.getCategory(((String) (obj)));
            obj2 = ((List) (obj2)).iterator();
            do
            {
                if (!((Iterator) (obj2)).hasNext())
                {
                    break;
                }
                String s = (String)((Iterator) (obj2)).next();
                String s1 = mMenuManager.getVariant(s).getProductCode();
                if (((LabsCategory) (obj)).getAllProducts().contains(s1))
                {
                    list.add(s);
                    if (!arraylist1.contains(s1))
                    {
                        arraylist1.add(s1);
                    }
                }
            } while (true);
            ninapartialproduct.setProduct(StringHelper.join(arraylist1, ":"));
            ninapartialproduct.setVariant(StringHelper.join(list, ":"));
            return ninapartialproduct;
        }
        if (true) goto _L10; else goto _L11
_L11:
    }

    private List filterVariantCodesWithCouponProductGroup(LabsCouponProductGroup labscouponproductgroup, List list)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            String s = (String)list.next();
            if (labscouponproductgroup.getProductCodes().contains(s))
            {
                arraylist.add(s);
            }
        } while (true);
        return arraylist;
    }

    private List filterVariantCodesWithFlavorCode(List list, String s)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            String s1 = (String)list.next();
            LabsVariant labsvariant = mMenuManager.getVariant(s1);
            if (labsvariant != null && StringHelper.isNotEmpty(labsvariant.getFlavorCode()) && StringHelper.equals(labsvariant.getFlavorCode(), s))
            {
                arraylist.add(s1);
            }
        } while (true);
        return arraylist;
    }

    private List filterVariantCodesWithSizeCode(List list, String s)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            String s1 = (String)list.next();
            LabsVariant labsvariant = mMenuManager.getVariant(s1);
            if (labsvariant != null && StringHelper.isNotEmpty(labsvariant.getSizeCode()) && StringHelper.equals(labsvariant.getSizeCode(), s))
            {
                arraylist.add(s1);
            }
        } while (true);
        return arraylist;
    }

    private LabsCouponProductGroup getCouponProductGroupForCategory(boolean flag, List list, String s)
    {
        s = getVariantCodesForCategory(s);
        list = getPendingCouponProductGroups(flag, list).iterator();
_L2:
        LabsCouponProductGroup labscouponproductgroup;
        Iterator iterator;
        if (!list.hasNext())
        {
            break MISSING_BLOCK_LABEL_82;
        }
        labscouponproductgroup = (LabsCouponProductGroup)list.next();
        iterator = labscouponproductgroup.getProductCodes().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        if (!s.contains((String)iterator.next())) goto _L4; else goto _L3
_L3:
        return labscouponproductgroup;
        return null;
    }

    private LabsCouponProductGroup getCouponProductGroupForProductCode(boolean flag, List list, String s)
    {
        list = getPendingCouponProductGroups(flag, list).iterator();
        LabsCouponProductGroup labscouponproductgroup;
label0:
        do
        {
            if (list.hasNext())
            {
                labscouponproductgroup = (LabsCouponProductGroup)list.next();
                Iterator iterator = labscouponproductgroup.getProductCodes().iterator();
                Object obj;
                do
                {
                    if (!iterator.hasNext())
                    {
                        continue label0;
                    }
                    obj = (String)iterator.next();
                    obj = mMenuManager.getVariant(((String) (obj)));
                } while (obj == null || !StringHelper.equals(((LabsVariant) (obj)).getProductCode(), s));
                break;
            } else
            {
                return null;
            }
        } while (true);
        return labscouponproductgroup;
    }

    private LabsCouponProductGroup getCouponProductGroupForVariantList(boolean flag, List list, List list1)
    {
        list = getPendingCouponProductGroups(flag, list).iterator();
        LabsCouponProductGroup labscouponproductgroup;
label0:
        do
        {
            if (list.hasNext())
            {
                labscouponproductgroup = (LabsCouponProductGroup)list.next();
                Iterator iterator = list1.iterator();
                String s;
                do
                {
                    if (!iterator.hasNext())
                    {
                        continue label0;
                    }
                    s = (String)iterator.next();
                } while (!labscouponproductgroup.getProductCodes().contains(s));
                break;
            } else
            {
                return null;
            }
        } while (true);
        return labscouponproductgroup;
    }

    private ArrayList getFlavorListOnVariantList(List list)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = (String)list.next();
            obj = mMenuManager.getVariant(((String) (obj)));
            if (obj != null && StringHelper.isNotEmpty(((LabsVariant) (obj)).getFlavorCode()) && !arraylist.contains(((LabsVariant) (obj)).getFlavorCode()))
            {
                arraylist.add(((LabsVariant) (obj)).getFlavorCode());
            }
        } while (true);
        return arraylist;
    }

    private String getKeyValue(String s, Map map)
    {
        if (map.get(s) != null && ((String[])map.get(s)).length > 0)
        {
            return ((String[])map.get(s))[0];
        } else
        {
            return null;
        }
    }

    private List getPendingCouponProductGroups(boolean flag, List list)
    {
        ArrayList arraylist = new ArrayList();
        if (flag)
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                CouponWizardLineHolder couponwizardlineholder = (CouponWizardLineHolder)list.next();
                if (couponwizardlineholder.getLine() instanceof LabsCouponLine)
                {
                    arraylist.add(couponwizardlineholder.getGroup());
                }
            } while (true);
        } else
        {
            arraylist.add(((CouponWizardLineHolder)list.get(0)).getGroup());
        }
        return arraylist;
    }

    private ArrayList getSizeListOnVariantList(List list)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = (String)list.next();
            obj = mMenuManager.getVariant(((String) (obj)));
            if (obj != null && StringHelper.isNotEmpty(((LabsVariant) (obj)).getSizeCode()) && !arraylist.contains(((LabsVariant) (obj)).getSizeCode()))
            {
                arraylist.add(((LabsVariant) (obj)).getSizeCode());
            }
        } while (true);
        return arraylist;
    }

    private List getVariantCodesForCategory(String s)
    {
        ArrayList arraylist = new ArrayList();
        s = mMenuManager.getCategory(s).getAllProducts().iterator();
        do
        {
            if (!s.hasNext())
            {
                break;
            }
            Object obj = (String)s.next();
            obj = mMenuManager.getProduct(((String) (obj)));
            if (obj != null)
            {
                arraylist.addAll(((LabsProduct) (obj)).getVariants());
            }
        } while (true);
        return arraylist;
    }

    private List getVariantsForProductCode(List list, String s)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            String s1 = (String)list.next();
            LabsVariant labsvariant = mMenuManager.getVariant(s1);
            if (labsvariant != null && StringHelper.equals(labsvariant.getProductCode(), s))
            {
                arraylist.add(s1);
            }
        } while (true);
        return arraylist;
    }

    private boolean isBuildYourOwnPasta(LabsProduct labsproduct)
    {
        return labsproduct.isPasta() && StringHelper.equalsIgnoreCase(labsproduct.getCode(), "S_BUILD");
    }

    private boolean isFlavorOnVariantList(List list, String s)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            Object obj = (String)list.next();
            obj = mMenuManager.getVariant(((String) (obj)));
            if (obj != null && StringHelper.isNotEmpty(((LabsVariant) (obj)).getFlavorCode()) && StringHelper.equals(((LabsVariant) (obj)).getFlavorCode(), s))
            {
                return true;
            }
        }

        return false;
    }

    private boolean isSizeOnVariantList(List list, String s)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            Object obj = (String)list.next();
            obj = mMenuManager.getVariant(((String) (obj)));
            if (obj != null && StringHelper.isNotEmpty(((LabsVariant) (obj)).getSizeCode()) && StringHelper.equals(((LabsVariant) (obj)).getSizeCode(), s))
            {
                return true;
            }
        }

        return false;
    }

    private boolean isVariantCodeOnCouponMatches(boolean flag, List list, String s)
    {
        return getCouponProductGroupForVariantList(flag, list, Arrays.asList(new String[] {
            s
        })) != null;
    }

    private void removeProductCategoryFromCategoryList(NinaPartialProduct ninapartialproduct, String s)
    {
        ArrayList arraylist = new ArrayList(Arrays.asList(ninapartialproduct.getCategory().split(":")));
        s = mMenuManager.getProduct(s).getProductType();
        if (arraylist.contains(s))
        {
            arraylist.remove(s);
        }
        if (!arraylist.isEmpty())
        {
            ninapartialproduct.setCategory(StringHelper.join(arraylist, ":"));
        }
    }

    private ArrayList removeProductCodeVariantsFromVariantList(List list, String s)
    {
        list = new ArrayList(list);
        Iterator iterator = list.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (String)iterator.next();
            obj = mMenuManager.getVariant(((String) (obj)));
            if (obj == null || StringHelper.equals(s, ((LabsVariant) (obj)).getProductCode()))
            {
                iterator.remove();
            }
        } while (true);
        return list;
    }

    private MenuSearchResult returnFinalResultForPartialProduct(NinaPartialProduct ninapartialproduct, ProductWizardManager productwizardmanager)
    {
        Object obj;
        LabsProductLine labsproductline;
        boolean flag1;
        flag1 = true;
        if (productwizardmanager.getProductLine() == null)
        {
            return new MenuSearchErrorResult(ProductGranularity.ERROR);
        }
        labsproductline = productwizardmanager.getProductLine();
        obj = new ArrayList();
        if (!labsproductline.hasOptions())
        {
            break MISSING_BLOCK_LABEL_291;
        }
        productwizardmanager = ((ProductWizardManager) (obj));
        if (StringHelper.equals(labsproductline.getVariant().getFlavorCode(), "GLUTENF")) goto _L2; else goto _L1
_L1:
        if (!StringHelper.isNotEmpty(ninapartialproduct.getOptions())) goto _L4; else goto _L3
_L3:
        Map map;
        map = analyzeToppings(labsproductline.getProduct(), labsproductline.getVariant().getCode(), ninapartialproduct.getOptions());
        obj = (List)map.get("valid");
        productwizardmanager = ((ProductWizardManager) (obj));
        if (!((List)map.get("invalid")).isEmpty()) goto _L2; else goto _L5
_L5:
        productwizardmanager = ((ProductWizardManager) (obj));
        if (!ninapartialproduct.optionsOnCreate()) goto _L2; else goto _L6
_L6:
        boolean flag;
        flag = false;
        productwizardmanager = ((ProductWizardManager) (obj));
_L11:
        if (ninapartialproduct.hasLeftSideOrRightSideOptions())
        {
            flag = true;
        }
_L12:
        if (!flag && !productwizardmanager.isEmpty() && !updateProductLineWithToppings(labsproductline, getValidOptionsForProduct(labsproductline.getProduct(), productwizardmanager)).equals("VALID_TOPPINGS_QUANTITY_CODE"))
        {
            flag = flag1;
        }
        ninapartialproduct.setOptionsOnCreate(false);
        obj = ProductGranularity.TOPPINGS;
        if (flag)
        {
            productwizardmanager = ProductGranularity.TOPPINGS;
        } else
        {
            productwizardmanager = ProductGranularity.COMPLETED;
        }
        return new MenuSearchResult(ninapartialproduct, ((ProductGranularity) (obj)), labsproductline, productwizardmanager);
_L4:
        productwizardmanager = ((ProductWizardManager) (obj));
        if (ninapartialproduct.isBYOP()) goto _L2; else goto _L7
_L7:
        productwizardmanager = ((ProductWizardManager) (obj));
        if (ninapartialproduct.isBYOPasta()) goto _L2; else goto _L8
_L8:
        productwizardmanager = ((ProductWizardManager) (obj));
        if (ninapartialproduct.isBYOHoagie()) goto _L2; else goto _L9
_L9:
        productwizardmanager = ((ProductWizardManager) (obj));
        if (ninapartialproduct.isBYOSlice()) goto _L2; else goto _L10
_L10:
        flag = false;
        productwizardmanager = ((ProductWizardManager) (obj));
          goto _L11
_L2:
        flag = true;
          goto _L11
        productwizardmanager = ((ProductWizardManager) (obj));
        flag = false;
          goto _L12
    }

    private NinaPartialProduct updatePartialProductWithFlavorCode(NinaPartialProduct ninapartialproduct, String s, ProductWizardManager productwizardmanager)
    {
        productwizardmanager.setFlavor(s);
        s = filterVariantCodesWithFlavorCode(ninapartialproduct.getVariantAsList(), s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        if (s.isEmpty())
        {
            break MISSING_BLOCK_LABEL_41;
        }
        ninapartialproduct.setVariant(StringHelper.join(s, ":"));
        return ninapartialproduct;
        ninapartialproduct;
        return null;
    }

    private NinaPartialProduct updatePartialProductWithSizeCode(NinaPartialProduct ninapartialproduct, String s, ProductWizardManager productwizardmanager)
    {
        productwizardmanager.setSize(s);
        s = filterVariantCodesWithSizeCode(ninapartialproduct.getVariantAsList(), s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        if (s.isEmpty())
        {
            break MISSING_BLOCK_LABEL_41;
        }
        ninapartialproduct.setVariant(StringHelper.join(s, ":"));
        return ninapartialproduct;
        ninapartialproduct;
        return null;
    }

    private String validStoreMenuCategories(String s)
    {
        s = s.split(":");
        ArrayList arraylist = new ArrayList();
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            String s1 = s[i];
            if (mMenuManager.getCategory(s1) != null)
            {
                arraylist.add(s1);
            }
        }

        if (!arraylist.isEmpty())
        {
            return StringHelper.join(arraylist, ":");
        } else
        {
            return null;
        }
    }

    private List validVariants(String s)
    {
        s = s.split(":");
        ArrayList arraylist = new ArrayList();
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = s[i];
            obj = mMenuManager.getVariant(((String) (obj)));
            if (obj != null)
            {
                arraylist.add(obj);
            }
        }

        return arraylist;
    }

    private String validateAmbiguousToppings(LabsProduct labsproduct, String s, String s1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s2 = s1.split("_")[0];
        String s3 = s1.split("_")[1];
        if (!s1.contains(":"))
        {
            return null;
        }
        stringbuilder.append(s2).append("_");
        s1 = s3.split(":");
        int i = 0;
        boolean flag = false;
        while (i < s1.length) 
        {
            String s4 = s1[i];
            boolean flag1 = flag;
            if (mMenuManager.validateToppingForProduct(labsproduct, s, (new StringBuilder()).append(s2).append("_").append(s4).toString()) != null)
            {
                if (i > 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (flag & flag1)
                {
                    stringbuilder.append(":");
                }
                stringbuilder.append(s4);
                flag1 = true;
            }
            i++;
            flag = flag1;
        }
        if (!flag)
        {
            return null;
        } else
        {
            return stringbuilder.toString();
        }
    }

    public Map analyzeToppings(LabsProduct labsproduct, String s, String s1)
    {
        HashMap hashmap = new HashMap();
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        if (StringHelper.isNotEmpty(s1) && mMenuManager.isProductTypeInTopping(labsproduct.getProductType()))
        {
            s1 = s1.split(";");
            int j = s1.length;
            int i = 0;
            while (i < j) 
            {
                String s2 = s1[i];
                String s3 = s2.split("_")[1];
                if (s3.contains(":"))
                {
                    s3 = validateAmbiguousToppings(labsproduct, s, s2);
                    if (s3 == null)
                    {
                        arraylist1.add(s2);
                    } else
                    if (!s3.contains(":"))
                    {
                        arraylist.add(s3);
                    } else
                    {
                        arraylist1.add(s2);
                    }
                } else
                {
                    String s4 = s2.split("_")[0];
                    if (mMenuManager.validateToppingForProduct(labsproduct, s, (new StringBuilder()).append(s4).append("_").append(s3).toString()) == null)
                    {
                        arraylist1.add(s2);
                    } else
                    {
                        arraylist.add(s2);
                    }
                }
                i++;
            }
        }
        hashmap.put("valid", arraylist);
        hashmap.put("invalid", arraylist1);
        return hashmap;
    }

    public void buildFrom(NinaPartialProduct ninapartialproduct, Map map)
    {
        String s = getKeyValue(NinaPartialProduct.PR_PRODUCTCODE, map);
        if (s != null)
        {
            ninapartialproduct.setProduct(validStoreMenuProducts(s));
            if (ninapartialproduct.getProduct() == null)
            {
                ninapartialproduct.setLostProductCode(true);
            }
        }
        s = getKeyValue(NinaPartialProduct.PR_CATEGORY, map);
        if (s != null)
        {
            if (ninapartialproduct.getProduct() == null)
            {
                s = validStoreMenuCategories(s);
            } else
            {
                s = mMenuManager.validStoreMenuCategoriesForProducts(s, ninapartialproduct.getProduct());
            }
            ninapartialproduct.setCategory(s);
        }
        s = getKeyValue(NinaPartialProduct.PR_SUBCATEGORY, map);
        if (s != null)
        {
            if (ninapartialproduct.getProduct() == null)
            {
                s = validStoreMenuCategories(s);
            } else
            {
                s = mMenuManager.validStoreMenuCategoriesForProducts(s, ninapartialproduct.getProduct());
            }
            ninapartialproduct.setSubcategory(s);
        }
        s = getKeyValue(NinaPartialProduct.PR_VARIANT, map);
        if (s != null)
        {
            if (ninapartialproduct.getProduct() == null)
            {
                s = validStoreMenuVariants(s);
            } else
            {
                s = mMenuManager.validStoreMenuVariantsForProducts(ninapartialproduct.getProduct(), s);
            }
            ninapartialproduct.setVariant(s);
        }
        s = getKeyValue(NinaPartialProduct.PR_FLAVOR, map);
        if (s != null)
        {
            ninapartialproduct.setFlavor(s);
        }
        s = getKeyValue(NinaPartialProduct.PR_SIZE, map);
        if (s != null)
        {
            ninapartialproduct.setSize(s);
        }
        if (map.containsKey(NinaPartialProduct.PR_OPTIONS))
        {
            ninapartialproduct.setOptions(StringHelper.join((Object[])map.get(NinaPartialProduct.PR_OPTIONS), ";"));
            ninapartialproduct.setOptionsOnCreate(true);
        }
        s = getKeyValue(NinaPartialProduct.PR_OPTIONS_S1, map);
        if (s != null)
        {
            ninapartialproduct.setOptionsSide1(s);
        }
        map = getKeyValue(NinaPartialProduct.PR_OPTIONS_S2, map);
        if (map != null)
        {
            ninapartialproduct.setOptionsSide2(map);
        }
        ninapartialproduct.setQuantity("1");
    }

    public void clearPartialProductsResetProductController()
    {
        if (ninaPartialProducts != null && !ninaPartialProducts.isEmpty())
        {
            LogUtil.d("NinaX", "Nina partial product removed and ProductController reset", new Object[0]);
            ninaPartialProducts.clear();
            mProductWizardManager.reset();
        }
    }

    public MenuSearchResult couponOptionsForPartialProduct(boolean flag, List list, NinaPartialProduct ninapartialproduct, ProductWizardManager productwizardmanager)
    {
        return couponOptionsForPartialProduct(flag, list, ninapartialproduct, false, productwizardmanager);
    }

    public NinaPartialProduct getCurrentPartialProduct()
    {
        if (ninaPartialProducts != null && ninaPartialProducts.size() > 0)
        {
            return (NinaPartialProduct)ninaPartialProducts.get(0);
        } else
        {
            return null;
        }
    }

    public List getGroupVariantsByProduct(LabsCouponProductGroup labscouponproductgroup, LabsProduct labsproduct)
    {
        ArrayList arraylist = new ArrayList();
        if (labscouponproductgroup != null && labsproduct != null)
        {
            labscouponproductgroup = labscouponproductgroup.getProductCodes().iterator();
            do
            {
                if (!labscouponproductgroup.hasNext())
                {
                    break;
                }
                Object obj = (String)labscouponproductgroup.next();
                obj = mMenuManager.getVariant(((String) (obj)));
                if (obj != null && StringHelper.equals(((LabsVariant) (obj)).getProductCode(), labsproduct.getCode()))
                {
                    arraylist.add(obj);
                }
            } while (true);
        }
        return arraylist;
    }

    public String getName()
    {
        return "dom_product_manager";
    }

    public String getNameForOptionQuantity(double d, HashMap hashmap)
    {
        String s = (String)hashmap.get(Double.valueOf(d));
        hashmap = s;
        if (s == null)
        {
            hashmap = "";
        }
        return hashmap;
    }

    public ArrayList getNinaPartialProducts()
    {
        return ninaPartialProducts;
    }

    public List getValidOptionsForProduct(LabsProduct labsproduct, List list)
    {
        List list1 = mMenuManager.getAvailableToppingsForProduct(labsproduct.getCode());
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = (String)list.next();
            String s = ((String) (obj)).split("_")[0];
            obj = ((String) (obj)).split("_")[1];
            if (mMenuManager.isvalidOptionInProductTypeTopping(labsproduct.getProductType(), ((String) (obj))) && list1.contains(mMenuManager.getValidOptionInProductTypeTopping(labsproduct.getProductType(), ((String) (obj)))))
            {
                obj = new LabsTopping(mMenuManager.getValidOptionInProductTypeTopping(labsproduct.getProductType(), ((String) (obj))));
                ((LabsTopping) (obj)).setQuantityForPart("1/1", Double.parseDouble(s));
                arraylist.add(obj);
            }
        } while (true);
        if (isBuildYourOwnPasta(labsproduct))
        {
            checkForNoSauce(arraylist);
        }
        return arraylist;
    }

    public MenuSearchResult menuOptionsForPartialProduct(NinaPartialProduct ninapartialproduct, ProductWizardManager productwizardmanager)
    {
        Object obj;
        String s;
        Object obj1;
        String s1;
        String s2;
        Object obj2;
        String s3;
        obj = ninapartialproduct.getOptions();
        s = ninapartialproduct.getVariant();
        obj1 = ninapartialproduct.getSize();
        s1 = ninapartialproduct.getFlavor();
        s2 = ninapartialproduct.getProduct();
        s3 = ninapartialproduct.getSubcategory();
        obj2 = ninapartialproduct.getCategory();
        if (codeCount(s) <= 0) goto _L2; else goto _L1
_L1:
        if (StringHelper.contains(((String) (obj2)), ":") || StringHelper.contains(s2, ":"))
        {
            return new MenuSearchResult(ninapartialproduct, ProductGranularity.CATEGORY, null, ProductGranularity.PRODUCT);
        }
        obj2 = validVariants(s);
        if (((List) (obj2)).isEmpty())
        {
            return new MenuSearchResult(ninapartialproduct, ProductGranularity.VARIANT, null, ProductGranularity.ERROR);
        }
        if (((List) (obj2)).size() != s.split(":").length)
        {
            ninapartialproduct.setVariant(StringHelper.join(((java.util.Collection) (obj2)), ":"));
            return menuOptionsForPartialProduct(ninapartialproduct, productwizardmanager);
        }
        if (StringHelper.isEmpty(s2))
        {
            ninapartialproduct.setProduct(((LabsVariant)((List) (obj2)).get(0)).getProductCode());
            return menuOptionsForPartialProduct(ninapartialproduct, productwizardmanager);
        }
        if (!productwizardmanager.isInitialized())
        {
            productwizardmanager.initialize(mMenuManager.getProduct(s2));
        }
        if (!productwizardmanager.hasFlavors())
        {
            break MISSING_BLOCK_LABEL_400;
        }
        if (!StringHelper.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_372;
        }
        if (productwizardmanager.getCurrentVariants().size() == 1)
        {
            ninapartialproduct.setFlavor(((LabsVariant)productwizardmanager.getCurrentVariants().get(0)).getFlavorCode());
            return menuOptionsForPartialProduct(ninapartialproduct, productwizardmanager);
        }
        if (!ninapartialproduct.isSkipFlavorDefault()) goto _L4; else goto _L3
_L3:
        ninapartialproduct.setSkipFlavorDefault(false);
_L6:
        if (StringHelper.isNotEmpty(((String) (obj1))))
        {
            try
            {
                productwizardmanager.setSize(((String) (obj1)));
            }
            // Misplaced declaration of an exception variable
            catch (ProductWizardManager productwizardmanager)
            {
                ninapartialproduct.setSize(null);
            }
        }
        return new MenuSearchResult(ninapartialproduct, ProductGranularity.VARIANT, null, ProductGranularity.FLAVOR);
_L4:
        if (!ninapartialproduct.isPizza() || (!ninapartialproduct.isBYOP() || !StringHelper.isNotEmpty(((String) (obj1))) && !StringHelper.isNotEmpty(((String) (obj)))) && (ninapartialproduct.isBYOP() || productwizardmanager.isCreatedFromMenu())) goto _L6; else goto _L5
_L5:
        ninapartialproduct.setFlavor("HANDTOSS");
        return menuOptionsForPartialProduct(ninapartialproduct, productwizardmanager);
        if (StringHelper.isEmpty(productwizardmanager.getFlavorCode()) || !StringHelper.equalsIgnoreCase(s1, productwizardmanager.getFlavorCode()))
        {
            try
            {
                productwizardmanager.setFlavor(s1);
            }
            // Misplaced declaration of an exception variable
            catch (ProductWizardManager productwizardmanager)
            {
                return new MenuSearchResult(ninapartialproduct, ProductGranularity.FLAVOR, null, ProductGranularity.UNKNOWN);
            }
        }
        if (productwizardmanager.hasSizes())
        {
            if (StringHelper.isEmpty(((String) (obj1))))
            {
                if (productwizardmanager.getCurrentVariants().size() == 1)
                {
                    ninapartialproduct.setSize(((LabsVariant)productwizardmanager.getCurrentVariants().get(0)).getSizeCode());
                    return menuOptionsForPartialProduct(ninapartialproduct, productwizardmanager);
                } else
                {
                    return new MenuSearchResult(ninapartialproduct, ProductGranularity.VARIANT, null, ProductGranularity.SIZE);
                }
            }
            if (StringHelper.isEmpty(productwizardmanager.getSizeCode()) || !StringHelper.equalsIgnoreCase(((String) (obj1)), productwizardmanager.getSizeCode()))
            {
                try
                {
                    productwizardmanager.setSize(((String) (obj1)));
                }
                // Misplaced declaration of an exception variable
                catch (ProductWizardManager productwizardmanager)
                {
                    return new MenuSearchResult(ninapartialproduct, ProductGranularity.SIZE, null, ProductGranularity.UNKNOWN);
                }
            }
        }
        new ArrayList();
        if (productwizardmanager.getCurrentVariants().size() <= 1 || codeCount(s) != 1) goto _L8; else goto _L7
_L7:
        obj1 = productwizardmanager.getCurrentVariants().iterator();
_L12:
        if (!((Iterator) (obj1)).hasNext()) goto _L10; else goto _L9
_L9:
        obj = (LabsVariant)((Iterator) (obj1)).next();
        if (!((LabsVariant) (obj)).getCode().equals(s)) goto _L12; else goto _L11
_L11:
        if (obj == null) goto _L14; else goto _L13
_L13:
        productwizardmanager.injectVariant(((LabsVariant) (obj)));
_L8:
        return returnFinalResultForPartialProduct(ninapartialproduct, productwizardmanager);
_L14:
        return new MenuSearchResult(ninapartialproduct, ProductGranularity.VARIANT, null, ProductGranularity.ERROR_NOT_ON_MENU);
_L2:
        if (StringHelper.isNotEmpty(s2) && mMenuManager.getProduct(s2) != null)
        {
            ninapartialproduct.setVariant(StringHelper.join(mMenuManager.getProduct(s2).getVariants(), ':'));
            return menuOptionsForPartialProduct(ninapartialproduct, productwizardmanager);
        }
        if (StringHelper.isNotEmpty(s3))
        {
            obj = mMenuManager.getCategory(s3).getAllProducts();
            if (obj != null && ((List) (obj)).size() == 1)
            {
                ninapartialproduct.setProduct((String)((List) (obj)).get(0));
                return menuOptionsForPartialProduct(ninapartialproduct, productwizardmanager);
            } else
            {
                return new MenuSearchResult(ninapartialproduct, ProductGranularity.CATEGORY, obj, ProductGranularity.PRODUCT);
            }
        }
        if (StringHelper.isNotEmpty(((String) (obj2))))
        {
            obj = new ArrayList();
            LabsCategory labscategory = mMenuManager.getCategory(((String) (obj2)));
            if (labscategory == null)
            {
                return new MenuSearchResult(ninapartialproduct, ProductGranularity.ERROR, null, ProductGranularity.ERROR);
            }
            for (Iterator iterator = labscategory.getCategoryList().iterator(); iterator.hasNext(); ((List) (obj)).add(((LabsCategory)iterator.next()).getCode())) { }
            if (((List) (obj)).size() == 0)
            {
                obj = labscategory.getAllProducts();
                if (((List) (obj)).size() == 0)
                {
                    return new MenuSearchResult(ninapartialproduct, ProductGranularity.CATEGORY, obj, ProductGranularity.PRODUCT);
                }
                if (((List) (obj)).size() == 1)
                {
                    ninapartialproduct.setProduct((String)((List) (obj)).get(0));
                    return menuOptionsForPartialProduct(ninapartialproduct, productwizardmanager);
                } else
                {
                    return new MenuSearchResult(ninapartialproduct, ProductGranularity.CATEGORY, obj, ProductGranularity.PRODUCT);
                }
            }
            if (((List) (obj)).size() == 1)
            {
                ninapartialproduct.setSubcategory((String)((List) (obj)).get(0));
                return menuOptionsForPartialProduct(ninapartialproduct, productwizardmanager);
            } else
            {
                return new MenuSearchResult(ninapartialproduct, ProductGranularity.UNKNOWN, obj, ProductGranularity.PRODUCT);
            }
        } else
        {
            return null;
        }
_L10:
        obj = null;
        if (true) goto _L11; else goto _L15
_L15:
    }

    protected void onSessionSet()
    {
        mProductWizardManager = (ProductWizardManager)getSession().getManager("product_wizard_manager");
        mMenuManager = (MenuManager)getSession().getManager("menu_manager");
    }

    public void resetCurrentPartialProduct(LabsProduct labsproduct)
    {
        getNinaPartialProducts().clear();
        HashMap hashmap = new HashMap();
        hashmap.put(NinaPartialProduct.PR_CATEGORY, new String[] {
            labsproduct.getProductType()
        });
        hashmap.put(NinaPartialProduct.PR_PRODUCTCODE, new String[] {
            labsproduct.getCode()
        });
        hashmap.put(NinaPartialProduct.PR_VARIANT, new String[] {
            StringHelper.join(labsproduct.getVariants(), ":")
        });
        getNinaPartialProducts().add(new NinaPartialProduct(getSession(), hashmap));
    }

    public String updateProductLineWithToppings(LabsProductLine labsproductline, List list)
    {
        Object obj;
        ArrayList arraylist;
        ArrayList arraylist1;
        Iterator iterator1;
        arraylist1 = new ArrayList();
        arraylist = new ArrayList();
        iterator1 = list.iterator();
        obj = null;
_L5:
        if (!iterator1.hasNext()) goto _L2; else goto _L1
_L1:
        LabsTopping labstopping;
        LabsTopping labstopping1;
        labstopping = (LabsTopping)iterator1.next();
        Iterator iterator = labsproductline.getToppingsList().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_795;
            }
            labstopping1 = (LabsTopping)iterator.next();
        } while (!labstopping1.getCode().equals(labstopping.getCode()));
        if (labstopping.isToppingAdded()) goto _L4; else goto _L3
_L3:
        boolean flag;
        labstopping1.reset();
        arraylist.add(labstopping1);
        double d;
        Object obj1;
        Object obj2;
        String s;
        if (labstopping1.isSauce())
        {
            arraylist1.add(labstopping1);
            flag = true;
        } else
        {
            flag = true;
        }
_L14:
        if (!flag)
        {
            if (labstopping.isSauce())
            {
                obj = labsproductline.getToppingsList().iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    obj1 = (LabsTopping)((Iterator) (obj)).next();
                    if (((LabsTopping) (obj1)).isSauce() && ((LabsTopping) (obj1)).getQuantityForPart("1/1") > 0.0D)
                    {
                        ((LabsTopping) (obj1)).setQuantityForPart("1/1", 0.0D);
                        arraylist1.add(obj1);
                    }
                } while (true);
                obj = labstopping;
            } else
            {
                labsproductline.getToppingsList().add(labstopping);
                obj1 = labsproductline.validateSidesOptionsQuantity();
                if (!((String) (obj1)).equals("VALID_TOPPINGS_QUANTITY_CODE"))
                {
                    labsproductline.getToppingsList().remove(labstopping);
                    return ((String) (obj1));
                }
            }
        }
          goto _L5
_L4:
        if (!labstopping1.isSauce() || labstopping1.getDefaultQuantity() <= 0.0D || labstopping1.getQuantityForPart("1/1") != 0.0D) goto _L7; else goto _L6
_L6:
        d = 0.0D;
        obj2 = labsproductline.getToppingsList().iterator();
_L11:
        if (!((Iterator) (obj2)).hasNext()) goto _L9; else goto _L8
_L8:
        obj1 = (LabsTopping)((Iterator) (obj2)).next();
        if (!((LabsTopping) (obj1)).isSauce() || ((LabsTopping) (obj1)).getQuantityForPart("1/1") <= 0.0D) goto _L11; else goto _L10
_L10:
        d = ((LabsTopping) (obj1)).getQuantityForPart("1/1");
        ((LabsTopping) (obj1)).setQuantityForPart("1/1", 0.0D);
_L13:
        labstopping1.setQuantityForPart("1/1", labstopping.getQuantityForPart("1/1"));
        obj2 = labsproductline.validateSidesOptionsQuantity();
        if (!((String) (obj2)).equals("VALID_TOPPINGS_QUANTITY_CODE"))
        {
            labstopping1.setQuantityForPart("1/1", 0.0D);
            if (obj1 != null)
            {
                ((LabsTopping) (obj1)).setQuantityForPart("1/1", d);
            }
            return ((String) (obj2));
        }
        if (obj1 != null)
        {
            arraylist1.add(obj1);
        }
        flag = true;
        break MISSING_BLOCK_LABEL_144;
_L7:
        obj1 = new HashMap();
        for (obj2 = labstopping1.getOptionKeyList().iterator(); ((Iterator) (obj2)).hasNext(); ((Map) (obj1)).put(s, Double.valueOf(labstopping1.getQuantityForPart(s))))
        {
            s = (String)((Iterator) (obj2)).next();
        }

        for (obj2 = labstopping.getOptionKeyList().iterator(); ((Iterator) (obj2)).hasNext(); labstopping1.setQuantityForPart(s, labstopping.getQuantityForPart(s)))
        {
            s = (String)((Iterator) (obj2)).next();
        }

        obj2 = labsproductline.validateSidesOptionsQuantity();
        if (!((String) (obj2)).equals("VALID_TOPPINGS_QUANTITY_CODE"))
        {
            for (labsproductline = ((Map) (obj1)).keySet().iterator(); labsproductline.hasNext(); labstopping1.setQuantityForPart(list, ((Double)((Map) (obj1)).get(list)).doubleValue()))
            {
                list = (String)labsproductline.next();
            }

            return ((String) (obj2));
        }
        flag = true;
        break MISSING_BLOCK_LABEL_144;
_L2:
        if (obj != null)
        {
            labsproductline.getToppingsList().add(obj);
        }
        obj = arraylist1.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            obj1 = (LabsTopping)((Iterator) (obj)).next();
            if (!list.contains(obj1))
            {
                list.add(obj1);
            }
        } while (true);
        list = arraylist.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            obj = (LabsTopping)list.next();
            if (!((LabsTopping) (obj)).isCheese())
            {
                labsproductline.getToppingsList().remove(obj);
            }
        } while (true);
        return "VALID_TOPPINGS_QUANTITY_CODE";
_L9:
        obj1 = null;
        if (true) goto _L13; else goto _L12
_L12:
        flag = false;
          goto _L14
    }

    public String validStoreMenuProducts(String s)
    {
        s = s.split(":");
        ArrayList arraylist = new ArrayList();
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            String s1 = s[i];
            if (mMenuManager.getProduct(s1) != null)
            {
                arraylist.add(s1);
            }
        }

        if (!arraylist.isEmpty())
        {
            return StringHelper.join(arraylist, ":");
        } else
        {
            return null;
        }
    }

    public String validStoreMenuVariants(String s)
    {
        s = s.split(":");
        ArrayList arraylist = new ArrayList();
        int j = s.length;
        for (int i = 0; i < j; i++)
        {
            String s1 = s[i];
            if (mMenuManager.getVariant(s1) != null)
            {
                arraylist.add(s1);
            }
        }

        if (!arraylist.isEmpty())
        {
            return StringHelper.join(arraylist, ":");
        } else
        {
            return null;
        }
    }

    private class MenuSearchErrorResult extends MenuSearchResult
    {
        private class MenuSearchResult
        {

            private ProductGranularity granularity;
            private ProductGranularity nextPrompt;
            private NinaPartialProduct ninaPartialProduct;
            private Object result;

            public ProductGranularity getGranularity()
            {
                return granularity;
            }

            public ProductGranularity getNextPrompt()
            {
                return nextPrompt;
            }

            public NinaPartialProduct getNinaPartialProduct()
            {
                return ninaPartialProduct;
            }

            public Object getResult()
            {
                return result;
            }

            public void setNextPrompt(ProductGranularity productgranularity)
            {
                nextPrompt = productgranularity;
            }

            public void setResult(Object obj)
            {
                result = obj;
            }

            public MenuSearchResult(NinaPartialProduct ninapartialproduct, ProductGranularity productgranularity, Object obj, ProductGranularity productgranularity1)
            {
                ninaPartialProduct = ninapartialproduct;
                granularity = productgranularity;
                result = obj;
                nextPrompt = productgranularity1;
            }
        }


        public MenuSearchErrorResult(ProductGranularity productgranularity)
        {
            super(null, productgranularity, null, productgranularity);
        }
    }


    private class ProductGranularity extends Enum
    {

        private static final ProductGranularity $VALUES[];
        public static final ProductGranularity CATEGORY;
        public static final ProductGranularity COMPLETED;
        public static final ProductGranularity ERROR;
        public static final ProductGranularity ERROR_NOT_ON_COUPON;
        public static final ProductGranularity ERROR_NOT_ON_MENU;
        public static final ProductGranularity FLAVOR;
        public static final ProductGranularity PRODUCT;
        public static final ProductGranularity SIZE;
        public static final ProductGranularity TOPPINGS;
        public static final ProductGranularity UNKNOWN;
        public static final ProductGranularity VARIANT;

        public static ProductGranularity valueOf(String s)
        {
            return (ProductGranularity)Enum.valueOf(com/dominos/android/sdk/extension/nina/DomProductManager$ProductGranularity, s);
        }

        public static ProductGranularity[] values()
        {
            return (ProductGranularity[])$VALUES.clone();
        }

        static 
        {
            UNKNOWN = new ProductGranularity("UNKNOWN", 0);
            ERROR_NOT_ON_MENU = new ProductGranularity("ERROR_NOT_ON_MENU", 1);
            ERROR_NOT_ON_COUPON = new ProductGranularity("ERROR_NOT_ON_COUPON", 2);
            ERROR = new ProductGranularity("ERROR", 3);
            CATEGORY = new ProductGranularity("CATEGORY", 4);
            PRODUCT = new ProductGranularity("PRODUCT", 5);
            VARIANT = new ProductGranularity("VARIANT", 6);
            SIZE = new ProductGranularity("SIZE", 7);
            FLAVOR = new ProductGranularity("FLAVOR", 8);
            TOPPINGS = new ProductGranularity("TOPPINGS", 9);
            COMPLETED = new ProductGranularity("COMPLETED", 10);
            $VALUES = (new ProductGranularity[] {
                UNKNOWN, ERROR_NOT_ON_MENU, ERROR_NOT_ON_COUPON, ERROR, CATEGORY, PRODUCT, VARIANT, SIZE, FLAVOR, TOPPINGS, 
                COMPLETED
            });
        }

        private ProductGranularity(String s, int i)
        {
            super(s, i);
        }
    }

}
