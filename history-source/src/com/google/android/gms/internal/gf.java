// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            gh

public abstract class gf
{

    private final Runnable mv = new Runnable() {

        final gf wv;

        public final void run()
        {
            gf.a(wv, Thread.currentThread());
            wv.cx();
        }

            
            {
                wv = gf.this;
                super();
            }
    };
    private volatile Thread wu;

    public gf()
    {
    }

    static Thread a(gf gf1, Thread thread)
    {
        gf1.wu = thread;
        return thread;
    }

    public final void cancel()
    {
        onStop();
        if (wu != null)
        {
            wu.interrupt();
        }
    }

    public abstract void cx();

    public abstract void onStop();

    public final void start()
    {
        gh.a(mv);
    }
}
