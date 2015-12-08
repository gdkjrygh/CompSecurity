// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;


public class EventLog
{

    public EventLog()
    {
    }

    public static void writeEvent(int i, int j)
    {
        android.util.EventLog.writeEvent(i, j);
    }
}
