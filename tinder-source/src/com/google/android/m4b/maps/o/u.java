// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.o;

import android.os.Parcel;
import com.google.android.m4b.maps.k.c;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.o:
//            x

public final class u
    implements c
{

    public static final android.os.Parcelable.Creator CREATOR = new x();
    final int a;
    final List b;
    final boolean c;
    final boolean d;
    final boolean e;

    u(int i, List list, boolean flag, boolean flag1, boolean flag2)
    {
        a = i;
        b = list;
        c = flag;
        d = flag1;
        e = flag2;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        x.a(this, parcel);
    }

}
