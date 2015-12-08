// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.googlemap;

import com.google.android.gms.maps.model.Marker;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.map.googlemap:
//            GooglePlayMap

class val.onMarkerClicked
    implements com.google.android.gms.maps.erClickListener
{

    final GooglePlayMap this$0;
    final Func1 val$onMarkerClicked;

    public boolean onMarkerClick(Marker marker)
    {
        return ((Boolean)val$onMarkerClicked.call(marker.b())).booleanValue();
    }

    ClickListener()
    {
        this$0 = final_googleplaymap;
        val$onMarkerClicked = Func1.this;
        super();
    }
}
