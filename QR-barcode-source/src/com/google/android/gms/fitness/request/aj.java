// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;

// Referenced classes of package com.google.android.gms.fitness.request:
//            ak

public class aj
    implements SafeParcelable
{
    public static class a
    {

        private DataType Sp;
        private DataSource Sq;

        static DataType a(a a1)
        {
            return a1.Sp;
        }

        static DataSource b(a a1)
        {
            return a1.Sq;
        }

        public a d(DataSource datasource)
        {
            Sq = datasource;
            return this;
        }

        public a d(DataType datatype)
        {
            Sp = datatype;
            return this;
        }

        public aj jG()
        {
            if (Sp != null && Sq != null)
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
    private final int BR;
    private final DataType Sp;
    private final DataSource Sq;

    aj(int i, DataType datatype, DataSource datasource)
    {
        BR = i;
        Sp = datatype;
        Sq = datasource;
    }

    private aj(a a1)
    {
        BR = 1;
        Sp = a.a(a1);
        Sq = a.b(a1);
    }


    private boolean a(aj aj1)
    {
        return n.equal(Sq, aj1.Sq) && n.equal(Sp, aj1.Sp);
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
        return Sq;
    }

    public DataType getDataType()
    {
        return Sp;
    }

    int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            Sq, Sp
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ak.a(this, parcel, i);
    }

}
