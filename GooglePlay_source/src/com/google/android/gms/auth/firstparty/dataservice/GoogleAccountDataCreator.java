// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            GoogleAccountData

public final class GoogleAccountDataCreator
    implements android.os.Parcelable.Creator
{

    public GoogleAccountDataCreator()
    {
    }

    static void writeToParcel(GoogleAccountData googleaccountdata, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, googleaccountdata.version);
        SafeParcelWriter.writeString(parcel, 2, googleaccountdata.accountName, false);
        SafeParcelWriter.writeBoolean(parcel, 3, googleaccountdata.isBrowserFlowRequired);
        SafeParcelWriter.writeStringList(parcel, 4, googleaccountdata.services, false);
        SafeParcelWriter.writeString(parcel, 5, googleaccountdata.firstName, false);
        SafeParcelWriter.writeString(parcel, 6, googleaccountdata.lastName, false);
        SafeParcelWriter.writeParcelable(parcel, 7, googleaccountdata.account, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        Account account = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        String s = null;
        String s1 = null;
        java.util.ArrayList arraylist = null;
        String s2 = null;
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
                    s2 = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist = SafeParcelReader.createStringList(parcel, k);
                    break;

                case 5: // '\005'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 6: // '\006'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 7: // '\007'
                    account = (Account)SafeParcelReader.createParcelable(parcel, k, Account.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new GoogleAccountData(i, s2, flag, arraylist, s1, s, account);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new GoogleAccountData[i];
    }
}
