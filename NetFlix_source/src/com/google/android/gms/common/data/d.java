// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.common.data:
//            DataBuffer, DataHolder

public abstract class d extends DataBuffer
{

    private boolean BW;
    private ArrayList BX;

    protected d(DataHolder dataholder)
    {
        super(dataholder);
        BW = false;
    }

    private void eu()
    {
        this;
        JVM INSTR monitorenter ;
        if (BW) goto _L2; else goto _L1
_L1:
        int k;
        k = BB.getCount();
        BX = new ArrayList();
        if (k <= 0) goto _L4; else goto _L3
_L3:
        String s;
        String s2;
        BX.add(Integer.valueOf(0));
        s2 = getPrimaryDataMarkerColumn();
        int i = BB.G(0);
        s = BB.getString(s2, 0, i);
        int j = 1;
_L9:
        if (j >= k) goto _L4; else goto _L5
_L5:
        String s1;
        int l = BB.G(j);
        s1 = BB.getString(s2, j, l);
        if (s1.equals(s)) goto _L7; else goto _L6
_L6:
        BX.add(Integer.valueOf(j));
        s = s1;
          goto _L7
_L4:
        BW = true;
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

    int H(int i)
    {
        if (i < 0 || i >= BX.size())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Position ").append(i).append(" is out of bounds for this buffer").toString());
        } else
        {
            return ((Integer)BX.get(i)).intValue();
        }
    }

    protected int I(int i)
    {
        if (i < 0 || i == BX.size())
        {
            return 0;
        }
        if (i == BX.size() - 1)
        {
            return BB.getCount() - ((Integer)BX.get(i)).intValue();
        } else
        {
            return ((Integer)BX.get(i + 1)).intValue() - ((Integer)BX.get(i)).intValue();
        }
    }

    protected abstract Object c(int i, int j);

    public final Object get(int i)
    {
        eu();
        return c(H(i), I(i));
    }

    public int getCount()
    {
        eu();
        return BX.size();
    }

    protected abstract String getPrimaryDataMarkerColumn();
}
