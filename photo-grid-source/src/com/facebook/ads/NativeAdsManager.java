// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.content.Context;
import com.facebook.ads.internal.c;
import com.facebook.ads.internal.e;
import com.facebook.ads.internal.i;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

// Referenced classes of package com.facebook.ads:
//            NativeAd

public class NativeAdsManager
{

    private static final c a;
    private final Context b;
    private final String c;
    private final int d;
    private final List e;
    private int f;
    private Listener g;
    private i h;
    private boolean i;

    public NativeAdsManager(Context context, String s, int j)
    {
        b = context;
        c = s;
        d = Math.max(j, 0);
        e = new ArrayList(j);
        f = -1;
        i = false;
    }

    static int a(NativeAdsManager nativeadsmanager, int j)
    {
        nativeadsmanager.f = j;
        return j;
    }

    static Context a(NativeAdsManager nativeadsmanager)
    {
        return nativeadsmanager.b;
    }

    static boolean a(NativeAdsManager nativeadsmanager, boolean flag)
    {
        nativeadsmanager.i = flag;
        return flag;
    }

    static List b(NativeAdsManager nativeadsmanager)
    {
        return nativeadsmanager.e;
    }

    static Listener c(NativeAdsManager nativeadsmanager)
    {
        return nativeadsmanager.g;
    }

    public int getUniqueNativeAdCount()
    {
        return e.size();
    }

    public boolean isLoaded()
    {
        return i;
    }

    public void loadAds()
    {
        loadAds(EnumSet.of(NativeAd.MediaCacheFlag.NONE));
    }

    public void loadAds(EnumSet enumset)
    {
        e e1 = e.j;
        int j = d;
        if (h != null)
        {
            h.b();
        }
        h = new i(b, c, e1, null, a, j, enumset);
        h.a(new _cls1(enumset));
        h.a();
    }

    public NativeAd nextNativeAd()
    {
        int j = f;
        f = j + 1;
        NativeAd nativead1 = (NativeAd)e.get(j % e.size());
        NativeAd nativead = nativead1;
        if (j >= e.size())
        {
            nativead = new NativeAd(nativead1);
        }
        return nativead;
    }

    public void setListener(Listener listener)
    {
        g = listener;
    }

    static 
    {
        a = c.a;
    }

    private class _cls1
        implements com.facebook.ads.internal.i.a
    {

        final EnumSet a;
        final NativeAdsManager b;

        public void a(b b1)
        {
            if (com.facebook.ads.NativeAdsManager.c(b) != null)
            {
                com.facebook.ads.NativeAdsManager.c(b).onAdError(b1.b());
            }
        }

        public void a(List list)
        {
            int j = 0;
            NativeAd anativead[] = new NativeAd[list.size()];
            for (; j < list.size(); j++)
            {
                p p1 = (p)list.get(j);
                ArrayList arraylist = new ArrayList(2);
                if (a.contains(NativeAd.MediaCacheFlag.ICON) && p1.g() != null)
                {
                    arraylist.add(p1.g().getUrl());
                }
                if (a.contains(NativeAd.MediaCacheFlag.IMAGE) && p1.h() != null)
                {
                    arraylist.add(p1.h().getUrl());
                }
                class _cls1
                    implements l
                {

                    final NativeAd a[];
                    final int b;
                    final List c;
                    final int d[];
                    final _cls1 e;

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
                            int i1 = anativead1.length;
                            for (int k = 0; k < i1; k++)
                            {
                                NativeAd nativead = anativead1[k];
                                if (nativead != null)
                                {
                                    com.facebook.ads.NativeAdsManager.b(e.b).add(nativead);
                                }
                            }

                            if (com.facebook.ads.NativeAdsManager.c(e.b) != null)
                            {
                                com.facebook.ads.NativeAdsManager.c(e.b).onAdsLoaded();
                            }
                        }
                    }

                _cls1(NativeAd anativead[], int j, List list, int ai[])
                {
                    e = _cls1.this;
                    a = anativead;
                    b = j;
                    c = list;
                    d = ai;
                    super();
                }
                }

                m.a(NativeAdsManager.a(b), arraylist, new _cls1(anativead, j, list, new int[] {
                    0
                }));
            }

        }

        _cls1(EnumSet enumset)
        {
            b = NativeAdsManager.this;
            a = enumset;
            super();
        }

        private class Listener
        {

            public abstract void onAdError(AdError aderror);

            public abstract void onAdsLoaded();
        }

    }

}
