// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.i;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

// Referenced classes of package com.android.slyce.i:
//            o, p, e, m

class n extends Thread
{

    private p a;
    private o b;

    private n(p p1)
    {
        a = p1;
    }

    n(p p1, m m)
    {
        this(p1);
    }

    private void a()
    {
        interrupt();
        b.obtainMessage(1).sendToTarget();
        try
        {
            join();
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            interrupt();
            Log.e("WorkerThread", "`quit` received InterruptedException");
            interruptedexception.printStackTrace();
            return;
        }
    }

    private void a(e e1)
    {
        b.obtainMessage(0, e1).sendToTarget();
    }

    static void a(n n1)
    {
        n1.a();
    }

    static void a(n n1, e e1)
    {
        n1.a(e1);
    }

    private void b()
    {
        Looper.myLooper().quit();
    }

    private void b(e e1)
    {
        if (a.h())
        {
            a.a(e1);
            return;
        } else
        {
            e1.a();
            return;
        }
    }

    static void b(n n1)
    {
        n1.b();
    }

    static void b(n n1, e e1)
    {
        n1.b(e1);
    }

    public void run()
    {
        Looper.prepare();
        b = new o(this, null);
        Looper.loop();
    }
}
