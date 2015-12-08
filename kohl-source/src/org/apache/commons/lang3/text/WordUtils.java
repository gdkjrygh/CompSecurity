// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.text;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;

public class WordUtils
{

    public WordUtils()
    {
    }

    public static String capitalize(String s)
    {
        return capitalize(s, null);
    }

    public static transient String capitalize(String s, char ac[])
    {
        int i;
        if (ac == null)
        {
            i = -1;
        } else
        {
            i = ac.length;
        }
        if (StringUtils.isEmpty(s) || i == 0)
        {
            return s;
        }
        s = s.toCharArray();
        boolean flag1 = true;
        int j = 0;
        while (j < s.length) 
        {
            char c = s[j];
            boolean flag;
            if (isDelimiter(c, ac))
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

    public static String capitalizeFully(String s)
    {
        return capitalizeFully(s, null);
    }

    public static transient String capitalizeFully(String s, char ac[])
    {
        int i;
        if (ac == null)
        {
            i = -1;
        } else
        {
            i = ac.length;
        }
        if (StringUtils.isEmpty(s) || i == 0)
        {
            return s;
        } else
        {
            return capitalize(s.toLowerCase(), ac);
        }
    }

    public static String initials(String s)
    {
        return initials(s, null);
    }

    public static transient String initials(String s, char ac[])
    {
        if (StringUtils.isEmpty(s))
        {
            return s;
        }
        if (ac != null && ac.length == 0)
        {
            return "";
        }
        int l = s.length();
        char ac1[] = new char[l / 2 + 1];
        int j = 1;
        int k = 0;
        int i = 0;
        while (k < l) 
        {
            char c = s.charAt(k);
            if (isDelimiter(c, ac))
            {
                j = 1;
            } else
            if (j != 0)
            {
                j = i + 1;
                ac1[i] = c;
                boolean flag = false;
                i = j;
                j = ((flag) ? 1 : 0);
            }
            k++;
        }
        return new String(ac1, 0, i);
    }

    private static boolean isDelimiter(char c, char ac[])
    {
        if (ac == null)
        {
            return Character.isWhitespace(c);
        }
        int j = ac.length;
        for (int i = 0; i < j; i++)
        {
            if (c == ac[i])
            {
                return true;
            }
        }

        return false;
    }

    public static String swapCase(String s)
    {
        if (StringUtils.isEmpty(s))
        {
            return s;
        }
        s = s.toCharArray();
        boolean flag = true;
        int i = 0;
        while (i < s.length) 
        {
            char c = s[i];
            if (Character.isUpperCase(c))
            {
                s[i] = Character.toLowerCase(c);
                flag = false;
            } else
            if (Character.isTitleCase(c))
            {
                s[i] = Character.toLowerCase(c);
                flag = false;
            } else
            if (Character.isLowerCase(c))
            {
                if (flag)
                {
                    s[i] = Character.toTitleCase(c);
                    flag = false;
                } else
                {
                    s[i] = Character.toUpperCase(c);
                }
            } else
            {
                flag = Character.isWhitespace(c);
            }
            i++;
        }
        return new String(s);
    }

    public static String uncapitalize(String s)
    {
        return uncapitalize(s, null);
    }

    public static transient String uncapitalize(String s, char ac[])
    {
        int i;
        if (ac == null)
        {
            i = -1;
        } else
        {
            i = ac.length;
        }
        if (StringUtils.isEmpty(s) || i == 0)
        {
            return s;
        }
        s = s.toCharArray();
        boolean flag1 = true;
        int j = 0;
        while (j < s.length) 
        {
            char c = s[j];
            boolean flag;
            if (isDelimiter(c, ac))
            {
                flag = true;
            } else
            {
                flag = flag1;
                if (flag1)
                {
                    s[j] = Character.toLowerCase(c);
                    flag = false;
                }
            }
            j++;
            flag1 = flag;
        }
        return new String(s);
    }

    public static String wrap(String s, int i)
    {
        return wrap(s, i, null, false);
    }

    public static String wrap(String s, int i, String s1, boolean flag)
    {
        if (s == null)
        {
            return null;
        }
        String s2 = s1;
        if (s1 == null)
        {
            s2 = SystemUtils.LINE_SEPARATOR;
        }
        int j = i;
        if (i < 1)
        {
            j = 1;
        }
        int k = s.length();
        i = 0;
        s1 = new StringBuilder(k + 32);
        while (k - i > j) 
        {
            if (s.charAt(i) == ' ')
            {
                i++;
            } else
            {
                int l = s.lastIndexOf(' ', j + i);
                if (l >= i)
                {
                    s1.append(s.substring(i, l));
                    s1.append(s2);
                    i = l + 1;
                } else
                if (flag)
                {
                    s1.append(s.substring(i, j + i));
                    s1.append(s2);
                    i += j;
                } else
                {
                    int i1 = s.indexOf(' ', j + i);
                    if (i1 >= 0)
                    {
                        s1.append(s.substring(i, i1));
                        s1.append(s2);
                        i = i1 + 1;
                    } else
                    {
                        s1.append(s.substring(i));
                        i = k;
                    }
                }
            }
        }
        s1.append(s.substring(i));
        return s1.toString();
    }
}
