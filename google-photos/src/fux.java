// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class fux
    implements ekq
{

    public static final android.os.Parcelable.Creator CREATOR = new fuy();
    private static final List e = Collections.singletonList(Integer.valueOf(0));
    final int a;
    public final List b;
    final long c;
    final int d;
    private final elm f;

    fux(int i, List list, long l, int j, elm elm1)
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (list != null && list.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        if (list.size() > 1)
        {
            if (i == 1)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            p.a(flag);
        }
        a = i;
        b = Collections.unmodifiableList(list);
        c = l;
        d = j;
        f = elm1;
    }

    fux(Parcel parcel)
    {
        a = parcel.readInt();
        b = new ArrayList();
        parcel.readList(b, java/lang/Integer.getClassLoader());
        c = parcel.readLong();
        d = parcel.readInt();
        f = (elm)parcel.readParcelable(elm.getClassLoader());
    }

    fux(boolean flag, List list, long l, int i, elm elm1)
    {
        int j;
        if (flag)
        {
            j = 1;
        } else
        {
            j = 2;
        }
        this(j, list, l, i, elm1);
    }

    public static fux a(int i)
    {
        return new fux(0, e, 0L, i, elm.a);
    }

    public static fux b(int i)
    {
        return new fux(1, e, 0L, i, elm.a);
    }

    public final ekf a(Class class1)
    {
        return f.a(class1);
    }

    public final String a()
    {
        return "com.google.android.apps.photos.localmedia.core.LocalMediaCore";
    }

    public final ekf b(Class class1)
    {
        return f.b(class1);
    }

    public final boolean b()
    {
        return a == 1;
    }

    public int describeContents()
    {
        return 0;
    }

    public final ekq e()
    {
        return null;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof fux)
            {
                if (a != ((fux) (obj = (fux)obj)).a || !b.equals(((fux) (obj)).b) || d != ((fux) (obj)).d)
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

    public int hashCode()
    {
        return a + c.a(b, d + 527) * 31;
    }

    public String toString()
    {
        String s1;
        switch (a)
        {
        default:
            String s = String.valueOf(b.toString());
            return (new StringBuilder(String.valueOf(s).length() + 8)).append("Folder(").append(s).append(")").toString();

        case 0: // '\0'
            return "ALL_FOLDERS";

        case 1: // '\001'
            s1 = String.valueOf(b.toString());
            break;
        }
        return (new StringBuilder(String.valueOf(s1).length() + 8)).append("Camera(").append(s1).append(")").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeList(b);
        parcel.writeLong(c);
        parcel.writeInt(d);
        parcel.writeParcelable(f, i);
    }

}
