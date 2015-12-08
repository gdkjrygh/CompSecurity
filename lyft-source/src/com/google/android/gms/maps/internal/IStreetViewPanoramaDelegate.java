// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IInterface;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

// Referenced classes of package com.google.android.gms.maps.internal:
//            zzr, zzs, zzt, zzu

public interface IStreetViewPanoramaDelegate
    extends IInterface
{

    public abstract zzd a(StreetViewPanoramaOrientation streetviewpanoramaorientation);

    public abstract StreetViewPanoramaOrientation a(zzd zzd);

    public abstract void a(zzr zzr);

    public abstract void a(zzs zzs);

    public abstract void a(zzt zzt);

    public abstract void a(zzu zzu);

    public abstract void a(LatLng latlng);

    public abstract void a(LatLng latlng, int i);

    public abstract void a(StreetViewPanoramaCamera streetviewpanoramacamera, long l);

    public abstract void a(String s);

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
