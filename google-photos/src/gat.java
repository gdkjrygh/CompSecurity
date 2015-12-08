// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;

public final class gat
    implements gap
{

    public static final android.os.Parcelable.Creator CREATOR = new gau();
    final String a;
    final int b;

    gat(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readInt();
    }

    public gat(String s, int i)
    {
        p.a(s);
        a = s;
        b = i;
    }

    public final String a()
    {
        return a;
    }

    public final Uri b()
    {
        return null;
    }

    public final Integer c()
    {
        return null;
    }

    public final int d()
    {
        return b;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean e()
    {
        return false;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof gat)
        {
            obj = (gat)obj;
            flag = flag1;
            if (a.equals(((gat) (obj)).a))
            {
                flag = flag1;
                if (b == ((gat) (obj)).b)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final boolean f()
    {
        return true;
    }

    public final gap g()
    {
        return this;
    }

    public final gap h()
    {
        return null;
    }

    public final int hashCode()
    {
        return a.hashCode() + b * 31;
    }

    public final String toString()
    {
        String s = String.valueOf("RemoteMediaModel{url='");
        String s1 = a;
        return (new StringBuilder(String.valueOf(s).length() + 2 + String.valueOf(s1).length())).append(s).append(s1).append("'}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeInt(b);
    }

}
