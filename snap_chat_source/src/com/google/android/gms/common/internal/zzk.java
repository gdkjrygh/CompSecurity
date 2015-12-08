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
import com.google.android.gms.internal.zzmh;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzx, zzm, zzl, zzf, 
//            zzae, zzs, zzi, zzq

public abstract class zzk
    implements com.google.android.gms.common.api.Api.zza, zzl.zza
{
    abstract class zza extends zzc
    {

        public final int statusCode;
        public final Bundle zzPS;
        final zzk zzPT;

        protected void zzc(Boolean boolean1)
        {
            if (boolean1 != null) goto _L2; else goto _L1
_L1:
            zzk.zza(zzPT, 1, null);
_L4:
            return;
_L2:
            switch (statusCode)
            {
            default:
                if (zzPS != null)
                {
                    boolean1 = (PendingIntent)zzPS.getParcelable("pendingIntent");
                } else
                {
                    boolean1 = null;
                }
                if (zzk.zzf(zzPT) != null)
                {
                    zzk.zzg(zzPT).zzb(zzPT.zzcF(), zzk.zzf(zzPT), zzPT.zziZ());
                    zzk.zza(zzPT, null);
                }
                zzk.zza(zzPT, 1, null);
                zzf(new ConnectionResult(statusCode, boolean1));
                return;

            case 0: // '\0'
                if (!zzje())
                {
                    if (zzk.zzf(zzPT) != null)
                    {
                        zzk.zzg(zzPT).zzb(zzPT.zzcF(), zzk.zzf(zzPT), zzPT.zziZ());
                        zzk.zza(zzPT, null);
                    }
                    zzk.zza(zzPT, 1, null);
                    zzf(new ConnectionResult(8, null));
                    return;
                }
                break;

            case 10: // '\n'
                zzk.zza(zzPT, 1, null);
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        protected void zzf(ConnectionResult connectionresult)
        {
            zzk.zza(zzPT).zzg(connectionresult);
        }

        protected void zzi(Object obj)
        {
            zzc((Boolean)obj);
        }

        protected abstract boolean zzje();

        protected void zzjf()
        {
        }

        protected zza(int i, Bundle bundle)
        {
            zzPT = zzk.this;
            super(Boolean.valueOf(true));
            statusCode = i;
            zzPS = bundle;
        }
    }

    final class zzb extends Handler
    {

        final zzk zzPT;

        public final void handleMessage(Message message)
        {
            if ((message.what == 1 || message.what == 5 || message.what == 6) && !zzPT.isConnecting())
            {
                message = (zzc)message.obj;
                message.zzjf();
                message.unregister();
                return;
            }
            if (message.what == 3)
            {
                zzk.zza(zzPT).zzg(new ConnectionResult(((Integer)message.obj).intValue(), null));
                return;
            }
            if (message.what == 4)
            {
                zzk.zza(zzPT, 4, null);
                zzk.zza(zzPT).zzaJ(((Integer)message.obj).intValue());
                zzk.zza(zzPT, 4, 1, null);
                return;
            }
            if (message.what == 2 && !zzPT.isConnected())
            {
                message = (zzc)message.obj;
                message.zzjf();
                message.unregister();
                return;
            }
            if (message.what == 2 || message.what == 1 || message.what == 5 || message.what == 6)
            {
                ((zzc)message.obj).zzjg();
                return;
            } else
            {
                Log.wtf("GmsClient", "Don't know how to handle this message.");
                return;
            }
        }

        public zzb(Looper looper)
        {
            zzPT = zzk.this;
            super(looper);
        }
    }

    public abstract class zzc
    {

        private Object mListener;
        final zzk zzPT;
        private boolean zzPU;

        public void unregister()
        {
            zzjh();
            synchronized (zzk.zzb(zzPT))
            {
                zzk.zzb(zzPT).remove(this);
            }
            return;
            exception;
            arraylist;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected abstract void zzi(Object obj);

        protected abstract void zzjf();

        public void zzjg()
        {
            this;
            JVM INSTR monitorenter ;
            Object obj;
            obj = mListener;
            if (zzPU)
            {
                (new StringBuilder("Callback proxy ")).append(this).append(" being reused. This is not safe.");
            }
            this;
            JVM INSTR monitorexit ;
            Object obj1;
            if (obj != null)
            {
                try
                {
                    zzi(obj);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    zzjf();
                    throw obj1;
                }
            } else
            {
                zzjf();
            }
            this;
            JVM INSTR monitorenter ;
            zzPU = true;
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

        public void zzjh()
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

        public zzc(Object obj)
        {
            zzPT = zzk.this;
            super();
            mListener = obj;
            zzPU = false;
        }
    }

    public static final class zzd extends zzr.zza
    {

        private zzk zzPV;

        private void zzji()
        {
            zzPV = null;
        }

        public final void zzb(int i, IBinder ibinder, Bundle bundle)
        {
            zzx.zzb(zzPV, "onPostInitComplete can be called only once per call to getRemoteService");
            zzPV.zza(i, ibinder, bundle);
            zzji();
        }

        public final void zzc(int i, Bundle bundle)
        {
            zzx.zzb(zzPV, "onAccountValidationComplete can be called only once per call to validateAccount");
            zzPV.zzb(i, bundle);
            zzji();
        }

        public zzd(zzk zzk1)
        {
            zzPV = zzk1;
        }
    }

    public final class zze
        implements ServiceConnection
    {

        final zzk zzPT;

        public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            zzx.zzb(ibinder, "Expecting a valid IBinder");
            zzk.zza(zzPT, zzs.zza.zzU(ibinder));
            zzPT.mHandler.sendMessage(zzPT.mHandler.obtainMessage(6, zzPT. new zzg()));
        }

        public final void onServiceDisconnected(ComponentName componentname)
        {
            zzPT.mHandler.sendMessage(zzPT.mHandler.obtainMessage(4, Integer.valueOf(1)));
        }

        public zze()
        {
            zzPT = zzk.this;
            super();
        }
    }

    public final class zzf extends zza
    {

        final zzk zzPT;
        public final IBinder zzPW;

        protected final boolean zzje()
        {
            Object obj;
            try
            {
                obj = zzPW.getInterfaceDescriptor();
            }
            catch (RemoteException remoteexception)
            {
                return false;
            }
            if (zzPT.zzcG().equals(obj))
            {
                if ((obj = zzPT.zzp(zzPW)) != null && zzk.zza(zzPT, 2, 3, ((IInterface) (obj))))
                {
                    zzk.zza(zzPT).zzfe();
                    GooglePlayServicesUtil.zzL(zzk.zze(zzPT));
                    return true;
                }
            }
            return false;
        }

        public zzf(int i, IBinder ibinder, Bundle bundle)
        {
            zzPT = zzk.this;
            super(i, bundle);
            zzPW = ibinder;
        }
    }

    public final class zzg extends zza
    {

        final zzk zzPT;

        protected final boolean zzje()
        {
            if (zzk.zzc(zzPT))
            {
                boolean flag;
                if (zzk.zzd(zzPT) != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                zzx.zza(flag, "mConnectionProgressReportCallbacks should not be null if mReportProgress");
                zzk.zzd(zzPT).zzia();
                return true;
            } else
            {
                zzPT.zzb(null);
                return true;
            }
        }

        public zzg()
        {
            zzPT = zzk.this;
            super(0, null);
        }
    }

    public final class zzh extends zza
    {

        final zzk zzPT;

        protected final boolean zzje()
        {
            boolean flag;
            if (zzk.zzc(zzPT) && zzk.zzd(zzPT) != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzx.zza(flag, "PostValidationCallback should not happen when mReportProgress is false ormConnectionProgressReportCallbacks is null");
            zzk.zzd(zzPT).zzib();
            return true;
        }

        public zzh(int i, Bundle bundle)
        {
            zzPT = zzk.this;
            super(i, bundle);
        }
    }


    public static final String zzPR[] = {
        "service_esmobile", "service_googleme"
    };
    private final Context mContext;
    final Handler mHandler;
    private final Account zzFN;
    private final List zzMM;
    private final Looper zzMc;
    private final zzl zzMu;
    private final com.google.android.gms.common.internal.zzf zzPG;
    private final zzm zzPH;
    private zzs zzPI;
    private boolean zzPJ;
    private com.google.android.gms.common.api.GoogleApiClient.zza zzPK;
    private IInterface zzPL;
    private final ArrayList zzPM;
    private zze zzPN;
    private int zzPO;
    boolean zzPP;
    private final int zzPQ;
    private final Object zznh;

    public zzk(Context context, Looper looper, int i, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zznh = new Object();
        zzPJ = false;
        zzPM = new ArrayList();
        zzPO = 1;
        zzPP = false;
        mContext = (Context)zzx.zzl(context);
        zzMc = (Looper)zzx.zzb(looper, "Looper must not be null");
        zzPH = zzm.zzP(context);
        zzMu = new zzl(looper, this);
        mHandler = new zzb(looper);
        zzPQ = i;
        zzFN = null;
        zzMM = null;
        zzPG = (new com.google.android.gms.common.api.GoogleApiClient.Builder(context)).zzhY();
        registerConnectionCallbacks((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)zzx.zzl(connectioncallbacks));
        registerConnectionFailedListener((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)zzx.zzl(onconnectionfailedlistener));
    }

    public zzk(Context context, Looper looper, int i, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, com.google.android.gms.common.internal.zzf zzf1)
    {
        this(context, looper, zzm.zzP(context), i, zzf1, connectioncallbacks, onconnectionfailedlistener);
    }

    protected zzk(Context context, Looper looper, zzm zzm1, int i, com.google.android.gms.common.internal.zzf zzf1)
    {
        zznh = new Object();
        zzPJ = false;
        zzPM = new ArrayList();
        zzPO = 1;
        zzPP = false;
        mContext = (Context)zzx.zzb(context, "Context must not be null");
        zzMc = (Looper)zzx.zzb(looper, "Looper must not be null");
        zzPH = (zzm)zzx.zzb(zzm1, "Supervisor must not be null");
        zzMu = new zzl(looper, this);
        mHandler = new zzb(looper);
        zzPQ = i;
        zzPG = (com.google.android.gms.common.internal.zzf)zzx.zzl(zzf1);
        zzFN = zzf1.getAccount();
        zzMM = zzh(zzf1.zziP());
    }

    protected zzk(Context context, Looper looper, zzm zzm1, int i, com.google.android.gms.common.internal.zzf zzf1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        this(context, looper, zzm1, i, zzf1);
        registerConnectionCallbacks((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)zzx.zzl(connectioncallbacks));
        registerConnectionFailedListener((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)zzx.zzl(onconnectionfailedlistener));
    }

    static zze zza(zzk zzk1, zze zze1)
    {
        zzk1.zzPN = zze1;
        return zze1;
    }

    static zzl zza(zzk zzk1)
    {
        return zzk1.zzMu;
    }

    static zzs zza(zzk zzk1, zzs zzs1)
    {
        zzk1.zzPI = zzs1;
        return zzs1;
    }

    private void zza(int i, IInterface iinterface)
    {
        boolean flag2 = true;
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
        zzx.zzO(flag2);
        synchronized (zznh)
        {
            zzPO = i;
            zzPL = iinterface;
        }
        return;
        iinterface;
        obj;
        JVM INSTR monitorexit ;
        throw iinterface;
    }

    static void zza(zzk zzk1, int i, IInterface iinterface)
    {
        zzk1.zza(i, iinterface);
    }

    private boolean zza(int i, int j, IInterface iinterface)
    {
label0:
        {
            synchronized (zznh)
            {
                if (zzPO == i)
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

    static boolean zza(zzk zzk1, int i, int j, IInterface iinterface)
    {
        return zzk1.zza(i, j, iinterface);
    }

    static ArrayList zzb(zzk zzk1)
    {
        return zzk1.zzPM;
    }

    static boolean zzc(zzk zzk1)
    {
        return zzk1.zzPJ;
    }

    static com.google.android.gms.common.api.GoogleApiClient.zza zzd(zzk zzk1)
    {
        return zzk1.zzPK;
    }

    static Context zze(zzk zzk1)
    {
        return zzk1.mContext;
    }

    static zze zzf(zzk zzk1)
    {
        return zzk1.zzPN;
    }

    static zzm zzg(zzk zzk1)
    {
        return zzk1.zzPH;
    }

    private List zzh(List list)
    {
        List list1 = zzf(list);
        if (list1 == null || list1 == list)
        {
            return list1;
        }
        for (Iterator iterator = list1.iterator(); iterator.hasNext();)
        {
            if (!list.contains((String)iterator.next()))
            {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }

        return list1;
    }

    public void connect()
    {
        zzPP = true;
        zza(2, ((IInterface) (null)));
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(mContext);
        if (i != 0)
        {
            zza(1, ((IInterface) (null)));
            mHandler.sendMessage(mHandler.obtainMessage(3, Integer.valueOf(i)));
        } else
        {
            if (zzPN != null)
            {
                (new StringBuilder("Calling connect() while still connected, missing disconnect() for ")).append(zzcF());
                zzPH.zzb(zzcF(), zzPN, zziZ());
            }
            zzPN = new zze();
            if (!zzPH.zza(zzcF(), zzPN, zziZ()))
            {
                (new StringBuilder("unable to connect to service: ")).append(zzcF());
                mHandler.sendMessage(mHandler.obtainMessage(3, Integer.valueOf(9)));
                return;
            }
        }
    }

    public void disconnect()
    {
        zzPP = false;
        ArrayList arraylist = zzPM;
        arraylist;
        JVM INSTR monitorenter ;
        int j = zzPM.size();
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((zzc)zzPM.get(i)).zzjh();
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        zzPM.clear();
        arraylist;
        JVM INSTR monitorexit ;
        zza(1, ((IInterface) (null)));
        if (zzPN != null)
        {
            zzPH.zzb(zzcF(), zzPN, zziZ());
            zzPN = null;
        }
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
        printwriter.append(filedescriptor).append("mStartServiceAction=").println(zzcF());
        synchronized (zznh)
        {
            i = zzPO;
            as = zzPL;
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
            printwriter.append(zzcG()).append("@").println(Integer.toHexString(System.identityHashCode(as.asBinder())));
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

    public boolean isConnected()
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (zzPO == 3)
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
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (zzPO == 2)
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
        zzMu.registerConnectionCallbacks(connectioncallbacks);
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzMu.registerConnectionFailedListener(onconnectionfailedlistener);
    }

    protected void zza(int i, IBinder ibinder, Bundle bundle)
    {
        mHandler.sendMessage(mHandler.obtainMessage(1, new zzf(i, ibinder, bundle)));
    }

    public void zza(com.google.android.gms.common.api.GoogleApiClient.zza zza1)
    {
        zzPK = (com.google.android.gms.common.api.GoogleApiClient.zza)zzx.zzb(zza1, "Must provide a non-null ConnectionStatusReportCallbacks");
        zzPJ = true;
    }

    public void zza(zzq zzq)
    {
        Bundle bundle = zzjc();
        com.google.android.gms.common.api.Scope ascope[];
        if (zzMM == null)
        {
            ascope = null;
        } else
        {
            ascope = zzmh.zzi(zzMM);
        }
        zzq = new zzae(zzq, ascope, mContext.getPackageName(), bundle);
        try
        {
            zzPI.zza(new zzd(this), zzq);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzq zzq)
        {
            zzaI(1);
        }
        // Misplaced declaration of an exception variable
        catch (zzq zzq)
        {
            return;
        }
    }

    public void zzaI(int i)
    {
        mHandler.sendMessage(mHandler.obtainMessage(4, Integer.valueOf(i)));
    }

    protected void zzb(int i, Bundle bundle)
    {
        mHandler.sendMessage(mHandler.obtainMessage(5, new zzh(i, bundle)));
    }

    public void zzb(zzq zzq)
    {
        Object obj;
        obj = zzhq();
        obj = (new zzi(zzPQ)).zzbg(mContext.getPackageName()).zzi(((Bundle) (obj)));
        if (zzMM != null)
        {
            ((zzi) (obj)).zza(zzmh.zzi(zzMM));
        }
        if (!zzhc()) goto _L2; else goto _L1
_L1:
        ((zzi) (obj)).zzb(zziN()).zzd(zzq);
_L4:
        zzPI.zza(new zzd(this), ((zzi) (obj)));
        return;
_L2:
        if (zzjd())
        {
            ((zzi) (obj)).zzb(zzFN);
        }
        if (true) goto _L4; else goto _L3
_L3:
        zzq;
        zzaI(1);
        return;
        zzq;
    }

    public abstract String zzcF();

    public abstract String zzcG();

    protected List zzf(List list)
    {
        return list;
    }

    public final void zzfc()
    {
        if (!isConnected())
        {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        } else
        {
            return;
        }
    }

    public boolean zzhc()
    {
        return false;
    }

    public Bundle zzhp()
    {
        return null;
    }

    public Bundle zzhq()
    {
        return new Bundle();
    }

    public final Account zziN()
    {
        if (zzFN != null)
        {
            return zzFN;
        } else
        {
            return new Account("<<default account>>", "com.google");
        }
    }

    protected String zziZ()
    {
        return zzPG.zziS();
    }

    public boolean zzin()
    {
        return zzPP;
    }

    public final IInterface zzjb()
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        if (zzPO == 4)
        {
            throw new DeadObjectException();
        }
        break MISSING_BLOCK_LABEL_28;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        zzfc();
        IInterface iinterface;
        boolean flag;
        if (zzPL != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zza(flag, "Client is connected but service is null");
        iinterface = zzPL;
        obj;
        JVM INSTR monitorexit ;
        return iinterface;
    }

    protected Bundle zzjc()
    {
        return null;
    }

    public boolean zzjd()
    {
        return false;
    }

    public abstract IInterface zzp(IBinder ibinder);

}
