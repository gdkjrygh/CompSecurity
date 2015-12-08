// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzc;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.common.internal.zzy;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.internal:
//            zzur, zzus, zzva, zzut, 
//            zzuz, zzuw

public class zzvc extends zzk
    implements zzur
{
    static class zza extends zzuy.zza
    {

        private final zzus zzPr;
        private final ExecutorService zzawZ;

        static com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks zza(zza zza1)
        {
            return zza1.zzsx();
        }

        private com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks zzsx()
        {
            return zzPr.zzsx();
        }

        public void zza(String s, String s1, zzva zzva1)
        {
            zzawZ.submit(new Runnable(this, s, s1, zzva1) {

                final String zzaxb;
                final zzva zzaxc;
                final zza zzaxd;
                final String zzaxe;

                public void run()
                {
                    try
                    {
                        boolean flag = zza.zza(zzaxd).onUploadServerAuthCode(zzaxb, zzaxe);
                        zzaxc.zzaf(flag);
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        return;
                    }
                }

            
            {
                zzaxd = zza1;
                zzaxb = s;
                zzaxe = s1;
                zzaxc = zzva1;
                super();
            }
            });
        }

        public void zza(String s, List list, zzva zzva1)
        {
            zzawZ.submit(new Runnable(this, list, s, zzva1) {

                final List zzaxa;
                final String zzaxb;
                final zzva zzaxc;
                final zza zzaxd;

                public void run()
                {
                    try
                    {
                        Object obj = zza.zza(zzaxd);
                        Set set = Collections.unmodifiableSet(new HashSet(zzaxa));
                        obj = ((com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks) (obj)).onCheckServerAuthorization(zzaxb, set);
                        obj = new zzuw(((com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks.CheckResult) (obj)).zzic(), ((com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks.CheckResult) (obj)).zzid());
                        zzaxc.zza(((zzuw) (obj)));
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        return;
                    }
                }

            
            {
                zzaxd = zza1;
                zzaxa = list;
                zzaxb = s;
                zzaxc = zzva1;
                super();
            }
            });
        }

        public zza(zzus zzus1, ExecutorService executorservice)
        {
            zzPr = zzus1;
            zzawZ = executorservice;
        }
    }


    private final zzf zzPG;
    private final zzus zzPr;
    private Integer zzPs;
    private final ExecutorService zzawZ;

    public zzvc(Context context, Looper looper, zzf zzf1, zzus zzus1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, ExecutorService executorservice)
    {
        super(context, looper, 44, connectioncallbacks, onconnectionfailedlistener, zzf1);
        zzPG = zzf1;
        zzPr = zzus1;
        zzPs = zzf1.zziV();
        zzawZ = executorservice;
    }

    public static Bundle zza(zzus zzus1, Integer integer, ExecutorService executorservice)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", zzus1.zzsv());
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", zzus1.zzsw());
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", zzus1.zzrN());
        if (zzus1.zzsx() != null)
        {
            bundle.putParcelable("com.google.android.gms.signin.internal.signInCallbacks", new BinderWrapper((new zza(zzus1, executorservice)).asBinder()));
        }
        if (integer != null)
        {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", integer.intValue());
        }
        return bundle;
    }

    public void zza(zzq zzq, Set set, zzuz zzuz1)
    {
        zzx.zzb(zzuz1, "Expecting a valid ISignInCallbacks");
        try
        {
            ((zzva)zzjb()).zza(new zzc(zzq, set), zzuz1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzq zzq) { }
        try
        {
            zzuz1.zza(new ConnectionResult(8, null), new zzut());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzq zzq)
        {
            Log.wtf("SignInClientImpl", "ISignInCallbacks#onAuthAccount should be executed from the same process, unexpected RemoteException.");
        }
    }

    public void zza(zzq zzq, boolean flag)
    {
        try
        {
            ((zzva)zzjb()).zza(zzq, zzPs.intValue(), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzq zzq)
        {
            return;
        }
    }

    public void zza(zzt zzt1)
    {
        zzx.zzb(zzt1, "Expecting a valid IResolveAccountCallbacks");
        try
        {
            android.accounts.Account account = zzPG.zziN();
            ((zzva)zzjb()).zza(new zzy(account, zzPs.intValue()), zzt1);
            return;
        }
        catch (RemoteException remoteexception) { }
        try
        {
            zzt1.zzb(new zzaa(8));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzt zzt1)
        {
            Log.wtf("SignInClientImpl", "IResolveAccountCallbacks#onAccountResolutionComplete should be executed from the same process, unexpected RemoteException.");
        }
    }

    protected String zzcF()
    {
        return "com.google.android.gms.signin.service.START";
    }

    protected zzva zzcG(IBinder ibinder)
    {
        return zzva.zza.zzcF(ibinder);
    }

    protected String zzcG()
    {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    protected Bundle zzhq()
    {
        Bundle bundle = zza(zzPr, zzPG.zziV(), zzawZ);
        String s = zzPG.zziR();
        if (!getContext().getPackageName().equals(s))
        {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", zzPG.zziR());
        }
        return bundle;
    }

    protected IInterface zzp(IBinder ibinder)
    {
        return zzcG(ibinder);
    }

    public void zzsu()
    {
        try
        {
            ((zzva)zzjb()).zzhb(zzPs.intValue());
            return;
        }
        catch (RemoteException remoteexception)
        {
            return;
        }
    }
}
