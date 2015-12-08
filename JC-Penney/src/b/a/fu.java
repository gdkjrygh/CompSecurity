// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            om, oo, fy, ob

public final class fu
{

    final fy a;
    final fy b;
    final String c;
    final om d;
    public final ob e;

    fu(fy fy1, fy fy2, String s)
    {
        if (fy1 == null || fy2 == null || s == null)
        {
            throw new NullPointerException();
        } else
        {
            a = fy1;
            b = fy2;
            c = s;
            d = new om(new oo(s), new oo(fy2.l));
            e = new ob(fy1.n, d);
            return;
        }
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof fu) && ((fu)obj).a.equals(a) && ((fu)obj).c.equals(c);
    }

    public final int hashCode()
    {
        return a.hashCode() + c.hashCode() * 37;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(a).append(".").append(c).toString();
    }
}
