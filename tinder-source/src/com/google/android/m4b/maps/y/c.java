// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.y;


public final class c
{

    public static String a(String s)
    {
        int j = s.length();
        int i = 0;
        do
        {
label0:
            {
                String s1 = s;
                if (i < j)
                {
                    if (!a(s.charAt(i)))
                    {
                        break label0;
                    }
                    s = s.toCharArray();
                    for (; i < j; i++)
                    {
                        char c1 = s[i];
                        if (a(c1))
                        {
                            s[i] = (char)(c1 ^ 0x20);
                        }
                    }

                    s1 = String.valueOf(s);
                }
                return s1;
            }
            i++;
        } while (true);
    }

    private static boolean a(char c1)
    {
        return c1 >= 'A' && c1 <= 'Z';
    }
}
