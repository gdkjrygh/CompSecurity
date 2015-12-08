// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package kik.android.util:
//            at

public final class as
{

    protected static final Comparator a = new at();
    private List b;
    private List c;
    private int d;
    private final int e;

    public as(int i)
    {
        b = new LinkedList();
        c = new ArrayList(64);
        d = 0;
        e = i;
    }

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
        int ai[];
        for (; d > e; d = d - ai.length)
        {
            ai = (int[])b.remove(0);
            c.remove(ai);
        }

        break MISSING_BLOCK_LABEL_57;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(int ai[])
    {
        this;
        JVM INSTR monitorenter ;
        if (ai == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        i = ai.length;
        j = e;
        if (i <= j) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        b.add(ai);
        j = Collections.binarySearch(c, ai, a);
        i = j;
        if (j < 0)
        {
            i = -j - 1;
        }
        c.add(i, ai);
        d = d + ai.length;
        a();
        if (true) goto _L2; else goto _L4
_L4:
        ai;
        throw ai;
    }

    public final int[] a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        int j = 0;
_L8:
        if (j >= c.size()) goto _L2; else goto _L1
_L1:
        int ai[] = (int[])c.get(j);
        if (ai.length < i) goto _L4; else goto _L3
_L3:
        d = d - ai.length;
        c.remove(j);
        b.remove(ai);
_L6:
        this;
        JVM INSTR monitorexit ;
        return ai;
_L4:
        j++;
        continue; /* Loop/switch isn't completed */
_L2:
        ai = new int[i];
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
        if (true) goto _L8; else goto _L7
_L7:
    }

}
