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
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.AuthAccountResult;
import java.util.Set;
import java.util.concurrent.ExecutorService;

public final class cqg extends bsc
    implements cok
{

    private final boolean a;
    private final bry b;
    private final col c;
    private Integer d;

    public cqg(Context context, Looper looper, boolean flag, bry bry1, col col1, bqw bqw, bqx bqx, 
            ExecutorService executorservice)
    {
        super(context, looper, 44, bry1, bqw, bqx);
        a = flag;
        b = bry1;
        c = col1;
        d = bry1.g;
    }

    protected final IInterface a(IBinder ibinder)
    {
        return cqc.a(ibinder);
    }

    protected final String a()
    {
        return "com.google.android.gms.signin.service.START";
    }

    public final void a(bsu bsu, Set set, cpy cpy1)
    {
        btl.a(cpy1, "Expecting a valid ISignInCallbacks");
        try
        {
            ((cqb)p()).a(new AuthAccountRequest(bsu, set), cpy1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (bsu bsu)
        {
            Log.w("SignInClientImpl", "Remote service probably died when authAccount is called");
        }
        try
        {
            cpy1.a(new ConnectionResult(8, null), new AuthAccountResult());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            Log.wtf("SignInClientImpl", "ISignInCallbacks#onAuthAccount should be executed from the same process, unexpected RemoteException.", bsu);
        }
    }

    public final void a(bsu bsu, boolean flag)
    {
        try
        {
            ((cqb)p()).a(bsu, d.intValue(), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (bsu bsu)
        {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    public final void a(btd btd1)
    {
        btl.a(btd1, "Expecting a valid IResolveAccountCallbacks");
        try
        {
            Account account = new Account("<<default account>>", "com.google");
            ((cqb)p()).a(new ResolveAccountRequest(account, d.intValue()), btd1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.w("SignInClientImpl", "Remote service probably died when resolveAccount is called");
            try
            {
                btd1.a(new ResolveAccountResponse());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (btd btd1)
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
        try
        {
            ((cqb)p()).a(d.intValue());
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    protected final Bundle e()
    {
        Object obj = c;
        Integer integer = b.g;
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", ((col) (obj)).b);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", ((col) (obj)).c);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", ((col) (obj)).d);
        bqy bqy = ((col) (obj)).e;
        if (integer != null)
        {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", integer.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", ((col) (obj)).f);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", ((col) (obj)).g);
        obj = b.d;
        if (!super.f.getPackageName().equals(obj))
        {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", b.d);
        }
        return bundle;
    }

    public final void f()
    {
        a(new bsi(this));
    }

    public final boolean l()
    {
        return a;
    }
}
