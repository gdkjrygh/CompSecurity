// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzl;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmh;
import com.google.android.gms.internal.zzur;
import com.google.android.gms.internal.zzut;
import com.google.android.gms.internal.zzuv;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.android.gms.common.api:
//            GoogleApiClient, Api, Status, zze

final class com.google.android.gms.common.api.zzd
    implements GoogleApiClient
{
    static class zza extends zzuv
    {

        private WeakReference zzNj;

        public void zza(ConnectionResult connectionresult, zzut zzut)
        {
            zzut = (com.google.android.gms.common.api.zzd)zzNj.get();
            if (zzut != null)
            {
                com.google.android.gms.common.api.zzd.zzc(zzut, connectionresult);
            }
        }

        zza(com.google.android.gms.common.api.zzd zzd1)
        {
            zzNj = new WeakReference(zzd1);
        }
    }

    static class zzb extends com.google.android.gms.common.internal.zzt.zza
    {

        private WeakReference zzNj;

        public void zzb(zzaa zzaa1)
        {
            com.google.android.gms.common.api.zzd zzd1 = (com.google.android.gms.common.api.zzd)zzNj.get();
            if (zzd1 != null)
            {
                com.google.android.gms.common.api.zzd.zza(zzd1, zzaa1);
            }
        }

        zzb(com.google.android.gms.common.api.zzd zzd1)
        {
            zzNj = new WeakReference(zzd1);
        }
    }

    final class zzc extends Handler
    {

        final com.google.android.gms.common.api.zzd zzNb;

        public final void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                (new StringBuilder("Unknown message id: ")).append(message.what);
                return;

            case 1: // '\001'
                com.google.android.gms.common.api.zzd.zzl(zzNb);
                return;

            case 2: // '\002'
                com.google.android.gms.common.api.zzd.zzk(zzNb);
                break;
            }
        }

        zzc(Looper looper)
        {
            zzNb = com.google.android.gms.common.api.zzd.this;
            super(looper);
        }
    }

    static class zzd extends BroadcastReceiver
    {

        private WeakReference zzNj;

        public void onReceive(Context context, Intent intent)
        {
            intent = intent.getData();
            context = null;
            if (intent != null)
            {
                context = intent.getSchemeSpecificPart();
            }
            if (context != null && context.equals("com.google.android.gms"))
            {
                if ((context = (com.google.android.gms.common.api.zzd)zzNj.get()) != null)
                {
                    com.google.android.gms.common.api.zzd.zzk(context);
                    return;
                }
            }
        }

        zzd(com.google.android.gms.common.api.zzd zzd1)
        {
            zzNj = new WeakReference(zzd1);
        }
    }

    static interface zze
    {

        public abstract void zzb(zzg zzg1);
    }

    abstract class zzf
        implements GoogleApiClient.ConnectionCallbacks
    {

        final com.google.android.gms.common.api.zzd zzNb;

        public void onConnectionSuspended(int i)
        {
            com.google.android.gms.common.api.zzd.zza(zzNb).lock();
            i;
            JVM INSTR tableswitch 1 2: default 36
        //                       1 82
        //                       2 49;
               goto _L1 _L2 _L3
_L1:
            com.google.android.gms.common.api.zzd.zza(zzNb).unlock();
            return;
_L3:
            com.google.android.gms.common.api.zzd.zza(zzNb, i);
            zzNb.connect();
              goto _L1
            Exception exception;
            exception;
            com.google.android.gms.common.api.zzd.zza(zzNb).unlock();
            throw exception;
_L2:
            boolean flag = zzNb.zzil();
            if (flag)
            {
                com.google.android.gms.common.api.zzd.zza(zzNb).unlock();
                return;
            }
            com.google.android.gms.common.api.zzd.zza(zzNb, true);
            if (zzNb.zzMH == null)
            {
                zzNb.zzMH = new zzd(zzNb);
                IntentFilter intentfilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                intentfilter.addDataScheme("package");
                com.google.android.gms.common.api.zzd.zzd(zzNb).getApplicationContext().registerReceiver(zzNb.zzMH, intentfilter);
            }
            com.google.android.gms.common.api.zzd.zze(zzNb).sendMessageDelayed(com.google.android.gms.common.api.zzd.zze(zzNb).obtainMessage(1), com.google.android.gms.common.api.zzd.zzf(zzNb));
            com.google.android.gms.common.api.zzd.zze(zzNb).sendMessageDelayed(com.google.android.gms.common.api.zzd.zze(zzNb).obtainMessage(2), com.google.android.gms.common.api.zzd.zzg(zzNb));
            com.google.android.gms.common.api.zzd.zza(zzNb, i);
              goto _L1
        }

        private zzf()
        {
            zzNb = com.google.android.gms.common.api.zzd.this;
            super();
        }

    }

    static interface zzg
    {

        public abstract void cancel();

        public abstract void zza(zze zze1);

        public abstract void zzb(Api.zza zza1);

        public abstract Api.zzc zzhV();

        public abstract int zzhW();

        public abstract void zzk(Status status);
    }


    private final Context mContext;
    private final Lock zzCN = new ReentrantLock();
    private volatile boolean zzMA;
    private int zzMB;
    private boolean zzMC;
    private int zzMD;
    private long zzME;
    private long zzMF;
    private final zzc zzMG;
    BroadcastReceiver zzMH;
    private final Bundle zzMI = new Bundle();
    private final Map zzMJ = new HashMap();
    private final Set zzMK = new HashSet();
    private final Map zzML = new HashMap();
    private final List zzMM;
    private boolean zzMN;
    private zzur zzMO;
    private int zzMP;
    private boolean zzMQ;
    private boolean zzMR;
    private zzq zzMS;
    private boolean zzMT;
    private boolean zzMU;
    private final Set zzMV = Collections.newSetFromMap(new WeakHashMap());
    final Set zzMW = Collections.newSetFromMap(new ConcurrentHashMap(16, 0.75F, 2));
    private final zze zzMX = new zze() {

        final com.google.android.gms.common.api.zzd zzNb;

        public void zzb(zzg zzg1)
        {
            zzNb.zzMW.remove(zzg1);
        }

            
            {
                zzNb = com.google.android.gms.common.api.zzd.this;
                super();
            }
    };
    private final GoogleApiClient.ConnectionCallbacks zzMY = new zzf() {

        final com.google.android.gms.common.api.zzd zzNb;

        public void onConnected(Bundle bundle)
        {
            com.google.android.gms.common.api.zzd.zza(zzNb).lock();
            boolean flag2 = zzNb.isConnecting();
            if (!flag2)
            {
                com.google.android.gms.common.api.zzd.zza(zzNb).unlock();
                return;
            }
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_52;
            }
            com.google.android.gms.common.api.zzd.zzb(zzNb).putAll(bundle);
            com.google.android.gms.common.api.zzd.zzc(zzNb);
            com.google.android.gms.common.api.zzd.zza(zzNb).unlock();
            return;
            bundle;
            com.google.android.gms.common.api.zzd.zza(zzNb).unlock();
            throw bundle;
        }

            
            {
                zzNb = com.google.android.gms.common.api.zzd.this;
                super();
            }
    };
    private final GoogleApiClient.zza zzMZ = new GoogleApiClient.zza() {

        final com.google.android.gms.common.api.zzd zzNb;

        private void zzap(int j)
        {
            com.google.android.gms.common.api.zzd.zza(zzNb).lock();
            if (com.google.android.gms.common.api.zzd.zzh(zzNb) == j)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            Log.wtf("GoogleApiClientImpl", String.format("Internal error: step mismatch. Expected: %d, Actual: %d", new Object[] {
                Integer.valueOf(com.google.android.gms.common.api.zzd.zzh(zzNb)), Integer.valueOf(j)
            }));
            com.google.android.gms.common.api.zzd.zza(zzNb, 4);
            com.google.android.gms.common.api.zzd.zza(zzNb).unlock();
            return;
            if (com.google.android.gms.common.api.zzd.zzi(zzNb) == 1)
            {
                com.google.android.gms.common.api.zzd.zzc(zzNb);
            }
            com.google.android.gms.common.api.zzd.zza(zzNb).unlock();
            return;
            Exception exception;
            exception;
            com.google.android.gms.common.api.zzd.zza(zzNb).unlock();
            throw exception;
        }

        public void zzia()
        {
            zzap(0);
        }

        public void zzib()
        {
            zzap(1);
        }

            
            {
                zzNb = com.google.android.gms.common.api.zzd.this;
                super();
            }
    };
    private final Looper zzMc;
    private final Condition zzMt;
    private final zzl zzMu;
    private final int zzMv;
    final Queue zzMw = new LinkedList();
    private ConnectionResult zzMx;
    private int zzMy;
    private volatile int zzMz;
    private final com.google.android.gms.common.internal.zzl.zza zzNa = new com.google.android.gms.common.internal.zzl.zza() {

        final com.google.android.gms.common.api.zzd zzNb;

        public boolean isConnected()
        {
            return zzNb.isConnected();
        }

        public Bundle zzhp()
        {
            return null;
        }

        public boolean zzin()
        {
            return com.google.android.gms.common.api.zzd.zzj(zzNb);
        }

            
            {
                zzNb = com.google.android.gms.common.api.zzd.this;
                super();
            }
    };

    public com.google.android.gms.common.api.zzd(Context context, Looper looper, com.google.android.gms.common.internal.zzf zzf1, Api.zzb zzb1, Map map, Map map1, Set set, 
            Set set1, int i)
    {
        zzMt = zzCN.newCondition();
        zzMz = 4;
        zzMB = 0;
        zzMC = false;
        zzME = 0x1d4c0L;
        zzMF = 5000L;
        mContext = context;
        zzMu = new zzl(looper, zzNa);
        zzMc = looper;
        zzMG = new zzc(looper);
        zzMv = i;
        GoogleApiClient.ConnectionCallbacks connectioncallbacks;
        for (set = set.iterator(); set.hasNext(); zzMu.registerConnectionCallbacks(connectioncallbacks))
        {
            connectioncallbacks = (GoogleApiClient.ConnectionCallbacks)set.next();
        }

        for (set = set1.iterator(); set.hasNext(); zzMu.registerConnectionFailedListener(set1))
        {
            set1 = (GoogleApiClient.OnConnectionFailedListener)set.next();
        }

        zzMM = Collections.unmodifiableList(zzf1.zziP());
        zzMQ = false;
        zzMP = 2;
        set = map.keySet().iterator();
        boolean flag = false;
        while (set.hasNext()) 
        {
            set1 = (Api)set.next();
            Object obj = map.get(set1);
            boolean flag1;
            if (map1.get(set1) != null)
            {
                if (((Boolean)map1.get(set1)).booleanValue())
                {
                    i = 2;
                } else
                {
                    i = 1;
                }
            } else
            {
                i = 0;
            }
            obj = zza(set1.zzhT(), obj, context, looper, zzf1, zzMY, zza(set1, i));
            ((Api.zza) (obj)).zza(zzMZ);
            zzMJ.put(set1.zzhV(), obj);
            if (set1.zzhT().getPriority() == 1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (!((Api.zza) (obj)).zzhc())
            {
                continue;
            }
            zzMQ = true;
            if (i < zzMP)
            {
                zzMP = i;
            }
            if (i != 0)
            {
                zzMK.add(set1.zzhV());
            }
            flag = flag1 | flag;
        }
        if (flag)
        {
            zzMQ = false;
        }
        if (zzMQ)
        {
            zzf1.zza(Integer.valueOf(getSessionId()));
            zza(context, looper, zzf1, zzb1);
        }
    }

    private void resume()
    {
        zzCN.lock();
        if (zzil())
        {
            connect();
        }
        zzCN.unlock();
        return;
        Exception exception;
        exception;
        zzCN.unlock();
        throw exception;
    }

    private void zzM(boolean flag)
    {
        if (zzMO != null)
        {
            if (zzMO.isConnected())
            {
                if (flag)
                {
                    zzMO.zzsu();
                }
                zzMO.disconnect();
            }
            zzMS = null;
        }
    }

    static ConnectionResult zza(com.google.android.gms.common.api.zzd zzd1, ConnectionResult connectionresult)
    {
        zzd1.zzMx = connectionresult;
        return connectionresult;
    }

    private static Api.zza zza(Api.zzb zzb1, Object obj, Context context, Looper looper, com.google.android.gms.common.internal.zzf zzf1, GoogleApiClient.ConnectionCallbacks connectioncallbacks, GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        return zzb1.zza(context, looper, zzf1, obj, connectioncallbacks, onconnectionfailedlistener);
    }

    private final GoogleApiClient.OnConnectionFailedListener zza(Api api, int i)
    {
        return new GoogleApiClient.OnConnectionFailedListener(i, api) {

            final com.google.android.gms.common.api.zzd zzNb;
            final int zzNf;
            final Api zzNg;

            public void onConnectionFailed(ConnectionResult connectionresult)
            {
                com.google.android.gms.common.api.zzd.zza(zzNb).lock();
                boolean flag = zzNb.isConnecting();
                if (!flag)
                {
                    com.google.android.gms.common.api.zzd.zza(zzNb).unlock();
                    return;
                }
                if (zzNf != 2)
                {
                    int j = zzNg.zzhT().getPriority();
                    if (com.google.android.gms.common.api.zzd.zza(zzNb, j, zzNf, connectionresult))
                    {
                        com.google.android.gms.common.api.zzd.zza(zzNb, connectionresult);
                        com.google.android.gms.common.api.zzd.zzb(zzNb, j);
                    }
                }
                com.google.android.gms.common.api.zzd.zzm(zzNb).put(zzNg.zzhV(), connectionresult);
                com.google.android.gms.common.api.zzd.zzc(zzNb);
                com.google.android.gms.common.api.zzd.zza(zzNb).unlock();
                return;
                connectionresult;
                com.google.android.gms.common.api.zzd.zza(zzNb).unlock();
                throw connectionresult;
            }

            
            {
                zzNb = com.google.android.gms.common.api.zzd.this;
                zzNf = i;
                zzNg = api;
                super();
            }
        };
    }

    static zzq zza(com.google.android.gms.common.api.zzd zzd1, zzq zzq1)
    {
        zzd1.zzMS = zzq1;
        return zzq1;
    }

    static Lock zza(com.google.android.gms.common.api.zzd zzd1)
    {
        return zzd1.zzCN;
    }

    private void zza(Context context, Looper looper, com.google.android.gms.common.internal.zzf zzf1, Api.zzb zzb1)
    {
        zzMO = (zzur)zza(zzb1, zzf1.zziU(), context, looper, zzf1, ((GoogleApiClient.ConnectionCallbacks) (new zzf() {

            final com.google.android.gms.common.api.zzd zzNb;

            public void onConnected(Bundle bundle)
            {
                com.google.android.gms.common.api.zzd.zzn(zzNb);
            }

            
            {
                zzNb = com.google.android.gms.common.api.zzd.this;
                super();
            }
        })), new GoogleApiClient.OnConnectionFailedListener() {

            final com.google.android.gms.common.api.zzd zzNb;

            public void onConnectionFailed(ConnectionResult connectionresult)
            {
                com.google.android.gms.common.api.zzd.zza(zzNb).lock();
                com.google.android.gms.common.api.zzd.zzb(zzNb, new ConnectionResult(8, null));
                com.google.android.gms.common.api.zzd.zza(zzNb).unlock();
                return;
                connectionresult;
                com.google.android.gms.common.api.zzd.zza(zzNb).unlock();
                throw connectionresult;
            }

            
            {
                zzNb = com.google.android.gms.common.api.zzd.this;
                super();
            }
        });
    }

    private void zza(ConnectionResult connectionresult)
    {
        zzMC = false;
        boolean flag;
        if (!connectionresult.hasResolution())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzM(flag);
        zzao(3);
        if (!zzil() || !GooglePlayServicesUtil.zzh(mContext, connectionresult.getErrorCode()))
        {
            zzim();
            zzMu.zzg(connectionresult);
        }
        zzMN = false;
    }

    private void zza(zzg zzg1)
    {
        zzCN.lock();
        boolean flag;
        if (zzg1.zzhV() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzb(flag, "This task can not be executed or enqueued (it's probably a Batch or malformed)");
        zzMW.add(zzg1);
        zzg1.zza(zzMX);
        if (!zzil())
        {
            break MISSING_BLOCK_LABEL_85;
        }
        zzg1.zzk(new Status(8));
        zzCN.unlock();
        return;
        Api.zza zza1;
        zza1 = zza(zzg1.zzhV());
        if (zza1.isConnected() || !zzML.containsKey(zzg1.zzhV()))
        {
            break MISSING_BLOCK_LABEL_148;
        }
        zzg1.zzk(new Status(17));
        zzCN.unlock();
        return;
        zzg1.zzb(zza1);
        zzCN.unlock();
        return;
        zzg1;
        zzCN.unlock();
        throw zzg1;
    }

    static void zza(com.google.android.gms.common.api.zzd zzd1, int i)
    {
        zzd1.zzao(i);
    }

    static void zza(com.google.android.gms.common.api.zzd zzd1, zzaa zzaa1)
    {
        zzd1.zza(zzaa1);
    }

    private void zza(zzaa zzaa1)
    {
        ConnectionResult connectionresult = zzaa1.zzjo();
        if (connectionresult.isSuccess())
        {
            zzMG.post(new Runnable(zzaa1) {

                final com.google.android.gms.common.api.zzd zzNb;
                final zzaa zzNh;

                public void run()
                {
                    com.google.android.gms.common.api.zzd.zza(zzNb, zzNh.zzjn());
                    com.google.android.gms.common.api.zzd.zzb(zzNb, true);
                    com.google.android.gms.common.api.zzd.zzc(zzNb, zzNh.zzjp());
                    com.google.android.gms.common.api.zzd.zzd(zzNb, zzNh.zzjq());
                    com.google.android.gms.common.api.zzd.zzo(zzNb);
                }

            
            {
                zzNb = com.google.android.gms.common.api.zzd.this;
                zzNh = zzaa1;
                super();
            }
            });
            return;
        } else
        {
            zzb(connectionresult);
            return;
        }
    }

    private boolean zza(int i, int j, ConnectionResult connectionresult)
    {
        while (j == 1 && !connectionresult.hasResolution() || zzMx != null && i >= zzMy) 
        {
            return false;
        }
        return true;
    }

    static boolean zza(com.google.android.gms.common.api.zzd zzd1, int i, int j, ConnectionResult connectionresult)
    {
        return zzd1.zza(i, j, connectionresult);
    }

    static boolean zza(com.google.android.gms.common.api.zzd zzd1, boolean flag)
    {
        zzd1.zzMA = flag;
        return flag;
    }

    private void zzao(int i)
    {
        zzCN.lock();
        if (zzMz == 3) goto _L2; else goto _L1
_L1:
        if (i != -1)
        {
            break MISSING_BLOCK_LABEL_280;
        }
        if (isConnecting())
        {
            Iterator iterator = zzMw.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                zzg zzg1 = (zzg)iterator.next();
                if (zzg1.zzhW() != 1)
                {
                    zzg1.cancel();
                    iterator.remove();
                }
            } while (true);
            break MISSING_BLOCK_LABEL_140;
        }
        break MISSING_BLOCK_LABEL_95;
        Exception exception;
        exception;
        zzCN.unlock();
        throw exception;
        for (Iterator iterator1 = zzMw.iterator(); iterator1.hasNext(); ((zzg)iterator1.next()).cancel()) { }
        zzMw.clear();
        zzg zzg2;
        for (Iterator iterator2 = zzMW.iterator(); iterator2.hasNext(); zzg2.cancel())
        {
            zzg2 = (zzg)iterator2.next();
            zzg2.zza(null);
        }

        zzMW.clear();
        for (Iterator iterator3 = zzMV.iterator(); iterator3.hasNext(); ((com.google.android.gms.common.api.zze)iterator3.next()).clear()) { }
        zzMV.clear();
        if (zzMx != null || zzMw.isEmpty())
        {
            break MISSING_BLOCK_LABEL_271;
        }
        zzMC = true;
        zzCN.unlock();
        return;
        zzML.clear();
        boolean flag;
        boolean flag1;
        flag = isConnecting();
        flag1 = isConnected();
        zzMz = 3;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_321;
        }
        if (i != -1)
        {
            break MISSING_BLOCK_LABEL_312;
        }
        zzMx = null;
        zzMt.signalAll();
        zzMN = false;
        for (Iterator iterator4 = zzMJ.values().iterator(); iterator4.hasNext(); ((Api.zza)iterator4.next()).disconnect()) { }
          goto _L3
_L6:
        zzM(flag);
        zzMN = true;
        zzMz = 4;
        if (!flag1) goto _L2; else goto _L4
_L4:
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_401;
        }
        zzMu.zzaJ(i);
        zzMN = false;
_L2:
        zzCN.unlock();
        return;
_L3:
        while (i != -1) 
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static int zzb(com.google.android.gms.common.api.zzd zzd1, int i)
    {
        zzd1.zzMy = i;
        return i;
    }

    static Bundle zzb(com.google.android.gms.common.api.zzd zzd1)
    {
        return zzd1.zzMI;
    }

    private void zzb(ConnectionResult connectionresult)
    {
        zzMG.post(new Runnable(connectionresult) {

            final com.google.android.gms.common.api.zzd zzNb;
            final ConnectionResult zzNi;

            public void run()
            {
                com.google.android.gms.common.api.zzd.zza(zzNb).lock();
                if (!com.google.android.gms.common.api.zzd.zzd(zzNb, zzNi))
                {
                    break MISSING_BLOCK_LABEL_186;
                }
                com.google.android.gms.common.api.zzd.zze(zzNb, false);
                Iterator iterator = com.google.android.gms.common.api.zzd.zzp(zzNb).iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    Api.zzc zzc1 = (Api.zzc)iterator.next();
                    Api.zza zza1 = (Api.zza)com.google.android.gms.common.api.zzd.zzq(zzNb).get(zzc1);
                    if (zza1.isConnected())
                    {
                        zza1.disconnect();
                    }
                    if (!com.google.android.gms.common.api.zzd.zzm(zzNb).containsKey(zzc1))
                    {
                        com.google.android.gms.common.api.zzd.zzm(zzNb).put(zzc1, new ConnectionResult(17, null));
                    }
                } while (true);
                break MISSING_BLOCK_LABEL_157;
                Exception exception;
                exception;
                com.google.android.gms.common.api.zzd.zza(zzNb).unlock();
                throw exception;
                com.google.android.gms.common.api.zzd.zze(zzNb, true);
                com.google.android.gms.common.api.zzd.zzr(zzNb);
_L1:
                com.google.android.gms.common.api.zzd.zza(zzNb).unlock();
                return;
                com.google.android.gms.common.api.zzd.zze(zzNb, zzNi);
                  goto _L1
            }

            
            {
                zzNb = com.google.android.gms.common.api.zzd.this;
                zzNi = connectionresult;
                super();
            }
        });
    }

    static void zzb(com.google.android.gms.common.api.zzd zzd1, ConnectionResult connectionresult)
    {
        zzd1.zzb(connectionresult);
    }

    static boolean zzb(com.google.android.gms.common.api.zzd zzd1, boolean flag)
    {
        zzd1.zzMR = flag;
        return flag;
    }

    static void zzc(com.google.android.gms.common.api.zzd zzd1)
    {
        zzd1.zzie();
    }

    static void zzc(com.google.android.gms.common.api.zzd zzd1, ConnectionResult connectionresult)
    {
        zzd1.zzd(connectionresult);
    }

    private boolean zzc(ConnectionResult connectionresult)
    {
        return zzMP == 2 || zzMP == 1 && !connectionresult.hasResolution();
    }

    static boolean zzc(com.google.android.gms.common.api.zzd zzd1, boolean flag)
    {
        zzd1.zzMT = flag;
        return flag;
    }

    static Context zzd(com.google.android.gms.common.api.zzd zzd1)
    {
        return zzd1.mContext;
    }

    private void zzd(ConnectionResult connectionresult)
    {
        if (connectionresult.isSuccess())
        {
            zzMG.post(new Runnable() {

                final com.google.android.gms.common.api.zzd zzNb;

                public void run()
                {
                    com.google.android.gms.common.api.zzd.zza(zzNb).lock();
                    com.google.android.gms.common.api.zzd.zzr(zzNb);
                    com.google.android.gms.common.api.zzd.zza(zzNb).unlock();
                    return;
                    Exception exception;
                    exception;
                    com.google.android.gms.common.api.zzd.zza(zzNb).unlock();
                    throw exception;
                }

            
            {
                zzNb = com.google.android.gms.common.api.zzd.this;
                super();
            }
            });
            return;
        } else
        {
            zzb(connectionresult);
            return;
        }
    }

    static boolean zzd(com.google.android.gms.common.api.zzd zzd1, ConnectionResult connectionresult)
    {
        return zzd1.zzc(connectionresult);
    }

    static boolean zzd(com.google.android.gms.common.api.zzd zzd1, boolean flag)
    {
        zzd1.zzMU = flag;
        return flag;
    }

    static zzc zze(com.google.android.gms.common.api.zzd zzd1)
    {
        return zzd1.zzMG;
    }

    static void zze(com.google.android.gms.common.api.zzd zzd1, ConnectionResult connectionresult)
    {
        zzd1.zza(connectionresult);
    }

    static boolean zze(com.google.android.gms.common.api.zzd zzd1, boolean flag)
    {
        zzd1.zzMN = flag;
        return flag;
    }

    static long zzf(com.google.android.gms.common.api.zzd zzd1)
    {
        return zzd1.zzME;
    }

    static long zzg(com.google.android.gms.common.api.zzd zzd1)
    {
        return zzd1.zzMF;
    }

    static int zzh(com.google.android.gms.common.api.zzd zzd1)
    {
        return zzd1.zzMB;
    }

    static int zzi(com.google.android.gms.common.api.zzd zzd1)
    {
        return zzd1.zzMz;
    }

    private void zzie()
    {
label0:
        {
            zzMD = zzMD - 1;
            if (zzMD == 0)
            {
                if (zzMx == null)
                {
                    break label0;
                }
                zza(zzMx);
            }
            return;
        }
        switch (zzMB)
        {
        default:
            return;

        case 0: // '\0'
            if (zzMQ)
            {
                zzMB = 1;
                zzii();
                return;
            } else
            {
                zzij();
                return;
            }

        case 1: // '\001'
            zzih();
            return;

        case 2: // '\002'
            zzMz = 2;
            zzim();
            break;
        }
        if (zzMO != null)
        {
            if (zzMT)
            {
                zzMO.zza(zzMS, zzMU);
            }
            zzM(false);
        }
        zzMt.signalAll();
        zzik();
        if (zzMC)
        {
            zzMC = false;
            zzao(-1);
            return;
        }
        Bundle bundle;
        if (zzMI.isEmpty())
        {
            bundle = null;
        } else
        {
            bundle = zzMI;
        }
        zzMu.zzj(bundle);
    }

    private void zzif()
    {
        zzMO.zza(new zzb(this));
    }

    private Set zzig()
    {
        return new HashSet(Arrays.asList(zzmh.zzi(zzMM)));
    }

    private void zzih()
    {
        zzMO.zza(zzMS, zzig(), new zza(this));
    }

    private void zzii()
    {
        Api.zzc zzc1;
        Iterator iterator;
        boolean flag;
        if (getLooper() == zzMG.getLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zza(flag, "This method must be run on the mHandlerForCallbacks thread");
        if (zzMB != 1 || !zzMR) goto _L2; else goto _L1
_L1:
        zzMD = zzMJ.size();
        iterator = zzMJ.keySet().iterator();
_L3:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        zzc1 = (Api.zzc)iterator.next();
        if (!zzML.containsKey(zzc1))
        {
            break MISSING_BLOCK_LABEL_140;
        }
        zzCN.lock();
        zzie();
        zzCN.unlock();
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        zzCN.unlock();
        throw exception;
        ((Api.zza)zzMJ.get(zzc1)).zza(zzMS);
        if (true) goto _L3; else goto _L2
_L2:
    }

    private void zzij()
    {
        zzMB = 2;
        zzMD = zzMJ.size();
        for (Iterator iterator = zzMJ.keySet().iterator(); iterator.hasNext();)
        {
            Api.zzc zzc1 = (Api.zzc)iterator.next();
            if (zzML.containsKey(zzc1))
            {
                zzie();
            } else
            {
                ((Api.zza)zzMJ.get(zzc1)).zzb(zzMS);
            }
        }

    }

    private void zzik()
    {
        zzCN.lock();
        Exception exception;
        boolean flag;
        if (!isConnected() && !zzil())
        {
            flag = false;
        } else
        {
            flag = true;
        }
        zzx.zza(flag, "GoogleApiClient is not connected yet.");
_L1:
        flag = zzMw.isEmpty();
        if (!flag)
        {
            try
            {
                zza((zzg)zzMw.remove());
            }
            catch (DeadObjectException deadobjectexception) { }
            finally
            {
                zzCN.unlock();
            }
        } else
        {
            zzCN.unlock();
            return;
        }
          goto _L1
        throw exception;
    }

    private void zzim()
    {
        zzCN.lock();
        boolean flag = zzMA;
        if (!flag)
        {
            zzCN.unlock();
            return;
        }
        zzMA = false;
        zzMG.removeMessages(2);
        zzMG.removeMessages(1);
        if (zzMH != null)
        {
            mContext.getApplicationContext().unregisterReceiver(zzMH);
            zzMH = null;
        }
        zzCN.unlock();
        return;
        Exception exception;
        exception;
        zzCN.unlock();
        throw exception;
    }

    static boolean zzj(com.google.android.gms.common.api.zzd zzd1)
    {
        return zzd1.zzMN;
    }

    static void zzk(com.google.android.gms.common.api.zzd zzd1)
    {
        zzd1.resume();
    }

    static void zzl(com.google.android.gms.common.api.zzd zzd1)
    {
        zzd1.zzim();
    }

    static Map zzm(com.google.android.gms.common.api.zzd zzd1)
    {
        return zzd1.zzML;
    }

    static void zzn(com.google.android.gms.common.api.zzd zzd1)
    {
        zzd1.zzif();
    }

    static void zzo(com.google.android.gms.common.api.zzd zzd1)
    {
        zzd1.zzii();
    }

    static Set zzp(com.google.android.gms.common.api.zzd zzd1)
    {
        return zzd1.zzMK;
    }

    static Map zzq(com.google.android.gms.common.api.zzd zzd1)
    {
        return zzd1.zzMJ;
    }

    static void zzr(com.google.android.gms.common.api.zzd zzd1)
    {
        zzd1.zzij();
    }

    public final ConnectionResult blockingConnect()
    {
        InterruptedException interruptedexception;
        ConnectionResult connectionresult;
        boolean flag;
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zza(flag, "blockingConnect must not be called on the UI thread");
        zzCN.lock();
        connect();
_L1:
        flag = isConnecting();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        zzMt.await();
          goto _L1
        interruptedexception;
        Thread.currentThread().interrupt();
        connectionresult = new ConnectionResult(15, null);
        zzCN.unlock();
        return connectionresult;
        ConnectionResult connectionresult1;
        if (!isConnected())
        {
            break MISSING_BLOCK_LABEL_108;
        }
        connectionresult1 = ConnectionResult.zzLr;
        zzCN.unlock();
        return connectionresult1;
        if (zzMx == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        connectionresult1 = zzMx;
        zzCN.unlock();
        return connectionresult1;
        connectionresult1 = new ConnectionResult(13, null);
        zzCN.unlock();
        return connectionresult1;
        Exception exception;
        exception;
        zzCN.unlock();
        throw exception;
    }

    public final void connect()
    {
        zzCN.lock();
        boolean flag;
        zzMC = false;
        if (isConnected())
        {
            break MISSING_BLOCK_LABEL_30;
        }
        flag = isConnecting();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        zzCN.unlock();
        return;
        zzMN = true;
        zzMx = null;
        zzMz = 1;
        zzMB = 0;
        zzMI.clear();
        zzMD = zzMJ.size();
        zzML.clear();
        zzMR = false;
        zzMT = false;
        zzMU = false;
        if (zzMQ)
        {
            zzMO.connect();
        }
        for (Iterator iterator = zzMJ.values().iterator(); iterator.hasNext(); ((Api.zza)iterator.next()).connect()) { }
        break MISSING_BLOCK_LABEL_173;
        Exception exception;
        exception;
        zzCN.unlock();
        throw exception;
        zzCN.unlock();
        return;
    }

    public final void disconnect()
    {
        zzim();
        zzao(-1);
    }

    public final void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.append(s).println("GoogleApiClient:");
        s = (new StringBuilder()).append(s).append("  ").toString();
        printwriter.append(s).append("mConnectionState=");
        zzMz;
        JVM INSTR tableswitch 1 4: default 80
    //                   1 206
    //                   2 216
    //                   3 226
    //                   4 236;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        printwriter.print("UNKNOWN");
_L7:
        printwriter.append(" mResuming=").print(zzMA);
        printwriter.append(" mWaitingToDisconnect=").println(zzMC);
        printwriter.append(s).append("mWorkQueue.size()=").print(zzMw.size());
        printwriter.append(" mUnconsumedRunners.size()=").println(zzMW.size());
        for (Iterator iterator = zzMJ.values().iterator(); iterator.hasNext(); ((Api.zza)iterator.next()).dump(s, filedescriptor, printwriter, as)) { }
        break; /* Loop/switch isn't completed */
_L2:
        printwriter.print("CONNECTING");
        continue; /* Loop/switch isn't completed */
_L3:
        printwriter.print("CONNECTED");
        continue; /* Loop/switch isn't completed */
_L4:
        printwriter.print("DISCONNECTING");
        continue; /* Loop/switch isn't completed */
_L5:
        printwriter.print("DISCONNECTED");
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final Looper getLooper()
    {
        return zzMc;
    }

    public final int getSessionId()
    {
        return System.identityHashCode(this);
    }

    public final boolean isConnected()
    {
        return zzMz == 2;
    }

    public final boolean isConnecting()
    {
        return zzMz == 1;
    }

    public final void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        zzMu.registerConnectionCallbacks(connectioncallbacks);
    }

    public final void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzMu.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    public final void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        zzMu.unregisterConnectionCallbacks(connectioncallbacks);
    }

    public final void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzMu.unregisterConnectionFailedListener(onconnectionfailedlistener);
    }

    public final Api.zza zza(Api.zzc zzc1)
    {
        zzc1 = (Api.zza)zzMJ.get(zzc1);
        zzx.zzb(zzc1, "Appropriate Api was not requested.");
        return zzc1;
    }

    public final zza.zza zza(zza.zza zza1)
    {
        zzx.zzb(zzMJ.containsKey(zza1.zzhV()), "GoogleApiClient is not configured to use the API required for this call.");
        zzCN.lock();
        if (!isConnected()) goto _L2; else goto _L1
_L1:
        zzb(zza1);
_L4:
        zzCN.unlock();
        return zza1;
_L2:
        zzMw.add(zza1);
        if (true) goto _L4; else goto _L3
_L3:
        zza1;
        zzCN.unlock();
        throw zza1;
    }

    public final zza.zza zzb(zza.zza zza1)
    {
        boolean flag;
        if (isConnected() || zzil())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zza(flag, "GoogleApiClient is not connected yet.");
        zzik();
        try
        {
            zza(zza1);
        }
        catch (DeadObjectException deadobjectexception)
        {
            zzao(1);
            return zza1;
        }
        return zza1;
    }

    final boolean zzil()
    {
        return zzMA;
    }
}
