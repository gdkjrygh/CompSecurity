// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            gi

static final class nf
    implements Runnable
{

    final Context nf;

    public void run()
    {
        synchronized (gi.dy())
        {
            gi.P(gi.u(nf));
            gi.dy().notifyAll();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (Context context)
    {
        nf = context;
        super();
    }
}
