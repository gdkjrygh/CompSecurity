// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.gms.ads.formats.NativeAdView;

final class aya extends bli
{

    private final bfc j;

    public aya(bfc bfc1)
    {
        j = bfc1;
        super.d = bfc1.b().toString();
        super.e = bfc1.c();
        super.f = bfc1.d().toString();
        super.g = bfc1.e();
        super.h = bfc1.f().toString();
        super.i = bfc1.g().toString();
        super.a = true;
        super.b = true;
    }

    public final void a(View view)
    {
        if (view instanceof NativeAdView)
        {
            ((NativeAdView)view).a(j);
        }
    }
}
