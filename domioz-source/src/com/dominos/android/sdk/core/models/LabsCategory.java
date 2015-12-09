// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.dominos.android.sdk.core.models:
//            LabsProduct, LabsVariant

public class LabsCategory
    implements Parcelable
{

    public static final String BREAD = "Bread";
    public static final String CHIPS = "Chips";
    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final String DESSERT = "Dessert";
    public static final String DRINKS = "Drinks";
    public static final String PASTA = "Pasta";
    public static final String PIZZA = "Pizza";
    public static final String SALAD = "GSalad";
    public static final String SANDWICH = "Sandwich";
    public static final String SIDES = "Sides";
    public static final String WINGS = "Wings";
    private List Categories;
    private String Code;
    private String Description;
    private String Name;
    private List Products;
    private List couponTargetProducts;
    private String parentCode;

    public LabsCategory()
    {
        Code = "";
        Description = "";
        Name = "";
        parentCode = "";
        Categories = new ArrayList();
        Products = new ArrayList();
        couponTargetProducts = new ArrayList();
    }

    private LabsCategory(Parcel parcel)
    {
        Code = "";
        Description = "";
        Name = "";
        parentCode = "";
        parcel = parcel.readBundle(com/dominos/android/sdk/core/models/LabsCategory.getClassLoader());
        Categories = parcel.getParcelableArrayList("categories");
        Products = parcel.getStringArrayList("products");
        Code = parcel.getString("code");
        Name = parcel.getString("name");
        parentCode = parcel.getString("parent_code");
        parcel.setClassLoader(com/dominos/android/sdk/core/models/LabsProduct.getClassLoader());
        couponTargetProducts = parcel.getParcelableArrayList("coupon_target_products");
    }

    LabsCategory(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    private List getAllProducts(LabsCategory labscategory)
    {
        ArrayList arraylist = new ArrayList();
        if (labscategory.getProducts() != null)
        {
            arraylist.addAll(labscategory.getProducts());
        }
        if (labscategory.getCategoryList() != null)
        {
            for (labscategory = labscategory.getCategoryList().iterator(); labscategory.hasNext(); arraylist.addAll(getAllProducts((LabsCategory)labscategory.next()))) { }
        }
        return arraylist;
    }

    public static LabsCategory getInstance(LabsCategory labscategory)
    {
        LabsCategory labscategory1 = new LabsCategory();
        labscategory1.Categories = new ArrayList();
        LabsCategory labscategory2;
        for (Iterator iterator = labscategory.Categories.iterator(); iterator.hasNext(); labscategory1.Categories.add(getInstance(labscategory2)))
        {
            labscategory2 = (LabsCategory)iterator.next();
        }

        labscategory1.Code = labscategory.Code;
        labscategory1.Description = labscategory.Description;
        labscategory1.Products = new ArrayList(labscategory.Products);
        labscategory1.Name = labscategory.Name;
        labscategory1.parentCode = labscategory.parentCode;
        labscategory1.couponTargetProducts = new ArrayList(labscategory.couponTargetProducts);
        return labscategory1;
    }

    private void removeEmptyLeaves()
    {
        Iterator iterator = getCategoryList().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            LabsCategory labscategory = (LabsCategory)iterator.next();
            if (labscategory.getCategoryList().size() == 0)
            {
                if (labscategory.getCouponTargetProducts().size() == 0)
                {
                    iterator.remove();
                }
            } else
            {
                labscategory.removeEmptyLeaves();
            }
        } while (true);
    }

    private String singleProductCategorySearch(LabsCategory labscategory)
    {
        if (labscategory.getCategoryList().size() <= 1 && labscategory.getProducts().size() == 1)
        {
            return (String)labscategory.getProducts().get(0);
        }
        if (labscategory.getCategoryList().size() == 0)
        {
            return null;
        }
        for (labscategory = labscategory.getCategoryList().iterator(); labscategory.hasNext();)
        {
            String s = singleProductCategorySearch((LabsCategory)labscategory.next());
            if (s != null)
            {
                return s;
            }
        }

        return null;
    }

    public void addCouponTargetProduct(LabsProduct labsproduct)
    {
        couponTargetProducts.add(labsproduct);
    }

    public void addProduct(LabsVariant labsvariant)
    {
        Products.add(labsvariant.getCode());
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || !(obj instanceof LabsCategory))
            {
                return false;
            }
            obj = (LabsCategory)obj;
            if (!Code.equals(((LabsCategory) (obj)).Code))
            {
                return false;
            }
        }
        return true;
    }

    public List getAllProducts()
    {
        return getAllProducts(this);
    }

    public LabsCategory getCategory(String s)
    {
        for (Iterator iterator = Categories.iterator(); iterator.hasNext();)
        {
            LabsCategory labscategory = (LabsCategory)iterator.next();
            if (labscategory.getCode().equalsIgnoreCase(s))
            {
                return labscategory;
            }
        }

        return null;
    }

    public List getCategoryList()
    {
        return Categories;
    }

    public String getCode()
    {
        return Code;
    }

    public List getCouponTargetProducts()
    {
        return couponTargetProducts;
    }

    public String getDescription()
    {
        return Description;
    }

    public String getName()
    {
        return Name;
    }

    public String getParentCode()
    {
        return parentCode;
    }

    public List getProducts()
    {
        return Products;
    }

    public boolean hasEmptyLeaf()
    {
        Iterator iterator = getCategoryList().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            LabsCategory labscategory = (LabsCategory)iterator.next();
            if (labscategory.getCategoryList().size() == 0)
            {
                if (labscategory.getCouponTargetProducts().size() == 0)
                {
                    return true;
                }
            } else
            {
                labscategory.hasEmptyLeaf();
            }
        } while (true);
        return false;
    }

    public int hashCode()
    {
        return Code.hashCode();
    }

    public void pruneCategory()
    {
        for (; hasEmptyLeaf(); removeEmptyLeaves()) { }
    }

    public void setCategoryList(List list)
    {
        Categories = list;
    }

    public void setCode(String s)
    {
        Code = s;
    }

    public void setDescription(String s)
    {
        Description = s;
    }

    public void setName(String s)
    {
        Name = s;
    }

    public void setParentCode(String s)
    {
        parentCode = s;
    }

    public void setProducts(List list)
    {
        Products = list;
    }

    public String singleProductCategorySearch()
    {
        return singleProductCategorySearch(this);
    }

    public String toString()
    {
        boolean flag2 = true;
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("<<Category = ");
        stringbuilder.append("[Categories = ");
        Iterator iterator = Categories.iterator();
        for (boolean flag = true; iterator.hasNext(); flag = false)
        {
            LabsCategory labscategory = (LabsCategory)iterator.next();
            if (!flag)
            {
                stringbuilder.append(", \n");
            }
            stringbuilder.append(labscategory.toString());
        }

        stringbuilder.append("] ");
        stringbuilder.append((new StringBuilder("[Code = ")).append(Code).append("] ").toString());
        stringbuilder.append((new StringBuilder("[ParentCode = ")).append(parentCode).append("] ").toString());
        stringbuilder.append((new StringBuilder("[Description = ")).append(Description).append("] ").toString());
        stringbuilder.append("[Products = ");
        iterator = Products.iterator();
        for (boolean flag1 = flag2; iterator.hasNext(); flag1 = false)
        {
            String s = (String)iterator.next();
            if (!flag1)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(s);
        }

        stringbuilder.append("] ");
        stringbuilder.append(">>\n");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("categories", (ArrayList)Categories);
        bundle.putStringArrayList("products", (ArrayList)Products);
        bundle.putParcelableArrayList("coupon_target_products", (ArrayList)couponTargetProducts);
        bundle.putString("code", Code);
        bundle.putString("name", Name);
        bundle.putString("parent_code", parentCode);
        parcel.writeBundle(bundle);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final LabsCategory createFromParcel(Parcel parcel)
        {
            return new LabsCategory(parcel, null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final LabsCategory[] newArray(int i)
        {
            return new LabsCategory[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
