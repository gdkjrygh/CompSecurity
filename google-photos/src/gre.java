// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gre
{

    public final int a;
    public final ekp b;
    public final ekp c;

    gre(grf grf1)
    {
        a = grf1.a;
        b = grf1.b;
        c = grf1.c;
    }

    public static gre a(int i)
    {
        grf grf1 = new grf();
        grf1.a = i;
        return grf1.a();
    }

    public static gre a(int i, ekp ekp1)
    {
        grf grf1 = new grf();
        grf1.a = i;
        grf1.c = ekp1;
        return grf1.a();
    }

    public static gre a(ekp ekp1)
    {
        grf grf1 = new grf();
        grf1.b = ekp1;
        return grf1.a();
    }

    public final boolean a()
    {
        return b != null;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof gre)
        {
            obj = (gre)obj;
            flag = flag1;
            if (a == ((gre) (obj)).a)
            {
                flag = flag1;
                if (c.c(b, ((gre) (obj)).b))
                {
                    flag = flag1;
                    if (c.c(c, ((gre) (obj)).c))
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return a + c.a(b, 17) * 31;
    }

    public final String toString()
    {
        Object obj1 = null;
        String s = String.valueOf("ChangeMediaRequest {index:");
        int i = a;
        Object obj;
        String s1;
        if (b == null)
        {
            obj = null;
        } else
        {
            obj = Long.valueOf(b.b());
        }
        s1 = String.valueOf(obj);
        if (c == null)
        {
            obj = obj1;
        } else
        {
            obj = Long.valueOf(c.b());
        }
        obj = String.valueOf(obj);
        return (new StringBuilder(String.valueOf(s).length() + 38 + String.valueOf(s1).length() + String.valueOf(obj).length())).append(s).append(i).append(", media: ").append(s1).append(", expectedMedia: ").append(((String) (obj))).append("}").toString();
    }
}
