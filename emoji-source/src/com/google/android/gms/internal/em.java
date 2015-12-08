// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            en

public abstract class em
{

    private final Runnable lg = new Runnable() {

        final em sg;

        public final void run()
        {
            em.a(sg, Thread.currentThread());
            sg.bh();
        }

            
            {
                sg = em.this;
                super();
            }
    };
    private volatile Thread sf;

    public em()
    {
    }

    static Thread a(em em1, Thread thread)
    {
        em1.sf = thread;
        return thread;
    }

    public abstract void bh();

    public final void cancel()
    {
        onStop();
        if (sf != null)
        {
            sf.interrupt();
        }
    }

    public abstract void onStop();

    public final void start()
    {
        en.execute(lg);
    }
}
