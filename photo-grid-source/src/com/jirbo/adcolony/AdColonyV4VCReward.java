// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;


public class AdColonyV4VCReward
{

    boolean a;
    String b;
    int c;

    AdColonyV4VCReward(boolean flag, String s, int i)
    {
        a = flag;
        b = s;
        c = i;
    }

    public int amount()
    {
        return c;
    }

    public String name()
    {
        return b;
    }

    public boolean success()
    {
        return a;
    }

    public String toString()
    {
        if (a)
        {
            return (new StringBuilder()).append(b).append(":").append(c).toString();
        } else
        {
            return "no reward";
        }
    }
}
