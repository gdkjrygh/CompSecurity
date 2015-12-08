// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            d

public class CapabilityParcel
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    public final int a;
    public final boolean b;
    public final boolean c;

    CapabilityParcel(int i, boolean flag, boolean flag1)
    {
        a = i;
        b = flag;
        c = flag1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel);
    }

}
