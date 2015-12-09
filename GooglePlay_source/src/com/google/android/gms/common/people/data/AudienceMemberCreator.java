// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.people.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.common.people.data:
//            AudienceMember

public final class AudienceMemberCreator
    implements android.os.Parcelable.Creator
{

    public AudienceMemberCreator()
    {
    }

    static void writeToParcel$4b7b3a63(AudienceMember audiencemember, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, audiencemember.mType);
        SafeParcelWriter.writeInt(parcel, 1000, audiencemember.mVersionCode);
        SafeParcelWriter.writeInt(parcel, 2, audiencemember.mCircleType);
        SafeParcelWriter.writeString(parcel, 3, audiencemember.mCircleId, false);
        SafeParcelWriter.writeString(parcel, 4, audiencemember.mPeopleQualifiedId, false);
        SafeParcelWriter.writeString(parcel, 5, audiencemember.mDisplayName, false);
        SafeParcelWriter.writeString(parcel, 6, audiencemember.mAvatarUrl, false);
        SafeParcelWriter.writeBundle(parcel, 7, audiencemember.mMetadata, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        android.os.Bundle bundle = null;
        int l = SafeParcelReader.validateObjectHeader(parcel);
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        int j = 0;
        int k = 0;
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
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 1000: 
                    k = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 2: // '\002'
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 3: // '\003'
                    s3 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 4: // '\004'
                    s2 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 5: // '\005'
                    s1 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 6: // '\006'
                    s = SafeParcelReader.createString(parcel, i1);
                    break;

                case 7: // '\007'
                    bundle = SafeParcelReader.createBundle(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new AudienceMember(k, j, i, s3, s2, s1, s, bundle);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AudienceMember[i];
    }
}
