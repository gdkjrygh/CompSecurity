// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import com.google.android.gms.common.stats.zzb;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzk, zzu

final class zzl extends zzk
    implements android.os.Handler.Callback
{

    private final HashMap a = new HashMap();
    private final Context b;
    private final Handler c;
    private final com.google.android.gms.common.stats.zzb d = com.google.android.gms.common.stats.zzb.a();
    private final long e = 5000L;

    zzl(Context context)
    {
        b = context.getApplicationContext();
        c = new Handler(context.getMainLooper(), this);
    }

    static HashMap a(zzl zzl1)
    {
        return zzl1.a;
    }

    private boolean a(zza zza, ServiceConnection serviceconnection, String s)
    {
        zzu.a(serviceconnection, "ServiceConnection must not be null");
        HashMap hashmap = a;
        hashmap;
        JVM INSTR monitorenter ;
        zzb zzb1 = (zzb)a.get(zza);
        if (zzb1 != null) goto _L2; else goto _L1
_L1:
        zzb1 = new zzb(zza);
        zzb1.a(serviceconnection, s);
        zzb1.a(s);
        a.put(zza, zzb1);
        zza = zzb1;
_L7:
        boolean flag = zza.a();
        hashmap;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        c.removeMessages(0, zzb1);
        if (zzb1.a(serviceconnection))
        {
            throw new IllegalStateException((new StringBuilder()).append("Trying to bind a GmsServiceConnection that was already connected before.  config=").append(zza).toString());
        }
        break MISSING_BLOCK_LABEL_136;
        zza;
        hashmap;
        JVM INSTR monitorexit ;
        throw zza;
        zzb1.a(serviceconnection, s);
        zzb1.b();
        JVM INSTR tableswitch 1 2: default 206
    //                   1 172
    //                   2 194;
           goto _L3 _L4 _L5
_L4:
        serviceconnection.onServiceConnected(zzb1.e(), zzb1.d());
        zza = zzb1;
        continue; /* Loop/switch isn't completed */
_L5:
        zzb1.a(s);
        zza = zzb1;
        continue; /* Loop/switch isn't completed */
_L3:
        zza = zzb1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static Context b(zzl zzl1)
    {
        return zzl1.b;
    }

    private void b(zza zza, ServiceConnection serviceconnection, String s)
    {
        zzu.a(serviceconnection, "ServiceConnection must not be null");
        HashMap hashmap = a;
        hashmap;
        JVM INSTR monitorenter ;
        zzb zzb1 = (zzb)a.get(zza);
        if (zzb1 != null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        throw new IllegalStateException((new StringBuilder()).append("Nonexistent connection status for service config: ").append(zza).toString());
        zza;
        hashmap;
        JVM INSTR monitorexit ;
        throw zza;
        if (!zzb1.a(serviceconnection))
        {
            throw new IllegalStateException((new StringBuilder()).append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=").append(zza).toString());
        }
        zzb1.b(serviceconnection, s);
        if (zzb1.c())
        {
            zza = c.obtainMessage(0, zzb1);
            c.sendMessageDelayed(zza, e);
        }
        hashmap;
        JVM INSTR monitorexit ;
    }

    static com.google.android.gms.common.stats.zzb c(zzl zzl1)
    {
        return zzl1.d;
    }

    public boolean a(String s, ServiceConnection serviceconnection, String s1)
    {
        return a(new zza(s), serviceconnection, s1);
    }

    public void b(String s, ServiceConnection serviceconnection, String s1)
    {
        b(new zza(s), serviceconnection, s1);
    }

    public boolean handleMessage(Message message)
    {
        zzb zzb1;
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            zzb1 = (zzb)message.obj;
            break;
        }
        synchronized (a)
        {
            if (zzb1.c())
            {
                if (zzb1.a())
                {
                    zzb1.b("GmsClientSupervisor");
                }
                a.remove(zzb.a(zzb1));
            }
        }
        return true;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private class zzb
    {

        final zzl a;
        private final zza b = new zza();
        private final Set c = new HashSet();
        private int d;
        private boolean e;
        private IBinder f;
        private final zza g;
        private ComponentName h;

        static int a(zzb zzb1, int i)
        {
            zzb1.d = i;
            return i;
        }

        static ComponentName a(zzb zzb1, ComponentName componentname)
        {
            zzb1.h = componentname;
            return componentname;
        }

        static IBinder a(zzb zzb1, IBinder ibinder)
        {
            zzb1.f = ibinder;
            return ibinder;
        }

        static zza a(zzb zzb1)
        {
            return zzb1.g;
        }

        static Set b(zzb zzb1)
        {
            return zzb1.c;
        }

        public void a(ServiceConnection serviceconnection, String s)
        {
            zzl.c(a).a(zzl.b(a), serviceconnection, s, g.a());
            c.add(serviceconnection);
        }

        public void a(String s)
        {
            e = zzl.c(a).a(zzl.b(a), s, g.a(), b, 129);
            if (e)
            {
                d = 3;
                return;
            }
            try
            {
                zzl.c(a).a(zzl.b(a), b);
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
            zzl.c(a).b(zzl.b(a), serviceconnection);
            c.remove(serviceconnection);
        }

        public void b(String s)
        {
            zzl.c(a).a(zzl.b(a), b);
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

        public zzb(zza zza1)
        {
            a = zzl.this;
            super();
            g = zza1;
            class zza
                implements ServiceConnection
            {

                final zzb a;

                public void onServiceConnected(ComponentName componentname, IBinder ibinder)
                {
                    HashMap hashmap = zzl.a(a.a);
                    hashmap;
                    JVM INSTR monitorenter ;
                    zzb.a(a, ibinder);
                    zzb.a(a, componentname);
                    for (Iterator iterator = zzb.b(a).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceConnected(componentname, ibinder)) { }
                    break MISSING_BLOCK_LABEL_80;
                    componentname;
                    hashmap;
                    JVM INSTR monitorexit ;
                    throw componentname;
                    zzb.a(a, 1);
                    hashmap;
                    JVM INSTR monitorexit ;
                }

                public void onServiceDisconnected(ComponentName componentname)
                {
                    HashMap hashmap = zzl.a(a.a);
                    hashmap;
                    JVM INSTR monitorenter ;
                    zzb.a(a, null);
                    zzb.a(a, componentname);
                    for (Iterator iterator = zzb.b(a).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceDisconnected(componentname)) { }
                    break MISSING_BLOCK_LABEL_76;
                    componentname;
                    hashmap;
                    JVM INSTR monitorexit ;
                    throw componentname;
                    zzb.a(a, 2);
                    hashmap;
                    JVM INSTR monitorexit ;
                }

                public zza()
                {
                    a = zzb.this;
                    super();
                }
            }

            d = 2;
        }
    }


    private class zza
    {

        private final String a;
        private final ComponentName b = null;

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
                if (!(obj instanceof zza))
                {
                    return false;
                }
                obj = (zza)obj;
                if (!zzt.a(a, ((zza) (obj)).a) || !zzt.a(b, ((zza) (obj)).b))
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            return zzt.a(new Object[] {
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

        public zza(String s)
        {
            a = zzu.a(s);
        }
    }

}
