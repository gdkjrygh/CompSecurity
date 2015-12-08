// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import com.google.android.gms.ads.formats.b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.ads.internal.formats:
//            i

public class NativeAdOptionsParcel
    implements SafeParcelable
{

    public static final i CREATOR = new i();
    public final int a;
    public final boolean b;
    public final int c;
    public final boolean d;

    public NativeAdOptionsParcel(int j, boolean flag, int k, boolean flag1)
    {
        a = j;
        b = flag;
        c = k;
        d = flag1;
    }

    public NativeAdOptionsParcel(b b1)
    {
        this(1, b1.a(), b1.b(), b1.c());
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel);
    }

}
