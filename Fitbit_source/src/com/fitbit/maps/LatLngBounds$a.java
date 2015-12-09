// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.maps;


// Referenced classes of package com.fitbit.maps:
//            LatLngBounds, LatLng

public static final class el.<init>
{

    private com.google.android.gms.maps.model.a a;

    public el.<init> a(LatLng latlng)
    {
        a.a(latlng.a());
        return this;
    }

    public LatLngBounds a()
    {
        return new LatLngBounds(a.a());
    }

    public el.LatLngBounds.a()
    {
        a = new com.google.android.gms.maps.model.<init>();
    }
}
