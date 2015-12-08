// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation;

import android.view.View;
import com.google.android.gms.ads.b.h;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.formats.c;

// Referenced classes of package com.google.ads.mediation:
//            a

static final class b extends h
{

    private final c d;

    public final void a(View view)
    {
        if (view instanceof NativeAdView)
        {
            ((NativeAdView)view).setNativeAd(d);
        }
    }

    public rmats.View(c c1)
    {
        d = c1;
        a(c1.b().toString());
        a(c1.c());
        b(c1.d().toString());
        a(c1.e());
        c(c1.f().toString());
        a(c1.g().doubleValue());
        d(c1.h().toString());
        e(c1.i().toString());
        a();
        b();
    }
}
