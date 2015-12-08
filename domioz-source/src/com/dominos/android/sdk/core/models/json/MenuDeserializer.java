// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.json;

import com.dominos.android.sdk.core.models.FoodMenu;
import com.dominos.android.sdk.core.models.LabsCategory;
import com.dominos.android.sdk.core.models.LabsFlavor;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.android.sdk.core.models.LabsSide;
import com.dominos.android.sdk.core.models.LabsSize;
import com.dominos.android.sdk.core.models.LabsTopping;
import com.dominos.android.sdk.core.models.LabsVariant;
import com.dominos.android.sdk.core.models.coupon.Coupon;
import com.google.b.k;
import com.google.b.r;
import com.google.b.t;
import com.google.b.u;
import com.google.b.v;
import com.google.b.w;
import com.google.b.y;
import com.google.b.z;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.dominos.android.sdk.core.models.json:
//            CouponDaysDeserializer

public class MenuDeserializer
    implements v
{

    public MenuDeserializer()
    {
    }

    private List createSubCategoryList(String s, t t1)
    {
        ArrayList arraylist = new ArrayList();
        int i = 0;
        while (i < t1.a()) 
        {
            LabsCategory labscategory = new LabsCategory();
            Object obj = t1.a(i).h();
            labscategory.setCode(((z) (obj)).b("Code").c());
            labscategory.setParentCode(s);
            labscategory.setDescription(((z) (obj)).b("Description").c());
            labscategory.setName(((z) (obj)).b("Name").c());
            labscategory.setCategoryList(createSubCategoryList(labscategory.getCode(), ((z) (obj)).c("Categories")));
            ArrayList arraylist1 = new ArrayList();
            obj = ((z) (obj)).c("Products");
            for (int j = 0; j < ((t) (obj)).a(); j++)
            {
                arraylist1.add(((t) (obj)).a(j).c());
            }

            labscategory.setProducts(arraylist1);
            if (labscategory.getCode().equalsIgnoreCase("BuildYourOwn"))
            {
                arraylist.add(0, labscategory);
            } else
            {
                arraylist.add(labscategory);
            }
            i++;
        }
        return arraylist;
    }

    public FoodMenu deserialize(w w1, Type type, u u)
    {
        u = (z)w1;
        w1 = u.d("Misc");
        type = new FoodMenu();
        type.setStatus(w1.b("Status").f());
        type.setStoreID(w1.b("StoreID").c());
        type.setBusinessDate(w1.b("BusinessDate").c());
        type.setStoreAsOfTime(w1.b("StoreAsOfTime").c());
        type.setLanguageCode(w1.b("LanguageCode").c());
        type.setVersion(w1.b("Version").c());
        type.setExpiresOn(w1.b("ExpiresOn").c());
        Object obj = new HashMap();
        Object obj1 = u.d("Categorization");
        Object obj8 = ((z) (obj1)).d("Food");
        Object obj2 = new LabsCategory();
        ((LabsCategory) (obj2)).setCode(((z) (obj8)).b("Code").c());
        ((LabsCategory) (obj2)).setDescription(((z) (obj8)).b("Description").c());
        ((LabsCategory) (obj2)).setName(((z) (obj8)).b("Name").c());
        List list = createSubCategoryList(((LabsCategory) (obj2)).getCode(), ((z) (obj8)).c("Categories"));
        w1 = new ArrayList();
        obj8 = ((z) (obj8)).c("Products");
        for (int i = 0; i < ((t) (obj8)).a(); i++)
        {
            w1.add(((t) (obj8)).a(i).c());
        }

        ((LabsCategory) (obj2)).setProducts(w1);
        w1 = null;
        obj8 = new ArrayList();
        int j = 0;
        while (j < list.size()) 
        {
            if (((LabsCategory)list.get(j)).getCode().equalsIgnoreCase("Wings") || ((LabsCategory)list.get(j)).getCode().equalsIgnoreCase("Bread") || ((LabsCategory)list.get(j)).getCode().equalsIgnoreCase("GSalad") || ((LabsCategory)list.get(j)).getCode().equalsIgnoreCase("Chips"))
            {
                ((List) (obj8)).add(list.remove(j));
                j--;
            } else
            if (((LabsCategory)list.get(j)).getCode().equalsIgnoreCase("Sides"))
            {
                w1 = (LabsCategory)list.remove(j);
                j--;
            }
            j++;
        }
        if (w1 != null)
        {
            List list1 = w1.getCategoryList();
            list1.addAll(((java.util.Collection) (obj8)));
            w1.setCategoryList(list1);
            list.add(w1);
        }
        ((LabsCategory) (obj2)).setCategoryList(list);
        ((Map) (obj)).put(((LabsCategory) (obj2)).getCode(), obj2);
        obj2 = ((z) (obj1)).d("Coupons");
        w1 = new LabsCategory();
        w1.setCode(((z) (obj2)).b("Code").c());
        w1.setDescription(((z) (obj2)).b("Description").c());
        w1.setName(((z) (obj2)).b("Name").c());
        w1.setCategoryList(createSubCategoryList(w1.getCode(), ((z) (obj2)).c("Categories")));
        obj1 = new ArrayList();
        obj2 = ((z) (obj2)).c("Products");
        for (int l = 0; l < ((t) (obj2)).a(); l++)
        {
            ((List) (obj1)).add(((t) (obj2)).a(l).c());
        }

        w1.setProducts(((List) (obj1)));
        ((Map) (obj)).put(w1.getCode(), w1);
        type.setCategoryMap(((Map) (obj)));
        obj = u.d("Coupons");
        w1 = new HashMap();
        java.util.Map.Entry entry1;
        Object obj3;
        for (obj = ((z) (obj)).a().iterator(); ((Iterator) (obj)).hasNext(); w1.put(entry1.getKey(), obj3))
        {
            entry1 = (java.util.Map.Entry)((Iterator) (obj)).next();
            obj3 = (z)entry1.getValue();
            obj3 = (Coupon)(new r()).a([Lcom/dominos/android/sdk/core/models/coupon/Day;, new CouponDaysDeserializer()).f().a(((z) (obj3)).toString(), com/dominos/android/sdk/core/models/coupon/Coupon);
        }

        type.setCouponMap(w1);
        obj = u.d("Flavors");
        w1 = new HashMap();
        java.util.Map.Entry entry2;
        HashMap hashmap;
        for (obj = ((z) (obj)).a().iterator(); ((Iterator) (obj)).hasNext(); w1.put(entry2.getKey(), hashmap))
        {
            entry2 = (java.util.Map.Entry)((Iterator) (obj)).next();
            hashmap = new HashMap();
            java.util.Map.Entry entry7;
            LabsFlavor labsflavor;
            for (Iterator iterator = ((z)entry2.getValue()).a().iterator(); iterator.hasNext(); hashmap.put(entry7.getKey(), labsflavor))
            {
                entry7 = (java.util.Map.Entry)iterator.next();
                z z2 = (z)entry7.getValue();
                labsflavor = new LabsFlavor();
                labsflavor.setCode(z2.b("Code").c());
                labsflavor.setDescription(z2.b("Description").c());
                labsflavor.setName(z2.b("Name").c());
                labsflavor.setSortSeq(z2.b("SortSeq").c());
            }

        }

        type.setFlavorMap(w1);
        obj = u.d("Products");
        w1 = new HashMap();
        java.util.Map.Entry entry3;
        LabsProduct labsproduct;
        for (obj = ((z) (obj)).a().iterator(); ((Iterator) (obj)).hasNext(); w1.put(entry3.getKey(), labsproduct))
        {
            entry3 = (java.util.Map.Entry)((Iterator) (obj)).next();
            Object obj4 = (z)entry3.getValue();
            labsproduct = new LabsProduct();
            labsproduct.setAvailableToppings(((z) (obj4)).b("AvailableToppings").c());
            labsproduct.setAvailableSides(((z) (obj4)).b("AvailableSides").c());
            labsproduct.setCode(((z) (obj4)).b("Code").c());
            labsproduct.setDefaultToppings(((z) (obj4)).b("DefaultToppings").c());
            labsproduct.setDefaultSides(((z) (obj4)).b("DefaultSides").c());
            labsproduct.setDescription(((z) (obj4)).b("Description").c());
            labsproduct.setImageCode(((z) (obj4)).b("ImageCode").c());
            labsproduct.setName(((z) (obj4)).b("Name").c());
            labsproduct.setProductType(((z) (obj4)).b("ProductType").c());
            Object obj9 = ((z) (obj4)).d("Tags");
            if (((z) (obj9)).a("OptionQtys"))
            {
                t t1 = ((z) (obj9)).c("OptionQtys");
                ArrayList arraylist = new ArrayList();
                for (int i1 = 0; i1 < t1.a(); i1++)
                {
                    arraylist.add(t1.a(i1).c());
                }

                labsproduct.setOptionQtys(arraylist);
            }
            if (((z) (obj9)).a("MaxOptionQty"))
            {
                labsproduct.setMaxOptionQty(((z) (obj9)).b("MaxOptionQty").f());
            } else
            {
                labsproduct.setMaxOptionQty(-1);
            }
            if (((z) (obj9)).a("MaxSauceQty"))
            {
                labsproduct.setMaxSauceQty(((z) (obj9)).b("MaxSauceQty").f());
            } else
            {
                labsproduct.setMaxSauceQty(1);
            }
            if (((z) (obj9)).a("Artisan"))
            {
                labsproduct.setArtisan(((z) (obj9)).b("Artisan").g());
            }
            if (((z) (obj9)).a("BazaarVoice"))
            {
                labsproduct.setBazaarVoice(((z) (obj9)).b("BazaarVoice").g());
            }
            if (((z) (obj9)).a("PartCount"))
            {
                labsproduct.setPartCount(((z) (obj9)).b("PartCount").f());
            } else
            {
                labsproduct.setPartCount(1);
            }
            if (((z) (obj9)).a("NeedsCustomization"))
            {
                labsproduct.setNeedsCustomization(((z) (obj9)).b("NeedsCustomization").g());
            }
            if (((z) (obj9)).a("Wings"))
            {
                labsproduct.setWings(((z) (obj9)).b("Wings").g());
            }
            if (((z) (obj9)).a("EffectiveOn"))
            {
                labsproduct.setEffectiveOn(((z) (obj9)).b("EffectiveOn").c());
            }
            if (((z) (obj9)).a("BvCode"))
            {
                labsproduct.setBvCode(((z) (obj9)).b("BvCode").c());
            }
            if (((z) (obj9)).a("Boneless"))
            {
                labsproduct.setBoneless(((z) (obj9)).b("Boneless").g());
            }
            obj4 = ((z) (obj4)).c("Variants");
            obj9 = new ArrayList();
            for (int j1 = 0; j1 < ((t) (obj4)).a(); j1++)
            {
                ((List) (obj9)).add(((t) (obj4)).a(j1).c());
            }

            labsproduct.setVariants(((List) (obj9)));
        }

        type.setProductMap(w1);
        obj = u.d("Sides");
        w1 = new HashMap();
        java.util.Map.Entry entry4;
        HashMap hashmap1;
        for (obj = ((z) (obj)).a().iterator(); ((Iterator) (obj)).hasNext(); w1.put(entry4.getKey(), hashmap1))
        {
            entry4 = (java.util.Map.Entry)((Iterator) (obj)).next();
            Object obj5 = (z)entry4.getValue();
            hashmap1 = new HashMap();
            java.util.Map.Entry entry8;
            LabsSide labsside;
            for (obj5 = ((z) (obj5)).a().iterator(); ((Iterator) (obj5)).hasNext(); hashmap1.put(entry8.getKey(), labsside))
            {
                entry8 = (java.util.Map.Entry)((Iterator) (obj5)).next();
                z z4 = (z)entry8.getValue();
                labsside = new LabsSide();
                t t2 = z4.c("Availability");
                ArrayList arraylist1 = new ArrayList();
                for (int k1 = 0; k1 < t2.a(); k1++)
                {
                    arraylist1.add(t2.a(k1).c());
                }

                labsside.setAvailability(arraylist1);
                labsside.setCode(z4.b("Code").c());
                labsside.setDescription(z4.b("Description").c());
                labsside.setName(z4.b("Name").c());
                z4 = z4.d("Tags");
                if (z4.a("Side"))
                {
                    labsside.setSide(z4.b("Side").g());
                }
                if (z4.a("EffectiveOn"))
                {
                    labsside.setEffectiveOn(z4.b("EffectiveOn").c());
                }
            }

        }

        type.setSidesMap(w1);
        obj = u.d("Sizes");
        w1 = new HashMap();
        java.util.Map.Entry entry5;
        HashMap hashmap2;
        for (obj = ((z) (obj)).a().iterator(); ((Iterator) (obj)).hasNext(); w1.put(entry5.getKey(), hashmap2))
        {
            entry5 = (java.util.Map.Entry)((Iterator) (obj)).next();
            Object obj6 = (z)entry5.getValue();
            hashmap2 = new HashMap();
            java.util.Map.Entry entry9;
            LabsSize labssize;
            for (obj6 = ((z) (obj6)).a().iterator(); ((Iterator) (obj6)).hasNext(); hashmap2.put(entry9.getKey(), labssize))
            {
                entry9 = (java.util.Map.Entry)((Iterator) (obj6)).next();
                z z3 = (z)entry9.getValue();
                labssize = new LabsSize();
                labssize.setCode(z3.b("Code").c());
                labssize.setDescription(z3.b("Description").c());
                labssize.setName(z3.b("Name").c());
                labssize.setSortSeq(z3.b("SortSeq").c());
            }

        }

        type.setSizesMap(w1);
        obj = u.d("Toppings");
        w1 = new HashMap();
        java.util.Map.Entry entry6;
        HashMap hashmap3;
        for (obj = ((z) (obj)).a().iterator(); ((Iterator) (obj)).hasNext(); w1.put(entry6.getKey(), hashmap3))
        {
            entry6 = (java.util.Map.Entry)((Iterator) (obj)).next();
            Object obj7 = (z)entry6.getValue();
            hashmap3 = new HashMap();
            java.util.Map.Entry entry10;
            LabsTopping labstopping;
            for (obj7 = ((z) (obj7)).a().iterator(); ((Iterator) (obj7)).hasNext(); hashmap3.put(entry10.getKey(), labstopping))
            {
                entry10 = (java.util.Map.Entry)((Iterator) (obj7)).next();
                z z5 = (z)entry10.getValue();
                labstopping = new LabsTopping();
                t t3 = z5.c("Availability");
                ArrayList arraylist2 = new ArrayList();
                for (int l1 = 0; l1 < t3.a(); l1++)
                {
                    arraylist2.add(t3.a(l1).c());
                }

                labstopping.setAvailability(arraylist2);
                labstopping.setCode(z5.b("Code").c());
                labstopping.setDescription(z5.b("Description").c());
                labstopping.setName(z5.b("Name").c());
                z5 = z5.d("Tags");
                if (z5.a("WholeOnly"))
                {
                    labstopping.setWholeOnly(z5.b("WholeOnly").g());
                }
                if (z5.a("IgnoreQty"))
                {
                    labstopping.setIgnoreQty(z5.b("IgnoreQty").g());
                }
                if (z5.a("Sauce"))
                {
                    labstopping.setSauce(z5.b("Sauce").g());
                }
                if (z5.a("NonMeat"))
                {
                    labstopping.setNonMeat(z5.b("NonMeat").g());
                }
                if (z5.a("Cheese"))
                {
                    labstopping.setCheese(z5.b("Cheese").g());
                }
                if (z5.a("Vege"))
                {
                    labstopping.setVege(z5.b("Vege").g());
                }
                if (z5.a("Meat"))
                {
                    labstopping.setMeat(z5.b("Meat").g());
                }
                if (z5.a("ExclusiveGroup"))
                {
                    labstopping.setExclusiveGroup(z5.b("ExclusiveGroup").c());
                }
                if (z5.a("Steak Hoagie Patty"))
                {
                    labstopping.setSteakHoagiePatty(z5.b("Steak Hoagie Patty").g());
                }
            }

        }

        type.setToppingMap(w1);
        u = u.d("Variants");
        w1 = new HashMap();
        java.util.Map.Entry entry;
        LabsVariant labsvariant;
        for (u = u.a().iterator(); u.hasNext(); w1.put(entry.getKey(), labsvariant))
        {
            entry = (java.util.Map.Entry)u.next();
            z z1 = (z)entry.getValue();
            labsvariant = new LabsVariant();
            labsvariant.setCode(z1.b("Code").c());
            labsvariant.setFlavorCode(z1.b("FlavorCode").c());
            labsvariant.setImageCode(z1.b("ImageCode").c());
            labsvariant.setName(z1.b("Name").c());
            labsvariant.setPrice(z1.b("Price").c());
            labsvariant.setProductCode(z1.b("ProductCode").c());
            labsvariant.setSizeCode(z1.b("SizeCode").c());
            z1 = z1.d("Tags");
            if (z1.a("DefaultSides") && !(z1.b("DefaultSides") instanceof y))
            {
                labsvariant.setDefaultSides(z1.b("DefaultSides").c());
            }
            if (z1.a("DefaultToppings") && !(z1.b("DefaultToppings") instanceof y))
            {
                labsvariant.setDefaultToppings(z1.b("DefaultToppings").c());
            }
            if (z1.a("BreadType"))
            {
                labsvariant.setBreadType(z1.b("BreadType").c());
            }
            if (z1.a("Promotion"))
            {
                labsvariant.setPromotion(z1.b("Promotion").c());
            }
            if (z1.a("MaxOptionQty"))
            {
                labsvariant.setMaxOptionQty(z1.b("MaxOptionQty").c());
            }
            if (z1.a("Feast"))
            {
                labsvariant.setFeast(z1.b("Feast").g());
            }
            if (z1.a("NoCustomization"))
            {
                labsvariant.setNoCustomization(z1.b("NoCustomization").g());
            }
            if (z1.a("Dessert"))
            {
                labsvariant.setDessert(z1.b("Dessert").g());
            }
            if (z1.a("Legend"))
            {
                labsvariant.setLegend(z1.b("Legend").g());
            }
            if (z1.a("Hoagies"))
            {
                labsvariant.setHoagies(z1.b("Hoagies").g());
            }
            if (z1.a("MaxSauceQty"))
            {
                labsvariant.setMaxSauceQty(z1.b("MaxSauceQty").c());
            }
            if (z1.a("BONELESS"))
            {
                labsvariant.setBONELESS(z1.b("BONELESS").g());
            }
            if (z1.a("BONEIN"))
            {
                labsvariant.setBONEIN(z1.b("BONEIN").g());
            }
            if (z1.a("EffectiveOn"))
            {
                labsvariant.setEffectiveOn(z1.b("EffectiveOn").c());
            }
        }

        type.setVariantsMap(w1);
        return type;
    }

    public volatile Object deserialize(w w1, Type type, u u)
    {
        return deserialize(w1, type, u);
    }
}
