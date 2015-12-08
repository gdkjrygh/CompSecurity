// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.kw;

// Referenced classes of package com.google.android.gms.fitness.data:
//            g, DataType, a, Device

public class DataSource
    implements SafeParcelable
{
    public static final class Builder
    {

        private int FD;
        private Device SO;
        private a SP;
        private String SQ;
        private boolean SR;
        private DataType Sp;
        private String mName;

        static DataType a(Builder builder)
        {
            return builder.Sp;
        }

        static int b(Builder builder)
        {
            return builder.FD;
        }

        static String c(Builder builder)
        {
            return builder.mName;
        }

        static Device d(Builder builder)
        {
            return builder.SO;
        }

        static a e(Builder builder)
        {
            return builder.SP;
        }

        static String f(Builder builder)
        {
            return builder.SQ;
        }

        static boolean g(Builder builder)
        {
            return builder.SR;
        }

        public DataSource build()
        {
            boolean flag1 = true;
            boolean flag;
            if (Sp != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.a(flag, "Must set data type");
            if (FD >= 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            o.a(flag, "Must set data source type");
            return new DataSource(this);
        }

        public Builder setAppPackageName(Context context)
        {
            return setAppPackageName(context.getPackageName());
        }

        public Builder setAppPackageName(String s)
        {
            SP = new a(s, null, null);
            return this;
        }

        public Builder setDataType(DataType datatype)
        {
            Sp = datatype;
            return this;
        }

        public Builder setDevice(Device device)
        {
            SO = device;
            return this;
        }

        public Builder setName(String s)
        {
            mName = s;
            return this;
        }

        public Builder setObfuscated(boolean flag)
        {
            SR = flag;
            return this;
        }

        public Builder setStreamName(String s)
        {
            boolean flag;
            if (s != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.b(flag, "Must specify a valid stream name");
            SQ = s;
            return this;
        }

        public Builder setType(int i)
        {
            FD = i;
            return this;
        }

        public Builder()
        {
            FD = -1;
            SQ = "";
            SR = false;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new g();
    public static final String EXTRA_DATA_SOURCE = "vnd.google.fitness.data_source";
    public static final int TYPE_DERIVED = 1;
    public static final int TYPE_RAW = 0;
    private final int BR;
    private final int FD;
    private final Device SO;
    private final a SP;
    private final String SQ;
    private final boolean SR;
    private final String SS;
    private final DataType Sp;
    private final String mName;

    DataSource(int i, DataType datatype, String s, int j, Device device, a a1, String s1, 
            boolean flag)
    {
        BR = i;
        Sp = datatype;
        FD = j;
        mName = s;
        SO = device;
        SP = a1;
        SQ = s1;
        SR = flag;
        SS = iN();
    }

    private DataSource(Builder builder)
    {
        BR = 3;
        Sp = Builder.a(builder);
        FD = Builder.b(builder);
        mName = com.google.android.gms.fitness.data.Builder.c(builder);
        SO = Builder.d(builder);
        SP = Builder.e(builder);
        SQ = Builder.f(builder);
        SR = Builder.g(builder);
        SS = iN();
    }


    private boolean a(DataSource datasource)
    {
        return SS.equals(datasource.SS);
    }

    public static DataSource extract(Intent intent)
    {
        if (intent == null)
        {
            return null;
        } else
        {
            return (DataSource)c.a(intent, "vnd.google.fitness.data_source", CREATOR);
        }
    }

    private String getTypeString()
    {
        switch (FD)
        {
        default:
            throw new IllegalArgumentException("invalid type value");

        case 0: // '\0'
            return "raw";

        case 1: // '\001'
            return "derived";
        }
    }

    private String iN()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(getTypeString());
        stringbuilder.append(":").append(Sp.getName());
        if (SP != null)
        {
            stringbuilder.append(":").append(SP.getPackageName());
        }
        if (SO != null)
        {
            stringbuilder.append(":").append(SO.getStreamIdentifier());
        }
        if (SQ != null)
        {
            stringbuilder.append(":").append(SQ);
        }
        return stringbuilder.toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof DataSource) && a((DataSource)obj);
    }

    public String getAppPackageName()
    {
        if (SP == null)
        {
            return null;
        } else
        {
            return SP.getPackageName();
        }
    }

    public DataType getDataType()
    {
        return Sp;
    }

    public Device getDevice()
    {
        return SO;
    }

    public String getName()
    {
        return mName;
    }

    public String getStreamIdentifier()
    {
        return SS;
    }

    public String getStreamName()
    {
        return SQ;
    }

    public int getType()
    {
        return FD;
    }

    int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return SS.hashCode();
    }

    public a iM()
    {
        return SP;
    }

    public boolean iO()
    {
        return SR;
    }

    public DataSource iP()
    {
        Device device;
        a a1;
        if (SO == null)
        {
            device = null;
        } else
        {
            device = SO.iT();
        }
        if (SP == null)
        {
            a1 = null;
        } else
        {
            a1 = SP.iA();
        }
        return new DataSource(3, Sp, mName, FD, device, a1, kw.bt(SQ), SR);
    }

    public String toDebugString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (FD == 0)
        {
            s = "r";
        } else
        {
            s = "d";
        }
        stringbuilder = stringbuilder.append(s).append(":").append(Sp.iQ());
        if (SP == null)
        {
            s = "";
        } else
        if (SP.equals(a.Sw))
        {
            s = ":gms";
        } else
        {
            s = (new StringBuilder()).append(":").append(SP.getPackageName()).toString();
        }
        stringbuilder = stringbuilder.append(s);
        if (SO != null)
        {
            s = (new StringBuilder()).append(":").append(SO.getModel()).append(":").append(SO.getUid()).toString();
        } else
        {
            s = "";
        }
        stringbuilder = stringbuilder.append(s);
        if (SQ != null)
        {
            s = (new StringBuilder()).append(":").append(SQ).toString();
        } else
        {
            s = "";
        }
        return stringbuilder.append(s).toString();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("DataSource{");
        stringbuilder.append(getTypeString());
        if (mName != null)
        {
            stringbuilder.append(":").append(mName);
        }
        if (SP != null)
        {
            stringbuilder.append(":").append(SP);
        }
        if (SO != null)
        {
            stringbuilder.append(":").append(SO);
        }
        if (SQ != null)
        {
            stringbuilder.append(":").append(SQ);
        }
        stringbuilder.append(":").append(Sp);
        return stringbuilder.append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        g.a(kw.c(this), parcel, i);
    }

}
