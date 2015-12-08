// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import joa;

public final class MobileAdsSettingsParcel
    implements SafeParcelable
{

    public static final joa CREATOR = new joa();
    public final int a;
    public final boolean b;
    public final String c;

    public MobileAdsSettingsParcel(int i, boolean flag, String s)
    {
        a = i;
        b = flag;
        c = s;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        joa.a(this, parcel);
    }

}
