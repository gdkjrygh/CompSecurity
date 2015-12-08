// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;

// Referenced classes of package com.google.android.gms.nearby.messages:
//            Message

public final class MessageCreator
    implements android.os.Parcelable.Creator
{

    public MessageCreator()
    {
    }

    static void writeToParcel(Message message, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeByteArray(parcel, 1, message.content, false);
        SafeParcelWriter.writeInt(parcel, 1000, message.versionCode);
        SafeParcelWriter.writeString(parcel, 2, message.type, false);
        SafeParcelWriter.writeString(parcel, 3, message.namespace, false);
        SafeParcelWriter.writeTypedArray$2d7953c6(parcel, 4, message.devices, i);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        NearbyDevice anearbydevice[] = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        String s = null;
        String s1 = null;
        byte abyte0[] = null;
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
                    abyte0 = SafeParcelReader.createByteArray(parcel, k);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    anearbydevice = (NearbyDevice[])SafeParcelReader.createTypedArray(parcel, k, NearbyDevice.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new Message(i, abyte0, s1, s, anearbydevice);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new Message[i];
    }
}
