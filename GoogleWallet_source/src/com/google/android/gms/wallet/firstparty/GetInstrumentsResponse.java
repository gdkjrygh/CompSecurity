// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.firstparty:
//            b

public final class GetInstrumentsResponse
    implements SafeParcelable
{
    public final class Builder
    {

        final GetInstrumentsResponse aUE;

        public final GetInstrumentsResponse build()
        {
            return aUE;
        }

        public final Builder setInstrumentIds(String as[])
        {
            aUE.aUC = as;
            return this;
        }

        public final Builder setPaymentInstruments(byte abyte0[][])
        {
            aUE.aUD = abyte0;
            return this;
        }

        private Builder()
        {
            aUE = GetInstrumentsResponse.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new b();
    String aUC[];
    byte aUD[][];
    private final int mVersionCode;

    GetInstrumentsResponse()
    {
        this(1, new String[0], new byte[0][]);
    }

    GetInstrumentsResponse(int i, String as[], byte abyte0[][])
    {
        mVersionCode = i;
        aUC = as;
        aUD = abyte0;
    }

    public static Builder newBuilder()
    {
        GetInstrumentsResponse getinstrumentsresponse = new GetInstrumentsResponse();
        getinstrumentsresponse.getClass();
        return getinstrumentsresponse. new Builder();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String[] getInstrumentIds()
    {
        return aUC;
    }

    public final byte[][] getPaymentInstruments()
    {
        return aUD;
    }

    public final int getVersionCode()
    {
        return mVersionCode;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel, i);
    }

}
