// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import java.util.HashMap;

public final class ac
    implements android.os.Handler.Callback
{

    private static final Object a = new Object();
    private static ac b;
    private final Context c;
    private final HashMap d = new HashMap();
    private final Handler e;

    private ac(Context context)
    {
        e = new Handler(context.getMainLooper(), this);
        c = context.getApplicationContext();
    }

    public static ac a(Context context)
    {
        synchronized (a)
        {
            if (b == null)
            {
                b = new ac(context.getApplicationContext());
            }
        }
        return b;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    static HashMap a(ac ac1)
    {
        return ac1.d;
    }

    static Context b(ac ac1)
    {
        return ac1.c;
    }

    public boolean a(String s, aa.f f)
    {
        HashMap hashmap = d;
        hashmap;
        JVM INSTR monitorenter ;
    /* block-local class not found */
    class a {}

        a a1 = (a)d.get(s);
        if (a1 != null) goto _L2; else goto _L1
_L1:
        a1 = new a(s);
        a1.a(f);
        a1.a();
        d.put(s, a1);
        s = a1;
_L7:
        boolean flag = s.d();
        hashmap;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        e.removeMessages(0, a1);
        if (a1.c(f))
        {
            throw new IllegalStateException((new StringBuilder()).append("Trying to bind a GmsServiceConnection that was already connected before.  startServiceAction=").append(s).toString());
        }
        break MISSING_BLOCK_LABEL_118;
        s;
        hashmap;
        JVM INSTR monitorexit ;
        throw s;
        a1.a(f);
        a1.e();
        JVM INSTR tableswitch 1 2: default 174
    //                   1 148
    //                   2 165;
           goto _L3 _L4 _L5
_L4:
        f.onServiceConnected(a1.h(), a1.g());
        s = a1;
        continue; /* Loop/switch isn't completed */
_L5:
        a1.a();
        s = a1;
        continue; /* Loop/switch isn't completed */
_L3:
        s = a1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void b(String s, aa.f f)
    {
        HashMap hashmap = d;
        hashmap;
        JVM INSTR monitorenter ;
        a a1 = (a)d.get(s);
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        throw new IllegalStateException((new StringBuilder()).append("Nonexistent connection status for service action: ").append(s).toString());
        s;
        hashmap;
        JVM INSTR monitorexit ;
        throw s;
        if (!a1.c(f))
        {
            throw new IllegalStateException((new StringBuilder()).append("Trying to unbind a GmsServiceConnection  that was not bound before.  startServiceAction=").append(s).toString());
        }
        a1.b(f);
        if (a1.f())
        {
            s = e.obtainMessage(0, a1);
            e.sendMessageDelayed(s, 5000L);
        }
        hashmap;
        JVM INSTR monitorexit ;
    }

    public boolean handleMessage(Message message)
    {
        a a1;
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            a1 = (a)message.obj;
            break;
        }
        synchronized (d)
        {
            if (a1.f())
            {
                a1.b();
                d.remove(a1.c());
            }
        }
        return true;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
