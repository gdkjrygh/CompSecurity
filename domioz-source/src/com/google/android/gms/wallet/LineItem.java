// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            t, c

public final class LineItem
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new t();
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

    LineItem(int i, String s, String s1, String s2, String s3, int j, String s4)
    {
        g = i;
        a = s;
        b = s1;
        c = s2;
        d = s3;
        e = j;
        f = s4;
    }

    public static c a()
    {
        LineItem lineitem = new LineItem();
        lineitem.getClass();
        return new c(lineitem, (byte)0);
    }

    public final int b()
    {
        return g;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        t.a(this, parcel);
    }

}
