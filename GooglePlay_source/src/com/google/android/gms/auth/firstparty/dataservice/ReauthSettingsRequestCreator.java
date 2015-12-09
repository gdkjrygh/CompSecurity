// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            ReauthSettingsRequest

public final class ReauthSettingsRequestCreator
    implements android.os.Parcelable.Creator
{

    public ReauthSettingsRequestCreator()
    {
    }

    static void writeToParcel(ReauthSettingsRequest reauthsettingsrequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, reauthsettingsrequest.version);
        SafeParcelWriter.writeString(parcel, 2, reauthsettingsrequest.accountName, false);
        SafeParcelWriter.writeBoolean(parcel, 3, reauthsettingsrequest.force);
        SafeParcelWriter.writeParcelable(parcel, 4, reauthsettingsrequest.account, i, false);
        SafeParcelWriter.writeString(parcel, 5, reauthsettingsrequest.callingPackageName, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        Account account = null;
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
                    account = (Account)SafeParcelReader.createParcelable(parcel, k, Account.CREATOR);
                    break;

                case 5: // '\005'
                    s = SafeParcelReader.createString(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ReauthSettingsRequest(i, s1, flag, account, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ReauthSettingsRequest[i];
    }
}
