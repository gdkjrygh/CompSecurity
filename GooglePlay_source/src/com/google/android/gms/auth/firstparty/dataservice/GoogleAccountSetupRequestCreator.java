// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            GoogleAccountSetupRequest

public final class GoogleAccountSetupRequestCreator
    implements android.os.Parcelable.Creator
{

    public GoogleAccountSetupRequestCreator()
    {
    }

    static void writeToParcel(GoogleAccountSetupRequest googleaccountsetuprequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, googleaccountsetuprequest.version);
        SafeParcelWriter.writeBundle(parcel, 2, googleaccountsetuprequest.options, false);
        SafeParcelWriter.writeBoolean(parcel, 3, googleaccountsetuprequest.isAgreedToWebHistory);
        SafeParcelWriter.writeBoolean(parcel, 4, googleaccountsetuprequest.isAgreedToPersonalizedContent);
        SafeParcelWriter.writeBoolean(parcel, 5, googleaccountsetuprequest.isAgreedToMobileTos);
        SafeParcelWriter.writeString(parcel, 6, googleaccountsetuprequest.firstName, false);
        SafeParcelWriter.writeString(parcel, 7, googleaccountsetuprequest.lastName, false);
        SafeParcelWriter.writeString(parcel, 8, googleaccountsetuprequest.secondaryEmail, false);
        SafeParcelWriter.writeString(parcel, 9, googleaccountsetuprequest.gender, false);
        SafeParcelWriter.writeBoolean(parcel, 10, googleaccountsetuprequest.isCreatingAccount);
        SafeParcelWriter.writeBoolean(parcel, 11, googleaccountsetuprequest.isAddingAccount);
        SafeParcelWriter.writeBoolean(parcel, 12, googleaccountsetuprequest.isSetupWizardInProgress);
        SafeParcelWriter.writeString(parcel, 13, googleaccountsetuprequest.ropRevision, false);
        SafeParcelWriter.writeParcelable(parcel, 14, googleaccountsetuprequest.callingAppDescription, i, false);
        SafeParcelWriter.writeParcelable(parcel, 15, googleaccountsetuprequest.accountCredentials, i, false);
        SafeParcelWriter.writeString(parcel, 17, googleaccountsetuprequest.phoneNumber, false);
        SafeParcelWriter.writeParcelable(parcel, 16, googleaccountsetuprequest.optionalCaptchaSolution, i, false);
        SafeParcelWriter.writeString(parcel, 18, googleaccountsetuprequest.phoneCountryCode, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        Bundle bundle = new Bundle();
        boolean flag5 = false;
        boolean flag4 = false;
        boolean flag3 = false;
        String s6 = null;
        String s5 = null;
        String s4 = null;
        String s3 = null;
        boolean flag2 = false;
        boolean flag1 = false;
        boolean flag = false;
        String s2 = null;
        AppDescription appdescription = null;
        AccountCredentials accountcredentials = null;
        CaptchaSolution captchasolution = null;
        String s1 = null;
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
                    bundle = SafeParcelReader.createBundle(parcel, k);
                    break;

                case 3: // '\003'
                    flag5 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 4: // '\004'
                    flag4 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 5: // '\005'
                    flag3 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 6: // '\006'
                    s6 = SafeParcelReader.createString(parcel, k);
                    break;

                case 7: // '\007'
                    s5 = SafeParcelReader.createString(parcel, k);
                    break;

                case 8: // '\b'
                    s4 = SafeParcelReader.createString(parcel, k);
                    break;

                case 9: // '\t'
                    s3 = SafeParcelReader.createString(parcel, k);
                    break;

                case 10: // '\n'
                    flag2 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 11: // '\013'
                    flag1 = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 12: // '\f'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 13: // '\r'
                    s2 = SafeParcelReader.createString(parcel, k);
                    break;

                case 14: // '\016'
                    appdescription = (AppDescription)SafeParcelReader.createParcelable(parcel, k, AppDescription.CREATOR);
                    break;

                case 15: // '\017'
                    accountcredentials = (AccountCredentials)SafeParcelReader.createParcelable(parcel, k, AccountCredentials.CREATOR);
                    break;

                case 17: // '\021'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 16: // '\020'
                    captchasolution = (CaptchaSolution)SafeParcelReader.createParcelable(parcel, k, CaptchaSolution.CREATOR);
                    break;

                case 18: // '\022'
                    s = SafeParcelReader.createString(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new GoogleAccountSetupRequest(i, bundle, flag5, flag4, flag3, s6, s5, s4, s3, flag2, flag1, flag, s2, appdescription, accountcredentials, captchasolution, s1, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new GoogleAccountSetupRequest[i];
    }
}
