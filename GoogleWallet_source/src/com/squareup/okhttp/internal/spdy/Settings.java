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

    private boolean isPersisted(int i)
    {
        return (persisted & 1 << i) != 0;
    }

    private boolean persistValue(int i)
    {
        return (persistValue & 1 << i) != 0;
    }

    final void clear()
    {
        persisted = 0;
        persistValue = 0;
        set = 0;
        Arrays.fill(values, 0);
    }

    final int flags(int i)
    {
        byte byte0 = 0;
        if (isPersisted(i))
        {
            byte0 = 2;
        }
        int j = byte0;
        if (persistValue(i))
        {
            j = byte0 | 1;
        }
        return j;
    }

    final int get(int i)
    {
        return values[i];
    }

    final int getHeaderTableSize()
    {
        if ((set & 2) != 0)
        {
            return values[1];
        } else
        {
            return -1;
        }
    }

    final int getInitialWindowSize(int i)
    {
        if ((set & 0x80) != 0)
        {
            i = values[7];
        }
        return i;
    }

    final int getMaxFrameSize(int i)
    {
        if ((set & 0x20) != 0)
        {
            i = values[5];
        }
        return i;
    }

    final boolean isSet(int i)
    {
        return (set & 1 << i) != 0;
    }

    final void merge(Settings settings)
    {
        for (int i = 0; i < 10; i++)
        {
            if (settings.isSet(i))
            {
                set(i, settings.flags(i), settings.get(i));
            }
        }

    }

    final Settings set(int i, int j, int k)
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

    final int size()
    {
        return Integer.bitCount(set);
    }
}
