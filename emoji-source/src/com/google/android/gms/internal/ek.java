// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.internal:
//            eh

public class ek
{

    private final Object ls;
    private final eh rD;
    private final String rG;
    private int sc;
    private int sd;

    ek(eh eh1, String s)
    {
        ls = new Object();
        rD = eh1;
        rG = s;
    }

    public ek(String s)
    {
        this(eh.bH(), s);
    }

    public void a(int i, int j)
    {
        synchronized (ls)
        {
            sc = i;
            sd = j;
            rD.a(rG, this);
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
        synchronized (ls)
        {
            bundle = new Bundle();
            bundle.putInt("pmnli", sc);
            bundle.putInt("pmnll", sd);
        }
        return bundle;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
