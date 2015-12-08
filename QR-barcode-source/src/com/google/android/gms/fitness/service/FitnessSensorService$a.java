// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.service;

import android.app.AppOpsManager;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.result.DataSourcesResult;
import com.google.android.gms.internal.kc;
import com.google.android.gms.internal.kn;
import com.google.android.gms.internal.kt;
import com.google.android.gms.internal.lg;
import com.google.android.gms.internal.li;

// Referenced classes of package com.google.android.gms.fitness.service:
//            FitnessSensorService, FitnessSensorServiceRequest

private static class <init> extends com.google.android.gms.internal.vice.a
{

    private final FitnessSensorService Vb;

    private void jM()
        throws SecurityException
    {
        int i = Binder.getCallingUid();
        if (!kc.hI()) goto _L2; else goto _L1
_L1:
        ((AppOpsManager)Vb.getSystemService("appops")).checkPackage(i, "com.google.android.gms");
_L4:
        return;
_L2:
label0:
        {
            String as[] = Vb.getPackageManager().getPackagesForUid(i);
            if (as == null)
            {
                break label0;
            }
            int j = as.length;
            i = 0;
            do
            {
                if (i >= j)
                {
                    break label0;
                }
                if (as[i].equals("com.google.android.gms"))
                {
                    break;
                }
                i++;
            } while (true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        throw new SecurityException("Unauthorized caller");
    }

    public void a(FitnessSensorServiceRequest fitnesssensorservicerequest, kt kt1)
        throws RemoteException
    {
        jM();
        if (Vb.onRegister(fitnesssensorservicerequest))
        {
            kt1.k(Status.Jv);
            return;
        } else
        {
            kt1.k(new Status(13));
            return;
        }
    }

    public void a(lg lg1, kn kn1)
        throws RemoteException
    {
        jM();
        kn1.a(new DataSourcesResult(Vb.onFindDataSources(lg1.getDataTypes()), Status.Jv));
    }

    public void a(li li1, kt kt1)
        throws RemoteException
    {
        jM();
        if (Vb.onUnregister(li1.getDataSource()))
        {
            kt1.k(Status.Jv);
            return;
        } else
        {
            kt1.k(new Status(13));
            return;
        }
    }

    private uest(FitnessSensorService fitnesssensorservice)
    {
        Vb = fitnesssensorservice;
    }

    Vb(FitnessSensorService fitnesssensorservice, Vb vb)
    {
        this(fitnesssensorservice);
    }
}
