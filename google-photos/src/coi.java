// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public class coi
    implements Parcelable
{

    public final int a;
    public final long b;
    public final int c;
    public final int d;
    public final coj e;

    protected coi(long l, int i, int j, int k, coj coj1)
    {
        b = l;
        a = i;
        c = j;
        d = k;
        e = coj1;
    }

    public coi(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readLong();
        c = parcel.readInt();
        d = parcel.readInt();
        e = coj.values()[parcel.readInt()];
    }

    protected coi(coj coj1)
    {
        this(-1L, -1, -1, -1, coj1);
    }

    public final cql a()
    {
        c.a(e, "type", coj.a);
        return (cql)this;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return b.a(getClass(), new Object[] {
            Integer.valueOf(a), Long.valueOf(b), Integer.valueOf(c), Integer.valueOf(d)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeLong(b);
        parcel.writeInt(c);
        parcel.writeInt(d);
        parcel.writeInt(e.ordinal());
    }
}
