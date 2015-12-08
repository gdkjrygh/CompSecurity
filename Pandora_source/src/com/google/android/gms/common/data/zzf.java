// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.common.data:
//            AbstractDataBuffer, DataHolder

public abstract class zzf extends AbstractDataBuffer
{

    private boolean zzRO;
    private ArrayList zzRP;

    protected zzf(DataHolder dataholder)
    {
        super(dataholder);
        zzRO = false;
    }

    private void zzlu()
    {
        this;
        JVM INSTR monitorenter ;
        if (zzRO) goto _L2; else goto _L1
_L1:
        int k;
        k = zzPy.getCount();
        zzRP = new ArrayList();
        if (k <= 0) goto _L4; else goto _L3
_L3:
        Object obj;
        String s1;
        zzRP.add(Integer.valueOf(0));
        s1 = zzlt();
        int i = zzPy.zzaD(0);
        obj = zzPy.zzd(s1, 0, i);
        int j = 1;
_L9:
        if (j >= k) goto _L4; else goto _L5
_L5:
        String s;
        int l;
        l = zzPy.zzaD(j);
        s = zzPy.zzd(s1, j, l);
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
        zzRP.add(Integer.valueOf(j));
        obj = s;
          goto _L7
_L4:
        zzRO = true;
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L7:
        j++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final Object get(int i)
    {
        zzlu();
        return zzh(zzaG(i), zzaH(i));
    }

    public int getCount()
    {
        zzlu();
        return zzRP.size();
    }

    int zzaG(int i)
    {
        if (i < 0 || i >= zzRP.size())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Position ").append(i).append(" is out of bounds for this buffer").toString());
        } else
        {
            return ((Integer)zzRP.get(i)).intValue();
        }
    }

    protected int zzaH(int i)
    {
        int k;
        if (i < 0 || i == zzRP.size())
        {
            k = 0;
        } else
        {
            int j;
            if (i == zzRP.size() - 1)
            {
                j = zzPy.getCount() - ((Integer)zzRP.get(i)).intValue();
            } else
            {
                j = ((Integer)zzRP.get(i + 1)).intValue() - ((Integer)zzRP.get(i)).intValue();
            }
            k = j;
            if (j == 1)
            {
                i = zzaG(i);
                int l = zzPy.zzaD(i);
                String s = zzlv();
                k = j;
                if (s != null)
                {
                    k = j;
                    if (zzPy.zzd(s, i, l) == null)
                    {
                        return 0;
                    }
                }
            }
        }
        return k;
    }

    protected abstract Object zzh(int i, int j);

    protected abstract String zzlt();

    protected String zzlv()
    {
        return null;
    }
}
