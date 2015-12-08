// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            VerifyPinRequestCreator

public class VerifyPinRequest
    implements SafeParcelable
{

    public static final VerifyPinRequestCreator CREATOR = new VerifyPinRequestCreator();
    public final Account account;
    public final String accountName;
    public String callingPackageName;
    public final String pin;
    final int version;

    VerifyPinRequest(int i, String s, String s1, Account account1, String s2)
    {
        version = i;
        accountName = s;
        pin = s1;
        if (account1 == null && !TextUtils.isEmpty(s))
        {
            account = new Account(s, "com.google");
        } else
        {
            account = account1;
        }
        callingPackageName = s2;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        VerifyPinRequestCreator.writeToParcel(this, parcel, i);
    }

}
