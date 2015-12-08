// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.internal:
//            ga

public class gd
{

    private final Object mH;
    private final ga vL;
    private final String vO;
    private int wr;
    private int ws;

    gd(ga ga1, String s)
    {
        mH = new Object();
        vL = ga1;
        vO = s;
    }

    public gd(String s)
    {
        this(ga.dc(), s);
    }

    public void d(int i, int j)
    {
        synchronized (mH)
        {
            wr = i;
            ws = j;
            vL.a(vO, this);
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
        synchronized (mH)
        {
            bundle = new Bundle();
            bundle.putInt("pmnli", wr);
            bundle.putInt("pmnll", ws);
        }
        return bundle;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
