// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Place;

public class BasicMapInfoView extends LinearLayout
{

    TextView _location;
    TextView _mapAttribution;
    TextView _title;

    public BasicMapInfoView(Context context)
    {
        super(context);
    }

    public BasicMapInfoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        _title.setTypeface(null, 1);
    }

    public BasicMapInfoView populate(Place place)
    {
        if (place == null)
        {
            return null;
        }
        _title.setText(place.getName());
        _location.setText(place.getAddress(true));
        if (ModelHelper.isValid(place.getSourceName()))
        {
            _mapAttribution.setText(place.getSourceName());
            _mapAttribution.setVisibility(0);
            return this;
        } else
        {
            _mapAttribution.setVisibility(8);
            return this;
        }
    }
}
