// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dominos.android.sdk.common.FontManager;

public class TrackerOrderDetailsView extends LinearLayout
{

    TextView mOrderDescription;

    public TrackerOrderDetailsView(Context context)
    {
        super(context);
    }

    public TrackerOrderDetailsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void bind(String s)
    {
        mOrderDescription.setText(s);
    }

    protected void onAfterViews()
    {
        FontManager.applyDominosFont(this);
    }
}
