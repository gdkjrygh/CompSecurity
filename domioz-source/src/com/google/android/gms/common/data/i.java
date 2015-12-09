// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.common.data:
//            a, DataHolder

public abstract class i extends a
{

    private boolean b;
    private ArrayList c;

    protected i(DataHolder dataholder)
    {
        super(dataholder);
        b = false;
    }

    private int b(int j)
    {
        if (j < 0 || j >= c.size())
        {
            throw new IllegalArgumentException((new StringBuilder("Position ")).append(j).append(" is out of bounds for this buffer").toString());
        } else
        {
            return ((Integer)c.get(j)).intValue();
        }
    }

    private void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (b) goto _L2; else goto _L1
_L1:
        int l;
        l = a.c;
        c = new ArrayList();
        if (l <= 0) goto _L4; else goto _L3
_L3:
        Object obj;
        String s1;
        c.add(Integer.valueOf(0));
        s1 = d();
        int j = a.a(0);
        obj = a.a(s1, 0, j);
        int k = 1;
_L9:
        if (k >= l) goto _L4; else goto _L5
_L5:
        String s;
        int i1;
        i1 = a.a(k);
        s = a.a(s1, k, i1);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        throw new NullPointerException((new StringBuilder("Missing value for markerColumn: ")).append(s1).append(", at row: ").append(k).append(", for window: ").append(i1).toString());
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        if (s.equals(obj)) goto _L7; else goto _L6
_L6:
        c.add(Integer.valueOf(k));
        obj = s;
          goto _L7
_L4:
        b = true;
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L7:
        k++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final Object a(int j)
    {
        int i1;
        b();
        i1 = b(j);
        if (j >= 0 && j != c.size()) goto _L2; else goto _L1
_L1:
        int l = 0;
_L4:
        return a(i1, l);
_L2:
        int k;
        if (j == c.size() - 1)
        {
            k = a.c - ((Integer)c.get(j)).intValue();
        } else
        {
            k = ((Integer)c.get(j + 1)).intValue() - ((Integer)c.get(j)).intValue();
        }
        l = k;
        if (k == 1)
        {
            j = b(j);
            a.a(j);
            l = k;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected abstract Object a(int j, int k);

    public final int c()
    {
        b();
        return c.size();
    }

    protected abstract String d();
}
