// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.content.IntentSender;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.internal.CreateFileIntentSenderRequest;
import com.google.android.gms.drive.internal.n;
import com.google.android.gms.drive.internal.u;
import com.google.android.gms.internal.fq;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.drive:
//            Contents, Drive, MetadataChangeSet, DriveId

public class CreateFileActivityBuilder
{

    public static final String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";
    private Contents EA;
    private String EB;
    private DriveId EC;
    private MetadataChangeSet Ez;

    public CreateFileActivityBuilder()
    {
    }

    public IntentSender build(GoogleApiClient googleapiclient)
    {
        fq.b(Ez, "Must provide initial metadata to CreateFileActivityBuilder.");
        fq.b(EA, "Must provide initial contents to CreateFileActivityBuilder.");
        try
        {
            EA.getParcelFileDescriptor().close();
        }
        catch (IOException ioexception) { }
        EA.close();
        fq.a(googleapiclient.isConnected(), "Client must be connected");
        googleapiclient = ((n)googleapiclient.a(Drive.wx)).fE();
        try
        {
            googleapiclient = googleapiclient.a(new CreateFileIntentSenderRequest(Ez.fD(), EA.fA(), EB, EC));
        }
        // Misplaced declaration of an exception variable
        catch (GoogleApiClient googleapiclient)
        {
            throw new RuntimeException("Unable to connect Drive Play Service", googleapiclient);
        }
        return googleapiclient;
    }

    public CreateFileActivityBuilder setActivityStartFolder(DriveId driveid)
    {
        EC = (DriveId)fq.f(driveid);
        return this;
    }

    public CreateFileActivityBuilder setActivityTitle(String s)
    {
        EB = (String)fq.f(s);
        return this;
    }

    public CreateFileActivityBuilder setInitialContents(Contents contents)
    {
        EA = (Contents)fq.f(contents);
        return this;
    }

    public CreateFileActivityBuilder setInitialMetadata(MetadataChangeSet metadatachangeset)
    {
        Ez = (MetadataChangeSet)fq.f(metadatachangeset);
        return this;
    }
}
