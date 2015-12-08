// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.p;

// Referenced classes of package com.google.android.gms.internal:
//            gd

public final class gg
{

    private final Object a;
    private int b;
    private int c;
    private final gd d;
    private final String e;

    private gg(gd gd1, String s)
    {
        a = new Object();
        d = gd1;
        e = s;
    }

    public gg(String s)
    {
        this(p.h(), s);
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
