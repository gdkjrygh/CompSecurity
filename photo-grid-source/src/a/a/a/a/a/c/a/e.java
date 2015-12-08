// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.c.a;


// Referenced classes of package a.a.a.a.a.c.a:
//            a, d

public final class e
{

    private final int a;
    private final a b;
    private final d c;

    private e(int i, a a1, d d)
    {
        a = i;
        b = a1;
        c = d;
    }

    public e(a a1, d d)
    {
        this(0, a1, d);
    }

    public final long a()
    {
        return b.a(a);
    }

    public final e b()
    {
        return new e(a + 1, b, c);
    }

    public final e c()
    {
        return new e(b, c);
    }
}
