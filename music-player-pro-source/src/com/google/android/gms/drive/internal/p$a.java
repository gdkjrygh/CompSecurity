// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveContents;

// Referenced classes of package com.google.android.gms.drive.internal:
//            p

static class Om
    implements com.google.android.gms.drive.eApi.DriveContentsResult
{

    private final Status Eb;
    private final DriveContents Om;

    public DriveContents getDriveContents()
    {
        return Om;
    }

    public Status getStatus()
    {
        return Eb;
    }

    public (Status status, DriveContents drivecontents)
    {
        Eb = status;
        Om = drivecontents;
    }
}
