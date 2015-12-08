// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.ads.internal:
//            c

public final class InterstitialAdParameterParcel
    implements SafeParcelable
{

    public static final c CREATOR = new c();
    public final int a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final float f;

    InterstitialAdParameterParcel(int i, boolean flag, boolean flag1, String s, boolean flag2, float f1)
    {
        a = i;
        b = flag;
        c = flag1;
        d = s;
        e = flag2;
        f = f1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.ads.internal.c.a(this, parcel);
    }

}
