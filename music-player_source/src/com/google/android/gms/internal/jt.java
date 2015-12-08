// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            km

public final class jt
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new km();
    String a;
    String b;
    private final int c;

    jt()
    {
        c = 1;
    }

    jt(int i, String s, String s1)
    {
        c = i;
        a = s;
        b = s1;
    }

    public final int a()
    {
        return c;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        km.a(this, parcel);
    }

}
