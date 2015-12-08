// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            GoogleAccountSetupRequestCreator

public class GoogleAccountSetupRequest
    implements SafeParcelable
{

    public static final GoogleAccountSetupRequestCreator CREATOR = new GoogleAccountSetupRequestCreator();
    AccountCredentials accountCredentials;
    AppDescription callingAppDescription;
    String firstName;
    String gender;
    boolean isAddingAccount;
    boolean isAgreedToMobileTos;
    boolean isAgreedToPersonalizedContent;
    boolean isAgreedToWebHistory;
    boolean isCreatingAccount;
    boolean isSetupWizardInProgress;
    String lastName;
    CaptchaSolution optionalCaptchaSolution;
    Bundle options;
    String phoneCountryCode;
    String phoneNumber;
    String ropRevision;
    String secondaryEmail;
    final int version;

    public GoogleAccountSetupRequest()
    {
        version = 1;
        options = new Bundle();
    }

    GoogleAccountSetupRequest(int i, Bundle bundle, boolean flag, boolean flag1, boolean flag2, String s, String s1, 
            String s2, String s3, boolean flag3, boolean flag4, boolean flag5, String s4, AppDescription appdescription, 
            AccountCredentials accountcredentials, CaptchaSolution captchasolution, String s5, String s6)
    {
        version = i;
        options = bundle;
        isAgreedToWebHistory = flag;
        isAgreedToPersonalizedContent = flag1;
        isAgreedToMobileTos = flag2;
        firstName = s;
        lastName = s1;
        secondaryEmail = s2;
        gender = s3;
        isCreatingAccount = flag3;
        isAddingAccount = flag4;
        isSetupWizardInProgress = flag5;
        ropRevision = s4;
        callingAppDescription = appdescription;
        accountCredentials = accountcredentials;
        optionalCaptchaSolution = captchasolution;
        phoneNumber = s5;
        phoneCountryCode = s6;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        GoogleAccountSetupRequestCreator.writeToParcel(this, parcel, i);
    }

}
