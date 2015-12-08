// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.people.identity.internal:
//            ParcelableFirstPartyOptionsCreator

public final class ParcelableFirstPartyOptions
    implements SafeParcelable
{

    public static final ParcelableFirstPartyOptionsCreator CREATOR = new ParcelableFirstPartyOptionsCreator();
    public final String mAccountName;
    public final String mPageId;
    final int mVersionCode;

    ParcelableFirstPartyOptions(int i, String s, String s1)
    {
        mVersionCode = i;
        mAccountName = s;
        mPageId = s1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return Objects.toStringHelper(this).add("accountName", mAccountName).add("pageId", mPageId).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ParcelableFirstPartyOptionsCreator.writeToParcel$5e4c5a8c(this, parcel);
    }

}
