// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            p

private static class Oj
    implements com.google.android.gms.drive.eApi.DriveIdResult
{

    private final Status Eb;
    private final DriveId Oj;

    public DriveId getDriveId()
    {
        return Oj;
    }

    public Status getStatus()
    {
        return Eb;
    }

    public eIdResult(Status status, DriveId driveid)
    {
        Eb = status;
        Oj = driveid;
    }
}
