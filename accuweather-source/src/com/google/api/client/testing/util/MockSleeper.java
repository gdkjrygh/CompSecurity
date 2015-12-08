// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.testing.util;

import com.google.api.client.util.Sleeper;

public class MockSleeper
    implements Sleeper
{

    private int count;
    private long lastMillis;

    public MockSleeper()
    {
    }

    public final int getCount()
    {
        return count;
    }

    public final long getLastMillis()
    {
        return lastMillis;
    }

    public void sleep(long l)
        throws InterruptedException
    {
        count = count + 1;
        lastMillis = l;
    }
}
