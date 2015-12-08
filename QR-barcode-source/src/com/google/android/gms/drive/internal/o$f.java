// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            o

private static class MW
    implements com.google.android.gms.drive.eApi.DriveIdResult
{

    private final Status CM;
    private final DriveId MW;

    public DriveId getDriveId()
    {
        return MW;
    }

    public Status getStatus()
    {
        return CM;
    }

    public eIdResult(Status status, DriveId driveid)
    {
        CM = status;
        MW = driveid;
    }
}
