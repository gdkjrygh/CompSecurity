// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

// Referenced classes of package com.facebook.widget.a:
//            f, e, d, c, 
//            j, h, g, i

public abstract class a
    implements f
{

    private Handler a;
    private Handler b;
    private g c;
    private final Object d = new Object();

    public a()
    {
        b = new e(this, null);
    }

    static Handler a(a a1)
    {
        return a1.b;
    }

    static Handler a(a a1, Handler handler)
    {
        a1.a = handler;
        return handler;
    }

    static Object b(a a1)
    {
        return a1.d;
    }

    static Handler c(a a1)
    {
        return a1.a;
    }

    public final void a(CharSequence charsequence)
    {
        a(charsequence, ((h) (null)));
    }

    public final void a(CharSequence charsequence, h h1)
    {
        String s = null;
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            HandlerThread handlerthread = new HandlerThread("Filter", 10);
            handlerthread.start();
            a = new d(this, handlerthread.getLooper());
        }
        if (c != null) goto _L2; else goto _L1
_L1:
        long l = 0L;
_L4:
        Message message;
        c c1;
        message = a.obtainMessage(0xd0d0f00d);
        c1 = new c(null);
        if (charsequence == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        s = charsequence.toString();
        c1.a = s;
        c1.b = h1;
        if (h1 == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        h1.a(j.FILTERING);
        message.obj = c1;
        a.removeMessages(0xd0d0f00d);
        a.removeMessages(0xdeadbeef);
        a.sendMessageDelayed(message, l);
        obj;
        JVM INSTR monitorexit ;
        return;
_L2:
        l = c.a(charsequence);
        if (true) goto _L4; else goto _L3
_L3:
        charsequence;
        obj;
        JVM INSTR monitorexit ;
        throw charsequence;
    }

    protected abstract void a(CharSequence charsequence, i i);

    protected abstract i b(CharSequence charsequence);
}
