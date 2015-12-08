// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class nom
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new non();
    public final noo a;
    public final pye b;
    public final String c;
    private int d;

    public nom(noo noo1, int i, pye pye, String s)
    {
        if (noo1 == null)
        {
            throw new IllegalArgumentException("status cannot be null");
        }
        if (noo1 == noo.a)
        {
            if (pye == null)
            {
                throw new IllegalArgumentException("null storyboard with OK status");
            }
            if (s == null)
            {
                throw new IllegalArgumentException("null versionId with OK status");
            }
        }
        a = noo1;
        d = i;
        b = pye;
        c = s;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        noo noo1 = a;
        int i = d;
        String s;
        if (b == null)
        {
            s = "null";
        } else
        {
            s = b.b(b);
        }
        return String.format("GetStoryboardResult[%s, %s, %s, %s]", new Object[] {
            noo1, Integer.valueOf(i), s, c
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeByte((byte)a.ordinal());
        parcel.writeInt(d);
        if (b != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
        if (b != null)
        {
            parcel.writeByteArray(qlw.a(b));
        }
        parcel.writeString(c);
    }

}
