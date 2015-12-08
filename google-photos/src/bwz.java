// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public final class bwz
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new bxa();
    public final Uri a;
    public final boolean b;

    bwz(Uri uri, boolean flag)
    {
        a = (Uri)b.a(uri, "uri", null);
        b = flag;
    }

    public static bwz a(Uri uri)
    {
        return new bwz(uri, true);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof bwz))
            {
                return false;
            }
            obj = (bwz)obj;
            if (b != ((bwz) (obj)).b || !a.equals(((bwz) (obj)).a))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return b.a(b, a.hashCode());
    }

    public final String toString()
    {
        return b.a(getClass(), new Object[] {
            a, Boolean.valueOf(b)
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
        byte byte0;
        if (b)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
    }

}
