// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import csd;

public class PackageStorageInfo
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new csd();
    public final int a;
    public final String b;
    public final String c;
    public final long d;

    public PackageStorageInfo(int i, String s, String s1, long l)
    {
        a = i;
        b = s;
        c = s1;
        d = l;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        csd.a(this, parcel);
    }

}
