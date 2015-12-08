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
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzps;
import com.google.android.gms.internal.zzpt;
import java.util.Set;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.signin.internal:
//            zzf, AuthAccountResult, zze

public class zzh extends zzi
    implements zzps
{

    private final boolean d;
    private final zze e;
    private final zzpt f;
    private Integer g;
    private final ExecutorService h;

    public zzh(Context context, Looper looper, boolean flag, zze zze1, zzpt zzpt1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, 
            ExecutorService executorservice)
    {
        super(context, looper, 44, connectioncallbacks, onconnectionfailedlistener, zze1);
        d = flag;
        e = zze1;
        f = zzpt1;
        g = zze1.j();
        h = executorservice;
    }

    public static Bundle a(zzpt zzpt1, Integer integer, ExecutorService executorservice)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", zzpt1.a());
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", zzpt1.b());
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", zzpt1.c());
        if (zzpt1.d() != null)
        {
            bundle.putParcelable("com.google.android.gms.signin.internal.signInCallbacks", new BinderWrapper((new zza(zzpt1, executorservice)).asBinder()));
        }
        if (integer != null)
        {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", integer.intValue());
        }
        return bundle;
    }

    protected IInterface a(IBinder ibinder)
    {
        return b(ibinder);
    }

    public void a(IAccountAccessor iaccountaccessor, Set set, com.google.android.gms.signin.internal.zze zze1)
    {
        zzu.a(zze1, "Expecting a valid ISignInCallbacks");
        try
        {
            ((zzf)m()).a(new AuthAccountRequest(iaccountaccessor, set), zze1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IAccountAccessor iaccountaccessor)
        {
            Log.w("SignInClientImpl", "Remote service probably died when authAccount is called");
        }
        try
        {
            zze1.a(new ConnectionResult(8, null), new AuthAccountResult());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IAccountAccessor iaccountaccessor)
        {
            Log.wtf("SignInClientImpl", "ISignInCallbacks#onAuthAccount should be executed from the same process, unexpected RemoteException.");
        }
    }

    public void a(IAccountAccessor iaccountaccessor, boolean flag)
    {
        try
        {
            ((zzf)m()).a(iaccountaccessor, g.intValue(), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IAccountAccessor iaccountaccessor)
        {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    public void a(zzq zzq1)
    {
        zzu.a(zzq1, "Expecting a valid IResolveAccountCallbacks");
        try
        {
            android.accounts.Account account = e.c();
            ((zzf)m()).a(new ResolveAccountRequest(account, g.intValue()), zzq1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.w("SignInClientImpl", "Remote service probably died when resolveAccount is called");
        }
        try
        {
            zzq1.a(new ResolveAccountResponse(8));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzq zzq1)
        {
            Log.wtf("SignInClientImpl", "IResolveAccountCallbacks#onAccountResolutionComplete should be executed from the same process, unexpected RemoteException.");
        }
    }

    protected zzf b(IBinder ibinder)
    {
        return zzf.zza.a(ibinder);
    }

    public boolean c()
    {
        return d;
    }

    protected String d()
    {
        return "com.google.android.gms.signin.service.START";
    }

    protected String e()
    {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public void g()
    {
        a(new com.google.android.gms.common.internal.zzi.zzf(this));
    }

    public void g_()
    {
        try
        {
            ((zzf)m()).a(g.intValue());
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    protected Bundle k()
    {
        Bundle bundle = a(f, e.j(), h);
        String s = e.g();
        if (!i().getPackageName().equals(s))
        {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", e.g());
        }
        return bundle;
    }

    private class zza extends zzd.zza
    {

        private final zzpt a;
        private final ExecutorService b;

        private com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks a()
        {
            return a.d();
        }

        static com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks a(zza zza1)
        {
            return zza1.a();
        }

        public void a(String s, String s1, zzf zzf1)
        {
            b.submit(new Runnable(s, s1, zzf1) {

                final String a;
                final String b;
                final zzf c;
                final zza d;

                public void run()
                {
                    try
                    {
                        boolean flag = zza.a(d).a(a, b);
                        c.a(flag);
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        Log.e("SignInClientImpl", "RemoteException thrown when processing uploadServerAuthCode callback", remoteexception);
                    }
                }

                
                {
                    d = zza.this;
                    a = s;
                    b = s1;
                    c = zzf1;
                    super();
                }
            });
        }

        public void a(String s, List list, zzf zzf1)
        {
            b.submit(new Runnable(list, s, zzf1) {

                final List a;
                final String b;
                final zzf c;
                final zza d;

                public void run()
                {
                    try
                    {
                        Object obj = zza.a(d);
                        Set set = Collections.unmodifiableSet(new HashSet(a));
                        obj = ((com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks) (obj)).a(b, set);
                        obj = new CheckServerAuthResult(((com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks.CheckResult) (obj)).a(), ((com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks.CheckResult) (obj)).b());
                        c.a(((CheckServerAuthResult) (obj)));
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        Log.e("SignInClientImpl", "RemoteException thrown when processing checkServerAuthorization callback", remoteexception);
                    }
                }

                
                {
                    d = zza.this;
                    a = list;
                    b = s;
                    c = zzf1;
                    super();
                }
            });
        }

        public zza(zzpt zzpt1, ExecutorService executorservice)
        {
            a = zzpt1;
            b = executorservice;
        }
    }

}
