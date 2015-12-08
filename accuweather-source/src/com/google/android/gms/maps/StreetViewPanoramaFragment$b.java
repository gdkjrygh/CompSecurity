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

static class Mg extends a
{

    private final Fragment Mg;
    protected f ZC;
    private Activity oe;

    static void a(Mg mg, Activity activity)
    {
        mg.setActivity(activity);
    }

    private void setActivity(Activity activity)
    {
        oe = activity;
        ju();
    }

    protected void a(f f1)
    {
        ZC = f1;
        ju();
    }

    public void ju()
    {
        if (oe == null || ZC == null || gC() != null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        MapsInitializer.initialize(oe);
        com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate = u.E(oe).j(e.h(oe));
        ZC.a(new <init>(Mg, istreetviewpanoramafragmentdelegate));
        return;
        Object obj;
        obj;
        throw new RuntimeRemoteException(((RemoteException) (obj)));
        obj;
    }

    bleException(Fragment fragment)
    {
        Mg = fragment;
    }
}
