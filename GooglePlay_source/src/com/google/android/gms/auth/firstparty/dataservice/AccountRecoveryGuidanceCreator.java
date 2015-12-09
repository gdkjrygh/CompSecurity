// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            AccountRecoveryGuidance

public final class AccountRecoveryGuidanceCreator
    implements android.os.Parcelable.Creator
{

    public AccountRecoveryGuidanceCreator()
    {
    }

    static void writeToParcel(AccountRecoveryGuidance accountrecoveryguidance, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, accountrecoveryguidance.version);
        SafeParcelWriter.writeString(parcel, 2, accountrecoveryguidance.accountName, false);
        SafeParcelWriter.writeBoolean(parcel, 3, accountrecoveryguidance.isRecoveryInfoNeeded);
        SafeParcelWriter.writeBoolean(parcel, 4, accountrecoveryguidance.isRecoveryInterstitialSuggested);
        SafeParcelWriter.writeBoolean(parcel, 5, accountrecoveryguidance.isRecoveryUpdateAllowed);
        SafeParcelWriter.writeParcelable(parcel, 6, accountrecoveryguidance.account, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        Account account = null;
        boolean flag = false;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        boolean flag1 = false;
        boolean flag2 = false;
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
                    flag2 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 4: // '\004'
                    flag1 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 5: // '\005'
                    flag = SafeParcelReader.readBoolean(parcel, k);
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
                return new AccountRecoveryGuidance(i, s, flag2, flag1, flag, account);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AccountRecoveryGuidance[i];
    }
}
