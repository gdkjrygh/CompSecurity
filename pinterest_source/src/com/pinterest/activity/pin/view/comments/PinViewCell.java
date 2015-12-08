// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.comments;

import com.pinterest.api.model.Pin;

public interface PinViewCell
{

    public abstract Pin getPin();

    public abstract void onEventMainThread(com.pinterest.api.model.Pin.UpdateEvent updateevent);

    public abstract void setPin(Pin pin);

    public abstract void setPin(Pin pin, boolean flag);

    public abstract void setPressed(boolean flag);
}
