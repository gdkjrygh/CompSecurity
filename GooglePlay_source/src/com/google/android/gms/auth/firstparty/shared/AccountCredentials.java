// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            AccountCredentialsCreator

public class AccountCredentials
    implements SafeParcelable
{

    public static final AccountCredentialsCreator CREATOR = new AccountCredentialsCreator();
    String mAccountName;
    final String mAccountType;
    String mAuthorizationCode;
    boolean mIsBrowserRequired;
    String mLongLivedLoginToken;
    String mPassword;
    String mRedirectUri;
    String mVerifier;
    final int version;

    public AccountCredentials()
    {
        this("com.google");
    }

    AccountCredentials(int i, boolean flag, String s, String s1, String s2, String s3, String s4, 
            String s5, String s6)
    {
        version = i;
        mIsBrowserRequired = flag;
        mAccountName = s;
        mLongLivedLoginToken = s1;
        mAuthorizationCode = s2;
        mPassword = s3;
        mVerifier = s4;
        mRedirectUri = s5;
        mAccountType = s6;
    }

    private AccountCredentials(String s)
    {
        version = 2;
        mAccountType = Preconditions.checkNotEmpty(s, "Account type can't be empty.");
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AccountCredentialsCreator.writeToParcel$3586f79d(this, parcel);
    }

}
