// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            ParticipantResult

public final class ParticipantResultCreator
    implements android.os.Parcelable.Creator
{

    public ParticipantResultCreator()
    {
    }

    static void writeToParcel$56aede97(ParticipantResult participantresult, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeString(parcel, 1, participantresult.mParticipantId, false);
        SafeParcelWriter.writeInt(parcel, 1000, participantresult.mVersionCode);
        SafeParcelWriter.writeInt(parcel, 2, participantresult.mResult);
        SafeParcelWriter.writeInt(parcel, 3, participantresult.mPlacing);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int k = 0;
        int l = SafeParcelReader.validateObjectHeader(parcel);
        String s = null;
        int i = 0;
        int j = 0;
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
                    s = SafeParcelReader.createString(parcel, i1);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 2: // '\002'
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 3: // '\003'
                    k = SafeParcelReader.readInt(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new ParticipantResult(i, s, j, k);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ParticipantResult[i];
    }
}
