// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import me.lyft.android.ui.UserImageView;

public class RideProgressPassengerItem extends UserImageView
{

    public RideProgressPassengerItem(Context context)
    {
        this(context, null);
        int i = getResources().getDimensionPixelOffset(0x7f08006c);
        setLayoutParams(new android.view.ViewGroup.LayoutParams(i, i));
    }

    public RideProgressPassengerItem(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setPartyIndicatorDrawable(0);
        setPartyIndicatorBackground(0x7f0201eb);
        setPartyTextSize(0x7f080016);
    }

    public void setPartyProfilePhoto(String s)
    {
        loadPhoto(s);
    }

    public void setPartySize(Integer integer)
    {
        setUserPartySize(integer);
    }

    public void setPickedUp(boolean flag)
    {
        android.graphics.drawable.Drawable drawable;
        if (flag)
        {
            drawable = getResources().getDrawable(0x7f0201fe);
        } else
        {
            drawable = null;
        }
        setForeground(drawable);
        if (flag)
        {
            showPartyIndicator(false);
        }
    }
}
