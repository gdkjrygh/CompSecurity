// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

public final class bdp
    implements bdl
{

    public volatile Object a;
    private final bde b;
    private final bdo c;
    private final bdq d;
    private volatile boolean e;

    public bdp(String s, bdo bdo1, bdq bdq1)
    {
        c = bdo1;
        d = bdq1;
        b = new bde(Uri.parse(s));
    }

    public final void d()
    {
        e = true;
    }

    public final boolean e()
    {
        return e;
    }

    public final void f()
    {
        bdd bdd1 = new bdd(c, b);
        bdd1.a();
        a = d.a(c.a(), bdd1);
        bdd1.close();
        return;
        Exception exception;
        exception;
        bdd1.close();
        throw exception;
    }
}
