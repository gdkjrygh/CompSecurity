// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.delegate:
//            TokenWorkflowRequestCreator

public class TokenWorkflowRequest
    implements SafeParcelable
{

    public static final TokenWorkflowRequestCreator CREATOR = new TokenWorkflowRequestCreator();
    Account account;
    String accountName;
    AccountAuthenticatorResponse amResponse;
    AppDescription callingAppDescription;
    FACLConfig faclData;
    boolean isSuppressingProgressUx;
    Bundle options;
    PACLConfig paclData;
    String service;
    final int version;

    public TokenWorkflowRequest()
    {
        version = 2;
        options = new Bundle();
    }

    TokenWorkflowRequest(int i, String s, String s1, Bundle bundle, FACLConfig faclconfig, PACLConfig paclconfig, boolean flag, 
            AppDescription appdescription, Account account1, AccountAuthenticatorResponse accountauthenticatorresponse)
    {
        version = i;
        service = s;
        accountName = s1;
        options = bundle;
        faclData = faclconfig;
        paclData = paclconfig;
        isSuppressingProgressUx = flag;
        callingAppDescription = appdescription;
        if (account1 == null && !TextUtils.isEmpty(s1))
        {
            account = new Account(s1, "com.google");
        } else
        {
            account = account1;
        }
        amResponse = accountauthenticatorresponse;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        TokenWorkflowRequestCreator.writeToParcel(this, parcel, i);
    }

}
