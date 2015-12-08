// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.nearby.messages.devices.NearbyDeviceFilter;
import com.google.android.gms.nearby.messages.internal.MessageType;

// Referenced classes of package com.google.android.gms.nearby.messages:
//            MessageFilter

public final class MessageFilterCreator
    implements android.os.Parcelable.Creator
{

    public MessageFilterCreator()
    {
    }

    static void writeToParcel$1fcaecb8(MessageFilter messagefilter, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeTypedList(parcel, 1, messagefilter.mMessageTypes, false);
        SafeParcelWriter.writeInt(parcel, 1000, messagefilter.mVersionCode);
        SafeParcelWriter.writeTypedList(parcel, 2, messagefilter.mDeviceFilters, false);
        SafeParcelWriter.writeBoolean(parcel, 3, messagefilter.includeAllMyTypes);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        java.util.ArrayList arraylist1 = null;
        boolean flag = false;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        java.util.ArrayList arraylist = null;
        int i = 0;
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
                    arraylist = SafeParcelReader.createTypedList(parcel, k, MessageType.CREATOR);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    arraylist1 = SafeParcelReader.createTypedList(parcel, k, NearbyDeviceFilter.CREATOR);
                    break;

                case 3: // '\003'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new MessageFilter(i, arraylist, arraylist1, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new MessageFilter[i];
    }
}
