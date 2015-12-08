// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;


// Referenced classes of package kik.android.util:
//            a

private final class f
{

    final a a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private int f;
    private int g;
    private String h;

    static int a(f f1)
    {
        return f1.f;
    }

    static int a(f f1, int i)
    {
        f1.f = i;
        return i;
    }

    static String a(f f1, String s)
    {
        f1.h = s;
        return s;
    }

    static int b(h h1)
    {
        return h1.g;
    }

    static int b(g g1, int i)
    {
        g1.g = i;
        return i;
    }

    static String c(g g1)
    {
        return g1.c;
    }

    static String d(c c1)
    {
        return c1.e;
    }

    static String e(e e1)
    {
        return e1.d;
    }

    static String f(d d1)
    {
        return d1.h;
    }

    static String g(h h1)
    {
        return h1.b;
    }

    final void a(int i)
    {
        if (f == i)
        {
            return;
        }
        if (f == -1)
        {
            f = i;
            kik.android.util.a.a(a, e);
            return;
        } else
        {
            throw new IllegalStateException((new StringBuilder("Trying to set video descriptor file size to ")).append(i).append(" when it is already ").append(f).append(" for uuid ").append(e).toString());
        }
    }

    final boolean a()
    {
        return g == f;
    }

    final f b()
    {
        return new <init>(a, b, e, c, d);
    }

    final void b(int i)
    {
        g = i;
        kik.android.util.a.b(a, e);
    }

    er(a a1, String s, String s1, String s2, String s3)
    {
        a = a1;
        super();
        g = 0;
        b = s;
        c = s2;
        d = s3;
        e = s1;
        f = -1;
    }
}
