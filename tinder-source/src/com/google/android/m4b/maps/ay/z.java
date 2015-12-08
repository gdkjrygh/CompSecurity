// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import com.google.android.m4b.maps.y.j;

public final class z
{

    public String a;
    private String b;
    private String c;

    public z()
    {
        String s;
label0:
        {
            super();
            String s1 = a(null);
            String s2 = a(System.getProperty("microedition.locale"));
            if (!"en".equals(s2))
            {
                s = s2;
                if (s2.length() != 2)
                {
                    break label0;
                }
                s = s2;
                if (!s1.startsWith(s2))
                {
                    break label0;
                }
            }
            s = s1;
        }
        b(s);
        c(null);
    }

    public static String a(String s)
    {
        String s1;
label0:
        {
            String s2 = "en";
            s1 = s2;
            if (s == null)
            {
                break label0;
            }
            String as[] = s.replace('-', '_').split("_");
            if (as[0].length() != 2)
            {
                s1 = s2;
                if (as[0].length() != 3)
                {
                    break label0;
                }
            }
            s = as[0].toLowerCase();
            s1 = s;
            if (as.length >= 2)
            {
                s1 = s;
                if (as[1].length() == 2)
                {
                    s = String.valueOf(s);
                    s1 = String.valueOf(as[1].toUpperCase());
                    s1 = (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append("_").append(s1).toString();
                }
            }
        }
        return s1;
    }

    public static String a(String s, String as[])
    {
        String s1;
        boolean flag;
        if (as.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.b(flag);
        if (s == null)
        {
            s1 = "en";
        } else
        if (s.equals("en_AU") || s.equals("en_NZ"))
        {
            s1 = "en_GB";
        } else
        {
            s1 = s;
            if (s.startsWith("nb"))
            {
                s1 = "no";
            }
        }
        do
        {
            s = d(s1);
            byte byte1 = -1;
            int i = 0;
            int k = 0;
            while (i < as.length) 
            {
                String s2 = as[i];
                byte byte0;
                if (i == 0)
                {
                    byte0 = 1;
                } else
                {
                    byte0 = 0;
                }
                if (s1.equals(s2))
                {
                    byte0 = 4;
                } else
                if (s1.startsWith(s2))
                {
                    byte0 = 3;
                } else
                if (s2.startsWith(s))
                {
                    byte0 = 2;
                } else
                if (byte0 != 0)
                {
                    byte0 = 1;
                } else
                {
                    byte0 = 0;
                }
                if (byte0 > byte1)
                {
                    k = i;
                } else
                {
                    byte0 = byte1;
                }
                i++;
                byte1 = byte0;
            }
            return as[k];
        } while (true);
    }

    public static String d(String s)
    {
        int i = f(s);
        if (i < 0)
        {
            return s;
        } else
        {
            return s.substring(0, i);
        }
    }

    public static String e(String s)
    {
        int i = f(s);
        String s1;
        if (i < 0)
        {
            s1 = null;
        } else
        {
            s1 = s.substring(i + 1);
            i = f(s1);
            s = s1;
            if (i >= 0)
            {
                s = s1.substring(0, i);
            }
            s1 = s;
            if (s.length() <= 0)
            {
                return null;
            }
        }
        return s1;
    }

    private static int f(String s)
    {
        int i = s.indexOf('_');
        int k = s.indexOf('-');
        if (i >= 0)
        {
            if (k < 0)
            {
                return i;
            }
            if (i < k)
            {
                return i;
            }
        }
        return k;
    }

    public final void b(String s)
    {
        b = a(s);
    }

    public final void c(String s)
    {
        if (s != null)
        {
            s = a(s);
        } else
        {
            s = b;
        }
        a = s;
        c = d(a);
    }
}
