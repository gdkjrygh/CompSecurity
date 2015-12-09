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
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.delegate:
//            ConfirmCredentialsWorkflowRequestCreator

public class ConfirmCredentialsWorkflowRequest
    implements SafeParcelable
{

    public static final ConfirmCredentialsWorkflowRequestCreator CREATOR = new ConfirmCredentialsWorkflowRequestCreator();
    Account account;
    String accountName;
    AccountAuthenticatorResponse amResponse;
    AppDescription callingAppDescription;
    Bundle options;
    final int version;

    public ConfirmCredentialsWorkflowRequest()
    {
        version = 3;
        options = new Bundle();
    }

    ConfirmCredentialsWorkflowRequest(int i, String s, AppDescription appdescription, Bundle bundle, Account account1, AccountAuthenticatorResponse accountauthenticatorresponse)
    {
        version = i;
        accountName = s;
        callingAppDescription = appdescription;
        options = bundle;
        if (account1 == null && !TextUtils.isEmpty(s))
        {
            account = new Account(s, "com.google");
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
        ConfirmCredentialsWorkflowRequestCreator.writeToParcel(this, parcel, i);
    }

}
