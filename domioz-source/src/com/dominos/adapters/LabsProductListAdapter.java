// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.dominos.MobileSession;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.LabsCategory;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.android.sdk.core.product.ProductWizardManager;
import com.dominos.android.sdk.core.store.MenuManager;
import com.dominos.views.LabsProductView;
import com.dominos.views.LabsProductView_;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LabsProductListAdapter extends BaseAdapter
{

    List ambiguousProductCodes;
    List categories;
    Context context;
    private boolean fromCouponWizard;
    protected LayoutInflater inflater;
    private MenuManager mMenuManager;
    MobileSession mMobileSession;
    List productList;
    ProductType productType;
    private ProductWizardManager productWizardManager;
    List sectionHeaders;
    private int startPositionExtras;

    public LabsProductListAdapter()
    {
        startPositionExtras = -1;
    }

    private int getAllProductsFromCategory(LabsCategory labscategory)
    {
        Object obj1 = new ArrayList();
        if (!productWizardManager.isFromCouponWizard()) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = obj1;
        if (labscategory.getCouponTargetProducts() != null)
        {
            obj = labscategory.getCouponTargetProducts();
        }
_L4:
        if (((List) (obj)).isEmpty())
        {
            break MISSING_BLOCK_LABEL_268;
        }
        if (ambiguousProductCodes != null && !ambiguousProductCodes.isEmpty())
        {
            obj1 = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                String s = ((LabsProduct)((Iterator) (obj1)).next()).getCode();
                if (!ambiguousProductCodes.contains(s))
                {
                    ((Iterator) (obj1)).remove();
                }
            } while (true);
        }
        break; /* Loop/switch isn't completed */
_L2:
        Iterator iterator = labscategory.getProducts().iterator();
        do
        {
            obj = obj1;
            if (!iterator.hasNext())
            {
                break;
            }
            obj = (String)iterator.next();
            ((List) (obj1)).add(new LabsProduct(mMenuManager.getProduct(((String) (obj)))));
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        if (!((List) (obj)).isEmpty())
        {
            Section section = new Section(null);
            section.name = labscategory.getName();
            section.startIndex = productList.size();
            productList.addAll(((java.util.Collection) (obj)));
            section.endIndex = productList.size();
            boolean flag;
            if (section.endIndex - section.startIndex == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            section.single = flag;
            sectionHeaders.add(section);
        }
        return ((List) (obj)).size();
    }

    private void getAllProductsFromCategoryList(LabsCategory labscategory)
    {
        Iterator iterator = labscategory.getCategoryList().iterator();
        int i;
        for (i = 0; iterator.hasNext(); i = getAllProductsFromCategory((LabsCategory)iterator.next()) + i) { }
        if (labscategory.getProducts() != null && !labscategory.getProducts().isEmpty())
        {
            getAllProductsFromCategory(labscategory);
            if (labscategory.getCode().equalsIgnoreCase("Sides"))
            {
                startPositionExtras = i;
            }
        }
    }

    private Section getSection(int i)
    {
        if (sectionHeaders != null && sectionHeaders.size() != 0) goto _L2; else goto _L1
_L1:
        Section section = null;
_L4:
        return section;
_L2:
        Section section1 = (Section)sectionHeaders.get(0);
        int j = 0;
        do
        {
            section = section1;
            if (j >= sectionHeaders.size())
            {
                continue;
            }
            if (i >= ((Section)sectionHeaders.get(j)).startIndex && i < ((Section)sectionHeaders.get(j)).endIndex)
            {
                return (Section)sectionHeaders.get(j);
            }
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int getCount()
    {
        if (productType == null || productType == ProductType.UNKNOWN)
        {
            return 0;
        } else
        {
            return productList.size();
        }
    }

    public LabsProduct getItem(int i)
    {
        if (productType == null || productType == ProductType.UNKNOWN)
        {
            return null;
        } else
        {
            return (LabsProduct)productList.get(i);
        }
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getStartPositionExtras()
    {
        return startPositionExtras;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = (LabsProductView)view;
        view = viewgroup;
        if (viewgroup == null)
        {
            view = LabsProductView_.build(context);
        }
        view.bind(getItem(i));
        viewgroup = getSection(i);
        if (i == ((Section) (viewgroup)).startIndex)
        {
            view.setSectionHeader(((Section) (viewgroup)).name);
            if (((Section) (viewgroup)).single)
            {
                view.setItemBackground(0x7f020139);
                return view;
            } else
            {
                view.setItemBackground(0x7f02013a);
                return view;
            }
        }
        if (i == ((Section) (viewgroup)).endIndex - 1)
        {
            view.hideHeader();
            view.setItemBackground(0x7f020137);
            return view;
        } else
        {
            view.hideHeader();
            view.setItemBackground(0x7f020138);
            return view;
        }
    }

    public void setAmbiguousProductCodes(String s)
    {
        if (StringHelper.isNotEmpty(s))
        {
            ambiguousProductCodes = Arrays.asList(s.split(":"));
        }
    }

    public List setCategories(List list)
    {
        sectionHeaders = new ArrayList();
        productList = new ArrayList();
        categories = list;
        list = list.iterator();
        do
        {
            if (list.hasNext())
            {
                LabsCategory labscategory = (LabsCategory)list.next();
                if (labscategory.getCode().equalsIgnoreCase("Pizza") || labscategory.getParentCode().equalsIgnoreCase("Pizza"))
                {
                    productType = ProductType.PIZZA;
                } else
                if (labscategory.getCode().equalsIgnoreCase("Sandwich") || labscategory.getParentCode().equalsIgnoreCase("Sandwich"))
                {
                    productType = ProductType.SANDWICH;
                } else
                if (labscategory.getCode().equalsIgnoreCase("Pasta"))
                {
                    productType = ProductType.PASTA;
                } else
                if (labscategory.getCode().equalsIgnoreCase("Drinks"))
                {
                    productType = ProductType.DRINK;
                } else
                if (labscategory.getCode().equalsIgnoreCase("Dessert"))
                {
                    productType = ProductType.DESSERT;
                } else
                if (labscategory.getCode().equalsIgnoreCase("Sides"))
                {
                    productType = ProductType.SIDE;
                } else
                if (labscategory.getCode().equalsIgnoreCase("Wings"))
                {
                    productType = ProductType.WING;
                } else
                if (labscategory.getCode().equalsIgnoreCase("Bread"))
                {
                    productType = ProductType.BREAD;
                } else
                if (labscategory.getCode().equalsIgnoreCase("GSalad"))
                {
                    productType = ProductType.SALAD;
                } else
                if (labscategory.getCode().equalsIgnoreCase("Chips"))
                {
                    productType = ProductType.CHIPS;
                } else
                {
                    productType = ProductType.UNKNOWN;
                }
                switch (_cls1..SwitchMap.com.dominos.adapters.LabsProductListAdapter.ProductType[productType.ordinal()])
                {
                case 1: // '\001'
                case 2: // '\002'
                case 3: // '\003'
                    getAllProductsFromCategoryList(labscategory);
                    break;

                case 4: // '\004'
                case 5: // '\005'
                case 6: // '\006'
                case 7: // '\007'
                case 8: // '\b'
                case 9: // '\t'
                case 10: // '\n'
                    getAllProductsFromCategory(labscategory);
                    break;
                }
            } else
            {
                return productList;
            }
        } while (true);
    }

    void setupInflater()
    {
        inflater = (LayoutInflater)context.getSystemService("layout_inflater");
        mMenuManager = (MenuManager)mMobileSession.getManager("menu_manager");
        productWizardManager = (ProductWizardManager)mMobileSession.getManager("product_wizard_manager");
    }

    private class Section
    {

        int endIndex;
        String name;
        boolean single;
        int startIndex;

        private Section()
        {
        }

        Section(_cls1 _pcls1)
        {
            this();
        }
    }


    private class ProductType extends Enum
    {

        private static final ProductType $VALUES[];
        public static final ProductType BREAD;
        public static final ProductType CHIPS;
        public static final ProductType DESSERT;
        public static final ProductType DRINK;
        public static final ProductType PASTA;
        public static final ProductType PIZZA;
        public static final ProductType SALAD;
        public static final ProductType SANDWICH;
        public static final ProductType SIDE;
        public static final ProductType UNKNOWN;
        public static final ProductType WING;

        public static ProductType valueOf(String s)
        {
            return (ProductType)Enum.valueOf(com/dominos/adapters/LabsProductListAdapter$ProductType, s);
        }

        public static ProductType[] values()
        {
            return (ProductType[])$VALUES.clone();
        }

        static 
        {
            PIZZA = new ProductType("PIZZA", 0);
            SANDWICH = new ProductType("SANDWICH", 1);
            PASTA = new ProductType("PASTA", 2);
            BREAD = new ProductType("BREAD", 3);
            SALAD = new ProductType("SALAD", 4);
            CHIPS = new ProductType("CHIPS", 5);
            DRINK = new ProductType("DRINK", 6);
            DESSERT = new ProductType("DESSERT", 7);
            SIDE = new ProductType("SIDE", 8);
            WING = new ProductType("WING", 9);
            UNKNOWN = new ProductType("UNKNOWN", 10);
            $VALUES = (new ProductType[] {
                PIZZA, SANDWICH, PASTA, BREAD, SALAD, CHIPS, DRINK, DESSERT, SIDE, WING, 
                UNKNOWN
            });
        }

        private ProductType(String s, int i)
        {
            super(s, i);
        }
    }


    private class _cls1
    {

        static final int $SwitchMap$com$dominos$adapters$LabsProductListAdapter$ProductType[];

        static 
        {
            $SwitchMap$com$dominos$adapters$LabsProductListAdapter$ProductType = new int[ProductType.values().length];
            try
            {
                $SwitchMap$com$dominos$adapters$LabsProductListAdapter$ProductType[ProductType.PIZZA.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror9) { }
            try
            {
                $SwitchMap$com$dominos$adapters$LabsProductListAdapter$ProductType[ProductType.SANDWICH.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                $SwitchMap$com$dominos$adapters$LabsProductListAdapter$ProductType[ProductType.SIDE.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                $SwitchMap$com$dominos$adapters$LabsProductListAdapter$ProductType[ProductType.PASTA.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$dominos$adapters$LabsProductListAdapter$ProductType[ProductType.DRINK.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$dominos$adapters$LabsProductListAdapter$ProductType[ProductType.WING.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$dominos$adapters$LabsProductListAdapter$ProductType[ProductType.DESSERT.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$dominos$adapters$LabsProductListAdapter$ProductType[ProductType.BREAD.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$dominos$adapters$LabsProductListAdapter$ProductType[ProductType.SALAD.ordinal()] = 9;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$dominos$adapters$LabsProductListAdapter$ProductType[ProductType.CHIPS.ordinal()] = 10;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
