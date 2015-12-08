// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.people.identity.internal:
//            AccountTokenCreator

public final class AccountToken
    implements SafeParcelable
{

    public static final AccountTokenCreator CREATOR = new AccountTokenCreator();
    final String mAccountName;
    final String mPageId;
    final int mVersionCode;

    AccountToken(int i, String s, String s1)
    {
        mVersionCode = i;
        mAccountName = s;
        mPageId = s1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        AccountTokenCreator.writeToParcel$6247cd09(this, parcel);
    }

}
