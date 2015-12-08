// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.pinterest.api.igmodel:
//            IgModel, IgPinGalleryItem, IgProductVariantVariant

class IgProductVariant
    implements IgModel
{

    public String a;
    public String b;
    public Integer c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public Integer j;
    public List k;
    public IgPinGalleryItem l;
    public IgProductVariantVariant m;

    IgProductVariant()
    {
    }

    public final com.pinterest.api.model.BuyableProduct.Variant a()
    {
        com.pinterest.api.model.BuyableProduct.Variant variant;
        variant = new com.pinterest.api.model.BuyableProduct.Variant();
        variant.setActivePrice(a);
        variant.setDisplayPrice(b);
        variant.setMaxQuantity(c);
        variant.setPrice(d);
        variant.setCurrency(e);
        variant.setItemId(f);
        variant.setSalePrice(g);
        variant.setDisplayActivePrice(h);
        variant.setDisplaySalePrice(i);
        variant.setAvailability(j);
        if (m == null) goto _L2; else goto _L1
_L1:
        HashMap hashmap;
        Field afield[];
        Field field;
        int i1;
        int j1;
        try
        {
            hashmap = new HashMap();
            afield = m.getClass().getDeclaredFields();
            j1 = afield.length;
        }
        catch (Exception exception)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = 0;
_L3:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        field = afield[i1];
        hashmap.put(field.getName(), field.get(m).toString());
        variant.setVariant(hashmap);
        i1++;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L3; else goto _L2
_L2:
        if (k == null) goto _L5; else goto _L4
_L4:
        break MISSING_BLOCK_LABEL_180;
_L5:
        break MISSING_BLOCK_LABEL_248;
        ArrayList arraylist = new ArrayList();
        Iterator iterator = k.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            IgPinGalleryItem igpingalleryitem = (IgPinGalleryItem)iterator.next();
            if (l.b != null)
            {
                arraylist.add(igpingalleryitem.a());
            }
        } while (true);
        variant.setImages(arraylist);
        if (l != null && l.b != null)
        {
            variant.setSwatchImage(l.a());
        }
        return variant;
    }

    public Object getModel()
    {
        return a();
    }
}
