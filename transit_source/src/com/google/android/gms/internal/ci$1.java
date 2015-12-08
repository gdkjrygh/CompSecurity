// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;

// Referenced classes of package com.google.android.gms.internal:
//            ci

static final class gO
    implements Runnable
{

    final Context gO;

    public void run()
    {
        synchronized (ci.ap())
        {
            ci.k(ci.k(gO));
            ci.ap().notifyAll();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (Context context)
    {
        gO = context;
        super();
    }
}
