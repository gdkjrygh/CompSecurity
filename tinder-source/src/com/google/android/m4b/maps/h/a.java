// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.h;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.m4b.maps.j.r;
import com.google.android.m4b.maps.j.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.m4b.maps.h:
//            k, q, m, l

public abstract class com.google.android.m4b.maps.h.a
    implements k
{
    public static final class a extends Handler
    {

        public final void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                Log.wtf("AbstractPendingResult", "Don't know how to handle this message.");
                return;

            case 1: // '\001'
                message = (Pair)message.obj;
                Object obj = ((Pair) (message)).first;
                message = ((Message) (((Pair) (message)).second));
                return;

            case 2: // '\002'
                ((com.google.android.m4b.maps.h.a)message.obj).b(q.c);
                break;
            }
        }

        public a()
        {
            this(Looper.getMainLooper());
        }

        public a(Looper looper)
        {
            super(looper);
        }
    }


    private final Object a = new Object();
    private a b;
    private final CountDownLatch c = new CountDownLatch(1);
    private final ArrayList d = new ArrayList();
    private m e;
    private volatile l f;
    private volatile boolean g;
    private boolean h;
    private boolean i;
    private r j;

    protected com.google.android.m4b.maps.h.a(Looper looper)
    {
        b = new a(looper);
    }

    private void b(l l)
    {
        f = l;
        j = null;
        c.countDown();
        l = f;
        for (l = d.iterator(); l.hasNext(); ((k.a)l.next()).a()) { }
        d.clear();
    }

    private boolean c()
    {
        return c.getCount() == 0L;
    }

    public abstract l a(q q1);

    public final void a()
    {
label0:
        {
            synchronized (a)
            {
                if (!h && !g)
                {
                    break label0;
                }
            }
            return;
        }
        l l = f;
        e = null;
        h = true;
        b(a(q.d));
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(k.a a1)
    {
        Object obj;
        l l;
        boolean flag;
        if (!g)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        x.a(flag, "Result has already been consumed.");
        obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (!c())
        {
            break MISSING_BLOCK_LABEL_45;
        }
        l = f;
        a1.a();
_L2:
        return;
        d.add(a1);
        if (true) goto _L2; else goto _L1
_L1:
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public final void a(l l)
    {
        boolean flag1;
label0:
        {
            flag1 = true;
            synchronized (a)
            {
                if (!i && !h)
                {
                    break label0;
                }
            }
            return;
        }
        boolean flag;
        if (!c())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        x.a(flag, "Results have already been set");
        if (!g)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        x.a(flag, "Result has already been consumed");
        b(l);
        obj;
        JVM INSTR monitorexit ;
        return;
        l;
        obj;
        JVM INSTR monitorexit ;
        throw l;
    }

    public final void b(q q1)
    {
        synchronized (a)
        {
            if (!c())
            {
                a(a(q1));
                i = true;
            }
        }
        return;
        q1;
        obj;
        JVM INSTR monitorexit ;
        throw q1;
    }
}
