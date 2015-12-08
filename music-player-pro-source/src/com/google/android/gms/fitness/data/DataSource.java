// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.mg;

// Referenced classes of package com.google.android.gms.fitness.data:
//            g, DataType, a, Device

public class DataSource
    implements SafeParcelable
{
    public static final class Builder
    {

        private int Gt;
        private DataType TM;
        private Device Ul;
        private a Um;
        private String Un;
        private boolean Uo;
        private String mName;

        static DataType a(Builder builder)
        {
            return builder.TM;
        }

        static int b(Builder builder)
        {
            return builder.Gt;
        }

        static String c(Builder builder)
        {
            return builder.mName;
        }

        static Device d(Builder builder)
        {
            return builder.Ul;
        }

        static a e(Builder builder)
        {
            return builder.Um;
        }

        static String f(Builder builder)
        {
            return builder.Un;
        }

        static boolean g(Builder builder)
        {
            return builder.Uo;
        }

        public DataSource build()
        {
            boolean flag1 = true;
            boolean flag;
            if (TM != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.gms.internal.jx.a(flag, "Must set data type");
            if (Gt >= 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            com.google.android.gms.internal.jx.a(flag, "Must set data source type");
            return new DataSource(this);
        }

        public Builder setAppPackageName(Context context)
        {
            return setAppPackageName(context.getPackageName());
        }

        public Builder setAppPackageName(String s)
        {
            Um = new a(s, null, null);
            return this;
        }

        public Builder setDataType(DataType datatype)
        {
            TM = datatype;
            return this;
        }

        public Builder setDevice(Device device)
        {
            Ul = device;
            return this;
        }

        public Builder setName(String s)
        {
            mName = s;
            return this;
        }

        public Builder setObfuscated(boolean flag)
        {
            Uo = flag;
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
            com.google.android.gms.internal.jx.b(flag, "Must specify a valid stream name");
            Un = s;
            return this;
        }

        public Builder setType(int i)
        {
            Gt = i;
            return this;
        }

        public Builder()
        {
            Gt = -1;
            Un = "";
            Uo = false;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new g();
    public static final String EXTRA_DATA_SOURCE = "vnd.google.fitness.data_source";
    public static final int TYPE_DERIVED = 1;
    public static final int TYPE_RAW = 0;
    private final int CK;
    private final int Gt;
    private final DataType TM;
    private final Device Ul;
    private final a Um;
    private final String Un;
    private final boolean Uo;
    private final String Up;
    private final String mName;

    DataSource(int i, DataType datatype, String s, int j, Device device, a a1, String s1, 
            boolean flag)
    {
        CK = i;
        TM = datatype;
        Gt = j;
        mName = s;
        Ul = device;
        Um = a1;
        Un = s1;
        Uo = flag;
        Up = jy();
    }

    private DataSource(Builder builder)
    {
        CK = 3;
        TM = Builder.a(builder);
        Gt = Builder.b(builder);
        mName = com.google.android.gms.fitness.data.Builder.c(builder);
        Ul = Builder.d(builder);
        Um = Builder.e(builder);
        Un = Builder.f(builder);
        Uo = Builder.g(builder);
        Up = jy();
    }


    private boolean a(DataSource datasource)
    {
        return Up.equals(datasource.Up);
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
        switch (Gt)
        {
        default:
            throw new IllegalArgumentException("invalid type value");

        case 0: // '\0'
            return "raw";

        case 1: // '\001'
            return "derived";
        }
    }

    private String jy()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(getTypeString());
        stringbuilder.append(":").append(TM.getName());
        if (Um != null)
        {
            stringbuilder.append(":").append(Um.getPackageName());
        }
        if (Ul != null)
        {
            stringbuilder.append(":").append(Ul.getStreamIdentifier());
        }
        if (Un != null)
        {
            stringbuilder.append(":").append(Un);
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
        if (Um == null)
        {
            return null;
        } else
        {
            return Um.getPackageName();
        }
    }

    public DataType getDataType()
    {
        return TM;
    }

    public Device getDevice()
    {
        return Ul;
    }

    public String getName()
    {
        return mName;
    }

    public String getStreamIdentifier()
    {
        return Up;
    }

    public String getStreamName()
    {
        return Un;
    }

    public int getType()
    {
        return Gt;
    }

    int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return Up.hashCode();
    }

    public DataSource jA()
    {
        Device device;
        a a1;
        if (Ul == null)
        {
            device = null;
        } else
        {
            device = Ul.jE();
        }
        if (Um == null)
        {
            a1 = null;
        } else
        {
            a1 = Um.jl();
        }
        return new DataSource(3, TM, mName, Gt, device, a1, mg.bw(Un), Uo);
    }

    public a jx()
    {
        return Um;
    }

    public boolean jz()
    {
        return Uo;
    }

    public String toDebugString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (Gt == 0)
        {
            s = "r";
        } else
        {
            s = "d";
        }
        stringbuilder = stringbuilder.append(s).append(":").append(TM.jB());
        if (Um == null)
        {
            s = "";
        } else
        if (Um.equals(a.TT))
        {
            s = ":gms";
        } else
        {
            s = (new StringBuilder()).append(":").append(Um.getPackageName()).toString();
        }
        stringbuilder = stringbuilder.append(s);
        if (Ul != null)
        {
            s = (new StringBuilder()).append(":").append(Ul.getModel()).append(":").append(Ul.getUid()).toString();
        } else
        {
            s = "";
        }
        stringbuilder = stringbuilder.append(s);
        if (Un != null)
        {
            s = (new StringBuilder()).append(":").append(Un).toString();
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
        if (Um != null)
        {
            stringbuilder.append(":").append(Um);
        }
        if (Ul != null)
        {
            stringbuilder.append(":").append(Ul);
        }
        if (Un != null)
        {
            stringbuilder.append(":").append(Un);
        }
        stringbuilder.append(":").append(TM);
        return stringbuilder.append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        g.a(mg.c(this), parcel, i);
    }

}
