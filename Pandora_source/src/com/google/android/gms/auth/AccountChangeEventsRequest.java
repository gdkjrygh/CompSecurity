// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth:
//            AccountChangeEventsRequestCreator

public class AccountChangeEventsRequest
    implements SafeParcelable
{

    public static final AccountChangeEventsRequestCreator CREATOR = new AccountChangeEventsRequestCreator();
    Account zzJc;
    final int zzKu;
    String zzKw;
    int zzKy;

    public AccountChangeEventsRequest()
    {
        zzKu = 1;
    }

    AccountChangeEventsRequest(int i, int j, String s, Account account)
    {
        zzKu = i;
        zzKy = j;
        zzKw = s;
        if (account == null && !TextUtils.isEmpty(s))
        {
            zzJc = new Account(s, "com.google");
            return;
        } else
        {
            zzJc = account;
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public Account getAccount()
    {
        return zzJc;
    }

    public String getAccountName()
    {
        return zzKw;
    }

    public int getEventIndex()
    {
        return zzKy;
    }

    public AccountChangeEventsRequest setAccount(Account account)
    {
        zzJc = account;
        return this;
    }

    public AccountChangeEventsRequest setAccountName(String s)
    {
        zzKw = s;
        return this;
    }

    public AccountChangeEventsRequest setEventIndex(int i)
    {
        zzKy = i;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AccountChangeEventsRequestCreator.zza(this, parcel, i);
    }

}
