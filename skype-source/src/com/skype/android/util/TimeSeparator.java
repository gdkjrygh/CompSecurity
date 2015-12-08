// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;


public class TimeSeparator
    implements Comparable
{

    private String a;
    private long b;

    public TimeSeparator(String s, long l)
    {
        a = s;
        b = l;
    }

    public final String a()
    {
        return a;
    }

    public final long b()
    {
        return b;
    }

    public volatile int compareTo(Object obj)
    {
        return (int)(((TimeSeparator)obj).b - b);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof TimeSeparator)
        {
            obj = (TimeSeparator)obj;
            return a.equals(((TimeSeparator) (obj)).a);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return a.hashCode();
    }
}
