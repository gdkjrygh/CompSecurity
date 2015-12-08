// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.fitness.data:
//            s, DataSource, DataType

public class Subscription
    implements SafeParcelable
{
    public static class a
    {

        private DataType TM;
        private DataSource TN;
        private long UQ;
        private int UR;

        static DataType a(a a1)
        {
            return a1.TM;
        }

        static DataSource b(a a1)
        {
            return a1.TN;
        }

        static long c(a a1)
        {
            return a1.UQ;
        }

        static int d(a a1)
        {
            return a1.UR;
        }

        public a b(DataSource datasource)
        {
            TN = datasource;
            return this;
        }

        public a b(DataType datatype)
        {
            TM = datatype;
            return this;
        }

        public Subscription jK()
        {
label0:
            {
                boolean flag1 = false;
                boolean flag;
                if (TN != null || TM != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                jx.a(flag, "Must call setDataSource() or setDataType()");
                if (TM != null && TN != null)
                {
                    flag = flag1;
                    if (!TM.equals(TN.getDataType()))
                    {
                        break label0;
                    }
                }
                flag = true;
            }
            jx.a(flag, "Specified data type is incompatible with specified data source");
            return new Subscription(this);
        }

        public a()
        {
            UQ = -1L;
            UR = 2;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new s();
    private final int CK;
    private final DataType TM;
    private final DataSource TN;
    private final long UQ;
    private final int UR;

    Subscription(int i, DataSource datasource, DataType datatype, long l, int j)
    {
        CK = i;
        TN = datasource;
        TM = datatype;
        UQ = l;
        UR = j;
    }

    private Subscription(a a1)
    {
        CK = 1;
        TM = a.a(a1);
        TN = a.b(a1);
        UQ = a.c(a1);
        UR = a.d(a1);
    }


    private boolean a(Subscription subscription)
    {
        return jv.equal(TN, subscription.TN) && jv.equal(TM, subscription.TM) && UQ == subscription.UQ && UR == subscription.UR;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof Subscription) && a((Subscription)obj);
    }

    public int getAccuracyMode()
    {
        return UR;
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
            TN, TN, Long.valueOf(UQ), Integer.valueOf(UR)
        });
    }

    public long jI()
    {
        return UQ;
    }

    public DataType jJ()
    {
        if (TM == null)
        {
            return TN.getDataType();
        } else
        {
            return TM;
        }
    }

    public String toDebugString()
    {
        String s1;
        if (TN == null)
        {
            s1 = TM.getName();
        } else
        {
            s1 = TN.toDebugString();
        }
        return String.format("Subscription{%s}", new Object[] {
            s1
        });
    }

    public String toString()
    {
        return jv.h(this).a("dataSource", TN).a("dataType", TM).a("samplingIntervalMicros", Long.valueOf(UQ)).a("accuracyMode", Integer.valueOf(UR)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        s.a(this, parcel, i);
    }

}
