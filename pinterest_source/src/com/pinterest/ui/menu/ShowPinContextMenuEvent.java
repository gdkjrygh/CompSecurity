// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.menu;

import com.pinterest.api.model.Pin;

public class ShowPinContextMenuEvent
{

    private final Pin _pin;

    public ShowPinContextMenuEvent(Pin pin)
    {
        _pin = pin;
    }

    public Pin getPin()
    {
        return _pin;
    }
}
