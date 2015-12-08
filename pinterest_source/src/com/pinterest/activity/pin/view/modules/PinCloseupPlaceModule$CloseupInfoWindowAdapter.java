// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules;

import android.content.Context;
import android.view.View;
import com.google.android.gms.maps.model.Marker;
import com.pinterest.activity.pin.view.BasicMapInfoView;
import com.pinterest.api.model.Place;
import com.pinterest.ui.ViewHelper;

class _place
    implements com.google.android.gms.maps.ndowAdapter
{

    private final BasicMapInfoView _infoView;
    Place _place;

    public View getInfoContents(Marker marker)
    {
        return null;
    }

    public View getInfoWindow(Marker marker)
    {
        if (_place == null)
        {
            return null;
        } else
        {
            return _infoView.populate(_place);
        }
    }

    public (Context context, Place place)
    {
        _infoView = (BasicMapInfoView)ViewHelper.viewById(context, 0x7f0301c4);
        _place = place;
    }
}
