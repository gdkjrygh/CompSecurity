// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveContents;

// Referenced classes of package com.google.android.gms.drive.internal:
//            DriveApiImpl

static final class mDriveContents
    implements Releasable, com.google.android.gms.drive.sultImpl
{

    private final DriveContents mDriveContents;
    private final Status mStatus;

    public final DriveContents getDriveContents()
    {
        return mDriveContents;
    }

    public final Status getStatus()
    {
        return mStatus;
    }

    public final void release()
    {
        if (mDriveContents != null)
        {
            mDriveContents.markClosedOnClient();
        }
    }

    public (Status status, DriveContents drivecontents)
    {
        mStatus = status;
        mDriveContents = drivecontents;
    }
}
