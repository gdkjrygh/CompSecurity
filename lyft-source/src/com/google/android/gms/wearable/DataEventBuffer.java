// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;
import com.google.android.gms.wearable.internal.zzw;

// Referenced classes of package com.google.android.gms.wearable:
//            DataEvent

public class DataEventBuffer extends zzf
    implements Result
{

    private final Status b;

    public DataEventBuffer(DataHolder dataholder)
    {
        super(dataholder);
        b = new Status(dataholder.e());
    }

    public Status a()
    {
        return b;
    }

    protected Object a(int i, int j)
    {
        return b(i, j);
    }

    protected DataEvent b(int i, int j)
    {
        return new zzw(a, i, j);
    }

    protected String c()
    {
        return "path";
    }
}
