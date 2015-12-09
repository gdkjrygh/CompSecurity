// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.shared:
//            b

public final class BrokerAndRelationships
    implements SafeParcelable
{
    public final class Builder
    {

        final BrokerAndRelationships aVA;

        public final BrokerAndRelationships build()
        {
            return aVA;
        }

        public final Builder setBrokerId(String s)
        {
            aVA.aVy = s;
            return this;
        }

        public final Builder setRelationships(String as[])
        {
            aVA.aVz = as;
            return this;
        }

        private Builder()
        {
            aVA = BrokerAndRelationships.this;
            super();
        }

    }


    public static final android.os.Parcelable.Creator CREATOR = new b();
    String aVy;
    String aVz[];
    private final int mVersionCode;

    BrokerAndRelationships()
    {
        this(1, null, null);
    }

    BrokerAndRelationships(int i, String s, String as[])
    {
        mVersionCode = i;
        aVy = s;
        if (as == null)
        {
            as = new String[0];
        }
        aVz = as;
    }

    public static Builder newBuilder()
    {
        BrokerAndRelationships brokerandrelationships = new BrokerAndRelationships();
        brokerandrelationships.getClass();
        return brokerandrelationships. new Builder();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String getBrokerId()
    {
        return aVy;
    }

    public final String[] getRelationships()
    {
        return aVz;
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
