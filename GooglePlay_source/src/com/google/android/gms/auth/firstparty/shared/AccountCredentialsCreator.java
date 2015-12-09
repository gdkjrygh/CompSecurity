// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            AccountCredentials

public final class AccountCredentialsCreator
    implements android.os.Parcelable.Creator
{

    public AccountCredentialsCreator()
    {
    }

    static void writeToParcel$3586f79d(AccountCredentials accountcredentials, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, accountcredentials.version);
        SafeParcelWriter.writeBoolean(parcel, 2, accountcredentials.mIsBrowserRequired);
        SafeParcelWriter.writeString(parcel, 3, accountcredentials.mAccountName, false);
        SafeParcelWriter.writeString(parcel, 4, accountcredentials.mLongLivedLoginToken, false);
        SafeParcelWriter.writeString(parcel, 5, accountcredentials.mAuthorizationCode, false);
        SafeParcelWriter.writeString(parcel, 6, accountcredentials.mPassword, false);
        SafeParcelWriter.writeString(parcel, 7, accountcredentials.mVerifier, false);
        SafeParcelWriter.writeString(parcel, 8, accountcredentials.mRedirectUri, false);
        SafeParcelWriter.writeString(parcel, 9, accountcredentials.mAccountType, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        String s1 = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        String s = "com.google";
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
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
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 3: // '\003'
                    s6 = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    s5 = SafeParcelReader.createString(parcel, k);
                    break;

                case 5: // '\005'
                    s4 = SafeParcelReader.createString(parcel, k);
                    break;

                case 6: // '\006'
                    s3 = SafeParcelReader.createString(parcel, k);
                    break;

                case 7: // '\007'
                    s2 = SafeParcelReader.createString(parcel, k);
                    break;

                case 8: // '\b'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 9: // '\t'
                    s = SafeParcelReader.createString(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AccountCredentials(i, flag, s6, s5, s4, s3, s2, s1, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AccountCredentials[i];
    }
}
