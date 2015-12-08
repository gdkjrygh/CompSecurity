// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import com.google.android.gms.maps.model.Marker;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMap

public static interface 
{

    public abstract void onMarkerDrag(Marker marker);

    public abstract void onMarkerDragEnd(Marker marker);

    public abstract void onMarkerDragStart(Marker marker);
}
