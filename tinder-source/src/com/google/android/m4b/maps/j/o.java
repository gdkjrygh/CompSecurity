// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.j;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.m4b.maps.l.c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.j:
//            n, x, v, f

final class o extends n
    implements android.os.Handler.Callback
{
    static final class a
    {

        private final String a;
        private final ComponentName b;

        public final Intent a()
        {
            if (a != null)
            {
                return (new Intent(a)).setPackage("com.google.android.gms");
            } else
            {
                return (new Intent()).setComponent(null);
            }
        }

        public final boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (!(obj instanceof a))
                {
                    return false;
                }
                obj = (a)obj;
                if (!v.a(a, ((a) (obj)).a) || !v.a(null, null))
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return Arrays.hashCode(new Object[] {
                a, null
            });
        }

        public final String toString()
        {
            if (a == null)
            {
                throw new NullPointerException();
            } else
            {
                return a;
            }
        }

        public a(String s)
        {
            if (TextUtils.isEmpty(s))
            {
                throw new IllegalArgumentException("Given String is empty or null");
            } else
            {
                a = s;
                b = null;
                return;
            }
        }
    }

    final class b
    {

        final a a = new a(this);
        final Set b = new HashSet();
        int c;
        boolean d;
        IBinder e;
        final a f;
        ComponentName g;
        final o h;

        public final void a()
        {
            boolean flag1 = false;
            com.google.android.m4b.maps.j.o.c(h);
            Context context = o.b(h);
            Intent intent = f.a();
            a a1 = a;
            ComponentName componentname = intent.getComponent();
            boolean flag;
            if (componentname == null || com.google.android.m4b.maps.j.f.c && "com.google.android.gms".equals(componentname.getPackageName()))
            {
                flag = false;
            } else
            {
                flag = com.google.android.m4b.maps.cz.b.a(context, componentname.getPackageName());
            }
            if (flag)
            {
                Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                flag = flag1;
            } else
            {
                com.google.android.m4b.maps.l.c.a(a1);
                flag = context.bindService(intent, a1, 129);
            }
            d = flag;
            if (d)
            {
                c = 3;
                return;
            }
            try
            {
                com.google.android.m4b.maps.j.o.c(h);
                com.google.android.m4b.maps.l.c.a(o.b(h), a);
                return;
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                return;
            }
        }

        public final void a(ServiceConnection serviceconnection)
        {
            com.google.android.m4b.maps.j.o.c(h);
            o.b(h);
            f.a();
            com.google.android.m4b.maps.l.c.a(serviceconnection);
            b.add(serviceconnection);
        }

        public final boolean b()
        {
            return b.isEmpty();
        }

        public final boolean b(ServiceConnection serviceconnection)
        {
            return b.contains(serviceconnection);
        }

        public b(a a1)
        {
            h = o.this;
            super();
            f = a1;
            c = 2;
        }
    }

    public final class b.a
        implements ServiceConnection
    {

        private b a;

        public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            HashMap hashmap = o.a(a.h);
            hashmap;
            JVM INSTR monitorenter ;
            a.e = ibinder;
            a.g = componentname;
            for (Iterator iterator = a.b.iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceConnected(componentname, ibinder)) { }
            break MISSING_BLOCK_LABEL_78;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            a.c = 1;
            hashmap;
            JVM INSTR monitorexit ;
        }

        public final void onServiceDisconnected(ComponentName componentname)
        {
            HashMap hashmap = o.a(a.h);
            hashmap;
            JVM INSTR monitorenter ;
            a.e = null;
            a.g = componentname;
            for (Iterator iterator = a.b.iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceDisconnected(componentname)) { }
            break MISSING_BLOCK_LABEL_74;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            a.c = 2;
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
    private final c d = com.google.android.m4b.maps.l.c.a();
    private final long e = 5000L;

    o(Context context)
    {
        b = context.getApplicationContext();
        c = new Handler(context.getMainLooper(), this);
    }

    static HashMap a(o o1)
    {
        return o1.a;
    }

    private boolean a(a a1, ServiceConnection serviceconnection)
    {
        x.a(serviceconnection, "ServiceConnection must not be null");
        HashMap hashmap = a;
        hashmap;
        JVM INSTR monitorenter ;
        b b1 = (b)a.get(a1);
        if (b1 != null) goto _L2; else goto _L1
_L1:
        b1 = new b(a1);
        b1.a(serviceconnection);
        b1.a();
        a.put(a1, b1);
        a1 = b1;
_L7:
        boolean flag = ((b) (a1)).d;
        hashmap;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        c.removeMessages(0, b1);
        if (b1.b(serviceconnection))
        {
            serviceconnection = String.valueOf("Trying to bind a GmsServiceConnection that was already connected before.  config=");
            a1 = String.valueOf(a1);
            throw new IllegalStateException((new StringBuilder(String.valueOf(serviceconnection).length() + 0 + String.valueOf(a1).length())).append(serviceconnection).append(a1).toString());
        }
        break MISSING_BLOCK_LABEL_152;
        a1;
        hashmap;
        JVM INSTR monitorexit ;
        throw a1;
        b1.a(serviceconnection);
        b1.c;
        JVM INSTR tableswitch 1 2: default 212
    //                   1 184
    //                   2 203;
           goto _L3 _L4 _L5
_L4:
        serviceconnection.onServiceConnected(b1.g, b1.e);
        a1 = b1;
        continue; /* Loop/switch isn't completed */
_L5:
        b1.a();
        a1 = b1;
        continue; /* Loop/switch isn't completed */
_L3:
        a1 = b1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static Context b(o o1)
    {
        return o1.b;
    }

    static c c(o o1)
    {
        return o1.d;
    }

    public final void a(String s, ServiceConnection serviceconnection)
    {
        Object obj;
        obj = new a(s);
        x.a(serviceconnection, "ServiceConnection must not be null");
        s = a;
        s;
        JVM INSTR monitorenter ;
        b b1 = (b)a.get(obj);
        if (b1 != null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        serviceconnection = String.valueOf("Nonexistent connection status for service config: ");
        obj = String.valueOf(obj);
        throw new IllegalStateException((new StringBuilder(String.valueOf(serviceconnection).length() + 0 + String.valueOf(obj).length())).append(serviceconnection).append(((String) (obj))).toString());
        serviceconnection;
        s;
        JVM INSTR monitorexit ;
        throw serviceconnection;
        if (!b1.b(serviceconnection))
        {
            serviceconnection = String.valueOf("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
            obj = String.valueOf(obj);
            throw new IllegalStateException((new StringBuilder(String.valueOf(serviceconnection).length() + 0 + String.valueOf(obj).length())).append(serviceconnection).append(((String) (obj))).toString());
        }
        com.google.android.m4b.maps.l.c.a(serviceconnection);
        b1.b.remove(serviceconnection);
        if (b1.b())
        {
            serviceconnection = c.obtainMessage(0, b1);
            c.sendMessageDelayed(serviceconnection, 5000L);
        }
        s;
        JVM INSTR monitorexit ;
    }

    public final boolean a(String s, ServiceConnection serviceconnection, String s1)
    {
        return a(new a(s), serviceconnection);
    }

    public final boolean handleMessage(Message message)
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
            if (b1.b())
            {
                if (b1.d)
                {
                    com.google.android.m4b.maps.l.c.a(b1.h.b, b1.a);
                    b1.d = false;
                    b1.c = 2;
                }
                a.remove(b1.f);
            }
        }
        return true;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
