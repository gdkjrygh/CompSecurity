// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.json;

import com.dominos.android.sdk.common.NumberUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.LabsFlavor;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.LabsSize;
import com.dominos.android.sdk.core.models.LabsTopping;
import com.dominos.android.sdk.core.models.LabsVariant;
import com.google.b.ac;
import com.google.b.t;
import com.google.b.u;
import com.google.b.v;
import com.google.b.w;
import com.google.b.z;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ProductLineDeserializer
    implements v
{

    public ProductLineDeserializer()
    {
    }

    private List parseToppings(z z1)
    {
        ArrayList arraylist1;
        Iterator iterator;
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(z1.a());
        arraylist1 = new ArrayList();
        iterator = arraylist.iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        double d;
        Object obj;
        String s;
        LabsTopping labstopping;
        obj = (java.util.Map.Entry)iterator.next();
        s = (String)((java.util.Map.Entry) (obj)).getKey();
        d = 0.0D;
        z1 = "0";
        labstopping = new LabsTopping();
        if (!((w)((java.util.Map.Entry) (obj)).getValue() instanceof ac)) goto _L4; else goto _L3
_L3:
        labstopping.setQuantityForPart("1/1", NumberUtil.convertJsonToDouble((w)((java.util.Map.Entry) (obj)).getValue()));
_L7:
        labstopping.setCode(s);
        arraylist1.add(labstopping);
          goto _L5
_L4:
        if (!((w)((java.util.Map.Entry) (obj)).getValue() instanceof z)) goto _L7; else goto _L6
_L6:
        z z2;
        Iterator iterator1;
        z2 = ((w)((java.util.Map.Entry) (obj)).getValue()).h();
        iterator1 = z2.a().iterator();
_L11:
        if (!iterator1.hasNext()) goto _L7; else goto _L8
_L8:
        java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
        if (!((w)entry.getValue() instanceof ac) || z2.b("1/1") == null) goto _L10; else goto _L9
_L9:
        d = NumberUtil.convertJsonToDouble(z2.b("1/1"));
        z1 = "1/1";
_L14:
        double d1;
        labstopping.setQuantityForPart(z1, d);
        obj = z1;
        d1 = d;
_L13:
        z1 = ((z) (obj));
        d = d1;
          goto _L11
_L10:
        if (StringHelper.equals((String)entry.getKey(), "1/2"))
        {
            z1 = "1/2";
            d = NumberUtil.convertJsonToDouble(z2.b("1/2"));
            if (z2.b("2/2") == null)
            {
                labstopping.setQuantityForPart("2/2", -1D);
            }
            labstopping.setQuantityForPart("1/2", d);
        }
        d1 = d;
        obj = z1;
        if (!StringHelper.equals((String)entry.getKey(), "2/2")) goto _L13; else goto _L12
_L12:
        if (z2.b("1/2") == null)
        {
            if (z2.b("1/2") == null)
            {
                labstopping.setQuantityForPart("1/2", -1D);
            }
            z1 = "2/2";
            d = NumberUtil.convertJsonToDouble(z2.b("2/2"));
        } else
        if (NumberUtil.convertJsonToDouble(z2.b("1/2")) == 0.0D || StringHelper.equals(s, "C"))
        {
            z1 = "2/2";
            d = NumberUtil.convertJsonToDouble(z2.b("2/2"));
        }
          goto _L14
_L2:
        return arraylist1;
          goto _L11
    }

    public LabsProductLine deserialize(w w1, Type type, u u)
    {
        boolean flag = false;
        type = new LabsProductLine();
        w1 = (z)w1;
        if (w1.a("ID"))
        {
            type.setId(w1.b("ID").f());
        }
        if (w1.a("Price"))
        {
            type.setPrice(w1.b("Price").d());
        }
        if (w1.a("Qty"))
        {
            type.setQuantity(w1.b("Qty").f());
        }
        if (w1.a("SizeCode") && (w1.b("SizeCode") instanceof ac))
        {
            u = new LabsSize();
            u.setCode(w1.b("SizeCode").c());
            type.setSize(u);
        }
        if (w1.a("FlavorCode") && (w1.b("FlavorCode") instanceof ac))
        {
            u = new LabsFlavor();
            u.setCode(w1.b("FlavorCode").c());
            type.setFlavor(u);
        }
        if (w1.a("Options"))
        {
            u = parseToppings(w1.d("Options"));
            if (u != null && !u.isEmpty())
            {
                type.setToppingsList(u);
            }
        }
        if (w1.a("Status"))
        {
            type.setStatus(w1.b("Status").f());
        }
        if (w1.a("StatusItems"))
        {
            u = new ArrayList();
            t t1 = w1.c("StatusItems");
            for (int i = 0; i < t1.a(); i++)
            {
                HashMap hashmap1 = new HashMap();
                Iterator iterator = t1.a(i).h().a().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                    if ((w)entry.getValue() instanceof ac)
                    {
                        hashmap1.put(entry.getKey(), ((w)entry.getValue()).c());
                    }
                } while (true);
                u.add(hashmap1);
            }

            type.setStatusItemList(u);
        }
        if (w1.a("NeedsCustomization"))
        {
            type.setNeedsCustomization(w1.b("NeedsCustomization").g());
        }
        if (w1.a("AutoRemove"))
        {
            type.setAutoRemove(w1.b("AutoRemove").g());
        }
        u = new LabsVariant();
        u.setCode(w1.b("Code").c());
        type.setVariant(u);
        u = new LabsProduct();
        if (w1.a("name"))
        {
            u.setName(w1.b("name").c());
        }
        if (w1.a("Name"))
        {
            u.setName(w1.b("Name").c());
        }
        if (w1.a("Code"))
        {
            u.setCode(w1.b("Code").c());
        }
        if (w1.a("CategoryCode") && (w1.b("CategoryCode") instanceof ac))
        {
            u.setProductType(w1.b("CategoryCode").c());
        }
        if (w1.a("descriptions"))
        {
            HashMap hashmap = new HashMap();
            StringBuilder stringbuilder = new StringBuilder();
            t t2 = w1.c("descriptions");
            int j = ((flag) ? 1 : 0);
            while (j < t2.a()) 
            {
                Object obj = t2.a(j).h();
                String s = ((z) (obj)).b("portionCode").c();
                StringBuilder stringbuilder1 = new StringBuilder();
                if (j > 0)
                {
                    w1 = ", ";
                } else
                {
                    w1 = "";
                }
                stringbuilder1 = stringbuilder1.append(w1);
                if (s.equals("1/2"))
                {
                    w1 = "Left: ";
                } else
                if (s.equals("2/2"))
                {
                    w1 = "Right: ";
                } else
                if (s.equals("1/1"))
                {
                    w1 = "Whole: ";
                } else
                {
                    w1 = "";
                }
                w1 = stringbuilder1.append(w1).toString();
                obj = ((z) (obj)).b("value").c();
                stringbuilder.append((new StringBuilder()).append(w1).append(((String) (obj))).toString());
                hashmap.put(s, obj);
                j++;
            }
            type.setDescriptionMap(hashmap);
            u.setDescription(stringbuilder.toString());
        }
        type.setProduct(u);
        return type;
    }

    public volatile Object deserialize(w w1, Type type, u u)
    {
        return deserialize(w1, type, u);
    }
}
