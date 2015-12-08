// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import com.google.android.gms.common.stats.b;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.common.internal:
//            am, bl, ap, ao

final class an extends am
    implements android.os.Handler.Callback
{

    private final HashMap a = new HashMap();
    private final Context b;
    private final Handler c;
    private final b d = com.google.android.gms.common.stats.b.a();
    private final long e = 5000L;

    an(Context context)
    {
        b = context.getApplicationContext();
        c = new Handler(context.getMainLooper(), this);
    }

    static HashMap a(an an1)
    {
        return an1.a;
    }

    private void a(ao ao1, ServiceConnection serviceconnection)
    {
        bl.a(serviceconnection, "ServiceConnection must not be null");
        HashMap hashmap = a;
        hashmap;
        JVM INSTR monitorenter ;
        ap ap1 = (ap)a.get(ao1);
        if (ap1 != null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        throw new IllegalStateException((new StringBuilder("Nonexistent connection status for service config: ")).append(ao1).toString());
        ao1;
        hashmap;
        JVM INSTR monitorexit ;
        throw ao1;
        if (!ap1.b(serviceconnection))
        {
            throw new IllegalStateException((new StringBuilder("Trying to unbind a GmsServiceConnection  that was not bound before.  config=")).append(ao1).toString());
        }
        ap1.a(serviceconnection);
        if (ap1.d())
        {
            ao1 = c.obtainMessage(0, ap1);
            c.sendMessageDelayed(ao1, e);
        }
        hashmap;
        JVM INSTR monitorexit ;
    }

    private boolean a(ao ao1, ServiceConnection serviceconnection, String s)
    {
        bl.a(serviceconnection, "ServiceConnection must not be null");
        HashMap hashmap = a;
        hashmap;
        JVM INSTR monitorenter ;
        ap ap1 = (ap)a.get(ao1);
        if (ap1 != null) goto _L2; else goto _L1
_L1:
        ap1 = new ap(this, ao1);
        ap1.a(serviceconnection, s);
        ap1.a(s);
        a.put(ao1, ap1);
        ao1 = ap1;
_L7:
        boolean flag = ao1.b();
        hashmap;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        c.removeMessages(0, ap1);
        if (ap1.b(serviceconnection))
        {
            throw new IllegalStateException((new StringBuilder("Trying to bind a GmsServiceConnection that was already connected before.  config=")).append(ao1).toString());
        }
        break MISSING_BLOCK_LABEL_133;
        ao1;
        hashmap;
        JVM INSTR monitorexit ;
        throw ao1;
        ap1.a(serviceconnection, s);
        ap1.c();
        JVM INSTR tableswitch 1 2: default 202
    //                   1 168
    //                   2 190;
           goto _L3 _L4 _L5
_L4:
        serviceconnection.onServiceConnected(ap1.f(), ap1.e());
        ao1 = ap1;
        continue; /* Loop/switch isn't completed */
_L5:
        ap1.a(s);
        ao1 = ap1;
        continue; /* Loop/switch isn't completed */
_L3:
        ao1 = ap1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static Context b(an an1)
    {
        return an1.b;
    }

    static b c(an an1)
    {
        return an1.d;
    }

    public final void a(ComponentName componentname, ServiceConnection serviceconnection)
    {
        a(new ao(componentname), serviceconnection);
    }

    public final void a(String s, ServiceConnection serviceconnection)
    {
        a(new ao(s), serviceconnection);
    }

    public final boolean a(ComponentName componentname, ServiceConnection serviceconnection, String s)
    {
        return a(new ao(componentname), serviceconnection, s);
    }

    public final boolean a(String s, ServiceConnection serviceconnection, String s1)
    {
        return a(new ao(s), serviceconnection, s1);
    }

    public final boolean handleMessage(Message message)
    {
        ap ap1;
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            ap1 = (ap)message.obj;
            break;
        }
        synchronized (a)
        {
            if (ap1.d())
            {
                if (ap1.b())
                {
                    ap1.a();
                }
                a.remove(ap.a(ap1));
            }
        }
        return true;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
