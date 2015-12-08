// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.common.data:
//            DataBuffer, DataHolder

public abstract class g extends DataBuffer
{

    private boolean EU;
    private ArrayList EV;

    protected g(DataHolder dataholder)
    {
        super(dataholder);
        EU = false;
    }

    private void fa()
    {
        this;
        JVM INSTR monitorenter ;
        if (EU) goto _L2; else goto _L1
_L1:
        int k;
        k = DG.getCount();
        EV = new ArrayList();
        if (k <= 0) goto _L4; else goto _L3
_L3:
        String s;
        String s2;
        EV.add(Integer.valueOf(0));
        s2 = eZ();
        int i = DG.ae(0);
        s = DG.c(s2, 0, i);
        int j = 1;
_L9:
        if (j >= k) goto _L4; else goto _L5
_L5:
        String s1;
        int l = DG.ae(j);
        s1 = DG.c(s2, j, l);
        if (s1.equals(s)) goto _L7; else goto _L6
_L6:
        EV.add(Integer.valueOf(j));
        s = s1;
          goto _L7
_L4:
        EU = true;
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

    int ah(int i)
    {
        if (i < 0 || i >= EV.size())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Position ").append(i).append(" is out of bounds for this buffer").toString());
        } else
        {
            return ((Integer)EV.get(i)).intValue();
        }
    }

    protected int ai(int i)
    {
        int k;
        if (i < 0 || i == EV.size())
        {
            k = 0;
        } else
        {
            int j;
            if (i == EV.size() - 1)
            {
                j = DG.getCount() - ((Integer)EV.get(i)).intValue();
            } else
            {
                j = ((Integer)EV.get(i + 1)).intValue() - ((Integer)EV.get(i)).intValue();
            }
            k = j;
            if (j == 1)
            {
                i = ah(i);
                int l = DG.ae(i);
                String s = fb();
                k = j;
                if (s != null)
                {
                    k = j;
                    if (DG.c(s, i, l) == null)
                    {
                        return 0;
                    }
                }
            }
        }
        return k;
    }

    protected abstract Object c(int i, int j);

    protected abstract String eZ();

    protected String fb()
    {
        return null;
    }

    public final Object get(int i)
    {
        fa();
        return c(ah(i), ai(i));
    }

    public int getCount()
    {
        fa();
        return EV.size();
    }
}
