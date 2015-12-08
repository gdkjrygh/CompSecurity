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
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.aa;
import com.google.android.gms.common.internal.ag;
import com.google.android.gms.common.internal.as;
import com.google.android.gms.common.internal.bc;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.internal.xi;
import com.google.android.gms.internal.xj;
import java.util.Set;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.signin.internal:
//            j, i, AuthAccountResult, f, 
//            o

public final class n extends aa
    implements xi
{

    private final boolean a;
    private final w d;
    private final xj e;
    private Integer f;
    private final ExecutorService g;

    public n(Context context, Looper looper, boolean flag, w w1, xj xj1, k k, l l, 
            ExecutorService executorservice)
    {
        super(context, looper, 44, w1, k, l);
        a = flag;
        d = w1;
        e = xj1;
        f = w1.i();
        g = executorservice;
    }

    protected final IInterface a(IBinder ibinder)
    {
        return j.a(ibinder);
    }

    protected final String a()
    {
        return "com.google.android.gms.signin.service.START";
    }

    public final void a(as as, Set set, f f1)
    {
        bl.a(f1, "Expecting a valid ISignInCallbacks");
        try
        {
            ((i)zzpc()).a(new AuthAccountRequest(as, set), f1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (as as)
        {
            Log.w("SignInClientImpl", "Remote service probably died when authAccount is called");
        }
        try
        {
            f1.a(new ConnectionResult(8, null), new AuthAccountResult());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            Log.wtf("SignInClientImpl", "ISignInCallbacks#onAuthAccount should be executed from the same process, unexpected RemoteException.", as);
        }
    }

    public final void a(as as, boolean flag)
    {
        try
        {
            ((i)zzpc()).a(as, f.intValue(), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (as as)
        {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    public final void a(bc bc1)
    {
        bl.a(bc1, "Expecting a valid IResolveAccountCallbacks");
        try
        {
            android.accounts.Account account = d.b();
            ((i)zzpc()).a(new ResolveAccountRequest(account, f.intValue()), bc1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.w("SignInClientImpl", "Remote service probably died when resolveAccount is called");
            try
            {
                bc1.a(new ResolveAccountResponse());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (bc bc1)
            {
                Log.wtf("SignInClientImpl", "IResolveAccountCallbacks#onAccountResolutionComplete should be executed from the same process, unexpected RemoteException.", remoteexception);
            }
            return;
        }
    }

    protected final String b()
    {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public final void d()
    {
        zza(new ag(this));
    }

    protected final Bundle e()
    {
        Object obj = e;
        Integer integer = d.i();
        ExecutorService executorservice = g;
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", ((xj) (obj)).a());
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", ((xj) (obj)).b());
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", ((xj) (obj)).c());
        if (((xj) (obj)).d() != null)
        {
            bundle.putParcelable("com.google.android.gms.signin.internal.signInCallbacks", new BinderWrapper((new o(((xj) (obj)), executorservice)).asBinder()));
        }
        if (integer != null)
        {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", integer.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", ((xj) (obj)).e());
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", ((xj) (obj)).f());
        obj = d.f();
        if (!getContext().getPackageName().equals(obj))
        {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", d.f());
        }
        return bundle;
    }

    public final void f_()
    {
        try
        {
            ((i)zzpc()).a(f.intValue());
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    public final boolean zzlN()
    {
        return a;
    }
}
