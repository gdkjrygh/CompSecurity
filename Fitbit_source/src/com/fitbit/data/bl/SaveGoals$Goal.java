// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.fitbit.data.bl:
//            SaveGoals

public static class b
    implements Parcelable
{

    public static final android.os.tor CREATOR = new _cls1();
    public com.fitbit.data.domain.nit> a;
    public double b;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a.rdinal());
        parcel.writeDouble(b);
    }


    private pe(Parcel parcel)
    {
        a = com.fitbit.data.domain.alues()[parcel.readInt()];
        b = parcel.readDouble();
    }

    b(Parcel parcel, b b1)
    {
        this(parcel);
    }

    public pe(com.fitbit.data.domain.t> t>, double d)
    {
        a = t>;
        b = d;
    }

    /* block-local class not found */
    class _cls1 {}

}
