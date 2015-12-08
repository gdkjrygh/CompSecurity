// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.orm;


public class StringUtil
{

    public StringUtil()
    {
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
        while (i < s.length) 
        {
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
            if (flag || Character.isLowerCase(c2) || Character.isDigit(c2))
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
        }
        return stringbuilder.toString();
    }
}
