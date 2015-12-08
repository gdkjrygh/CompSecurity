// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.internal:
//            ah

public class dk
{

    private final Object li = new Object();
    private final String qL;
    private int qQ;
    private long qR;
    private long qS;
    private int qT;
    private int qU;

    public dk(String s)
    {
        qQ = 0;
        qR = -1L;
        qS = -1L;
        qT = 0;
        qU = -1;
        qL = s;
    }

    public void b(ah ah1, long l)
    {
        Object obj = li;
        obj;
        JVM INSTR monitorenter ;
        if (qS != -1L)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        qS = l;
        qR = qS;
_L2:
        if (ah1.extras == null || ah1.extras.getInt("gw", 2) != 1)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        return;
        qR = l;
        if (true) goto _L2; else goto _L1
_L1:
        ah1;
        obj;
        JVM INSTR monitorexit ;
        throw ah1;
        qU = qU + 1;
        obj;
        JVM INSTR monitorexit ;
    }

    public void bk()
    {
        synchronized (li)
        {
            qT = qT + 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void bl()
    {
        synchronized (li)
        {
            qQ = qQ + 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public long bw()
    {
        return qS;
    }

    public Bundle q(String s)
    {
        Bundle bundle;
        synchronized (li)
        {
            bundle = new Bundle();
            bundle.putString("session_id", qL);
            bundle.putLong("basets", qS);
            bundle.putLong("currts", qR);
            bundle.putString("seq_num", s);
            bundle.putInt("preqs", qU);
            bundle.putInt("pclick", qQ);
            bundle.putInt("pimp", qT);
        }
        return bundle;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }
}
