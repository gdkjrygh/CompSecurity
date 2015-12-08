// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            of, ot, pf

public final class od extends of
{

    public static final od a = a(-1);
    public static final od b = a(0);
    public static final od c = a(1);
    public static final od d = a(2);
    public static final od e = a(3);
    public static final od f = a(4);
    public static final od g = a(5);
    private static final od i[] = new od[511];

    private od(int j)
    {
        super(j);
    }

    public static od a(int j)
    {
        int k = (0x7fffffff & j) % i.length;
        od od1 = i[k];
        if (od1 != null && ((of) (od1)).h == j)
        {
            return od1;
        } else
        {
            od od2 = new od(j);
            i[k] = od2;
            return od2;
        }
    }

    public final ot b()
    {
        return ot.f;
    }

    public final String e()
    {
        return "int";
    }

    public final int f()
    {
        return super.h;
    }

    public final String h_()
    {
        return Integer.toString(super.h);
    }

    public final String toString()
    {
        int j = super.h;
        return (new StringBuilder("int{0x")).append(pf.a(j)).append(" / ").append(j).append('}').toString();
    }

}
