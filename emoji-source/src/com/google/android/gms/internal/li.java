// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            lj

public final class li
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new lj();
    String ake[];
    byte akf[][];
    private final int xM;

    li()
    {
        this(1, new String[0], new byte[0][]);
    }

    li(int i, String as[], byte abyte0[][])
    {
        xM = i;
        ake = as;
        akf = abyte0;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return xM;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        lj.a(this, parcel, i);
    }

}
