// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class ehr
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ehs();
    public final ekq a;
    public final ekw b;

    ehr(Parcel parcel)
    {
        a = (ekq)parcel.readParcelable(ekq.getClassLoader());
        b = (ekw)parcel.readParcelable(ekw.getClassLoader());
    }

    public ehr(ekq ekq1)
    {
        this(ekq1, ekw.a);
    }

    public ehr(ekq ekq1, ekw ekw1)
    {
        a = (ekq)p.a(ekq1);
        b = (ekw)p.a(ekw1);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof ehr)
        {
            obj = (ehr)obj;
            flag = flag1;
            if (a.equals(((ehr) (obj)).a))
            {
                flag = flag1;
                if (b.equals(((ehr) (obj)).b))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return c.a(a, c.a(b, 17));
    }

    public final String toString()
    {
        String s = String.valueOf("CollectionKey{collection=");
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        return (new StringBuilder(String.valueOf(s).length() + 11 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(s1).append(", options=").append(s2).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
        parcel.writeParcelable(b, i);
    }

}
