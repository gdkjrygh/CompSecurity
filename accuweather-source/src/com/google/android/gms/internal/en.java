// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            eo

public abstract class en
{

    private final Runnable le = new Runnable() {

        final en sd;

        public final void run()
        {
            en.a(sd, Thread.currentThread());
            sd.bc();
        }

            
            {
                sd = en.this;
                super();
            }
    };
    private volatile Thread sc;

    public en()
    {
    }

    static Thread a(en en1, Thread thread)
    {
        en1.sc = thread;
        return thread;
    }

    public abstract void bc();

    public final void cancel()
    {
        onStop();
        if (sc != null)
        {
            sc.interrupt();
        }
    }

    public abstract void onStop();

    public final void start()
    {
        eo.execute(le);
    }
}
