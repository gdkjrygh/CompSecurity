// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.quest;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.games.quest:
//            MilestoneEntity

public final class MilestoneEntityCreator
    implements android.os.Parcelable.Creator
{

    public MilestoneEntityCreator()
    {
    }

    static void writeToParcel$57c02454(MilestoneEntity milestoneentity, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeString(parcel, 1, milestoneentity.mMilestoneId, false);
        SafeParcelWriter.writeInt(parcel, 1000, milestoneentity.mVersionCode);
        SafeParcelWriter.writeLong(parcel, 2, milestoneentity.mCurrentProgress);
        SafeParcelWriter.writeLong(parcel, 3, milestoneentity.mTargetProgress);
        SafeParcelWriter.writeByteArray(parcel, 4, milestoneentity.mCompletionBlob, false);
        SafeParcelWriter.writeInt(parcel, 5, milestoneentity.mState);
        SafeParcelWriter.writeString(parcel, 6, milestoneentity.mEventId, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        long l1 = 0L;
        int i = 0;
        String s = null;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        byte abyte0[] = null;
        long l2 = 0L;
        String s1 = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, l);
                    break;

                case 1: // '\001'
                    s1 = SafeParcelReader.createString(parcel, l);
                    break;

                case 1000: 
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    l2 = SafeParcelReader.readLong(parcel, l);
                    break;

                case 3: // '\003'
                    l1 = SafeParcelReader.readLong(parcel, l);
                    break;

                case 4: // '\004'
                    abyte0 = SafeParcelReader.createByteArray(parcel, l);
                    break;

                case 5: // '\005'
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 6: // '\006'
                    s = SafeParcelReader.createString(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new MilestoneEntity(j, s1, l2, l1, abyte0, i, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new MilestoneEntity[i];
    }
}
