// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.zzpt;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.signin.internal:
//            zzf, CheckServerAuthResult

class b extends b
{

    private final zzpt a;
    private final ExecutorService b;

    private com.google.android.gms.common.api.iClient.ServerAuthCodeCallbacks a()
    {
        return a.d();
    }

    static com.google.android.gms.common.api.iClient.ServerAuthCodeCallbacks a(a a1)
    {
        return a1.a();
    }

    public void a(String s, String s1, zzf zzf)
    {
        b.submit(new Runnable(s, s1, zzf) {

            final String a;
            final String b;
            final zzf c;
            final zzh.zza d;

            public void run()
            {
                try
                {
                    boolean flag = zzh.zza.a(d).a(a, b);
                    c.a(flag);
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    Log.e("SignInClientImpl", "RemoteException thrown when processing uploadServerAuthCode callback", remoteexception);
                }
            }

            
            {
                d = zzh.zza.this;
                a = s;
                b = s1;
                c = zzf1;
                super();
            }
        });
    }

    public void a(String s, List list, zzf zzf)
    {
        b.submit(new Runnable(list, s, zzf) {

            final List a;
            final String b;
            final zzf c;
            final zzh.zza d;

            public void run()
            {
                try
                {
                    Object obj = zzh.zza.a(d);
                    java.util.Set set = Collections.unmodifiableSet(new HashSet(a));
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
                d = zzh.zza.this;
                a = list;
                b = s;
                c = zzf1;
                super();
            }
        });
    }

    public _cls2.c(zzpt zzpt1, ExecutorService executorservice)
    {
        a = zzpt1;
        b = executorservice;
    }
}
