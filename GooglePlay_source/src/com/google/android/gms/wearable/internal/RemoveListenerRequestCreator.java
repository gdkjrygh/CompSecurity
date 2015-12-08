// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            RemoveListenerRequest, IWearableListener

public final class RemoveListenerRequestCreator
    implements android.os.Parcelable.Creator
{

    public RemoveListenerRequestCreator()
    {
    }

    static void writeToParcel$1160eef7(RemoveListenerRequest removelistenerrequest, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, removelistenerrequest.mVersionCode);
        if (removelistenerrequest.listener == null)
        {
            removelistenerrequest = null;
        } else
        {
            removelistenerrequest = removelistenerrequest.listener.asBinder();
        }
        SafeParcelWriter.writeIBinder$cdac282(parcel, 2, removelistenerrequest);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        android.os.IBinder ibinder = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    ibinder = SafeParcelReader.readIBinder(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new RemoveListenerRequest(i, ibinder);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new RemoveListenerRequest[i];
    }
}
