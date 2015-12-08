// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.content.IntentSender;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.drive.internal.OpenFileIntentSenderRequest;
import com.google.android.gms.drive.internal.ab;
import com.google.android.gms.drive.internal.q;

// Referenced classes of package com.google.android.gms.drive:
//            Drive, DriveId

public class OpenFileActivityBuilder
{

    public static final String EXTRA_RESPONSE_DRIVE_ID = "response_drive_id";
    private String Nw;
    private String Nx[];
    private DriveId Ny;

    public OpenFileActivityBuilder()
    {
    }

    public IntentSender build(GoogleApiClient googleapiclient)
    {
        o.a(googleapiclient.isConnected(), "Client must be connected");
        if (Nx == null)
        {
            Nx = new String[0];
        }
        googleapiclient = ((q)googleapiclient.a(Drive.CU)).hY();
        try
        {
            googleapiclient = googleapiclient.a(new OpenFileIntentSenderRequest(Nw, Nx, Ny));
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
        Ny = (DriveId)o.i(driveid);
        return this;
    }

    public OpenFileActivityBuilder setActivityTitle(String s)
    {
        Nw = (String)o.i(s);
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
        o.b(flag, "mimeTypes may not be null");
        Nx = as;
        return this;
    }
}
