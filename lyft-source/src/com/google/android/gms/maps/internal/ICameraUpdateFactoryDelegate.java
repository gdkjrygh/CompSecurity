// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IInterface;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public interface ICameraUpdateFactoryDelegate
    extends IInterface
{

    public abstract zzd a();

    public abstract zzd a(float f);

    public abstract zzd a(float f, float f1);

    public abstract zzd a(float f, int i, int j);

    public abstract zzd a(CameraPosition cameraposition);

    public abstract zzd a(LatLng latlng);

    public abstract zzd a(LatLng latlng, float f);

    public abstract zzd a(LatLngBounds latlngbounds, int i);

    public abstract zzd a(LatLngBounds latlngbounds, int i, int j, int k);

    public abstract zzd b();

    public abstract zzd b(float f);
}
