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
import com.google.android.gms.internal.zzlo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzm, zzx, zzw

final class zzn extends zzm
    implements android.os.Handler.Callback
{
    static final class zza
    {

        private final ComponentName zzQh;
        private final String zzrc;

        public final boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (!(obj instanceof zza))
                {
                    return false;
                }
                obj = (zza)obj;
                if (!zzw.equal(zzrc, ((zza) (obj)).zzrc) || !zzw.equal(zzQh, ((zza) (obj)).zzQh))
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return zzw.hashCode(new Object[] {
                zzrc, zzQh
            });
        }

        public final String toString()
        {
            if (zzrc == null)
            {
                return zzQh.flattenToString();
            } else
            {
                return zzrc;
            }
        }

        public final Intent zzjj()
        {
            if (zzrc != null)
            {
                return (new Intent(zzrc)).setPackage("com.google.android.gms");
            } else
            {
                return (new Intent()).setComponent(zzQh);
            }
        }

        public zza(ComponentName componentname)
        {
            zzrc = null;
            zzQh = (ComponentName)zzx.zzl(componentname);
        }

        public zza(String s)
        {
            zzrc = zzx.zzbn(s);
            zzQh = null;
        }
    }

    final class zzb
    {

        private int mState;
        private IBinder zzPp;
        private ComponentName zzQh;
        private final zza zzQi = new zza(this);
        private final Set zzQj = new HashSet();
        private boolean zzQk;
        private final zza zzQl;
        final zzn zzQm;

        static int zza(zzb zzb1, int i)
        {
            zzb1.mState = i;
            return i;
        }

        static ComponentName zza(zzb zzb1, ComponentName componentname)
        {
            zzb1.zzQh = componentname;
            return componentname;
        }

        static IBinder zza(zzb zzb1, IBinder ibinder)
        {
            zzb1.zzPp = ibinder;
            return ibinder;
        }

        static zza zza(zzb zzb1)
        {
            return zzb1.zzQl;
        }

        static Set zzb(zzb zzb1)
        {
            return zzb1.zzQj;
        }

        public final IBinder getBinder()
        {
            return zzPp;
        }

        public final ComponentName getComponentName()
        {
            return zzQh;
        }

        public final int getState()
        {
            return mState;
        }

        public final boolean isBound()
        {
            return zzQk;
        }

        public final void zza(ServiceConnection serviceconnection, String s)
        {
            zzn.zzc(zzQm).zza(zzn.zzb(zzQm), serviceconnection, s, zzQl.zzjj());
            zzQj.add(serviceconnection);
        }

        public final boolean zza(ServiceConnection serviceconnection)
        {
            return zzQj.contains(serviceconnection);
        }

        public final void zzb(ServiceConnection serviceconnection, String s)
        {
            zzn.zzc(zzQm).zzb(zzn.zzb(zzQm), serviceconnection);
            zzQj.remove(serviceconnection);
        }

        public final void zzbh(String s)
        {
            zzQk = zzn.zzc(zzQm).zza(zzn.zzb(zzQm), s, zzQl.zzjj(), zzQi, 129);
            if (zzQk)
            {
                mState = 3;
                return;
            } else
            {
                zzn.zzc(zzQm).zza(zzn.zzb(zzQm), zzQi);
                return;
            }
        }

        public final void zzbi(String s)
        {
            zzn.zzc(zzQm).zza(zzn.zzb(zzQm), zzQi);
            zzQk = false;
            mState = 2;
        }

        public final boolean zzjk()
        {
            return zzQj.isEmpty();
        }

        public zzb(zza zza1)
        {
            zzQm = zzn.this;
            super();
            zzQl = zza1;
            mState = 2;
        }
    }

    public class zzb.zza
        implements ServiceConnection
    {

        final zzb zzQn;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            HashMap hashmap = zzn.zza(zzQn.zzQm);
            hashmap;
            JVM INSTR monitorenter ;
            zzb.zza(zzQn, ibinder);
            zzb.zza(zzQn, componentname);
            for (Iterator iterator = zzb.zzb(zzQn).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceConnected(componentname, ibinder)) { }
            break MISSING_BLOCK_LABEL_80;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            zzb.zza(zzQn, 1);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            HashMap hashmap = zzn.zza(zzQn.zzQm);
            hashmap;
            JVM INSTR monitorenter ;
            zzb.zza(zzQn, null);
            zzb.zza(zzQn, componentname);
            for (Iterator iterator = zzb.zzb(zzQn).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceDisconnected(componentname)) { }
            break MISSING_BLOCK_LABEL_76;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            zzb.zza(zzQn, 2);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public zzb.zza(zzb zzb1)
        {
            zzQn = zzb1;
            super();
        }
    }


    private final Handler mHandler;
    private final HashMap zzQe = new HashMap();
    private final zzlo zzQf = zzlo.zzka();
    private final long zzQg = 5000L;
    private final Context zznk;

    zzn(Context context)
    {
        zznk = context.getApplicationContext();
        mHandler = new Handler(context.getMainLooper(), this);
    }

    static HashMap zza(zzn zzn1)
    {
        return zzn1.zzQe;
    }

    private boolean zza(zza zza1, ServiceConnection serviceconnection, String s)
    {
        zzx.zzb(serviceconnection, "ServiceConnection must not be null");
        HashMap hashmap = zzQe;
        hashmap;
        JVM INSTR monitorenter ;
        zzb zzb1 = (zzb)zzQe.get(zza1);
        if (zzb1 != null) goto _L2; else goto _L1
_L1:
        zzb1 = new zzb(zza1);
        zzb1.zza(serviceconnection, s);
        zzb1.zzbh(s);
        zzQe.put(zza1, zzb1);
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
            throw new IllegalStateException((new StringBuilder("Trying to bind a GmsServiceConnection that was already connected before.  config=")).append(zza1).toString());
        }
        break MISSING_BLOCK_LABEL_133;
        zza1;
        hashmap;
        JVM INSTR monitorexit ;
        throw zza1;
        zzb1.zza(serviceconnection, s);
        zzb1.getState();
        JVM INSTR tableswitch 1 2: default 202
    //                   1 168
    //                   2 190;
           goto _L3 _L4 _L5
_L4:
        serviceconnection.onServiceConnected(zzb1.getComponentName(), zzb1.getBinder());
        zza1 = zzb1;
        continue; /* Loop/switch isn't completed */
_L5:
        zzb1.zzbh(s);
        zza1 = zzb1;
        continue; /* Loop/switch isn't completed */
_L3:
        zza1 = zzb1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static Context zzb(zzn zzn1)
    {
        return zzn1.zznk;
    }

    private void zzb(zza zza1, ServiceConnection serviceconnection, String s)
    {
        zzx.zzb(serviceconnection, "ServiceConnection must not be null");
        HashMap hashmap = zzQe;
        hashmap;
        JVM INSTR monitorenter ;
        zzb zzb1 = (zzb)zzQe.get(zza1);
        if (zzb1 != null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        throw new IllegalStateException((new StringBuilder("Nonexistent connection status for service config: ")).append(zza1).toString());
        zza1;
        hashmap;
        JVM INSTR monitorexit ;
        throw zza1;
        if (zzb1.zza(serviceconnection))
        {
            break MISSING_BLOCK_LABEL_91;
        }
        (new StringBuilder("Trying to unbind a GmsServiceConnection that was not bound before. config=")).append(zza1);
        hashmap;
        JVM INSTR monitorexit ;
        return;
        zzb1.zzb(serviceconnection, s);
        if (zzb1.zzjk())
        {
            zza1 = mHandler.obtainMessage(0, zzb1);
            mHandler.sendMessageDelayed(zza1, zzQg);
        }
        hashmap;
        JVM INSTR monitorexit ;
    }

    static zzlo zzc(zzn zzn1)
    {
        return zzn1.zzQf;
    }

    public final boolean handleMessage(Message message)
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
        synchronized (zzQe)
        {
            if (zzb1.zzjk())
            {
                if (zzb1.isBound())
                {
                    zzb1.zzbi("GmsClientSupervisor");
                }
                zzQe.remove(zzb.zza(zzb1));
            }
        }
        return true;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean zza(ComponentName componentname, ServiceConnection serviceconnection, String s)
    {
        return zza(new zza(componentname), serviceconnection, s);
    }

    public final boolean zza(String s, ServiceConnection serviceconnection, String s1)
    {
        return zza(new zza(s), serviceconnection, s1);
    }

    public final void zzb(ComponentName componentname, ServiceConnection serviceconnection, String s)
    {
        zzb(new zza(componentname), serviceconnection, s);
    }

    public final void zzb(String s, ServiceConnection serviceconnection, String s1)
    {
        zzb(new zza(s), serviceconnection, s1);
    }
}
