// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.internal:
//            ei

public class el
{

    private final Object lq;
    private final ei rA;
    private final String rD;
    private int rZ;
    private int sa;

    el(ei ei1, String s)
    {
        lq = new Object();
        rA = ei1;
        rD = s;
    }

    public el(String s)
    {
        this(ei.bC(), s);
    }

    public void a(int i, int j)
    {
        synchronized (lq)
        {
            rZ = i;
            sa = j;
            rA.a(rD, this);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Bundle toBundle()
    {
        Bundle bundle;
        synchronized (lq)
        {
            bundle = new Bundle();
            bundle.putInt("pmnli", rZ);
            bundle.putInt("pmnll", sa);
        }
        return bundle;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
