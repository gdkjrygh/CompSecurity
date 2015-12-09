// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;

public abstract class crr extends Binder
    implements crq
{

    public crr()
    {
        attachInterface(this, "com.google.android.gms.wearable.internal.IWearableListener");
    }

    public static crq a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
        if (iinterface != null && (iinterface instanceof crq))
        {
            return (crq)iinterface;
        } else
        {
            return new crs(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj1 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.wearable.internal.IWearableListener");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
            parcel1 = obj;
            if (parcel.readInt() != 0)
            {
                parcel1 = DataHolder.CREATOR;
                parcel1 = brm.a(parcel);
            }
            a(parcel1);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
            parcel1 = obj1;
            if (parcel.readInt() != 0)
            {
                parcel1 = (MessageEventParcelable)MessageEventParcelable.CREATOR.createFromParcel(parcel);
            }
            a(parcel1);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
            parcel1 = obj2;
            if (parcel.readInt() != 0)
            {
                parcel1 = (NodeParcelable)NodeParcelable.CREATOR.createFromParcel(parcel);
            }
            a(parcel1);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
            parcel1 = obj3;
            if (parcel.readInt() != 0)
            {
                parcel1 = (NodeParcelable)NodeParcelable.CREATOR.createFromParcel(parcel);
            }
            b(parcel1);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
            a(parcel.createTypedArrayList(NodeParcelable.CREATOR));
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
            parcel1 = obj4;
            if (parcel.readInt() != 0)
            {
                parcel1 = (AncsNotificationParcelable)AncsNotificationParcelable.CREATOR.createFromParcel(parcel);
            }
            a(parcel1);
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
            parcel1 = obj5;
            if (parcel.readInt() != 0)
            {
                parcel1 = (ChannelEventParcelable)ChannelEventParcelable.CREATOR.createFromParcel(parcel);
            }
            a(parcel1);
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
            parcel1 = obj6;
            if (parcel.readInt() != 0)
            {
                parcel1 = (CapabilityInfoParcelable)CapabilityInfoParcelable.CREATOR.createFromParcel(parcel);
            }
            a(parcel1);
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
            parcel1 = obj7;
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel1 = (AmsEntityUpdateParcelable)AmsEntityUpdateParcelable.CREATOR.createFromParcel(parcel);
        }
        a(parcel1);
        return true;
    }
}
