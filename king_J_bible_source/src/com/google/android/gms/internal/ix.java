// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            iy

public final class ix
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new iy();
    String act[];
    byte acu[][];
    private final int xH;

    ix()
    {
        this(1, new String[0], new byte[0][]);
    }

    ix(int i, String as[], byte abyte0[][])
    {
        xH = i;
        act = as;
        acu = abyte0;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return xH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        iy.a(this, parcel, i);
    }

}
