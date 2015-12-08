// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a;


// Referenced classes of package com.google.a:
//            i, d, e, f, 
//            g, h

public abstract class c extends Enum
    implements i
{

    public static final c a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    private static final c f[];

    private c(String s, int j)
    {
        super(s, j);
    }

    c(String s, int j, d d1)
    {
        this(s, j);
    }

    private static String a(char c1, String s, int j)
    {
        if (j < s.length())
        {
            return (new StringBuilder()).append(c1).append(s.substring(j)).toString();
        } else
        {
            return String.valueOf(c1);
        }
    }

    static String a(String s)
    {
        return b(s);
    }

    static String a(String s, String s1)
    {
        return b(s, s1);
    }

    private static String b(String s)
    {
        char c1;
        StringBuilder stringbuilder;
        int j;
        stringbuilder = new StringBuilder();
        j = 0;
        c1 = s.charAt(0);
_L8:
        if (j < s.length() - 1 && !Character.isLetter(c1)) goto _L2; else goto _L1
_L1:
        if (j != s.length()) goto _L4; else goto _L3
_L3:
        String s1 = stringbuilder.toString();
_L6:
        return s1;
_L2:
        stringbuilder.append(c1);
        j++;
        c1 = s.charAt(j);
        continue; /* Loop/switch isn't completed */
_L4:
        s1 = s;
        if (Character.isUpperCase(c1)) goto _L6; else goto _L5
_L5:
        return stringbuilder.append(a(Character.toUpperCase(c1), s, j + 1)).toString();
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static String b(String s, String s1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int j = 0; j < s.length(); j++)
        {
            char c1 = s.charAt(j);
            if (Character.isUpperCase(c1) && stringbuilder.length() != 0)
            {
                stringbuilder.append(s1);
            }
            stringbuilder.append(c1);
        }

        return stringbuilder.toString();
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/google/a/c, s);
    }

    public static c[] values()
    {
        return (c[])f.clone();
    }

    static 
    {
        a = new d("IDENTITY", 0);
        b = new e("UPPER_CAMEL_CASE", 1);
        c = new f("UPPER_CAMEL_CASE_WITH_SPACES", 2);
        d = new g("LOWER_CASE_WITH_UNDERSCORES", 3);
        e = new h("LOWER_CASE_WITH_DASHES", 4);
        f = (new c[] {
            a, b, c, d, e
        });
    }
}
