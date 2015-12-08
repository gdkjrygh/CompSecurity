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
//            MapsInitializer, OnStreetViewPanoramaReadyCallback

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
            break MISSING_BLOCK_LABEL_132;
        }
        try
        {
            MapsInitializer.a(c);
            com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate = zzy.a(c).c(zze.a(c));
            a.a(new <init>(b, istreetviewpanoramafragmentdelegate));
            OnStreetViewPanoramaReadyCallback onstreetviewpanoramareadycallback;
            for (Iterator iterator = d.iterator(); iterator.hasNext(); ((d)a()).a(onstreetviewpanoramareadycallback))
            {
                onstreetviewpanoramareadycallback = (OnStreetViewPanoramaReadyCallback)iterator.next();
            }

        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        catch (GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
        {
            return;
        }
        d.clear();
    }

    ion(Fragment fragment)
    {
        b = fragment;
    }
}
