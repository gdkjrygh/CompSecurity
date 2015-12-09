// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzo;
import com.google.android.gms.common.internal.zzr;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzmd;
import com.google.android.gms.internal.zzme;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.signin.internal:
//            zzf, AuthAccountResult, zze, CheckServerAuthResult

public class zzh extends zzi
    implements zzmd
{
    private static class a extends zzd.zza
    {

        private final zzme a;
        private final ExecutorService b;

        private com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks a()
            throws RemoteException
        {
            return a.zzwh();
        }

        static com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks a(a a1)
            throws RemoteException
        {
            return a1.a();
        }

        public void zza(String s, String s1, zzf zzf1)
            throws RemoteException
        {
            b.submit(new Runnable(this, s, s1, zzf1) {

                final String a;
                final String b;
                final zzf c;
                final a d;

                public void run()
                {
                    try
                    {
                        boolean flag = a.a(d).onUploadServerAuthCode(a, b);
                        c.zzag(flag);
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        Log.e("SignInClientImpl", "RemoteException thrown when processing uploadServerAuthCode callback", remoteexception);
                    }
                }

            
            {
                d = a1;
                a = s;
                b = s1;
                c = zzf1;
                super();
            }
            });
        }

        public void zza(String s, List list, zzf zzf1)
            throws RemoteException
        {
            b.submit(new Runnable(this, list, s, zzf1) {

                final List a;
                final String b;
                final zzf c;
                final a d;

                public void run()
                {
                    try
                    {
                        Object obj = a.a(d);
                        Set set = Collections.unmodifiableSet(new HashSet(a));
                        obj = ((com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks) (obj)).onCheckServerAuthorization(b, set);
                        obj = new CheckServerAuthResult(((com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks.CheckResult) (obj)).zzkN(), ((com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks.CheckResult) (obj)).zzkO());
                        c.zza(((CheckServerAuthResult) (obj)));
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        Log.e("SignInClientImpl", "RemoteException thrown when processing checkServerAuthorization callback", remoteexception);
                    }
                }

            
            {
                d = a1;
                a = list;
                b = s;
                c = zzf1;
                super();
            }
            });
        }

        public a(zzme zzme1, ExecutorService executorservice)
        {
            a = zzme1;
            b = executorservice;
        }
    }


    private final zze zzQg;
    private final zzme zzSY;
    private Integer zzSZ;
    private final ExecutorService zzaBN;

    public zzh(Context context, Looper looper, zze zze1, zzme zzme1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, ExecutorService executorservice)
    {
        super(context, looper, 44, connectioncallbacks, onconnectionfailedlistener, zze1);
        zzQg = zze1;
        zzSY = zzme1;
        zzSZ = zze1.zzlN();
        zzaBN = executorservice;
    }

    public static Bundle zza(zzme zzme1, Integer integer, ExecutorService executorservice)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", zzme1.zzwf());
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", zzme1.zzwg());
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", zzme1.zzvx());
        if (zzme1.zzwh() != null)
        {
            bundle.putParcelable("com.google.android.gms.signin.internal.signInCallbacks", new BinderWrapper((new a(zzme1, executorservice)).asBinder()));
        }
        if (integer != null)
        {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", integer.intValue());
        }
        return bundle;
    }

    protected IInterface zzD(IBinder ibinder)
    {
        return zzcI(ibinder);
    }

    public void zza(zzo zzo, Set set, com.google.android.gms.signin.internal.zze zze1)
    {
        zzv.zzb(zze1, "Expecting a valid ISignInCallbacks");
        try
        {
            ((zzf)zzlX()).zza(new AuthAccountRequest(zzo, set), zze1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzo zzo)
        {
            Log.w("SignInClientImpl", "Remote service probably died when authAccount is called");
        }
        try
        {
            zze1.zza(new ConnectionResult(8, null), new AuthAccountResult());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzo zzo)
        {
            Log.wtf("SignInClientImpl", "ISignInCallbacks#onAuthAccount should be executed from the same process, unexpected RemoteException.");
        }
    }

    public void zza(zzo zzo, boolean flag)
    {
        try
        {
            ((zzf)zzlX()).zza(zzo, zzSZ.intValue(), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzo zzo)
        {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    public void zza(zzr zzr1)
    {
        zzv.zzb(zzr1, "Expecting a valid IResolveAccountCallbacks");
        try
        {
            android.accounts.Account account = zzQg.zzlE();
            ((zzf)zzlX()).zza(new ResolveAccountRequest(account, zzSZ.intValue()), zzr1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.w("SignInClientImpl", "Remote service probably died when resolveAccount is called");
        }
        try
        {
            zzr1.zzb(new ResolveAccountResponse(8));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzr zzr1)
        {
            Log.wtf("SignInClientImpl", "IResolveAccountCallbacks#onAccountResolutionComplete should be executed from the same process, unexpected RemoteException.");
        }
    }

    protected zzf zzcI(IBinder ibinder)
    {
        return zzf.zza.zzcH(ibinder);
    }

    protected String zzeq()
    {
        return "com.google.android.gms.signin.service.START";
    }

    protected String zzer()
    {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    protected Bundle zzka()
    {
        Bundle bundle = zza(zzSY, zzQg.zzlN(), zzaBN);
        String s = zzQg.zzlJ();
        if (!getContext().getPackageName().equals(s))
        {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", zzQg.zzlJ());
        }
        return bundle;
    }

    public void zzwe()
    {
        try
        {
            ((zzf)zzlX()).zzhB(zzSZ.intValue());
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }
}
