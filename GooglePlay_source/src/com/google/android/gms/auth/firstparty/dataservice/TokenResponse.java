// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            TokenResponseCreator, PostSignInData

public class TokenResponse
    implements SafeParcelable
{

    public static final TokenResponseCreator CREATOR = new TokenResponseCreator();
    Account account;
    String accountName;
    CaptchaChallenge captcha;
    String consentCookieWrapper;
    Bundle dataForLogging;
    String detail;
    String dmStatus;
    String firstName;
    boolean hasTitle;
    boolean isBrowserSignInSuggested;
    boolean isEsMobileServiceEnabled;
    boolean isGPlusServiceAllowed;
    boolean isGPlusServiceEnabled;
    String lastName;
    String picasaUser;
    PostSignInData postSignInData;
    String ropRevision;
    String ropText;
    List scopeData;
    String signInUrl;
    String statusWireCode;
    int title;
    String token;
    TokenData tokenData;
    final int version;

    public TokenResponse()
    {
        dataForLogging = new Bundle();
        version = 6;
        scopeData = new ArrayList();
    }

    TokenResponse(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, boolean flag, boolean flag1, boolean flag2, boolean flag3, CaptchaChallenge captchachallenge, 
            List list, String s8, String s9, boolean flag4, int j, PostSignInData postsignindata, Account account1, 
            String s10, TokenData tokendata, Bundle bundle, String s11)
    {
        dataForLogging = new Bundle();
        version = i;
        statusWireCode = s1;
        token = s2;
        signInUrl = s3;
        detail = s4;
        picasaUser = s5;
        firstName = s6;
        lastName = s7;
        isGPlusServiceAllowed = flag;
        isGPlusServiceEnabled = flag1;
        isEsMobileServiceEnabled = flag2;
        isBrowserSignInSuggested = flag3;
        captcha = captchachallenge;
        s1 = list;
        if (list == null)
        {
            s1 = new ArrayList();
        }
        scopeData = s1;
        ropText = s8;
        ropRevision = s9;
        hasTitle = flag4;
        title = j;
        postSignInData = postsignindata;
        dmStatus = s10;
        dataForLogging = bundle;
        consentCookieWrapper = s11;
        if (account1 != null)
        {
            setAccount(account1);
        } else
        if (TextUtils.isEmpty(s))
        {
            accountName = null;
            account = null;
        } else
        {
            setAccount(new Account(s, "com.google"));
        }
        if (s2 != null)
        {
            s = new com.google.android.gms.auth.TokenData.Builder();
            s.mToken = s2;
            if (TextUtils.isEmpty(((com.google.android.gms.auth.TokenData.Builder) (s)).mToken))
            {
                s = null;
            } else
            {
                s = new TokenData(1, ((com.google.android.gms.auth.TokenData.Builder) (s)).mToken, null, false, false, null);
            }
            setTokenData(s);
            return;
        } else
        {
            setTokenData(tokendata);
            return;
        }
    }

    private TokenResponse setAccount(Account account1)
    {
        account = (Account)Preconditions.checkNotNull(account1, "Account can't be null.");
        accountName = account1.name;
        return this;
    }

    private TokenResponse setTokenData(TokenData tokendata)
    {
        if (tokendata == null)
        {
            token = null;
            tokenData = null;
            return this;
        } else
        {
            token = tokendata.mToken;
            tokenData = tokendata;
            return this;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        TokenResponseCreator.writeToParcel(this, parcel, i);
    }

}
