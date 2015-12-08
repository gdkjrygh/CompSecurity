// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.jv;

// Referenced classes of package com.google.android.gms.fitness.request:
//            ak

public class aj
    implements SafeParcelable
{
    public static class a
    {

        private DataType TM;
        private DataSource TN;

        static DataType a(a a1)
        {
            return a1.TM;
        }

        static DataSource b(a a1)
        {
            return a1.TN;
        }

        public a d(DataSource datasource)
        {
            TN = datasource;
            return this;
        }

        public a d(DataType datatype)
        {
            TM = datatype;
            return this;
        }

        public aj kq()
        {
            if (TM != null && TN != null)
            {
                throw new IllegalArgumentException("Cannot specify both dataType and dataSource");
            } else
            {
                return new aj(this);
            }
        }

        public a()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new ak();
    private final int CK;
    private final DataType TM;
    private final DataSource TN;

    aj(int i, DataType datatype, DataSource datasource)
    {
        CK = i;
        TM = datatype;
        TN = datasource;
    }

    private aj(a a1)
    {
        CK = 1;
        TM = a.a(a1);
        TN = a.b(a1);
    }


    private boolean a(aj aj1)
    {
        return jv.equal(TN, aj1.TN) && jv.equal(TM, aj1.TM);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof aj) && a((aj)obj);
    }

    public DataSource getDataSource()
    {
        return TN;
    }

    public DataType getDataType()
    {
        return TM;
    }

    int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            TN, TM
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ak.a(this, parcel, i);
    }

}
