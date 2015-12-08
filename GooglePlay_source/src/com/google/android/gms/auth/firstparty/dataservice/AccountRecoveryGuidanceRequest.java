// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            AccountRecoveryGuidanceRequestCreator

public class AccountRecoveryGuidanceRequest
    implements SafeParcelable
{

    public static final AccountRecoveryGuidanceRequestCreator CREATOR = new AccountRecoveryGuidanceRequestCreator();
    public final Account account;
    public final String accountName;
    final int version;

    AccountRecoveryGuidanceRequest(int i, String s, Account account1)
    {
        version = i;
        accountName = s;
        if (account1 == null && !TextUtils.isEmpty(s))
        {
            account = new Account(s, "com.google");
            return;
        } else
        {
            account = account1;
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AccountRecoveryGuidanceRequestCreator.writeToParcel(this, parcel, i);
    }

}
