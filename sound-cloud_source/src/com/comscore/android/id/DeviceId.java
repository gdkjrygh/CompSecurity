// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.android.id;


public class DeviceId
{

    private String a;
    private String b;
    private int c;
    private int d;

    public DeviceId(String s)
    {
        b = s;
        c = 0;
        d = 0;
    }

    public DeviceId(String s, int i, int j)
    {
        b = s;
        c = i;
        d = j;
    }

    public DeviceId(String s, String s1, int i, int j)
    {
        a = s;
        b = s1;
        c = i;
        d = j;
    }

    public int getCommonness()
    {
        return c;
    }

    public String getId()
    {
        return b;
    }

    public String getName()
    {
        return a;
    }

    public int getPersistency()
    {
        return d;
    }

    public String getSuffix()
    {
        return (new StringBuilder()).append(getCommonness()).append(getPersistency()).toString();
    }
}
