// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            om, oo, ol, fy, 
//            fz, or

public final class fx
{

    final fy a;
    final fy b;
    final String c;
    final fz d;
    final om e;
    final ol f;

    fx(fy fy1, fy fy2, String s, fz fz1)
    {
        if (fy1 == null || fy2 == null || s == null || fz1 == null)
        {
            throw new NullPointerException();
        } else
        {
            a = fy1;
            b = fy2;
            c = s;
            d = fz1;
            e = new om(new oo(s), new oo(a(false)));
            f = new ol(fy1.n, e);
            return;
        }
    }

    private String a(boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("(");
        if (flag)
        {
            stringbuilder.append(a.l);
        }
        fy afy[] = d.a;
        int j = afy.length;
        for (int i = 0; i < j; i++)
        {
            stringbuilder.append(afy[i].l);
        }

        stringbuilder.append(")");
        stringbuilder.append(b.l);
        return stringbuilder.toString();
    }

    public final or a()
    {
        return or.a(a(true));
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof fx) && ((fx)obj).a.equals(a) && ((fx)obj).c.equals(c) && ((fx)obj).d.equals(d) && ((fx)obj).b.equals(b);
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
