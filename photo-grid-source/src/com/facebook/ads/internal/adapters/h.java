// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import com.facebook.ads.internal.server.AdPlacementType;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            i, g, j, k

public final class h extends Enum
{

    public static final h a;
    public static final h b;
    public static final h c;
    private static final h h[];
    public Class d;
    public String e;
    public g f;
    public AdPlacementType g;

    private h(String s, int l, Class class1, g g1, AdPlacementType adplacementtype)
    {
        super(s, l);
        d = class1;
        f = g1;
        g = adplacementtype;
    }

    public static h valueOf(String s)
    {
        return (h)Enum.valueOf(com/facebook/ads/internal/adapters/h, s);
    }

    public static h[] values()
    {
        return (h[])h.clone();
    }

    static 
    {
        a = new h("ANBANNER", 0, com/facebook/ads/internal/adapters/i, g.b, AdPlacementType.BANNER);
        b = new h("ANINTERSTITIAL", 1, com/facebook/ads/internal/adapters/j, g.b, AdPlacementType.INTERSTITIAL);
        c = new h("ANNATIVE", 2, com/facebook/ads/internal/adapters/k, g.b, AdPlacementType.NATIVE);
        h = (new h[] {
            a, b, c
        });
    }
}
