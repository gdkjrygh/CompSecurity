// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.proximity.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.firstparty.proximity.data:
//            AuthorizationRequest

public final class AuthorizationRequestCreator
    implements android.os.Parcelable.Creator
{

    public AuthorizationRequestCreator()
    {
    }

    static void writeToParcel$584189b5(AuthorizationRequest authorizationrequest, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, authorizationrequest.mVersion);
        SafeParcelWriter.writeString(parcel, 2, authorizationrequest.mPermitId, false);
        SafeParcelWriter.writeString(parcel, 3, authorizationrequest.mPermitAccessId, false);
        SafeParcelWriter.writeByteArray(parcel, 4, authorizationrequest.mData, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        byte abyte0[] = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        String s = null;
        int i = 0;
        String s1 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    abyte0 = SafeParcelReader.createByteArray(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AuthorizationRequest(i, s, s1, abyte0);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AuthorizationRequest[i];
    }
}
