// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.nearby.sharing.internal.ProvideContentRequest;
import com.google.android.gms.nearby.sharing.internal.ReceiveContentRequest;
import com.google.android.gms.nearby.sharing.internal.StopProvidingContentRequest;
import com.google.android.gms.nearby.sharing.internal.TrustedDevicesRequest;

final class llq
    implements llo
{

    private IBinder a;

    llq(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(ProvideContentRequest providecontentrequest)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
        if (providecontentrequest == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        providecontentrequest.writeToParcel(parcel, 0);
_L1:
        a.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        providecontentrequest;
        parcel.recycle();
        throw providecontentrequest;
    }

    public final void a(ReceiveContentRequest receivecontentrequest)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
        if (receivecontentrequest == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        receivecontentrequest.writeToParcel(parcel, 0);
_L1:
        a.transact(4, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        receivecontentrequest;
        parcel.recycle();
        throw receivecontentrequest;
    }

    public final void a(StopProvidingContentRequest stopprovidingcontentrequest)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
        if (stopprovidingcontentrequest == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        stopprovidingcontentrequest.writeToParcel(parcel, 0);
_L1:
        a.transact(2, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        stopprovidingcontentrequest;
        parcel.recycle();
        throw stopprovidingcontentrequest;
    }

    public final void a(TrustedDevicesRequest trusteddevicesrequest)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
        if (trusteddevicesrequest == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        trusteddevicesrequest.writeToParcel(parcel, 0);
_L1:
        a.transact(3, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        trusteddevicesrequest;
        parcel.recycle();
        throw trusteddevicesrequest;
    }

    public final void a(lll lll1)
    {
        IBinder ibinder;
        Parcel parcel;
        ibinder = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
        if (lll1 == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        ibinder = lll1.asBinder();
        parcel.writeStrongBinder(ibinder);
        a.transact(5, parcel, null, 1);
        parcel.recycle();
        return;
        lll1;
        parcel.recycle();
        throw lll1;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
