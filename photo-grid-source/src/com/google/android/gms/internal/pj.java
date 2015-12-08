// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            mp, pk, pu

public abstract class pj
    implements mp
{

    private final Runnable a;
    private volatile Thread b;
    private boolean c;

    public pj()
    {
        a = new pk(this);
        c = false;
    }

    public pj(boolean flag)
    {
        a = new pk(this);
        c = flag;
    }

    static Thread a(pj pj1, Thread thread)
    {
        pj1.b = thread;
        return thread;
    }

    public final void cancel()
    {
        onStop();
        if (b != null)
        {
            b.interrupt();
        }
    }

    public abstract void onStop();

    public abstract void zzbn();

    public Object zzfu()
    {
        return zzgz();
    }

    public final Future zzgz()
    {
        if (c)
        {
            return pu.a(1, a);
        } else
        {
            return pu.a(a);
        }
    }
}
