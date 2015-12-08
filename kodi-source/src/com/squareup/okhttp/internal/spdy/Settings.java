// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import java.util.Arrays;

public final class Settings
{

    private int persistValue;
    private int persisted;
    private int set;
    private final int values[] = new int[10];

    public Settings()
    {
    }

    void clear()
    {
        persisted = 0;
        persistValue = 0;
        set = 0;
        Arrays.fill(values, 0);
    }

    int flags(int i)
    {
        int j = 0;
        if (isPersisted(i))
        {
            j = 0 | 2;
        }
        int k = j;
        if (persistValue(i))
        {
            k = j | 1;
        }
        return k;
    }

    int get(int i)
    {
        return values[i];
    }

    int getHeaderTableSize()
    {
        if ((set & 2) != 0)
        {
            return values[1];
        } else
        {
            return -1;
        }
    }

    int getInitialWindowSize(int i)
    {
        if ((set & 0x80) != 0)
        {
            i = values[7];
        }
        return i;
    }

    int getMaxFrameSize(int i)
    {
        if ((set & 0x20) != 0)
        {
            i = values[5];
        }
        return i;
    }

    boolean isPersisted(int i)
    {
        return (persisted & 1 << i) != 0;
    }

    boolean isSet(int i)
    {
        return (set & 1 << i) != 0;
    }

    void merge(Settings settings)
    {
        int i = 0;
        while (i < 10) 
        {
            if (settings.isSet(i))
            {
                set(i, settings.flags(i), settings.get(i));
            }
            i++;
        }
    }

    boolean persistValue(int i)
    {
        return (persistValue & 1 << i) != 0;
    }

    Settings set(int i, int j, int k)
    {
        if (i >= values.length)
        {
            return this;
        }
        int l = 1 << i;
        set = set | l;
        if ((j & 1) != 0)
        {
            persistValue = persistValue | l;
        } else
        {
            persistValue = persistValue & ~l;
        }
        if ((j & 2) != 0)
        {
            persisted = persisted | l;
        } else
        {
            persisted = persisted & ~l;
        }
        values[i] = k;
        return this;
    }

    int size()
    {
        return Integer.bitCount(set);
    }
}
