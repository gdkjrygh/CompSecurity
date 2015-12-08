// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.content.IntentSender;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            q, CreateFileIntentSenderRequest, ab

public class h
{

    private String Nw;
    private DriveId Ny;
    protected MetadataChangeSet Oi;
    private Integer Oj;
    private final int Ok;

    public h(int i)
    {
        Ok = i;
    }

    public void a(DriveId driveid)
    {
        Ny = (DriveId)o.i(driveid);
    }

    public void a(MetadataChangeSet metadatachangeset)
    {
        Oi = (MetadataChangeSet)o.i(metadatachangeset);
    }

    public void bi(String s)
    {
        Nw = (String)o.i(s);
    }

    public void bk(int i)
    {
        Oj = Integer.valueOf(i);
    }

    public IntentSender build(GoogleApiClient googleapiclient)
    {
        o.b(Oi, "Must provide initial metadata to CreateFileActivityBuilder.");
        o.a(googleapiclient.isConnected(), "Client must be connected");
        googleapiclient = (q)googleapiclient.a(Drive.CU);
        Oi.hS().setContext(googleapiclient.getContext());
        googleapiclient = googleapiclient.hY();
        int i;
        if (Oj == null)
        {
            i = -1;
        } else
        {
            i = Oj.intValue();
        }
        try
        {
            googleapiclient = googleapiclient.a(new CreateFileIntentSenderRequest(Oi.hS(), i, Nw, Ny, Ok));
        }
        // Misplaced declaration of an exception variable
        catch (GoogleApiClient googleapiclient)
        {
            throw new RuntimeException("Unable to connect Drive Play Service", googleapiclient);
        }
        return googleapiclient;
    }
}
