// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.signin.e;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.signin.internal:
//            i, f, CheckServerAuthResult

private static final class b extends b
{

    private final e a;
    private final ExecutorService b;

    static com.google.android.gms.common.api..i.a a(b b1)
        throws RemoteException
    {
        return b1.a.d();
    }

    public final void a(String s, String s1, f f)
        throws RemoteException
    {
        b.submit(new Runnable(s, s1, f) {

            final String a;
            final String b;
            final f c;
            final i.a d;

            public final void run()
            {
                try
                {
                    boolean flag = i.a.a(d).b();
                    c.a(flag);
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    Log.e("SignInClientImpl", "RemoteException thrown when processing uploadServerAuthCode callback", remoteexception);
                }
            }

            
            {
                d = i.a.this;
                a = s;
                b = s1;
                c = f1;
                super();
            }
        });
    }

    public final void a(String s, List list, f f)
        throws RemoteException
    {
        b.submit(new Runnable(list, s, f) {

            final List a;
            final String b;
            final f c;
            final i.a d;

            public final void run()
            {
                try
                {
                    Object obj = i.a.a(d);
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
                d = i.a.this;
                a = list;
                b = s;
                c = f1;
                super();
            }
        });
    }

    public _cls2.c(e e1, ExecutorService executorservice)
    {
        a = e1;
        b = executorservice;
    }
}
