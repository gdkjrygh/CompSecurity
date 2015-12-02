// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class b
{

    protected static final Comparator a = new Comparator() {

        public int a(byte abyte0[], byte abyte1[])
        {
            return abyte0.length - abyte1.length;
        }

        public int compare(Object obj, Object obj1)
        {
            return a((byte[])obj, (byte[])obj1);
        }

    };
    private final List b = new LinkedList();
    private final List c = new ArrayList(64);
    private int d;
    private final int e;

    public b(int i)
    {
        d = 0;
        e = i;
    }

    private void a()
    {
        this;
        JVM INSTR monitorenter ;
_L2:
        int i;
        int j;
        i = d;
        j = e;
        if (i > j)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        byte abyte0[] = (byte[])b.remove(0);
        c.remove(abyte0);
        d = d - abyte0.length;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        throw exception;
    }

    public void a(byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        if (abyte0 == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        i = abyte0.length;
        j = e;
        if (i <= j) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        b.add(abyte0);
        j = Collections.binarySearch(c, abyte0, a);
        i = j;
        if (j < 0)
        {
            i = -j - 1;
        }
        c.add(i, abyte0);
        d = d + abyte0.length;
        a();
        if (true) goto _L2; else goto _L4
_L4:
        abyte0;
        throw abyte0;
    }

    public byte[] a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        int j = 0;
_L6:
        if (j < c.size()) goto _L2; else goto _L1
_L1:
        byte abyte0[] = new byte[i];
_L4:
        this;
        JVM INSTR monitorexit ;
        return abyte0;
_L2:
        abyte0 = (byte[])c.get(j);
        if (abyte0.length < i)
        {
            break; /* Loop/switch isn't completed */
        }
        d = d - abyte0.length;
        c.remove(j);
        b.remove(abyte0);
        if (true) goto _L4; else goto _L3
        Exception exception;
        exception;
        throw exception;
_L3:
        j++;
        if (true) goto _L6; else goto _L5
_L5:
    }

}
