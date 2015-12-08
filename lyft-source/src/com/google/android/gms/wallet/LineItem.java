// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            zzi

public final class LineItem
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzi();
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

    public int a()
    {
        return g;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzi.a(this, parcel, i);
    }

}
