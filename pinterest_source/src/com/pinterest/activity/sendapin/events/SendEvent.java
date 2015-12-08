// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin.events;

import com.pinterest.activity.search.model.TypeAheadItem;
import com.pinterest.activity.sendapin.model.SendableObject;

public class SendEvent
{

    private TypeAheadItem _item;
    private String _message;
    private SendableObject _objectToSend;

    public SendEvent(TypeAheadItem typeaheaditem)
    {
        setItem(typeaheaditem);
    }

    public TypeAheadItem getItem()
    {
        return _item;
    }

    public String getMessage()
    {
        return _message;
    }

    public SendableObject getObjectToSend()
    {
        return _objectToSend;
    }

    public void setItem(TypeAheadItem typeaheaditem)
    {
        _item = typeaheaditem;
    }

    public void setMessage(String s)
    {
        _message = s;
    }

    public void setObjectToSend(SendableObject sendableobject)
    {
        _objectToSend = sendableobject;
    }
}
