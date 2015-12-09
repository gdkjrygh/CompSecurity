// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            mg

public final class zzvx
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new mg();
    int a[];
    private final int b;

    zzvx()
    {
        this(1, null);
    }

    zzvx(int i, int ai[])
    {
        b = i;
        a = ai;
    }

    public final int a()
    {
        return b;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        mg.a(this, parcel);
    }

}
