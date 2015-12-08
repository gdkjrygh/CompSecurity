// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class gka
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new gkb();
    public final int a;
    public final String b;

    private gka(int i, String s)
    {
        a = i;
        b = s;
    }

    gka(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readString();
    }

    public static gka a(int i, String s)
    {
        return new gka(i, s);
    }

    public static gka a(long l)
    {
        return new gka((int)l, null);
    }

    public final String a()
    {
        String s = String.valueOf("f");
        int i = a;
        return (new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(i).toString();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof gka)
        {
            obj = (gka)obj;
            flag = flag1;
            if (a == ((gka) (obj)).a)
            {
                flag = flag1;
                if (c.c(b, ((gka) (obj)).b))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return a + c.a(b, 17) * 31;
    }

    public final String toString()
    {
        return a();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeString(b);
    }

}
