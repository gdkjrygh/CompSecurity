// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class dls
    implements ekq
{

    public static final android.os.Parcelable.Creator CREATOR = new dlt();
    final int a;

    dls(Parcel parcel)
    {
        a = parcel.readInt();
    }

    public final ekf a(Class class1)
    {
        throw new UnsupportedOperationException();
    }

    public final String a()
    {
        return "com.google.android.apps.photos.allphotos.data.AllPhotosCore";
    }

    public final ekf b(Class class1)
    {
        throw new UnsupportedOperationException();
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
        if (obj instanceof dls)
        {
            obj = (dls)obj;
            flag = flag1;
            if (a == ((dls) (obj)).a)
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
    }

}
