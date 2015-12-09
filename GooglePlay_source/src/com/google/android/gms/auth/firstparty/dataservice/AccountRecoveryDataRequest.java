// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            AccountRecoveryDataRequestCreator

public class AccountRecoveryDataRequest
    implements SafeParcelable
{

    public static final AccountRecoveryDataRequestCreator CREATOR = new AccountRecoveryDataRequestCreator();
    private static final String LOG_PREFIX = (new StringBuilder("[")).append(com/google/android/gms/auth/firstparty/dataservice/AccountRecoveryDataRequest.getSimpleName()).append("]").toString();
    public final Account account;
    public final String accountName;
    public final AppDescription callingAppDescription;
    public final boolean isClearUpdateSuggested;
    public final String requestDescription;
    final int version;

    AccountRecoveryDataRequest(int i, String s, boolean flag, AppDescription appdescription, String s1, Account account1)
    {
        accountName = Preconditions.checkNotEmpty(s, (new StringBuilder()).append(LOG_PREFIX).append(" accountName cannot be empty or null!").toString());
        Preconditions.checkNotEmpty(s1, (new StringBuilder()).append(LOG_PREFIX).append(" requestDescription cannot be empty or null!").toString());
        version = i;
        isClearUpdateSuggested = flag;
        callingAppDescription = (AppDescription)Preconditions.checkNotNull(appdescription);
        requestDescription = s1;
        if (account1 == null && !TextUtils.isEmpty(s))
        {
            account = new Account(s, "com.google");
        } else
        {
            account = account1;
        }
        Preconditions.checkNotNull(account);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AccountRecoveryDataRequestCreator.writeToParcel(this, parcel, i);
    }

}
