// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.comments;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.api.model.Pin;

// Referenced classes of package com.pinterest.activity.pin.view.comments:
//            PinViewCell

public abstract class PinViewBaseCell extends LinearLayout
    implements PinViewCell
{

    protected Pin _pin;

    public PinViewBaseCell(Context context)
    {
        this(context, null);
    }

    public PinViewBaseCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setOrientation(1);
    }

    public Pin getPin()
    {
        return _pin;
    }

    public void onEventMainThread(com.pinterest.api.model.Pin.UpdateEvent updateevent)
    {
        updateevent = updateevent.getPin();
        if (!updateevent.equals(_pin))
        {
            return;
        } else
        {
            setPin(updateevent);
            return;
        }
    }

    public void setPin(Pin pin)
    {
        setPin(pin, false);
    }

    public void setPin(Pin pin, boolean flag)
    {
        _pin = pin;
    }

    public void setPressed(boolean flag)
    {
    }

    protected void updatePadding()
    {
    }
}
