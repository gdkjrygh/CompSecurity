// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.TimeZone;

public final class jxf
{

    public int a;
    public String b;
    public String c;
    public String d;
    public int e;
    public final k f;
    public final ksc g;
    public boolean h;
    public final jxd i;
    private ArrayList j;

    public jxf(jxd jxd1, byte abyte0[])
    {
        this(jxd1, abyte0, null);
    }

    private jxf(jxd jxd1, byte abyte0[], k k)
    {
        i = jxd1;
        super();
        a = jxd.a(i);
        b = jxd.b(i);
        c = jxd.c(i);
        d = jxd.d(i);
        e = jxd.e(i);
        j = null;
        g = new ksc();
        h = false;
        c = jxd.c(jxd1);
        d = jxd.d(jxd1);
        g.c = jxd.f(jxd1).a();
        g.d = jxd.f(jxd1).b();
        k = g;
        jxd.g(jxd1);
        long l = g.c;
        k.g = TimeZone.getDefault().getOffset(l) / 1000;
        if (abyte0 != null)
        {
            g.f = abyte0;
        }
        f = null;
    }
}
