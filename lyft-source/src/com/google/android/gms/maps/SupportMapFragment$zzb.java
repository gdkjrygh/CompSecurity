// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.zza;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzf;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.internal.zzy;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps:
//            MapsInitializer, OnMapReadyCallback

class b extends zza
{

    protected zzf a;
    private final Fragment b;
    private Activity c;
    private final List d = new ArrayList();

    private void a(Activity activity)
    {
        c = activity;
        i();
    }

    static void a(i j, Activity activity)
    {
        j.a(activity);
    }

    protected void a(zzf zzf1)
    {
        a = zzf1;
        i();
    }

    public void i()
    {
        if (c == null || a == null || a() != null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        com.google.android.gms.maps.internal.IMapFragmentDelegate imapfragmentdelegate;
        MapsInitializer.a(c);
        imapfragmentdelegate = zzy.a(c).b(zze.a(c));
        if (imapfragmentdelegate == null)
        {
            return;
        }
        RemoteException remoteexception;
        a.a(new <init>(b, imapfragmentdelegate));
        OnMapReadyCallback onmapreadycallback;
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((d)a()).a(onmapreadycallback))
        {
            onmapreadycallback = (OnMapReadyCallback)iterator.next();
        }

        try
        {
            d.clear();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        catch (GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception) { }
    }

    AvailableException(Fragment fragment)
    {
        b = fragment;
    }
}
