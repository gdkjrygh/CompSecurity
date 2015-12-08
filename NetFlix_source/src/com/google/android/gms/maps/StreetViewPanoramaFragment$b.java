// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.maps.internal.c;
import com.google.android.gms.maps.internal.u;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            StreetViewPanoramaFragment, MapsInitializer

static class Hv extends a
{

    private final Fragment Hv;
    protected f RV;
    private Activity nS;

    static void a(Hv hv, Activity activity)
    {
        hv.setActivity(activity);
    }

    private void setActivity(Activity activity)
    {
        nS = activity;
        ip();
    }

    protected void a(f f1)
    {
        RV = f1;
        ip();
    }

    public void ip()
    {
        if (nS == null || RV == null || fW() != null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        MapsInitializer.initialize(nS);
        com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate = u.A(nS).i(e.h(nS));
        RV.a(new <init>(Hv, istreetviewpanoramafragmentdelegate));
        return;
        Object obj;
        obj;
        throw new RuntimeRemoteException(((RemoteException) (obj)));
        obj;
    }

    bleException(Fragment fragment)
    {
        Hv = fragment;
    }
}
