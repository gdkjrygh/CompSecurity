// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.os.Parcel;
import bhl;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class AdLauncherIntentInfoParcel
    implements SafeParcelable
{

    public static final bhl CREATOR = new bhl();
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public AdLauncherIntentInfoParcel(int i, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6)
    {
        a = i;
        b = s;
        c = s1;
        d = s2;
        e = s3;
        f = s4;
        g = s5;
        h = s6;
    }

    public AdLauncherIntentInfoParcel(String s, String s1, String s2, String s3, String s4, String s5, String s6)
    {
        this(1, s, s1, s2, s3, s4, s5, s6);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        bhl.a(this, parcel);
    }

}
