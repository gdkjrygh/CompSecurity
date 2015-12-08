// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.tasks.subtasks;

import android.os.Handler;
import com.fitbit.util.threading.FitbitHandlerThread;

// Referenced classes of package com.fitbit.galileo.tasks.subtasks:
//            GalileoSubTask

public abstract class o extends GalileoSubTask
{

    private final Handler a;

    public o()
    {
        a = FitbitHandlerThread.b(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.d);
    }

    static void a(o o1)
    {
        o1.t();
    }

    private final void t()
    {
        s();
        g();
    }

    protected abstract long f();

    protected abstract void g();

    protected final void r()
    {
        s();
        a.postDelayed(new Runnable() {

            final o a;

            public void run()
            {
                if (!a.i())
                {
                    o.a(a);
                }
            }

            
            {
                a = o.this;
                super();
            }
        }, f());
    }

    protected final void s()
    {
        a.removeCallbacksAndMessages(null);
    }
}
