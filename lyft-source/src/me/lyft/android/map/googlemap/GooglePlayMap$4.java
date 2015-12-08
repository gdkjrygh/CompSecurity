// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.googlemap;

import android.view.View;
import com.google.android.gms.maps.model.Marker;
import me.lyft.android.common.Strings;
import me.lyft.android.map.core.MapInfoWindowView;

// Referenced classes of package me.lyft.android.map.googlemap:
//            GooglePlayMap

class val.infoWindowView
    implements com.google.android.gms.maps.ndowAdapter
{

    final GooglePlayMap this$0;
    final MapInfoWindowView val$infoWindowView;

    public View getInfoContents(Marker marker)
    {
        return null;
    }

    public View getInfoWindow(Marker marker)
    {
        marker = marker.c();
        val$infoWindowView.setText(marker);
        if (!Strings.isNullOrEmpty(marker))
        {
            return val$infoWindowView;
        } else
        {
            return null;
        }
    }

    owAdapter()
    {
        this$0 = final_googleplaymap;
        val$infoWindowView = MapInfoWindowView.this;
        super();
    }
}
