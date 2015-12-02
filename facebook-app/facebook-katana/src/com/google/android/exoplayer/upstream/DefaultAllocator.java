// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;

import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.Util;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer.upstream:
//            Allocator, Allocation

public final class DefaultAllocator
    implements Allocator
{

    private final int a;
    private final byte b[];
    private int c;
    private int d;
    private Allocation e[];

    public DefaultAllocator(int i)
    {
        this(i, 0);
    }

    private DefaultAllocator(int i, int j)
    {
        boolean flag1 = true;
        int k = 0;
        super();
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.a(flag);
        if (j >= 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Assertions.a(flag);
        a = i;
        d = j;
        e = new Allocation[j + 100];
        if (j > 0)
        {
            b = new byte[j * i];
            for (; k < j; k++)
            {
                e[k] = new Allocation(b, k * i);
            }

        } else
        {
            b = null;
        }
    }

    public final Allocation a()
    {
        this;
        JVM INSTR monitorenter ;
        c = c + 1;
        if (d <= 0) goto _L2; else goto _L1
_L1:
        Allocation aallocation[];
        int i;
        aallocation = e;
        i = d - 1;
        d = i;
        Allocation allocation = aallocation[i];
        e[d] = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return allocation;
_L2:
        allocation = new Allocation(new byte[a], 0);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(int i)
    {
        int j = 0;
        this;
        JVM INSTR monitorenter ;
        int k;
        k = Math.max(0, Util.a(i, a) - c);
        i = d;
        if (k < i) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        i = k;
        int l;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        l = d - 1;
        i = j;
        j = l;
_L4:
        if (i > j)
        {
            break; /* Loop/switch isn't completed */
        }
        Allocation allocation = e[i];
        if (allocation.a == b)
        {
            i++;
            continue; /* Loop/switch isn't completed */
        }
        Allocation allocation1 = e[i];
        if (allocation1.a != b)
        {
            j--;
            continue; /* Loop/switch isn't completed */
        }
        e[i] = allocation1;
        e[j] = allocation;
        j--;
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        i = Math.max(k, i);
        if (i >= d)
        {
            continue; /* Loop/switch isn't completed */
        }
        Arrays.fill(e, i, d, null);
        d = i;
        if (true) goto _L1; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(Allocation allocation)
    {
        this;
        JVM INSTR monitorenter ;
        Allocation aallocation[];
        int i;
        boolean flag;
        if (allocation.a != b && allocation.a.length != a)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        Assertions.a(flag);
        c = c - 1;
        if (d == e.length)
        {
            e = (Allocation[])Arrays.copyOf(e, e.length * 2);
        }
        aallocation = e;
        i = d;
        d = i + 1;
        aallocation[i] = allocation;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        allocation;
        throw allocation;
    }

    public final int b()
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        int j;
        i = c;
        j = a;
        this;
        JVM INSTR monitorexit ;
        return i * j;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b(int i)
    {
        this;
        JVM INSTR monitorenter ;
        for (; b() > i; wait()) { }
        break MISSING_BLOCK_LABEL_22;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public final int c()
    {
        return a;
    }
}
