// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.nearby.messages.internal.GetPermissionStatusRequest;
import com.google.android.gms.nearby.messages.internal.PublishRequest;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;
import com.google.android.gms.nearby.messages.internal.UnpublishRequest;
import com.google.android.gms.nearby.messages.internal.UnsubscribeRequest;

public abstract class lkq extends Binder
    implements lkp
{

    public static lkp a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        if (iinterface != null && (iinterface instanceof lkp))
        {
            return (lkp)iinterface;
        } else
        {
            return new lkr(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj1 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
            parcel1 = obj;
            if (parcel.readInt() != 0)
            {
                parcel1 = (PublishRequest)PublishRequest.CREATOR.createFromParcel(parcel);
            }
            a(parcel1);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
            parcel1 = obj1;
            if (parcel.readInt() != 0)
            {
                parcel1 = (UnpublishRequest)UnpublishRequest.CREATOR.createFromParcel(parcel);
            }
            a(parcel1);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
            parcel1 = obj2;
            if (parcel.readInt() != 0)
            {
                parcel1 = (SubscribeRequest)SubscribeRequest.CREATOR.createFromParcel(parcel);
            }
            a(parcel1);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
            parcel1 = obj3;
            if (parcel.readInt() != 0)
            {
                parcel1 = (UnsubscribeRequest)UnsubscribeRequest.CREATOR.createFromParcel(parcel);
            }
            a(parcel1);
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
            a(parcel.readString());
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
            parcel1 = obj4;
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel1 = (GetPermissionStatusRequest)GetPermissionStatusRequest.CREATOR.createFromParcel(parcel);
        }
        a(parcel1);
        return true;
    }
}
