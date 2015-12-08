// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class dke
    implements ekq
{

    public static final android.os.Parcelable.Creator CREATOR = new dkf();
    final int a;
    private final elm b;

    public dke(int i)
    {
        this(i, elm.a);
    }

    public dke(int i, elm elm1)
    {
        a = i;
        b = elm1;
    }

    dke(Parcel parcel)
    {
        this(parcel.readInt(), (elm)parcel.readParcelable(elm.getClassLoader()));
    }

    public final ekf a(Class class1)
    {
        return b.a(class1);
    }

    public final String a()
    {
        return "com.google.android.apps.photos.allphotos.data.AllPhotosCore";
    }

    public final ekf b(Class class1)
    {
        return b.b(class1);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final ekq e()
    {
        return null;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (dke)obj;
            if (a != ((dke) (obj)).a)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return a;
    }

    public final String toString()
    {
        String s = String.valueOf("AllPhotosCollection{accountId=");
        int i = a;
        return (new StringBuilder(String.valueOf(s).length() + 12)).append(s).append(i).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeParcelable(b, i);
    }

}
