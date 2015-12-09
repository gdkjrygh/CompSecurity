// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.internal:
//            dj

public class dm
{

    private final Object li;
    private final String qA;
    private int qV;
    private int qW;
    private final dj qx;

    dm(dj dj1, String s)
    {
        li = new Object();
        qx = dj1;
        qA = s;
    }

    public dm(String s)
    {
        this(dj.bq(), s);
    }

    public void a(int i, int j)
    {
        synchronized (li)
        {
            qV = i;
            qW = j;
            qx.a(qA, this);
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
        synchronized (li)
        {
            bundle = new Bundle();
            bundle.putInt("pmnli", qV);
            bundle.putInt("pmnll", qW);
        }
        return bundle;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
