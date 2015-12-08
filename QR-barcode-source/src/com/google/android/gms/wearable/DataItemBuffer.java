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

    private final Status CM;

    public DataItemBuffer(DataHolder dataholder)
    {
        super(dataholder);
        CM = new Status(dataholder.getStatusCode());
    }

    protected Object f(int i, int j)
    {
        return q(i, j);
    }

    protected String gD()
    {
        return "path";
    }

    public Status getStatus()
    {
        return CM;
    }

    protected DataItem q(int i, int j)
    {
        return new o(II, i, j);
    }
}
