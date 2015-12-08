// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.app.Activity;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

// Referenced classes of package com.jirbo.adcolony:
//            a, AdColony

class q
{

    public static final int a = 30;
    public static String b = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx  x          xxxxxxx                          xxxx x                          xxxxx";
    public static String c = "0123456789ABCDEF";
    public static String d = "0123456789abcdef";

    q()
    {
    }

    public static int a(char c1)
    {
        int i = c.indexOf(c1);
        if (i >= 0)
        {
            c1 = i;
        } else
        {
            int j = d.indexOf(c1);
            c1 = j;
            if (j < 0)
            {
                return 0;
            }
        }
        return c1;
    }

    public static String a(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        int j = s.length();
        int i = 0;
        while (i < j) 
        {
            char c1 = s.charAt(i);
            if (c1 < '\200' && b.charAt(c1) == ' ')
            {
                stringbuilder.append(c1);
            } else
            {
                stringbuilder.append('%');
                int k = c1 >> 4 & 0xf;
                int l = c1 & 0xf;
                if (k < 10)
                {
                    stringbuilder.append((char)(k + 48));
                } else
                {
                    stringbuilder.append((char)((k + 65) - 10));
                }
                if (l < 10)
                {
                    stringbuilder.append((char)(l + 48));
                } else
                {
                    stringbuilder.append((char)((l + 65) - 10));
                }
            }
            i++;
        }
        return stringbuilder.toString();
    }

    static boolean a()
    {
        if (a.E)
        {
            return true;
        }
        NetworkInfo networkinfo = ((ConnectivityManager)AdColony.activity().getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo == null)
        {
            return false;
        }
        return networkinfo.getType() == 1;
    }

    public static String b(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        int j = s.length();
        int i = 0;
        while (i < j) 
        {
            char c1 = s.charAt(i);
            if (c1 == '%')
            {
                char c2;
                int k;
                if (i + 1 < j)
                {
                    c1 = s.charAt(i + 1);
                } else
                {
                    c1 = '0';
                }
                if (i + 2 < j)
                {
                    c2 = s.charAt(i + 2);
                } else
                {
                    c2 = '0';
                }
                k = a(c1);
                stringbuilder.append((char)(a(c2) | k << 8));
                i += 2;
            } else
            {
                stringbuilder.append(c1);
            }
            i++;
        }
        return stringbuilder.toString();
    }

    static boolean b()
    {
        if (a.E)
        {
            return false;
        }
        NetworkInfo networkinfo = ((ConnectivityManager)AdColony.activity().getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo == null)
        {
            return false;
        }
        int i = networkinfo.getType();
        return i == 0 || i >= 2;
    }

    static boolean c()
    {
        return a() || b();
    }

    public static String d()
    {
        if (a())
        {
            return "wifi";
        }
        if (b())
        {
            return "cell";
        } else
        {
            return "offline";
        }
    }

}
