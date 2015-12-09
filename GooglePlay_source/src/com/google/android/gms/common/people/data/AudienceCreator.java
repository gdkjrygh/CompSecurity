// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.people.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.common.people.data:
//            Audience, AudienceMember

public final class AudienceCreator
    implements android.os.Parcelable.Creator
{

    public AudienceCreator()
    {
    }

    static void writeToParcel$72b4f457(Audience audience, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeTypedList(parcel, 1, audience.mAudienceMembers, false);
        SafeParcelWriter.writeInt(parcel, 1000, audience.mVersionCode);
        SafeParcelWriter.writeInt(parcel, 2, audience.mDomainRestricted);
        SafeParcelWriter.writeBoolean(parcel, 3, audience.mIsFullyUnderstood);
        SafeParcelWriter.writeBoolean(parcel, 4, audience.mReadOnly);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        java.util.ArrayList arraylist = null;
        boolean flag1 = false;
        int i = 0;
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
                    arraylist = SafeParcelReader.createTypedList(parcel, l, AudienceMember.CREATOR);
                    break;

                case 1000: 
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 3: // '\003'
                    flag1 = SafeParcelReader.readBoolean(parcel, l);
                    break;

                case 4: // '\004'
                    flag = SafeParcelReader.readBoolean(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new Audience(j, arraylist, i, flag1, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new Audience[i];
    }
}
