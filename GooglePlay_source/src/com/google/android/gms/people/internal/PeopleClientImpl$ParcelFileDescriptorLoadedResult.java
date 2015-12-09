// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.IOUtils;

// Referenced classes of package com.google.android.gms.people.internal:
//            PeopleClientImpl

private static final class mHeight
    implements com.google.android.gms.people.edResult
{

    private final int mHeight;
    private final ParcelFileDescriptor mPfd;
    private final boolean mRewindable;
    private final Status mStatus;
    private final int mWidth;

    public final int getHeight()
    {
        return mHeight;
    }

    public final ParcelFileDescriptor getParcelFileDescriptor()
    {
        return mPfd;
    }

    public final Status getStatus()
    {
        return mStatus;
    }

    public final int getWidth()
    {
        return mWidth;
    }

    public final void release()
    {
        if (mPfd != null)
        {
            IOUtils.closeQuietly(mPfd);
        }
    }

    public (Status status, ParcelFileDescriptor parcelfiledescriptor, boolean flag, int i, int j)
    {
        mStatus = status;
        mPfd = parcelfiledescriptor;
        mRewindable = flag;
        mWidth = i;
        mHeight = j;
    }
}
