// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            ReauthSettingsRequestCreator

public class ReauthSettingsRequest
    implements SafeParcelable
{

    public static final ReauthSettingsRequestCreator CREATOR = new ReauthSettingsRequestCreator();
    public final Account account;
    public final String accountName;
    public String callingPackageName;
    public final boolean force;
    final int version;

    ReauthSettingsRequest(int i, String s, boolean flag, Account account1, String s1)
    {
        version = i;
        accountName = s;
        force = flag;
        if (account1 == null && !TextUtils.isEmpty(s))
        {
            account = new Account(s, "com.google");
        } else
        {
            account = account1;
        }
        callingPackageName = s1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ReauthSettingsRequestCreator.writeToParcel(this, parcel, i);
    }

}
