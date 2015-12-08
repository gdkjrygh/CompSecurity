// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class dog
    implements ekq
{

    public static final android.os.Parcelable.Creator CREATOR = new doh();
    int a;

    dog(int i)
    {
        a = i;
    }

    dog(Parcel parcel)
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
        if (obj instanceof dog)
        {
            obj = (dog)obj;
            flag = flag1;
            if (a == ((dog) (obj)).a)
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

    public final String toString()
    {
        String s = String.valueOf("SyncMediaCollection{accountId=");
        int i = a;
        return (new StringBuilder(String.valueOf(s).length() + 12)).append(s).append(i).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
    }

}
