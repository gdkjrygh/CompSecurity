// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.content.IntentSender;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.internal.hn;

// Referenced classes of package com.google.android.gms.drive.internal:
//            r, CreateFileIntentSenderRequest, aa

public class h
{

    private String HV;
    private DriveId HX;
    protected MetadataChangeSet Ix;
    private Integer Iy;
    private final int Iz;

    public h(int i)
    {
        Iz = i;
    }

    public void a(DriveId driveid)
    {
        HX = (DriveId)hn.f(driveid);
    }

    public void a(MetadataChangeSet metadatachangeset)
    {
        Ix = (MetadataChangeSet)hn.f(metadatachangeset);
    }

    public void aM(String s)
    {
        HV = (String)hn.f(s);
    }

    public void aS(int i)
    {
        Iy = Integer.valueOf(i);
    }

    public IntentSender build(GoogleApiClient googleapiclient)
    {
        hn.b(Ix, "Must provide initial metadata to CreateFileActivityBuilder.");
        hn.a(googleapiclient.isConnected(), "Client must be connected");
        googleapiclient = ((r)googleapiclient.a(Drive.yE)).gk();
        int i;
        if (Iy == null)
        {
            i = -1;
        } else
        {
            i = Iy.intValue();
        }
        try
        {
            googleapiclient = googleapiclient.a(new CreateFileIntentSenderRequest(Ix.gh(), i, HV, HX, Iz));
        }
        // Misplaced declaration of an exception variable
        catch (GoogleApiClient googleapiclient)
        {
            throw new RuntimeException("Unable to connect Drive Play Service", googleapiclient);
        }
        return googleapiclient;
    }
}
