// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.PlayerEntity;

// Referenced classes of package com.google.android.gms.games.request:
//            GameRequestEntity

public final class GameRequestEntityCreator
    implements android.os.Parcelable.Creator
{

    public GameRequestEntityCreator()
    {
    }

    static void writeToParcel(GameRequestEntity gamerequestentity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeParcelable(parcel, 1, gamerequestentity.mGame, i, false);
        SafeParcelWriter.writeInt(parcel, 1000, gamerequestentity.mVersionCode);
        SafeParcelWriter.writeParcelable(parcel, 2, gamerequestentity.mSender, i, false);
        SafeParcelWriter.writeByteArray(parcel, 3, gamerequestentity.mData, false);
        SafeParcelWriter.writeString(parcel, 4, gamerequestentity.mRequestId, false);
        SafeParcelWriter.writeTypedList(parcel, 5, gamerequestentity.getRecipients(), false);
        SafeParcelWriter.writeInt(parcel, 7, gamerequestentity.mType);
        SafeParcelWriter.writeLong(parcel, 9, gamerequestentity.mCreationTimestamp);
        SafeParcelWriter.writeLong(parcel, 10, gamerequestentity.mExpirationTimestamp);
        SafeParcelWriter.writeBundle(parcel, 11, gamerequestentity.mRecipientStatusMap, false);
        SafeParcelWriter.writeInt(parcel, 12, gamerequestentity.mStatus);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int l = SafeParcelReader.validateObjectHeader(parcel);
        int k = 0;
        GameEntity gameentity = null;
        PlayerEntity playerentity = null;
        byte abyte0[] = null;
        String s = null;
        java.util.ArrayList arraylist = null;
        int j = 0;
        long l2 = 0L;
        long l1 = 0L;
        android.os.Bundle bundle = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, i1);
                    break;

                case 1: // '\001'
                    gameentity = (GameEntity)SafeParcelReader.createParcelable(parcel, i1, GameEntity.CREATOR);
                    break;

                case 1000: 
                    k = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 2: // '\002'
                    playerentity = (PlayerEntity)SafeParcelReader.createParcelable(parcel, i1, PlayerEntity.CREATOR);
                    break;

                case 3: // '\003'
                    abyte0 = SafeParcelReader.createByteArray(parcel, i1);
                    break;

                case 4: // '\004'
                    s = SafeParcelReader.createString(parcel, i1);
                    break;

                case 5: // '\005'
                    arraylist = SafeParcelReader.createTypedList(parcel, i1, PlayerEntity.CREATOR);
                    break;

                case 7: // '\007'
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 9: // '\t'
                    l2 = SafeParcelReader.readLong(parcel, i1);
                    break;

                case 10: // '\n'
                    l1 = SafeParcelReader.readLong(parcel, i1);
                    break;

                case 11: // '\013'
                    bundle = SafeParcelReader.createBundle(parcel, i1);
                    break;

                case 12: // '\f'
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new GameRequestEntity(k, gameentity, playerentity, abyte0, s, arraylist, j, l2, l1, bundle, i);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new GameRequestEntity[i];
    }
}
