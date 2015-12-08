// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.stats;


public abstract class StatsEvent
{

    public StatsEvent()
    {
    }

    public abstract long getDurationMillis();

    public abstract int getEventType();

    public abstract String getSpecificString();

    public abstract long getTimeMillis();

    public String toString()
    {
        return (new StringBuilder()).append(getTimeMillis()).append("\t").append(getEventType()).append("\t").append(getDurationMillis()).append(getSpecificString()).toString();
    }
}
