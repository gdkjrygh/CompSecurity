// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Future;

public final class ahr
{

    akk a;
    ajy b;
    public final acu c = new _cls1();
    public final acu d = new _cls2();
    private final Object e = new Object();
    private String f;
    private String g;
    private ajs h;

    public ahr(String s, String s1)
    {
        h = new ajs();
        g = s1;
        f = s;
    }

    static Object a(ahr ahr1)
    {
        return ahr1.e;
    }

    static ajs b(ahr ahr1)
    {
        return ahr1.h;
    }

    static String c(ahr ahr1)
    {
        return ahr1.f;
    }

    static String d(ahr ahr1)
    {
        return ahr1.g;
    }

    public final ajy a()
    {
        return b;
    }

    public final void a(ajy ajy)
    {
        b = ajy;
    }

    public final void a(akk akk1)
    {
        a = akk1;
    }

    public final Future b()
    {
        return h;
    }

    public final void c()
    {
        if (a != null)
        {
            a.destroy();
            a = null;
        }
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
