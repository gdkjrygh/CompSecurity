// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.signin.internal:
//            RecordConsentRequestCreator

public class RecordConsentRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new RecordConsentRequestCreator();
    final Account mAccount;
    final Scope mScopesToConsent[];
    final String mServerClientId;
    final int mVersionCode;

    RecordConsentRequest(int i, Account account, Scope ascope[], String s)
    {
        mVersionCode = i;
        mAccount = account;
        mScopesToConsent = ascope;
        mServerClientId = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        RecordConsentRequestCreator.writeToParcel(this, parcel, i);
    }

}
