// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            AccountRecoveryUpdateRequest

public final class AccountRecoveryUpdateRequestCreator
    implements android.os.Parcelable.Creator
{

    public AccountRecoveryUpdateRequestCreator()
    {
    }

    static void writeToParcel(AccountRecoveryUpdateRequest accountrecoveryupdaterequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, accountrecoveryupdaterequest.version);
        SafeParcelWriter.writeString(parcel, 2, accountrecoveryupdaterequest.accountName, false);
        SafeParcelWriter.writeString(parcel, 3, accountrecoveryupdaterequest.secondaryEmail, false);
        SafeParcelWriter.writeString(parcel, 4, accountrecoveryupdaterequest.phoneNumber, false);
        SafeParcelWriter.writeString(parcel, 5, accountrecoveryupdaterequest.phoneCountryCode, false);
        SafeParcelWriter.writeBoolean(parcel, 6, accountrecoveryupdaterequest.isBroadUse);
        SafeParcelWriter.writeParcelable(parcel, 7, accountrecoveryupdaterequest.callingAppDescription, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, accountrecoveryupdaterequest.account, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        Account account = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        AppDescription appdescription = null;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
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
                    s3 = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    s2 = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 5: // '\005'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 6: // '\006'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 7: // '\007'
                    appdescription = (AppDescription)SafeParcelReader.createParcelable(parcel, k, AppDescription.CREATOR);
                    break;

                case 8: // '\b'
                    account = (Account)SafeParcelReader.createParcelable(parcel, k, Account.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AccountRecoveryUpdateRequest(i, s3, s2, s1, s, flag, appdescription, account);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AccountRecoveryUpdateRequest[i];
    }
}
