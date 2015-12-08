// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.Locale;

public final class jsi extends jsw
{

    jsi(jrk jrk1)
    {
        super(jrk1);
    }

    protected final void a()
    {
    }

    public final ljm b()
    {
        r();
        DisplayMetrics displaymetrics = super.d.b().a.getResources().getDisplayMetrics();
        ljm ljm1 = new ljm();
        ljm1.a = jtk.a(Locale.getDefault());
        ljm1.c = displaymetrics.widthPixels;
        ljm1.d = displaymetrics.heightPixels;
        return ljm1;
    }

    public final String c()
    {
        r();
        ljm ljm1 = b();
        return (new StringBuilder()).append(ljm1.c).append("x").append(ljm1.d).toString();
    }
}
