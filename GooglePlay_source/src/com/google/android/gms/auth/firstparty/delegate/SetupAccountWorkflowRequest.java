// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth.firstparty.delegate:
//            SetupAccountWorkflowRequestCreator

public class SetupAccountWorkflowRequest
    implements SafeParcelable
{

    public static final SetupAccountWorkflowRequestCreator CREATOR = new SetupAccountWorkflowRequestCreator();
    public String accountName;
    public final String accountType;
    public List allowedDomains;
    public AccountAuthenticatorResponse amResponse;
    public final AppDescription callingAppDescription;
    public boolean isCreditCardAllowed;
    public boolean isMultiUser;
    public boolean isSetupWizard;
    public Bundle options;
    public String purchaserGaiaEmail;
    public String purchaserName;
    public boolean suppressD2d;
    public boolean useImmersiveMode;
    public final int version;

    public SetupAccountWorkflowRequest(int i, boolean flag, boolean flag1, List list, Bundle bundle, AppDescription appdescription, boolean flag2, 
            String s, AccountAuthenticatorResponse accountauthenticatorresponse, boolean flag3, boolean flag4, String s1, String s2, String s3)
    {
        version = i;
        isMultiUser = flag;
        isSetupWizard = flag1;
        allowedDomains = list;
        options = bundle;
        callingAppDescription = (AppDescription)Preconditions.checkNotNull(appdescription);
        isCreditCardAllowed = flag2;
        accountType = s;
        amResponse = accountauthenticatorresponse;
        suppressD2d = flag3;
        useImmersiveMode = flag4;
        purchaserGaiaEmail = s1;
        purchaserName = s2;
        accountName = s3;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        SetupAccountWorkflowRequestCreator.writeToParcel(this, parcel, i);
    }

}
