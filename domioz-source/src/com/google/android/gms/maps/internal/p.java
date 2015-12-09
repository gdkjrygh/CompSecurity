// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IInterface;
import com.google.android.gms.b.j;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

// Referenced classes of package com.google.android.gms.maps.internal:
//            zzy

public interface p
    extends IInterface
{

    public abstract j a(LatLng latlng);

    public abstract LatLng a(j j);

    public abstract LatLng a(zzy zzy);

    public abstract VisibleRegion a();

    public abstract zzy b(LatLng latlng);
}
