// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.auth.Country;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            AccountRecoveryData, AccountRecoveryGuidance

public final class AccountRecoveryDataCreator
    implements android.os.Parcelable.Creator
{

    public AccountRecoveryDataCreator()
    {
    }

    static void writeToParcel(AccountRecoveryData accountrecoverydata, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, accountrecoverydata.version);
        SafeParcelWriter.writeParcelable(parcel, 2, accountrecoverydata.guidance, i, false);
        SafeParcelWriter.writeString(parcel, 3, accountrecoverydata.action, false);
        SafeParcelWriter.writeString(parcel, 4, accountrecoverydata.allowedRecoveryOption, false);
        SafeParcelWriter.writeString(parcel, 5, accountrecoverydata.accountName, false);
        SafeParcelWriter.writeString(parcel, 6, accountrecoverydata.secondaryEmail, false);
        SafeParcelWriter.writeString(parcel, 7, accountrecoverydata.phoneNumber, false);
        SafeParcelWriter.writeTypedList(parcel, 8, accountrecoverydata.countries, false);
        SafeParcelWriter.writeString(parcel, 9, accountrecoverydata.defaultCountryCode, false);
        SafeParcelWriter.writeString(parcel, 10, accountrecoverydata.error, false);
        SafeParcelWriter.writeParcelable(parcel, 11, accountrecoverydata.account, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        Account account = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        String s = null;
        String s1 = null;
        java.util.ArrayList arraylist = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        String s6 = null;
        AccountRecoveryGuidance accountrecoveryguidance = null;
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
                    accountrecoveryguidance = (AccountRecoveryGuidance)SafeParcelReader.createParcelable(parcel, k, AccountRecoveryGuidance.CREATOR);
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
                    arraylist = SafeParcelReader.createTypedList(parcel, k, Country.CREATOR);
                    break;

                case 9: // '\t'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 10: // '\n'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 11: // '\013'
                    account = (Account)SafeParcelReader.createParcelable(parcel, k, Account.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AccountRecoveryData(i, accountrecoveryguidance, s6, s5, s4, s3, s2, arraylist, s1, s, account);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AccountRecoveryData[i];
    }
}
