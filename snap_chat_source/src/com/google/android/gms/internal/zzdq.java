// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import dd;
import dh;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzdx, zzdv, zzhx, zzds

public final class zzdq extends zzdr.zza
{

    private Map zzsP;

    public zzdq()
    {
    }

    private zzds zzD(String s)
    {
        try
        {
            Object obj = Class.forName(s, false, com/google/android/gms/internal/zzdq.getClassLoader());
            if (dd.isAssignableFrom(((Class) (obj))))
            {
                obj = (dd)((Class) (obj)).newInstance();
                return new zzdx(((dd) (obj)), (dh)zzsP.get(((dd) (obj)).a()));
            }
            if (com/google/android/gms/ads/mediation/MediationAdapter.isAssignableFrom(((Class) (obj))))
            {
                return new zzdv((MediationAdapter)((Class) (obj)).newInstance());
            } else
            {
                zzhx.zzac((new StringBuilder("Could not instantiate mediation adapter: ")).append(s).append(" (not a valid adapter).").toString());
                throw new RemoteException();
            }
        }
        catch (Throwable throwable)
        {
            zzhx.zzac((new StringBuilder("Could not instantiate mediation adapter: ")).append(s).append(". ").append(throwable.getMessage()).toString());
        }
        throw new RemoteException();
    }

    public final zzds zzB(String s)
    {
        return zzD(s);
    }

    public final boolean zzC(String s)
    {
        boolean flag;
        try
        {
            flag = com/google/android/gms/ads/mediation/customevent/CustomEvent.isAssignableFrom(Class.forName(s, false, com/google/android/gms/internal/zzdq.getClassLoader()));
        }
        catch (Throwable throwable)
        {
            zzhx.zzac((new StringBuilder("Could not load custom event implementation class: ")).append(s).append(", assuming old implementation.").toString());
            return false;
        }
        return flag;
    }

    public final void zze(Map map)
    {
        zzsP = map;
    }
}
