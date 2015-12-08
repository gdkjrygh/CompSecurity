// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public final class orr
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ors();
    public final ote a;
    public final boolean b;
    public final long c;
    public final long d;
    public long e;
    public long f;
    private String g;
    private long h;
    private Uri i;
    private float j;
    private final List k;

    orr(Parcel parcel)
    {
        h = 0L;
        k = new CopyOnWriteArrayList();
        a = (ote)parcel.readParcelable(ote.getClassLoader());
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        c = parcel.readLong();
        e = parcel.readLong();
        f = parcel.readLong();
        g = parcel.readString();
        i = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        h = parcel.readLong();
        j = parcel.readFloat();
        d = parcel.readLong();
    }

    orr(ote ote1, long l, boolean flag)
    {
        h = 0L;
        k = new CopyOnWriteArrayList();
        a = (ote)p.a(ote1);
        c = l;
        long l4 = ote1.f;
        long l1 = 0L;
        Object obj;
        if (ote1.h != null)
        {
            obj = new ore(ote1.h);
        } else
        {
            obj = new oth(ote1.g.length);
        }
        if (((Iterator) (obj)).hasNext())
        {
            l1 = ote1.b(((Integer)((Iterator) (obj)).next()).intValue());
            long l2 = 0L;
            while (((Iterator) (obj)).hasNext()) 
            {
                long l3 = ote1.b(((Integer)((Iterator) (obj)).next()).intValue());
                l2 = Math.max(l2, l3 - l1);
                l1 = l3;
            }
            l1 = Math.max(l2, l4 - l1);
        }
        boolean flag2;
        if (l4 > l)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (flag)
        {
            boolean flag1;
            if (l1 <= 0x5b8d80L)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            flag = flag1 & flag2;
        } else
        {
            flag = flag2;
        }
        b = flag;
        d = l1;
        e = 0L;
        f = l4;
        g = null;
        h = 0L;
        j = 0.3F;
        i = null;
    }

    private void a(oru oru1)
    {
        for (Iterator iterator = k.iterator(); iterator.hasNext(); ((orv)iterator.next()).a(this, oru1)) { }
    }

    public final long a()
    {
        return a.f;
    }

    public final void a(long l)
    {
        if (b)
        {
            long l1 = l;
            if (l < 0L)
            {
                l1 = 0L;
            }
            boolean flag;
            if (f >= c)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.b(flag);
            l = l1;
            if (l1 > f - c)
            {
                l = f - c;
            }
            if (e != l)
            {
                e = l;
                a(oru.a);
                return;
            }
        }
    }

    public final void a(Set set)
    {
        for (Iterator iterator = k.iterator(); iterator.hasNext(); ((orv)iterator.next()).a(this, set)) { }
    }

    public final void a(orv orv1)
    {
        k.add(orv1);
    }

    public final void b(long l)
    {
        if (b)
        {
            long l2 = a.f;
            long l1 = l;
            if (l > l2)
            {
                l1 = l2;
            }
            boolean flag;
            if (e <= l2 - c)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.b(flag);
            l = l1;
            if (l1 < e + c)
            {
                l = e + c;
            }
            if (f != l)
            {
                f = l;
                a(oru.b);
                return;
            }
        }
    }

    public final void b(Set set)
    {
        for (Iterator iterator = k.iterator(); iterator.hasNext(); ((orv)iterator.next()).b(this, set)) { }
    }

    public final void b(orv orv1)
    {
        k.remove(orv1);
    }

    public final boolean b()
    {
        boolean flag;
        if (e != 0L || f != a.f)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            if (g != null && !g.equals("ORIGINAL"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                if (i != null && j > 1E-06F)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public final long c()
    {
        return e / 1000L;
    }

    public final long d()
    {
        return f / 1000L;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof orr))
        {
            return false;
        } else
        {
            obj = (orr)obj;
            return c.c(a, ((orr) (obj)).a);
        }
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            a
        });
    }

    public final String toString()
    {
        String s = getClass().getName();
        String s1 = String.valueOf(a);
        return c.a(s, new Object[] {
            (new StringBuilder(String.valueOf(s1).length() + 14)).append("videoMetaData=").append(s1).toString()
        });
    }

    public final void writeToParcel(Parcel parcel, int l)
    {
        byte byte0 = 0;
        parcel.writeParcelable(a, 0);
        if (b)
        {
            byte0 = 1;
        }
        parcel.writeByte(byte0);
        parcel.writeLong(c);
        parcel.writeLong(e);
        parcel.writeLong(f);
        parcel.writeString(g);
        parcel.writeParcelable(i, l);
        parcel.writeLong(h);
        parcel.writeFloat(j);
        parcel.writeLong(d);
    }

}
