// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class ekw
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ekx();
    public static final ekw a = (new eky()).a();
    public final int b;
    public final int c;
    public final ekp d;
    public final int e;
    public final Set f;
    public final boolean g;
    public final long h;
    public final long i;

    ekw(Parcel parcel)
    {
        int j = 0;
        super();
        b = parcel.readInt();
        c = parcel.readInt();
        d = (ekp)parcel.readParcelable(ekp.getClassLoader());
        e = parcel.readInt();
        ArrayList arraylist;
        int k;
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        h = parcel.readLong();
        i = parcel.readLong();
        k = parcel.readInt();
        arraylist = new ArrayList();
        for (; j < k; j++)
        {
            arraylist.add(euv.a(parcel.readInt()));
        }

        if (arraylist.isEmpty())
        {
            f = Collections.emptySet();
            return;
        } else
        {
            f = Collections.unmodifiableSet(EnumSet.copyOf(arraylist));
            return;
        }
    }

    ekw(eky eky1)
    {
        b = eky1.a;
        c = eky1.b;
        d = eky1.f;
        e = eky1.c;
        f = eky1.g;
        g = eky1.h;
        h = eky1.d;
        i = eky1.e;
    }

    public final boolean a()
    {
        return b != 0x7fffffff;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof ekw)
        {
            obj = (ekw)obj;
            flag = flag1;
            if (b == ((ekw) (obj)).b)
            {
                flag = flag1;
                if (c == ((ekw) (obj)).c)
                {
                    flag = flag1;
                    if (c.c(f, ((ekw) (obj)).f))
                    {
                        flag = flag1;
                        if (g == ((ekw) (obj)).g)
                        {
                            flag = flag1;
                            if (c.c(d, ((ekw) (obj)).d))
                            {
                                flag = flag1;
                                if (e == ((ekw) (obj)).e)
                                {
                                    flag = flag1;
                                    if (h == ((ekw) (obj)).h)
                                    {
                                        flag = flag1;
                                        if (i == ((ekw) (obj)).i)
                                        {
                                            flag = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        int k = c;
        int l = b;
        ekp ekp1 = d;
        int i1 = e;
        Set set = f;
        int j;
        if (g)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        return (c.a(ekp1, c.a(set, j + c.a(h, c.a(i, 17)) * 31) * 31 + i1) * 31 + l) * 31 + k;
    }

    public final String toString()
    {
        String s = String.valueOf("QueryOptions{limit=");
        int j = b;
        int k = c;
        String s1 = String.valueOf(d);
        int l = e;
        String s2 = String.valueOf(f);
        boolean flag = g;
        long l1 = h;
        long l2 = i;
        return (new StringBuilder(String.valueOf(s).length() + 177 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(j).append(", offset=").append(k).append(", startMedia=").append(s1).append(", startMediaOffset=").append(l).append(", types=").append(s2).append(", requireLocal=").append(flag).append(", startTimeMillis=").append(l1).append(", endTimeMillis=").append(l2).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int j)
    {
        parcel.writeInt(b);
        parcel.writeInt(c);
        parcel.writeParcelable(d, j);
        parcel.writeInt(e);
        if (g)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        parcel.writeInt(j);
        parcel.writeLong(h);
        parcel.writeLong(i);
        parcel.writeInt(f.size());
        for (Iterator iterator = f.iterator(); iterator.hasNext(); parcel.writeInt(((euv)iterator.next()).f)) { }
    }

}
