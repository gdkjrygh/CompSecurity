// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

public class g
    implements DataEvent
{

    private int AT;
    private DataItem alH;

    public g(DataEvent dataevent)
    {
        AT = dataevent.getType();
        alH = (DataItem)dataevent.getDataItem().freeze();
    }

    public Object freeze()
    {
        return np();
    }

    public DataItem getDataItem()
    {
        return alH;
    }

    public int getType()
    {
        return AT;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public DataEvent np()
    {
        return this;
    }
}
