// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.googlehelp.internal.common;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import kpu;

public class TogglingData
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new kpu();
    public final int a;
    public String b;
    public String c;
    public String d;

    private TogglingData()
    {
        a = 1;
    }

    public TogglingData(int i, String s, String s1, String s2)
    {
        a = i;
        b = s;
        c = s1;
        d = s2;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        kpu.a(this, parcel);
    }

}
