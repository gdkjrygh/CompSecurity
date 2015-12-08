// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules.util;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.maps.model.Marker;

public class _emptyView
    implements com.google.android.gms.maps.nfoWindowAdapter
{

    private FrameLayout _emptyView;

    public View getInfoContents(Marker marker)
    {
        return null;
    }

    public View getInfoWindow(Marker marker)
    {
        return _emptyView;
    }

    public (Context context)
    {
        _emptyView = new FrameLayout(context);
        context = new TextView(context);
        context.setText(" ");
        _emptyView.addView(context);
    }
}
