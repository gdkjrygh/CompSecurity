// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.nearby.sharing.internal.ProvideContentRequest;
import com.google.android.gms.nearby.sharing.internal.ReceiveContentRequest;
import com.google.android.gms.nearby.sharing.internal.StopProvidingContentRequest;
import com.google.android.gms.nearby.sharing.internal.TrustedDevicesRequest;

public abstract class llp extends Binder
    implements llo
{

    public static llo a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
        if (iinterface != null && (iinterface instanceof llo))
        {
            return (llo)iinterface;
        } else
        {
            return new llq(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj1 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
            parcel1 = obj;
            if (parcel.readInt() != 0)
            {
                parcel1 = (ProvideContentRequest)ProvideContentRequest.CREATOR.createFromParcel(parcel);
            }
            a(parcel1);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
            parcel1 = obj1;
            if (parcel.readInt() != 0)
            {
                parcel1 = (StopProvidingContentRequest)StopProvidingContentRequest.CREATOR.createFromParcel(parcel);
            }
            a(parcel1);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
            parcel1 = obj2;
            if (parcel.readInt() != 0)
            {
                parcel1 = (TrustedDevicesRequest)TrustedDevicesRequest.CREATOR.createFromParcel(parcel);
            }
            a(parcel1);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
            parcel1 = obj3;
            if (parcel.readInt() != 0)
            {
                parcel1 = (ReceiveContentRequest)ReceiveContentRequest.CREATOR.createFromParcel(parcel);
            }
            a(parcel1);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
            a(llm.a(parcel.readStrongBinder()));
            return true;
        }
    }
}
