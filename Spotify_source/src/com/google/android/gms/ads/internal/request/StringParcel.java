// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import bjp;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class StringParcel
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new bjp();
    public final int a;
    public String b;

    public StringParcel(int i, String s)
    {
        a = i;
        b = s;
    }

    public StringParcel(String s)
    {
        a = 1;
        b = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        bjp.a(this, parcel);
    }

}
