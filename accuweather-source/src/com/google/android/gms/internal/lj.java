// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            lk

public final class lj
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new lk();
    String akb[];
    byte akc[][];
    private final int xJ;

    lj()
    {
        this(1, new String[0], new byte[0][]);
    }

    lj(int i, String as[], byte abyte0[][])
    {
        xJ = i;
        akb = as;
        akc = abyte0;
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
        lk.a(this, parcel, i);
    }

}
