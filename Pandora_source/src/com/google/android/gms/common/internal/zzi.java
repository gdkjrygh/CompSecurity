// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzv, zzk, zzj, zze, 
//            ValidateAccountRequest, zzq, GetServiceRequest, zzo

public abstract class zzi
    implements com.google.android.gms.common.api.Api.zza, zzj.zza
{
    private abstract class a extends zzc
    {

        public final int statusCode;
        public final Bundle zzTy;
        final zzi zzTz;

        protected void zzc(Boolean boolean1)
        {
            Object obj = null;
            if (boolean1 != null) goto _L2; else goto _L1
_L1:
            zzi.zza(zzTz, 1, null);
_L4:
            return;
_L2:
            switch (statusCode)
            {
            default:
                zzi.zza(zzTz, 1, null);
                boolean1 = obj;
                if (zzTy != null)
                {
                    boolean1 = (PendingIntent)zzTy.getParcelable("pendingIntent");
                }
                zzi(new ConnectionResult(statusCode, boolean1));
                return;

            case 0: // '\0'
                if (!zzma())
                {
                    zzi.zza(zzTz, 1, null);
                    zzi(new ConnectionResult(8, null));
                    return;
                }
                break;

            case 10: // '\n'
                zzi.zza(zzTz, 1, null);
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        protected abstract void zzi(ConnectionResult connectionresult);

        protected abstract boolean zzma();

        protected void zzmb()
        {
        }

        protected void zzo(Object obj)
        {
            zzc((Boolean)obj);
        }

        protected a(int i, Bundle bundle)
        {
            zzTz = zzi.this;
            super(Boolean.valueOf(true));
            statusCode = i;
            zzTy = bundle;
        }
    }

    final class b extends Handler
    {

        final zzi a;

        public void handleMessage(Message message)
        {
            if ((message.what == 1 || message.what == 5 || message.what == 6) && !a.isConnecting())
            {
                message = (zzc)message.obj;
                message.zzmb();
                message.unregister();
                return;
            }
            if (message.what == 3)
            {
                message = new ConnectionResult(((Integer)message.obj).intValue(), null);
                if (zzi.zza(a))
                {
                    zzi.zzb(a).zza(message);
                    return;
                } else
                {
                    zzi.zzc(a).zzj(message);
                    return;
                }
            }
            if (message.what == 4)
            {
                zzi.zza(a, 4, null);
                zzi.zzc(a).zzaP(((Integer)message.obj).intValue());
                zzi.zza(a, 4, 1, null);
                return;
            }
            if (message.what == 2 && !a.isConnected())
            {
                message = (zzc)message.obj;
                message.zzmb();
                message.unregister();
                return;
            }
            if (message.what == 2 || message.what == 1 || message.what == 5 || message.what == 6)
            {
                ((zzc)message.obj).zzmc();
                return;
            } else
            {
                Log.wtf("GmsClient", "Don't know how to handle this message.");
                return;
            }
        }

        public b(Looper looper)
        {
            a = zzi.this;
            super(looper);
        }
    }

    protected abstract class zzc
    {

        private Object mListener;
        private boolean zzTA;
        final zzi zzTz;

        public void unregister()
        {
            zzmd();
            synchronized (zzi.zzd(zzTz))
            {
                zzi.zzd(zzTz).remove(this);
            }
            return;
            exception;
            arraylist;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected abstract void zzmb();

        public void zzmc()
        {
            this;
            JVM INSTR monitorenter ;
            Object obj;
            obj = mListener;
            if (zzTA)
            {
                Log.w("GmsClient", (new StringBuilder()).append("Callback proxy ").append(this).append(" being reused. This is not safe.").toString());
            }
            this;
            JVM INSTR monitorexit ;
            Object obj1;
            if (obj != null)
            {
                try
                {
                    zzo(obj);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    zzmb();
                    throw obj1;
                }
            } else
            {
                zzmb();
            }
            this;
            JVM INSTR monitorenter ;
            zzTA = true;
            this;
            JVM INSTR monitorexit ;
            unregister();
            return;
            obj1;
            this;
            JVM INSTR monitorexit ;
            throw obj1;
            obj1;
            this;
            JVM INSTR monitorexit ;
            throw obj1;
        }

        public void zzmd()
        {
            this;
            JVM INSTR monitorenter ;
            mListener = null;
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected abstract void zzo(Object obj);

        public zzc(Object obj)
        {
            zzTz = zzi.this;
            super();
            mListener = obj;
            zzTA = false;
        }
    }

    public static final class zzd extends zzp.zza
    {

        private zzi zzTB;

        private void zzme()
        {
            zzTB = null;
        }

        public void zzb(int i, IBinder ibinder, Bundle bundle)
        {
            zzv.zzb(zzTB, "onPostInitComplete can be called only once per call to getRemoteService");
            zzTB.zza(i, ibinder, bundle);
            zzme();
        }

        public void zzc(int i, Bundle bundle)
        {
            zzv.zzb(zzTB, "onAccountValidationComplete can be called only once per call to validateAccount");
            zzTB.zzb(i, bundle);
            zzme();
        }

        public zzd(zzi zzi1)
        {
            zzTB = zzi1;
        }
    }

    public final class zze
        implements ServiceConnection
    {

        final zzi zzTz;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            zzv.zzb(ibinder, "Expecting a valid IBinder");
            zzi.zza(zzTz, zzq.zza.zzT(ibinder));
            zzTz.zzlV();
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            zzTz.mHandler.sendMessage(zzTz.mHandler.obtainMessage(4, Integer.valueOf(1)));
        }

        public zze()
        {
            zzTz = zzi.this;
            super();
        }
    }

    protected final class zzf extends a
    {

        public final IBinder zzTC;
        final zzi zzTz;

        protected void zzi(ConnectionResult connectionresult)
        {
            zzi.zzc(zzTz).zzj(connectionresult);
        }

        protected boolean zzma()
        {
            String s;
            try
            {
                s = zzTC.getInterfaceDescriptor();
            }
            catch (RemoteException remoteexception)
            {
                Log.w("GmsClient", "service probably died");
                return false;
            }
            if (!zzTz.zzer().equals(s))
            {
                Log.e("GmsClient", (new StringBuilder()).append("service descriptor mismatch: ").append(zzTz.zzer()).append(" vs. ").append(s).toString());
            } else
            {
                IInterface iinterface = zzTz.zzD(zzTC);
                if (iinterface != null && zzi.zza(zzTz, 2, 3, iinterface))
                {
                    zzi.zzc(zzTz).zzmh();
                    GooglePlayServicesUtil.zzQ(zzi.zzf(zzTz));
                    return true;
                }
            }
            return false;
        }

        public zzf(int i, IBinder ibinder, Bundle bundle)
        {
            zzTz = zzi.this;
            super(i, bundle);
            zzTC = ibinder;
        }
    }

    protected final class zzg extends a
    {

        final zzi zzTz;

        protected void zzi(ConnectionResult connectionresult)
        {
            if (zzi.zza(zzTz))
            {
                zzi.zzb(zzTz).zza(connectionresult);
                return;
            } else
            {
                zzi.zzc(zzTz).zzj(connectionresult);
                return;
            }
        }

        protected boolean zzma()
        {
            if (zzi.zza(zzTz))
            {
                boolean flag;
                if (zzi.zzb(zzTz) != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                zzv.zza(flag, "mConnectionProgressReportCallbacks should not be null if mReportProgress");
                zzi.zzb(zzTz).zza(ConnectionResult.zzOI);
                return true;
            } else
            {
                zzTz.zza(null, zzi.zze(zzTz));
                return true;
            }
        }

        public zzg()
        {
            zzTz = zzi.this;
            super(0, null);
        }
    }

    protected final class zzh extends a
    {

        final zzi zzTz;

        protected void zzi(ConnectionResult connectionresult)
        {
            if (zzi.zza(zzTz))
            {
                zzi.zzb(zzTz).zzb(connectionresult);
                return;
            } else
            {
                zzi.zzc(zzTz).zzj(connectionresult);
                return;
            }
        }

        protected boolean zzma()
        {
            boolean flag;
            if (zzi.zza(zzTz) && zzi.zzb(zzTz) != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzv.zza(flag, "PostValidationCallback should not happen when mReportProgress is false ormConnectionProgressReportCallbacks is null");
            zzi.zzb(zzTz).zzb(ConnectionResult.zzOI);
            return true;
        }

        public zzh(int i, Bundle bundle)
        {
            zzTz = zzi.this;
            super(i, bundle);
        }
    }


    public static final String zzTx[] = {
        "service_esmobile", "service_googleme"
    };
    private final Context mContext;
    final Handler mHandler;
    private final Account zzJc;
    private final Set zzPP;
    private final Looper zzPx;
    private final com.google.android.gms.common.internal.zze zzQg;
    private final zzj zzQs;
    private final zzk zzTo;
    private zzq zzTp;
    private boolean zzTq;
    private com.google.android.gms.common.api.GoogleApiClient.zza zzTr;
    private IInterface zzTs;
    private final ArrayList zzTt;
    private zze zzTu;
    private int zzTv;
    private final int zzTw;
    private final Object zzoe;

    protected zzi(Context context, Looper looper, int i, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzoe = new Object();
        zzTq = false;
        zzTt = new ArrayList();
        zzTv = 1;
        mContext = (Context)zzv.zzr(context);
        zzPx = (Looper)zzv.zzb(looper, "Looper must not be null");
        zzTo = zzk.zzU(context);
        zzQs = new zzj(looper, this);
        mHandler = new b(looper);
        zzTw = i;
        zzJc = null;
        zzPP = Collections.emptySet();
        zzQg = (new com.google.android.gms.common.api.GoogleApiClient.Builder(context)).zzkK();
        registerConnectionCallbacks((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)zzv.zzr(connectioncallbacks));
        registerConnectionFailedListener((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)zzv.zzr(onconnectionfailedlistener));
    }

    protected zzi(Context context, Looper looper, int i, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, com.google.android.gms.common.internal.zze zze1)
    {
        this(context, looper, zzk.zzU(context), i, zze1, connectioncallbacks, onconnectionfailedlistener);
    }

    protected zzi(Context context, Looper looper, zzk zzk1, int i, com.google.android.gms.common.internal.zze zze1)
    {
        zzoe = new Object();
        zzTq = false;
        zzTt = new ArrayList();
        zzTv = 1;
        mContext = (Context)zzv.zzb(context, "Context must not be null");
        zzPx = (Looper)zzv.zzb(looper, "Looper must not be null");
        zzTo = (zzk)zzv.zzb(zzk1, "Supervisor must not be null");
        zzQs = new zzj(looper, this);
        mHandler = new b(looper);
        zzTw = i;
        zzQg = (com.google.android.gms.common.internal.zze)zzv.zzr(zze1);
        zzJc = zze1.getAccount();
        zzPP = zzb(zze1.zzlH());
    }

    protected zzi(Context context, Looper looper, zzk zzk1, int i, com.google.android.gms.common.internal.zze zze1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        this(context, looper, zzk1, i, zze1);
        registerConnectionCallbacks((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)zzv.zzr(connectioncallbacks));
        registerConnectionFailedListener((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)zzv.zzr(onconnectionfailedlistener));
    }

    static zzq zza(zzi zzi1, zzq zzq1)
    {
        zzi1.zzTp = zzq1;
        return zzq1;
    }

    private void zza(int i, IInterface iinterface)
    {
        boolean flag2 = true;
        Object obj;
        boolean flag;
        boolean flag1;
        if (i == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (iinterface != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag != flag1)
        {
            flag2 = false;
        }
        zzv.zzQ(flag2);
        obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        zzTv = i;
        zzTs = iinterface;
        i;
        JVM INSTR tableswitch 1 2: default 94
    //                   1 87
    //                   2 75;
           goto _L1 _L2 _L3
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
_L3:
        zzlS();
          goto _L1
        iinterface;
        obj;
        JVM INSTR monitorexit ;
        throw iinterface;
_L2:
        zzlT();
          goto _L1
    }

    static void zza(zzi zzi1, int i, IInterface iinterface)
    {
        zzi1.zza(i, iinterface);
    }

    private boolean zza(int i, int j, IInterface iinterface)
    {
label0:
        {
            synchronized (zzoe)
            {
                if (zzTv == i)
                {
                    break label0;
                }
            }
            return false;
        }
        zza(j, iinterface);
        obj;
        JVM INSTR monitorexit ;
        return true;
        iinterface;
        obj;
        JVM INSTR monitorexit ;
        throw iinterface;
    }

    static boolean zza(zzi zzi1)
    {
        return zzi1.zzTq;
    }

    static boolean zza(zzi zzi1, int i, int j, IInterface iinterface)
    {
        return zzi1.zza(i, j, iinterface);
    }

    static com.google.android.gms.common.api.GoogleApiClient.zza zzb(zzi zzi1)
    {
        return zzi1.zzTr;
    }

    private Set zzb(Set set)
    {
        Set set1 = zza(set);
        if (set1 == null)
        {
            return set1;
        }
        for (Iterator iterator = set1.iterator(); iterator.hasNext();)
        {
            if (!set.contains((Scope)iterator.next()))
            {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }

        return set1;
    }

    static zzj zzc(zzi zzi1)
    {
        return zzi1.zzQs;
    }

    static ArrayList zzd(zzi zzi1)
    {
        return zzi1.zzTt;
    }

    static Set zze(zzi zzi1)
    {
        return zzi1.zzPP;
    }

    static Context zzf(zzi zzi1)
    {
        return zzi1.mContext;
    }

    private void zzlS()
    {
        if (zzTu != null)
        {
            Log.e("GmsClient", (new StringBuilder()).append("Calling connect() while still connected, missing disconnect() for ").append(zzeq()).toString());
            zzTo.zzb(zzeq(), zzTu, zzlR());
        }
        zzTu = new zze();
        if (!zzTo.zza(zzeq(), zzTu, zzlR()))
        {
            Log.e("GmsClient", (new StringBuilder()).append("unable to connect to service: ").append(zzeq()).toString());
            mHandler.sendMessage(mHandler.obtainMessage(3, Integer.valueOf(9)));
        }
    }

    private void zzlT()
    {
        if (zzTu != null)
        {
            zzTo.zzb(zzeq(), zzTu, zzlR());
            zzTu = null;
        }
    }

    public void connect()
    {
        zzQs.zzmg();
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(mContext);
        if (i != 0)
        {
            zza(1, ((IInterface) (null)));
            mHandler.sendMessage(mHandler.obtainMessage(3, Integer.valueOf(i)));
            return;
        } else
        {
            zza(2, ((IInterface) (null)));
            return;
        }
    }

    public void disconnect()
    {
        zzQs.zzmf();
        ArrayList arraylist = zzTt;
        arraylist;
        JVM INSTR monitorenter ;
        int j = zzTt.size();
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((zzc)zzTt.get(i)).zzmd();
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        zzTt.clear();
        arraylist;
        JVM INSTR monitorexit ;
        zza(1, ((IInterface) (null)));
        return;
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        int i;
        printwriter.append(s).println("GmsClient:");
        filedescriptor = (new StringBuilder()).append(s).append("  ").toString();
        printwriter.append(filedescriptor).append("mStartServiceAction=").println(zzeq());
        synchronized (zzoe)
        {
            i = zzTv;
            as = zzTs;
        }
        printwriter.append(filedescriptor).append("mConnectState=");
        i;
        JVM INSTR tableswitch 1 4: default 116
    //                   1 179
    //                   2 149
    //                   3 159
    //                   4 169;
           goto _L1 _L2 _L3 _L4 _L5
_L2:
        break MISSING_BLOCK_LABEL_179;
_L1:
        printwriter.print("UNKNOWN");
_L6:
        printwriter.append(" mService=");
        if (as == null)
        {
            printwriter.println("null");
            return;
        } else
        {
            printwriter.append(zzer()).append("@").println(Integer.toHexString(System.identityHashCode(as.asBinder())));
            return;
        }
        filedescriptor;
        s;
        JVM INSTR monitorexit ;
        throw filedescriptor;
_L3:
        printwriter.print("CONNECTING");
          goto _L6
_L4:
        printwriter.print("CONNECTED");
          goto _L6
_L5:
        printwriter.print("DISCONNECTING");
          goto _L6
        printwriter.print("DISCONNECTED");
          goto _L6
    }

    public final Context getContext()
    {
        return mContext;
    }

    public final Looper getLooper()
    {
        return zzPx;
    }

    public boolean isConnected()
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (zzTv == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isConnecting()
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (zzTv == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        zzQs.registerConnectionCallbacks(connectioncallbacks);
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzQs.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    protected abstract IInterface zzD(IBinder ibinder);

    protected Set zza(Set set)
    {
        return set;
    }

    protected void zza(int i, IBinder ibinder, Bundle bundle)
    {
        mHandler.sendMessage(mHandler.obtainMessage(1, new zzf(i, ibinder, bundle)));
    }

    public void zza(com.google.android.gms.common.api.GoogleApiClient.zza zza1)
    {
        zzTr = (com.google.android.gms.common.api.GoogleApiClient.zza)zzv.zzb(zza1, "Must provide a non-null ConnectionStatusReportCallbacks");
        zzTq = true;
    }

    public final void zza(zzc zzc1)
    {
        synchronized (zzTt)
        {
            zzTt.add(zzc1);
        }
        mHandler.sendMessage(mHandler.obtainMessage(2, zzc1));
        return;
        zzc1;
        arraylist;
        JVM INSTR monitorexit ;
        throw zzc1;
    }

    public void zza(zzo zzo)
    {
        Bundle bundle = zzlY();
        zzo = new ValidateAccountRequest(zzo, (Scope[])zzPP.toArray(new Scope[zzPP.size()]), mContext.getPackageName(), bundle);
        try
        {
            zzTp.zza(new zzd(this), zzo);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzo zzo)
        {
            Log.w("GmsClient", "service died");
            zzaO(1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzo zzo)
        {
            Log.w("GmsClient", "Remote exception occurred", zzo);
        }
    }

    public void zza(zzo zzo, Set set)
    {
        Object obj;
        try
        {
            obj = zzka();
            obj = (new GetServiceRequest(zzTw)).zzbL(mContext.getPackageName()).zzf(((Bundle) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (zzo zzo)
        {
            Log.w("GmsClient", "service died");
            zzaO(1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzo zzo)
        {
            Log.w("GmsClient", "Remote exception occurred", zzo);
            return;
        }
        if (set == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ((GetServiceRequest) (obj)).zza((Scope[])set.toArray(new Scope[set.size()]));
        if (!zzjM()) goto _L2; else goto _L1
_L1:
        ((GetServiceRequest) (obj)).zzb(zzlE()).zzc(zzo);
_L4:
        zzTp.zza(new zzd(this), ((GetServiceRequest) (obj)));
        return;
_L2:
        if (zzlZ())
        {
            ((GetServiceRequest) (obj)).zzb(zzJc);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void zzaO(int i)
    {
        mHandler.sendMessage(mHandler.obtainMessage(4, Integer.valueOf(i)));
    }

    protected void zzb(int i, Bundle bundle)
    {
        mHandler.sendMessage(mHandler.obtainMessage(5, new zzh(i, bundle)));
    }

    protected abstract String zzeq();

    protected abstract String zzer();

    public boolean zzjM()
    {
        return false;
    }

    public Bundle zzjZ()
    {
        return null;
    }

    protected Bundle zzka()
    {
        return new Bundle();
    }

    public final Account zzlE()
    {
        if (zzJc != null)
        {
            return zzJc;
        } else
        {
            return new Account("<<default account>>", "com.google");
        }
    }

    protected String zzlR()
    {
        return zzQg.zzlK();
    }

    protected final com.google.android.gms.common.internal.zze zzlU()
    {
        return zzQg;
    }

    protected void zzlV()
    {
        mHandler.sendMessage(mHandler.obtainMessage(6, new zzg()));
    }

    protected final void zzlW()
    {
        if (!isConnected())
        {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        } else
        {
            return;
        }
    }

    public final IInterface zzlX()
        throws DeadObjectException
    {
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        if (zzTv == 4)
        {
            throw new DeadObjectException();
        }
        break MISSING_BLOCK_LABEL_28;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        zzlW();
        IInterface iinterface;
        boolean flag;
        if (zzTs != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzv.zza(flag, "Client is connected but service is null");
        iinterface = zzTs;
        obj;
        JVM INSTR monitorexit ;
        return iinterface;
    }

    protected Bundle zzlY()
    {
        return null;
    }

    public boolean zzlZ()
    {
        return false;
    }

}
