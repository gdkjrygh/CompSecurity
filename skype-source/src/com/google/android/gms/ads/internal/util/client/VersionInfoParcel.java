// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.ads.internal.util.client:
//            c

public final class VersionInfoParcel
    implements SafeParcelable
{

    public static final c CREATOR = new c();
    public final int a;
    public String b;
    public int c;
    public int d;
    public boolean e;

    public VersionInfoParcel()
    {
        this(1, "afma-sdk-a-v7895000.7895000.0", 0x7877d8, 0x7877d8, true);
    }

    VersionInfoParcel(int i, String s, int j, int k, boolean flag)
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
        com.google.android.gms.ads.internal.util.client.c.a(this, parcel);
    }

}
