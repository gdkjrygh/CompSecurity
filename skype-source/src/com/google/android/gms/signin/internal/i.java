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
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.signin.d;
import com.google.android.gms.signin.e;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.signin.internal:
//            f, AuthAccountResult, e, CheckServerAuthResult

public final class i extends m
    implements d
{
    private static final class a extends d.a
    {

        private final e a;
        private final ExecutorService b;

        static com.google.android.gms.common.api.c.d a(a a1)
            throws RemoteException
        {
            return a1.a.d();
        }

        public final void a(String s, String s1, f f1)
            throws RemoteException
        {
            b.submit(new Runnable(this, s, s1, f1) {

                final String a;
                final String b;
                final f c;
                final a d;

                public final void run()
                {
                    try
                    {
                        boolean flag = a.a(d).b();
                        c.a(flag);
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
                c = f1;
                super();
            }
            });
        }

        public final void a(String s, List list, f f1)
            throws RemoteException
        {
            b.submit(new Runnable(this, list, s, f1) {

                final List a;
                final String b;
                final f c;
                final a d;

                public final void run()
                {
                    try
                    {
                        Object obj = a.a(d);
                        Collections.unmodifiableSet(new HashSet(a));
                        obj = ((com.google.android.gms.common.api.c.d) (obj)).a();
                        obj = new CheckServerAuthResult(((com.google.android.gms.common.api.c.d.a) (obj)).a(), ((com.google.android.gms.common.api.c.d.a) (obj)).b());
                        c.a(((CheckServerAuthResult) (obj)));
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
                c = f1;
                super();
            }
            });
        }

        public a(e e1, ExecutorService executorservice)
        {
            a = e1;
            b = executorservice;
        }
    }


    private final boolean a;
    private final com.google.android.gms.common.internal.i e;
    private final e f;
    private Integer g;
    private final ExecutorService h;

    public i(Context context, Looper looper, boolean flag, com.google.android.gms.common.internal.i j, com.google.android.gms.common.api.c.b b1, com.google.android.gms.common.api.c.c c1, ExecutorService executorservice)
    {
        super(context, looper, 44, j, b1, c1);
        a = flag;
        e = j;
        f = j.i();
        g = j.j();
        h = executorservice;
    }

    protected final IInterface a(IBinder ibinder)
    {
        return com.google.android.gms.signin.internal.f.a.a(ibinder);
    }

    protected final String a()
    {
        return "com.google.android.gms.signin.service.START";
    }

    public final void a(r r, Set set, com.google.android.gms.signin.internal.e e1)
    {
        y.a(e1, "Expecting a valid ISignInCallbacks");
        try
        {
            ((f)n()).a(new AuthAccountRequest(r, set), e1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (r r)
        {
            Log.w("SignInClientImpl", "Remote service probably died when authAccount is called");
        }
        try
        {
            e1.a(new ConnectionResult(8, null), new AuthAccountResult());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (r r)
        {
            Log.wtf("SignInClientImpl", "ISignInCallbacks#onAuthAccount should be executed from the same process, unexpected RemoteException.");
        }
    }

    public final void a(r r, boolean flag)
    {
        try
        {
            ((f)n()).a(r, g.intValue(), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (r r)
        {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    public final void a(v v1)
    {
        y.a(v1, "Expecting a valid IResolveAccountCallbacks");
        try
        {
            android.accounts.Account account = e.c();
            ((f)n()).a(new ResolveAccountRequest(account, g.intValue()), v1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.w("SignInClientImpl", "Remote service probably died when resolveAccount is called");
        }
        try
        {
            v1.a(new ResolveAccountResponse());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (v v1)
        {
            Log.wtf("SignInClientImpl", "IResolveAccountCallbacks#onAccountResolutionComplete should be executed from the same process, unexpected RemoteException.");
        }
    }

    protected final String b()
    {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public final void c()
    {
        try
        {
            ((f)n()).a(g.intValue());
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    public final boolean f()
    {
        return a;
    }

    protected final Bundle l()
    {
        Object obj = f;
        Integer integer = e.j();
        ExecutorService executorservice = h;
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", ((e) (obj)).a());
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", ((e) (obj)).b());
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", ((e) (obj)).c());
        if (((e) (obj)).d() != null)
        {
            bundle.putParcelable("com.google.android.gms.signin.internal.signInCallbacks", new BinderWrapper((new a(((e) (obj)), executorservice)).asBinder()));
        }
        if (integer != null)
        {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", integer.intValue());
        }
        obj = e.g();
        if (!k().getPackageName().equals(obj))
        {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", e.g());
        }
        return bundle;
    }

    public final void p()
    {
        a(new com.google.android.gms.common.internal.m.f(this));
    }
}
