// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            p

static class Hz
    implements com.google.android.gms.drive.eApi.DriveIdResult
{

    private final DriveId Hz;
    private final Status yz;

    public DriveId getDriveId()
    {
        return Hz;
    }

    public Status getStatus()
    {
        return yz;
    }

    public eIdResult(Status status, DriveId driveid)
    {
        yz = status;
        Hz = driveid;
    }
}
