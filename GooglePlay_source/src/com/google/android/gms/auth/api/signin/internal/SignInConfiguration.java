// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.EmailSignInOptions;
import com.google.android.gms.auth.api.signin.FacebookSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.api.signin.internal:
//            SignInConfigurationCreator, HashAccumulator

public final class SignInConfiguration
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new SignInConfigurationCreator();
    String mApiKey;
    final String mConsumerPkgName;
    EmailSignInOptions mEmailSignInOptions;
    FacebookSignInOptions mFacebookSignInOptions;
    GoogleSignInOptions mGoogleSignInOptions;
    String mServerClientId;
    final int versionCode;

    SignInConfiguration(int i, String s, String s1, EmailSignInOptions emailsigninoptions, GoogleSignInOptions googlesigninoptions, FacebookSignInOptions facebooksigninoptions, String s2)
    {
        versionCode = i;
        mConsumerPkgName = Preconditions.checkNotEmpty(s);
        mServerClientId = s1;
        mEmailSignInOptions = emailsigninoptions;
        mGoogleSignInOptions = googlesigninoptions;
        mFacebookSignInOptions = facebooksigninoptions;
        mApiKey = s2;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (!mConsumerPkgName.equals(((SignInConfiguration) (obj = (SignInConfiguration)obj)).mConsumerPkgName)) goto _L1; else goto _L3
_L3:
        if (!TextUtils.isEmpty(mServerClientId)) goto _L5; else goto _L4
_L4:
        if (!TextUtils.isEmpty(((SignInConfiguration) (obj)).mServerClientId)) goto _L1; else goto _L6
_L6:
        if (!TextUtils.isEmpty(mApiKey)) goto _L8; else goto _L7
_L7:
        if (!TextUtils.isEmpty(((SignInConfiguration) (obj)).mApiKey))
        {
            break; /* Loop/switch isn't completed */
        }
_L15:
        if (mEmailSignInOptions != null) goto _L10; else goto _L9
_L9:
        if (((SignInConfiguration) (obj)).mEmailSignInOptions != null)
        {
            break; /* Loop/switch isn't completed */
        }
_L17:
        if (mFacebookSignInOptions != null) goto _L12; else goto _L11
_L11:
        if (((SignInConfiguration) (obj)).mFacebookSignInOptions != null)
        {
            break; /* Loop/switch isn't completed */
        }
          goto _L13
_L5:
        if (!mServerClientId.equals(((SignInConfiguration) (obj)).mServerClientId)) goto _L14; else goto _L6
_L14:
        break; /* Loop/switch isn't completed */
_L8:
        if (!mApiKey.equals(((SignInConfiguration) (obj)).mApiKey)) goto _L16; else goto _L15
_L16:
        break; /* Loop/switch isn't completed */
_L10:
        if (!mEmailSignInOptions.equals(((SignInConfiguration) (obj)).mEmailSignInOptions)) goto _L18; else goto _L17
_L18:
        break; /* Loop/switch isn't completed */
_L12:
        if (!mFacebookSignInOptions.equals(((SignInConfiguration) (obj)).mFacebookSignInOptions)) goto _L1; else goto _L13
_L13:
        if (mGoogleSignInOptions == null)
        {
            if (((SignInConfiguration) (obj)).mGoogleSignInOptions != null)
            {
                break; /* Loop/switch isn't completed */
            }
            break; /* Loop/switch isn't completed */
        }
        boolean flag;
        try
        {
            flag = mGoogleSignInOptions.equals(((SignInConfiguration) (obj)).mGoogleSignInOptions);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        if (!flag) goto _L1; else goto _L19
_L19:
        return true;
    }

    public final int hashCode()
    {
        return (new HashAccumulator()).addObject(mConsumerPkgName).addObject(mServerClientId).addObject(mApiKey).addObject(mEmailSignInOptions).addObject(mGoogleSignInOptions).addObject(mFacebookSignInOptions).mHash;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        SignInConfigurationCreator.writeToParcel(this, parcel, i);
    }

}
