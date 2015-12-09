// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import com.google.android.gms.auth.firstparty.shared.ScopeDetail;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            TokenResponse, PostSignInData

public final class TokenResponseCreator
    implements android.os.Parcelable.Creator
{

    public TokenResponseCreator()
    {
    }

    static void writeToParcel(TokenResponse tokenresponse, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, tokenresponse.version);
        SafeParcelWriter.writeString(parcel, 2, tokenresponse.accountName, false);
        SafeParcelWriter.writeString(parcel, 3, tokenresponse.statusWireCode, false);
        SafeParcelWriter.writeString(parcel, 4, tokenresponse.token, false);
        SafeParcelWriter.writeString(parcel, 5, tokenresponse.signInUrl, false);
        SafeParcelWriter.writeString(parcel, 6, tokenresponse.detail, false);
        SafeParcelWriter.writeString(parcel, 7, tokenresponse.picasaUser, false);
        SafeParcelWriter.writeString(parcel, 8, tokenresponse.firstName, false);
        SafeParcelWriter.writeString(parcel, 9, tokenresponse.lastName, false);
        SafeParcelWriter.writeBoolean(parcel, 10, tokenresponse.isGPlusServiceAllowed);
        SafeParcelWriter.writeBoolean(parcel, 11, tokenresponse.isGPlusServiceEnabled);
        SafeParcelWriter.writeBoolean(parcel, 12, tokenresponse.isEsMobileServiceEnabled);
        SafeParcelWriter.writeBoolean(parcel, 13, tokenresponse.isBrowserSignInSuggested);
        SafeParcelWriter.writeParcelable(parcel, 14, tokenresponse.captcha, i, false);
        SafeParcelWriter.writeTypedList(parcel, 15, tokenresponse.scopeData, false);
        SafeParcelWriter.writeString(parcel, 17, tokenresponse.ropRevision, false);
        SafeParcelWriter.writeString(parcel, 16, tokenresponse.ropText, false);
        SafeParcelWriter.writeBoolean(parcel, 19, tokenresponse.hasTitle);
        SafeParcelWriter.writeParcelable(parcel, 21, tokenresponse.postSignInData, i, false);
        SafeParcelWriter.writeInt(parcel, 20, tokenresponse.title);
        SafeParcelWriter.writeParcelable(parcel, 22, tokenresponse.account, i, false);
        SafeParcelWriter.writeParcelable(parcel, 27, tokenresponse.tokenData, i, false);
        SafeParcelWriter.writeString(parcel, 26, tokenresponse.dmStatus, false);
        SafeParcelWriter.writeString(parcel, 29, tokenresponse.consentCookieWrapper, false);
        SafeParcelWriter.writeBundle(parcel, 28, tokenresponse.dataForLogging, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int k = SafeParcelReader.validateObjectHeader(parcel);
        int j = 0;
        String s11 = null;
        String s10 = null;
        String s9 = null;
        String s8 = null;
        String s7 = null;
        String s6 = null;
        String s5 = null;
        String s4 = null;
        boolean flag4 = false;
        boolean flag3 = false;
        boolean flag2 = false;
        boolean flag1 = false;
        CaptchaChallenge captchachallenge = null;
        ArrayList arraylist = new ArrayList();
        String s3 = null;
        String s2 = null;
        boolean flag = false;
        int i = 0;
        PostSignInData postsignindata = null;
        Account account = null;
        String s1 = null;
        TokenData tokendata = null;
        Bundle bundle = new Bundle();
        String s = null;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                case 18: // '\022'
                case 23: // '\027'
                case 24: // '\030'
                case 25: // '\031'
                default:
                    SafeParcelReader.skipUnknownField(parcel, l);
                    break;

                case 1: // '\001'
                    j = SafeParcelReader.readInt(parcel, l);
                    break;

                case 2: // '\002'
                    s11 = SafeParcelReader.createString(parcel, l);
                    break;

                case 3: // '\003'
                    s10 = SafeParcelReader.createString(parcel, l);
                    break;

                case 4: // '\004'
                    s9 = SafeParcelReader.createString(parcel, l);
                    break;

                case 5: // '\005'
                    s8 = SafeParcelReader.createString(parcel, l);
                    break;

                case 6: // '\006'
                    s7 = SafeParcelReader.createString(parcel, l);
                    break;

                case 7: // '\007'
                    s6 = SafeParcelReader.createString(parcel, l);
                    break;

                case 8: // '\b'
                    s5 = SafeParcelReader.createString(parcel, l);
                    break;

                case 9: // '\t'
                    s4 = SafeParcelReader.createString(parcel, l);
                    break;

                case 10: // '\n'
                    flag4 = SafeParcelReader.readBoolean(parcel, l);
                    break;

                case 11: // '\013'
                    flag3 = SafeParcelReader.readBoolean(parcel, l);
                    break;

                case 12: // '\f'
                    flag2 = SafeParcelReader.readBoolean(parcel, l);
                    break;

                case 13: // '\r'
                    flag1 = SafeParcelReader.readBoolean(parcel, l);
                    break;

                case 14: // '\016'
                    captchachallenge = (CaptchaChallenge)SafeParcelReader.createParcelable(parcel, l, CaptchaChallenge.CREATOR);
                    break;

                case 15: // '\017'
                    arraylist = SafeParcelReader.createTypedList(parcel, l, ScopeDetail.CREATOR);
                    break;

                case 17: // '\021'
                    s2 = SafeParcelReader.createString(parcel, l);
                    break;

                case 16: // '\020'
                    s3 = SafeParcelReader.createString(parcel, l);
                    break;

                case 19: // '\023'
                    flag = SafeParcelReader.readBoolean(parcel, l);
                    break;

                case 21: // '\025'
                    postsignindata = (PostSignInData)SafeParcelReader.createParcelable(parcel, l, PostSignInData.CREATOR);
                    break;

                case 20: // '\024'
                    i = SafeParcelReader.readInt(parcel, l);
                    break;

                case 22: // '\026'
                    account = (Account)SafeParcelReader.createParcelable(parcel, l, Account.CREATOR);
                    break;

                case 27: // '\033'
                    tokendata = (TokenData)SafeParcelReader.createParcelable(parcel, l, TokenData.CREATOR);
                    break;

                case 26: // '\032'
                    s1 = SafeParcelReader.createString(parcel, l);
                    break;

                case 29: // '\035'
                    s = SafeParcelReader.createString(parcel, l);
                    break;

                case 28: // '\034'
                    bundle = SafeParcelReader.createBundle(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new TokenResponse(j, s11, s10, s9, s8, s7, s6, s5, s4, flag4, flag3, flag2, flag1, captchachallenge, arraylist, s3, s2, flag, i, postsignindata, account, s1, tokendata, bundle, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new TokenResponse[i];
    }
}
