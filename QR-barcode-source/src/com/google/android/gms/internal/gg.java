// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            gi

public abstract class gg
{

    private final Runnable mk = new Runnable() {

        final gg wg;

        public final void run()
        {
            gg.a(wg, Thread.currentThread());
            wg.co();
        }

            
            {
                wg = gg.this;
                super();
            }
    };
    private volatile Thread wf;

    public gg()
    {
    }

    static Thread a(gg gg1, Thread thread)
    {
        gg1.wf = thread;
        return thread;
    }

    public final void cancel()
    {
        onStop();
        if (wf != null)
        {
            wf.interrupt();
        }
    }

    public abstract void co();

    public abstract void onStop();

    public final void start()
    {
        gi.a(mk);
    }
}
