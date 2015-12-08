// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.firstparty.delegate:
//            UpdateCredentialsWorkflowRequest

public final class UpdateCredentialsWorkflowRequestCreator
    implements android.os.Parcelable.Creator
{

    public UpdateCredentialsWorkflowRequestCreator()
    {
    }

    static void writeToParcel(UpdateCredentialsWorkflowRequest updatecredentialsworkflowrequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, updatecredentialsworkflowrequest.version);
        SafeParcelWriter.writeString(parcel, 2, updatecredentialsworkflowrequest.accountName, false);
        SafeParcelWriter.writeParcelable(parcel, 3, updatecredentialsworkflowrequest.callingAppDescription, i, false);
        SafeParcelWriter.writeBundle(parcel, 4, updatecredentialsworkflowrequest.options, false);
        SafeParcelWriter.writeParcelable(parcel, 5, updatecredentialsworkflowrequest.account, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, updatecredentialsworkflowrequest.amResponse, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        AccountAuthenticatorResponse accountauthenticatorresponse = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        Bundle bundle = new Bundle();
        Account account = null;
        AppDescription appdescription = null;
        String s = null;
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
                    appdescription = (AppDescription)SafeParcelReader.createParcelable(parcel, k, AppDescription.CREATOR);
                    break;

                case 4: // '\004'
                    bundle = SafeParcelReader.createBundle(parcel, k);
                    break;

                case 5: // '\005'
                    account = (Account)SafeParcelReader.createParcelable(parcel, k, Account.CREATOR);
                    break;

                case 6: // '\006'
                    accountauthenticatorresponse = (AccountAuthenticatorResponse)SafeParcelReader.createParcelable(parcel, k, AccountAuthenticatorResponse.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new UpdateCredentialsWorkflowRequest(i, s, appdescription, bundle, account, accountauthenticatorresponse);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new UpdateCredentialsWorkflowRequest[i];
    }
}
