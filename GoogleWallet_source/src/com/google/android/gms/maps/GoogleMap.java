// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import com.google.android.gms.internal.kn;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;

public final class GoogleMap
{

    public static final int MAP_TYPE_HYBRID = 4;
    public static final int MAP_TYPE_NONE = 0;
    public static final int MAP_TYPE_NORMAL = 1;
    public static final int MAP_TYPE_SATELLITE = 2;
    public static final int MAP_TYPE_TERRAIN = 3;
    private final IGoogleMapDelegate ays;

    protected GoogleMap(IGoogleMapDelegate igooglemapdelegate)
    {
        ays = (IGoogleMapDelegate)kn.k(igooglemapdelegate);
    }
}
