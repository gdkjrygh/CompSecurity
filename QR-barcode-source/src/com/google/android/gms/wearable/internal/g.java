// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

public class g
    implements DataEvent
{

    private int FD;
    private DataItem avs;

    public g(DataEvent dataevent)
    {
        FD = dataevent.getType();
        avs = (DataItem)dataevent.getDataItem().freeze();
    }

    public Object freeze()
    {
        return pW();
    }

    public DataItem getDataItem()
    {
        return avs;
    }

    public int getType()
    {
        return FD;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public DataEvent pW()
    {
        return this;
    }
}
