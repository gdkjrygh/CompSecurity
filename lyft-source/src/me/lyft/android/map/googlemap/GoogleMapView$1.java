// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.googlemap;

import rx.functions.Action1;

// Referenced classes of package me.lyft.android.map.googlemap:
//            GoogleMapView

class this._cls0
    implements Action1
{

    final GoogleMapView this$0;

    public void call(Boolean boolean1)
    {
        GoogleMapView.access$002(GoogleMapView.this, boolean1.booleanValue());
    }

    public volatile void call(Object obj)
    {
        call((Boolean)obj);
    }

    ()
    {
        this$0 = GoogleMapView.this;
        super();
    }
}
