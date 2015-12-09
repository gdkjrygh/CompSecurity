// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.List;

public final class bhc extends ccd
    implements bhh
{

    private final String a;
    private final List b;
    private final String c;
    private final cbs d;
    private final String e;
    private final double f;
    private final String g;
    private final String h;
    private final bgz i;
    private final Bundle j;
    private final Object k = new Object();
    private bhg l;

    public bhc(String s, List list, String s1, cbs cbs, String s2, double d1, 
            String s3, String s4, bgz bgz, Bundle bundle)
    {
        a = s;
        b = list;
        c = s1;
        d = cbs;
        e = s2;
        f = d1;
        g = s3;
        h = s4;
        i = bgz;
        j = bundle;
    }

    public final String a()
    {
        return a;
    }

    public final void a(bhg bhg)
    {
        synchronized (k)
        {
            l = bhg;
        }
        return;
        bhg;
        obj;
        JVM INSTR monitorexit ;
        throw bhg;
    }

    public final List b()
    {
        return b;
    }

    public final String c()
    {
        return c;
    }

    public final cbs d()
    {
        return d;
    }

    public final String e()
    {
        return e;
    }

    public final double f()
    {
        return f;
    }

    public final String g()
    {
        return g;
    }

    public final String h()
    {
        return h;
    }

    public final byb i()
    {
        return bye.a(l);
    }

    public final String j()
    {
        return "2";
    }

    public final String k()
    {
        return "";
    }

    public final bgz l()
    {
        return i;
    }

    public final Bundle m()
    {
        return j;
    }
}
