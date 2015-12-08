// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.content.IntentSender;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.internal.h;
import com.google.android.gms.internal.hn;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.drive:
//            Contents, DriveId, MetadataChangeSet

public class CreateFileActivityBuilder
{

    public static final String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";
    private final h HC = new h(0);
    private Contents HD;

    public CreateFileActivityBuilder()
    {
    }

    public IntentSender build(GoogleApiClient googleapiclient)
    {
        hn.b(HD, "Must provide initial contents to CreateFileActivityBuilder.");
        try
        {
            HD.getParcelFileDescriptor().close();
        }
        catch (IOException ioexception) { }
        HD.close();
        return HC.build(googleapiclient);
    }

    public CreateFileActivityBuilder setActivityStartFolder(DriveId driveid)
    {
        HC.a(driveid);
        return this;
    }

    public CreateFileActivityBuilder setActivityTitle(String s)
    {
        HC.aM(s);
        return this;
    }

    public CreateFileActivityBuilder setInitialContents(Contents contents)
    {
        HD = (Contents)hn.f(contents);
        HC.aS(HD.getRequestId());
        return this;
    }

    public CreateFileActivityBuilder setInitialMetadata(MetadataChangeSet metadatachangeset)
    {
        HC.a(metadatachangeset);
        return this;
    }
}
