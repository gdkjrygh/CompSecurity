// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.phonenumber.identification;

import android.os.Parcel;

// Referenced classes of package com.facebook.orca.phonenumber.identification:
//            VerifyPhoneNumberParams

final class d
    implements android.os.Parcelable.Creator
{

    d()
    {
    }

    public VerifyPhoneNumberParams a(Parcel parcel)
    {
        return new VerifyPhoneNumberParams(parcel);
    }

    public VerifyPhoneNumberParams[] a(int i)
    {
        return new VerifyPhoneNumberParams[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
