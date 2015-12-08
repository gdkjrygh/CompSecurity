// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.multiplayer.ParticipantEntity;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            RoomEntity

public class RoomEntityCreator
    implements android.os.Parcelable.Creator
{

    public RoomEntityCreator()
    {
    }

    static void writeToParcel$24df22bb(RoomEntity roomentity, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeString(parcel, 1, roomentity.mRoomId, false);
        SafeParcelWriter.writeInt(parcel, 1000, roomentity.mVersionCode);
        SafeParcelWriter.writeString(parcel, 2, roomentity.mCreatorId, false);
        SafeParcelWriter.writeLong(parcel, 3, roomentity.mCreationTimestamp);
        SafeParcelWriter.writeInt(parcel, 4, roomentity.mRoomStatus);
        SafeParcelWriter.writeString(parcel, 5, roomentity.mDescription, false);
        SafeParcelWriter.writeInt(parcel, 6, roomentity.mVariant);
        SafeParcelWriter.writeBundle(parcel, 7, roomentity.mAutoMatchCriteria, false);
        SafeParcelWriter.writeTypedList(parcel, 8, roomentity.getParticipants(), false);
        SafeParcelWriter.writeInt(parcel, 9, roomentity.mAutoMatchWaitEstimateSeconds);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public RoomEntity createFromParcel(Parcel parcel)
    {
        int i1 = SafeParcelReader.validateObjectHeader(parcel);
        int l = 0;
        String s2 = null;
        String s1 = null;
        long l1 = 0L;
        int k = 0;
        String s = null;
        int j = 0;
        android.os.Bundle bundle = null;
        java.util.ArrayList arraylist = null;
        int i = 0;
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
                    s2 = SafeParcelReader.createString(parcel, j1);
                    break;

                case 1000: 
                    l = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 2: // '\002'
                    s1 = SafeParcelReader.createString(parcel, j1);
                    break;

                case 3: // '\003'
                    l1 = SafeParcelReader.readLong(parcel, j1);
                    break;

                case 4: // '\004'
                    k = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 5: // '\005'
                    s = SafeParcelReader.createString(parcel, j1);
                    break;

                case 6: // '\006'
                    j = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 7: // '\007'
                    bundle = SafeParcelReader.createBundle(parcel, j1);
                    break;

                case 8: // '\b'
                    arraylist = SafeParcelReader.createTypedList(parcel, j1, ParticipantEntity.CREATOR);
                    break;

                case 9: // '\t'
                    i = SafeParcelReader.readInt(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new RoomEntity(l, s2, s1, l1, k, s, j, bundle, arraylist, i);
            }
        } while (true);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public volatile Object[] newArray(int i)
    {
        return new RoomEntity[i];
    }
}
