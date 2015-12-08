// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation.view;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Device;
import com.pinterest.ui.grid.PinGridCell;

public class ConversationPinListCell extends PinGridCell
{

    private static final float MAX_STRETCH_RATIO = 1.3F * Device.getDensity();

    public ConversationPinListCell(Context context)
    {
        this(context, null);
    }

    public ConversationPinListCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private void adjustLayoutBounds(Pin pin)
    {
        Object obj = pin.getImageMediumWidth();
        Object obj1 = pin.getImageMediumHeight();
        if (obj != null && obj1 != null)
        {
            float f = Device.getScreenWidth() / 2.0F;
            if ((float)((Integer) (obj)).intValue() < f)
            {
                float f1 = f / (float)((Integer) (obj)).intValue();
                f = f1;
                if (f1 > MAX_STRETCH_RATIO)
                {
                    f = MAX_STRETCH_RATIO;
                }
                int i = Math.round((float)((Integer) (obj)).intValue() * f);
                obj = Integer.valueOf(Math.round(f * (float)((Integer) (obj1)).intValue()));
                pin = Integer.valueOf(i);
            } else
            {
                pin = ((Pin) (obj));
                obj = obj1;
            }
            obj1 = getLayoutParams();
            obj1.width = pin.intValue();
            obj1.height = ((Integer) (obj)).intValue();
        }
    }

    private void init()
    {
        setRenderUser(false);
        setRenderSource(false);
        setRenderOnto(false);
        setRenderDomain(false);
    }

    public void setPin(String s)
    {
        setVisibility(8);
        s = ModelHelper.getPin(s);
        if (s != null)
        {
            adjustLayoutBounds(s);
            setPin(((Pin) (s)), false);
            setVisibility(0);
        }
    }

}
