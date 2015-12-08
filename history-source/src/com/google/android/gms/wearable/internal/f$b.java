// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataItem;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            f

public static class axE
    implements com.google.android.gms.wearable.Api.DataItemResult
{

    private final Status Eb;
    private final DataItem axE;

    public DataItem getDataItem()
    {
        return axE;
    }

    public Status getStatus()
    {
        return Eb;
    }

    public temResult(Status status, DataItem dataitem)
    {
        Eb = status;
        axE = dataitem;
    }
}
