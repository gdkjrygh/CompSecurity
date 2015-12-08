// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public class ils
    implements ekp
{

    public static final android.os.Parcelable.Creator CREATOR = new ilt();
    final ily a;
    final ilu b;
    private final elm c;

    ils(Parcel parcel)
    {
        a = (ily)parcel.readParcelable(ily.getClassLoader());
        b = (ilu)parcel.readParcelable(ilu.getClassLoader());
        c = (elm)parcel.readParcelable(elm.getClassLoader());
    }

    ils(ily ily1, ilu ilu1, elm elm1)
    {
        p.a(ily1);
        p.a(ilu1);
        a = ily1;
        b = ilu1;
        c = elm1;
    }

    public final ekf a(Class class1)
    {
        return c.a(class1);
    }

    public final String a()
    {
        return "SingleMediaItemCore";
    }

    public final long b()
    {
        return (long)c.a(a, 17);
    }

    public final ekf b(Class class1)
    {
        return c.b(class1);
    }

    public final euv c()
    {
        return a.b;
    }

    public final long d()
    {
        return a.c;
    }

    public int describeContents()
    {
        return 0;
    }

    public final ekq e()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj instanceof ils)
        {
            obj = (ils)obj;
            return a.equals(((ils) (obj)).a);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return c.a(a, 17);
    }

    public String toString()
    {
        String s = String.valueOf("SingleMediaItemMedia{singleMediaItemState=");
        String s1 = String.valueOf(a.toString());
        return (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append(s1).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
        parcel.writeParcelable(b, i);
        parcel.writeParcelable(c, i);
    }

}
