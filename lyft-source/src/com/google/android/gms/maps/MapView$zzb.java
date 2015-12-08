// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
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
//            MapsInitializer, OnMapReadyCallback, GoogleMapOptions

class d extends zza
{

    protected zzf a;
    private final ViewGroup b;
    private final Context c;
    private final GoogleMapOptions d;
    private final List e = new ArrayList();

    protected void a(zzf zzf1)
    {
        a = zzf1;
        i();
    }

    public void a(OnMapReadyCallback onmapreadycallback)
    {
        if (a() != null)
        {
            ((a)a()).a(onmapreadycallback);
            return;
        } else
        {
            e.add(onmapreadycallback);
            return;
        }
    }

    public void i()
    {
        if (a == null || a() != null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        com.google.android.gms.maps.internal.IMapViewDelegate imapviewdelegate;
        MapsInitializer.a(c);
        imapviewdelegate = zzy.a(c).a(zze.a(c), d);
        if (imapviewdelegate == null)
        {
            return;
        }
        RemoteException remoteexception;
        a.a(new <init>(b, imapviewdelegate));
        OnMapReadyCallback onmapreadycallback;
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((e)a()).a(onmapreadycallback))
        {
            onmapreadycallback = (OnMapReadyCallback)iterator.next();
        }

        try
        {
            e.clear();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        catch (GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception) { }
    }

    ions(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
    {
        b = viewgroup;
        c = context;
        d = googlemapoptions;
    }
}
