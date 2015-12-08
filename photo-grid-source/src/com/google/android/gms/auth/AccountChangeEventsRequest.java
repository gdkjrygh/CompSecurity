// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth:
//            f

public class AccountChangeEventsRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new f();
    final int a;
    int b;
    String c;
    Account d;

    public AccountChangeEventsRequest()
    {
        a = 1;
    }

    AccountChangeEventsRequest(int i, int j, String s, Account account)
    {
        a = i;
        b = j;
        c = s;
        if (account == null && !TextUtils.isEmpty(s))
        {
            d = new Account(s, "com.google");
            return;
        } else
        {
            d = account;
            return;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        f.a(this, parcel, i);
    }

}
