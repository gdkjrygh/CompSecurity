// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.content.IntentSender;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.internal.OpenFileIntentSenderRequest;
import com.google.android.gms.drive.internal.ae;
import com.google.android.gms.drive.internal.r;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.drive:
//            Drive, DriveId

public class OpenFileActivityBuilder
{

    public static final String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";
    private String OH;
    private String OI[];
    private DriveId OJ;

    public OpenFileActivityBuilder()
    {
    }

    public IntentSender build(GoogleApiClient googleapiclient)
    {
        jx.a(googleapiclient.isConnected(), "Client must be connected");
        if (OI == null)
        {
            OI = new String[0];
        }
        try
        {
            googleapiclient = ((r)googleapiclient.a(Drive.DQ)).iG().a(new OpenFileIntentSenderRequest(OH, OI, OJ));
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
        OJ = (DriveId)jx.i(driveid);
        return this;
    }

    public OpenFileActivityBuilder setActivityTitle(String s)
    {
        OH = (String)jx.i(s);
        return this;
    }

    public OpenFileActivityBuilder setMimeType(String as[])
    {
        boolean flag;
        if (as != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "mimeTypes may not be null");
        OI = as;
        return this;
    }
}
