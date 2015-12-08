// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.json;

import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.LabsSide;
import com.dominos.android.sdk.core.models.LabsTopping;
import com.google.b.ad;
import com.google.b.ae;
import com.google.b.w;
import com.google.b.z;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ProductLineSerializer
    implements ae
{

    public ProductLineSerializer()
    {
    }

    public w serialize(LabsProductLine labsproductline, Type type, ad ad1)
    {
        z z1 = new z();
        if (labsproductline.getId() != 0)
        {
            z1.a("ID", Integer.valueOf(labsproductline.getId()));
        }
        z1.a("Code", labsproductline.getCode());
        z1.a("Qty", Integer.valueOf(labsproductline.getQuantity()));
        z z2 = new z();
        if (labsproductline.getToppingsList() != null)
        {
            boolean flag = false;
            type = "1.0";
            Iterator iterator = labsproductline.getToppingsList().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = (LabsTopping)iterator.next();
                if (labsproductline.isPanPizza() && ((LabsTopping) (obj)).getCode().equalsIgnoreCase("C"))
                {
                    Object obj1 = new LabsTopping();
                    ((LabsTopping) (obj1)).setCode("Cp");
                    ((LabsTopping) (obj1)).setDefaultQuantity(0.5D);
                    double d;
                    if (((LabsTopping) (obj)).isToppingAdded())
                    {
                        d = 1.0D;
                    } else
                    {
                        d = 0.0D;
                    }
                    ((LabsTopping) (obj1)).setQuantityForPart("1/1", d);
                    obj1 = ad1.a(obj1, com/dominos/android/sdk/core/models/LabsTopping);
                    if (obj1 instanceof z)
                    {
                        java.util.Map.Entry entry2;
                        for (obj1 = ((z)obj1).a().iterator(); ((Iterator) (obj1)).hasNext(); z2.a((String)entry2.getKey(), (w)entry2.getValue()))
                        {
                            entry2 = (java.util.Map.Entry)((Iterator) (obj1)).next();
                        }

                    }
                }
                if (labsproductline.isBuildYourOwnPasta() && ((LabsTopping) (obj)).getCode().equalsIgnoreCase("Xf") && ((LabsTopping) (obj)).isToppingAdded())
                {
                    double d1 = ((LabsTopping) (obj)).getQuantityForPart(((LabsTopping) (obj)).getPartWithQuantity());
                    flag = true;
                    type = String.valueOf(d1);
                }
                obj = ad1.a(obj, com/dominos/android/sdk/core/models/LabsTopping);
                if (obj instanceof z)
                {
                    java.util.Map.Entry entry1;
                    for (obj = ((z)obj).a().iterator(); ((Iterator) (obj)).hasNext(); z2.a((String)entry1.getKey(), (w)entry1.getValue()))
                    {
                        entry1 = (java.util.Map.Entry)((Iterator) (obj)).next();
                    }

                }
                if (flag)
                {
                    z2.a("Xf", type);
                }
            } while (true);
        }
        if (labsproductline.getSidesList() != null)
        {
            labsproductline = labsproductline.getSidesList().iterator();
            do
            {
                if (!labsproductline.hasNext())
                {
                    break;
                }
                type = ad1.a((LabsSide)labsproductline.next(), com/dominos/android/sdk/core/models/LabsSide);
                if (type instanceof z)
                {
                    type = ((z)type).a().iterator();
                    while (type.hasNext()) 
                    {
                        java.util.Map.Entry entry = (java.util.Map.Entry)type.next();
                        z2.a((String)entry.getKey(), (w)entry.getValue());
                    }
                }
            } while (true);
        }
        if (z2.a().size() > 0)
        {
            z1.a("Options", z2);
        }
        return z1;
    }

    public volatile w serialize(Object obj, Type type, ad ad1)
    {
        return serialize((LabsProductLine)obj, type, ad1);
    }
}
