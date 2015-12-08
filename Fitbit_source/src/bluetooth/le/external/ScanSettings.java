// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bluetooth.le.external;

import android.os.Parcel;
import android.os.Parcelable;

public final class ScanSettings
    implements Parcelable
{
    public static final class a
    {

        private int a;
        private long b;
        private long c;

        public a a(int i)
        {
            if (i < 0 || i > 2)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("invalid scan mode ").append(i).toString());
            } else
            {
                a = i;
                return this;
            }
        }

        public a a(long l)
        {
            if (l < 0L)
            {
                throw new IllegalArgumentException("reportDelay must be > 0");
            } else
            {
                b = l;
                return this;
            }
        }

        public ScanSettings a()
        {
            return new ScanSettings(a, b, c, null);
        }

        public a b(long l)
        {
            if (l < 0L)
            {
                throw new IllegalArgumentException("timoutMillis must be > 0");
            } else
            {
                c = l;
                return this;
            }
        }

        public a()
        {
            a = 0;
            b = 0L;
            c = 0L;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 1;
    private int e;
    private long f;
    private final long g;

    private ScanSettings(int i, long l, long l1)
    {
        e = i;
        f = l;
        g = l1;
    }

    ScanSettings(int i, long l, long l1, _cls1 _pcls1)
    {
        this(i, l, l1);
    }

    private ScanSettings(Parcel parcel)
    {
        e = parcel.readInt();
        f = parcel.readLong();
        g = parcel.readLong();
    }

    ScanSettings(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    public int a()
    {
        return e;
    }

    public int b()
    {
        return 1;
    }

    public int c()
    {
        return 0;
    }

    public long d()
    {
        return g;
    }

    public int describeContents()
    {
        return 0;
    }

    public long e()
    {
        return f;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(e);
        parcel.writeLong(f);
        parcel.writeLong(g);
    }


    /* member class not found */
    class _cls1 {}

}
