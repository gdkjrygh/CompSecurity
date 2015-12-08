// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            oq

public final class op
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new oq();
    private final int BR;
    String atO[];
    byte atP[][];

    op()
    {
        this(1, new String[0], new byte[0][]);
    }

    op(int i, String as[], byte abyte0[][])
    {
        BR = i;
        atO = as;
        atP = abyte0;
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
        oq.a(this, parcel, i);
    }

}
