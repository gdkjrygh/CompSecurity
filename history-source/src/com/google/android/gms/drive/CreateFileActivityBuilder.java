// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.content.IntentSender;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.internal.i;
import com.google.android.gms.drive.internal.s;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.lh;

// Referenced classes of package com.google.android.gms.drive:
//            Drive, DriveContents, Contents, DriveId, 
//            MetadataChangeSet

public class CreateFileActivityBuilder
{

    public static final String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";
    private final i Ol = new i(0);
    private DriveContents Om;
    private boolean On;

    public CreateFileActivityBuilder()
    {
    }

    public IntentSender build(GoogleApiClient googleapiclient)
    {
        jx.b(Boolean.valueOf(On), "Must call setInitialDriveContents to CreateFileActivityBuilder.");
        boolean flag;
        if (googleapiclient.a(Drive.SCOPE_FILE) || googleapiclient.a(Drive.Oo))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "The apiClient must have suitable scope to create files");
        if (Om != null)
        {
            lh.a(Om.getParcelFileDescriptor());
            Om.is();
        }
        return Ol.build(googleapiclient);
    }

    public CreateFileActivityBuilder setActivityStartFolder(DriveId driveid)
    {
        Ol.a(driveid);
        return this;
    }

    public CreateFileActivityBuilder setActivityTitle(String s1)
    {
        Ol.bl(s1);
        return this;
    }

    public CreateFileActivityBuilder setInitialDriveContents(DriveContents drivecontents)
    {
        if (drivecontents != null)
        {
            if (!(drivecontents instanceof s))
            {
                throw new IllegalArgumentException("Only DriveContents obtained from the Drive API are accepted.");
            }
            if (drivecontents.getDriveId() != null)
            {
                throw new IllegalArgumentException("Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation.");
            }
            if (drivecontents.it())
            {
                throw new IllegalArgumentException("DriveContents are already closed.");
            }
            Ol.bq(drivecontents.ir().getRequestId());
            Om = drivecontents;
        } else
        {
            Ol.bq(1);
        }
        On = true;
        return this;
    }

    public CreateFileActivityBuilder setInitialMetadata(MetadataChangeSet metadatachangeset)
    {
        Ol.a(metadatachangeset);
        return this;
    }
}
