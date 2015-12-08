// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public final class cnx
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new cny();
    public final cqa a;
    public final long b;
    public final int c;
    public final Uri d;
    public final long e;
    public final int f;
    private final long g[];

    cnx(Parcel parcel)
    {
        a = (cqa)cqa.CREATOR.createFromParcel(parcel);
        g = parcel.createLongArray();
        b = parcel.readLong();
        c = parcel.readInt();
        d = (Uri)Uri.CREATOR.createFromParcel(parcel);
        e = parcel.readLong();
        f = parcel.readInt();
    }

    public cnx(cqa cqa1, long al[], long l, long l1, int i, 
            Uri uri, int j)
    {
        b.a(al, "beatTimesUs", null);
        b.a(a(al), "beat times must be strictly increasing");
        if (al.length > 0)
        {
            boolean flag;
            if (al[al.length - 1] < l)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b.a(flag, "final beat time must be less than duration");
        }
        a = (cqa)b.a(cqa1, "soundtrack", null);
        g = (long[])b.a(al, "beatTimesUs", null);
        b = l;
        e = l1;
        c = i;
        d = (Uri)b.a(uri, "fileUri", null);
        f = j;
    }

    private static boolean a(long al[])
    {
        boolean flag1 = true;
        int i = 1;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < al.length)
                {
                    if (al[i] > al[i - 1])
                    {
                        break label0;
                    }
                    flag = false;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public final long[] a()
    {
        return (long[])g.clone();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, 0);
        parcel.writeLongArray(g);
        parcel.writeLong(b);
        parcel.writeInt(c);
        parcel.writeParcelable(d, 0);
        parcel.writeLong(e);
        parcel.writeInt(f);
    }

}
