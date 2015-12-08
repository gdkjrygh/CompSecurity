// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;


public class StringUtils
{

    public static boolean isEmpty(CharSequence charsequence)
    {
        return charsequence == null || charsequence.length() == 0;
    }

    public static transient String join(Object aobj[])
    {
        return join(aobj, null);
    }

    public static String join(Object aobj[], String s)
    {
        if (aobj == null)
        {
            return null;
        } else
        {
            return join(aobj, s, 0, aobj.length);
        }
    }

    public static String join(Object aobj[], String s, int i, int j)
    {
        if (aobj == null)
        {
            return null;
        }
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        int k = j - i;
        if (k <= 0)
        {
            return "";
        }
        s = new StringBuilder(k * 16);
        for (int l = i; l < j; l++)
        {
            if (l > i)
            {
                s.append(s1);
            }
            if (aobj[l] != null)
            {
                s.append(aobj[l]);
            }
        }

        return s.toString();
    }

    public static String leftPad(String s, int i, char c)
    {
        String s1;
        if (s == null)
        {
            s1 = null;
        } else
        {
            int j = i - s.length();
            s1 = s;
            if (j > 0)
            {
                if (j > 8192)
                {
                    return leftPad(s, i, String.valueOf(c));
                } else
                {
                    return repeat(c, j).concat(s);
                }
            }
        }
        return s1;
    }

    public static String leftPad(String s, int i, String s1)
    {
        if (s == null)
        {
            s1 = null;
        } else
        {
            String s2 = s1;
            if (isEmpty(s1))
            {
                s2 = " ";
            }
            int j = s2.length();
            int k = i - s.length();
            s1 = s;
            if (k > 0)
            {
                if (j == 1 && k <= 8192)
                {
                    return leftPad(s, i, s2.charAt(0));
                }
                if (k == j)
                {
                    return s2.concat(s);
                }
                if (k < j)
                {
                    return s2.substring(0, k).concat(s);
                }
                s1 = new char[k];
                char ac[] = s2.toCharArray();
                for (i = 0; i < k; i++)
                {
                    s1[i] = ac[i % j];
                }

                return (new String(s1)).concat(s);
            }
        }
        return s1;
    }

    public static String repeat(char c, int i)
    {
        char ac[] = new char[i];
        for (i--; i >= 0; i--)
        {
            ac[i] = c;
        }

        return new String(ac);
    }

    public static String repeat(String s, int i)
    {
        String s1;
        if (s == null)
        {
            s1 = null;
        } else
        {
            if (i <= 0)
            {
                return "";
            }
            int j = s.length();
            s1 = s;
            if (i != 1)
            {
                s1 = s;
                if (j != 0)
                {
                    if (j == 1 && i <= 8192)
                    {
                        return repeat(s.charAt(0), i);
                    }
                    int l = j * i;
                    StringBuilder stringbuilder;
                    switch (j)
                    {
                    default:
                        stringbuilder = new StringBuilder(l);
                        for (int k = 0; k < i; k++)
                        {
                            stringbuilder.append(s);
                        }

                        break;

                    case 1: // '\001'
                        return repeat(s.charAt(0), i);

                    case 2: // '\002'
                        char c = s.charAt(0);
                        char c1 = s.charAt(1);
                        s = new char[l];
                        for (i = i * 2 - 2; i >= 0; i = i - 1 - 1)
                        {
                            s[i] = c;
                            s[i + 1] = c1;
                        }

                        return new String(s);
                    }
                    return stringbuilder.toString();
                }
            }
        }
        return s1;
    }
}
