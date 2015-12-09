// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            UpdateCredentialsRequestCreator

public class UpdateCredentialsRequest
    implements SafeParcelable
{

    public static final UpdateCredentialsRequestCreator CREATOR = new UpdateCredentialsRequestCreator();
    AccountCredentials accountCredentials;
    CaptchaSolution optionalCaptchaSolution;
    final int version;

    public UpdateCredentialsRequest()
    {
        version = 1;
    }

    UpdateCredentialsRequest(int i, AccountCredentials accountcredentials, CaptchaSolution captchasolution)
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
        UpdateCredentialsRequestCreator.writeToParcel(this, parcel, i);
    }

}
