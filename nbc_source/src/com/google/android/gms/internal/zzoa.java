// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zznq

public final class zzoa extends zznq
{

    private ProductAction zzIC;
    private final Map zzID = new HashMap();
    private final List zzIE = new ArrayList();
    private final List zzIF = new ArrayList();

    public zzoa()
    {
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        if (!zzIF.isEmpty())
        {
            hashmap.put("products", zzIF);
        }
        if (!zzIE.isEmpty())
        {
            hashmap.put("promotions", zzIE);
        }
        if (!zzID.isEmpty())
        {
            hashmap.put("impressions", zzID);
        }
        hashmap.put("productAction", zzIC);
        return zzy(hashmap);
    }

    public void zza(Product product, String s)
    {
        if (product == null)
        {
            return;
        }
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        if (!zzID.containsKey(s1))
        {
            zzID.put(s1, new ArrayList());
        }
        ((List)zzID.get(s1)).add(product);
    }

    public volatile void zza(zznq zznq1)
    {
        zza((zzoa)zznq1);
    }

    public void zza(zzoa zzoa1)
    {
        zzoa1.zzIF.addAll(zzIF);
        zzoa1.zzIE.addAll(zzIE);
        for (Iterator iterator = zzID.entrySet().iterator(); iterator.hasNext();)
        {
            Object obj = (java.util.Map.Entry)iterator.next();
            String s = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = ((List)((java.util.Map.Entry) (obj)).getValue()).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                zzoa1.zza((Product)((Iterator) (obj)).next(), s);
            }
        }

        if (zzIC != null)
        {
            zzoa1.zzIC = zzIC;
        }
    }

    public ProductAction zzwu()
    {
        return zzIC;
    }

    public List zzwv()
    {
        return Collections.unmodifiableList(zzIF);
    }

    public Map zzww()
    {
        return zzID;
    }

    public List zzwx()
    {
        return Collections.unmodifiableList(zzIE);
    }
}
