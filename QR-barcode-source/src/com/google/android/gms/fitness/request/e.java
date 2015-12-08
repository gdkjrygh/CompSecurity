// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.request:
//            f

public class e
    implements SafeParcelable
{
    public static class a
    {

        private DataSet Ts;

        static DataSet a(a a1)
        {
            return a1.Ts;
        }

        public a b(DataSet dataset)
        {
            Ts = dataset;
            return this;
        }

        public e jj()
        {
            boolean flag1 = true;
            boolean flag;
            if (Ts != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.a(flag, "Must set the data set");
            if (!Ts.getDataPoints().isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.a(flag, "Cannot use an empty data set");
            if (Ts.getDataSource().iM() != null)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            o.a(flag, "Must set the app package name for the data source");
            return new e(this);
        }

        public a()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new f();
    private final int BR;
    private final DataSet Ts;

    e(int i, DataSet dataset)
    {
        BR = i;
        Ts = dataset;
    }

    private e(a a1)
    {
        BR = 1;
        Ts = a.a(a1);
    }


    private boolean a(e e1)
    {
        return n.equal(Ts, e1.Ts);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof e) && a((e)obj);
    }

    int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            Ts
        });
    }

    public DataSet iW()
    {
        return Ts;
    }

    public String toString()
    {
        return n.h(this).a("dataSet", Ts).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        f.a(this, parcel, i);
    }

}
