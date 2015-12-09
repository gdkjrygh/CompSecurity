// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            k

final class yG extends Thread
{

    final k yG;

    public final void run()
    {
        synchronized (k.a(yG))
        {
            k.a(yG, yG.em());
            k.a(yG, true);
            k.a(yG).notifyAll();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (k k1, String s)
    {
        yG = k1;
        super(s);
    }
}
