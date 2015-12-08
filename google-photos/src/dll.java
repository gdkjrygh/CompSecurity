// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public class dll
    implements ekq
{

    public static final android.os.Parcelable.Creator CREATOR = new dlm();
    final int a;
    final String b;

    dll(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readString();
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
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof dll)
        {
            obj = (dll)obj;
            flag = flag1;
            if (a == ((dll) (obj)).a)
            {
                flag = flag1;
                if (b.equals(((dll) (obj)).b))
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
        String s = String.valueOf("DedupKeyMediaCollection {accountId: ");
        int i = a;
        String s1 = b;
        return (new StringBuilder(String.valueOf(s).length() + 23 + String.valueOf(s1).length())).append(s).append(i).append(", dedupKey:").append(s1).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeString(b);
    }

}
