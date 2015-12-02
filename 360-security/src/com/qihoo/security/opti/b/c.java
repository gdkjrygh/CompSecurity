// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.qihoo.security.env.a;
import com.qihoo.security.service.SecurityService;
import com.qihoo360.mobilesafe.b.s;
import com.qihoo360.mobilesafe.service.KillBean;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.Iterator;
import java.util.List;

public class c
{

    private static final byte a[] = new byte[0];
    private static c b;
    private Context c;
    private com.qihoo360.mobilesafe.core.c.c d;
    private List e;
    private List f;
    private final ServiceConnection g = new ServiceConnection() {

        final c a;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            com.qihoo.security.opti.b.c.a(a, com.qihoo360.mobilesafe.core.c.a.a(ibinder));
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            com.qihoo.security.opti.b.c.a(a, null);
        }

            
            {
                a = c.this;
                super();
            }
    };

    private c(Context context)
    {
        d = null;
        c = context;
    }

    public static c a(Context context)
    {
        if (b == null)
        {
            synchronized (a)
            {
                if (b == null)
                {
                    b = new c(context);
                }
            }
        }
        return b;
        context;
        abyte0;
        JVM INSTR monitorexit ;
        throw context;
    }

    static com.qihoo360.mobilesafe.core.c.c a(c c1, com.qihoo360.mobilesafe.core.c.c c2)
    {
        c1.d = c2;
        return c2;
    }

    public void a()
    {
        s.a(c, com/qihoo/security/service/SecurityService, a.f, g, 1);
    }

    public void a(List list)
    {
        this;
        JVM INSTR monitorenter ;
        f = list;
        if (list == null) goto _L2; else goto _L1
_L1:
        boolean flag = list.isEmpty();
        if (!flag) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        e = list;
        if (true) goto _L2; else goto _L4
_L4:
        list;
        throw list;
    }

    public void b()
    {
        s.a(a.f, c, g);
        d = null;
    }

    public List c()
    {
        return f;
    }

    public long d()
    {
        this;
        JVM INSTR monitorenter ;
        if (e == null) goto _L2; else goto _L1
_L1:
        boolean flag = e.isEmpty();
        if (!flag) goto _L3; else goto _L2
_L2:
        long l = 0x5700000L;
_L6:
        this;
        JVM INSTR monitorexit ;
        return l;
_L3:
        l = 0L;
        Iterator iterator = e.iterator();
_L4:
        int i;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_79;
        }
        i = ((KillBean)iterator.next()).memory;
        l += (long)i * 1024L;
          goto _L4
        if (l <= 0x5700000L)
        {
            l = 0x5700000L;
        }
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    public void e()
    {
        this;
        JVM INSTR monitorenter ;
        SharedPref.a(c, "sp_key_has_clear_memory", true);
        if (d == null || f == null) goto _L2; else goto _L1
_L1:
        boolean flag = f.isEmpty();
        if (!flag) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        d.a(f);
_L4:
        f = null;
        e = null;
          goto _L2
        Object obj;
        obj;
        throw obj;
        obj;
        ((RemoteException) (obj)).printStackTrace();
          goto _L4
    }

}
