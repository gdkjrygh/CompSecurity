// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import com.facebook.ads.internal.a;
import com.facebook.ads.internal.adapters.u;
import com.facebook.ads.internal.b;
import com.facebook.ads.internal.h;
import com.facebook.ads.internal.util.m;
import com.facebook.ads.internal.util.n;
import java.util.ArrayList;
import java.util.EnumSet;

// Referenced classes of package com.facebook.ads:
//            NativeAd, d

class a
    implements m
{

    final u a;
    final ters.u b;

    public void a()
    {
        com.facebook.ads.NativeAd.a(b.b, a);
        NativeAd.d(b.b);
        if (com.facebook.ads.NativeAd.a(b.b) != null)
        {
            com.facebook.ads.NativeAd.a(b.b).onAdLoaded(b.b);
        }
    }

    ters.u(ters.u u, u u1)
    {
        b = u;
        a = u1;
        super();
    }

    // Unreferenced inner class com/facebook/ads/NativeAd$1

/* anonymous class */
    class NativeAd._cls1 extends a
    {

        final EnumSet a;
        final NativeAd b;

        public void a()
        {
            if (com.facebook.ads.NativeAd.b(b) != null)
            {
                com.facebook.ads.NativeAd.b(b).c();
            }
        }

        public void a(u u1)
        {
            if (u1 == null)
            {
                return;
            }
            ArrayList arraylist = new ArrayList(2);
            if (a.contains(NativeAd.MediaCacheFlag.ICON) && u1.d() != null)
            {
                arraylist.add(u1.d().a());
            }
            if (a.contains(NativeAd.MediaCacheFlag.IMAGE) && u1.e() != null)
            {
                arraylist.add(u1.e().a());
            }
            n.a(NativeAd.c(b), arraylist, new NativeAd._cls1._cls1(this, u1));
        }

        public void a(b b1)
        {
            if (com.facebook.ads.NativeAd.a(b) != null)
            {
                com.facebook.ads.NativeAd.a(b).onError(b, b1.b());
            }
        }

        public void b()
        {
            if (com.facebook.ads.NativeAd.a(b) != null)
            {
                com.facebook.ads.NativeAd.a(b).onAdClicked(b);
            }
        }

        public void c()
        {
            throw new IllegalStateException("Native ads manager their own impressions.");
        }

            
            {
                b = nativead;
                a = enumset;
                super();
            }
    }

}
