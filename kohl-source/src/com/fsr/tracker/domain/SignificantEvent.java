// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.domain;

import java.io.Serializable;

public class SignificantEvent
    implements Serializable
{

    private int count;
    private String name;

    public SignificantEvent()
    {
    }

    public SignificantEvent(String s)
    {
        name = s;
    }

    public SignificantEvent(String s, int i)
    {
        name = s;
        count = i;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (SignificantEvent)obj;
            if (count != ((SignificantEvent) (obj)).count)
            {
                return false;
            }
            if (name == null ? ((SignificantEvent) (obj)).name != null : !name.equals(((SignificantEvent) (obj)).name))
            {
                return false;
            }
        }
        return true;
    }

    public int getCount()
    {
        return count;
    }

    public int hashCode()
    {
        int i;
        if (name != null)
        {
            i = name.hashCode();
        } else
        {
            i = 0;
        }
        return i * 31 + count;
    }

    public void incrementCount()
    {
        count = count + 1;
    }

    public void setCount(int i)
    {
        count = i;
    }
}
