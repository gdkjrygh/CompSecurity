// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.people.identity.internal:
//            ParcelableListOptionsCreator, ParcelableFirstPartyOptions

public final class ParcelableListOptions
    implements SafeParcelable
{

    public static final ParcelableListOptionsCreator CREATOR = new ParcelableListOptionsCreator();
    final String mEndpoint;
    final Bundle mEndpointArguments;
    final ParcelableFirstPartyOptions mOptions;
    final boolean mUseCp2;
    final boolean mUseOfflineDatabase;
    final boolean mUseWebData;
    final int mVersionCode;

    ParcelableListOptions(int i, boolean flag, boolean flag1, boolean flag2, String s, Bundle bundle, ParcelableFirstPartyOptions parcelablefirstpartyoptions)
    {
        mVersionCode = i;
        mUseOfflineDatabase = flag;
        mUseWebData = flag1;
        mEndpoint = s;
        mUseCp2 = flag2;
        s = bundle;
        if (bundle == null)
        {
            s = new Bundle();
        }
        mEndpointArguments = s;
        mOptions = parcelablefirstpartyoptions;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return Objects.toStringHelper(this).add("useOfflineDatabase", Boolean.valueOf(mUseOfflineDatabase)).add("useWebData", Boolean.valueOf(mUseWebData)).add("useCp2", Boolean.valueOf(mUseCp2)).add("endpoint", mEndpoint).add("endpointArguments", mEndpointArguments).add("firstPartyOptions", mOptions).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ParcelableListOptionsCreator.writeToParcel(this, parcel, i);
    }

}
