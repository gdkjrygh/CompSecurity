// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.la;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.request:
//            h

public class DataSourcesRequest
    implements SafeParcelable
{
    public static class Builder
    {

        private boolean VT;
        private DataType VU[];
        private int VV[] = {
            0, 1
        };

        static DataType[] a(Builder builder)
        {
            return builder.VU;
        }

        static int[] b(Builder builder)
        {
            return builder.VV;
        }

        static boolean c(Builder builder)
        {
            return builder.VT;
        }

        public DataSourcesRequest build()
        {
            boolean flag1 = true;
            boolean flag;
            if (VU.length > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.a(flag, "Must add at least one data type");
            if (VV.length > 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            jx.a(flag, "Must add at least one data source type");
            return new DataSourcesRequest(this);
        }

        public transient Builder setDataSourceTypes(int ai[])
        {
            VV = ai;
            return this;
        }

        public transient Builder setDataTypes(DataType adatatype[])
        {
            VU = adatatype;
            return this;
        }

        public Builder()
        {
            VU = new DataType[0];
            VT = false;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new h();
    private final int CK;
    private final List TY;
    private final List VS;
    private final boolean VT;

    DataSourcesRequest(int i, List list, List list1, boolean flag)
    {
        CK = i;
        TY = list;
        VS = list1;
        VT = flag;
    }

    private DataSourcesRequest(Builder builder)
    {
        CK = 2;
        TY = la.b(Builder.a(builder));
        VS = Arrays.asList(la.a(Builder.b(builder)));
        VT = Builder.c(builder);
    }


    public int describeContents()
    {
        return 0;
    }

    public List getDataTypes()
    {
        return Collections.unmodifiableList(TY);
    }

    int getVersionCode()
    {
        return CK;
    }

    public boolean jY()
    {
        return VT;
    }

    List jZ()
    {
        return VS;
    }

    public String toString()
    {
        com.google.android.gms.internal.jv.a a = jv.h(this).a("dataTypes", TY).a("sourceTypes", VS);
        if (VT)
        {
            a.a("includeDbOnlySources", "true");
        }
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        h.a(this, parcel, i);
    }

}
