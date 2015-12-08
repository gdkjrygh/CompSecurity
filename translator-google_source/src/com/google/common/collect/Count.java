// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;

final class Count
    implements Serializable
{

    private int value;

    Count(int i)
    {
        value = i;
    }

    public final int addAndGet(int i)
    {
        i = value + i;
        value = i;
        return i;
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof Count) && ((Count)obj).value == value;
    }

    public final int get()
    {
        return value;
    }

    public final int getAndAdd(int i)
    {
        int j = value;
        value = j + i;
        return j;
    }

    public final int getAndSet(int i)
    {
        int j = value;
        value = i;
        return j;
    }

    public final int hashCode()
    {
        return value;
    }

    public final void set(int i)
    {
        value = i;
    }

    public final String toString()
    {
        return Integer.toString(value);
    }
}
