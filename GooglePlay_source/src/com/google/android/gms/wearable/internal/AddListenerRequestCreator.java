// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            AddListenerRequest, IWearableListener

public final class AddListenerRequestCreator
    implements android.os.Parcelable.Creator
{

    public AddListenerRequestCreator()
    {
    }

    static void writeToParcel(AddListenerRequest addlistenerrequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, addlistenerrequest.mVersionCode);
        android.os.IBinder ibinder;
        if (addlistenerrequest.listener == null)
        {
            ibinder = null;
        } else
        {
            ibinder = addlistenerrequest.listener.asBinder();
        }
        SafeParcelWriter.writeIBinder$cdac282(parcel, 2, ibinder);
        SafeParcelWriter.writeTypedArray$2d7953c6(parcel, 3, addlistenerrequest.filters, i);
        SafeParcelWriter.writeString(parcel, 4, addlistenerrequest.channelToken, false);
        SafeParcelWriter.writeString(parcel, 5, addlistenerrequest.capability, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        String s1 = null;
        IntentFilter aintentfilter[] = null;
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

                case 3: // '\003'
                    aintentfilter = (IntentFilter[])SafeParcelReader.createTypedArray(parcel, k, IntentFilter.CREATOR);
                    break;

                case 4: // '\004'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 5: // '\005'
                    s = SafeParcelReader.createString(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AddListenerRequest(i, ibinder, aintentfilter, s1, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AddListenerRequest[i];
    }
}
