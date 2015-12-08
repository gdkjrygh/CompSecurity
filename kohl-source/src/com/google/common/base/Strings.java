// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            Preconditions

public final class Strings
{

    private Strings()
    {
    }

    public static String emptyToNull(String s)
    {
        String s1 = s;
        if (isNullOrEmpty(s))
        {
            s1 = null;
        }
        return s1;
    }

    public static boolean isNullOrEmpty(String s)
    {
        return s == null || s.length() == 0;
    }

    public static String nullToEmpty(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        return s1;
    }

    public static String padEnd(String s, int i, char c)
    {
        Preconditions.checkNotNull(s);
        if (s.length() >= i)
        {
            return s;
        }
        StringBuilder stringbuilder = new StringBuilder(i);
        stringbuilder.append(s);
        for (int j = s.length(); j < i; j++)
        {
            stringbuilder.append(c);
        }

        return stringbuilder.toString();
    }

    public static String padStart(String s, int i, char c)
    {
        Preconditions.checkNotNull(s);
        if (s.length() >= i)
        {
            return s;
        }
        StringBuilder stringbuilder = new StringBuilder(i);
        for (int j = s.length(); j < i; j++)
        {
            stringbuilder.append(c);
        }

        stringbuilder.append(s);
        return stringbuilder.toString();
    }

    public static String repeat(String s, int i)
    {
        Preconditions.checkNotNull(s);
        StringBuilder stringbuilder;
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "invalid count: %s", new Object[] {
            Integer.valueOf(i)
        });
        stringbuilder = new StringBuilder(s.length() * i);
        for (int j = 0; j < i; j++)
        {
            stringbuilder.append(s);
        }

        return stringbuilder.toString();
    }
}
