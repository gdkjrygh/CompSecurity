// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.ads.mediation.c;
import com.google.ads.mediation.f;
import com.google.android.gms.ads.b.a.a;
import com.google.android.gms.ads.b.b;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ds, dn, di

public final class dg extends dh.a
{

    private Map a;

    public dg()
    {
    }

    private di c(String s)
        throws RemoteException
    {
        try
        {
            Object obj = Class.forName(s, false, com/google/android/gms/internal/dg.getClassLoader());
            if (com/google/ads/mediation/c.isAssignableFrom(((Class) (obj))))
            {
                obj = (c)((Class) (obj)).newInstance();
                return new ds(((c) (obj)), (f)a.get(((c) (obj)).a()));
            }
            if (com/google/android/gms/ads/b/b.isAssignableFrom(((Class) (obj))))
            {
                return new dn((b)((Class) (obj)).newInstance());
            } else
            {
                com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("Could not instantiate mediation adapter: ")).append(s).append(" (not a valid adapter).").toString());
                throw new RemoteException();
            }
        }
        catch (Throwable throwable)
        {
            com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("Could not instantiate mediation adapter: ")).append(s).append(". ").append(throwable.getMessage()).toString());
        }
        throw new RemoteException();
    }

    public final di a(String s)
        throws RemoteException
    {
        return c(s);
    }

    public final void a(Map map)
    {
        a = map;
    }

    public final boolean b(String s)
        throws RemoteException
    {
        boolean flag;
        try
        {
            flag = com/google/android/gms/ads/b/a/a.isAssignableFrom(Class.forName(s, false, com/google/android/gms/internal/dg.getClassLoader()));
        }
        catch (Throwable throwable)
        {
            com.google.android.gms.ads.internal.util.client.b.c((new StringBuilder("Could not load custom event implementation class: ")).append(s).append(", assuming old implementation.").toString());
            return false;
        }
        return flag;
    }
}
