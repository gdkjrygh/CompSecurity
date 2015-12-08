// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

public class HomefeedBuilderIcon extends LinearLayout
{

    protected ImageView _icon;

    public HomefeedBuilderIcon(Context context)
    {
        this(context, null);
    }

    public HomefeedBuilderIcon(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public HomefeedBuilderIcon(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        inflate(getContext(), 0x7f0301dc, this);
        setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        setGravity(5);
        ButterKnife.a(this);
    }

    public void onClick()
    {
        Pinalytics.a(ElementType.HOMEFEED_BUILDER_BUTTON, ComponentType.NAVIGATION);
        Events.post(new Navigation(Location.HOMEFEED_BUILDER_LIST));
    }
}
