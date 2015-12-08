// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.activerecorbase;


public class CamelNotationHelper
{

    public CamelNotationHelper()
    {
    }

    public static String toJavaClassName(String s)
    {
        StringBuilder stringbuilder;
        int i;
        stringbuilder = new StringBuilder();
        s = s.toCharArray();
        i = 0;
_L2:
        char c;
        if (i >= s.length)
        {
            return stringbuilder.toString();
        }
        c = s[i];
        if (i != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuilder.append(s[i]);
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (c != '_')
        {
            stringbuilder.append(Character.toLowerCase(c));
        } else
        {
            int j = i + 1;
            i = j;
            if (j < s.length)
            {
                stringbuilder.append(s[j]);
                i = j;
            }
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public static String toJavaMethodName(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        s = s.toCharArray();
        int i = 0;
        do
        {
            if (i >= s.length)
            {
                return stringbuilder.toString();
            }
            char c = s[i];
            boolean flag;
            if (i == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag || c != '_')
            {
                stringbuilder.append(Character.toLowerCase(c));
            } else
            {
                int j = i + 1;
                i = j;
                if (j < s.length)
                {
                    stringbuilder.append(s[j]);
                    i = j;
                }
            }
            i++;
        } while (true);
    }

    public static String toSQLName(String s)
    {
        if (s.equalsIgnoreCase("_id"))
        {
            return "_id";
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
            char c;
            char c1;
            char c2;
            boolean flag;
            if (i > 0)
            {
                c = s[i - 1];
            } else
            {
                c = '\0';
            }
            c2 = s[i];
            if (i < s.length - 1)
            {
                c1 = s[i + 1];
            } else
            {
                c1 = '\0';
            }
            if (i == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag || Character.isLowerCase(c2))
            {
                stringbuilder.append(Character.toUpperCase(c2));
            } else
            if (Character.isUpperCase(c2))
            {
                if (Character.isLetterOrDigit(c))
                {
                    if (Character.isLowerCase(c))
                    {
                        stringbuilder.append('_').append(Character.toUpperCase(c2));
                    } else
                    if (c1 > 0 && Character.isLowerCase(c1))
                    {
                        stringbuilder.append('_').append(Character.toUpperCase(c2));
                    } else
                    {
                        stringbuilder.append(c2);
                    }
                } else
                {
                    stringbuilder.append(c2);
                }
            }
            i++;
        } while (true);
    }
}
