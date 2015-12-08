// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import java.util.HashMap;
import java.util.Set;

final class bsp extends bso
    implements android.os.Handler.Callback
{

    private final HashMap a = new HashMap();
    private final Context b;
    private final Handler c;
    private final bto d = bto.a();

    bsp(Context context)
    {
        b = context.getApplicationContext();
        c = new Handler(context.getMainLooper(), this);
    }

    static HashMap a(bsp bsp1)
    {
        return bsp1.a;
    }

    private boolean a(bsq bsq1, ServiceConnection serviceconnection, String s)
    {
        btl.a(serviceconnection, "ServiceConnection must not be null");
        HashMap hashmap = a;
        hashmap;
        JVM INSTR monitorenter ;
        s = (bsr)a.get(bsq1);
        if (s != null) goto _L2; else goto _L1
_L1:
        s = new bsr(this, bsq1);
        s.a(serviceconnection);
        s.a();
        a.put(bsq1, s);
        bsq1 = s;
_L7:
        boolean flag = ((bsr) (bsq1)).d;
        hashmap;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        c.removeMessages(0, s);
        if (s.b(serviceconnection))
        {
            throw new IllegalStateException((new StringBuilder("Trying to bind a GmsServiceConnection that was already connected before.  config=")).append(bsq1).toString());
        }
        break MISSING_BLOCK_LABEL_122;
        bsq1;
        hashmap;
        JVM INSTR monitorexit ;
        throw bsq1;
        s.a(serviceconnection);
        ((bsr) (s)).c;
        JVM INSTR tableswitch 1 2: default 180
    //                   1 152
    //                   2 171;
           goto _L3 _L4 _L5
_L4:
        serviceconnection.onServiceConnected(((bsr) (s)).g, ((bsr) (s)).e);
        bsq1 = s;
        continue; /* Loop/switch isn't completed */
_L5:
        s.a();
        bsq1 = s;
        continue; /* Loop/switch isn't completed */
_L3:
        bsq1 = s;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static Context b(bsp bsp1)
    {
        return bsp1.b;
    }

    static bto c(bsp bsp1)
    {
        return bsp1.d;
    }

    public final void a(String s, ServiceConnection serviceconnection)
    {
        bsq bsq1;
        bsq1 = new bsq(s);
        btl.a(serviceconnection, "ServiceConnection must not be null");
        s = a;
        s;
        JVM INSTR monitorenter ;
        bsr bsr1 = (bsr)a.get(bsq1);
        if (bsr1 != null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        throw new IllegalStateException((new StringBuilder("Nonexistent connection status for service config: ")).append(bsq1).toString());
        serviceconnection;
        s;
        JVM INSTR monitorexit ;
        throw serviceconnection;
        if (!bsr1.b(serviceconnection))
        {
            throw new IllegalStateException((new StringBuilder("Trying to unbind a GmsServiceConnection  that was not bound before.  config=")).append(bsq1).toString());
        }
        bto.a(serviceconnection);
        bsr1.b.remove(serviceconnection);
        if (bsr1.b())
        {
            serviceconnection = c.obtainMessage(0, bsr1);
            c.sendMessageDelayed(serviceconnection, 5000L);
        }
        s;
        JVM INSTR monitorexit ;
    }

    public final boolean a(String s, ServiceConnection serviceconnection, String s1)
    {
        return a(new bsq(s), serviceconnection, s1);
    }

    public final boolean handleMessage(Message message)
    {
        bsr bsr1;
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            bsr1 = (bsr)message.obj;
            break;
        }
        synchronized (a)
        {
            if (bsr1.b())
            {
                if (bsr1.d)
                {
                    bto.a(bsr1.h.b, bsr1.a);
                    bsr1.d = false;
                    bsr1.c = 2;
                }
                a.remove(bsr1.f);
            }
        }
        return true;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
