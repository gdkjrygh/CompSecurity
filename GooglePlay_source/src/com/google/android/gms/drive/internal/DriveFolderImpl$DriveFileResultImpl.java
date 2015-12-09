// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveFile;

// Referenced classes of package com.google.android.gms.drive.internal:
//            DriveFolderImpl

private static final class mFile
    implements com.google.android.gms.drive.sultImpl
{

    private final DriveFile mFile;
    private final Status mStatus;

    public final DriveFile getDriveFile()
    {
        return mFile;
    }

    public final Status getStatus()
    {
        return mStatus;
    }

    public (Status status, DriveFile drivefile)
    {
        mStatus = status;
        mFile = drivefile;
    }
}
