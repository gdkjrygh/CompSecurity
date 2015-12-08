// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//            SignInAccount, GoogleSignInAccount

public final class SignInAccountCreator
    implements android.os.Parcelable.Creator
{

    public SignInAccountCreator()
    {
    }

    static void writeToParcel(SignInAccount signinaccount, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, signinaccount.versionCode);
        SafeParcelWriter.writeString(parcel, 2, signinaccount.mProviderId, false);
        SafeParcelWriter.writeString(parcel, 3, signinaccount.mIdToken, false);
        SafeParcelWriter.writeString(parcel, 4, signinaccount.mEmail, false);
        SafeParcelWriter.writeString(parcel, 5, signinaccount.mDisplayName, false);
        SafeParcelWriter.writeParcelable(parcel, 6, signinaccount.mPhotoUrl, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, signinaccount.mGoogleSignInAccount, i, false);
        SafeParcelWriter.writeString(parcel, 8, signinaccount.mUserId, false);
        SafeParcelWriter.writeString(parcel, 9, signinaccount.mRefreshToken, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        String s1 = "";
        GoogleSignInAccount googlesigninaccount = null;
        Uri uri = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
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
                    s5 = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    s4 = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    s3 = SafeParcelReader.createString(parcel, k);
                    break;

                case 5: // '\005'
                    s2 = SafeParcelReader.createString(parcel, k);
                    break;

                case 6: // '\006'
                    uri = (Uri)SafeParcelReader.createParcelable(parcel, k, Uri.CREATOR);
                    break;

                case 7: // '\007'
                    googlesigninaccount = (GoogleSignInAccount)SafeParcelReader.createParcelable(parcel, k, GoogleSignInAccount.CREATOR);
                    break;

                case 8: // '\b'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 9: // '\t'
                    s = SafeParcelReader.createString(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new SignInAccount(i, s5, s4, s3, s2, uri, googlesigninaccount, s1, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new SignInAccount[i];
    }
}
