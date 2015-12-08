// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            i

public final class LineItem
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new i();
    String a;
    String b;
    String c;
    String d;
    int e;
    String f;
    private final int g;

    LineItem()
    {
        g = 1;
        e = 0;
    }

    LineItem(int j, String s, String s1, String s2, String s3, int k, String s4)
    {
        g = j;
        a = s;
        b = s1;
        c = s2;
        d = s3;
        e = k;
        f = s4;
    }

    public final int a()
    {
        return g;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel);
    }

}
