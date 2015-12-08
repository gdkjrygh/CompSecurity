// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jx;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.request:
//            f

public class e
    implements SafeParcelable
{
    public static class a
    {

        private DataSet UP;

        static DataSet a(a a1)
        {
            return a1.UP;
        }

        public a b(DataSet dataset)
        {
            UP = dataset;
            return this;
        }

        public e jU()
        {
            boolean flag1 = true;
            boolean flag;
            if (UP != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.a(flag, "Must set the data set");
            if (!UP.getDataPoints().isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.a(flag, "Cannot use an empty data set");
            if (UP.getDataSource().jx() != null)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            jx.a(flag, "Must set the app package name for the data source");
            return new e(this);
        }

        public a()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new f();
    private final int CK;
    private final DataSet UP;

    e(int i, DataSet dataset)
    {
        CK = i;
        UP = dataset;
    }

    private e(a a1)
    {
        CK = 1;
        UP = a.a(a1);
    }


    private boolean a(e e1)
    {
        return jv.equal(UP, e1.UP);
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
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            UP
        });
    }

    public DataSet jH()
    {
        return UP;
    }

    public String toString()
    {
        return jv.h(this).a("dataSet", UP).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        f.a(this, parcel, i);
    }

}
