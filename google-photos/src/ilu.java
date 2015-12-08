// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public class ilu
    implements ekq
{

    public static final android.os.Parcelable.Creator CREATOR = new ilv();
    final ily a;
    private final elm b;

    public ilu(Parcel parcel)
    {
        a = (ily)parcel.readParcelable(ily.getClassLoader());
        b = (elm)parcel.readParcelable(elm.getClassLoader());
    }

    public ilu(ily ily1)
    {
        p.a(ily1);
        a = ily1;
        b = elm.a;
    }

    public final ekf a(Class class1)
    {
        return b.a(class1);
    }

    public final String a()
    {
        return "SingleMediaItemCore";
    }

    public final ekf b(Class class1)
    {
        return b.b(class1);
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
        if (this == obj)
        {
            return true;
        }
        if (obj instanceof ilu)
        {
            obj = (ilu)obj;
            return a.equals(((ilu) (obj)).a);
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
        String s = String.valueOf("SingleMediaItemCollection{singleMediaItemState=");
        String s1 = String.valueOf(a.toString());
        return (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append(s1).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
        parcel.writeParcelable(b, i);
    }

}
