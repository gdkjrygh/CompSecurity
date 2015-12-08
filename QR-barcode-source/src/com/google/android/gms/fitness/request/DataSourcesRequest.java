// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.jr;
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

        private boolean Ux;
        private DataType Uy[];
        private int Uz[] = {
            0, 1
        };

        static DataType[] a(Builder builder)
        {
            return builder.Uy;
        }

        static int[] b(Builder builder)
        {
            return builder.Uz;
        }

        static boolean c(Builder builder)
        {
            return builder.Ux;
        }

        public DataSourcesRequest build()
        {
            boolean flag1 = true;
            boolean flag;
            if (Uy.length > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.a(flag, "Must add at least one data type");
            if (Uz.length > 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            o.a(flag, "Must add at least one data source type");
            return new DataSourcesRequest(this);
        }

        public transient Builder setDataSourceTypes(int ai[])
        {
            Uz = ai;
            return this;
        }

        public transient Builder setDataTypes(DataType adatatype[])
        {
            Uy = adatatype;
            return this;
        }

        public Builder()
        {
            Uy = new DataType[0];
            Ux = false;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new h();
    private final int BR;
    private final List SB;
    private final List Uw;
    private final boolean Ux;

    DataSourcesRequest(int i, List list, List list1, boolean flag)
    {
        BR = i;
        SB = list;
        Uw = list1;
        Ux = flag;
    }

    private DataSourcesRequest(Builder builder)
    {
        BR = 2;
        SB = jr.b(Builder.a(builder));
        Uw = Arrays.asList(jr.a(Builder.b(builder)));
        Ux = Builder.c(builder);
    }


    public int describeContents()
    {
        return 0;
    }

    public List getDataTypes()
    {
        return Collections.unmodifiableList(SB);
    }

    int getVersionCode()
    {
        return BR;
    }

    public boolean jo()
    {
        return Ux;
    }

    List jp()
    {
        return Uw;
    }

    public String toString()
    {
        com.google.android.gms.common.internal.n.a a = n.h(this).a("dataTypes", SB).a("sourceTypes", Uw);
        if (Ux)
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
