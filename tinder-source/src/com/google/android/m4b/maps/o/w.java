// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.o;

import android.os.Parcel;
import com.google.android.m4b.maps.h.l;
import com.google.android.m4b.maps.h.q;
import com.google.android.m4b.maps.k.c;

// Referenced classes of package com.google.android.m4b.maps.o:
//            z, y

public final class w
    implements l, c
{

    public static final android.os.Parcelable.Creator CREATOR = new z();
    final int a;
    final q b;
    final y c;

    w(int i, q q, y y)
    {
        a = i;
        b = q;
        c = y;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        z.a(this, parcel, i);
    }

}
