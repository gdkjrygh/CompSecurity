// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.mediation;

import android.view.View;
import com.google.android.gms.ads.b.i;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.formats.d;

// Referenced classes of package com.google.ads.mediation:
//            a

static final class b extends i
{

    private final d d;

    public final void a(View view)
    {
        if (view instanceof NativeAdView)
        {
            ((NativeAdView)view).setNativeAd(d);
        }
    }

    public rmats.View(d d1)
    {
        d = d1;
        a(d1.b().toString());
        a(d1.c());
        b(d1.d().toString());
        a(d1.e());
        c(d1.f().toString());
        d(d1.g().toString());
        a();
        b();
    }
}
