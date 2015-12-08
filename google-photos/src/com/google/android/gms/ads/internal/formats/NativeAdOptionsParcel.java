// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import jos;

public class NativeAdOptionsParcel
    implements SafeParcelable
{

    public static final jos CREATOR = new jos();
    public final int a;
    public final boolean b;
    public final int c;
    public final boolean d;

    public NativeAdOptionsParcel(int i, boolean flag, int j, boolean flag1)
    {
        a = i;
        b = flag;
        c = j;
        d = flag1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        jos.a(this, parcel);
    }

}
