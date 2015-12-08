// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

final class fnu
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new fnv();
    final String a;
    Boolean b;
    Boolean c;
    Boolean d;
    Boolean e;

    fnu(Parcel parcel)
    {
        a = parcel.readString();
        b = (Boolean)parcel.readValue(java/lang/Boolean.getClassLoader());
        c = (Boolean)parcel.readValue(java/lang/Boolean.getClassLoader());
        d = (Boolean)parcel.readValue(java/lang/Boolean.getClassLoader());
        e = (Boolean)parcel.readValue(java/lang/Boolean.getClassLoader());
    }

    fnu(String s)
    {
        a = s;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof fnu)
        {
            obj = (fnu)obj;
            flag = flag1;
            if (a.equals(((fnu) (obj)).a))
            {
                flag = flag1;
                if (b == ((fnu) (obj)).b)
                {
                    flag = flag1;
                    if (c == ((fnu) (obj)).c)
                    {
                        flag = flag1;
                        if (d == ((fnu) (obj)).d)
                        {
                            flag = flag1;
                            if (e == ((fnu) (obj)).e)
                            {
                                flag = true;
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return c.a(a, c.a(b, c.a(c, c.a(d, c.a(e, 17)))));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeValue(b);
        parcel.writeValue(c);
        parcel.writeValue(d);
        parcel.writeValue(e);
    }

}
