// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.v;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.m4b.maps.dd.c;
import com.google.android.m4b.maps.dd.d;
import com.google.android.m4b.maps.g.a;
import com.google.android.m4b.maps.j.b;
import com.google.android.m4b.maps.j.g;
import com.google.android.m4b.maps.j.l;
import com.google.android.m4b.maps.j.q;
import com.google.android.m4b.maps.j.u;
import com.google.android.m4b.maps.j.w;
import com.google.android.m4b.maps.j.x;
import com.google.android.m4b.maps.j.y;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.m4b.maps.v:
//            h, a, g, d

public final class i extends l
    implements c
{
    static final class a extends f.a
    {

        private final d a;
        private final ExecutorService b;

        static com.google.android.m4b.maps.h.d.e a(a a1)
        {
            return a1.a.e;
        }

        public final void a(String s, String s1, h h1)
        {
            b.submit(new Runnable(this, s, s1, h1) {

                private String a;
                private String b;
                private h c;
                private a d;

                public final void run()
                {
                    try
                    {
                        boolean flag = com.google.android.m4b.maps.v.a.a(d).a();
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
                c = h1;
                super();
            }
            });
        }

        public final void a(String s, List list, h h1)
        {
            b.submit(new Runnable(this, list, s, h1) {

                private List a;
                private String b;
                private h c;
                private a d;

                public final void run()
                {
                    try
                    {
                        com.google.android.m4b.maps.v.a.a(d);
                        Collections.unmodifiableSet(new HashSet(a));
                        com.google.android.m4b.maps.v.d d1 = new com.google.android.m4b.maps.v.d();
                        c.a(d1);
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
                c = h1;
                super();
            }
            });
        }

        public a(d d1, ExecutorService executorservice)
        {
            a = d1;
            b = executorservice;
        }
    }


    private final boolean d;
    private final g e;
    private final d f;
    private Integer g;
    private final ExecutorService h;

    public i(Context context, Looper looper, boolean flag, g g1, d d1, com.google.android.m4b.maps.h.d.b b1, com.google.android.m4b.maps.h.d.d d2, 
            ExecutorService executorservice)
    {
        super(context, looper, 44, b1, d2, g1);
        d = flag;
        e = g1;
        f = d1;
        g = g1.h;
        h = executorservice;
    }

    protected final IInterface a(IBinder ibinder)
    {
        return com.google.android.m4b.maps.v.h.a.a(ibinder);
    }

    protected final String a()
    {
        return "com.google.android.gms.signin.service.START";
    }

    public final void a(q q, Set set, com.google.android.m4b.maps.v.g g1)
    {
        x.a(g1, "Expecting a valid ISignInCallbacks");
        try
        {
            ((h)l()).a(new b(q, set), g1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (q q)
        {
            Log.w("SignInClientImpl", "Remote service probably died when authAccount is called");
        }
        try
        {
            g1.a(new com.google.android.m4b.maps.g.a(8, null), new com.google.android.m4b.maps.v.a());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (q q)
        {
            Log.wtf("SignInClientImpl", "ISignInCallbacks#onAuthAccount should be executed from the same process, unexpected RemoteException.");
        }
    }

    public final void a(q q, boolean flag)
    {
        try
        {
            ((h)l()).a(q, g.intValue(), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (q q)
        {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    public final void a(u u1)
    {
        x.a(u1, "Expecting a valid IResolveAccountCallbacks");
        Object obj;
        obj = e;
        if (((g) (obj)).a == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        obj = ((g) (obj)).a;
_L1:
        ((h)l()).a(new w(((Account) (obj)), g.intValue()), u1);
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
                u1.a(new y());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (u u1)
            {
                Log.wtf("SignInClientImpl", "IResolveAccountCallbacks#onAccountResolutionComplete should be executed from the same process, unexpected RemoteException.");
            }
            return;
        }
          goto _L1
    }

    protected final String b()
    {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public final boolean f()
    {
        return d;
    }

    protected final Bundle j()
    {
        Object obj = f;
        Integer integer = e.h;
        ExecutorService executorservice = h;
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", ((d) (obj)).b);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", ((d) (obj)).c);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", ((d) (obj)).d);
        if (((d) (obj)).e != null)
        {
            bundle.putParcelable("com.google.android.gms.signin.internal.signInCallbacks", new com.google.android.m4b.maps.j.d((new a(((d) (obj)), executorservice)).asBinder()));
        }
        if (integer != null)
        {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", integer.intValue());
        }
        obj = e.e;
        if (!super.a.getPackageName().equals(obj))
        {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", e.e);
        }
        return bundle;
    }

    public final void o_()
    {
        try
        {
            ((h)l()).a(g.intValue());
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    public final void p_()
    {
        a(new com.google.android.m4b.maps.j.l.f(this));
    }
}
