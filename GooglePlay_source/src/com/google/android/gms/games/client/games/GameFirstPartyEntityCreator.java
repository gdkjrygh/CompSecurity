// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.client.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.game.GameBadgeEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;

// Referenced classes of package com.google.android.gms.games.client.games:
//            GameFirstPartyEntity

public class GameFirstPartyEntityCreator
    implements android.os.Parcelable.Creator
{

    public GameFirstPartyEntityCreator()
    {
    }

    static void writeToParcel(GameFirstPartyEntity gamefirstpartyentity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeParcelable(parcel, 1, gamefirstpartyentity.mGame, i, false);
        SafeParcelWriter.writeInt(parcel, 1000, gamefirstpartyentity.mVersionCode);
        SafeParcelWriter.writeInt(parcel, 2, gamefirstpartyentity.mAvailability);
        SafeParcelWriter.writeBoolean(parcel, 3, gamefirstpartyentity.mOwned);
        SafeParcelWriter.writeInt(parcel, 4, gamefirstpartyentity.mAchievementUnlockedCount);
        SafeParcelWriter.writeLong(parcel, 5, gamefirstpartyentity.mLastPlayedServerTimestamp);
        SafeParcelWriter.writeLong(parcel, 6, gamefirstpartyentity.mPriceMicros);
        SafeParcelWriter.writeString(parcel, 7, gamefirstpartyentity.mFormattedPrice, false);
        SafeParcelWriter.writeLong(parcel, 8, gamefirstpartyentity.mFullPriceMicros);
        SafeParcelWriter.writeString(parcel, 9, gamefirstpartyentity.mFormattedFullPrice, false);
        SafeParcelWriter.writeTypedList(parcel, 10, gamefirstpartyentity.getBadges(), false);
        SafeParcelWriter.writeParcelable(parcel, 11, gamefirstpartyentity.mSnapshot, i, false);
        SafeParcelWriter.writeTypedList(parcel, 12, gamefirstpartyentity.mScreenshotImageUris, false);
        SafeParcelWriter.writeString(parcel, 13, gamefirstpartyentity.mVideoUrl, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public GameFirstPartyEntity createFromParcel(Parcel parcel)
    {
        int l = SafeParcelReader.validateObjectHeader(parcel);
        int k = 0;
        GameEntity gameentity = null;
        int j = 0;
        boolean flag = false;
        int i = 0;
        long l3 = 0L;
        long l2 = 0L;
        String s2 = null;
        long l1 = 0L;
        String s1 = null;
        java.util.ArrayList arraylist1 = null;
        SnapshotMetadataEntity snapshotmetadataentity = null;
        java.util.ArrayList arraylist = null;
        String s = null;
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
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 3: // '\003'
                    flag = SafeParcelReader.readBoolean(parcel, i1);
                    break;

                case 4: // '\004'
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 5: // '\005'
                    l3 = SafeParcelReader.readLong(parcel, i1);
                    break;

                case 6: // '\006'
                    l2 = SafeParcelReader.readLong(parcel, i1);
                    break;

                case 7: // '\007'
                    s2 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 8: // '\b'
                    l1 = SafeParcelReader.readLong(parcel, i1);
                    break;

                case 9: // '\t'
                    s1 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 10: // '\n'
                    arraylist1 = SafeParcelReader.createTypedList(parcel, i1, GameBadgeEntity.CREATOR);
                    break;

                case 11: // '\013'
                    snapshotmetadataentity = (SnapshotMetadataEntity)SafeParcelReader.createParcelable(parcel, i1, SnapshotMetadataEntity.CREATOR);
                    break;

                case 12: // '\f'
                    arraylist = SafeParcelReader.createTypedList(parcel, i1, Uri.CREATOR);
                    break;

                case 13: // '\r'
                    s = SafeParcelReader.createString(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new GameFirstPartyEntity(k, gameentity, j, flag, i, l3, l2, s2, l1, s1, arraylist1, snapshotmetadataentity, arraylist, s);
            }
        } while (true);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public volatile Object[] newArray(int i)
    {
        return new GameFirstPartyEntity[i];
    }
}
