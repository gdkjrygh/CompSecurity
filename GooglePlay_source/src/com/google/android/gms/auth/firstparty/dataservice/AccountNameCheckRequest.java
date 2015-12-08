// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            AccountNameCheckRequestCreator

public class AccountNameCheckRequest
    implements SafeParcelable
{

    public static final AccountNameCheckRequestCreator CREATOR = new AccountNameCheckRequestCreator();
    String accountNameToCheck;
    Account accountToCheck;
    AppDescription callingAppDescription;
    CaptchaSolution optionalCaptchaSolution;
    String optionalFirstName;
    String optionalLastName;
    final int version;

    public AccountNameCheckRequest()
    {
        version = 2;
    }

    AccountNameCheckRequest(int i, String s, String s1, String s2, AppDescription appdescription, CaptchaSolution captchasolution, Account account)
    {
        version = i;
        accountNameToCheck = s;
        optionalFirstName = s1;
        optionalLastName = s2;
        callingAppDescription = appdescription;
        optionalCaptchaSolution = captchasolution;
        if (account == null && !TextUtils.isEmpty(s))
        {
            accountToCheck = new Account(s, "com.google");
            return;
        } else
        {
            accountToCheck = account;
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AccountNameCheckRequestCreator.writeToParcel(this, parcel, i);
    }

}
