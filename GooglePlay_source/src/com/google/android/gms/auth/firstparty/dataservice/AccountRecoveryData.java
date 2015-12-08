// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            AccountRecoveryDataCreator, AccountRecoveryGuidance

public class AccountRecoveryData
    implements SafeParcelable
{

    public static final AccountRecoveryDataCreator CREATOR = new AccountRecoveryDataCreator();
    public final Account account;
    public final String accountName;
    public final String action;
    public final String allowedRecoveryOption;
    public final List countries;
    public final String defaultCountryCode;
    public final String error;
    public final AccountRecoveryGuidance guidance;
    public final String phoneNumber;
    public final String secondaryEmail;
    public final int version;

    AccountRecoveryData(int i, AccountRecoveryGuidance accountrecoveryguidance, String s, String s1, String s2, String s3, String s4, 
            List list, String s5, String s6, Account account1)
    {
        version = i;
        guidance = accountrecoveryguidance;
        action = s;
        allowedRecoveryOption = s1;
        accountName = s2;
        secondaryEmail = s3;
        phoneNumber = s4;
        if (list == null)
        {
            accountrecoveryguidance = Collections.EMPTY_LIST;
        } else
        {
            accountrecoveryguidance = Collections.unmodifiableList(list);
        }
        countries = accountrecoveryguidance;
        defaultCountryCode = s5;
        error = s6;
        if (account1 == null && !TextUtils.isEmpty(s2))
        {
            account = new Account(s2, "com.google");
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
        AccountRecoveryDataCreator.writeToParcel(this, parcel, i);
    }

}
