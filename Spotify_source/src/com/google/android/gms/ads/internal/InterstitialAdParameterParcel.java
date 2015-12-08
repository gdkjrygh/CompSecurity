// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.os.Parcel;
import bkr;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class InterstitialAdParameterParcel
    implements SafeParcelable
{

    public static final bkr CREATOR = new bkr();
    public final int a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final float f;

    public InterstitialAdParameterParcel(int i, boolean flag, boolean flag1, String s, boolean flag2, float f1)
    {
        a = i;
        b = flag;
        c = flag1;
        d = s;
        e = flag2;
        f = f1;
    }

    public InterstitialAdParameterParcel(boolean flag, boolean flag1, String s, boolean flag2, float f1)
    {
        this(2, flag, flag1, s, flag2, f1);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        bkr.a(this, parcel);
    }

}
