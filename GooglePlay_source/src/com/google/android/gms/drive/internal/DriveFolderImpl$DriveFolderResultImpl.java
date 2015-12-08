// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveFolder;

// Referenced classes of package com.google.android.gms.drive.internal:
//            DriveFolderImpl

private static final class mFolder
    implements com.google.android.gms.drive.sultImpl
{

    private final DriveFolder mFolder;
    private final Status mStatus;

    public final DriveFolder getDriveFolder()
    {
        return mFolder;
    }

    public final Status getStatus()
    {
        return mStatus;
    }

    public Q(Status status, DriveFolder drivefolder)
    {
        mStatus = status;
        mFolder = drivefolder;
    }
}
