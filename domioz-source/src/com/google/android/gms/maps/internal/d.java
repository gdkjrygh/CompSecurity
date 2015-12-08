// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.internal.a;
import com.google.android.gms.maps.model.internal.j;
import com.google.android.gms.maps.model.internal.m;
import com.google.android.gms.maps.model.internal.p;
import com.google.android.gms.maps.model.internal.s;
import com.google.android.gms.maps.model.internal.v;
import com.google.android.gms.maps.model.internal.y;
import com.google.android.gms.maps.model.internal.zzc;
import com.google.android.gms.maps.model.internal.zze;
import com.google.android.gms.maps.model.internal.zzp;

// Referenced classes of package com.google.android.gms.maps.internal:
//            ah, an, aq, at, 
//            aw, az, bf, bi, 
//            bl, bo, br, bu, 
//            bx, ca, cp, g, 
//            ab, p

public interface d
    extends IInterface
{

    public abstract CameraPosition a();

    public abstract a a(PolylineOptions polylineoptions);

    public abstract j a(CircleOptions circleoptions);

    public abstract m a(GroundOverlayOptions groundoverlayoptions);

    public abstract m a(GroundOverlayOptions groundoverlayoptions, zze zze);

    public abstract s a(MarkerOptions markeroptions);

    public abstract s a(MarkerOptions markeroptions, zzp zzp);

    public abstract v a(PolygonOptions polygonoptions);

    public abstract y a(TileOverlayOptions tileoverlayoptions);

    public abstract void a(int i1);

    public abstract void a(int i1, int j1, int k1, int l1);

    public abstract void a(Bundle bundle);

    public abstract void a(com.google.android.gms.b.j j1);

    public abstract void a(com.google.android.gms.b.j j1, int i1, ah ah);

    public abstract void a(com.google.android.gms.b.j j1, ah ah);

    public abstract void a(an an);

    public abstract void a(aq aq);

    public abstract void a(at at);

    public abstract void a(aw aw);

    public abstract void a(az az);

    public abstract void a(bf bf);

    public abstract void a(bi bi);

    public abstract void a(bl bl);

    public abstract void a(bo bo);

    public abstract void a(br br);

    public abstract void a(bu bu);

    public abstract void a(bx bx);

    public abstract void a(ca ca);

    public abstract void a(cp cp, com.google.android.gms.b.j j1);

    public abstract void a(g g1);

    public abstract void a(zzc zzc);

    public abstract void a(zzc zzc, int i1, ah ah);

    public abstract void a(zzc zzc, ah ah);

    public abstract void a(String s1);

    public abstract void a(boolean flag);

    public abstract float b();

    public abstract void b(Bundle bundle);

    public abstract void b(com.google.android.gms.b.j j1);

    public abstract void b(zzc zzc);

    public abstract boolean b(boolean flag);

    public abstract float c();

    public abstract void c(boolean flag);

    public abstract void d();

    public abstract void d(boolean flag);

    public abstract void e();

    public abstract int f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    public abstract Location j();

    public abstract ab k();

    public abstract com.google.android.gms.maps.internal.p l();

    public abstract boolean m();

    public abstract p n();

    public abstract void o();

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public abstract boolean s();
}
