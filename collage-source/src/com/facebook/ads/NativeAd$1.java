// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import com.facebook.ads.internal.a;
import com.facebook.ads.internal.adapters.p;
import com.facebook.ads.internal.b;
import com.facebook.ads.internal.h;
import com.facebook.ads.internal.util.l;
import com.facebook.ads.internal.util.m;
import java.util.ArrayList;
import java.util.EnumSet;

// Referenced classes of package com.facebook.ads:
//            NativeAd, AdListener

class <init> extends a
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

    public void a(p p1)
    {
        if (p1 == null)
        {
            return;
        }
        ArrayList arraylist = new ArrayList(2);
        if (a.contains(diaCacheFlag.ICON) && p1.h() != null)
        {
            arraylist.add(p1.h().getUrl());
        }
        if (a.contains(diaCacheFlag.IMAGE) && p1.i() != null)
        {
            arraylist.add(p1.i().getUrl());
        }
        m.a(NativeAd.c(b), arraylist, new l(p1) {

            final p a;
            final NativeAd._cls1 b;

            public void a()
            {
                com.facebook.ads.NativeAd.a(b.b, a);
                NativeAd.d(b.b);
                if (com.facebook.ads.NativeAd.a(b.b) != null)
                {
                    com.facebook.ads.NativeAd.a(b.b).onAdLoaded(b.b);
                }
            }

            
            {
                b = NativeAd._cls1.this;
                a = p1;
                super();
            }
        });
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

    _cls1.a(NativeAd nativead, EnumSet enumset)
    {
        b = nativead;
        a = enumset;
        super();
    }
}
