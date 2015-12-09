// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public abstract class DataHolderResult
    implements Releasable, Result
{

    public final DataHolder mDataHolder;
    public final Status mStatus;

    public DataHolderResult(DataHolder dataholder, Status status)
    {
        mStatus = status;
        mDataHolder = dataholder;
    }

    public Status getStatus()
    {
        return mStatus;
    }

    public final void release()
    {
        if (mDataHolder != null)
        {
            mDataHolder.close();
        }
    }
}
