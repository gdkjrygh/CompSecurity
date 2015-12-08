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

    private final Status CM;

    public DataEventBuffer(DataHolder dataholder)
    {
        super(dataholder);
        CM = new Status(dataholder.getStatusCode());
    }

    protected Object f(int i, int j)
    {
        return p(i, j);
    }

    protected String gD()
    {
        return "path";
    }

    public Status getStatus()
    {
        return CM;
    }

    protected DataEvent p(int i, int j)
    {
        return new h(II, i, j);
    }
}
