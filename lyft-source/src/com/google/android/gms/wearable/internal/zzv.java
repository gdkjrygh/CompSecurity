// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

public class zzv
    implements DataEvent
{

    private int a;
    private DataItem b;

    public zzv(DataEvent dataevent)
    {
        a = dataevent.c();
        b = (DataItem)dataevent.b().a();
    }

    public Object a()
    {
        return d();
    }

    public DataItem b()
    {
        return b;
    }

    public int c()
    {
        return a;
    }

    public DataEvent d()
    {
        return this;
    }

    public String toString()
    {
        String s;
        if (c() == 1)
        {
            s = "changed";
        } else
        if (c() == 2)
        {
            s = "deleted";
        } else
        {
            s = "unknown";
        }
        return (new StringBuilder()).append("DataEventEntity{ type=").append(s).append(", dataitem=").append(b()).append(" }").toString();
    }
}
