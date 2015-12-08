// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;


// Referenced classes of package com.jcp.util:
//            bq

public final class bv
{

    public static String a(String s)
    {
        return a(s, null);
    }

    public static transient String a(String s, char ac[])
    {
        int i;
        if (ac == null)
        {
            i = -1;
        } else
        {
            i = ac.length;
        }
        if (bq.a(s) || i == 0)
        {
            return s;
        }
        s = s.toCharArray();
        int j = 0;
        boolean flag1 = true;
        while (j < s.length) 
        {
            char c = s[j];
            boolean flag;
            if (a(c, ac))
            {
                flag = true;
            } else
            {
                flag = flag1;
                if (flag1)
                {
                    s[j] = Character.toTitleCase(c);
                    flag = false;
                }
            }
            j++;
            flag1 = flag;
        }
        return new String(s);
    }

    private static boolean a(char c, char ac[])
    {
        boolean flag1 = false;
        if (ac != null) goto _L2; else goto _L1
_L1:
        boolean flag = Character.isWhitespace(c);
_L4:
        return flag;
_L2:
        int j = ac.length;
        int i = 0;
        do
        {
            flag = flag1;
            if (i >= j)
            {
                continue;
            }
            if (c == ac[i])
            {
                return true;
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String b(String s)
    {
        return b(s, null);
    }

    public static transient String b(String s, char ac[])
    {
        int i;
        if (ac == null)
        {
            i = -1;
        } else
        {
            i = ac.length;
        }
        if (bq.a(s) || i == 0)
        {
            return s;
        } else
        {
            return a(s.toLowerCase(), ac);
        }
    }
}
