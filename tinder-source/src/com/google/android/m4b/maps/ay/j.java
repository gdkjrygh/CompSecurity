// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import android.content.Context;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            i, d, k

public abstract class j extends i
{

    private final d a;
    private final Runnable b = new Runnable() {

        private j a;

        public final void run()
        {
            a.c();
        }

            
            {
                a = j.this;
                super();
            }
    };

    public j(Context context, String s, String s1, ScheduledExecutorService scheduledexecutorservice, k k)
    {
        super(context, s, s1, scheduledexecutorservice);
        a = new d(scheduledexecutorservice, b, k);
    }

    public final Future a(i.b b1)
    {
        a.a();
        return super.a(b1);
    }
}
