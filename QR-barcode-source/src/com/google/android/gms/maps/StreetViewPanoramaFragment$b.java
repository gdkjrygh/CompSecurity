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

static class Sj extends a
{

    private final Fragment Sj;
    protected f aiT;
    private Activity nr;

    static void a(Sj sj, Activity activity)
    {
        sj.setActivity(activity);
    }

    private void setActivity(Activity activity)
    {
        nr = activity;
        mA();
    }

    protected void a(f f1)
    {
        aiT = f1;
        mA();
    }

    public void mA()
    {
        if (nr == null || aiT == null || it() != null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        MapsInitializer.initialize(nr);
        com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate istreetviewpanoramafragmentdelegate = u.S(nr).k(e.k(nr));
        aiT.a(new <init>(Sj, istreetviewpanoramafragmentdelegate));
        return;
        Object obj;
        obj;
        throw new RuntimeRemoteException(((RemoteException) (obj)));
        obj;
    }

    bleException(Fragment fragment)
    {
        Sj = fragment;
    }
}
