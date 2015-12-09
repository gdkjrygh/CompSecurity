// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.gms.ads.formats.NativeAdView;

final class axz extends blh
{

    private final bfa l;

    public axz(bfa bfa1)
    {
        l = bfa1;
        super.d = bfa1.b().toString();
        super.e = bfa1.c();
        super.f = bfa1.d().toString();
        super.g = bfa1.e();
        super.h = bfa1.f().toString();
        super.i = bfa1.g().doubleValue();
        super.j = bfa1.h().toString();
        super.k = bfa1.i().toString();
        super.a = true;
        super.b = true;
    }

    public final void a(View view)
    {
        if (view instanceof NativeAdView)
        {
            ((NativeAdView)view).a(l);
        }
    }
}
