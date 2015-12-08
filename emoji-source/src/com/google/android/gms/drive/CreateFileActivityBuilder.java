// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.content.IntentSender;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.internal.h;
import com.google.android.gms.internal.hm;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.drive:
//            Contents, DriveId, MetadataChangeSet

public class CreateFileActivityBuilder
{

    public static final String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";
    private final h HF = new h(0);
    private Contents HG;

    public CreateFileActivityBuilder()
    {
    }

    public IntentSender build(GoogleApiClient googleapiclient)
    {
        hm.b(HG, "Must provide initial contents to CreateFileActivityBuilder.");
        try
        {
            HG.getParcelFileDescriptor().close();
        }
        catch (IOException ioexception) { }
        HG.close();
        return HF.build(googleapiclient);
    }

    public CreateFileActivityBuilder setActivityStartFolder(DriveId driveid)
    {
        HF.a(driveid);
        return this;
    }

    public CreateFileActivityBuilder setActivityTitle(String s)
    {
        HF.aM(s);
        return this;
    }

    public CreateFileActivityBuilder setInitialContents(Contents contents)
    {
        HG = (Contents)hm.f(contents);
        HF.aS(HG.getRequestId());
        return this;
    }

    public CreateFileActivityBuilder setInitialMetadata(MetadataChangeSet metadatachangeset)
    {
        HF.a(metadatachangeset);
        return this;
    }
}
