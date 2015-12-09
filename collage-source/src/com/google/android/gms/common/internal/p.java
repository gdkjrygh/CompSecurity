// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.google.android.gms.common.stats.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//            o, z, y

final class p extends o
    implements android.os.Handler.Callback
{
    private static final class a
    {

        private final String a;
        private final ComponentName b;

        public Intent a()
        {
            if (a != null)
            {
                return (new Intent(a)).setPackage("com.google.android.gms");
            } else
            {
                return (new Intent()).setComponent(b);
            }
        }

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (!(obj instanceof a))
                {
                    return false;
                }
                obj = (a)obj;
                if (!y.a(a, ((a) (obj)).a) || !y.a(b, ((a) (obj)).b))
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            return y.a(new Object[] {
                a, b
            });
        }

        public String toString()
        {
            if (a == null)
            {
                return b.flattenToString();
            } else
            {
                return a;
            }
        }

        public a(ComponentName componentname)
        {
            a = null;
            b = (ComponentName)z.a(componentname);
        }

        public a(String s)
        {
            a = z.a(s);
            b = null;
        }
    }

    private final class b
    {

        final p a;
        private final a b = new a(this);
        private final Set c = new HashSet();
        private int d;
        private boolean e;
        private IBinder f;
        private final a g;
        private ComponentName h;

        static int a(b b1, int i)
        {
            b1.d = i;
            return i;
        }

        static ComponentName a(b b1, ComponentName componentname)
        {
            b1.h = componentname;
            return componentname;
        }

        static IBinder a(b b1, IBinder ibinder)
        {
            b1.f = ibinder;
            return ibinder;
        }

        static a a(b b1)
        {
            return b1.g;
        }

        static Set b(b b1)
        {
            return b1.c;
        }

        public void a(ServiceConnection serviceconnection, String s)
        {
            p.c(a).a(com.google.android.gms.common.internal.p.b(a), serviceconnection, s, g.a());
            c.add(serviceconnection);
        }

        public void a(String s)
        {
            e = p.c(a).a(com.google.android.gms.common.internal.p.b(a), s, g.a(), b, 129);
            if (e)
            {
                d = 3;
                return;
            }
            try
            {
                p.c(a).a(com.google.android.gms.common.internal.p.b(a), b);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return;
            }
        }

        public boolean a()
        {
            return e;
        }

        public boolean a(ServiceConnection serviceconnection)
        {
            return c.contains(serviceconnection);
        }

        public int b()
        {
            return d;
        }

        public void b(ServiceConnection serviceconnection, String s)
        {
            p.c(a).b(com.google.android.gms.common.internal.p.b(a), serviceconnection);
            c.remove(serviceconnection);
        }

        public void b(String s)
        {
            p.c(a).a(com.google.android.gms.common.internal.p.b(a), b);
            e = false;
            d = 2;
        }

        public boolean c()
        {
            return c.isEmpty();
        }

        public IBinder d()
        {
            return f;
        }

        public ComponentName e()
        {
            return h;
        }

        public b(a a1)
        {
            a = p.this;
            super();
            g = a1;
            d = 2;
        }
    }

    public class b.a
        implements ServiceConnection
    {

        final b a;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            HashMap hashmap = p.a(a.a);
            hashmap;
            JVM INSTR monitorenter ;
            b.a(a, ibinder);
            b.a(a, componentname);
            for (Iterator iterator = com.google.android.gms.common.internal.b.b(a).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceConnected(componentname, ibinder)) { }
            break MISSING_BLOCK_LABEL_80;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            b.a(a, 1);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            HashMap hashmap = p.a(a.a);
            hashmap;
            JVM INSTR monitorenter ;
            b.a(a, null);
            b.a(a, componentname);
            for (Iterator iterator = com.google.android.gms.common.internal.b.b(a).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceDisconnected(componentname)) { }
            break MISSING_BLOCK_LABEL_76;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            b.a(a, 2);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public b.a(b b1)
        {
            a = b1;
            super();
        }
    }


    private final HashMap a = new HashMap();
    private final Context b;
    private final Handler c;
    private final com.google.android.gms.common.stats.b d = com.google.android.gms.common.stats.b.a();
    private final long e = 5000L;

    p(Context context)
    {
        b = context.getApplicationContext();
        c = new Handler(context.getMainLooper(), this);
    }

    static HashMap a(p p1)
    {
        return p1.a;
    }

    private boolean a(a a1, ServiceConnection serviceconnection, String s)
    {
        z.a(serviceconnection, "ServiceConnection must not be null");
        HashMap hashmap = a;
        hashmap;
        JVM INSTR monitorenter ;
        b b1 = (b)a.get(a1);
        if (b1 != null) goto _L2; else goto _L1
_L1:
        b1 = new b(a1);
        b1.a(serviceconnection, s);
        b1.a(s);
        a.put(a1, b1);
        a1 = b1;
_L7:
        boolean flag = a1.a();
        hashmap;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        c.removeMessages(0, b1);
        if (b1.a(serviceconnection))
        {
            throw new IllegalStateException((new StringBuilder()).append("Trying to bind a GmsServiceConnection that was already connected before.  config=").append(a1).toString());
        }
        break MISSING_BLOCK_LABEL_136;
        a1;
        hashmap;
        JVM INSTR monitorexit ;
        throw a1;
        b1.a(serviceconnection, s);
        b1.b();
        JVM INSTR tableswitch 1 2: default 206
    //                   1 172
    //                   2 194;
           goto _L3 _L4 _L5
_L4:
        serviceconnection.onServiceConnected(b1.e(), b1.d());
        a1 = b1;
        continue; /* Loop/switch isn't completed */
_L5:
        b1.a(s);
        a1 = b1;
        continue; /* Loop/switch isn't completed */
_L3:
        a1 = b1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static Context b(p p1)
    {
        return p1.b;
    }

    private void b(a a1, ServiceConnection serviceconnection, String s)
    {
        z.a(serviceconnection, "ServiceConnection must not be null");
        HashMap hashmap = a;
        hashmap;
        JVM INSTR monitorenter ;
        b b1 = (b)a.get(a1);
        if (b1 != null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        throw new IllegalStateException((new StringBuilder()).append("Nonexistent connection status for service config: ").append(a1).toString());
        a1;
        hashmap;
        JVM INSTR monitorexit ;
        throw a1;
        if (!b1.a(serviceconnection))
        {
            throw new IllegalStateException((new StringBuilder()).append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=").append(a1).toString());
        }
        b1.b(serviceconnection, s);
        if (b1.c())
        {
            a1 = c.obtainMessage(0, b1);
            c.sendMessageDelayed(a1, e);
        }
        hashmap;
        JVM INSTR monitorexit ;
    }

    static com.google.android.gms.common.stats.b c(p p1)
    {
        return p1.d;
    }

    public boolean a(ComponentName componentname, ServiceConnection serviceconnection, String s)
    {
        return a(new a(componentname), serviceconnection, s);
    }

    public boolean a(String s, ServiceConnection serviceconnection, String s1)
    {
        return a(new a(s), serviceconnection, s1);
    }

    public void b(ComponentName componentname, ServiceConnection serviceconnection, String s)
    {
        b(new a(componentname), serviceconnection, s);
    }

    public void b(String s, ServiceConnection serviceconnection, String s1)
    {
        b(new a(s), serviceconnection, s1);
    }

    public boolean handleMessage(Message message)
    {
        b b1;
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            b1 = (b)message.obj;
            break;
        }
        synchronized (a)
        {
            if (b1.c())
            {
                if (b1.a())
                {
                    b1.b("GmsClientSupervisor");
                }
                a.remove(b.a(b1));
            }
        }
        return true;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
