// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.o;

import android.os.Parcel;
import com.google.android.m4b.maps.k.c;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.o:
//            j

public final class g
    implements c
{

    public static final android.os.Parcelable.Creator CREATOR = new j();
    final int a;
    final List b;
    final int c;

    g(int i, List list, int k)
    {
        a = i;
        b = list;
        c = k;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        j.a(this, parcel);
    }

}
