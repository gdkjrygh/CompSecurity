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
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.drive.internal:
//            r, CreateFileIntentSenderRequest, ae

public class i
{

    private String OH;
    private DriveId OJ;
    protected MetadataChangeSet Pu;
    private Integer Pv;
    private final int Pw;

    public i(int j)
    {
        Pw = j;
    }

    public void a(DriveId driveid)
    {
        OJ = (DriveId)jx.i(driveid);
    }

    public void a(MetadataChangeSet metadatachangeset)
    {
        Pu = (MetadataChangeSet)jx.i(metadatachangeset);
    }

    public void bl(String s)
    {
        OH = (String)jx.i(s);
    }

    public void bq(int j)
    {
        Pv = Integer.valueOf(j);
    }

    public IntentSender build(GoogleApiClient googleapiclient)
    {
        jx.b(Pu, "Must provide initial metadata to CreateFileActivityBuilder.");
        jx.a(googleapiclient.isConnected(), "Client must be connected");
        googleapiclient = (r)googleapiclient.a(Drive.DQ);
        Pu.iz().setContext(googleapiclient.getContext());
        int j;
        if (Pv == null)
        {
            j = -1;
        } else
        {
            j = Pv.intValue();
        }
        try
        {
            googleapiclient = googleapiclient.iG().a(new CreateFileIntentSenderRequest(Pu.iz(), j, OH, OJ, Pw));
        }
        // Misplaced declaration of an exception variable
        catch (GoogleApiClient googleapiclient)
        {
            throw new RuntimeException("Unable to connect Drive Play Service", googleapiclient);
        }
        return googleapiclient;
    }
}
