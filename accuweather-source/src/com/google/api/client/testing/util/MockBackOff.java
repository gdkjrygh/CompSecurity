// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.testing.util;

import com.google.api.client.util.BackOff;
import com.google.api.client.util.Preconditions;
import java.io.IOException;

public class MockBackOff
    implements BackOff
{

    private long backOffMillis;
    private int maxTries;
    private int numTries;

    public MockBackOff()
    {
        maxTries = 10;
    }

    public final int getMaxTries()
    {
        return numTries;
    }

    public final int getNumberOfTries()
    {
        return numTries;
    }

    public long nextBackOffMillis()
        throws IOException
    {
        if (numTries >= maxTries || backOffMillis == -1L)
        {
            return -1L;
        } else
        {
            numTries = numTries + 1;
            return backOffMillis;
        }
    }

    public void reset()
        throws IOException
    {
        numTries = 0;
    }

    public MockBackOff setBackOffMillis(long l)
    {
        boolean flag;
        if (l == -1L || l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        backOffMillis = l;
        return this;
    }

    public MockBackOff setMaxTries(int i)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        maxTries = i;
        return this;
    }
}
