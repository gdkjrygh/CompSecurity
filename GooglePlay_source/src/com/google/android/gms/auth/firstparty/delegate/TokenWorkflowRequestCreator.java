// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.firstparty.delegate:
//            TokenWorkflowRequest

public final class TokenWorkflowRequestCreator
    implements android.os.Parcelable.Creator
{

    public TokenWorkflowRequestCreator()
    {
    }

    static void writeToParcel(TokenWorkflowRequest tokenworkflowrequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, tokenworkflowrequest.version);
        SafeParcelWriter.writeString(parcel, 2, tokenworkflowrequest.service, false);
        SafeParcelWriter.writeString(parcel, 3, tokenworkflowrequest.accountName, false);
        SafeParcelWriter.writeBundle(parcel, 4, tokenworkflowrequest.options, false);
        SafeParcelWriter.writeParcelable(parcel, 5, tokenworkflowrequest.faclData, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, tokenworkflowrequest.paclData, i, false);
        SafeParcelWriter.writeBoolean(parcel, 7, tokenworkflowrequest.isSuppressingProgressUx);
        SafeParcelWriter.writeParcelable(parcel, 8, tokenworkflowrequest.callingAppDescription, i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, tokenworkflowrequest.account, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, tokenworkflowrequest.amResponse, i, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        AccountAuthenticatorResponse accountauthenticatorresponse = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        Bundle bundle = new Bundle();
        Account account = null;
        AppDescription appdescription = null;
        PACLConfig paclconfig = null;
        FACLConfig faclconfig = null;
        String s = null;
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
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    bundle = SafeParcelReader.createBundle(parcel, k);
                    break;

                case 5: // '\005'
                    faclconfig = (FACLConfig)SafeParcelReader.createParcelable(parcel, k, FACLConfig.CREATOR);
                    break;

                case 6: // '\006'
                    paclconfig = (PACLConfig)SafeParcelReader.createParcelable(parcel, k, PACLConfig.CREATOR);
                    break;

                case 7: // '\007'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 8: // '\b'
                    appdescription = (AppDescription)SafeParcelReader.createParcelable(parcel, k, AppDescription.CREATOR);
                    break;

                case 9: // '\t'
                    account = (Account)SafeParcelReader.createParcelable(parcel, k, Account.CREATOR);
                    break;

                case 10: // '\n'
                    accountauthenticatorresponse = (AccountAuthenticatorResponse)SafeParcelReader.createParcelable(parcel, k, AccountAuthenticatorResponse.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new TokenWorkflowRequest(i, s1, s, bundle, faclconfig, paclconfig, flag, appdescription, account, accountauthenticatorresponse);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new TokenWorkflowRequest[i];
    }
}
