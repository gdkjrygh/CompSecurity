// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.consent;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.ScopeDetail;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.api.consent:
//            GetConsentIntentRequestCreator

public class GetConsentIntentRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new GetConsentIntentRequestCreator();
    final Account mAccount;
    final String mCallingPackage;
    final int mCallingUid;
    final String mConsentCookieWrapper;
    final boolean mHasTitle;
    final ScopeDetail mScopeDetails[];
    final String mService;
    final int mTitle;
    final int mVersionCode;

    GetConsentIntentRequest(int i, String s, int j, String s1, Account account, ScopeDetail ascopedetail[], boolean flag, 
            int k, String s2)
    {
        mVersionCode = i;
        mCallingPackage = s;
        mCallingUid = j;
        mService = s1;
        mAccount = (Account)Preconditions.checkNotNull(account);
        mScopeDetails = ascopedetail;
        mHasTitle = flag;
        mTitle = k;
        mConsentCookieWrapper = s2;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        GetConsentIntentRequestCreator.writeToParcel(this, parcel, i);
    }

}
