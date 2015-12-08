// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googleplaces;

import java.util.List;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.location.Location;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.infrastructure.googleplaces:
//            GooglePlaceService

class val.placeTypeCodes
    implements Func1
{

    final GooglePlaceService this$0;
    final Location val$center;
    final List val$placeTypeCodes;
    final String val$query;

    public volatile Object call(Object obj)
    {
        return call((Unit)obj);
    }

    public Observable call(Unit unit)
    {
        return GooglePlaceService.access$300(GooglePlaceService.this, val$query, val$center, val$placeTypeCodes);
    }

    ()
    {
        this$0 = final_googleplaceservice;
        val$query = s;
        val$center = location;
        val$placeTypeCodes = List.this;
        super();
    }
}
