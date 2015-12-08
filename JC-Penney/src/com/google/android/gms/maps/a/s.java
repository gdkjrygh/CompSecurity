// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.IInterface;
import com.google.android.gms.b.j;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

// Referenced classes of package com.google.android.gms.maps.a:
//            cc, cf, ci, cl

public interface s
    extends IInterface
{

    public abstract j a(StreetViewPanoramaOrientation streetviewpanoramaorientation);

    public abstract StreetViewPanoramaOrientation a(j j);

    public abstract void a(cc cc);

    public abstract void a(cf cf);

    public abstract void a(ci ci);

    public abstract void a(cl cl);

    public abstract void a(LatLng latlng);

    public abstract void a(LatLng latlng, int i);

    public abstract void a(StreetViewPanoramaCamera streetviewpanoramacamera, long l);

    public abstract void a(String s1);

    public abstract void a(boolean flag);

    public abstract boolean a();

    public abstract void b(boolean flag);

    public abstract boolean b();

    public abstract void c(boolean flag);

    public abstract boolean c();

    public abstract void d(boolean flag);

    public abstract boolean d();

    public abstract StreetViewPanoramaCamera e();

    public abstract StreetViewPanoramaLocation f();
}
