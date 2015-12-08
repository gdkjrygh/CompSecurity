// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a;


// Referenced classes of package com.google.a:
//            j, e, f, g, 
//            h, i

public abstract class d extends Enum
    implements j
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    public static final d e;
    private static final d f[];

    private d(String s, int k)
    {
        super(s, k);
    }

    d(String s, int k, byte byte0)
    {
        this(s, k);
    }

    static String a(String s)
    {
        int k = 0;
        StringBuilder stringbuilder = new StringBuilder();
        char c1;
        for (c1 = s.charAt(0); k < s.length() - 1 && !Character.isLetter(c1); c1 = s.charAt(k))
        {
            stringbuilder.append(c1);
            k++;
        }

        String s1;
        if (k == s.length())
        {
            s1 = stringbuilder.toString();
        } else
        {
            s1 = s;
            if (!Character.isUpperCase(c1))
            {
                c1 = Character.toUpperCase(c1);
                k++;
                if (k < s.length())
                {
                    s = (new StringBuilder()).append(c1).append(s.substring(k)).toString();
                } else
                {
                    s = String.valueOf(c1);
                }
                return stringbuilder.append(s).toString();
            }
        }
        return s1;
    }

    static String a(String s, String s1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int k = 0; k < s.length(); k++)
        {
            char c1 = s.charAt(k);
            if (Character.isUpperCase(c1) && stringbuilder.length() != 0)
            {
                stringbuilder.append(s1);
            }
            stringbuilder.append(c1);
        }

        return stringbuilder.toString();
    }

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/google/a/d, s);
    }

    public static d[] values()
    {
        return (d[])f.clone();
    }

    static 
    {
        a = new e("IDENTITY");
        b = new f("UPPER_CAMEL_CASE");
        c = new g("UPPER_CAMEL_CASE_WITH_SPACES");
        d = new h("LOWER_CASE_WITH_UNDERSCORES");
        e = new i("LOWER_CASE_WITH_DASHES");
        f = (new d[] {
            a, b, c, d, e
        });
    }
}
