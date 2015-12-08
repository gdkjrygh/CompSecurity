// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.graphics;

import android.os.Parcel;

// Referenced classes of package com.aviary.android.feather.library.graphics:
//            IGeom

public class RectD
    implements IGeom
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public RectD a(Parcel parcel)
        {
            RectD rectd = new RectD();
            rectd.a(parcel);
            return rectd;
        }

        public RectD[] a(int i)
        {
            return new RectD[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    public double a;
    public double b;
    public double c;
    public double d;

    public RectD()
    {
    }

    public RectD(double d1, double d2, double d3, double d4)
    {
        a = d1;
        b = d2;
        c = d3;
        d = d4;
    }

    public RectD(RectD rectd)
    {
        a = rectd.a;
        b = rectd.b;
        c = rectd.c;
        d = rectd.d;
    }

    public final double a()
    {
        return c - a;
    }

    public void a(double d1, double d2)
    {
        a = a + d1;
        b = b + d2;
        c = c + d1;
        d = d + d2;
    }

    public void a(double d1, double d2, double d3, double d4)
    {
        a = d1;
        b = d2;
        c = d3;
        d = d4;
    }

    public void a(Parcel parcel)
    {
        a = parcel.readDouble();
        b = parcel.readDouble();
        c = parcel.readDouble();
        d = parcel.readDouble();
    }

    public void a(RectD rectd)
    {
        a = rectd.a;
        b = rectd.b;
        c = rectd.c;
        d = rectd.d;
    }

    public final double b()
    {
        return d - b;
    }

    public void b(double d1, double d2)
    {
        a = a + d1;
        b = b + d2;
        c = c - d1;
        d = d - d2;
    }

    public boolean b(RectD rectd)
    {
        return a < c && b < d && a <= rectd.a && b <= rectd.b && c >= rectd.c && d >= rectd.d;
    }

    public void c()
    {
        if (a > c)
        {
            double d1 = a;
            a = c;
            c = d1;
        }
        if (b > d)
        {
            double d2 = b;
            b = d;
            d = d2;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (RectD)obj;
            if (a != ((RectD) (obj)).a || b != ((RectD) (obj)).b || c != ((RectD) (obj)).c || d != ((RectD) (obj)).d)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return ((Double.valueOf(a).hashCode() * 31 + Double.valueOf(b).hashCode()) * 31 + Double.valueOf(c).hashCode()) * 31 + Double.valueOf(d).hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("RectD(").append(a).append(", ").append(b).append(", ").append(c).append(", ").append(d).append(")").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeDouble(a);
        parcel.writeDouble(b);
        parcel.writeDouble(c);
        parcel.writeDouble(d);
    }

}
