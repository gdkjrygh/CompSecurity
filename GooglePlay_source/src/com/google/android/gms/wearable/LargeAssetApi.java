// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.os.Parcelable;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.data.DataBuffer;

public interface LargeAssetApi
{
    public static interface QueueEntryBuffer
        extends Result, DataBuffer
    {
    }

    public static interface QueueState
        extends Parcelable
    {
    }

    public static interface QueueStateChange
        extends Releasable
    {
    }

}
