// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            ConfirmCredentialsRequestCreator

public class ConfirmCredentialsRequest
    implements SafeParcelable
{

    public static final ConfirmCredentialsRequestCreator CREATOR = new ConfirmCredentialsRequestCreator();
    AccountCredentials accountCredentials;
    CaptchaSolution optionalCaptchaSolution;
    final int version;

    public ConfirmCredentialsRequest()
    {
        version = 1;
    }

    ConfirmCredentialsRequest(int i, AccountCredentials accountcredentials, CaptchaSolution captchasolution)
    {
        version = i;
        accountCredentials = accountcredentials;
        optionalCaptchaSolution = captchasolution;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ConfirmCredentialsRequestCreator.writeToParcel(this, parcel, i);
    }

}
