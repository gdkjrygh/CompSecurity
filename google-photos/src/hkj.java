// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public class hkj
    implements ekf, Comparable
{

    public static final android.os.Parcelable.Creator CREATOR = new hkk();
    private long a;
    private long b;
    private String c;
    private String d;

    public hkj(long l, long l1, String s, String s1)
    {
        a = l;
        b = l1;
        c = s;
        d = s1;
    }

    hkj(Parcel parcel)
    {
        a = parcel.readLong();
        b = parcel.readLong();
        c = parcel.readString();
        d = parcel.readString();
    }

    public final int a(hkj hkj1)
    {
        int i = Double.compare(hkj1.b, b);
        int j = i;
        if (i == 0)
        {
            j = Double.compare(hkj1.a, a);
        }
        i = j;
        if (j == 0)
        {
            if (c == null && hkj1.c == null)
            {
                i = 0;
            } else
            if (c == null)
            {
                i = 1;
            } else
            if (hkj1.c == null)
            {
                i = -1;
            } else
            {
                i = c.compareTo(hkj1.c);
            }
        }
        j = i;
        if (i == 0)
        {
            j = d.compareTo(hkj1.d);
        }
        return j;
    }

    public int compareTo(Object obj)
    {
        return a((hkj)obj);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(a);
        parcel.writeLong(b);
        parcel.writeString(c);
        parcel.writeString(d);
    }

}
