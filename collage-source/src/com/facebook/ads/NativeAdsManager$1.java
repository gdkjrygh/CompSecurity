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
//            NativeAdsManager, NativeAd

class a
    implements com.facebook.ads.internal.
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
            if (a.contains(Flag.ICON) && p1.h() != null)
            {
                arraylist.add(p1.h().rl());
            }
            if (a.contains(Flag.IMAGE) && p1.i() != null)
            {
                arraylist.add(p1.i().rl());
            }
            m.a(NativeAdsManager.a(b), arraylist, new l(anativead, i, list, new int[] {
                0
            }) {

                final NativeAd a[];
                final int b;
                final List c;
                final int d[];
                final NativeAdsManager._cls1 e;

                public void a()
                {
                    a[b] = new NativeAd(NativeAdsManager.a(e.b), (p)c.get(b), null);
                    int ai[] = d;
                    ai[0] = ai[0] + 1;
                    if (d[0] == c.size())
                    {
                        NativeAdsManager.a(e.b, true);
                        com.facebook.ads.NativeAdsManager.b(e.b).clear();
                        NativeAdsManager.a(e.b, 0);
                        NativeAd anativead1[] = a;
                        int k = anativead1.length;
                        for (int j = 0; j < k; j++)
                        {
                            NativeAd nativead = anativead1[j];
                            if (nativead != null)
                            {
                                com.facebook.ads.NativeAdsManager.b(e.b).add(nativead);
                            }
                        }

                        if (NativeAdsManager.c(e.b) != null)
                        {
                            NativeAdsManager.c(e.b).onAdsLoaded();
                        }
                    }
                }

            
            {
                e = NativeAdsManager._cls1.this;
                a = anativead;
                b = i;
                c = list;
                d = ai;
                super();
            }
            });
        }

    }

    _cls1.d(NativeAdsManager nativeadsmanager, EnumSet enumset)
    {
        b = nativeadsmanager;
        a = enumset;
        super();
    }
}
