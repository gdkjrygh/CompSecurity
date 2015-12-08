// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.server.converter:
//            StringToIntConverter, c

public static final class c
    implements SafeParcelable
{

    public static final c CREATOR = new c();
    final int a;
    final String b;
    final int c;

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.common.server.converter.c.a(this, parcel);
    }


    (int i, String s, int j)
    {
        a = i;
        b = s;
        c = j;
    }

    c(String s, int i)
    {
        a = 1;
        b = s;
        c = i;
    }
}
