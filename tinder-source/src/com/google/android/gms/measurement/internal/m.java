// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.internal.ef;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            af, ac, u, c, 
//            h, ab, w, z, 
//            j

public final class m extends af
{

    private long a;
    private String b;

    m(ac ac)
    {
        super(ac);
    }

    protected final void a()
    {
        Object obj = Calendar.getInstance();
        Object obj1 = TimeUnit.MINUTES;
        int i1 = ((Calendar) (obj)).get(15);
        a = ((TimeUnit) (obj1)).convert(((Calendar) (obj)).get(16) + i1, TimeUnit.MILLISECONDS);
        obj = Locale.getDefault();
        obj1 = new StringBuilder();
        ((StringBuilder) (obj1)).append(((Locale) (obj)).getLanguage().toLowerCase(Locale.ENGLISH));
        ((StringBuilder) (obj1)).append("-");
        ((StringBuilder) (obj1)).append(((Locale) (obj)).getCountry().toLowerCase(Locale.ENGLISH));
        b = ((StringBuilder) (obj1)).toString();
    }

    public final String b()
    {
        t();
        return Build.MODEL;
    }

    public final volatile void c()
    {
        super.c();
    }

    public final volatile void d()
    {
        super.d();
    }

    public final volatile void e()
    {
        super.e();
    }

    public final volatile u f()
    {
        return super.f();
    }

    public final volatile c g()
    {
        return super.g();
    }

    public final volatile ef h()
    {
        return super.h();
    }

    public final volatile Context i()
    {
        return super.i();
    }

    public final volatile h j()
    {
        return super.j();
    }

    public final volatile ab k()
    {
        return super.k();
    }

    public final volatile w l()
    {
        return super.l();
    }

    public final volatile z m()
    {
        return super.m();
    }

    public final volatile j n()
    {
        return super.n();
    }

    public final String o()
    {
        t();
        return android.os.Build.VERSION.RELEASE;
    }

    public final long p()
    {
        t();
        return a;
    }

    public final String q()
    {
        t();
        return b;
    }
}
