// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IInterface;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

// Referenced classes of package com.google.android.gms.maps.internal:
//            ICameraUpdateFactoryDelegate, IMapViewDelegate, IStreetViewPanoramaViewDelegate, IMapFragmentDelegate, 
//            IStreetViewPanoramaFragmentDelegate

public interface zzc
    extends IInterface
{

    public abstract ICameraUpdateFactoryDelegate a();

    public abstract IMapViewDelegate a(zzd zzd, GoogleMapOptions googlemapoptions);

    public abstract IStreetViewPanoramaViewDelegate a(zzd zzd, StreetViewPanoramaOptions streetviewpanoramaoptions);

    public abstract void a(zzd zzd);

    public abstract void a(zzd zzd, int i);

    public abstract IMapFragmentDelegate b(zzd zzd);

    public abstract com.google.android.gms.maps.model.internal.zzd b();

    public abstract IStreetViewPanoramaFragmentDelegate c(zzd zzd);
}
