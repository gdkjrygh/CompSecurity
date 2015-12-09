// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.RelativeLayout;

public abstract class LoyaltyWidgetBaseLayout extends RelativeLayout
{

    LoyaltyWidgetListener mListener;

    public LoyaltyWidgetBaseLayout(Context context)
    {
        super(context);
    }

    public abstract void disableRedemption();

    public abstract void enableRedemption();

    protected Drawable getDrawableForPie(int i)
    {
        int j = 0x7f02012e;
        if (i < 50) goto _L2; else goto _L1
_L1:
        j = 0x7f020133;
_L4:
        return getResources().getDrawable(j);
_L2:
        if (i >= 40)
        {
            j = 0x7f020132;
        } else
        if (i >= 30)
        {
            j = 0x7f020131;
        } else
        if (i >= 20)
        {
            j = 0x7f020130;
        } else
        if (i >= 10)
        {
            j = 0x7f02012f;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setListener(LoyaltyWidgetListener loyaltywidgetlistener)
    {
        mListener = loyaltywidgetlistener;
    }

    public abstract void updateView();
}
