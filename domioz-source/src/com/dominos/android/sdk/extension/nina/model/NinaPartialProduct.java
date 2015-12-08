// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.extension.nina.model;

import com.dominos.android.sdk.app.Session;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.extension.nina.DomProductManager;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class NinaPartialProduct
{

    public static String PR_CATEGORY = "PR_CATEGORY";
    public static String PR_FLAVOR = "PR_FLAVOR";
    public static String PR_OPTIONS = "PR_OPTIONS";
    public static String PR_OPTIONS_S1 = "PR_OPTIONS_S1";
    public static String PR_OPTIONS_S2 = "PR_OPTIONS_S2";
    public static String PR_PRODUCTCODE = "PR_PRODUCTCODE";
    public static String PR_SIZE = "PR_SIZE";
    public static String PR_SUBCATEGORY = "PR_SUBCATEGORY";
    public static String PR_VARIANT = "PR_VARIANT";
    private String category;
    private String flavor;
    private boolean lostProductCode;
    private String options;
    private boolean optionsOnCreate;
    private String optionsSide1;
    private String optionsSide2;
    private String product;
    private String quantity;
    private String size;
    private boolean skipFlavorDefault;
    private String subcategory;
    private String toppingsErrorCode;
    private String variant;

    public NinaPartialProduct(Session session, Map map)
    {
        ((DomProductManager)session.getManager("dom_product_manager")).buildFrom(this, map);
    }

    public void clear()
    {
        category = "";
        subcategory = "";
        product = "";
        variant = "";
        size = "";
        flavor = "";
        options = "";
        optionsSide1 = "";
        optionsSide2 = "";
        quantity = "";
        optionsOnCreate = false;
        skipFlavorDefault = false;
        lostProductCode = false;
        toppingsErrorCode = "";
    }

    public void clearWholeAndSideOptions()
    {
        options = null;
        optionsSide1 = null;
        optionsSide2 = null;
    }

    public String getCategory()
    {
        return category;
    }

    public String getFlavor()
    {
        return flavor;
    }

    public String getOptions()
    {
        return options;
    }

    public String getOptionsSide1()
    {
        return optionsSide1;
    }

    public String getOptionsSide2()
    {
        return optionsSide2;
    }

    public String getProduct()
    {
        return product;
    }

    public List getProductAsList()
    {
        if (product == null)
        {
            return null;
        } else
        {
            return Arrays.asList(StringHelper.split(product, ":"));
        }
    }

    public String getQuantity()
    {
        return quantity;
    }

    public String getSize()
    {
        return size;
    }

    public String getSubcategory()
    {
        return subcategory;
    }

    public String getToppingsErrorCode()
    {
        return toppingsErrorCode;
    }

    public String getVariant()
    {
        return variant;
    }

    public List getVariantAsList()
    {
        if (variant == null)
        {
            return null;
        } else
        {
            return Arrays.asList(StringHelper.split(variant, ":"));
        }
    }

    public boolean hasLeftSideOrRightSideOptions()
    {
        return optionsSide1 != null || optionsSide2 != null;
    }

    public boolean hasMultipleProducts()
    {
        return StringHelper.isNotEmpty(product) && product.contains(":");
    }

    public boolean hasOneOrMoreProducts()
    {
        return StringHelper.isNotEmpty(product);
    }

    public boolean hasSingleCategory()
    {
        return StringHelper.isNotEmpty(category) && !category.contains(":");
    }

    public boolean hasSingleProduct()
    {
        return StringHelper.isNotEmpty(product) && !product.contains(":");
    }

    public boolean isBYOHoagie()
    {
        return product != null && category != null && category.equalsIgnoreCase("Sandwich") && product.equals("S_HGBYO");
    }

    public boolean isBYOP()
    {
        return product != null && product.equals("S_PIZZA");
    }

    public boolean isBYOPasta()
    {
        return product != null && category != null && category.equalsIgnoreCase("Pasta") && product.equals("S_BUILD");
    }

    public boolean isBYOSlice()
    {
        return product != null && category != null && category.equalsIgnoreCase("Sandwich") && product.equals("S_BUILD2");
    }

    public boolean isComplete()
    {
        return variant != null && !StringHelper.contains(variant, ":");
    }

    public boolean isLostProductCode()
    {
        return lostProductCode;
    }

    public boolean isOptionsOnCreate()
    {
        return optionsOnCreate;
    }

    public boolean isPizza()
    {
        return category != null && category.equalsIgnoreCase("Pizza");
    }

    public boolean isSkipFlavorDefault()
    {
        return skipFlavorDefault;
    }

    public boolean isTooAmbiguous()
    {
        return StringHelper.isEmpty(variant) && StringHelper.isEmpty(product);
    }

    public boolean optionsOnCreate()
    {
        return optionsOnCreate;
    }

    public void setCategory(String s)
    {
        category = s;
    }

    public void setFlavor(String s)
    {
        flavor = s;
    }

    public void setLostProductCode(boolean flag)
    {
        lostProductCode = flag;
    }

    public void setOptions(String s)
    {
        options = s;
    }

    public void setOptionsOnCreate(boolean flag)
    {
        optionsOnCreate = flag;
    }

    public void setOptionsSide1(String s)
    {
        optionsSide1 = s;
    }

    public void setOptionsSide2(String s)
    {
        optionsSide2 = s;
    }

    public void setProduct(String s)
    {
        product = s;
    }

    public void setQuantity(String s)
    {
        int i = 1;
        int j = Integer.parseInt(s);
        i = j;
_L2:
        quantity = String.valueOf(i);
        return;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void setSize(String s)
    {
        size = s;
    }

    public void setSkipFlavorDefault(boolean flag)
    {
        skipFlavorDefault = flag;
    }

    public void setSubcategory(String s)
    {
        subcategory = s;
    }

    public void setToppingsErrorCode(String s)
    {
        toppingsErrorCode = s;
    }

    public void setVariant(String s)
    {
        variant = s;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("NinaPartialProduct is:");
        stringbuilder.append((new StringBuilder("\ncategory: ")).append(category).toString());
        stringbuilder.append((new StringBuilder("\nsubcategory: ")).append(subcategory).toString());
        stringbuilder.append((new StringBuilder("\nproduct: ")).append(product).toString());
        stringbuilder.append((new StringBuilder("\nvariant: ")).append(variant).toString());
        stringbuilder.append((new StringBuilder("\nsize: ")).append(size).toString());
        stringbuilder.append((new StringBuilder("\nflavor: ")).append(flavor).toString());
        stringbuilder.append((new StringBuilder("\noptions: ")).append(options).toString());
        stringbuilder.append((new StringBuilder("\noptionsSide1: ")).append(optionsSide1).toString());
        stringbuilder.append((new StringBuilder("\noptionsSide2: ")).append(optionsSide2).toString());
        stringbuilder.append((new StringBuilder("\nquantity: ")).append(quantity).toString());
        stringbuilder.append((new StringBuilder("\noptionsOnCreate: ")).append(optionsOnCreate).toString());
        stringbuilder.append((new StringBuilder("\ntooAmbiguous: ")).append(isTooAmbiguous()).toString());
        stringbuilder.append((new StringBuilder("\nmultipleProducts: ")).append(hasMultipleProducts()).toString());
        return stringbuilder.toString();
    }

}
