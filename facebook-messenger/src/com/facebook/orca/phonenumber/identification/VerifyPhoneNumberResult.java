// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.phonenumber.identification;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.orca.phonenumber.identification:
//            e

public class VerifyPhoneNumberResult
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    private String a;

    public VerifyPhoneNumberResult(Parcel parcel)
    {
        a = parcel.readString();
    }

    public VerifyPhoneNumberResult(String s)
    {
        a(s);
    }

    private void a(String s)
    {
        a = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
    }

}
