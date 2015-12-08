// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            oo

public final class on
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new oo();
    private final int BR;
    int atN[];

    on()
    {
        this(1, null);
    }

    on(int i, int ai[])
    {
        BR = i;
        atN = ai;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return BR;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        oo.a(this, parcel, i);
    }

}
