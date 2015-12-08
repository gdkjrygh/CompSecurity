// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.app.Activity;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.maps.internal.c;
import com.google.android.gms.maps.internal.u;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            SupportMapFragment, MapsInitializer

static class FS extends a
{

    private final Fragment FS;
    protected f ZC;
    private Activity oe;

    static void a(FS fs, Activity activity)
    {
        fs.setActivity(activity);
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
        com.google.android.gms.maps.internal.IMapFragmentDelegate imapfragmentdelegate = u.E(oe).i(e.h(oe));
        ZC.a(new <init>(FS, imapfragmentdelegate));
        return;
        Object obj;
        obj;
        throw new RuntimeRemoteException(((RemoteException) (obj)));
        obj;
    }

    otAvailableException(Fragment fragment)
    {
        FS = fragment;
    }
}
