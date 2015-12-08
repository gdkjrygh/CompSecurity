// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.o;

import android.os.Parcel;
import com.google.android.m4b.maps.k.c;

// Referenced classes of package com.google.android.m4b.maps.o:
//            aa

public final class y
    implements c
{

    public static final android.os.Parcelable.Creator CREATOR = new aa();
    final int a;
    final boolean b;
    final boolean c;
    final boolean d;
    final boolean e;
    final boolean f;
    final boolean g;
    final boolean h;

    y(int i, boolean flag, boolean flag1, boolean flag2, boolean flag3, boolean flag4, boolean flag5, 
            boolean flag6)
    {
        a = i;
        b = flag;
        c = flag1;
        d = flag2;
        e = flag3;
        f = flag4;
        g = flag5;
        h = flag6;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        aa.a(this, parcel);
    }

}
