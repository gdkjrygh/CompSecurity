// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.nearby.bootstrap.request.ConnectRequest;
import com.google.android.gms.nearby.bootstrap.request.ContinueConnectRequest;
import com.google.android.gms.nearby.bootstrap.request.DisableTargetRequest;
import com.google.android.gms.nearby.bootstrap.request.DisconnectRequest;
import com.google.android.gms.nearby.bootstrap.request.EnableTargetRequest;
import com.google.android.gms.nearby.bootstrap.request.SendDataRequest;
import com.google.android.gms.nearby.bootstrap.request.StartScanRequest;
import com.google.android.gms.nearby.bootstrap.request.StopScanRequest;

final class lcb
    implements lbz
{

    private IBinder a;

    lcb(IBinder ibinder)
    {
        a = ibinder;
    }

    public final String a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        String s;
        parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
        a.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        s = parcel1.readString();
        parcel1.recycle();
        parcel.recycle();
        return s;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public final void a(ConnectRequest connectrequest)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
        if (connectrequest == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        connectrequest.writeToParcel(parcel, 0);
_L1:
        a.transact(5, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        connectrequest;
        parcel.recycle();
        throw connectrequest;
    }

    public final void a(ContinueConnectRequest continueconnectrequest)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
        if (continueconnectrequest == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        parcel.writeInt(1);
        continueconnectrequest.writeToParcel(parcel, 0);
_L1:
        a.transact(8, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        continueconnectrequest;
        parcel.recycle();
        throw continueconnectrequest;
    }

    public final void a(DisableTargetRequest disabletargetrequest)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
        if (disabletargetrequest == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        disabletargetrequest.writeToParcel(parcel, 0);
_L1:
        a.transact(4, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        disabletargetrequest;
        parcel.recycle();
        throw disabletargetrequest;
    }

    public final void a(DisconnectRequest disconnectrequest)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
        if (disconnectrequest == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        parcel.writeInt(1);
        disconnectrequest.writeToParcel(parcel, 0);
_L1:
        a.transact(6, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        disconnectrequest;
        parcel.recycle();
        throw disconnectrequest;
    }

    public final void a(EnableTargetRequest enabletargetrequest)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
        if (enabletargetrequest == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        enabletargetrequest.writeToParcel(parcel, 0);
_L1:
        a.transact(3, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        enabletargetrequest;
        parcel.recycle();
        throw enabletargetrequest;
    }

    public final void a(SendDataRequest senddatarequest)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
        if (senddatarequest == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        parcel.writeInt(1);
        senddatarequest.writeToParcel(parcel, 0);
_L1:
        a.transact(7, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        senddatarequest;
        parcel.recycle();
        throw senddatarequest;
    }

    public final void a(StartScanRequest startscanrequest)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
        if (startscanrequest == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        startscanrequest.writeToParcel(parcel, 0);
_L1:
        a.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        startscanrequest;
        parcel.recycle();
        throw startscanrequest;
    }

    public final void a(StopScanRequest stopscanrequest)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
        if (stopscanrequest == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        stopscanrequest.writeToParcel(parcel, 0);
_L1:
        a.transact(2, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        stopscanrequest;
        parcel.recycle();
        throw stopscanrequest;
    }

    public final void a(lbw lbw1)
    {
        IBinder ibinder;
        Parcel parcel;
        ibinder = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
        if (lbw1 == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        ibinder = lbw1.asBinder();
        parcel.writeStrongBinder(ibinder);
        a.transact(10, parcel, null, 1);
        parcel.recycle();
        return;
        lbw1;
        parcel.recycle();
        throw lbw1;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
