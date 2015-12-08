// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataItem;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            f

public static class avs
    implements com.google.android.gms.wearable.Api.DataItemResult
{

    private final Status CM;
    private final DataItem avs;

    public DataItem getDataItem()
    {
        return avs;
    }

    public Status getStatus()
    {
        return CM;
    }

    public temResult(Status status, DataItem dataitem)
    {
        CM = status;
        avs = dataitem;
    }
}
