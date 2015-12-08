// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.internal:
//            ResolveAccountRequestCreator

public class ResolveAccountRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ResolveAccountRequestCreator();
    final Account mAccount;
    final int mSessionId;
    final GoogleSignInAccount mSignInAccountHint;
    final int mVersionCode;

    ResolveAccountRequest(int i, Account account, int j, GoogleSignInAccount googlesigninaccount)
    {
        mVersionCode = i;
        mAccount = account;
        mSessionId = j;
        mSignInAccountHint = googlesigninaccount;
    }

    public ResolveAccountRequest(Account account, int i, GoogleSignInAccount googlesigninaccount)
    {
        this(2, account, i, googlesigninaccount);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ResolveAccountRequestCreator.writeToParcel(this, parcel, i);
    }

}
