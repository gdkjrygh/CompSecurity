// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class cqp
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new cqq();
    private static final cqt e[] = new cqt[0];
    private static final cqr f[] = new cqr[0];
    public final List a;
    public cqv b;
    public boolean c;
    public long d;
    private final List g;

    public cqp()
    {
        a = new ArrayList();
        g = new ArrayList();
        d = -1L;
    }

    public cqp(Parcel parcel)
    {
        Parcelable aparcelable[] = parcel.readParcelableArray(getClass().getClassLoader());
        a = new ArrayList();
        int k = aparcelable.length;
        for (int i = 0; i < k; i++)
        {
            Parcelable parcelable = aparcelable[i];
            a.add((cqt)parcelable);
        }

        aparcelable = parcel.readParcelableArray(getClass().getClassLoader());
        g = new ArrayList();
        k = aparcelable.length;
        for (int j = 0; j < k; j++)
        {
            Parcelable parcelable1 = aparcelable[j];
            g.add((cqr)parcelable1);
        }

        b = (cqv)parcel.readParcelable(cqv.getClassLoader());
        d = b(parcel.readLong());
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
    }

    private static long b(long l)
    {
        if (l < 0L && l != -1L)
        {
            throw new IllegalArgumentException((new StringBuilder(44)).append("Invalid target duration ").append(l).toString());
        } else
        {
            return l;
        }
    }

    public final void a()
    {
        a.clear();
        g.clear();
        b = null;
        c = false;
        d = -1L;
    }

    public final void a(long l)
    {
        d = b(l);
    }

    public final boolean a(cnq cnq)
    {
        for (Iterator iterator = g.iterator(); iterator.hasNext();)
        {
            if (cqr.a(((cqr)iterator.next()).a, cnq))
            {
                return true;
            }
        }

        return false;
    }

    public final boolean a(cqp cqp1)
    {
        boolean flag;
        if (!equals(cqp1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a.clear();
        a.addAll(Collections.unmodifiableList(cqp1.a));
        g.clear();
        g.addAll(Collections.unmodifiableList(cqp1.g));
        d = cqp1.d;
        b = cqp1.b;
        c = cqp1.c;
        return flag;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof cqp))
            {
                return false;
            }
            obj = (cqp)obj;
            if (!a.equals(((cqp) (obj)).a) || !g.equals(((cqp) (obj)).g) || c != ((cqp) (obj)).c || d != ((cqp) (obj)).d || !b.e(b, ((cqp) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return b.h(a, b.h(g, b.a(c, b.a(d, b.h(b, 17)))));
    }

    public final String toString()
    {
        return b.a(getClass(), new Object[] {
            a, g, b, Long.valueOf(d), Boolean.valueOf(c)
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelableArray((Parcelable[])a.toArray(e), 0);
        parcel.writeParcelableArray((Parcelable[])g.toArray(f), 0);
        parcel.writeParcelable(b, 0);
        parcel.writeLong(d);
        if (c)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
    }

}
