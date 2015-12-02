// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threads;


public class m
{

    public m()
    {
    }

    public static String a(long l)
    {
        return (new StringBuilder()).append("mms-sms.").append(l).toString();
    }

    public static String a(String s)
    {
        return (new StringBuilder()).append("t_").append(s).toString();
    }

    public static String b(long l)
    {
        return (new StringBuilder()).append("smsid.").append(l).toString();
    }

    public static String b(String s)
    {
        return (new StringBuilder()).append("m_").append(s).toString();
    }

    public static long c(String s)
    {
        if (s.startsWith("mms-sms."))
        {
            return Long.parseLong(s.substring("mms-sms.".length()));
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Not a valid MmsSms thread id: ").append(s).toString());
        }
    }

    public static String c(long l)
    {
        return (new StringBuilder()).append("mmsid.").append(l).toString();
    }

    public static long d(String s)
    {
        if (s.startsWith("smsid."))
        {
            return Long.parseLong(s.substring("smsid.".length()));
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Not a valid sms message id: ").append(s).toString());
        }
    }

    public static String d(long l)
    {
        return (new StringBuilder()).append("callid.").append(l).toString();
    }

    public static long e(String s)
    {
        if (s.startsWith("mmsid."))
        {
            return Long.parseLong(s.substring("mmsid.".length()));
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Not a valid mms message id: ").append(s).toString());
        }
    }

    public static boolean f(String s)
    {
        return s.startsWith("m_");
    }

    public static boolean g(String s)
    {
        return s.startsWith("mms-sms.");
    }

    public static boolean h(String s)
    {
        return s.startsWith("smsid.");
    }

    public static boolean i(String s)
    {
        return s.startsWith("mmsid.");
    }
}
