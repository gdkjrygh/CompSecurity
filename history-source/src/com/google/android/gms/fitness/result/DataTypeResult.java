// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.jv;

// Referenced classes of package com.google.android.gms.fitness.result:
//            d

public class DataTypeResult
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    private final int CK;
    private final Status Eb;
    private final DataType TM;

    DataTypeResult(int i, Status status, DataType datatype)
    {
        CK = i;
        Eb = status;
        TM = datatype;
    }

    public DataTypeResult(Status status, DataType datatype)
    {
        CK = 2;
        Eb = status;
        TM = datatype;
    }

    public static DataTypeResult E(Status status)
    {
        return new DataTypeResult(status, null);
    }

    private boolean b(DataTypeResult datatyperesult)
    {
        return Eb.equals(datatyperesult.Eb) && jv.equal(TM, datatyperesult.TM);
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
        return TM;
    }

    public Status getStatus()
    {
        return Eb;
    }

    int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            Eb, TM
        });
    }

    public String toString()
    {
        return jv.h(this).a("status", Eb).a("dataType", TM).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        d.a(this, parcel, i);
    }

}
