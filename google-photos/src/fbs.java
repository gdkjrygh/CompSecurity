// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Point;
import android.os.Parcel;

final class fbs
    implements fcj
{

    public static final android.os.Parcelable.Creator CREATOR = new fbt();
    private final String a;
    private final long b;
    private final long c;
    private final fck d;
    private final Point e;
    private final String f;

    fbs(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readLong();
        c = parcel.readLong();
        d = (fck)parcel.readSerializable();
        e = (Point)parcel.readParcelable(android/graphics/Point.getClassLoader());
        f = parcel.readString();
    }

    fbs(String s, String s1, long l, long l1, fck fck1, 
            Point point)
    {
        a = (String)p.a(s);
        f = (String)p.a(s1);
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "encountered file (%s) with negative size (%s)", new Object[] {
            s, Long.valueOf(l)
        });
        b = l;
        if (l1 >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "encountered file (%s) with negative lastModifiedTime (%s)", new Object[] {
            s, Long.valueOf(l1)
        });
        c = l1;
        d = (fck)p.a(fck1);
        e = point;
    }

    public final String a()
    {
        return a;
    }

    public final long b()
    {
        return b;
    }

    public final long c()
    {
        return c;
    }

    public final fck d()
    {
        return d;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final Point e()
    {
        return e;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof fbs)
        {
            obj = (fbs)obj;
            flag = flag1;
            if (c.c(a, ((fbs) (obj)).a))
            {
                flag = flag1;
                if (b == ((fbs) (obj)).b)
                {
                    flag = flag1;
                    if (c == ((fbs) (obj)).c)
                    {
                        flag = flag1;
                        if (c.c(e, ((fbs) (obj)).e))
                        {
                            flag = flag1;
                            if (d.equals(((fbs) (obj)).d))
                            {
                                flag = flag1;
                                if (c.c(f, ((fbs) (obj)).f))
                                {
                                    flag = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final String f()
    {
        return f;
    }

    public final int hashCode()
    {
        return c.a(a, c.a(b, c.a(c, c.a(d, c.a(e, c.a(f, 17))))));
    }

    public final String toString()
    {
        String s = String.valueOf("DeviceLocalFile {contentUri=");
        String s1 = a;
        long l = b;
        long l1 = c;
        String s2 = String.valueOf(d);
        String s3 = String.valueOf(e);
        String s4 = f;
        return (new StringBuilder(String.valueOf(s).length() + 99 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length())).append(s).append(s1).append(", size=").append(l).append(", lastModifiedTime=").append(l1).append(", mediaType=").append(s2).append(", dimensions=").append(s3).append(", path=").append(s4).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeLong(b);
        parcel.writeLong(c);
        parcel.writeSerializable(d);
        parcel.writeParcelable(e, i);
        parcel.writeString(f);
    }

}
