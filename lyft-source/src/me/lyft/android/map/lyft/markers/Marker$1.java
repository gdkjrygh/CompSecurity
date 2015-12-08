// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.lyft.markers;

import me.lyft.android.domain.location.Location;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.map.lyft.markers:
//            Marker

final class 
    implements Func1
{

    public volatile Object call(Object obj)
    {
        return call((Marker)obj);
    }

    public Location call(Marker marker)
    {
        return marker.getLocation();
    }

    ()
    {
    }
}
