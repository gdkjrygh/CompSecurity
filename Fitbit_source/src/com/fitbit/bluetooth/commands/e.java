// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.commands;

import android.os.Bundle;
import android.os.Handler;
import com.fitbit.bluetooth.connection.g;
import com.fitbit.e.a;
import com.fitbit.util.threading.FitbitHandlerThread;

// Referenced classes of package com.fitbit.bluetooth.commands:
//            d

abstract class e extends d
{

    private final Handler n;

    public e(g g, Bundle bundle, d.a a1)
    {
        super(g, bundle, a1);
        n = FitbitHandlerThread.b(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.a);
    }

    static void a(e e1)
    {
        e1.v();
    }

    private final void v()
    {
        com.fitbit.e.a.a(k(), "timerFired()", new Object[0]);
        i();
    }

    protected abstract void i();

    protected final void s()
    {
        t();
        if (q())
        {
            return;
        } else
        {
            com.fitbit.e.a.a(k(), "startTimer()", new Object[0]);
            n.postDelayed(new Runnable() {

                final e a;

                public void run()
                {
                    com.fitbit.bluetooth.commands.e.a(a);
                }

            
            {
                a = e.this;
                super();
            }
            }, u());
            return;
        }
    }

    protected final void t()
    {
        com.fitbit.e.a.a(k(), "resetTimer()", new Object[0]);
        n.removeCallbacksAndMessages(null);
    }

    protected abstract long u();
}
