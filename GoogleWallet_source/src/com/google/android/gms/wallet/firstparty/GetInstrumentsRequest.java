// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.firstparty:
//            a

public final class GetInstrumentsRequest
    implements SafeParcelable
{
    public final class Builder
    {

        final GetInstrumentsRequest aUB;

        public final GetInstrumentsRequest build()
        {
            return aUB;
        }

        public final Builder setFamilyFilter(int ai[])
        {
            aUB.aUA = ai;
            return this;
        }

        private Builder()
        {
            aUB = GetInstrumentsRequest.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new a();
    int aUA[];
    private final int mVersionCode;

    GetInstrumentsRequest()
    {
        this(1, null);
    }

    GetInstrumentsRequest(int i, int ai[])
    {
        mVersionCode = i;
        aUA = ai;
    }

    public static Builder newBuilder()
    {
        GetInstrumentsRequest getinstrumentsrequest = new GetInstrumentsRequest();
        getinstrumentsrequest.getClass();
        return getinstrumentsrequest. new Builder();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int getVersionCode()
    {
        return mVersionCode;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        a.a(this, parcel, i);
    }

}
