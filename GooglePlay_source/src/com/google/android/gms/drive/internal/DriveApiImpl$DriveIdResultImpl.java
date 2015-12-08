// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            DriveApiImpl

private static final class mDriveId
    implements com.google.android.gms.drive.sultImpl
{

    private final DriveId mDriveId;
    private final Status mStatus;

    public final DriveId getDriveId()
    {
        return mDriveId;
    }

    public final Status getStatus()
    {
        return mStatus;
    }

    public (Status status, DriveId driveid)
    {
        mStatus = status;
        mDriveId = driveid;
    }
}
