// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            UnpublishRequest, INearbyMessagesCallback, MessageWrapper

public final class UnpublishRequestCreator
    implements android.os.Parcelable.Creator
{

    public UnpublishRequestCreator()
    {
    }

    static void writeToParcel(UnpublishRequest unpublishrequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, unpublishrequest.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, unpublishrequest.messageWrapper, i, false);
        SafeParcelWriter.writeIBinder$cdac282(parcel, 3, unpublishrequest.callback.asBinder());
        SafeParcelWriter.writeString(parcel, 4, unpublishrequest.zeroPartyPackageName, false);
        SafeParcelWriter.writeString(parcel, 5, unpublishrequest.realClientPackageName, false);
        SafeParcelWriter.writeBoolean(parcel, 6, unpublishrequest.useRealClientApiKey);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        String s1 = null;
        android.os.IBinder ibinder = null;
        MessageWrapper messagewrapper = null;
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
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    messagewrapper = (MessageWrapper)SafeParcelReader.createParcelable(parcel, k, MessageWrapper.CREATOR);
                    break;

                case 3: // '\003'
                    ibinder = SafeParcelReader.readIBinder(parcel, k);
                    break;

                case 4: // '\004'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 5: // '\005'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 6: // '\006'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new UnpublishRequest(i, messagewrapper, ibinder, s1, s, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new UnpublishRequest[i];
    }
}
