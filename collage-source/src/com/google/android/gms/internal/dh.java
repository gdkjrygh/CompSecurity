// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            dt, do, dj

public final class dh extends di.a
{

    private Map a;

    public dh()
    {
    }

    private dj c(String s)
        throws RemoteException
    {
        try
        {
            Object obj = Class.forName(s, false, com/google/android/gms/internal/dh.getClassLoader());
            if (com/google/ads/mediation/MediationAdapter.isAssignableFrom(((Class) (obj))))
            {
                obj = (MediationAdapter)((Class) (obj)).newInstance();
                return new dt(((MediationAdapter) (obj)), (NetworkExtras)a.get(((MediationAdapter) (obj)).b()));
            }
            if (com/google/android/gms/ads/mediation/MediationAdapter.isAssignableFrom(((Class) (obj))))
            {
                return new do((com.google.android.gms.ads.mediation.MediationAdapter)((Class) (obj)).newInstance());
            } else
            {
                zzb.zzaE((new StringBuilder()).append("Could not instantiate mediation adapter: ").append(s).append(" (not a valid adapter).").toString());
                throw new RemoteException();
            }
        }
        catch (Throwable throwable)
        {
            zzb.zzaE((new StringBuilder()).append("Could not instantiate mediation adapter: ").append(s).append(". ").append(throwable.getMessage()).toString());
        }
        throw new RemoteException();
    }

    public dj a(String s)
        throws RemoteException
    {
        return c(s);
    }

    public void a(Map map)
    {
        a = map;
    }

    public boolean b(String s)
        throws RemoteException
    {
        boolean flag;
        try
        {
            flag = com/google/android/gms/ads/mediation/customevent/CustomEvent.isAssignableFrom(Class.forName(s, false, com/google/android/gms/internal/dh.getClassLoader()));
        }
        catch (Throwable throwable)
        {
            zzb.zzaE((new StringBuilder()).append("Could not load custom event implementation class: ").append(s).append(", assuming old implementation.").toString());
            return false;
        }
        return flag;
    }
}
