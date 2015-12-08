// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//            SignInAccountCreator, GoogleSignInAccount

public class SignInAccount
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new SignInAccountCreator();
    String mDisplayName;
    String mEmail;
    GoogleSignInAccount mGoogleSignInAccount;
    String mIdToken;
    Uri mPhotoUrl;
    String mProviderId;
    String mRefreshToken;
    String mUserId;
    final int versionCode;

    SignInAccount(int i, String s, String s1, String s2, String s3, Uri uri, GoogleSignInAccount googlesigninaccount, 
            String s4, String s5)
    {
        versionCode = i;
        mEmail = Preconditions.checkNotEmpty(s2, "Email cannot be empty.");
        mDisplayName = s3;
        mPhotoUrl = uri;
        mProviderId = s;
        mIdToken = s1;
        mGoogleSignInAccount = googlesigninaccount;
        mUserId = Preconditions.checkNotEmpty(s4);
        mRefreshToken = s5;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        SignInAccountCreator.writeToParcel(this, parcel, i);
    }

}
