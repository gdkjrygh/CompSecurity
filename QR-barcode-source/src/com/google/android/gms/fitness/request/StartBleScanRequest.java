// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.jr;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.request:
//            ac, l, BleScanCallback

public class StartBleScanRequest
    implements SafeParcelable
{
    public static class Builder
    {

        private l UQ;
        private int UR;
        private DataType Uy[];

        static DataType[] a(Builder builder)
        {
            return builder.Uy;
        }

        static l b(Builder builder)
        {
            return builder.UQ;
        }

        static int c(Builder builder)
        {
            return builder.UR;
        }

        public Builder a(l l1)
        {
            UQ = l1;
            return this;
        }

        public StartBleScanRequest build()
        {
            boolean flag;
            if (UQ != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.a(flag, "Must set BleScanCallback");
            return new StartBleScanRequest(this);
        }

        public Builder setBleScanCallback(BleScanCallback blescancallback)
        {
            a(com.google.android.gms.fitness.request.a.a.je().a(blescancallback));
            return this;
        }

        public transient Builder setDataTypes(DataType adatatype[])
        {
            Uy = adatatype;
            return this;
        }

        public Builder setTimeoutSecs(int i)
        {
            boolean flag1 = true;
            boolean flag;
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.b(flag, "Stop time must be greater than zero");
            if (i <= 60)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            o.b(flag, "Stop time must be less than 1 minute");
            UR = i;
            return this;
        }

        public Builder()
        {
            Uy = new DataType[0];
            UR = 10;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new ac();
    private final int BR;
    private final List SB;
    private final l UQ;
    private final int UR;

    StartBleScanRequest(int i, List list, IBinder ibinder, int j)
    {
        BR = i;
        SB = list;
        UQ = l.a.ay(ibinder);
        UR = j;
    }

    private StartBleScanRequest(Builder builder)
    {
        BR = 2;
        SB = jr.b(Builder.a(builder));
        UQ = Builder.b(builder);
        UR = Builder.c(builder);
    }


    public int describeContents()
    {
        return 0;
    }

    public List getDataTypes()
    {
        return Collections.unmodifiableList(SB);
    }

    public int getTimeoutSecs()
    {
        return UR;
    }

    int getVersionCode()
    {
        return BR;
    }

    public IBinder jC()
    {
        return UQ.asBinder();
    }

    public String toString()
    {
        return n.h(this).a("dataTypes", SB).a("timeoutSecs", Integer.valueOf(UR)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ac.a(this, parcel, i);
    }

}
