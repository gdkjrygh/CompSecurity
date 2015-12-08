// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class id
{

    int a;
    long b;
    float c;
    public long d;
    long e;
    private final List f;
    private long g;
    private CharSequence h;
    private long i;
    private Bundle j;

    public id()
    {
        f = new ArrayList();
        i = -1L;
    }

    public id(ib ib1)
    {
        f = new ArrayList();
        i = -1L;
        a = ib.a(ib1);
        b = ib.b(ib1);
        c = ib.c(ib1);
        e = ib.d(ib1);
        g = ib.e(ib1);
        d = ib.f(ib1);
        h = ib.g(ib1);
        if (ib.h(ib1) != null)
        {
            f.addAll(ib.h(ib1));
        }
        i = ib.i(ib1);
        j = ib.j(ib1);
    }

    public final ib a()
    {
        return new ib(a, b, g, c, d, h, e, f, i, j);
    }
}
