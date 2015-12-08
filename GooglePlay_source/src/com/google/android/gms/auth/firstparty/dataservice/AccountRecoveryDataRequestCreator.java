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
//            AccountRecoveryDataRequest

public final class AccountRecoveryDataRequestCreator
    implements android.os.Parcelable.Creator
{

    public AccountRecoveryDataRequestCreator()
    {
    }

    static void writeToParcel(AccountRecoveryDataRequest accountrecoverydatarequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, accountrecoverydatarequest.version);
        SafeParcelWriter.writeString(parcel, 2, accountrecoverydatarequest.accountName, false);
        SafeParcelWriter.writeBoolean(parcel, 3, accountrecoverydatarequest.isClearUpdateSuggested);
        SafeParcelWriter.writeParcelable(parcel, 4, accountrecoverydatarequest.callingAppDescription, i, false);
        SafeParcelWriter.writeString(parcel, 5, accountrecoverydatarequest.requestDescription, false);
        SafeParcelWriter.writeParcelable(parcel, 6, accountrecoverydatarequest.account, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        Account account = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        String s = null;
        AppDescription appdescription = null;
        String s1 = null;
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
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 4: // '\004'
                    appdescription = (AppDescription)SafeParcelReader.createParcelable(parcel, k, AppDescription.CREATOR);
                    break;

                case 5: // '\005'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 6: // '\006'
                    account = (Account)SafeParcelReader.createParcelable(parcel, k, Account.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AccountRecoveryDataRequest(i, s1, flag, appdescription, s, account);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AccountRecoveryDataRequest[i];
    }
}
