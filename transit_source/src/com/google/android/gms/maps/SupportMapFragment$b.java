// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.c;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.internal.q;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            SupportMapFragment, MapsInitializer

static class pU extends a
{

    private Activity fD;
    protected d pL;
    private final Fragment pU;

    static void a(pU pu, Activity activity)
    {
        pu.setActivity(activity);
    }

    private void setActivity(Activity activity)
    {
        fD = activity;
        cE();
    }

    protected void a(d d1)
    {
        pL = d1;
        cE();
    }

    public void cE()
    {
        if (fD == null || pL == null || bP() != null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        MapsInitializer.initialize(fD);
        com.google.android.gms.maps.internal.IMapFragmentDelegate imapfragmentdelegate = q.u(fD).f(c.g(fD));
        pL.a(new <init>(pU, imapfragmentdelegate));
        return;
        Object obj;
        obj;
        throw new RuntimeRemoteException(((RemoteException) (obj)));
        obj;
    }

    otAvailableException(Fragment fragment)
    {
        pU = fragment;
    }
}
