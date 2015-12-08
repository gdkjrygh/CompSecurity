// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.googlemap;

import me.lyft.android.common.Unit;
import rx.functions.Action0;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.map.googlemap:
//            GoogleMapView

class val.worker
    implements Action0
{

    final GoogleMapView this$0;
    final rx. val$worker;

    public void call()
    {
        if (!val$worker.isUnsubscribed())
        {
            GoogleMapView.access$400(GoogleMapView.this).onNext(Unit.create());
        }
    }

    ()
    {
        this$0 = final_googlemapview;
        val$worker = rx..this;
        super();
    }
}
