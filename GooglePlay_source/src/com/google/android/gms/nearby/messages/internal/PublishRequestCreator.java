// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.nearby.messages.Strategy;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            PublishRequest, INearbyMessagesCallback, IPublishCallback, MessageWrapper

public final class PublishRequestCreator
    implements android.os.Parcelable.Creator
{

    public PublishRequestCreator()
    {
    }

    static void writeToParcel(PublishRequest publishrequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, publishrequest.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, publishrequest.messageWrapper, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, publishrequest.strategy, i, false);
        SafeParcelWriter.writeIBinder$cdac282(parcel, 4, publishrequest.callback.asBinder());
        SafeParcelWriter.writeString(parcel, 5, publishrequest.zeroPartyPackageName, false);
        SafeParcelWriter.writeString(parcel, 6, publishrequest.realClientPackageName, false);
        SafeParcelWriter.writeBoolean(parcel, 7, publishrequest.isIgnoreNearbyPermission);
        android.os.IBinder ibinder;
        if (publishrequest.publishCallback == null)
        {
            ibinder = null;
        } else
        {
            ibinder = publishrequest.publishCallback.asBinder();
        }
        SafeParcelWriter.writeIBinder$cdac282(parcel, 8, ibinder);
        SafeParcelWriter.writeBoolean(parcel, 9, publishrequest.useRealClientApiKey);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        android.os.IBinder ibinder = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        boolean flag1 = false;
        String s = null;
        String s1 = null;
        android.os.IBinder ibinder1 = null;
        Strategy strategy = null;
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
                    strategy = (Strategy)SafeParcelReader.createParcelable(parcel, k, Strategy.CREATOR);
                    break;

                case 4: // '\004'
                    ibinder1 = SafeParcelReader.readIBinder(parcel, k);
                    break;

                case 5: // '\005'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 6: // '\006'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 7: // '\007'
                    flag1 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 8: // '\b'
                    ibinder = SafeParcelReader.readIBinder(parcel, k);
                    break;

                case 9: // '\t'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PublishRequest(i, messagewrapper, strategy, ibinder1, s1, s, flag1, ibinder, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PublishRequest[i];
    }
}
