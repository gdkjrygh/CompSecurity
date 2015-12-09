// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.zzme;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.signin.internal:
//            zzh, zzf, CheckServerAuthResult

private static class b extends a
{

    private final zzme a;
    private final ExecutorService b;

    private com.google.android.gms.common.api.ApiClient.ServerAuthCodeCallbacks a()
        throws RemoteException
    {
        return a.zzwh();
    }

    static com.google.android.gms.common.api.ApiClient.ServerAuthCodeCallbacks a(a a1)
        throws RemoteException
    {
        return a1.a();
    }

    public void zza(String s, String s1, zzf zzf)
        throws RemoteException
    {
        b.submit(new Runnable(s, s1, zzf) {

            final String a;
            final String b;
            final zzf c;
            final zzh.a d;

            public void run()
            {
                try
                {
                    boolean flag = zzh.a.a(d).onUploadServerAuthCode(a, b);
                    c.zzag(flag);
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    Log.e("SignInClientImpl", "RemoteException thrown when processing uploadServerAuthCode callback", remoteexception);
                }
            }

            
            {
                d = zzh.a.this;
                a = s;
                b = s1;
                c = zzf1;
                super();
            }
        });
    }

    public void zza(String s, List list, zzf zzf)
        throws RemoteException
    {
        b.submit(new Runnable(list, s, zzf) {

            final List a;
            final String b;
            final zzf c;
            final zzh.a d;

            public void run()
            {
                try
                {
                    Object obj = zzh.a.a(d);
                    java.util.Set set = Collections.unmodifiableSet(new HashSet(a));
                    obj = ((com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks) (obj)).onCheckServerAuthorization(b, set);
                    obj = new CheckServerAuthResult(((com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks.CheckResult) (obj)).zzkN(), ((com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks.CheckResult) (obj)).zzkO());
                    c.zza(((CheckServerAuthResult) (obj)));
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    Log.e("SignInClientImpl", "RemoteException thrown when processing checkServerAuthorization callback", remoteexception);
                }
            }

            
            {
                d = zzh.a.this;
                a = list;
                b = s;
                c = zzf1;
                super();
            }
        });
    }

    public _cls2.c(zzme zzme1, ExecutorService executorservice)
    {
        a = zzme1;
        b = executorservice;
    }
}
