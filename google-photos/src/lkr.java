// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.nearby.messages.internal.GetPermissionStatusRequest;
import com.google.android.gms.nearby.messages.internal.PublishRequest;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;
import com.google.android.gms.nearby.messages.internal.UnpublishRequest;
import com.google.android.gms.nearby.messages.internal.UnsubscribeRequest;

final class lkr
    implements lkp
{

    private IBinder a;

    lkr(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(GetPermissionStatusRequest getpermissionstatusrequest)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        if (getpermissionstatusrequest == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        parcel.writeInt(1);
        getpermissionstatusrequest.writeToParcel(parcel, 0);
_L1:
        a.transact(7, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        getpermissionstatusrequest;
        parcel.recycle();
        throw getpermissionstatusrequest;
    }

    public final void a(PublishRequest publishrequest)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        if (publishrequest == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        publishrequest.writeToParcel(parcel, 0);
_L1:
        a.transact(1, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        publishrequest;
        parcel.recycle();
        throw publishrequest;
    }

    public final void a(SubscribeRequest subscriberequest)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        if (subscriberequest == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        subscriberequest.writeToParcel(parcel, 0);
_L1:
        a.transact(3, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        subscriberequest;
        parcel.recycle();
        throw subscriberequest;
    }

    public final void a(UnpublishRequest unpublishrequest)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        if (unpublishrequest == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        unpublishrequest.writeToParcel(parcel, 0);
_L1:
        a.transact(2, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        unpublishrequest;
        parcel.recycle();
        throw unpublishrequest;
    }

    public final void a(UnsubscribeRequest unsubscriberequest)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        if (unsubscriberequest == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        parcel.writeInt(1);
        unsubscriberequest.writeToParcel(parcel, 0);
_L1:
        a.transact(4, parcel, null, 1);
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        unsubscriberequest;
        parcel.recycle();
        throw unsubscriberequest;
    }

    public final void a(String s)
    {
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        parcel.writeString(s);
        a.transact(6, parcel, null, 1);
        parcel.recycle();
        return;
        s;
        parcel.recycle();
        throw s;
    }

    public final IBinder asBinder()
    {
        return a;
    }
}
