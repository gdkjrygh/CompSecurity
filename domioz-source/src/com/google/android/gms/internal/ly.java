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
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.ab;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.ap;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzc;
import com.google.android.gms.common.internal.zzy;
import java.util.Set;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.internal:
//            lj, lv, lu, zzut, 
//            lr, lk, lz

public final class ly extends k
    implements lj
{

    private final h d;
    private final lk e;
    private Integer f;
    private final ExecutorService g;

    public ly(Context context, Looper looper, h h1, lk lk1, n n, o o, ExecutorService executorservice)
    {
        super(context, looper, 44, n, o, h1);
        d = h1;
        e = lk1;
        f = h1.h();
        g = executorservice;
    }

    protected final IInterface a(IBinder ibinder)
    {
        return lv.a(ibinder);
    }

    public final void a(ab ab, Set set, lr lr1)
    {
        ap.a(lr1, "Expecting a valid ISignInCallbacks");
        try
        {
            ((lu)l()).a(new zzc(ab, set), lr1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ab ab)
        {
            Log.w("SignInClientImpl", "Remote service probably died when authAccount is called");
        }
        try
        {
            lr1.a(new ConnectionResult(8, null), new zzut());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ab ab)
        {
            Log.wtf("SignInClientImpl", "ISignInCallbacks#onAuthAccount should be executed from the same process, unexpected RemoteException.");
        }
    }

    public final void a(ab ab, boolean flag)
    {
        try
        {
            ((lu)l()).a(ab, f.intValue(), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ab ab)
        {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    public final void a(ak ak1)
    {
        ap.a(ak1, "Expecting a valid IResolveAccountCallbacks");
        try
        {
            android.accounts.Account account = d.c();
            ((lu)l()).a(new zzy(account, f.intValue()), ak1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.w("SignInClientImpl", "Remote service probably died when resolveAccount is called");
        }
        try
        {
            ak1.a(new zzaa());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ak ak1)
        {
            Log.wtf("SignInClientImpl", "IResolveAccountCallbacks#onAccountResolutionComplete should be executed from the same process, unexpected RemoteException.");
        }
    }

    protected final String e()
    {
        return "com.google.android.gms.signin.service.START";
    }

    protected final String f()
    {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public final void g_()
    {
        try
        {
            ((lu)l()).a(f.intValue());
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    protected final Bundle j()
    {
        Object obj = e;
        Integer integer = d.h();
        ExecutorService executorservice = g;
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", ((lk) (obj)).a());
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", ((lk) (obj)).b());
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", ((lk) (obj)).c());
        if (((lk) (obj)).d() != null)
        {
            bundle.putParcelable("com.google.android.gms.signin.internal.signInCallbacks", new BinderWrapper((new lz(((lk) (obj)), executorservice)).asBinder()));
        }
        if (integer != null)
        {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", integer.intValue());
        }
        obj = d.e();
        if (!i().getPackageName().equals(obj))
        {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", d.e());
        }
        return bundle;
    }
}
