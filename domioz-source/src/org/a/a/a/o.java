// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a;


public final class o
{

    public static String a(String s)
    {
        if (s == null || s.length() == 0)
        {
            return s;
        }
        int j = s.length();
        StringBuffer stringbuffer = new StringBuffer(j);
        int i = 0;
        boolean flag = true;
        while (i < j) 
        {
            char c = s.charAt(i);
            if (Character.isWhitespace(c))
            {
                stringbuffer.append(c);
                flag = true;
            } else
            if (flag)
            {
                stringbuffer.append(Character.toTitleCase(c));
                flag = false;
            } else
            {
                stringbuffer.append(c);
            }
            i++;
        }
        return stringbuffer.toString();
    }
}
