// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.event;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.PlayerEntity;

// Referenced classes of package com.google.android.gms.games.event:
//            EventEntity

public final class EventEntityCreator
    implements android.os.Parcelable.Creator
{

    public EventEntityCreator()
    {
    }

    static void writeToParcel(EventEntity evententity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeString(parcel, 1, evententity.mEventId, false);
        SafeParcelWriter.writeInt(parcel, 1000, evententity.mVersionCode);
        SafeParcelWriter.writeString(parcel, 2, evententity.mName, false);
        SafeParcelWriter.writeString(parcel, 3, evententity.mDescription, false);
        SafeParcelWriter.writeParcelable(parcel, 4, evententity.mIconImageUri, i, false);
        SafeParcelWriter.writeString(parcel, 5, evententity.mIconImageUrl, false);
        SafeParcelWriter.writeParcelable(parcel, 6, evententity.mPlayer, i, false);
        SafeParcelWriter.writeLong(parcel, 7, evententity.mValue);
        SafeParcelWriter.writeString(parcel, 8, evententity.mFormattedValue, false);
        SafeParcelWriter.writeBoolean(parcel, 9, evententity.mIsVisible);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        long l = 0L;
        PlayerEntity playerentity = null;
        String s1 = null;
        Uri uri = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
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
                    s4 = SafeParcelReader.createString(parcel, k);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    s3 = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    s2 = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    uri = (Uri)SafeParcelReader.createParcelable(parcel, k, Uri.CREATOR);
                    break;

                case 5: // '\005'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 6: // '\006'
                    playerentity = (PlayerEntity)SafeParcelReader.createParcelable(parcel, k, PlayerEntity.CREATOR);
                    break;

                case 7: // '\007'
                    l = SafeParcelReader.readLong(parcel, k);
                    break;

                case 8: // '\b'
                    s = SafeParcelReader.createString(parcel, k);
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
                return new EventEntity(i, s4, s3, s2, uri, s1, playerentity, l, s, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new EventEntity[i];
    }
}
