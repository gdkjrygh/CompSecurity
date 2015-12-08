// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.util.Locale;

public final class bnv extends bnd
{

    bnv(bnf bnf1)
    {
        super(bnf1);
    }

    protected final void a()
    {
    }

    public final coc b()
    {
        m();
        DisplayMetrics displaymetrics = super.f.b().a.getResources().getDisplayMetrics();
        coc coc1 = new coc();
        coc1.a = bmz.a(Locale.getDefault());
        coc1.c = displaymetrics.widthPixels;
        coc1.d = displaymetrics.heightPixels;
        return coc1;
    }

    public final String c()
    {
        m();
        coc coc1 = b();
        return (new StringBuilder()).append(coc1.c).append("x").append(coc1.d).toString();
    }
}
