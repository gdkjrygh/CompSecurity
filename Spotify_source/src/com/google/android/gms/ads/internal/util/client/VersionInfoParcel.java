// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import bkb;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class VersionInfoParcel
    implements SafeParcelable
{

    public static final bkb CREATOR = new bkb();
    public final int a;
    public String b;
    public int c;
    public int d;
    public boolean e;

    public VersionInfoParcel()
    {
        this(1, "afma-sdk-a-v8115000.8115000.0", 0x7bd338, 0x7bd338, true);
    }

    public VersionInfoParcel(int i, String s, int j, int k, boolean flag)
    {
        a = i;
        b = s;
        c = j;
        d = k;
        e = flag;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        bkb.a(this, parcel);
    }

}
