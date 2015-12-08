// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.firstparty.delegate:
//            SetupAccountWorkflowRequest

public final class SetupAccountWorkflowRequestCreator
    implements android.os.Parcelable.Creator
{

    public SetupAccountWorkflowRequestCreator()
    {
    }

    static void writeToParcel(SetupAccountWorkflowRequest setupaccountworkflowrequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, setupaccountworkflowrequest.version);
        SafeParcelWriter.writeBoolean(parcel, 2, setupaccountworkflowrequest.isMultiUser);
        SafeParcelWriter.writeBoolean(parcel, 3, setupaccountworkflowrequest.isSetupWizard);
        SafeParcelWriter.writeStringList(parcel, 4, setupaccountworkflowrequest.allowedDomains, false);
        SafeParcelWriter.writeBundle(parcel, 5, setupaccountworkflowrequest.options, false);
        SafeParcelWriter.writeParcelable(parcel, 6, setupaccountworkflowrequest.callingAppDescription, i, false);
        SafeParcelWriter.writeBoolean(parcel, 7, setupaccountworkflowrequest.isCreditCardAllowed);
        SafeParcelWriter.writeString(parcel, 8, setupaccountworkflowrequest.accountType, false);
        SafeParcelWriter.writeParcelable(parcel, 9, setupaccountworkflowrequest.amResponse, i, false);
        SafeParcelWriter.writeBoolean(parcel, 10, setupaccountworkflowrequest.suppressD2d);
        SafeParcelWriter.writeBoolean(parcel, 11, setupaccountworkflowrequest.useImmersiveMode);
        SafeParcelWriter.writeString(parcel, 12, setupaccountworkflowrequest.purchaserGaiaEmail, false);
        SafeParcelWriter.writeString(parcel, 13, setupaccountworkflowrequest.purchaserName, false);
        SafeParcelWriter.writeString(parcel, 14, setupaccountworkflowrequest.accountName, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        boolean flag4 = false;
        boolean flag3 = false;
        java.util.ArrayList arraylist = null;
        Bundle bundle = new Bundle();
        AppDescription appdescription = null;
        boolean flag2 = false;
        String s3 = null;
        AccountAuthenticatorResponse accountauthenticatorresponse = null;
        boolean flag1 = false;
        boolean flag = false;
        String s2 = "null";
        String s1 = "null";
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
                    flag4 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 3: // '\003'
                    flag3 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 4: // '\004'
                    arraylist = SafeParcelReader.createStringList(parcel, k);
                    break;

                case 5: // '\005'
                    bundle = SafeParcelReader.createBundle(parcel, k);
                    break;

                case 6: // '\006'
                    appdescription = (AppDescription)SafeParcelReader.createParcelable(parcel, k, AppDescription.CREATOR);
                    break;

                case 7: // '\007'
                    flag2 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 8: // '\b'
                    s3 = SafeParcelReader.createString(parcel, k);
                    break;

                case 9: // '\t'
                    accountauthenticatorresponse = (AccountAuthenticatorResponse)SafeParcelReader.createParcelable(parcel, k, AccountAuthenticatorResponse.CREATOR);
                    break;

                case 10: // '\n'
                    flag1 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 11: // '\013'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 12: // '\f'
                    s2 = SafeParcelReader.createString(parcel, k);
                    break;

                case 13: // '\r'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 14: // '\016'
                    s = SafeParcelReader.createString(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new SetupAccountWorkflowRequest(i, flag4, flag3, arraylist, bundle, appdescription, flag2, s3, accountauthenticatorresponse, flag1, flag, s2, s1, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new SetupAccountWorkflowRequest[i];
    }
}
