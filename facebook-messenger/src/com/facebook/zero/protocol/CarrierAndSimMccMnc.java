// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.protocol;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.a.es;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.zero.protocol:
//            a

public class CarrierAndSimMccMnc
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final MccMncPair a;
    private final MccMncPair b;

    private CarrierAndSimMccMnc(Parcel parcel)
    {
        a = (MccMncPair)parcel.readParcelable(com/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair.getClassLoader());
        b = (MccMncPair)parcel.readParcelable(com/facebook/zero/protocol/CarrierAndSimMccMnc$MccMncPair.getClassLoader());
    }

    CarrierAndSimMccMnc(Parcel parcel, a a1)
    {
        this(parcel);
    }

    public CarrierAndSimMccMnc(MccMncPair mccmncpair, MccMncPair mccmncpair1)
    {
        a = mccmncpair;
        b = mccmncpair1;
    }

    public CarrierAndSimMccMnc(String s)
    {
        s = es.a(s.split(":"));
        boolean flag;
        if (s.size() == 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        a = new MccMncPair((String)s.get(0), (String)s.get(1));
        b = new MccMncPair((String)s.get(2), (String)s.get(3));
    }

    public MccMncPair a()
    {
        return a;
    }

    public MccMncPair b()
    {
        return b;
    }

    public String c()
    {
        return (new StringBuilder()).append(a.a()).append(":").append(a.b()).append(":").append(b.a()).append(":").append(b.b()).toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof CarrierAndSimMccMnc))
        {
            if (a.equals(((CarrierAndSimMccMnc) (obj = (CarrierAndSimMccMnc)obj)).a()) && b.equals(((CarrierAndSimMccMnc) (obj)).b()))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            a, b
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
        parcel.writeParcelable(b, i);
    }


    private class MccMncPair
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new b();
        private final String a;
        private final String b;

        public String a()
        {
            return a;
        }

        public String b()
        {
            return b;
        }

        public int describeContents()
        {
            return 0;
        }

        public boolean equals(Object obj)
        {
            if (obj == null || !(obj instanceof MccMncPair))
            {
                return false;
            }
            return a.equals(((MccMncPair)obj).a()) && b.equals(((MccMncPair)obj).b());
        }

        public int hashCode()
        {
            return Objects.hashCode(new Object[] {
                a, b
            });
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(a);
            parcel.writeString(b);
        }


        private MccMncPair(Parcel parcel)
        {
            a = parcel.readString();
            b = parcel.readString();
        }

        MccMncPair(Parcel parcel, a a1)
        {
            this(parcel);
        }

        public MccMncPair(String s, String s1)
        {
            a = s;
            b = s1;
        }
    }

}
