// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.common.data:
//            DataBuffer, d

public abstract class f extends DataBuffer
{

    private boolean jA;
    private ArrayList jB;

    protected f(d d1)
    {
        super(d1);
        jA = false;
    }

    private void aN()
    {
        this;
        JVM INSTR monitorenter ;
        if (jA) goto _L2; else goto _L1
_L1:
        int k;
        k = jf.getCount();
        jB = new ArrayList();
        if (k <= 0) goto _L4; else goto _L3
_L3:
        String s;
        String s2;
        jB.add(Integer.valueOf(0));
        s2 = getPrimaryDataMarkerColumn();
        int i = jf.q(0);
        s = jf.c(s2, 0, i);
        int j = 1;
_L9:
        if (j >= k) goto _L4; else goto _L5
_L5:
        String s1;
        int l = jf.q(j);
        s1 = jf.c(s2, j, l);
        if (s1.equals(s)) goto _L7; else goto _L6
_L6:
        jB.add(Integer.valueOf(j));
        s = s1;
          goto _L7
_L4:
        jA = true;
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
_L7:
        j++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private int u(int i)
    {
        if (i < 0 || i == jB.size())
        {
            return 0;
        }
        if (i == jB.size() - 1)
        {
            return jf.getCount() - ((Integer)jB.get(i)).intValue();
        } else
        {
            return ((Integer)jB.get(i + 1)).intValue() - ((Integer)jB.get(i)).intValue();
        }
    }

    protected abstract Object a(int i, int j);

    public final Object get(int i)
    {
        aN();
        return a(t(i), u(i));
    }

    public int getCount()
    {
        aN();
        return jB.size();
    }

    protected abstract String getPrimaryDataMarkerColumn();

    int t(int i)
    {
        if (i < 0 || i >= jB.size())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Position ").append(i).append(" is out of bounds for this buffer").toString());
        } else
        {
            return ((Integer)jB.get(i)).intValue();
        }
    }
}
