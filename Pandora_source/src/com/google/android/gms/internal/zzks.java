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
//            zzki

public final class zzks extends zzki
{

    private ProductAction zzEF;
    private final Map zzEG = new HashMap();
    private final List zzEH = new ArrayList();
    private final List zzEI = new ArrayList();

    public zzks()
    {
    }

    public String toString()
    {
        HashMap hashmap = new HashMap();
        if (!zzEI.isEmpty())
        {
            hashmap.put("products", zzEI);
        }
        if (!zzEH.isEmpty())
        {
            hashmap.put("promotions", zzEH);
        }
        if (!zzEG.isEmpty())
        {
            hashmap.put("impressions", zzEG);
        }
        hashmap.put("productAction", zzEF);
        return zzu(hashmap);
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
        if (!zzEG.containsKey(s1))
        {
            zzEG.put(s1, new ArrayList());
        }
        ((List)zzEG.get(s1)).add(product);
    }

    public volatile void zza(zzki zzki1)
    {
        zza((zzks)zzki1);
    }

    public void zza(zzks zzks1)
    {
        zzks1.zzEI.addAll(zzEI);
        zzks1.zzEH.addAll(zzEH);
        for (Iterator iterator = zzEG.entrySet().iterator(); iterator.hasNext();)
        {
            Object obj = (java.util.Map.Entry)iterator.next();
            String s = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = ((List)((java.util.Map.Entry) (obj)).getValue()).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                zzks1.zza((Product)((Iterator) (obj)).next(), s);
            }
        }

        if (zzEF != null)
        {
            zzks1.zzEF = zzEF;
        }
    }

    public ProductAction zzuE()
    {
        return zzEF;
    }

    public List zzuF()
    {
        return Collections.unmodifiableList(zzEI);
    }

    public Map zzuG()
    {
        return zzEG;
    }

    public List zzuH()
    {
        return Collections.unmodifiableList(zzEH);
    }
}
