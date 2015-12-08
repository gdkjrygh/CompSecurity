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
import com.google.android.gms.internal.hm;

// Referenced classes of package com.google.android.gms.drive.internal:
//            r, CreateFileIntentSenderRequest, aa

public class h
{

    private String HY;
    protected MetadataChangeSet IA;
    private Integer IB;
    private final int IC;
    private DriveId Ia;

    public h(int i)
    {
        IC = i;
    }

    public void a(DriveId driveid)
    {
        Ia = (DriveId)hm.f(driveid);
    }

    public void a(MetadataChangeSet metadatachangeset)
    {
        IA = (MetadataChangeSet)hm.f(metadatachangeset);
    }

    public void aM(String s)
    {
        HY = (String)hm.f(s);
    }

    public void aS(int i)
    {
        IB = Integer.valueOf(i);
    }

    public IntentSender build(GoogleApiClient googleapiclient)
    {
        hm.b(IA, "Must provide initial metadata to CreateFileActivityBuilder.");
        hm.a(googleapiclient.isConnected(), "Client must be connected");
        googleapiclient = ((r)googleapiclient.a(Drive.yH)).gp();
        int i;
        if (IB == null)
        {
            i = -1;
        } else
        {
            i = IB.intValue();
        }
        try
        {
            googleapiclient = googleapiclient.a(new CreateFileIntentSenderRequest(IA.gm(), i, HY, Ia, IC));
        }
        // Misplaced declaration of an exception variable
        catch (GoogleApiClient googleapiclient)
        {
            throw new RuntimeException("Unable to connect Drive Play Service", googleapiclient);
        }
        return googleapiclient;
    }
}
