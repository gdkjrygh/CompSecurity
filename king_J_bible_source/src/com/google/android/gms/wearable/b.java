// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import com.google.android.gms.internal.kc;

// Referenced classes of package com.google.android.gms.wearable:
//            a

public class b extends d
    implements Result
{

    private final Status wJ;

    public b(DataHolder dataholder)
    {
        super(dataholder);
        wJ = new Status(dataholder.getStatusCode());
    }

    protected Object c(int i, int j)
    {
        return g(i, j);
    }

    protected a g(int i, int j)
    {
        return new kc(BB, i, j);
    }

    protected String getPrimaryDataMarkerColumn()
    {
        return "path";
    }

    public Status getStatus()
    {
        return wJ;
    }
}
