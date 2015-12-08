// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class nef
    implements Parcelable, Comparable
{

    public static final android.os.Parcelable.Creator CREATOR = new neg();
    public final int a;
    public final long b;
    private final long c;

    nef(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readLong();
        c = parcel.readLong();
    }

    public final int compareTo(Object obj)
    {
        obj = (nef)obj;
        if (c == ((nef) (obj)).c)
        {
            return Long.signum(((nef) (obj)).b - b);
        } else
        {
            return Long.signum(((nef) (obj)).c - c);
        }
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof nef)
            {
                obj = (nef)obj;
                if (b != ((nef) (obj)).b)
                {
                    return false;
                }
                if (c != ((nef) (obj)).c)
                {
                    return false;
                }
                if (a != ((nef) (obj)).a)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return (((int)(b ^ b >>> 32) + 31) * 31 + (int)(c ^ c >>> 32)) * 31 + a;
    }

    public final String toString()
    {
        int i = a;
        long l = b;
        String s = String.valueOf(b.e(c));
        return (new StringBuilder(String.valueOf(s).length() + 45)).append("LocalPhoto{").append(i).append("/").append(l).append(" ").append(s).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeLong(b);
        parcel.writeLong(c);
    }

}
