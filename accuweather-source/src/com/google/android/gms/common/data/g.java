// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.common.data:
//            DataBuffer, DataHolder

public abstract class g extends DataBuffer
{

    private boolean ER;
    private ArrayList ES;

    protected g(DataHolder dataholder)
    {
        super(dataholder);
        ER = false;
    }

    private void eV()
    {
        this;
        JVM INSTR monitorenter ;
        if (ER) goto _L2; else goto _L1
_L1:
        int k;
        k = DD.getCount();
        ES = new ArrayList();
        if (k <= 0) goto _L4; else goto _L3
_L3:
        String s;
        String s2;
        ES.add(Integer.valueOf(0));
        s2 = eU();
        int i = DD.ae(0);
        s = DD.c(s2, 0, i);
        int j = 1;
_L9:
        if (j >= k) goto _L4; else goto _L5
_L5:
        String s1;
        int l = DD.ae(j);
        s1 = DD.c(s2, j, l);
        if (s1.equals(s)) goto _L7; else goto _L6
_L6:
        ES.add(Integer.valueOf(j));
        s = s1;
          goto _L7
_L4:
        ER = true;
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
        if (i < 0 || i >= ES.size())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Position ").append(i).append(" is out of bounds for this buffer").toString());
        } else
        {
            return ((Integer)ES.get(i)).intValue();
        }
    }

    protected int ai(int i)
    {
        int k;
        if (i < 0 || i == ES.size())
        {
            k = 0;
        } else
        {
            int j;
            if (i == ES.size() - 1)
            {
                j = DD.getCount() - ((Integer)ES.get(i)).intValue();
            } else
            {
                j = ((Integer)ES.get(i + 1)).intValue() - ((Integer)ES.get(i)).intValue();
            }
            k = j;
            if (j == 1)
            {
                i = ah(i);
                int l = DD.ae(i);
                String s = eW();
                k = j;
                if (s != null)
                {
                    k = j;
                    if (DD.c(s, i, l) == null)
                    {
                        return 0;
                    }
                }
            }
        }
        return k;
    }

    protected abstract Object c(int i, int j);

    protected abstract String eU();

    protected String eW()
    {
        return null;
    }

    public final Object get(int i)
    {
        eV();
        return c(ah(i), ai(i));
    }

    public int getCount()
    {
        eV();
        return ES.size();
    }
}
