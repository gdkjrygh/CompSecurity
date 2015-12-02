// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;

public final class ahb
{

    public ahb()
    {
    }

    public static aiw a(Context context, oh oh, aio aio1, amb amb, akk akk1, aej aej, ahc ahc)
    {
        AdResponseParcel adresponseparcel = aio1.b;
        if (adresponseparcel.t)
        {
            context = new ahg(context, oh, new aqn(), aio1, amb, ahc);
        } else
        if (adresponseparcel.h)
        {
            context = new ahf(context, aio1, akk1, aej, ahc);
        } else
        if (adresponseparcel.p)
        {
            context = new agy(context, aio1, akk1, ahc);
        } else
        if (((Boolean)abn.H.c()).booleanValue() && alv.f() && !alv.g() && akk1.h().e)
        {
            context = new ahe(context, aio1, akk1, ahc);
        } else
        {
            context = new ahd(context, aio1, akk1, ahc);
        }
        context.f();
        return context;
    }
}
