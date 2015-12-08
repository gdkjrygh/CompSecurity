// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            li

public final class lh
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new li();
    int aka[];
    private final int xJ;

    lh()
    {
        this(1, null);
    }

    lh(int i, int ai[])
    {
        xJ = i;
        aka = ai;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return xJ;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        li.a(this, parcel, i);
    }

}
