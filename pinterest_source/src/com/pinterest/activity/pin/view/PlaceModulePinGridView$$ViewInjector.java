// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.pinterest.activity.pin.view:
//            PlaceModulePinGridView

public class 
{

    public static void inject(butterknife.dView dview, PlaceModulePinGridView placemodulepingridview, Object obj)
    {
        com.pinterest.kit.view.nject(dview, placemodulepingridview, obj);
        placemodulepingridview._numPinsView = (LinearLayout)dview._numPinsView(obj, 0x7f0f03d0, "field '_numPinsView'");
        placemodulepingridview._wrapperLayout = (FrameLayout)dview._wrapperLayout(obj, 0x7f0f0396, "field '_wrapperLayout'");
        placemodulepingridview._numPinsText = (TextView)dview._numPinsText(obj, 0x7f0f03d1, "field '_numPinsText'");
        placemodulepingridview._leftColumn = (LinearLayout)dview._leftColumn(obj, 0x7f0f03ce, "field '_leftColumn'");
        placemodulepingridview._dimmingLayer = (ImageView)dview._dimmingLayer(obj, 0x7f0f03cf, "field '_dimmingLayer'");
    }

    public static void reset(PlaceModulePinGridView placemodulepingridview)
    {
        com.pinterest.kit.view.eset(placemodulepingridview);
        placemodulepingridview._numPinsView = null;
        placemodulepingridview._wrapperLayout = null;
        placemodulepingridview._numPinsText = null;
        placemodulepingridview._leftColumn = null;
        placemodulepingridview._dimmingLayer = null;
    }

    public ()
    {
    }
}
