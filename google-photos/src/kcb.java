// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import java.util.HashMap;
import java.util.Set;

final class kcb extends kca
    implements android.os.Handler.Callback
{

    private final HashMap a = new HashMap();
    private final Context b;
    private final Handler c;
    private final kcz d = kcz.a();
    private final long e = 5000L;

    kcb(Context context)
    {
        b = context.getApplicationContext();
        c = new Handler(context.getMainLooper(), this);
    }

    static HashMap a(kcb kcb1)
    {
        return kcb1.a;
    }

    private boolean a(kcc kcc1, ServiceConnection serviceconnection, String s)
    {
        b.f(serviceconnection, "ServiceConnection must not be null");
        HashMap hashmap = a;
        hashmap;
        JVM INSTR monitorenter ;
        kcd kcd1 = (kcd)a.get(kcc1);
        if (kcd1 != null) goto _L2; else goto _L1
_L1:
        kcd1 = new kcd(this, kcc1);
        kcd1.a(serviceconnection, s);
        kcd1.a(s);
        a.put(kcc1, kcd1);
        kcc1 = kcd1;
_L7:
        boolean flag = ((kcd) (kcc1)).d;
        hashmap;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        c.removeMessages(0, kcd1);
        if (kcd1.a(serviceconnection))
        {
            throw new IllegalStateException((new StringBuilder("Trying to bind a GmsServiceConnection that was already connected before.  config=")).append(kcc1).toString());
        }
        break MISSING_BLOCK_LABEL_133;
        kcc1;
        hashmap;
        JVM INSTR monitorexit ;
        throw kcc1;
        kcd1.a(serviceconnection, s);
        kcd1.c;
        JVM INSTR tableswitch 1 2: default 202
    //                   1 168
    //                   2 190;
           goto _L3 _L4 _L5
_L4:
        serviceconnection.onServiceConnected(kcd1.g, kcd1.e);
        kcc1 = kcd1;
        continue; /* Loop/switch isn't completed */
_L5:
        kcd1.a(s);
        kcc1 = kcd1;
        continue; /* Loop/switch isn't completed */
_L3:
        kcc1 = kcd1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static Context b(kcb kcb1)
    {
        return kcb1.b;
    }

    private void b(kcc kcc1, ServiceConnection serviceconnection, String s)
    {
        b.f(serviceconnection, "ServiceConnection must not be null");
        s = a;
        s;
        JVM INSTR monitorenter ;
        kcd kcd1 = (kcd)a.get(kcc1);
        if (kcd1 != null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        throw new IllegalStateException((new StringBuilder("Nonexistent connection status for service config: ")).append(kcc1).toString());
        kcc1;
        s;
        JVM INSTR monitorexit ;
        throw kcc1;
        if (!kcd1.a(serviceconnection))
        {
            throw new IllegalStateException((new StringBuilder("Trying to unbind a GmsServiceConnection  that was not bound before.  config=")).append(kcc1).toString());
        }
        kcd1.h.d.a(kcd1.h.b, serviceconnection, null, null, 4);
        kcd1.b.remove(serviceconnection);
        if (kcd1.a())
        {
            kcc1 = c.obtainMessage(0, kcd1);
            c.sendMessageDelayed(kcc1, e);
        }
        s;
        JVM INSTR monitorexit ;
    }

    static kcz c(kcb kcb1)
    {
        return kcb1.d;
    }

    public final boolean a(ComponentName componentname, ServiceConnection serviceconnection, String s)
    {
        return a(new kcc(componentname), serviceconnection, s);
    }

    public final boolean a(String s, ServiceConnection serviceconnection, String s1)
    {
        return a(new kcc(s), serviceconnection, s1);
    }

    public final void b(ComponentName componentname, ServiceConnection serviceconnection, String s)
    {
        b(new kcc(componentname), serviceconnection, s);
    }

    public final void b(String s, ServiceConnection serviceconnection, String s1)
    {
        b(new kcc(s), serviceconnection, s1);
    }

    public final boolean handleMessage(Message message)
    {
        kcd kcd1;
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            kcd1 = (kcd)message.obj;
            break;
        }
        synchronized (a)
        {
            if (kcd1.a())
            {
                if (kcd1.d)
                {
                    kcd1.h.d.a(kcd1.h.b, kcd1.a);
                    kcd1.d = false;
                    kcd1.c = 2;
                }
                a.remove(kcd1.f);
            }
        }
        return true;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
