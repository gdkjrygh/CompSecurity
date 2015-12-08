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
import com.google.android.gms.common.stats.zzb;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzk, zzu, zzt

final class zzl extends zzk
    implements android.os.Handler.Callback
{
    private static final class zza
    {

        private final ComponentName zzaaO = null;
        private final String zzuO;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (!(obj instanceof zza))
                {
                    return false;
                }
                obj = (zza)obj;
                if (!zzt.equal(zzuO, ((zza) (obj)).zzuO) || !zzt.equal(zzaaO, ((zza) (obj)).zzaaO))
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            return zzt.hashCode(new Object[] {
                zzuO, zzaaO
            });
        }

        public String toString()
        {
            if (zzuO == null)
            {
                return zzaaO.flattenToString();
            } else
            {
                return zzuO;
            }
        }

        public Intent zznV()
        {
            if (zzuO != null)
            {
                return (new Intent(zzuO)).setPackage("com.google.android.gms");
            } else
            {
                return (new Intent()).setComponent(zzaaO);
            }
        }

        public zza(String s)
        {
            zzuO = zzu.zzcj(s);
        }
    }

    private final class zzb
    {

        private int mState;
        private IBinder zzZQ;
        private ComponentName zzaaO;
        private final zza zzaaP = new zza(this);
        private final Set zzaaQ = new HashSet();
        private boolean zzaaR;
        private final zza zzaaS;
        final zzl zzaaT;

        static int zza(zzb zzb1, int i)
        {
            zzb1.mState = i;
            return i;
        }

        static ComponentName zza(zzb zzb1, ComponentName componentname)
        {
            zzb1.zzaaO = componentname;
            return componentname;
        }

        static IBinder zza(zzb zzb1, IBinder ibinder)
        {
            zzb1.zzZQ = ibinder;
            return ibinder;
        }

        static zza zza(zzb zzb1)
        {
            return zzb1.zzaaS;
        }

        static Set zzb(zzb zzb1)
        {
            return zzb1.zzaaQ;
        }

        public IBinder getBinder()
        {
            return zzZQ;
        }

        public ComponentName getComponentName()
        {
            return zzaaO;
        }

        public int getState()
        {
            return mState;
        }

        public boolean isBound()
        {
            return zzaaR;
        }

        public void zza(ServiceConnection serviceconnection, String s)
        {
            zzl.zzc(zzaaT).zza(com.google.android.gms.common.internal.zzl.zzb(zzaaT), serviceconnection, s, zzaaS.zznV());
            zzaaQ.add(serviceconnection);
        }

        public boolean zza(ServiceConnection serviceconnection)
        {
            return zzaaQ.contains(serviceconnection);
        }

        public void zzb(ServiceConnection serviceconnection, String s)
        {
            zzl.zzc(zzaaT).zzb(com.google.android.gms.common.internal.zzl.zzb(zzaaT), serviceconnection);
            zzaaQ.remove(serviceconnection);
        }

        public void zzcc(String s)
        {
            zzaaR = zzl.zzc(zzaaT).zza(com.google.android.gms.common.internal.zzl.zzb(zzaaT), s, zzaaS.zznV(), zzaaP, 129);
            if (zzaaR)
            {
                mState = 3;
                return;
            }
            try
            {
                zzl.zzc(zzaaT).zza(com.google.android.gms.common.internal.zzl.zzb(zzaaT), zzaaP);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return;
            }
        }

        public void zzcd(String s)
        {
            zzl.zzc(zzaaT).zza(com.google.android.gms.common.internal.zzl.zzb(zzaaT), zzaaP);
            zzaaR = false;
            mState = 2;
        }

        public boolean zznW()
        {
            return zzaaQ.isEmpty();
        }

        public zzb(zza zza1)
        {
            zzaaT = zzl.this;
            super();
            zzaaS = zza1;
            mState = 2;
        }
    }

    public class zzb.zza
        implements ServiceConnection
    {

        final zzb zzaaU;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            HashMap hashmap = zzl.zza(zzaaU.zzaaT);
            hashmap;
            JVM INSTR monitorenter ;
            zzb.zza(zzaaU, ibinder);
            zzb.zza(zzaaU, componentname);
            for (Iterator iterator = com.google.android.gms.common.internal.zzb.zzb(zzaaU).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceConnected(componentname, ibinder)) { }
            break MISSING_BLOCK_LABEL_80;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            zzb.zza(zzaaU, 1);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            HashMap hashmap = zzl.zza(zzaaU.zzaaT);
            hashmap;
            JVM INSTR monitorenter ;
            zzb.zza(zzaaU, null);
            zzb.zza(zzaaU, componentname);
            for (Iterator iterator = com.google.android.gms.common.internal.zzb.zzb(zzaaU).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceDisconnected(componentname)) { }
            break MISSING_BLOCK_LABEL_76;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            zzb.zza(zzaaU, 2);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public zzb.zza(zzb zzb1)
        {
            zzaaU = zzb1;
            super();
        }
    }


    private final Handler mHandler;
    private final HashMap zzaaL = new HashMap();
    private final com.google.android.gms.common.stats.zzb zzaaM = com.google.android.gms.common.stats.zzb.zzoO();
    private final long zzaaN = 5000L;
    private final Context zzqw;

    zzl(Context context)
    {
        zzqw = context.getApplicationContext();
        mHandler = new Handler(context.getMainLooper(), this);
    }

    static HashMap zza(zzl zzl1)
    {
        return zzl1.zzaaL;
    }

    private boolean zza(zza zza1, ServiceConnection serviceconnection, String s)
    {
        com.google.android.gms.common.internal.zzu.zzb(serviceconnection, "ServiceConnection must not be null");
        HashMap hashmap = zzaaL;
        hashmap;
        JVM INSTR monitorenter ;
        zzb zzb1 = (zzb)zzaaL.get(zza1);
        if (zzb1 != null) goto _L2; else goto _L1
_L1:
        zzb1 = new zzb(zza1);
        zzb1.zza(serviceconnection, s);
        zzb1.zzcc(s);
        zzaaL.put(zza1, zzb1);
        zza1 = zzb1;
_L7:
        boolean flag = zza1.isBound();
        hashmap;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        mHandler.removeMessages(0, zzb1);
        if (zzb1.zza(serviceconnection))
        {
            throw new IllegalStateException((new StringBuilder()).append("Trying to bind a GmsServiceConnection that was already connected before.  config=").append(zza1).toString());
        }
        break MISSING_BLOCK_LABEL_136;
        zza1;
        hashmap;
        JVM INSTR monitorexit ;
        throw zza1;
        zzb1.zza(serviceconnection, s);
        zzb1.getState();
        JVM INSTR tableswitch 1 2: default 206
    //                   1 172
    //                   2 194;
           goto _L3 _L4 _L5
_L4:
        serviceconnection.onServiceConnected(zzb1.getComponentName(), zzb1.getBinder());
        zza1 = zzb1;
        continue; /* Loop/switch isn't completed */
_L5:
        zzb1.zzcc(s);
        zza1 = zzb1;
        continue; /* Loop/switch isn't completed */
_L3:
        zza1 = zzb1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static Context zzb(zzl zzl1)
    {
        return zzl1.zzqw;
    }

    private void zzb(zza zza1, ServiceConnection serviceconnection, String s)
    {
        com.google.android.gms.common.internal.zzu.zzb(serviceconnection, "ServiceConnection must not be null");
        HashMap hashmap = zzaaL;
        hashmap;
        JVM INSTR monitorenter ;
        zzb zzb1 = (zzb)zzaaL.get(zza1);
        if (zzb1 != null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        throw new IllegalStateException((new StringBuilder()).append("Nonexistent connection status for service config: ").append(zza1).toString());
        zza1;
        hashmap;
        JVM INSTR monitorexit ;
        throw zza1;
        if (!zzb1.zza(serviceconnection))
        {
            throw new IllegalStateException((new StringBuilder()).append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=").append(zza1).toString());
        }
        zzb1.zzb(serviceconnection, s);
        if (zzb1.zznW())
        {
            zza1 = mHandler.obtainMessage(0, zzb1);
            mHandler.sendMessageDelayed(zza1, zzaaN);
        }
        hashmap;
        JVM INSTR monitorexit ;
    }

    static com.google.android.gms.common.stats.zzb zzc(zzl zzl1)
    {
        return zzl1.zzaaM;
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
        synchronized (zzaaL)
        {
            if (zzb1.zznW())
            {
                if (zzb1.isBound())
                {
                    zzb1.zzcd("GmsClientSupervisor");
                }
                zzaaL.remove(zzb.zza(zzb1));
            }
        }
        return true;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean zza(String s, ServiceConnection serviceconnection, String s1)
    {
        return zza(new zza(s), serviceconnection, s1);
    }

    public void zzb(String s, ServiceConnection serviceconnection, String s1)
    {
        zzb(new zza(s), serviceconnection, s1);
    }
}
