// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class abA
{

    final abB a;
    final abB b;
    final String c;
    final abC d;
    final aev e;
    private aew f;

    abA(abB abb, abB abb1, String s, abC abc)
    {
        if (abb == null || abb1 == null || s == null)
        {
            throw new NullPointerException();
        } else
        {
            a = abb;
            b = abb1;
            c = s;
            d = abc;
            f = new aew(new aey(s), new aey(a(false)));
            e = new aev(abb.m, f);
            return;
        }
    }

    private String a(boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("(");
        if (flag)
        {
            stringbuilder.append(a.k);
        }
        abB aabb[] = d.a;
        int j = aabb.length;
        for (int i = 0; i < j; i++)
        {
            stringbuilder.append(aabb[i].k);
        }

        stringbuilder.append(")");
        stringbuilder.append(b.k);
        return stringbuilder.toString();
    }

    public final aeB a()
    {
        return aeB.a(a(true));
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof abA) && ((abA)obj).a.equals(a) && ((abA)obj).c.equals(c) && ((abA)obj).d.equals(d) && ((abA)obj).b.equals(b);
    }

    public final int hashCode()
    {
        return (((a.hashCode() + 527) * 31 + c.hashCode()) * 31 + d.hashCode()) * 31 + b.hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder()).append(a).append(".").append(c).append("(").append(d).append(")").toString();
    }
}
