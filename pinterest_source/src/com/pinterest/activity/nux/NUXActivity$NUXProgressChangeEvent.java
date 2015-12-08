// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux;


public final class _eventType
{

    EventType _eventType;
    private int _stepChange;

    public final EventType getEventType()
    {
        return _eventType;
    }

    public final int getStepChange()
    {
        return _stepChange;
    }

    public EventType()
    {
        _eventType = null;
        _stepChange = 0;
    }

    public EventType(int i, EventType eventtype)
    {
        _stepChange = i;
        _eventType = eventtype;
    }
}
