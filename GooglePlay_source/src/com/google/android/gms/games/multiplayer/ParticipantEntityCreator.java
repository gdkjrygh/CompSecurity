// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.PlayerEntity;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            ParticipantEntity, ParticipantResult

public class ParticipantEntityCreator
    implements android.os.Parcelable.Creator
{

    public ParticipantEntityCreator()
    {
    }

    static void writeToParcel(ParticipantEntity participantentity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeString(parcel, 1, participantentity.mParticipantId, false);
        SafeParcelWriter.writeInt(parcel, 1000, participantentity.mVersionCode);
        SafeParcelWriter.writeString(parcel, 2, participantentity.getDisplayName(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, participantentity.getIconImageUri(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, participantentity.getHiResImageUri(), i, false);
        SafeParcelWriter.writeInt(parcel, 5, participantentity.mStatus);
        SafeParcelWriter.writeString(parcel, 6, participantentity.mClientAddress, false);
        SafeParcelWriter.writeBoolean(parcel, 7, participantentity.mConnectedToRoom);
        SafeParcelWriter.writeParcelable(parcel, 8, participantentity.mPlayer, i, false);
        SafeParcelWriter.writeInt(parcel, 9, participantentity.mCapabilities);
        SafeParcelWriter.writeParcelable(parcel, 10, participantentity.mResult, i, false);
        SafeParcelWriter.writeString(parcel, 11, participantentity.getIconImageUrl(), false);
        SafeParcelWriter.writeString(parcel, 12, participantentity.getHiResImageUrl(), false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public ParticipantEntity createFromParcel(Parcel parcel)
    {
        int l = SafeParcelReader.validateObjectHeader(parcel);
        int k = 0;
        String s4 = null;
        String s3 = null;
        Uri uri1 = null;
        Uri uri = null;
        int j = 0;
        String s2 = null;
        boolean flag = false;
        PlayerEntity playerentity = null;
        int i = 0;
        ParticipantResult participantresult = null;
        String s1 = null;
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
                    s4 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 1000: 
                    k = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 2: // '\002'
                    s3 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 3: // '\003'
                    uri1 = (Uri)SafeParcelReader.createParcelable(parcel, i1, Uri.CREATOR);
                    break;

                case 4: // '\004'
                    uri = (Uri)SafeParcelReader.createParcelable(parcel, i1, Uri.CREATOR);
                    break;

                case 5: // '\005'
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 6: // '\006'
                    s2 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 7: // '\007'
                    flag = SafeParcelReader.readBoolean(parcel, i1);
                    break;

                case 8: // '\b'
                    playerentity = (PlayerEntity)SafeParcelReader.createParcelable(parcel, i1, PlayerEntity.CREATOR);
                    break;

                case 9: // '\t'
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 10: // '\n'
                    participantresult = (ParticipantResult)SafeParcelReader.createParcelable(parcel, i1, ParticipantResult.CREATOR);
                    break;

                case 11: // '\013'
                    s1 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 12: // '\f'
                    s = SafeParcelReader.createString(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new ParticipantEntity(k, s4, s3, uri1, uri, j, s2, flag, playerentity, i, participantresult, s1, s);
            }
        } while (true);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public volatile Object[] newArray(int i)
    {
        return new ParticipantEntity[i];
    }
}
