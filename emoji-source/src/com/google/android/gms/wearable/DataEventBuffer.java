// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.g;
import com.google.android.gms.wearable.internal.h;

// Referenced classes of package com.google.android.gms.wearable:
//            DataEvent

public class DataEventBuffer extends g
    implements Result
{

    private final Status yz;

    public DataEventBuffer(DataHolder dataholder)
    {
        super(dataholder);
        yz = new Status(dataholder.getStatusCode());
    }

    protected Object c(int i, int j)
    {
        return m(i, j);
    }

    protected String eZ()
    {
        return "path";
    }

    public Status getStatus()
    {
        return yz;
    }

    protected DataEvent m(int i, int j)
    {
        return new h(DG, i, j);
    }
}
