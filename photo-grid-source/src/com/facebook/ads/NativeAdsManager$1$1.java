// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import com.facebook.ads.internal.adapters.p;
import com.facebook.ads.internal.util.l;
import java.util.List;

// Referenced classes of package com.facebook.ads:
//            NativeAd, NativeAdsManager

class d
    implements l
{

    final NativeAd a[];
    final int b;
    final List c;
    final int d[];
    final ener.onAdsLoaded e;

    public void a()
    {
        a[b] = new NativeAd(NativeAdsManager.a(e.e), (p)c.get(b), null);
        int ai[] = d;
        ai[0] = ai[0] + 1;
        if (d[0] == c.size())
        {
            NativeAdsManager.a(e.e, true);
            NativeAdsManager.b(e.e).clear();
            NativeAdsManager.a(e.e, 0);
            NativeAd anativead[] = a;
            int j = anativead.length;
            for (int i = 0; i < j; i++)
            {
                NativeAd nativead = anativead[i];
                if (nativead != null)
                {
                    NativeAdsManager.b(e.e).add(nativead);
                }
            }

            if (NativeAdsManager.c(e.e) != null)
            {
                NativeAdsManager.c(e.e).onAdsLoaded();
            }
        }
    }

    ener(ener ener, NativeAd anativead[], int i, List list, int ai[])
    {
        e = ener;
        a = anativead;
        b = i;
        c = list;
        d = ai;
        super();
    }
}
