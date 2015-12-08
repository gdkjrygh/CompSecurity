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
//            kk, kp

public class kx
    implements BleApi
{
    private static class a extends lf.a
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;

        public void a(BleDevicesResult bledevicesresult)
        {
            De.b(bledevicesresult);
        }

        private a(com.google.android.gms.common.api.BaseImplementation.b b)
        {
            De = b;
        }

    }


    public kx()
    {
    }

    public PendingResult claimBleDevice(GoogleApiClient googleapiclient, BleDevice bledevice)
    {
        return googleapiclient.b(new kk.c(bledevice) {

            final kx TA;
            final BleDevice TD;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((kk)a1);
            }

            protected void a(kk kk1)
                throws RemoteException
            {
                kk.b b1 = new kk.b(this);
                String s = kk1.getContext().getPackageName();
                kk1.jb().a(new b(TD), b1, s);
            }

            
            {
                TA = kx.this;
                TD = bledevice;
                super();
            }
        });
    }

    public PendingResult claimBleDevice(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.b(new kk.c(s) {

            final kx TA;
            final String TC;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((kk)a1);
            }

            protected void a(kk kk1)
                throws RemoteException
            {
                kk.b b1 = new kk.b(this);
                String s1 = kk1.getContext().getPackageName();
                kk1.jb().a(new b(TC), b1, s1);
            }

            
            {
                TA = kx.this;
                TC = s;
                super();
            }
        });
    }

    public PendingResult listClaimedBleDevices(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new kk.a() {

            final kx TA;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((kk)a1);
            }

            protected void a(kk kk1)
                throws RemoteException
            {
                a a1 = new a(this);
                String s = kk1.getContext().getPackageName();
                kk1.jb().a(a1, s);
            }

            protected Result c(Status status)
            {
                return w(status);
            }

            protected BleDevicesResult w(Status status)
            {
                return BleDevicesResult.D(status);
            }

            
            {
                TA = kx.this;
                super();
            }
        });
    }

    public PendingResult startBleScan(GoogleApiClient googleapiclient, StartBleScanRequest startblescanrequest)
    {
        return googleapiclient.a(new kk.c(startblescanrequest) {

            final kx TA;
            final StartBleScanRequest Tz;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((kk)a1);
            }

            protected void a(kk kk1)
                throws RemoteException
            {
                kk.b b = new kk.b(this);
                String s = kk1.getContext().getPackageName();
                kk1.jb().a(Tz, b, s);
            }

            
            {
                TA = kx.this;
                Tz = startblescanrequest;
                super();
            }
        });
    }

    public PendingResult stopBleScan(GoogleApiClient googleapiclient, BleScanCallback blescancallback)
    {
        return googleapiclient.a(new kk.c(blescancallback) {

            final kx TA;
            final BleScanCallback TB;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((kk)a1);
            }

            protected void a(kk kk1)
                throws RemoteException
            {
                kk.b b = new kk.b(this);
                String s = kk1.getContext().getPackageName();
                ad ad1 = new ad(TB);
                kk1.jb().a(ad1, b, s);
            }

            
            {
                TA = kx.this;
                TB = blescancallback;
                super();
            }
        });
    }

    public PendingResult unclaimBleDevice(GoogleApiClient googleapiclient, BleDevice bledevice)
    {
        return unclaimBleDevice(googleapiclient, bledevice.getAddress());
    }

    public PendingResult unclaimBleDevice(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.b(new kk.c(s) {

            final kx TA;
            final String TC;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((kk)a1);
            }

            protected void a(kk kk1)
                throws RemoteException
            {
                kk.b b = new kk.b(this);
                String s1 = kk1.getContext().getPackageName();
                kk1.jb().a(new ah(TC), b, s1);
            }

            
            {
                TA = kx.this;
                TC = s;
                super();
            }
        });
    }
}
