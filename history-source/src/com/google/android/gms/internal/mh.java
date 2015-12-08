// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.BleApi;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.BleScanCallback;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.request.ad;
import com.google.android.gms.fitness.request.ah;
import com.google.android.gms.fitness.request.b;
import com.google.android.gms.fitness.result.BleDevicesResult;

// Referenced classes of package com.google.android.gms.internal:
//            lu, lz

public class mh
    implements BleApi
{
    private static class a extends mp.a
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void a(BleDevicesResult bledevicesresult)
        {
            Ea.b(bledevicesresult);
        }

        private a(com.google.android.gms.common.api.BaseImplementation.b b)
        {
            Ea = b;
        }

    }


    public mh()
    {
    }

    public PendingResult claimBleDevice(GoogleApiClient googleapiclient, BleDevice bledevice)
    {
        return googleapiclient.b(new lu.c(googleapiclient, bledevice) {

            final mh UX;
            final BleDevice Va;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lu)a1);
            }

            protected void a(lu lu1)
                throws RemoteException
            {
                lu.b b1 = new lu.b(this);
                String s = lu1.getContext().getPackageName();
                lu1.jM().a(new b(Va), b1, s);
            }

            
            {
                UX = mh.this;
                Va = bledevice;
                super(googleapiclient);
            }
        });
    }

    public PendingResult claimBleDevice(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.b(new lu.c(googleapiclient, s) {

            final mh UX;
            final String UZ;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lu)a1);
            }

            protected void a(lu lu1)
                throws RemoteException
            {
                lu.b b1 = new lu.b(this);
                String s1 = lu1.getContext().getPackageName();
                lu1.jM().a(new b(UZ), b1, s1);
            }

            
            {
                UX = mh.this;
                UZ = s;
                super(googleapiclient);
            }
        });
    }

    public PendingResult listClaimedBleDevices(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new lu.a(googleapiclient) {

            final mh UX;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lu)a1);
            }

            protected void a(lu lu1)
                throws RemoteException
            {
                a a1 = new a(this);
                String s = lu1.getContext().getPackageName();
                lu1.jM().a(a1, s);
            }

            protected Result c(Status status)
            {
                return v(status);
            }

            protected BleDevicesResult v(Status status)
            {
                return BleDevicesResult.C(status);
            }

            
            {
                UX = mh.this;
                super(googleapiclient);
            }
        });
    }

    public PendingResult startBleScan(GoogleApiClient googleapiclient, StartBleScanRequest startblescanrequest)
    {
        return googleapiclient.a(new lu.c(googleapiclient, startblescanrequest) {

            final StartBleScanRequest UW;
            final mh UX;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lu)a1);
            }

            protected void a(lu lu1)
                throws RemoteException
            {
                lu.b b = new lu.b(this);
                String s = lu1.getContext().getPackageName();
                lu1.jM().a(UW, b, s);
            }

            
            {
                UX = mh.this;
                UW = startblescanrequest;
                super(googleapiclient);
            }
        });
    }

    public PendingResult stopBleScan(GoogleApiClient googleapiclient, BleScanCallback blescancallback)
    {
        return googleapiclient.a(new lu.c(googleapiclient, blescancallback) {

            final mh UX;
            final BleScanCallback UY;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lu)a1);
            }

            protected void a(lu lu1)
                throws RemoteException
            {
                lu.b b = new lu.b(this);
                String s = lu1.getContext().getPackageName();
                ad ad1 = new ad(UY);
                lu1.jM().a(ad1, b, s);
            }

            
            {
                UX = mh.this;
                UY = blescancallback;
                super(googleapiclient);
            }
        });
    }

    public PendingResult unclaimBleDevice(GoogleApiClient googleapiclient, BleDevice bledevice)
    {
        return unclaimBleDevice(googleapiclient, bledevice.getAddress());
    }

    public PendingResult unclaimBleDevice(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.b(new lu.c(googleapiclient, s) {

            final mh UX;
            final String UZ;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((lu)a1);
            }

            protected void a(lu lu1)
                throws RemoteException
            {
                lu.b b = new lu.b(this);
                String s1 = lu1.getContext().getPackageName();
                lu1.jM().a(new ah(UZ), b, s1);
            }

            
            {
                UX = mh.this;
                UZ = s;
                super(googleapiclient);
            }
        });
    }
}
