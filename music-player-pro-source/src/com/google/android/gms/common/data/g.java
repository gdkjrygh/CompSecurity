// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.common.data:
//            DataBuffer, DataHolder

public abstract class g extends DataBuffer
{

    private boolean Lr;
    private ArrayList Ls;

    protected g(DataHolder dataholder)
    {
        super(dataholder);
        Lr = false;
    }

    private void hb()
    {
        this;
        JVM INSTR monitorenter ;
        if (Lr) goto _L2; else goto _L1
_L1:
        int k;
        k = JG.getCount();
        Ls = new ArrayList();
        if (k <= 0) goto _L4; else goto _L3
_L3:
        Object obj;
        String s1;
        Ls.add(Integer.valueOf(0));
        s1 = ha();
        int i = JG.au(0);
        obj = JG.c(s1, 0, i);
        int j = 1;
_L9:
        if (j >= k) goto _L4; else goto _L5
_L5:
        String s;
        int l;
        l = JG.au(j);
        s = JG.c(s1, j, l);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        throw new NullPointerException((new StringBuilder()).append("Missing value for markerColumn: ").append(s1).append(", at row: ").append(j).append(", for window: ").append(l).toString());
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        if (s.equals(obj)) goto _L7; else goto _L6
_L6:
        Ls.add(Integer.valueOf(j));
        obj = s;
          goto _L7
_L4:
        Lr = true;
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L7:
        j++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    int ax(int i)
    {
        if (i < 0 || i >= Ls.size())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Position ").append(i).append(" is out of bounds for this buffer").toString());
        } else
        {
            return ((Integer)Ls.get(i)).intValue();
        }
    }

    protected int ay(int i)
    {
        int k;
        if (i < 0 || i == Ls.size())
        {
            k = 0;
        } else
        {
            int j;
            if (i == Ls.size() - 1)
            {
                j = JG.getCount() - ((Integer)Ls.get(i)).intValue();
            } else
            {
                j = ((Integer)Ls.get(i + 1)).intValue() - ((Integer)Ls.get(i)).intValue();
            }
            k = j;
            if (j == 1)
            {
                i = ax(i);
                int l = JG.au(i);
                String s = hc();
                k = j;
                if (s != null)
                {
                    k = j;
                    if (JG.c(s, i, l) == null)
                    {
                        return 0;
                    }
                }
            }
        }
        return k;
    }

    protected abstract Object f(int i, int j);

    public final Object get(int i)
    {
        hb();
        return f(ax(i), ay(i));
    }

    public int getCount()
    {
        hb();
        return Ls.size();
    }

    protected abstract String ha();

    protected String hc()
    {
        return null;
    }
}
