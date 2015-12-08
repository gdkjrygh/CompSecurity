// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

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
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.et;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.signin.internal:
//            f, AuthAccountResult, e, CheckServerAuthResult

public final class i extends j
    implements es
{
    private static final class a extends d.a
    {

        private final et a;
        private final ExecutorService b;

        static com.google.android.gms.common.api.c.d a(a a1)
            throws RemoteException
        {
            return a1.a.e;
        }

        public final void a(String s1, String s2, f f1)
            throws RemoteException
        {
            b.submit(new Runnable(this, s1, s2, f1) {

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
                a = s1;
                b = s2;
                c = f1;
                super();
            }
            });
        }

        public final void a(String s1, List list, f f1)
            throws RemoteException
        {
            b.submit(new Runnable(this, list, s1, f1) {

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
                        obj = new CheckServerAuthResult(((com.google.android.gms.common.api.c.d.a) (obj)).a, ((com.google.android.gms.common.api.c.d.a) (obj)).b);
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
                b = s1;
                c = f1;
                super();
            }
            });
        }

        public a(et et1, ExecutorService executorservice)
        {
            a = et1;
            b = executorservice;
        }
    }


    private final boolean e;
    private final g f;
    private final et g;
    private Integer h;
    private final ExecutorService i;

    public i(Context context, Looper looper, boolean flag, g g1, et et1, com.google.android.gms.common.api.c.b b, com.google.android.gms.common.api.c.c c1, 
            ExecutorService executorservice)
    {
        super(context, looper, 44, g1, b, c1);
        e = flag;
        f = g1;
        g = et1;
        h = g1.h;
        i = executorservice;
    }

    protected final IInterface a(IBinder ibinder)
    {
        return com.google.android.gms.signin.internal.f.a.a(ibinder);
    }

    public final void a(o o, Set set, e e1)
    {
        u.a(e1, "Expecting a valid ISignInCallbacks");
        try
        {
            ((f)m()).a(new AuthAccountRequest(o, set), e1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (o o)
        {
            Log.w("SignInClientImpl", "Remote service probably died when authAccount is called");
        }
        try
        {
            e1.a(new ConnectionResult(8, null), new AuthAccountResult());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            Log.wtf("SignInClientImpl", "ISignInCallbacks#onAuthAccount should be executed from the same process, unexpected RemoteException.", o);
        }
    }

    public final void a(o o, boolean flag)
    {
        try
        {
            ((f)m()).a(o, h.intValue(), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (o o)
        {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    public final void a(s s1)
    {
        u.a(s1, "Expecting a valid IResolveAccountCallbacks");
        Object obj;
        obj = f;
        if (((g) (obj)).a == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        obj = ((g) (obj)).a;
_L1:
        ((f)m()).a(new ResolveAccountRequest(((Account) (obj)), h.intValue()), s1);
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
                s1.a(new ResolveAccountResponse());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (s s1)
            {
                Log.wtf("SignInClientImpl", "IResolveAccountCallbacks#onAccountResolutionComplete should be executed from the same process, unexpected RemoteException.", remoteexception);
            }
            return;
        }
          goto _L1
    }

    public final boolean c()
    {
        return e;
    }

    protected final String e()
    {
        return "com.google.android.gms.signin.service.START";
    }

    protected final String f()
    {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public final void f_()
    {
        try
        {
            ((f)m()).a(h.intValue());
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    public final void h()
    {
        a(new com.google.android.gms.common.internal.j.f(this));
    }

    protected final Bundle k()
    {
        Object obj = g;
        Integer integer = f.h;
        ExecutorService executorservice = i;
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", ((et) (obj)).b);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", ((et) (obj)).c);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", ((et) (obj)).d);
        if (((et) (obj)).e != null)
        {
            bundle.putParcelable("com.google.android.gms.signin.internal.signInCallbacks", new BinderWrapper((new a(((et) (obj)), executorservice)).asBinder()));
        }
        if (integer != null)
        {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", integer.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", ((et) (obj)).f);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", ((et) (obj)).g);
        obj = f.e;
        if (!super.a.getPackageName().equals(obj))
        {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", f.e);
        }
        return bundle;
    }
}
