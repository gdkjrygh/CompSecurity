// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.p;

import android.os.Parcel;
import com.google.android.m4b.maps.k.c;

// Referenced classes of package com.google.android.m4b.maps.p:
//            b

public final class a
    implements c
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    public static final a a = new a();
    final int b;
    public final boolean c;
    public final String d;

    private a()
    {
        this(1, true, null);
    }

    a(int i, boolean flag, String s)
    {
        b = i;
        c = flag;
        d = s;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.m4b.maps.p.b.a(this, parcel);
    }

}
