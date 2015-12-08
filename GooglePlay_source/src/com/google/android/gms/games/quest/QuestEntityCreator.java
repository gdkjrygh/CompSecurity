// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.quest;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.GameEntity;

// Referenced classes of package com.google.android.gms.games.quest:
//            QuestEntity, MilestoneEntity

public final class QuestEntityCreator
    implements android.os.Parcelable.Creator
{

    public QuestEntityCreator()
    {
    }

    static void writeToParcel(QuestEntity questentity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeParcelable(parcel, 1, questentity.mGame, i, false);
        SafeParcelWriter.writeString(parcel, 2, questentity.mQuestId, false);
        SafeParcelWriter.writeLong(parcel, 3, questentity.mAcceptedTimestamp);
        SafeParcelWriter.writeParcelable(parcel, 4, questentity.mBannerUri, i, false);
        SafeParcelWriter.writeString(parcel, 5, questentity.mBannerUrl, false);
        SafeParcelWriter.writeString(parcel, 6, questentity.mDescription, false);
        SafeParcelWriter.writeLong(parcel, 7, questentity.mEndTimestamp);
        SafeParcelWriter.writeLong(parcel, 8, questentity.mLastUpdatedTimestamp);
        SafeParcelWriter.writeParcelable(parcel, 9, questentity.mIconUri, i, false);
        SafeParcelWriter.writeString(parcel, 10, questentity.mIconUrl, false);
        SafeParcelWriter.writeString(parcel, 12, questentity.mName, false);
        SafeParcelWriter.writeLong(parcel, 13, questentity.mNotifyTimestamp);
        SafeParcelWriter.writeLong(parcel, 14, questentity.mStartTimestamp);
        SafeParcelWriter.writeInt(parcel, 15, questentity.mState);
        SafeParcelWriter.writeTypedList(parcel, 17, questentity.getMilestones(), false);
        SafeParcelWriter.writeInt(parcel, 16, questentity.mType);
        SafeParcelWriter.writeInt(parcel, 1000, questentity.mVersionCode);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int l = SafeParcelReader.validateObjectHeader(parcel);
        int k = 0;
        GameEntity gameentity = null;
        String s4 = null;
        long l5 = 0L;
        Uri uri1 = null;
        String s3 = null;
        String s2 = null;
        long l4 = 0L;
        long l3 = 0L;
        Uri uri = null;
        String s1 = null;
        String s = null;
        long l2 = 0L;
        long l1 = 0L;
        int j = 0;
        int i = 0;
        java.util.ArrayList arraylist = null;
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

                case 2: // '\002'
                    s4 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 3: // '\003'
                    l5 = SafeParcelReader.readLong(parcel, i1);
                    break;

                case 4: // '\004'
                    uri1 = (Uri)SafeParcelReader.createParcelable(parcel, i1, Uri.CREATOR);
                    break;

                case 5: // '\005'
                    s3 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 6: // '\006'
                    s2 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 7: // '\007'
                    l4 = SafeParcelReader.readLong(parcel, i1);
                    break;

                case 8: // '\b'
                    l3 = SafeParcelReader.readLong(parcel, i1);
                    break;

                case 9: // '\t'
                    uri = (Uri)SafeParcelReader.createParcelable(parcel, i1, Uri.CREATOR);
                    break;

                case 10: // '\n'
                    s1 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 12: // '\f'
                    s = SafeParcelReader.createString(parcel, i1);
                    break;

                case 13: // '\r'
                    l2 = SafeParcelReader.readLong(parcel, i1);
                    break;

                case 14: // '\016'
                    l1 = SafeParcelReader.readLong(parcel, i1);
                    break;

                case 15: // '\017'
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 17: // '\021'
                    arraylist = SafeParcelReader.createTypedList(parcel, i1, MilestoneEntity.CREATOR);
                    break;

                case 16: // '\020'
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 1000: 
                    k = SafeParcelReader.readInt(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new QuestEntity(k, gameentity, s4, l5, uri1, s3, s2, l4, l3, uri, s1, s, l2, l1, j, i, arraylist);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new QuestEntity[i];
    }
}
