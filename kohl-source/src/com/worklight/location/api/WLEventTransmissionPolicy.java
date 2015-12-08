// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api;


public class WLEventTransmissionPolicy
    implements Cloneable
{

    private boolean eventStorageEnabled;
    private long interval;
    private int maxChunkSize;
    private int maxMemSize;
    private int numRetries;
    private long retryInterval;

    public WLEventTransmissionPolicy()
    {
        eventStorageEnabled = false;
        interval = 60000L;
        maxChunkSize = 64;
        maxMemSize = 1024;
        retryInterval = 10000L;
        numRetries = 2;
    }

    public static WLEventTransmissionPolicy getDefaultPolicy()
    {
        return new WLEventTransmissionPolicy();
    }

    public WLEventTransmissionPolicy clone()
    {
        return (new WLEventTransmissionPolicy()).setEventStorageEnabled(eventStorageEnabled).setInterval(interval).setMaxChunkSize(maxChunkSize).setMaxMemSize(maxMemSize).setNumRetries(numRetries).setRetryInterval(retryInterval);
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (WLEventTransmissionPolicy)obj;
            if (eventStorageEnabled != ((WLEventTransmissionPolicy) (obj)).eventStorageEnabled)
            {
                return false;
            }
            if (interval != ((WLEventTransmissionPolicy) (obj)).interval)
            {
                return false;
            }
            if (maxChunkSize != ((WLEventTransmissionPolicy) (obj)).maxChunkSize)
            {
                return false;
            }
            if (maxMemSize != ((WLEventTransmissionPolicy) (obj)).maxMemSize)
            {
                return false;
            }
            if (numRetries != ((WLEventTransmissionPolicy) (obj)).numRetries)
            {
                return false;
            }
            if (retryInterval != ((WLEventTransmissionPolicy) (obj)).retryInterval)
            {
                return false;
            }
        }
        return true;
    }

    public long getInterval()
    {
        return interval;
    }

    public int getMaxChunkSize()
    {
        return maxChunkSize;
    }

    public int getMaxMemSize()
    {
        return maxMemSize;
    }

    public int getNumRetries()
    {
        return numRetries;
    }

    public long getRetryInterval()
    {
        return retryInterval;
    }

    public int hashCode()
    {
        char c;
        if (eventStorageEnabled)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        return (((((c + 31) * 31 + (int)(interval ^ interval >>> 32)) * 31 + maxChunkSize) * 31 + maxMemSize) * 31 + numRetries) * 31 + (int)(retryInterval ^ retryInterval >>> 32);
    }

    public boolean isEventStorageEnabled()
    {
        return eventStorageEnabled;
    }

    public WLEventTransmissionPolicy setEventStorageEnabled(boolean flag)
    {
        eventStorageEnabled = flag;
        return this;
    }

    public WLEventTransmissionPolicy setInterval(long l)
    {
        interval = l;
        return this;
    }

    public WLEventTransmissionPolicy setMaxChunkSize(int i)
    {
        maxChunkSize = i;
        return this;
    }

    public WLEventTransmissionPolicy setMaxMemSize(int i)
    {
        maxMemSize = i;
        return this;
    }

    public WLEventTransmissionPolicy setNumRetries(int i)
    {
        numRetries = i;
        return this;
    }

    public WLEventTransmissionPolicy setRetryInterval(long l)
    {
        retryInterval = l;
        return this;
    }
}
