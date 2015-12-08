// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.graphics.Point;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.VisibleRegion;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            al

public static interface sibleRegion
{

    public abstract Point a(LatLng latlng);

    public abstract LatLng a(Point point);

    public abstract VisibleRegion a();
}
