// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.phonenumber.identification;

import android.os.Parcel;

// Referenced classes of package com.facebook.orca.phonenumber.identification:
//            VerifyPhoneNumberResult

final class e
    implements android.os.Parcelable.Creator
{

    e()
    {
    }

    public VerifyPhoneNumberResult a(Parcel parcel)
    {
        return new VerifyPhoneNumberResult(parcel);
    }

    public VerifyPhoneNumberResult[] a(int i)
    {
        return new VerifyPhoneNumberResult[i];
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
