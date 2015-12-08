// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.zzp;

// Referenced classes of package com.google.android.gms.internal:
//            pe

public final class ph
{

    private final Object a;
    private int b;
    private int c;
    private final pe d;
    private final String e;

    private ph(pe pe1, String s)
    {
        a = new Object();
        d = pe1;
        e = s;
    }

    public ph(String s)
    {
        this(zzp.zzby(), s);
    }

    public final Bundle a()
    {
        Bundle bundle;
        synchronized (a)
        {
            bundle = new Bundle();
            bundle.putInt("pmnli", b);
            bundle.putInt("pmnll", c);
        }
        return bundle;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(int i, int j)
    {
        synchronized (a)
        {
            b = i;
            c = j;
            d.a(e, this);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
