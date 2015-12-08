// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IInterface;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

// Referenced classes of package com.google.android.gms.maps.internal:
//            Point

public interface IProjectionDelegate
    extends IInterface
{

    public abstract zzd a(LatLng latlng);

    public abstract LatLng a(zzd zzd);

    public abstract LatLng a(Point point);

    public abstract VisibleRegion a();

    public abstract Point b(LatLng latlng);
}
