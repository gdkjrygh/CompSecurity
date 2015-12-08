// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.herrevad.PredictedNetworkQuality;

public abstract class kqw extends Binder
    implements kqv
{

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.herrevad.internal.IConnectedNetworksQualityCallbacks");
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.herrevad.internal.IConnectedNetworksQualityCallbacks");
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel1 = (Status)Status.CREATOR.createFromParcel(parcel);
        } else
        {
            parcel1 = null;
        }
        a(parcel1, parcel.createTypedArrayList(PredictedNetworkQuality.CREATOR));
        return true;
    }
}
