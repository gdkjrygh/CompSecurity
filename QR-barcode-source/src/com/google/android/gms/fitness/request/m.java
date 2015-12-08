// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataType;

// Referenced classes of package com.google.android.gms.fitness.request:
//            n

public class m
    implements SafeParcelable
{
    public static class a
    {

        private DataType Sp;

        static DataType a(a a1)
        {
            return a1.Sp;
        }

        public a c(DataType datatype)
        {
            Sp = datatype;
            return this;
        }

        public m jq()
        {
            return new m(this);
        }

        public a()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new n();
    private final int BR;
    private final DataType Sp;

    m(int i, DataType datatype)
    {
        BR = i;
        Sp = datatype;
    }

    private m(a a1)
    {
        BR = 1;
        Sp = a.a(a1);
    }


    public int describeContents()
    {
        return 0;
    }

    public DataType getDataType()
    {
        return Sp;
    }

    int getVersionCode()
    {
        return BR;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        n.a(this, parcel, i);
    }

}
