// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public class dnd
    implements ekq
{

    public static final android.os.Parcelable.Creator CREATOR = new dne();
    final int a;
    final String b;
    final boolean c;
    private final elm d;

    public dnd(int i, String s, boolean flag, elm elm1)
    {
        boolean flag1;
        if (i != -1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        p.a(flag1);
        p.a(s);
        a = i;
        b = s;
        c = flag;
        d = elm1;
    }

    dnd(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readString();
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        d = (elm)parcel.readParcelable(elm.getClassLoader());
    }

    public final ekf a(Class class1)
    {
        return d.a(class1);
    }

    public final String a()
    {
        return "com.google.android.apps.photos.allphotos.data.AllPhotosCore";
    }

    public final ekf b(Class class1)
    {
        return d.b(class1);
    }

    public int describeContents()
    {
        return 0;
    }

    public final ekq e()
    {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof dnd)
        {
            obj = (dnd)obj;
            flag = flag1;
            if (a == ((dnd) (obj)).a)
            {
                flag = flag1;
                if (b.equals(((dnd) (obj)).b))
                {
                    flag = flag1;
                    if (c == ((dnd) (obj)).c)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return a + c.a(b, c.a(c, 17)) * 31;
    }

    public String toString()
    {
        String s = String.valueOf("RemoteMediaCollection{accountId=");
        int i = a;
        String s1 = b;
        boolean flag = c;
        String s2 = String.valueOf(d);
        return (new StringBuilder(String.valueOf(s).length() + 51 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(i).append(", mediaKey=").append(s1).append(", isMovie=").append(flag).append(", featureSet=").append(s2).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeString(b);
        int j;
        if (c)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        parcel.writeInt(j);
        parcel.writeParcelable(d, i);
    }

}
