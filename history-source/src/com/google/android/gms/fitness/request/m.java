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

        private DataType TM;

        static DataType a(a a1)
        {
            return a1.TM;
        }

        public a c(DataType datatype)
        {
            TM = datatype;
            return this;
        }

        public m ka()
        {
            return new m(this);
        }

        public a()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new n();
    private final int CK;
    private final DataType TM;

    m(int i, DataType datatype)
    {
        CK = i;
        TM = datatype;
    }

    private m(a a1)
    {
        CK = 1;
        TM = a.a(a1);
    }


    public int describeContents()
    {
        return 0;
    }

    public DataType getDataType()
    {
        return TM;
    }

    int getVersionCode()
    {
        return CK;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        n.a(this, parcel, i);
    }

}
