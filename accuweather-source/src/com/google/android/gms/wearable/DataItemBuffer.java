// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.g;
import com.google.android.gms.wearable.internal.o;

// Referenced classes of package com.google.android.gms.wearable:
//            DataItem

public class DataItemBuffer extends g
    implements Result
{

    private final Status yw;

    public DataItemBuffer(DataHolder dataholder)
    {
        super(dataholder);
        yw = new Status(dataholder.getStatusCode());
    }

    protected Object c(int i, int j)
    {
        return n(i, j);
    }

    protected String eU()
    {
        return "path";
    }

    public Status getStatus()
    {
        return yw;
    }

    protected DataItem n(int i, int j)
    {
        return new o(DD, i, j);
    }
}
