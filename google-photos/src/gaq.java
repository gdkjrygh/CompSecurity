// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;

public final class gaq
    implements gap
{

    public static final android.os.Parcelable.Creator CREATOR = new gar();
    private final gan a;
    private final gat b;
    private final gas c;

    gaq(Parcel parcel)
    {
        a = (gan)parcel.readParcelable(gan.getClassLoader());
        b = (gat)parcel.readParcelable(gat.getClassLoader());
        c = gas.valueOf(parcel.readString());
    }

    public gaq(gan gan1, gat gat1, gas gas1)
    {
        p.a(gan1);
        p.a(gat1);
        p.a(gas1);
        a = gan1;
        b = gat1;
        c = gas1;
    }

    public final String a()
    {
        return b.a;
    }

    public final Uri b()
    {
        return a.b;
    }

    public final Integer c()
    {
        return a.a;
    }

    public final int d()
    {
        return b.b;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean e()
    {
        return true;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof gaq)
        {
            obj = (gaq)obj;
            flag = flag1;
            if (a.equals(((gaq) (obj)).a))
            {
                flag = flag1;
                if (b.equals(((gaq) (obj)).b))
                {
                    flag = flag1;
                    if (c == ((gaq) (obj)).c)
                    {
                        flag = true;
                    }
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
        if (c == gas.b)
        {
            return a;
        } else
        {
            return b;
        }
    }

    public final gap h()
    {
        if (c == gas.b)
        {
            return null;
        } else
        {
            return a;
        }
    }

    public final int hashCode()
    {
        return (a.hashCode() * 31 + b.hashCode()) * 31 + c.hashCode();
    }

    public final String toString()
    {
        String s = String.valueOf("MediaModelWrapper{localModel=");
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        String s3 = String.valueOf(c);
        return (new StringBuilder(String.valueOf(s).length() + 24 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s).append(s1).append(", remoteModel=").append(s2).append(", source=").append(s3).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
        parcel.writeParcelable(b, i);
        parcel.writeString(c.name());
    }

}
