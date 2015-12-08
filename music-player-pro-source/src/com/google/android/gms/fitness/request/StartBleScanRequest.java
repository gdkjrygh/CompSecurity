// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.la;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.request:
//            ac, l, BleScanCallback

public class StartBleScanRequest
    implements SafeParcelable
{
    public static class Builder
    {

        private DataType VU[];
        private l Wm;
        private int Wn;

        static DataType[] a(Builder builder)
        {
            return builder.VU;
        }

        static l b(Builder builder)
        {
            return builder.Wm;
        }

        static int c(Builder builder)
        {
            return builder.Wn;
        }

        public Builder a(l l1)
        {
            Wm = l1;
            return this;
        }

        public StartBleScanRequest build()
        {
            boolean flag;
            if (Wm != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.a(flag, "Must set BleScanCallback");
            return new StartBleScanRequest(this);
        }

        public Builder setBleScanCallback(BleScanCallback blescancallback)
        {
            a(com.google.android.gms.fitness.request.a.a.jP().a(blescancallback));
            return this;
        }

        public transient Builder setDataTypes(DataType adatatype[])
        {
            VU = adatatype;
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
            jx.b(flag, "Stop time must be greater than zero");
            if (i <= 60)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            jx.b(flag, "Stop time must be less than 1 minute");
            Wn = i;
            return this;
        }

        public Builder()
        {
            VU = new DataType[0];
            Wn = 10;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new ac();
    private final int CK;
    private final List TY;
    private final l Wm;
    private final int Wn;

    StartBleScanRequest(int i, List list, IBinder ibinder, int j)
    {
        CK = i;
        TY = list;
        Wm = l.a.aB(ibinder);
        Wn = j;
    }

    private StartBleScanRequest(Builder builder)
    {
        CK = 2;
        TY = la.b(Builder.a(builder));
        Wm = Builder.b(builder);
        Wn = Builder.c(builder);
    }


    public int describeContents()
    {
        return 0;
    }

    public List getDataTypes()
    {
        return Collections.unmodifiableList(TY);
    }

    public int getTimeoutSecs()
    {
        return Wn;
    }

    int getVersionCode()
    {
        return CK;
    }

    public IBinder km()
    {
        return Wm.asBinder();
    }

    public String toString()
    {
        return jv.h(this).a("dataTypes", TY).a("timeoutSecs", Integer.valueOf(Wn)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ac.a(this, parcel, i);
    }

}
