// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//            IdTokenCreator

public final class IdToken
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new IdTokenCreator();
    final String mAccountType;
    final String mIdToken;
    final int mVersionCode;

    IdToken(int i, String s, String s1)
    {
        mVersionCode = i;
        mAccountType = s;
        mIdToken = s1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        IdTokenCreator.writeToParcel$209b9bb7(this, parcel);
    }

}
