// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public class iza
    implements ekq
{

    public static final android.os.Parcelable.Creator CREATOR = new izb();
    final int a;

    public iza(int i)
    {
        a = i;
    }

    iza(Parcel parcel)
    {
        a = parcel.readInt();
    }

    public final ekf a(Class class1)
    {
        throw new UnsupportedOperationException();
    }

    public final String a()
    {
        return "com.google.android.apps.photos.trash.data.TrashCore";
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
        if (obj instanceof iza)
        {
            obj = (iza)obj;
            flag = flag1;
            if (a == ((iza) (obj)).a)
            {
                flag = true;
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return a;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
    }

}
