// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import com.google.android.gms.maps.model.Marker;

class val.marker extends com.pinterest.ui.imageview.stener._cls1
{

    final val.marker this$1;
    final Marker val$marker;

    public void onBitmapSet()
    {
        val$marker.showInfoWindow();
    }

    ()
    {
        this$1 = final_;
        val$marker = Marker.this;
        super();
    }
}
