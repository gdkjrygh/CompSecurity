// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.content.IntentSender;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.internal.OpenFileIntentSenderRequest;
import com.google.android.gms.drive.internal.aa;
import com.google.android.gms.drive.internal.r;
import com.google.android.gms.internal.hn;

// Referenced classes of package com.google.android.gms.drive:
//            Drive, DriveId

public class OpenFileActivityBuilder
{

    public static final String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";
    private String HV;
    private String HW[];
    private DriveId HX;

    public OpenFileActivityBuilder()
    {
    }

    public IntentSender build(GoogleApiClient googleapiclient)
    {
        hn.a(googleapiclient.isConnected(), "Client must be connected");
        if (HW == null)
        {
            HW = new String[0];
        }
        googleapiclient = ((r)googleapiclient.a(Drive.yE)).gk();
        try
        {
            googleapiclient = googleapiclient.a(new OpenFileIntentSenderRequest(HV, HW, HX));
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
        HX = (DriveId)hn.f(driveid);
        return this;
    }

    public OpenFileActivityBuilder setActivityTitle(String s)
    {
        HV = (String)hn.f(s);
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
        hn.b(flag, "mimeTypes may not be null");
        HW = as;
        return this;
    }
}
