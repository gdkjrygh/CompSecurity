// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.android.id;


public class DeviceId
{

    private String a;
    private int b;
    private int c;

    public DeviceId(String s)
    {
        a = s;
        b = 0;
        c = 0;
    }

    public DeviceId(String s, int i, int j)
    {
        a = s;
        b = i;
        c = j;
    }

    public int getCommonness()
    {
        return b;
    }

    public String getId()
    {
        return a;
    }

    public int getPersistency()
    {
        return c;
    }

    public String getSuffix()
    {
        return (new StringBuilder()).append(getCommonness()).append("").append(getPersistency()).toString();
    }
}
