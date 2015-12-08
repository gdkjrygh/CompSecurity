// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.internal:
//            ge, fw

public final class gd
    implements android.os.Handler.Callback
{

    private static final Object a = new Object();
    private static gd b;
    private final Context c;
    private final HashMap d = new HashMap();
    private final Handler e;

    private gd(Context context)
    {
        e = new Handler(context.getMainLooper(), this);
        c = context.getApplicationContext();
    }

    public static gd a(Context context)
    {
        synchronized (a)
        {
            if (b == null)
            {
                b = new gd(context.getApplicationContext());
            }
        }
        return b;
    }

    static HashMap a(gd gd1)
    {
        return gd1.d;
    }

    public final boolean a(String s, fw fw1)
    {
        HashMap hashmap = d;
        hashmap;
        JVM INSTR monitorenter ;
        ge ge1 = (ge)d.get(s);
        if (ge1 != null) goto _L2; else goto _L1
_L1:
        ge1 = new ge(this, s);
        ge1.a(fw1);
        fw1 = (new Intent(s)).setPackage("com.google.android.gms");
        ge1.a(c.bindService(fw1, ge1.a(), 129));
        d.put(s, ge1);
        s = ge1;
_L7:
        boolean flag = s.c();
        hashmap;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        e.removeMessages(0, ge1);
        if (ge1.c(fw1))
        {
            throw new IllegalStateException((new StringBuilder("Trying to bind a GmsServiceConnection that was already connected before.  startServiceAction=")).append(s).toString());
        }
        break MISSING_BLOCK_LABEL_144;
        s;
        hashmap;
        JVM INSTR monitorexit ;
        throw s;
        ge1.a(fw1);
        ge1.d();
        JVM INSTR tableswitch 1 2: default 231
    //                   1 176
    //                   2 193;
           goto _L3 _L4 _L5
_L4:
        fw1.onServiceConnected(ge1.g(), ge1.f());
        s = ge1;
        continue; /* Loop/switch isn't completed */
_L5:
        s = (new Intent(s)).setPackage("com.google.android.gms");
        ge1.a(c.bindService(s, ge1.a(), 129));
        s = ge1;
        continue; /* Loop/switch isn't completed */
_L3:
        s = ge1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void b(String s, fw fw1)
    {
        HashMap hashmap = d;
        hashmap;
        JVM INSTR monitorenter ;
        ge ge1 = (ge)d.get(s);
        if (ge1 != null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        throw new IllegalStateException((new StringBuilder("Nonexistent connection status for service action: ")).append(s).toString());
        s;
        hashmap;
        JVM INSTR monitorexit ;
        throw s;
        if (!ge1.c(fw1))
        {
            throw new IllegalStateException((new StringBuilder("Trying to unbind a GmsServiceConnection  that was not bound before.  startServiceAction=")).append(s).toString());
        }
        ge1.b(fw1);
        if (ge1.e())
        {
            s = e.obtainMessage(0, ge1);
            e.sendMessageDelayed(s, 5000L);
        }
        hashmap;
        JVM INSTR monitorexit ;
    }

    public final boolean handleMessage(Message message)
    {
        ge ge1;
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            ge1 = (ge)message.obj;
            break;
        }
        synchronized (d)
        {
            if (ge1.e())
            {
                c.unbindService(ge1.a());
                d.remove(ge1.b());
            }
        }
        return true;
    }

}
