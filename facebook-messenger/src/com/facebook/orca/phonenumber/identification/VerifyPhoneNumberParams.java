// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.phonenumber.identification;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.orca.phonenumber.identification:
//            d

public class VerifyPhoneNumberParams
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    private String a;
    private String b;

    public VerifyPhoneNumberParams(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
    }

    public VerifyPhoneNumberParams(String s, String s1)
    {
        a(s);
        b(s1);
    }

    private void a(String s)
    {
        a = s;
    }

    private void b(String s)
    {
        b = s;
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
    }

}
