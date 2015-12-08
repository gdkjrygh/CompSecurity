// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import bjd;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class CapabilityParcel
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new bjd();
    public final int a;
    public final boolean b;
    public final boolean c;

    public CapabilityParcel(int i, boolean flag, boolean flag1)
    {
        a = i;
        b = flag;
        c = flag1;
    }

    public CapabilityParcel(boolean flag, boolean flag1)
    {
        this(1, flag, flag1);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        bjd.a(this, parcel);
    }

}
