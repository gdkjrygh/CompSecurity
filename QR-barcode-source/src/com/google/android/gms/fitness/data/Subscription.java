// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.fitness.data:
//            s, DataSource, DataType

public class Subscription
    implements SafeParcelable
{
    public static class a
    {

        private DataType Sp;
        private DataSource Sq;
        private long Tt;
        private int Tu;

        static DataType a(a a1)
        {
            return a1.Sp;
        }

        static DataSource b(a a1)
        {
            return a1.Sq;
        }

        static long c(a a1)
        {
            return a1.Tt;
        }

        static int d(a a1)
        {
            return a1.Tu;
        }

        public a b(DataSource datasource)
        {
            Sq = datasource;
            return this;
        }

        public a b(DataType datatype)
        {
            Sp = datatype;
            return this;
        }

        public Subscription iZ()
        {
label0:
            {
                boolean flag1 = false;
                boolean flag;
                if (Sq != null || Sp != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                o.a(flag, "Must call setDataSource() or setDataType()");
                if (Sp != null && Sq != null)
                {
                    flag = flag1;
                    if (!Sp.equals(Sq.getDataType()))
                    {
                        break label0;
                    }
                }
                flag = true;
            }
            o.a(flag, "Specified data type is incompatible with specified data source");
            return new Subscription(this);
        }

        public a()
        {
            Tt = -1L;
            Tu = 2;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new s();
    private final int BR;
    private final DataType Sp;
    private final DataSource Sq;
    private final long Tt;
    private final int Tu;

    Subscription(int i, DataSource datasource, DataType datatype, long l, int j)
    {
        BR = i;
        Sq = datasource;
        Sp = datatype;
        Tt = l;
        Tu = j;
    }

    private Subscription(a a1)
    {
        BR = 1;
        Sp = a.a(a1);
        Sq = a.b(a1);
        Tt = a.c(a1);
        Tu = a.d(a1);
    }


    private boolean a(Subscription subscription)
    {
        return n.equal(Sq, subscription.Sq) && n.equal(Sp, subscription.Sp) && Tt == subscription.Tt && Tu == subscription.Tu;
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
        return Tu;
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
            Sq, Sq, Long.valueOf(Tt), Integer.valueOf(Tu)
        });
    }

    public long iX()
    {
        return Tt;
    }

    public DataType iY()
    {
        if (Sp == null)
        {
            return Sq.getDataType();
        } else
        {
            return Sp;
        }
    }

    public String toDebugString()
    {
        String s1;
        if (Sq == null)
        {
            s1 = Sp.getName();
        } else
        {
            s1 = Sq.toDebugString();
        }
        return String.format("Subscription{%s}", new Object[] {
            s1
        });
    }

    public String toString()
    {
        return n.h(this).a("dataSource", Sq).a("dataType", Sp).a("samplingIntervalMicros", Long.valueOf(Tt)).a("accuracyMode", Integer.valueOf(Tu)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        s.a(this, parcel, i);
    }

}
