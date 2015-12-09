// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            TokenRequestCreator

public class TokenRequest
    implements SafeParcelable
{
    public static final class Consent extends Enum
    {

        private static final Consent $VALUES[];
        public static final Consent GRANTED;
        public static final Consent REJECTED;
        public static final Consent UNKNOWN;

        public static Consent valueOf(String s)
        {
            return (Consent)Enum.valueOf(com/google/android/gms/auth/firstparty/dataservice/TokenRequest$Consent, s);
        }

        public static Consent[] values()
        {
            return (Consent[])$VALUES.clone();
        }

        static 
        {
            UNKNOWN = new Consent("UNKNOWN", 0);
            GRANTED = new Consent("GRANTED", 1);
            REJECTED = new Consent("REJECTED", 2);
            $VALUES = (new Consent[] {
                UNKNOWN, GRANTED, REJECTED
            });
        }

        private Consent(String s, int i)
        {
            super(s, i);
        }
    }


    public static final TokenRequestCreator CREATOR = new TokenRequestCreator();
    String accountName;
    String accountType;
    AppDescription callingAppDescription;
    String consentCookieWrapper;
    String delegateeUserId;
    int delegationType;
    FACLConfig faclData;
    boolean isAddingAccount;
    boolean isCreatingAccount;
    boolean isForcingDroidguardRun;
    boolean isUsingCache;
    String mConsent;
    CaptchaSolution optionalCaptchaSolution;
    Bundle options;
    PACLConfig paclData;
    String service;
    final int version;

    TokenRequest(int i, String s, String s1, Bundle bundle, FACLConfig faclconfig, PACLConfig paclconfig, boolean flag, 
            boolean flag1, String s2, AppDescription appdescription, CaptchaSolution captchasolution, boolean flag2, boolean flag3, String s3, 
            int j, String s4, String s5)
    {
        options = new Bundle();
        mConsent = Consent.UNKNOWN.toString();
        isForcingDroidguardRun = false;
        isUsingCache = true;
        accountType = "com.google";
        delegationType = 0;
        version = i;
        service = s;
        accountName = s1;
        options = bundle;
        faclData = faclconfig;
        paclData = paclconfig;
        isAddingAccount = flag;
        isCreatingAccount = flag1;
        mConsent = s2;
        callingAppDescription = appdescription;
        optionalCaptchaSolution = captchasolution;
        isForcingDroidguardRun = flag2;
        isUsingCache = flag3;
        accountType = s3;
        delegationType = j;
        delegateeUserId = s4;
        consentCookieWrapper = s5;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        TokenRequestCreator.writeToParcel(this, parcel, i);
    }

}
