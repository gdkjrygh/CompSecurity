// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.m4b.maps.GoogleMapOptions;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.ag;
import com.google.android.m4b.maps.da.b;
import com.google.android.m4b.maps.da.d;
import com.google.android.m4b.maps.df.ah;
import com.google.android.m4b.maps.df.t;
import com.google.android.m4b.maps.g.g;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import com.google.android.m4b.maps.y.j;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            bj, bz, ce

public class r extends com.google.android.m4b.maps.df.y.a
{

    private static final String a = com/google/android/m4b/maps/cg/r.getSimpleName();
    private ce b;
    private final GoogleMapOptions c;
    private final Context d;
    private final bj e;

    public r(Context context, GoogleMapOptions googlemapoptions, bj bj1)
    {
        d = (Context)j.a(context);
        if (googlemapoptions == null)
        {
            googlemapoptions = new GoogleMapOptions();
        }
        c = googlemapoptions;
        e = (bj)j.a(bj1, "Environment is null");
    }

    public final t a()
    {
        if (com.google.android.m4b.maps.g.g.e(d))
        {
            ab.a("This device does not support the use of MapView.getMap(). Please use MapView.getMapAsync() instead.");
            return null;
        } else
        {
            return b;
        }
    }

    public final void a(Bundle bundle)
    {
        boolean flag = false;
        if (d instanceof Activity)
        {
            flag = ag.a((Activity)d);
        }
        b = bz.a(c, flag, e);
        b.a(bundle);
    }

    public final void a(ah ah)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        b.a(ah);
        return;
        ah;
        throw new RuntimeRemoteException(ah);
    }

    public final void b()
    {
        b.b();
    }

    public final void b(Bundle bundle)
    {
        b.b(bundle);
    }

    public final void c()
    {
        b.c();
    }

    public final void c(Bundle bundle)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        b.c(bundle);
        return;
        bundle;
        throw new RuntimeRemoteException(bundle);
    }

    public final void d()
    {
        b.a();
        b = null;
    }

    public final void e()
    {
        b.d();
    }

    public final b f()
    {
        return com.google.android.m4b.maps.da.d.a(b.B());
    }

    public final void g()
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        b.D();
        return;
        RemoteException remoteexception;
        remoteexception;
        throw new RuntimeRemoteException(remoteexception);
    }

}
