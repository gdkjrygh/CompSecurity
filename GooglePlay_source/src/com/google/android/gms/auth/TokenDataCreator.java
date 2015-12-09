// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth:
//            TokenData

public final class TokenDataCreator
    implements android.os.Parcelable.Creator
{

    public TokenDataCreator()
    {
    }

    static void writeToParcel$6d52043c(TokenData tokendata, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, tokendata.mVersionCode);
        SafeParcelWriter.writeString(parcel, 2, tokendata.mToken, false);
        SafeParcelWriter.writeLongObject$53422a(parcel, 3, tokendata.mExpirationTimeSecs);
        SafeParcelWriter.writeBoolean(parcel, 4, tokendata.mIsCached);
        SafeParcelWriter.writeBoolean(parcel, 5, tokendata.mIsSnowballed);
        SafeParcelWriter.writeStringList(parcel, 6, tokendata.mGrantedScopes, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        boolean flag = false;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        boolean flag1 = false;
        Long long1 = null;
        String s = null;
        int i = 0;
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
                    long1 = SafeParcelReader.readLongObject(parcel, k);
                    break;

                case 4: // '\004'
                    flag1 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 5: // '\005'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 6: // '\006'
                    arraylist = SafeParcelReader.createStringList(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new TokenData(i, s, long1, flag1, flag, arraylist);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new TokenData[i];
    }
}
