// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googleplaces;

import me.lyft.android.common.Unit;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.infrastructure.googleplaces:
//            GooglePlaceService

class val.tag
    implements Func1
{

    final GooglePlaceService this$0;
    final String val$placeId;
    final String val$tag;

    public volatile Object call(Object obj)
    {
        return call((Unit)obj);
    }

    public Observable call(Unit unit)
    {
        return GooglePlaceService.access$200(GooglePlaceService.this, val$placeId, val$tag);
    }

    ()
    {
        this$0 = final_googleplaceservice;
        val$placeId = s;
        val$tag = String.this;
        super();
    }
}
