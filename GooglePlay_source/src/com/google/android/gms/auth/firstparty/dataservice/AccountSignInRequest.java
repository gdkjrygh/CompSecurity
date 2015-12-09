// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            AccountSignInRequestCreator

public class AccountSignInRequest
    implements SafeParcelable
{

    public static final AccountSignInRequestCreator CREATOR = new AccountSignInRequestCreator();
    AccountCredentials accountCredentials;
    AppDescription callingAppDescription;
    boolean isCreatingAccount;
    boolean isSetupWizardInProgress;
    CaptchaSolution optionalCaptchaSolution;
    final int version;

    public AccountSignInRequest()
    {
        version = 1;
    }

    AccountSignInRequest(int i, AppDescription appdescription, boolean flag, boolean flag1, CaptchaSolution captchasolution, AccountCredentials accountcredentials)
    {
        version = i;
        callingAppDescription = appdescription;
        isCreatingAccount = flag;
        isSetupWizardInProgress = flag1;
        optionalCaptchaSolution = captchasolution;
        accountCredentials = accountcredentials;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AccountSignInRequestCreator.writeToParcel(this, parcel, i);
    }

}
