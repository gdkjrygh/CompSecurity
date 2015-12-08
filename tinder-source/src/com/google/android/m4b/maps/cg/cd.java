// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.os.Handler;
import android.os.Looper;

public final class cd
{

    volatile boolean a;
    private final Handler b;
    private final Runnable c;

    private cd(Handler handler, Runnable runnable)
    {
        b = handler;
        c = new Runnable(runnable) {

            private Runnable a;
            private cd b;

            public final void run()
            {
                b.a = false;
                a.run();
            }

            
            {
                b = cd.this;
                a = runnable;
                super();
            }
        };
    }

    public cd(Runnable runnable)
    {
        this(new Handler(Looper.getMainLooper()), runnable);
    }

    public final void a()
    {
        if (!a)
        {
            a = true;
            b.post(c);
        }
    }
}
