// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.v;

import android.os.Parcel;
import com.google.android.m4b.maps.k.c;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.v:
//            e

public final class d
    implements c
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    final int a;
    final boolean b;
    final List c;

    public d()
    {
        this(1, false, Collections.emptyList());
    }

    d(int i, boolean flag, List list)
    {
        a = i;
        b = flag;
        c = list;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        e.a(this, parcel);
    }

}
