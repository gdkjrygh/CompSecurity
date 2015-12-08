// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.event;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.skype.android.event:
//            a, EventListener

public class EventBus
{

    private Map a;
    private Map b;
    private android.os.Handler.Callback c;

    public EventBus()
    {
        c = new android.os.Handler.Callback() {

            final EventBus a;

            public final boolean handleMessage(Message message)
            {
                a a1 = a.a(message.what);
                if (a1 != null)
                {
                    a1.a(message);
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                a = EventBus.this;
                super();
            }
        };
        a = new ConcurrentHashMap();
        b = new ConcurrentHashMap();
    }

    protected final a a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        a a2 = (a)b.get(Integer.valueOf(i));
        a a1;
        a1 = a2;
        if (a2 != null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        a1 = new a(i);
        b.put(Integer.valueOf(i), a1);
        this;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(Looper looper, Class class1, EventListener eventlistener)
    {
        if (class1 == null)
        {
            throw new IllegalArgumentException("null event type");
        }
        if (looper != null && !a.containsKey(looper))
        {
            Handler handler = new Handler(looper, c);
            a.put(looper, handler);
        }
        a(class1.hashCode()).a((Handler)a.get(looper), eventlistener);
    }

    public final boolean a(Object obj)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("null event");
        } else
        {
            return a(obj.getClass().hashCode()).a(obj);
        }
    }

    public final void b(Looper looper, Class class1, EventListener eventlistener)
    {
        if (class1 == null)
        {
            throw new IllegalArgumentException("null event type");
        } else
        {
            a(class1.hashCode()).b((Handler)a.get(looper), eventlistener);
            return;
        }
    }

    public final boolean b(Object obj)
    {
        Object obj1 = Looper.myLooper();
        if (obj1 == null)
        {
            throw new IllegalStateException((new StringBuilder("thread ")).append(Thread.currentThread().getName()).append(" has no looper associated with it").toString());
        }
        int i = obj.getClass().hashCode();
        a a1 = a(i);
        if (a1 != null)
        {
            obj1 = (Handler)a.get(obj1);
            if (obj1 != null)
            {
                a1.a(((Handler) (obj1)).obtainMessage(i, obj));
                return true;
            }
        }
        return false;
    }
}
