// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint.network;

import java.io.Serializable;

public abstract class Metric
{

    private final String name;

    public Metric(String s)
    {
        name = s;
    }

    public String getName()
    {
        return name;
    }

    public abstract Serializable getValue();
}
