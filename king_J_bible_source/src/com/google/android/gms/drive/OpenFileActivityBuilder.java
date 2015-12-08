// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.content.IntentSender;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.internal.OpenFileIntentSenderRequest;
import com.google.android.gms.drive.internal.n;
import com.google.android.gms.drive.internal.u;
import com.google.android.gms.internal.fq;

// Referenced classes of package com.google.android.gms.drive:
//            Drive, DriveId

public class OpenFileActivityBuilder
{

    public static final String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";
    private String EB;
    private DriveId EC;
    private String EQ[];

    public OpenFileActivityBuilder()
    {
    }

    public IntentSender build(GoogleApiClient googleapiclient)
    {
        fq.b(EQ, "setMimeType(String[]) must be called on this builder before calling build()");
        fq.a(googleapiclient.isConnected(), "Client must be connected");
        googleapiclient = ((n)googleapiclient.a(Drive.wx)).fE();
        try
        {
            googleapiclient = googleapiclient.a(new OpenFileIntentSenderRequest(EB, EQ, EC));
        }
        // Misplaced declaration of an exception variable
        catch (GoogleApiClient googleapiclient)
        {
            throw new RuntimeException("Unable to connect Drive Play Service", googleapiclient);
        }
        return googleapiclient;
    }

    public OpenFileActivityBuilder setActivityStartFolder(DriveId driveid)
    {
        EC = (DriveId)fq.f(driveid);
        return this;
    }

    public OpenFileActivityBuilder setActivityTitle(String s)
    {
        EB = (String)fq.f(s);
        return this;
    }

    public OpenFileActivityBuilder setMimeType(String as[])
    {
        boolean flag;
        if (as != null && as.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fq.b(flag, "mimeTypes may not be null and must contain at least one value");
        EQ = as;
        return this;
    }
}
