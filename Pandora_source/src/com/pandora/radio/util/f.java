// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.util;

import org.apache.http.NameValuePair;

public class f
    implements NameValuePair
{

    private final String a;
    private final String b;

    public f(String s, float f1)
    {
        this(s, String.valueOf(f1));
    }

    public f(String s, long l)
    {
        this(s, String.valueOf(l));
    }

    public f(String s, String s1)
    {
        if (s == null)
        {
            throw new NullPointerException("name cannot be null");
        }
        if (s.length() == 0)
        {
            throw new IllegalArgumentException("name cannot be empty");
        } else
        {
            a = s;
            b = s1;
            return;
        }
    }

    public f(String s, boolean flag)
    {
        String s1;
        if (flag)
        {
            s1 = "1";
        } else
        {
            s1 = "0";
        }
        this(s, s1);
    }

    public String getName()
    {
        return a;
    }

    public String getValue()
    {
        return b;
    }

    public String toString()
    {
        return (new StringBuilder()).append("(").append(a).append(", ").append(b).append(")").toString();
    }
}
