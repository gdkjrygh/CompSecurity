// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

public class g
    implements DataEvent
{

    private int Gt;
    private DataItem axE;

    public g(DataEvent dataevent)
    {
        Gt = dataevent.getType();
        axE = (DataItem)dataevent.getDataItem().freeze();
    }

    public Object freeze()
    {
        return rn();
    }

    public DataItem getDataItem()
    {
        return axE;
    }

    public int getType()
    {
        return Gt;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public DataEvent rn()
    {
        return this;
    }
}
