// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal;


public abstract class AbstractPosition
{

    private Long timestamp;

    public AbstractPosition()
    {
        timestamp = null;
    }

    public AbstractPosition(long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("timestamp must be a positive integer, was ").append(l).toString());
        } else
        {
            timestamp = Long.valueOf(l);
            return;
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (AbstractPosition)obj;
        if (timestamp != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((AbstractPosition) (obj)).timestamp == null) goto _L1; else goto _L3
_L3:
        return false;
        if (timestamp.equals(((AbstractPosition) (obj)).timestamp)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public Long getTimestamp()
    {
        return timestamp;
    }

    public int hashCode()
    {
        int i;
        if (timestamp == null)
        {
            i = 0;
        } else
        {
            i = timestamp.hashCode();
        }
        return i + 31;
    }

    protected void setTimestamp(long l)
    {
        timestamp = Long.valueOf(l);
    }
}
