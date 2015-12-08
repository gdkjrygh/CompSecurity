// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.internal:
//            zzvc, zzus, zzva, zzuw

static class zzawZ extends zzawZ
{

    private final zzus zzPr;
    private final ExecutorService zzawZ;

    static com.google.android.gms.common.api.Client.ServerAuthCodeCallbacks zza(zzawZ zzawz)
    {
        return zzawz.zzsx();
    }

    private com.google.android.gms.common.api.Client.ServerAuthCodeCallbacks zzsx()
    {
        return zzPr.zzsx();
    }

    public void zza(String s, String s1, zzva zzva)
    {
        zzawZ.submit(new Runnable(s, s1, zzva) {

            final String zzaxb;
            final zzva zzaxc;
            final zzvc.zza zzaxd;
            final String zzaxe;

            public void run()
            {
                try
                {
                    boolean flag = zzvc.zza.zza(zzaxd).onUploadServerAuthCode(zzaxb, zzaxe);
                    zzaxc.zzaf(flag);
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    return;
                }
            }

            
            {
                zzaxd = zzvc.zza.this;
                zzaxb = s;
                zzaxe = s1;
                zzaxc = zzva1;
                super();
            }
        });
    }

    public void zza(String s, List list, zzva zzva)
    {
        zzawZ.submit(new Runnable(list, s, zzva) {

            final List zzaxa;
            final String zzaxb;
            final zzva zzaxc;
            final zzvc.zza zzaxd;

            public void run()
            {
                try
                {
                    Object obj = zzvc.zza.zza(zzaxd);
                    java.util.Set set = Collections.unmodifiableSet(new HashSet(zzaxa));
                    obj = ((com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks) (obj)).onCheckServerAuthorization(zzaxb, set);
                    obj = new zzuw(((com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks.CheckResult) (obj)).zzic(), ((com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks.CheckResult) (obj)).zzid());
                    zzaxc.zza(((zzuw) (obj)));
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    return;
                }
            }

            
            {
                zzaxd = zzvc.zza.this;
                zzaxa = list;
                zzaxb = s;
                zzaxc = zzva1;
                super();
            }
        });
    }

    public _cls2.zzaxc(zzus zzus1, ExecutorService executorservice)
    {
        zzPr = zzus1;
        zzawZ = executorservice;
    }
}
