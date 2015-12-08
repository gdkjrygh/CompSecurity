// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.a;


// Referenced classes of package kik.a.a:
//            a

public final class b
{

    private final String a;
    private final String b[];

    b(String s, String as[])
    {
        a = s;
        b = as;
    }

    public final String a()
    {
        return a;
    }

    public final a a(String s)
    {
        String as[] = b;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s1 = as[i];
            if (s.toLowerCase().equals(s1.toLowerCase()))
            {
                return new a(a, s1);
            }
        }

        return null;
    }

    public final String[] b()
    {
        return b;
    }
}
