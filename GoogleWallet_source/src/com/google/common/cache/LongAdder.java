// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import java.io.Serializable;

// Referenced classes of package com.google.common.cache:
//            Striped64, LongAddable

final class LongAdder extends Striped64
    implements LongAddable, Serializable
{

    public LongAdder()
    {
    }

    private long sum()
    {
        long l = base;
        Striped64.Cell acell[] = cells;
        long l1 = l;
        if (acell != null)
        {
            int j = acell.length;
            int i = 0;
            do
            {
                l1 = l;
                if (i >= j)
                {
                    break;
                }
                Striped64.Cell cell = acell[i];
                l1 = l;
                if (cell != null)
                {
                    l1 = l + cell.value;
                }
                i++;
                l = l1;
            } while (true);
        }
        return l1;
    }

    public final void add(long l)
    {
label0:
        {
            Striped64.Cell acell[] = cells;
            if (acell == null)
            {
                long l1 = base;
                if (casBase(l1, l1 + l))
                {
                    break label0;
                }
            }
            boolean flag1 = true;
            Striped64.HashCode hashcode = (Striped64.HashCode)threadHashCode.get();
            int i = hashcode.code;
            boolean flag = flag1;
            if (acell != null)
            {
                int j = acell.length;
                flag = flag1;
                if (j > 0)
                {
                    Striped64.Cell cell = acell[j - 1 & i];
                    flag = flag1;
                    if (cell != null)
                    {
                        long l2 = cell.value;
                        flag = cell.cas(l2, l2 + l);
                        if (flag)
                        {
                            break label0;
                        }
                    }
                }
            }
            retryUpdate(l, hashcode, flag);
        }
    }

    public final double doubleValue()
    {
        return (double)sum();
    }

    public final float floatValue()
    {
        return (float)sum();
    }

    final long fn(long l, long l1)
    {
        return l + l1;
    }

    public final void increment()
    {
        add(1L);
    }

    public final int intValue()
    {
        return (int)sum();
    }

    public final long longValue()
    {
        return sum();
    }

    public final String toString()
    {
        return Long.toString(sum());
    }
}
