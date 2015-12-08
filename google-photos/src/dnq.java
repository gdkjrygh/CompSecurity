// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class dnq
    implements ekf
{

    public static final android.os.Parcelable.Creator CREATOR = new dnr();
    public int a;
    public String b;
    public String c;
    Integer d;
    public String e;
    public String f;
    public boolean g;
    String h;
    public boolean i;
    private gka j;

    public dnq(int k, String s, gka gka1, String s1, boolean flag)
    {
        j = gka1;
        a = k;
        b = "";
        c = s;
        d = Integer.valueOf(gka1.a);
        e = "";
        f = s1;
        g = flag;
        h = "";
        i = true;
    }

    public dnq(int k, String s, String s1, Integer integer, String s2, String s3, boolean flag, 
            String s4)
    {
        a = k;
        b = s;
        c = s1;
        d = integer;
        e = s2;
        f = s3;
        g = flag;
        h = s4;
        i = false;
    }

    dnq(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        j = (gka)parcel.readParcelable(gka.getClassLoader());
        a = parcel.readInt();
        b = parcel.readString();
        c = parcel.readString();
        d = (Integer)parcel.readSerializable();
        e = parcel.readString();
        f = parcel.readString();
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        h = parcel.readString();
        if (parcel.readInt() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        i = flag;
    }

    public final int a()
    {
        if (d == null)
        {
            return -1;
        } else
        {
            return d.intValue();
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int k)
    {
        boolean flag = true;
        parcel.writeParcelable(j, k);
        parcel.writeInt(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeSerializable(d);
        parcel.writeString(e);
        parcel.writeString(f);
        if (g)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        parcel.writeInt(k);
        parcel.writeString(h);
        if (i)
        {
            k = ((flag) ? 1 : 0);
        } else
        {
            k = 0;
        }
        parcel.writeInt(k);
    }

}
