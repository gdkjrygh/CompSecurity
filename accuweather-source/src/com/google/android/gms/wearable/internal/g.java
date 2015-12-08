// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

public class g
    implements DataEvent
{

    private int AQ;
    private DataItem alE;

    public g(DataEvent dataevent)
    {
        AQ = dataevent.getType();
        alE = (DataItem)dataevent.getDataItem().freeze();
    }

    public Object freeze()
    {
        return nk();
    }

    public DataItem getDataItem()
    {
        return alE;
    }

    public int getType()
    {
        return AQ;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public DataEvent nk()
    {
        return this;
    }
}
