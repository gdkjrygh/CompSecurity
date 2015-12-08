// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public class iyy
    implements ekp
{

    public static final android.os.Parcelable.Creator CREATOR = new iyz();
    final int a;
    final long b;
    final long c;
    final euv d;
    private final elm e;

    iyy(int i, long l, long l1, euv euv1, elm elm1)
    {
        a = i;
        b = l;
        c = l1;
        d = euv1;
        e = elm1;
    }

    iyy(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readLong();
        c = parcel.readLong();
        d = euv.valueOf(parcel.readString());
        e = (elm)parcel.readParcelable(elm.getClassLoader());
    }

    public final ekf a(Class class1)
    {
        return e.a(class1);
    }

    public final String a()
    {
        return "com.google.android.apps.photos.trash.data.TrashCore";
    }

    public final long b()
    {
        return b;
    }

    public final ekf b(Class class1)
    {
        return e.b(class1);
    }

    public final euv c()
    {
        return d;
    }

    public final long d()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public final ekq e()
    {
        return iyw.a(a);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof iyy)
        {
            obj = (iyy)obj;
            flag = flag1;
            if (a == ((iyy) (obj)).a)
            {
                flag = flag1;
                if (b == ((iyy) (obj)).b)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return a + c.a(b, 17) * 31;
    }

    public String toString()
    {
        String s = String.valueOf("TrashMedia{accountId=");
        int i = a;
        long l = b;
        long l1 = c;
        String s1 = String.valueOf(d);
        String s2 = String.valueOf(e);
        return (new StringBuilder(String.valueOf(s).length() + 99 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(i).append(", mediaTableId=").append(l).append(", timestamp=").append(l1).append(", type=").append(s1).append(", featureSet=").append(s2).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeLong(b);
        parcel.writeLong(c);
        parcel.writeString(d.name());
        parcel.writeParcelable(e, i);
    }

}
