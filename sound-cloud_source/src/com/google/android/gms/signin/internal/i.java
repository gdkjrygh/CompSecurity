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
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzp;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.signin.f;
import com.google.android.gms.signin.g;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.signin.internal:
//            f, AuthAccountResult, e, k, 
//            j

public final class i extends zzj
    implements f
{
    private static final class a extends d.a
    {

        private final g a;
        private final ExecutorService b;

        static com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks a(a a1)
            throws RemoteException
        {
            return a1.a.e;
        }

        public final void a(String s, String s1, com.google.android.gms.signin.internal.f f1)
            throws RemoteException
        {
            b.submit(new k(this, s, s1, f1));
        }

        public final void a(String s, List list, com.google.android.gms.signin.internal.f f1)
            throws RemoteException
        {
            b.submit(new j(this, list, s, f1));
        }

        public a(g g1, ExecutorService executorservice)
        {
            a = g1;
            b = executorservice;
        }
    }


    private final boolean a;
    private final zzf b;
    private final g c;
    private Integer d;
    private final ExecutorService e;

    public i(Context context, Looper looper, boolean flag, zzf zzf1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, ExecutorService executorservice)
    {
        super(context, looper, 44, zzf1, connectioncallbacks, onconnectionfailedlistener);
        a = flag;
        b = zzf1;
        c = zzf1.zzoo();
        d = zzf1.zzop();
        e = executorservice;
    }

    public final void a()
    {
        try
        {
            ((com.google.android.gms.signin.internal.f)zzoA()).a(d.intValue());
            return;
        }
        catch (RemoteException remoteexception)
        {
            return;
        }
    }

    public final void a(zzp zzp, Set set, e e1)
    {
        zzx.zzb(e1, "Expecting a valid ISignInCallbacks");
        try
        {
            ((com.google.android.gms.signin.internal.f)zzoA()).a(new AuthAccountRequest(zzp, set), e1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzp zzp) { }
        try
        {
            e1.zza(new ConnectionResult(8, null), new AuthAccountResult());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzp zzp)
        {
            Log.wtf("SignInClientImpl", "ISignInCallbacks#onAuthAccount should be executed from the same process, unexpected RemoteException.");
        }
    }

    public final void a(zzp zzp, boolean flag)
    {
        try
        {
            ((com.google.android.gms.signin.internal.f)zzoA()).a(zzp, d.intValue(), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzp zzp)
        {
            return;
        }
    }

    public final void a(zzt zzt1)
    {
        zzx.zzb(zzt1, "Expecting a valid IResolveAccountCallbacks");
        try
        {
            android.accounts.Account account = b.zzog();
            ((com.google.android.gms.signin.internal.f)zzoA()).a(new ResolveAccountRequest(account, d.intValue()), zzt1);
            return;
        }
        catch (RemoteException remoteexception) { }
        try
        {
            zzt1.zzb(new ResolveAccountResponse(8));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzt zzt1)
        {
            Log.wtf("SignInClientImpl", "IResolveAccountCallbacks#onAccountResolutionComplete should be executed from the same process, unexpected RemoteException.");
        }
    }

    public final void b()
    {
        zza(new com.google.android.gms.common.internal.zzj.zzf(this));
    }

    protected final IInterface zzV(IBinder ibinder)
    {
        return f.a.a(ibinder);
    }

    protected final String zzfA()
    {
        return "com.google.android.gms.signin.service.START";
    }

    protected final String zzfB()
    {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    protected final Bundle zzli()
    {
        Object obj = c;
        Integer integer = b.zzop();
        ExecutorService executorservice = e;
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", ((g) (obj)).b);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", ((g) (obj)).c);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", ((g) (obj)).d);
        if (((g) (obj)).e != null)
        {
            bundle.putParcelable("com.google.android.gms.signin.internal.signInCallbacks", new BinderWrapper((new a(((g) (obj)), executorservice)).asBinder()));
        }
        if (integer != null)
        {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", integer.intValue());
        }
        obj = b.zzol();
        if (!getContext().getPackageName().equals(obj))
        {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", b.zzol());
        }
        return bundle;
    }

    public final boolean zzlm()
    {
        return a;
    }
}
