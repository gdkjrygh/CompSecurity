// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            TokenRequest

public final class TokenRequestCreator
    implements android.os.Parcelable.Creator
{

    public TokenRequestCreator()
    {
    }

    static void writeToParcel(TokenRequest tokenrequest, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, tokenrequest.version);
        SafeParcelWriter.writeString(parcel, 2, tokenrequest.service, false);
        SafeParcelWriter.writeString(parcel, 3, tokenrequest.accountName, false);
        SafeParcelWriter.writeBundle(parcel, 4, tokenrequest.options, false);
        SafeParcelWriter.writeParcelable(parcel, 5, tokenrequest.faclData, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, tokenrequest.paclData, i, false);
        SafeParcelWriter.writeBoolean(parcel, 7, tokenrequest.isAddingAccount);
        SafeParcelWriter.writeBoolean(parcel, 8, tokenrequest.isCreatingAccount);
        SafeParcelWriter.writeString(parcel, 9, tokenrequest.mConsent, false);
        SafeParcelWriter.writeParcelable(parcel, 10, tokenrequest.callingAppDescription, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, tokenrequest.optionalCaptchaSolution, i, false);
        SafeParcelWriter.writeBoolean(parcel, 13, tokenrequest.isForcingDroidguardRun);
        SafeParcelWriter.writeBoolean(parcel, 14, tokenrequest.isUsingCache);
        SafeParcelWriter.writeString(parcel, 15, tokenrequest.accountType, false);
        SafeParcelWriter.writeString(parcel, 17, tokenrequest.delegateeUserId, false);
        SafeParcelWriter.writeInt(parcel, 16, tokenrequest.delegationType);
        SafeParcelWriter.writeString(parcel, 18, tokenrequest.consentCookieWrapper, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int k = SafeParcelReader.validateObjectHeader(parcel);
        int j = 0;
        String s5 = null;
        String s4 = null;
        Bundle bundle = new Bundle();
        FACLConfig faclconfig = null;
        PACLConfig paclconfig = null;
        boolean flag3 = false;
        boolean flag2 = false;
        String s3 = TokenRequest.Consent.UNKNOWN.toString();
        AppDescription appdescription = null;
        CaptchaSolution captchasolution = null;
        boolean flag1 = false;
        boolean flag = true;
        String s2 = "com.google";
        int i = 0;
        String s1 = null;
        String s = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                case 12: // '\f'
                default:
                    SafeParcelReader.skipUnknownField(parcel, l);
                    break;

                case 1: // '\001'
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    s5 = SafeParcelReader.createString(parcel, l);
                    break;

                case 3: // '\003'
                    s4 = SafeParcelReader.createString(parcel, l);
                    break;

                case 4: // '\004'
                    bundle = SafeParcelReader.createBundle(parcel, l);
                    break;

                case 5: // '\005'
                    faclconfig = (FACLConfig)SafeParcelReader.createParcelable(parcel, l, FACLConfig.CREATOR);
                    break;

                case 6: // '\006'
                    paclconfig = (PACLConfig)SafeParcelReader.createParcelable(parcel, l, PACLConfig.CREATOR);
                    break;

                case 7: // '\007'
                    flag3 = SafeParcelReader.readBoolean(parcel, l);
                    break;

                case 8: // '\b'
                    flag2 = SafeParcelReader.readBoolean(parcel, l);
                    break;

                case 9: // '\t'
                    s3 = SafeParcelReader.createString(parcel, l);
                    break;

                case 10: // '\n'
                    appdescription = (AppDescription)SafeParcelReader.createParcelable(parcel, l, AppDescription.CREATOR);
                    break;

                case 11: // '\013'
                    captchasolution = (CaptchaSolution)SafeParcelReader.createParcelable(parcel, l, CaptchaSolution.CREATOR);
                    break;

                case 13: // '\r'
                    flag1 = SafeParcelReader.readBoolean(parcel, l);
                    break;

                case 14: // '\016'
                    flag = SafeParcelReader.readBoolean(parcel, l);
                    break;

                case 15: // '\017'
                    s2 = SafeParcelReader.createString(parcel, l);
                    break;

                case 17: // '\021'
                    s1 = SafeParcelReader.createString(parcel, l);
                    break;

                case 16: // '\020'
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 18: // '\022'
                    s = SafeParcelReader.createString(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new TokenRequest(j, s5, s4, bundle, faclconfig, paclconfig, flag3, flag2, s3, appdescription, captchasolution, flag1, flag, s2, i, s1, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new TokenRequest[i];
    }
}
