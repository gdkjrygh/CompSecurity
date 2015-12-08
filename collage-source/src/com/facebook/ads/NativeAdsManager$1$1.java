// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import com.facebook.ads.internal.adapters.p;
import com.facebook.ads.internal.b;
import com.facebook.ads.internal.util.l;
import com.facebook.ads.internal.util.m;
import java.util.ArrayList;
import java.util.EnumSet;
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
            com.facebook.ads.NativeAdsManager.b(e.e).clear();
            NativeAdsManager.a(e.e, 0);
            NativeAd anativead[] = a;
            int j = anativead.length;
            for (int i = 0; i < j; i++)
            {
                NativeAd nativead = anativead[i];
                if (nativead != null)
                {
                    com.facebook.ads.NativeAdsManager.b(e.e).add(nativead);
                }
            }

            if (NativeAdsManager.c(e.e) != null)
            {
                NativeAdsManager.c(e.e).onAdsLoaded();
            }
        }
    }

    ag(ag ag, NativeAd anativead[], int i, List list, int ai[])
    {
        e = ag;
        a = anativead;
        b = i;
        c = list;
        d = ai;
        super();
    }

    // Unreferenced inner class com/facebook/ads/NativeAdsManager$1

/* anonymous class */
    class NativeAdsManager._cls1
        implements com.facebook.ads.internal.i.a
    {

        final EnumSet a;
        final NativeAdsManager b;

        public void a(b b1)
        {
            if (NativeAdsManager.c(b) != null)
            {
                NativeAdsManager.c(b).onAdError(b1.b());
            }
        }

        public void a(List list)
        {
            int i = 0;
            NativeAd anativead[] = new NativeAd[list.size()];
            for (; i < list.size(); i++)
            {
                p p1 = (p)list.get(i);
                ArrayList arraylist = new ArrayList(2);
                if (a.contains(NativeAd.MediaCacheFlag.ICON) && p1.h() != null)
                {
                    arraylist.add(p1.h().getUrl());
                }
                if (a.contains(NativeAd.MediaCacheFlag.IMAGE) && p1.i() != null)
                {
                    arraylist.add(p1.i().getUrl());
                }
                m.a(NativeAdsManager.a(b), arraylist, new NativeAdsManager._cls1._cls1(this, anativead, i, list, new int[] {
                    0
                }));
            }

        }

            
            {
                b = nativeadsmanager;
                a = enumset;
                super();
            }
    }

}
