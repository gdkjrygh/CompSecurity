// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataType;

// Referenced classes of package com.google.android.gms.fitness.result:
//            d

public class DataTypeResult
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    private final int BR;
    private final Status CM;
    private final DataType Sp;

    DataTypeResult(int i, Status status, DataType datatype)
    {
        BR = i;
        CM = status;
        Sp = datatype;
    }

    public DataTypeResult(Status status, DataType datatype)
    {
        BR = 2;
        CM = status;
        Sp = datatype;
    }

    public static DataTypeResult F(Status status)
    {
        return new DataTypeResult(status, null);
    }

    private boolean b(DataTypeResult datatyperesult)
    {
        return CM.equals(datatyperesult.CM) && n.equal(Sp, datatyperesult.Sp);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof DataTypeResult) && b((DataTypeResult)obj);
    }

    public DataType getDataType()
    {
        return Sp;
    }

    public Status getStatus()
    {
        return CM;
    }

    int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            CM, Sp
        });
    }

    public String toString()
    {
        return n.h(this).a("status", CM).a("dataType", Sp).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel, i);
    }

}
