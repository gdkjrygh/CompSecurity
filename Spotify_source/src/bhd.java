// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.List;

public final class bhd extends cch
    implements bhh
{

    private final String a;
    private final List b;
    private final String c;
    private final cbs d;
    private final String e;
    private final String f;
    private final bgz g;
    private final Bundle h;
    private final Object i = new Object();
    private bhg j;

    public bhd(String s, List list, String s1, cbs cbs, String s2, String s3, bgz bgz, 
            Bundle bundle)
    {
        a = s;
        b = list;
        c = s1;
        d = cbs;
        e = s2;
        f = s3;
        g = bgz;
        h = bundle;
    }

    public final String a()
    {
        return a;
    }

    public final void a(bhg bhg)
    {
        synchronized (i)
        {
            j = bhg;
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

    public final String f()
    {
        return f;
    }

    public final byb g()
    {
        return bye.a(j);
    }

    public final Bundle h()
    {
        return h;
    }

    public final String j()
    {
        return "1";
    }

    public final String k()
    {
        return "";
    }

    public final bgz l()
    {
        return g;
    }
}
