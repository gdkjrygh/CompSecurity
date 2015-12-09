// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            fy, ot, nh, fh

public final class fw
{

    public final fy a;
    private final fh b;
    private int c;
    private nh d;

    private fw(fh fh1, fy fy1)
    {
        c = -1;
        b = fh1;
        a = fy1;
    }

    static fw a(fh fh1, fy fy1)
    {
        return new fw(fh1, fy1);
    }

    final int a()
    {
        return a.m.f();
    }

    final int a(int i)
    {
        c = i;
        d = nh.a(i, a.m);
        return a();
    }

    public final nh b()
    {
        if (d == null)
        {
            b.a();
            if (d == null)
            {
                throw new AssertionError();
            }
        }
        return d;
    }

    public final String toString()
    {
        return (new StringBuilder("v")).append(c).append("(").append(a).append(")").toString();
    }
}
