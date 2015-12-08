// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.EmailSignInOptions;
import com.google.android.gms.auth.api.signin.FacebookSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.api.signin.internal:
//            SignInConfiguration

public final class SignInConfigurationCreator
    implements android.os.Parcelable.Creator
{

    public SignInConfigurationCreator()
    {
    }

    static void writeToParcel(SignInConfiguration signinconfiguration, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, signinconfiguration.versionCode);
        SafeParcelWriter.writeString(parcel, 2, signinconfiguration.mConsumerPkgName, false);
        SafeParcelWriter.writeString(parcel, 3, signinconfiguration.mServerClientId, false);
        SafeParcelWriter.writeParcelable(parcel, 4, signinconfiguration.mEmailSignInOptions, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, signinconfiguration.mGoogleSignInOptions, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, signinconfiguration.mFacebookSignInOptions, i, false);
        SafeParcelWriter.writeString(parcel, 7, signinconfiguration.mApiKey, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        FacebookSignInOptions facebooksigninoptions = null;
        GoogleSignInOptions googlesigninoptions = null;
        EmailSignInOptions emailsigninoptions = null;
        String s1 = null;
        String s2 = null;
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
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    emailsigninoptions = (EmailSignInOptions)SafeParcelReader.createParcelable(parcel, k, EmailSignInOptions.CREATOR);
                    break;

                case 5: // '\005'
                    googlesigninoptions = (GoogleSignInOptions)SafeParcelReader.createParcelable(parcel, k, GoogleSignInOptions.CREATOR);
                    break;

                case 6: // '\006'
                    facebooksigninoptions = (FacebookSignInOptions)SafeParcelReader.createParcelable(parcel, k, FacebookSignInOptions.CREATOR);
                    break;

                case 7: // '\007'
                    s = SafeParcelReader.createString(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new SignInConfiguration(i, s2, s1, emailsigninoptions, googlesigninoptions, facebooksigninoptions, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new SignInConfiguration[i];
    }
}
