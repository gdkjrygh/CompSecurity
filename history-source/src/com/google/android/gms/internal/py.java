// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            pz

public final class py
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new pz();
    private final int CK;
    String avY[];
    byte avZ[][];

    py()
    {
        this(1, new String[0], new byte[0][]);
    }

    py(int i, String as[], byte abyte0[][])
    {
        CK = i;
        avY = as;
        avZ = abyte0;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return CK;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        pz.a(this, parcel, i);
    }

}
