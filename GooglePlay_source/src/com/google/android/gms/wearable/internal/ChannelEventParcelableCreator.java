// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ChannelEventParcelable, ChannelImpl

public final class ChannelEventParcelableCreator
    implements android.os.Parcelable.Creator
{

    public ChannelEventParcelableCreator()
    {
    }

    static void writeToParcel(ChannelEventParcelable channeleventparcelable, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, channeleventparcelable.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, channeleventparcelable.channel, i, false);
        SafeParcelWriter.writeInt(parcel, 3, channeleventparcelable.type);
        SafeParcelWriter.writeInt(parcel, 4, channeleventparcelable.closeReason);
        SafeParcelWriter.writeInt(parcel, 5, channeleventparcelable.appErrorCode);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        int i1 = SafeParcelReader.validateObjectHeader(parcel);
        ChannelImpl channelimpl = null;
        int j = 0;
        int k = 0;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < i1)
            {
                int j1 = parcel.readInt();
                switch (0xffff & j1)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, j1);
                    break;

                case 1: // '\001'
                    l = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 2: // '\002'
                    channelimpl = (ChannelImpl)SafeParcelReader.createParcelable(parcel, j1, ChannelImpl.CREATOR);
                    break;

                case 3: // '\003'
                    k = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 4: // '\004'
                    j = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 5: // '\005'
                    i = SafeParcelReader.readInt(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new ChannelEventParcelable(l, channelimpl, k, j, i);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ChannelEventParcelable[i];
    }
}
