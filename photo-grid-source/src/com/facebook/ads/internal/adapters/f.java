// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import com.facebook.ads.internal.server.AdPlacementType;
import com.facebook.ads.internal.util.t;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            h, BannerAdapter, InterstitialAdapter, p, 
//            AdAdapter, g

public class f
{

    private static final Set a;
    private static final Map b;

    public static AdAdapter a(g g1, AdPlacementType adplacementtype)
    {
        h h1 = b(g1, adplacementtype);
        if (h1 == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        if (!a.contains(h1))
        {
            break MISSING_BLOCK_LABEL_56;
        }
        adplacementtype = h1.d;
        g1 = adplacementtype;
        if (adplacementtype != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        g1 = Class.forName(h1.e);
        g1 = (AdAdapter)g1.newInstance();
        return g1;
        g1;
        g1.printStackTrace();
        return null;
    }

    public static AdAdapter a(String s, AdPlacementType adplacementtype)
    {
        return a(g.a(s), adplacementtype);
    }

    public static String a(AdPlacementType adplacementtype)
    {
        if (b.containsKey(adplacementtype))
        {
            return (String)b.get(adplacementtype);
        }
        Object obj = new HashSet();
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            h h1 = (h)iterator.next();
            if (h1.g == adplacementtype)
            {
                ((Set) (obj)).add(h1.f.toString());
            }
        } while (true);
        obj = t.a(((Set) (obj)), ",");
        b.put(adplacementtype, obj);
        return ((String) (obj));
    }

    private static h b(g g1, AdPlacementType adplacementtype)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            h h1 = (h)iterator.next();
            if (h1.f == g1 && h1.g == adplacementtype)
            {
                return h1;
            }
        }

        return null;
    }

    static 
    {
        h ah[];
        int i;
        int j;
        a = new HashSet();
        b = new ConcurrentHashMap();
        ah = h.values();
        j = ah.length;
        i = 0;
_L5:
        h h1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        h1 = ah[i];
        _cls1.a[h1.g.ordinal()];
        JVM INSTR tableswitch 1 3: default 84
    //                   1 143
    //                   2 149
    //                   3 155;
           goto _L1 _L2 _L3 _L4
_L1:
        /*<invalid signature>*/java.lang.Object local = null;
_L6:
        if (local != null)
        {
            Class class2 = h1.d;
            Class class1 = class2;
            if (class2 == null)
            {
                try
                {
                    class1 = Class.forName(h1.e);
                }
                catch (ClassNotFoundException classnotfoundexception)
                {
                    classnotfoundexception = class2;
                }
            }
            if (class1 != null && local.isAssignableFrom(class1))
            {
                a.add(h1);
            }
        }
        i++;
        if (true) goto _L5; else goto _L2
_L2:
        local = com/facebook/ads/internal/adapters/BannerAdapter;
          goto _L6
_L3:
        local = com/facebook/ads/internal/adapters/InterstitialAdapter;
          goto _L6
_L4:
        local = com/facebook/ads/internal/adapters/p;
          goto _L6
    }

    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[AdPlacementType.values().length];
            try
            {
                a[AdPlacementType.BANNER.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[AdPlacementType.INTERSTITIAL.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[AdPlacementType.NATIVE.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
