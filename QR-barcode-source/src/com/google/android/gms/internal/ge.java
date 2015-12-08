// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.internal:
//            gb

public class ge
{

    private final Object mw;
    private final String vA;
    private final gb vx;
    private int wc;
    private int wd;

    ge(gb gb1, String s)
    {
        mw = new Object();
        vx = gb1;
        vA = s;
    }

    public ge(String s)
    {
        this(gb.cU(), s);
    }

    public void d(int i, int j)
    {
        synchronized (mw)
        {
            wc = i;
            wd = j;
            vx.a(vA, this);
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
        synchronized (mw)
        {
            bundle = new Bundle();
            bundle.putInt("pmnli", wc);
            bundle.putInt("pmnll", wd);
        }
        return bundle;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
