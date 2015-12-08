// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            mh

public final class zzvz
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new mh();
    String a[];
    byte b[][];
    private final int c;

    zzvz()
    {
        this(1, new String[0], new byte[0][]);
    }

    zzvz(int i, String as[], byte abyte0[][])
    {
        c = i;
        a = as;
        b = abyte0;
    }

    public final int a()
    {
        return c;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        mh.a(this, parcel);
    }

}
