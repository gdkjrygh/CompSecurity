// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;


final class HeaderParser
{
    public static interface CacheControlHandler
    {

        public abstract void handle(String s, String s1);
    }


    private HeaderParser()
    {
    }

    public static void parseCacheControl(String s, CacheControlHandler cachecontrolhandler)
    {
        for (int i = 0; i < s.length();)
        {
            int j = skipUntil(s, i, "=,;");
            String s2 = s.substring(i, j).trim();
            if (j == s.length() || s.charAt(j) == ',' || s.charAt(j) == ';')
            {
                i = j + 1;
                cachecontrolhandler.handle(s2, null);
            } else
            {
                j = skipWhitespace(s, j + 1);
                String s1;
                if (j < s.length() && s.charAt(j) == '"')
                {
                    i = j + 1;
                    j = skipUntil(s, i, "\"");
                    s1 = s.substring(i, j);
                    i = j + 1;
                } else
                {
                    i = skipUntil(s, j, ",;");
                    s1 = s.substring(j, i).trim();
                }
                cachecontrolhandler.handle(s2, s1);
            }
        }

    }

    public static int parseSeconds(String s)
    {
        long l;
        try
        {
            l = Long.parseLong(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return -1;
        }
        if (l > 0x7fffffffL)
        {
            return 0x7fffffff;
        }
        if (l < 0L)
        {
            return 0;
        } else
        {
            return (int)l;
        }
    }

    public static int skipUntil(String s, int i, String s1)
    {
        do
        {
            if (i >= s.length() || s1.indexOf(s.charAt(i)) != -1)
            {
                return i;
            }
            i++;
        } while (true);
    }

    public static int skipWhitespace(String s, int i)
    {
        do
        {
label0:
            {
                if (i < s.length())
                {
                    char c = s.charAt(i);
                    if (c == ' ' || c == '\t')
                    {
                        break label0;
                    }
                }
                return i;
            }
            i++;
        } while (true);
    }
}
