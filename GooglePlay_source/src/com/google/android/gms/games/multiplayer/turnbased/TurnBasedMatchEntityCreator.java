// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.multiplayer.ParticipantEntity;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatchEntity

public final class TurnBasedMatchEntityCreator
    implements android.os.Parcelable.Creator
{

    public TurnBasedMatchEntityCreator()
    {
    }

    static void writeToParcel(TurnBasedMatchEntity turnbasedmatchentity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeParcelable(parcel, 1, turnbasedmatchentity.mGame, i, false);
        SafeParcelWriter.writeString(parcel, 2, turnbasedmatchentity.mMatchId, false);
        SafeParcelWriter.writeString(parcel, 3, turnbasedmatchentity.mCreatorId, false);
        SafeParcelWriter.writeLong(parcel, 4, turnbasedmatchentity.mCreationTimestamp);
        SafeParcelWriter.writeString(parcel, 5, turnbasedmatchentity.mLastUpdaterId, false);
        SafeParcelWriter.writeLong(parcel, 6, turnbasedmatchentity.mLastUpdatedTimestamp);
        SafeParcelWriter.writeString(parcel, 7, turnbasedmatchentity.mPendingParticipantId, false);
        SafeParcelWriter.writeInt(parcel, 8, turnbasedmatchentity.mMatchStatus);
        SafeParcelWriter.writeInt(parcel, 10, turnbasedmatchentity.mVariant);
        SafeParcelWriter.writeInt(parcel, 11, turnbasedmatchentity.mVersion);
        SafeParcelWriter.writeByteArray(parcel, 12, turnbasedmatchentity.mData, false);
        SafeParcelWriter.writeTypedList(parcel, 13, turnbasedmatchentity.getParticipants(), false);
        SafeParcelWriter.writeString(parcel, 14, turnbasedmatchentity.mRematchId, false);
        SafeParcelWriter.writeByteArray(parcel, 15, turnbasedmatchentity.mPreviousData, false);
        SafeParcelWriter.writeBundle(parcel, 17, turnbasedmatchentity.mAutoMatchCriteria, false);
        SafeParcelWriter.writeInt(parcel, 16, turnbasedmatchentity.mMatchNumber);
        SafeParcelWriter.writeInt(parcel, 1000, turnbasedmatchentity.mVersionCode);
        SafeParcelWriter.writeBoolean(parcel, 19, turnbasedmatchentity.mIsLocallyModified);
        SafeParcelWriter.writeInt(parcel, 18, turnbasedmatchentity.mTurnStatus);
        SafeParcelWriter.writeString(parcel, 21, turnbasedmatchentity.mDescriptionParticipantId, false);
        SafeParcelWriter.writeString(parcel, 20, turnbasedmatchentity.mDescription, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int k1 = SafeParcelReader.validateObjectHeader(parcel);
        int j1 = 0;
        GameEntity gameentity = null;
        String s6 = null;
        String s5 = null;
        long l3 = 0L;
        String s4 = null;
        long l2 = 0L;
        String s3 = null;
        int i1 = 0;
        int l = 0;
        int k = 0;
        byte abyte1[] = null;
        java.util.ArrayList arraylist = null;
        String s2 = null;
        byte abyte0[] = null;
        int j = 0;
        android.os.Bundle bundle = null;
        int i = 0;
        boolean flag = false;
        String s1 = null;
        String s = null;
        do
        {
            if (parcel.dataPosition() < k1)
            {
                int l1 = parcel.readInt();
                switch (0xffff & l1)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, l1);
                    break;

                case 1: // '\001'
                    gameentity = (GameEntity)SafeParcelReader.createParcelable(parcel, l1, GameEntity.CREATOR);
                    break;

                case 2: // '\002'
                    s6 = SafeParcelReader.createString(parcel, l1);
                    break;

                case 3: // '\003'
                    s5 = SafeParcelReader.createString(parcel, l1);
                    break;

                case 4: // '\004'
                    l3 = SafeParcelReader.readLong(parcel, l1);
                    break;

                case 5: // '\005'
                    s4 = SafeParcelReader.createString(parcel, l1);
                    break;

                case 6: // '\006'
                    l2 = SafeParcelReader.readLong(parcel, l1);
                    break;

                case 7: // '\007'
                    s3 = SafeParcelReader.createString(parcel, l1);
                    break;

                case 8: // '\b'
                    i1 = SafeParcelReader.readInt(parcel, l1);
                    break;

                case 10: // '\n'
                    l = SafeParcelReader.readInt(parcel, l1);
                    break;

                case 11: // '\013'
                    k = SafeParcelReader.readInt(parcel, l1);
                    break;

                case 12: // '\f'
                    abyte1 = SafeParcelReader.createByteArray(parcel, l1);
                    break;

                case 13: // '\r'
                    arraylist = SafeParcelReader.createTypedList(parcel, l1, ParticipantEntity.CREATOR);
                    break;

                case 14: // '\016'
                    s2 = SafeParcelReader.createString(parcel, l1);
                    break;

                case 15: // '\017'
                    abyte0 = SafeParcelReader.createByteArray(parcel, l1);
                    break;

                case 17: // '\021'
                    bundle = SafeParcelReader.createBundle(parcel, l1);
                    break;

                case 16: // '\020'
                    j = SafeParcelReader.readInt(parcel, l1);
                    break;

                case 1000: 
                    j1 = SafeParcelReader.readInt(parcel, l1);
                    break;

                case 19: // '\023'
                    flag = SafeParcelReader.readBoolean(parcel, l1);
                    break;

                case 18: // '\022'
                    i = SafeParcelReader.readInt(parcel, l1);
                    break;

                case 21: // '\025'
                    s = SafeParcelReader.createString(parcel, l1);
                    break;

                case 20: // '\024'
                    s1 = SafeParcelReader.createString(parcel, l1);
                    break;
                }
            } else
            if (parcel.dataPosition() != k1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k1).toString(), parcel);
            } else
            {
                return new TurnBasedMatchEntity(j1, gameentity, s6, s5, l3, s4, l2, s3, i1, l, k, abyte1, arraylist, s2, abyte0, j, bundle, i, flag, s1, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new TurnBasedMatchEntity[i];
    }
}
