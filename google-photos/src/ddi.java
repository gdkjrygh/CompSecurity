// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.LongSparseArray;

public final class ddi extends LongSparseArray
{

    private static final ddi a = new ddi();

    private ddi()
    {
        super(0);
    }

    private ddi(LongSparseArray longsparsearray)
    {
        super(longsparsearray.size());
        int j = longsparsearray.size();
        for (int i = 0; i < j; i++)
        {
            super.append(longsparsearray.keyAt(i), longsparsearray.valueAt(i));
        }

    }

    public static ddi a()
    {
        return a;
    }

    public static ddi a(LongSparseArray longsparsearray)
    {
        if (longsparsearray instanceof ddi)
        {
            return (ddi)longsparsearray;
        } else
        {
            return new ddi(longsparsearray);
        }
    }

    public final void append(long l, Object obj)
    {
        throw new UnsupportedOperationException("This array is immutable.");
    }

    public final void clear()
    {
        throw new UnsupportedOperationException("This array is immutable.");
    }

    public final void delete(long l)
    {
        throw new UnsupportedOperationException("This array is immutable.");
    }

    public final void put(long l, Object obj)
    {
        throw new UnsupportedOperationException("This array is immutable.");
    }

    public final void remove(long l)
    {
        throw new UnsupportedOperationException("This array is immutable.");
    }

    public final void removeAt(int i)
    {
        throw new UnsupportedOperationException("This array is immutable.");
    }

    public final void setValueAt(int i, Object obj)
    {
        throw new UnsupportedOperationException("This array is immutable.");
    }

}
