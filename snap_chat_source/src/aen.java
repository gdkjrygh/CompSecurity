// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aen extends aep
{

    public static final aen a = a(0);
    private static final aen c[] = new aen[511];

    private aen(int i)
    {
        super(i);
    }

    public static aen a(int i)
    {
        int j = (0x7fffffff & i) % 511;
        aen aen1 = c[j];
        if (aen1 != null && ((aep) (aen1)).b == i)
        {
            return aen1;
        } else
        {
            aen aen2 = new aen(i);
            c[j] = aen2;
            return aen2;
        }
    }

    public final String ag_()
    {
        return Integer.toString(super.b);
    }

    public final aeD b()
    {
        return aeD.f;
    }

    public final String e()
    {
        return "int";
    }

    public final String toString()
    {
        int i = super.b;
        return (new StringBuilder("int{0x")).append(aeO.a(i)).append(" / ").append(i).append('}').toString();
    }

    static 
    {
        a(-1);
        a(1);
        a(2);
        a(3);
        a(4);
        a(5);
    }
}
