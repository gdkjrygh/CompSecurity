// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
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
import com.google.android.gms.signin.internal.AuthAccountResult;
import java.util.Set;
import java.util.concurrent.ExecutorService;

public final class low extends kbo
    implements lpe
{

    private final boolean a;
    private final kax b;
    private final loi c;
    private Integer d;
    private final ExecutorService e;

    public low(Context context, Looper looper, boolean flag, kax kax1, jyq jyq, jys jys, ExecutorService executorservice)
    {
        super(context, looper, 44, kax1, jyq, jys);
        a = flag;
        b = kax1;
        c = kax1.g;
        d = kax1.h;
        e = executorservice;
    }

    protected final IInterface a(IBinder ibinder)
    {
        return lot.a(ibinder);
    }

    public final void a(kay kay, Set set, lop lop1)
    {
        b.f(lop1, "Expecting a valid ISignInCallbacks");
        try
        {
            ((los)o()).a(new AuthAccountRequest(kay, set), lop1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (kay kay)
        {
            Log.w("SignInClientImpl", "Remote service probably died when authAccount is called");
        }
        try
        {
            lop1.a(new ConnectionResult(8, null), new AuthAccountResult());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (kay kay)
        {
            Log.wtf("SignInClientImpl", "ISignInCallbacks#onAuthAccount should be executed from the same process, unexpected RemoteException.");
        }
    }

    public final void a(kay kay, boolean flag)
    {
        try
        {
            ((los)o()).a(kay, d.intValue(), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (kay kay)
        {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    public final void a(kcp kcp1)
    {
        b.f(kcp1, "Expecting a valid IResolveAccountCallbacks");
        Object obj;
        obj = b;
        if (((kax) (obj)).a == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        obj = ((kax) (obj)).a;
_L1:
        ((los)o()).a(new ResolveAccountRequest(((Account) (obj)), d.intValue()), kcp1);
        return;
        try
        {
            obj = new Account("<<default account>>", "com.google");
        }
        catch (RemoteException remoteexception)
        {
            Log.w("SignInClientImpl", "Remote service probably died when resolveAccount is called");
            try
            {
                kcp1.a(new ResolveAccountResponse(8));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (kcp kcp1)
            {
                Log.wtf("SignInClientImpl", "IResolveAccountCallbacks#onAccountResolutionComplete should be executed from the same process, unexpected RemoteException.");
            }
            return;
        }
          goto _L1
    }

    protected final String c()
    {
        return "com.google.android.gms.signin.service.START";
    }

    protected final String d()
    {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    protected final Bundle e()
    {
        Object obj = c;
        Integer integer = b.h;
        ExecutorService executorservice = e;
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", ((loi) (obj)).b);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", ((loi) (obj)).c);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", ((loi) (obj)).d);
        if (((loi) (obj)).e != null)
        {
            bundle.putParcelable("com.google.android.gms.signin.internal.signInCallbacks", new BinderWrapper((new lox(((loi) (obj)), executorservice)).asBinder()));
        }
        if (integer != null)
        {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", integer.intValue());
        }
        obj = b.e;
        if (!super.f.getPackageName().equals(obj))
        {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", b.e);
        }
        return bundle;
    }

    public final void f()
    {
        try
        {
            ((los)o()).a(d.intValue());
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    public final void g()
    {
        a(new kbu(this));
    }

    public final boolean k()
    {
        return a;
    }
}
