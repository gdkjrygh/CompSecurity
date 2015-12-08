// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.common.data:
//            DataBuffer, DataHolder

public abstract class g extends DataBuffer
{

    private boolean Kp;
    private ArrayList Kq;

    protected g(DataHolder dataholder)
    {
        super(dataholder);
        Kp = false;
    }

    private void gE()
    {
        this;
        JVM INSTR monitorenter ;
        if (Kp) goto _L2; else goto _L1
_L1:
        int k;
        k = II.getCount();
        Kq = new ArrayList();
        if (k <= 0) goto _L4; else goto _L3
_L3:
        String s;
        String s2;
        Kq.add(Integer.valueOf(0));
        s2 = gD();
        int i = II.ar(0);
        s = II.c(s2, 0, i);
        int j = 1;
_L9:
        if (j >= k) goto _L4; else goto _L5
_L5:
        String s1;
        int l = II.ar(j);
        s1 = II.c(s2, j, l);
        if (s1.equals(s)) goto _L7; else goto _L6
_L6:
        Kq.add(Integer.valueOf(j));
        s = s1;
          goto _L7
_L4:
        Kp = true;
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

    int au(int i)
    {
        if (i < 0 || i >= Kq.size())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Position ").append(i).append(" is out of bounds for this buffer").toString());
        } else
        {
            return ((Integer)Kq.get(i)).intValue();
        }
    }

    protected int av(int i)
    {
        int k;
        if (i < 0 || i == Kq.size())
        {
            k = 0;
        } else
        {
            int j;
            if (i == Kq.size() - 1)
            {
                j = II.getCount() - ((Integer)Kq.get(i)).intValue();
            } else
            {
                j = ((Integer)Kq.get(i + 1)).intValue() - ((Integer)Kq.get(i)).intValue();
            }
            k = j;
            if (j == 1)
            {
                i = au(i);
                int l = II.ar(i);
                String s = gF();
                k = j;
                if (s != null)
                {
                    k = j;
                    if (II.c(s, i, l) == null)
                    {
                        return 0;
                    }
                }
            }
        }
        return k;
    }

    protected abstract Object f(int i, int j);

    protected abstract String gD();

    protected String gF()
    {
        return null;
    }

    public final Object get(int i)
    {
        gE();
        return f(au(i), av(i));
    }

    public int getCount()
    {
        gE();
        return Kq.size();
    }
}
