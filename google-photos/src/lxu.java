// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class lxu
    implements lxf
{

    jyn a;

    lxu()
    {
    }

    public final void a()
    {
        a.b();
    }

    public final void a(double d1)
    {
        jug.b.a(a, d1);
    }

    public final void a(Context context, lxl lxl, lxh lxh)
    {
        lxl = new jun(((lyc)lxl).a, new lxv(this, lxh));
        a = (new jyo(context)).a(jug.a, new jum(lxl)).a(new lxx(this, lxh)).a(new lxw(this, lxh)).a();
    }

    public final void a(String s, String s1, lxi lxi)
    {
        jug.b.a(a, s, s1).a(new lxz(this, lxi));
    }

    public final void a(String s, lxj lxj)
    {
        jug.b.a(a, s, new lxy(this, lxj));
    }

    public final void a(String s, boolean flag, lxi lxi)
    {
        jug.b.a(a, s, true).a(new lya(this, lxi));
    }

    public final void b()
    {
        a.d();
    }

    public final boolean c()
    {
        return a.e();
    }

    public final double d()
    {
        return jug.b.a(a);
    }
}
