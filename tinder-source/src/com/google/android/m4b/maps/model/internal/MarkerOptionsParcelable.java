// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model.internal;

import android.os.Parcel;
import com.google.android.m4b.maps.k.c;

// Referenced classes of package com.google.android.m4b.maps.model.internal:
//            p, BitmapDescriptorParcelable

public final class MarkerOptionsParcelable
    implements c
{

    public static final p CREATOR = new p();
    final int a;
    BitmapDescriptorParcelable b;

    public MarkerOptionsParcelable()
    {
        a = 1;
    }

    MarkerOptionsParcelable(int i, BitmapDescriptorParcelable bitmapdescriptorparcelable)
    {
        a = i;
        b = bitmapdescriptorparcelable;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        p.a(this, parcel, i);
    }

}
