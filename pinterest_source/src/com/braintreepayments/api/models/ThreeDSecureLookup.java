// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.braintreepayments.api.models:
//            Card

public class ThreeDSecureLookup
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private Card a;
    private String b;
    private String c;
    private String d;
    private String e;

    public ThreeDSecureLookup()
    {
    }

    private ThreeDSecureLookup(Parcel parcel)
    {
        a = (Card)parcel.readParcelable(com/braintreepayments/api/models/Card.getClassLoader());
        b = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
        e = parcel.readString();
    }

    ThreeDSecureLookup(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public final String a()
    {
        return b;
    }

    public final String b()
    {
        return c;
    }

    public final String c()
    {
        return d;
    }

    public final String d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeString(e);
    }


    /* member class not found */
    class _cls1 {}

}
