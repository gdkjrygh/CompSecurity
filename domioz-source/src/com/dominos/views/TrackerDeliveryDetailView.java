// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dominos.android.sdk.common.FontManager;

public class TrackerDeliveryDetailView extends LinearLayout
{

    TextView mAddressView;

    public TrackerDeliveryDetailView(Context context)
    {
        super(context);
    }

    public void bind(String s)
    {
        mAddressView.setText(s);
    }

    protected void onAfterViews()
    {
        FontManager.applyDominosFont(this);
    }
}
