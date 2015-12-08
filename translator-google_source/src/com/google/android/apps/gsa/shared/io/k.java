// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.io;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.apps.gsa.shared.util.b;
import com.google.android.apps.gsa.shared.util.debug.a.a;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

// Referenced classes of package com.google.android.apps.gsa.shared.io:
//            i, l, j, o, 
//            p

public final class k
    implements a
{

    private final Queue a = new ConcurrentLinkedQueue();
    private final Object b = new Object();
    private final b c;
    private final p d = null;
    private final SparseIntArray e = new SparseIntArray(32);
    private final SparseArray f = new SparseArray();
    private final SparseArray g = new SparseArray();
    private final SparseArray h = new SparseArray();
    private final SparseArray i = new SparseArray();
    private final SparseArray j = new SparseArray();

    public k(b b1)
    {
        c = b1;
    }

    static long a(List list)
    {
        list = list.iterator();
        i i1;
        int j1;
        long l1;
        for (l1 = 0L; list.hasNext(); l1 = (long)(i1.c.length() + j1 + 4) + l1)
        {
            i1 = (i)list.next();
            j1 = i1.b.length();
        }

        return l1;
    }

    static long b(l l1)
    {
        return a(l1.h) + (long)(l1.f.toString().length() + l1.g.length() + 4);
    }

    public final j a(l l1)
    {
        obj1 = new j(l1, c, d);
        l1 = ((l) (b));
        l1;
        JVM INSTR monitorenter ;
_L2:
        j j1;
        SparseIntArray sparseintarray;
        SparseArray sparsearray;
        SparseArray sparsearray1;
        SparseArray sparsearray2;
        SparseArray sparsearray3;
        SparseArray sparsearray4;
        if (a.size() <= 49)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = (j)a.remove();
        sparseintarray = e;
        sparsearray = f;
        sparsearray1 = h;
        sparsearray2 = i;
        sparsearray3 = j;
        sparsearray4 = g;
        synchronized (b)
        {
            int i1 = j1.b.m;
            sparseintarray.put(i1, sparseintarray.get(i1, 0) + 1);
            sparsearray2.put(i1, Long.valueOf(j1.d + ((Long)sparsearray2.get(i1, Long.valueOf(0L))).longValue()));
            sparsearray.put(i1, Long.valueOf(j1.c + ((Long)sparsearray.get(i1, Long.valueOf(0L))).longValue()));
            if (j1.b != null)
            {
                sparsearray3.put(i1, Long.valueOf(b(j1.b) + ((Long)sparsearray3.get(i1, Long.valueOf(0L))).longValue()));
            }
            if (j1.f != null)
            {
                sparsearray1.put(i1, Long.valueOf(a(((List) (j1.f.c))) + ((Long)sparsearray1.get(i1, Long.valueOf(0L))).longValue()));
            }
            long l2 = j1.e;
            sparsearray4.put(i1, Long.valueOf(((Long)sparsearray4.get(i1, Long.valueOf(0L))).longValue() + l2));
        }
        if (true) goto _L2; else goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        Exception exception;
        exception;
        l1;
        JVM INSTR monitorexit ;
        throw exception;
_L1:
        a.add(obj1);
        l1;
        JVM INSTR monitorexit ;
        return ((j) (obj1));
    }
}
