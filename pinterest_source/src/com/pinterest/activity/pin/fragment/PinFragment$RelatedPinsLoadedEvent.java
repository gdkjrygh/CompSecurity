// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import com.pinterest.api.model.Pin;
import java.util.List;

public class _pin
{

    private Pin _pin;
    private List _relatedPins;

    public Pin getPin()
    {
        return _pin;
    }

    public List getRelatedPins()
    {
        return _relatedPins;
    }

    public (List list, Pin pin)
    {
        _relatedPins = list;
        _pin = pin;
    }
}
