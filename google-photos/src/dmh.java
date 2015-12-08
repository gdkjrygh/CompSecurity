// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class dmh
    implements ekq
{

    public static final android.os.Parcelable.Creator CREATOR = new dmi();
    final int a;
    private final elm b;

    public dmh(int i)
    {
        this(i, elm.a);
    }

    dmh(int i, elm elm1)
    {
        p.a(elm1);
        a = i;
        b = elm1;
    }

    dmh(Parcel parcel)
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
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof dmh)
        {
            obj = (dmh)obj;
            flag = flag1;
            if (a == ((dmh) (obj)).a)
            {
                flag = true;
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return a;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeParcelable(b, i);
    }

}
