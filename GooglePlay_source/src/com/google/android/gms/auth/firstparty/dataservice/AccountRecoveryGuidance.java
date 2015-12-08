// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            AccountRecoveryGuidanceCreator

public class AccountRecoveryGuidance
    implements SafeParcelable
{

    public static final AccountRecoveryGuidanceCreator CREATOR = new AccountRecoveryGuidanceCreator();
    public final Account account;
    public final String accountName;
    public final boolean isRecoveryInfoNeeded;
    public final boolean isRecoveryInterstitialSuggested;
    public final boolean isRecoveryUpdateAllowed;
    final int version;

    AccountRecoveryGuidance(int i, String s, boolean flag, boolean flag1, boolean flag2, Account account1)
    {
        version = i;
        accountName = s;
        isRecoveryInfoNeeded = flag;
        isRecoveryInterstitialSuggested = flag1;
        isRecoveryUpdateAllowed = flag2;
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
        AccountRecoveryGuidanceCreator.writeToParcel(this, parcel, i);
    }

}
