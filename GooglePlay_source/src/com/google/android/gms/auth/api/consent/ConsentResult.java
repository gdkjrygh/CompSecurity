// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.consent;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.api.consent:
//            ConsentResultCreator

public class ConsentResult
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ConsentResultCreator();
    public static final String EXTRA_CONSENT_RESULT = com/google/android/gms/auth/api/consent/ConsentResult.getName();
    final String mConsent;
    final String mConsentCookieWrapper;
    final FACLConfig mFacl;
    final String mPaclBase64;
    final String mStatus;
    final int mVersionCode;

    ConsentResult(int i, String s, String s1, FACLConfig faclconfig, String s2, String s3)
    {
        mVersionCode = i;
        mStatus = (String)Preconditions.checkNotNull(s);
        mPaclBase64 = s1;
        mFacl = faclconfig;
        mConsent = s2;
        mConsentCookieWrapper = s3;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ConsentResultCreator.writeToParcel(this, parcel, i);
    }

}
