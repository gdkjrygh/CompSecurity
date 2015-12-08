// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            ck

public abstract class ch
{

    private final Runnable a = new Runnable() {

        final ch a;

        public final void run()
        {
            a.c = Thread.currentThread();
            a.a();
        }

            
            {
                a = ch.this;
                super();
            }
    };
    private boolean b;
    volatile Thread c;

    public ch()
    {
        b = false;
    }

    public abstract void a();

    public final Future b()
    {
        if (b)
        {
            return ck.a(1, a);
        } else
        {
            return ck.a(a);
        }
    }
}
