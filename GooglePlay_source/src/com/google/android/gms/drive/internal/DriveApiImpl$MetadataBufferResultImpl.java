// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.MetadataBuffer;

// Referenced classes of package com.google.android.gms.drive.internal:
//            DriveApiImpl

static final class mMoreEntriesMayExist
    implements com.google.android.gms.drive.sultImpl
{

    private final MetadataBuffer mBuffer;
    private final boolean mMoreEntriesMayExist;
    private final Status mStatus;

    public final MetadataBuffer getMetadataBuffer()
    {
        return mBuffer;
    }

    public final Status getStatus()
    {
        return mStatus;
    }

    public final boolean moreEntriesMayExist()
    {
        return mMoreEntriesMayExist;
    }

    public final void release()
    {
        if (mBuffer != null)
        {
            mBuffer.release();
        }
    }

    public Q(Status status, MetadataBuffer metadatabuffer, boolean flag)
    {
        mStatus = status;
        mBuffer = metadatabuffer;
        mMoreEntriesMayExist = flag;
    }
}
