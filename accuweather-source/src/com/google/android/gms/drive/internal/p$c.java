// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            p

static class Hw
    implements com.google.android.gms.drive.eApi.DriveIdResult
{

    private final DriveId Hw;
    private final Status yw;

    public DriveId getDriveId()
    {
        return Hw;
    }

    public Status getStatus()
    {
        return yw;
    }

    public eIdResult(Status status, DriveId driveid)
    {
        yw = status;
        Hw = driveid;
    }
}
