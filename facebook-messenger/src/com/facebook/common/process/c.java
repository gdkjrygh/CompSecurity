// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.process;


public class c
{

    public static final c a = new c(null, null);
    private final String b;
    private final String c;

    private c(String s, String s1)
    {
        b = s;
        c = s1;
    }

    public static c a(String s)
    {
        if (s == null)
        {
            return a;
        }
        String as[] = s.split(":");
        String s1;
        if (as.length > 1)
        {
            s1 = as[1];
        } else
        {
            s1 = "";
        }
        return new c(s, s1);
    }

    public static c a(String s, String s1)
    {
        if (s == null)
        {
            return a;
        }
        if (s1 == null || s1.equals(""))
        {
            return new c(s, "");
        } else
        {
            return new c((new StringBuilder()).append(s).append(":").append(s1).toString(), s1);
        }
    }

    public boolean a()
    {
        return b == null;
    }

    public String b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public boolean d()
    {
        return "".equals(c);
    }

    public String e()
    {
        if (a())
        {
            return "<unknown>";
        }
        if (d())
        {
            return "<default>";
        } else
        {
            return c;
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (c)obj;
            if (b == null)
            {
                if (((c) (obj)).b != null)
                {
                    return false;
                }
            } else
            {
                return b.equals(((c) (obj)).b);
            }
        }
        return true;
    }

    public int hashCode()
    {
        if (b != null)
        {
            return b.hashCode();
        } else
        {
            return 0;
        }
    }

    public String toString()
    {
        if (b == null)
        {
            return "<unknown>";
        } else
        {
            return b;
        }
    }

}
