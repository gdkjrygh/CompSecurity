// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c.a.a;


public final class h
{

    public static String a(String s)
    {
        int j = s.length();
        char ac[] = new char[j + 2];
        ac[0] = 'i';
        ac[1] = 's';
        char c1 = s.charAt(0);
        char c = c1;
        if (c1 >= 'a')
        {
            c = c1;
            if (c1 <= 'z')
            {
                c = (char)(c1 - 32);
            }
        }
        ac[2] = c;
        for (int i = 1; i < j; i++)
        {
            ac[i + 2] = s.charAt(i);
        }

        return new String(ac);
    }
}
