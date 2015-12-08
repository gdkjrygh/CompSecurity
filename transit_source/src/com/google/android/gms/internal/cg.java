// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            ch

public abstract class cg
{

    private final Runnable el = new Runnable() {

        final cg hE;

        public final void run()
        {
            cg.a(hE, Thread.currentThread());
            hE.ac();
        }

            
            {
                hE = cg.this;
                super();
            }
    };
    private volatile Thread hD;

    public cg()
    {
    }

    static Thread a(cg cg1, Thread thread)
    {
        cg1.hD = thread;
        return thread;
    }

    public abstract void ac();

    public final void cancel()
    {
        onStop();
        if (hD != null)
        {
            hD.interrupt();
        }
    }

    public abstract void onStop();

    public final void start()
    {
        ch.execute(el);
    }
}
