// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;
import java.util.UUID;

public final class gan
    implements gap
{

    public static final android.os.Parcelable.Creator CREATOR = new gao();
    final Integer a;
    public final Uri b;

    public gan(Uri uri)
    {
        this(uri, null);
    }

    public gan(Uri uri, Integer integer)
    {
        p.a(uri);
        b = uri;
        int i;
        if (integer != null)
        {
            i = integer.intValue();
        } else
        {
            i = UUID.randomUUID().hashCode();
        }
        a = Integer.valueOf(i);
    }

    gan(Parcel parcel)
    {
        b = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        a = Integer.valueOf(parcel.readInt());
    }

    public final String a()
    {
        return null;
    }

    public final Uri b()
    {
        return b;
    }

    public final Integer c()
    {
        return a;
    }

    public final int d()
    {
        return -1;
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
        if (obj instanceof gan)
        {
            obj = (gan)obj;
            flag = flag1;
            if (b.equals(((gan) (obj)).b))
            {
                flag = flag1;
                if (a.equals(((gan) (obj)).a))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final boolean f()
    {
        return false;
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
        return c.a(b, c.a(a, 17));
    }

    public final String toString()
    {
        String s = String.valueOf("LocalMediaModel{signature=");
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        return (new StringBuilder(String.valueOf(s).length() + 12 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(s1).append(", localUri=").append(s2).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(b, i);
        parcel.writeInt(a.intValue());
    }

}
