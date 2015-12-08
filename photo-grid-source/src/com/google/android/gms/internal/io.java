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
//            iq, jn, ji, is

public final class io extends iq
{

    private Map a;

    public io()
    {
    }

    private is c(String s)
    {
        try
        {
            Object obj = Class.forName(s, false, com/google/android/gms/internal/io.getClassLoader());
            if (com/google/ads/mediation/MediationAdapter.isAssignableFrom(((Class) (obj))))
            {
                obj = (MediationAdapter)((Class) (obj)).newInstance();
                return new jn(((MediationAdapter) (obj)), (NetworkExtras)a.get(((MediationAdapter) (obj)).getAdditionalParametersType()));
            }
            if (com/google/android/gms/ads/mediation/MediationAdapter.isAssignableFrom(((Class) (obj))))
            {
                return new ji((com.google.android.gms.ads.mediation.MediationAdapter)((Class) (obj)).newInstance());
            } else
            {
                zzb.zzaH((new StringBuilder("Could not instantiate mediation adapter: ")).append(s).append(" (not a valid adapter).").toString());
                throw new RemoteException();
            }
        }
        catch (Throwable throwable)
        {
            zzb.zzaH((new StringBuilder("Could not instantiate mediation adapter: ")).append(s).append(". ").append(throwable.getMessage()).toString());
        }
        throw new RemoteException();
    }

    public final is a(String s)
    {
        return c(s);
    }

    public final void a(Map map)
    {
        a = map;
    }

    public final boolean b(String s)
    {
        boolean flag;
        try
        {
            flag = com/google/android/gms/ads/mediation/customevent/CustomEvent.isAssignableFrom(Class.forName(s, false, com/google/android/gms/internal/io.getClassLoader()));
        }
        catch (Throwable throwable)
        {
            zzb.zzaH((new StringBuilder("Could not load custom event implementation class: ")).append(s).append(", assuming old implementation.").toString());
            return false;
        }
        return flag;
    }
}
