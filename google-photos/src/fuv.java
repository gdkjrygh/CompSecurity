// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public class fuv
    implements ekp, Comparable
{

    public static final android.os.Parcelable.Creator CREATOR = new fuw();
    final int a;
    final int b;
    final long c;
    final long d;
    final elm e;
    final ekq f;
    final euv g;

    fuv(int i, int j, long l, long l1, ekq ekq1, 
            euv euv1, elm elm1)
    {
        a = i;
        b = j;
        c = l;
        d = l1;
        f = ekq1;
        e = elm1;
        g = euv1;
    }

    fuv(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readInt();
        c = parcel.readLong();
        d = parcel.readLong();
        f = (ekq)parcel.readParcelable(ekq.getClassLoader());
        e = (elm)parcel.readParcelable(elm.getClassLoader());
        g = euv.values()[parcel.readInt()];
    }

    public final ekf a(Class class1)
    {
        return e.a(class1);
    }

    public final String a()
    {
        return "com.google.android.apps.photos.localmedia.core.LocalMediaCore";
    }

    public final long b()
    {
        return c;
    }

    public final ekf b(Class class1)
    {
        return e.b(class1);
    }

    public final euv c()
    {
        return g;
    }

    public int compareTo(Object obj)
    {
        int i;
        i = 1;
        obj = (fuv)obj;
        if (d != ((fuv) (obj)).d) goto _L2; else goto _L1
_L1:
        if (((fuv) (obj)).c != c) goto _L4; else goto _L3
_L3:
        i = 0;
_L6:
        return i;
_L4:
        if (((fuv) (obj)).c <= c)
        {
            return -1;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        long l = ((fuv) (obj)).d - d;
        if (l == 0L)
        {
            return 0;
        }
        if (l <= 0L)
        {
            return -1;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final long d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public final ekq e()
    {
        return f;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof fuv)
        {
            if (c == ((fuv) (obj = (fuv)obj)).c && a == ((fuv) (obj)).a)
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return c.a(c, a + 527);
    }

    public String toString()
    {
        int i = b;
        long l = c;
        String s = String.valueOf(b.e(d));
        return (new StringBuilder(String.valueOf(s).length() + 45)).append("LocalPhoto{").append(i).append("/").append(l).append(" ").append(s).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeInt(b);
        parcel.writeLong(c);
        parcel.writeLong(d);
        parcel.writeParcelable(f, i);
        parcel.writeParcelable(e, i);
        parcel.writeInt(g.ordinal());
    }

}
