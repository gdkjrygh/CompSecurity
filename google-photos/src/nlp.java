// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class nlp
{

    final long a;
    private long b;
    private long c;
    private long d;
    private String e;
    private Class f;

    nlp(long l, long l1, long l2, String s, 
            long l3, Class class1)
    {
        b = l;
        c = l1;
        d = l2;
        if (s == null)
        {
            s = "";
        }
        e = s;
        a = l3;
        f = class1;
    }

    private static nlp a()
    {
        return new nlp(0L, 0L, 0L, null, 0L, nln);
    }

    static nlp a(String s, Context context)
    {
        context = noz.a(context, "MediaStoreToken", new String[0]);
        if (s == null)
        {
            return a();
        }
        Object obj = s.split("\\^");
        if (obj.length != 6)
        {
            if (context.a())
            {
                noy.a("Expected fieldCount", Integer.valueOf(6));
                noy.a("Actual fieldCount", Integer.valueOf(obj.length));
            }
            return a();
        }
        nlp nlp1;
        try
        {
            nlp1 = new nlp(Long.parseLong(obj[0]), Long.parseLong(obj[1]), Long.parseLong(obj[2]), obj[3], Long.parseLong(obj[4]), Class.forName(obj[5]));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (context.a())
            {
                noy.a("Expected format", "long:long:long:string:long:string");
                noy.a("Actual", s);
            }
            return a();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (context.a())
            {
                noy.a("Class", obj[5]);
            }
            return a();
        }
        return nlp1;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj != null)
        {
            flag = flag1;
            if (obj instanceof nlp)
            {
                obj = (nlp)obj;
                flag = flag1;
                if (b == ((nlp) (obj)).b)
                {
                    flag = flag1;
                    if (c == ((nlp) (obj)).c)
                    {
                        flag = flag1;
                        if (d == ((nlp) (obj)).d)
                        {
                            flag = flag1;
                            if (a == ((nlp) (obj)).a)
                            {
                                flag = flag1;
                                if (e.equals(((nlp) (obj)).e))
                                {
                                    flag = flag1;
                                    if (f.equals(((nlp) (obj)).f))
                                    {
                                        flag = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return c.a(b, c.a(c, c.a(d, c.a(e, c.a(a, c.a(f, 31))))));
    }

    public final String toString()
    {
        String s = String.valueOf(Long.toString(b));
        String s1 = String.valueOf("^");
        String s2 = String.valueOf(Long.toString(c));
        String s3 = String.valueOf("^");
        String s4 = String.valueOf(Long.toString(d));
        String s5 = String.valueOf("^");
        String s6 = e;
        String s7 = String.valueOf("^");
        String s8 = String.valueOf(Long.toString(a));
        String s9 = String.valueOf("^");
        String s10 = String.valueOf(f.getName());
        return (new StringBuilder(String.valueOf(s).length() + 0 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length() + String.valueOf(s6).length() + String.valueOf(s7).length() + String.valueOf(s8).length() + String.valueOf(s9).length() + String.valueOf(s10).length())).append(s).append(s1).append(s2).append(s3).append(s4).append(s5).append(s6).append(s7).append(s8).append(s9).append(s10).toString();
    }
}
