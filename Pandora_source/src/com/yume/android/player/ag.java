// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import com.yume.android.sdk.YuMePlayerException;

// Referenced classes of package com.yume.android.player:
//            B

final class ag
{

    private static B a = B.a();

    ag()
    {
    }

    public static boolean a(String s)
    {
        return s != null && !s.equals("");
    }

    public static String b(String s)
    {
        if (a(s))
        {
            return s.substring(7);
        } else
        {
            return null;
        }
    }

    public static boolean c(String s)
    {
        if (a(s))
        {
            return s.contains("file://");
        } else
        {
            return false;
        }
    }

    public static String d(String s)
    {
        if (s == null)
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder();
        s = s.toCharArray();
        int i = 0;
        do
        {
            if (i >= s.length)
            {
                return stringbuilder.toString();
            }
            char c1 = s[i];
            if (c1 >= '0' && c1 <= '9' || c1 >= 'a' && c1 <= 'z' || c1 >= 'A' && c1 <= 'Z' || ":-_.!~*'()/&=?@#$,;+".indexOf(c1) != -1)
            {
                stringbuilder.append(c1);
            } else
            {
                stringbuilder.append((new StringBuilder("%")).append(Integer.toHexString(c1)).toString());
            }
            i++;
        } while (true);
    }

    public static String e(String s)
    {
        if (s != null)
        {
            int i = s.lastIndexOf('/');
            int j = s.indexOf('?', i);
            if (i != -1)
            {
                if (j != -1)
                {
                    return s.substring(i + 1, j);
                } else
                {
                    return s.substring(i + 1);
                }
            }
        }
        return null;
    }

    public static void f(String s)
        throws YuMePlayerException
    {
        a.c(s);
        throw new YuMePlayerException(s);
    }

}
