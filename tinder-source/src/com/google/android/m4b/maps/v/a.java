// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.v;

import android.os.Parcel;
import com.google.android.m4b.maps.k.c;

// Referenced classes of package com.google.android.m4b.maps.v:
//            b

public final class a
    implements c
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    final int a;

    public a()
    {
        this(1);
    }

    a(int i)
    {
        a = i;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        b.a(this, parcel);
    }

}
