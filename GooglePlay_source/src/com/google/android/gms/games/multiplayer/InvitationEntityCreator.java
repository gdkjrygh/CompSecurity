// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.GameEntity;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            InvitationEntity, ParticipantEntity

public class InvitationEntityCreator
    implements android.os.Parcelable.Creator
{

    public InvitationEntityCreator()
    {
    }

    static void writeToParcel(InvitationEntity invitationentity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeParcelable(parcel, 1, invitationentity.mGame, i, false);
        SafeParcelWriter.writeInt(parcel, 1000, invitationentity.mVersionCode);
        SafeParcelWriter.writeString(parcel, 2, invitationentity.mInvitationId, false);
        SafeParcelWriter.writeLong(parcel, 3, invitationentity.mCreationTimestamp);
        SafeParcelWriter.writeInt(parcel, 4, invitationentity.mInvitationType);
        SafeParcelWriter.writeParcelable(parcel, 5, invitationentity.mInviter, i, false);
        SafeParcelWriter.writeTypedList(parcel, 6, invitationentity.getParticipants(), false);
        SafeParcelWriter.writeInt(parcel, 7, invitationentity.mVariant);
        SafeParcelWriter.writeInt(parcel, 8, invitationentity.mAvailableAutoMatchSlots);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public InvitationEntity createFromParcel(Parcel parcel)
    {
        int i1 = SafeParcelReader.validateObjectHeader(parcel);
        int l = 0;
        GameEntity gameentity = null;
        String s = null;
        long l1 = 0L;
        int k = 0;
        ParticipantEntity participantentity = null;
        java.util.ArrayList arraylist = null;
        int j = 0;
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
                    gameentity = (GameEntity)SafeParcelReader.createParcelable(parcel, j1, GameEntity.CREATOR);
                    break;

                case 1000: 
                    l = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 2: // '\002'
                    s = SafeParcelReader.createString(parcel, j1);
                    break;

                case 3: // '\003'
                    l1 = SafeParcelReader.readLong(parcel, j1);
                    break;

                case 4: // '\004'
                    k = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 5: // '\005'
                    participantentity = (ParticipantEntity)SafeParcelReader.createParcelable(parcel, j1, ParticipantEntity.CREATOR);
                    break;

                case 6: // '\006'
                    arraylist = SafeParcelReader.createTypedList(parcel, j1, ParticipantEntity.CREATOR);
                    break;

                case 7: // '\007'
                    j = SafeParcelReader.readInt(parcel, j1);
                    break;

                case 8: // '\b'
                    i = SafeParcelReader.readInt(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i1)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(i1).toString(), parcel);
            } else
            {
                return new InvitationEntity(l, gameentity, s, l1, k, participantentity, arraylist, j, i);
            }
        } while (true);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public volatile Object[] newArray(int i)
    {
        return new InvitationEntity[i];
    }
}
