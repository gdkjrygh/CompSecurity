// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            GoogleAccountDataCreator

public class GoogleAccountData
    implements SafeParcelable
{

    public static final GoogleAccountDataCreator CREATOR = new GoogleAccountDataCreator();
    public Account account;
    String accountName;
    public String firstName;
    boolean isBrowserFlowRequired;
    public String lastName;
    public List services;
    final int version;

    GoogleAccountData(int i, String s, boolean flag, List list, String s1, String s2, Account account1)
    {
        version = i;
        accountName = s;
        isBrowserFlowRequired = flag;
        services = list;
        firstName = s1;
        lastName = s2;
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
        GoogleAccountDataCreator.writeToParcel(this, parcel, i);
    }

}
