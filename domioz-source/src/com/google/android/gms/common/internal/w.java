// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.ig;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.common.internal:
//            v, ap, y, x

final class w extends v
    implements android.os.Handler.Callback
{

    private final HashMap a = new HashMap();
    private final Context b;
    private final Handler c;
    private final ig d = ig.a();
    private final long e = 5000L;

    w(Context context)
    {
        b = context.getApplicationContext();
        c = new Handler(context.getMainLooper(), this);
    }

    static HashMap a(w w1)
    {
        return w1.a;
    }

    private boolean a(x x1, ServiceConnection serviceconnection, String s)
    {
        ap.a(serviceconnection, "ServiceConnection must not be null");
        HashMap hashmap = a;
        hashmap;
        JVM INSTR monitorenter ;
        y y1 = (y)a.get(x1);
        if (y1 != null) goto _L2; else goto _L1
_L1:
        y1 = new y(this, x1);
        y1.a(serviceconnection, s);
        y1.a(s);
        a.put(x1, y1);
        x1 = y1;
_L7:
        boolean flag = x1.b();
        hashmap;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        c.removeMessages(0, y1);
        if (y1.b(serviceconnection))
        {
            throw new IllegalStateException((new StringBuilder("Trying to bind a GmsServiceConnection that was already connected before.  config=")).append(x1).toString());
        }
        break MISSING_BLOCK_LABEL_133;
        x1;
        hashmap;
        JVM INSTR monitorexit ;
        throw x1;
        y1.a(serviceconnection, s);
        y1.c();
        JVM INSTR tableswitch 1 2: default 202
    //                   1 168
    //                   2 190;
           goto _L3 _L4 _L5
_L4:
        serviceconnection.onServiceConnected(y1.f(), y1.e());
        x1 = y1;
        continue; /* Loop/switch isn't completed */
_L5:
        y1.a(s);
        x1 = y1;
        continue; /* Loop/switch isn't completed */
_L3:
        x1 = y1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static Context b(w w1)
    {
        return w1.b;
    }

    static ig c(w w1)
    {
        return w1.d;
    }

    public final void a(String s, ServiceConnection serviceconnection)
    {
        x x1;
        x1 = new x(s);
        ap.a(serviceconnection, "ServiceConnection must not be null");
        s = a;
        s;
        JVM INSTR monitorenter ;
        y y1 = (y)a.get(x1);
        if (y1 != null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        throw new IllegalStateException((new StringBuilder("Nonexistent connection status for service config: ")).append(x1).toString());
        serviceconnection;
        s;
        JVM INSTR monitorexit ;
        throw serviceconnection;
        if (y1.b(serviceconnection))
        {
            break MISSING_BLOCK_LABEL_104;
        }
        Log.e("GmsClientSupervisor", (new StringBuilder("Trying to unbind a GmsServiceConnection that was not bound before. config=")).append(x1).toString());
        s;
        JVM INSTR monitorexit ;
        return;
        y1.a(serviceconnection);
        if (y1.d())
        {
            serviceconnection = c.obtainMessage(0, y1);
            c.sendMessageDelayed(serviceconnection, e);
        }
        s;
        JVM INSTR monitorexit ;
    }

    public final boolean a(String s, ServiceConnection serviceconnection, String s1)
    {
        return a(new x(s), serviceconnection, s1);
    }

    public final boolean handleMessage(Message message)
    {
        y y1;
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            y1 = (y)message.obj;
            break;
        }
        synchronized (a)
        {
            if (y1.d())
            {
                if (y1.b())
                {
                    y1.a();
                }
                a.remove(y.a(y1));
            }
        }
        return true;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
