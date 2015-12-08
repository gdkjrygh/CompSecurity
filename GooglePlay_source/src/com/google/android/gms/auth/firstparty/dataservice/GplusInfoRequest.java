// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            GplusInfoRequestCreator

public class GplusInfoRequest
    implements SafeParcelable
{

    public static final GplusInfoRequestCreator CREATOR = new GplusInfoRequestCreator();
    Account account;
    String accountName;
    CaptchaSolution optionalCaptchaSolution;
    final int version;

    public GplusInfoRequest()
    {
        version = 2;
    }

    GplusInfoRequest(int i, String s, CaptchaSolution captchasolution, Account account1)
    {
        version = i;
        accountName = s;
        optionalCaptchaSolution = captchasolution;
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
        GplusInfoRequestCreator.writeToParcel(this, parcel, i);
    }

}
