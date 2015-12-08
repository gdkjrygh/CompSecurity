// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.content.IntentSender;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.drive.internal.h;
import com.google.android.gms.drive.internal.r;
import com.google.android.gms.internal.jy;

// Referenced classes of package com.google.android.gms.drive:
//            Drive, DriveContents, Contents, DriveId, 
//            MetadataChangeSet

public class CreateFileActivityBuilder
{

    public static final String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";
    private final h Na = new h(0);
    private DriveContents Nb;

    public CreateFileActivityBuilder()
    {
    }

    public IntentSender build(GoogleApiClient googleapiclient)
    {
        o.b(Nb, "Must provide initial contents to CreateFileActivityBuilder.");
        boolean flag;
        if (googleapiclient.a(Drive.SCOPE_FILE) || googleapiclient.a(Drive.Nc))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "The apiClient must have suitable scope to create files");
        jy.a(Nb.getParcelFileDescriptor());
        Nb.getContents().hJ();
        return Na.build(googleapiclient);
    }

    public CreateFileActivityBuilder setActivityStartFolder(DriveId driveid)
    {
        Na.a(driveid);
        return this;
    }

    public CreateFileActivityBuilder setActivityTitle(String s)
    {
        Na.bi(s);
        return this;
    }

    public CreateFileActivityBuilder setInitialContents(Contents contents)
    {
        return setInitialDriveContents(new r(contents));
    }

    public CreateFileActivityBuilder setInitialDriveContents(DriveContents drivecontents)
    {
        if (drivecontents == null)
        {
            throw new IllegalArgumentException("DriveContents must be provided.");
        }
        if (!(drivecontents instanceof r))
        {
            throw new IllegalArgumentException("Only DriveContents obtained from the Drive API are accepted.");
        }
        if (drivecontents.getDriveId() != null)
        {
            throw new IllegalArgumentException("Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation.");
        }
        if (drivecontents.getContents().hK())
        {
            throw new IllegalArgumentException("DriveContents are already closed.");
        } else
        {
            Na.bk(drivecontents.getContents().getRequestId());
            Nb = drivecontents;
            return this;
        }
    }

    public CreateFileActivityBuilder setInitialMetadata(MetadataChangeSet metadatachangeset)
    {
        Na.a(metadatachangeset);
        return this;
    }
}
