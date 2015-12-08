// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;

public class fjq
    implements ekp
{

    public static final android.os.Parcelable.Creator CREATOR = new fjr();
    final int a;
    final fjz b;
    final fjs c;
    private final elm d;

    fjq(int i, fjz fjz1, fjs fjs1, elm elm1)
    {
        p.a(fjz1);
        p.a(fjs1);
        a = i;
        b = fjz1;
        c = fjs1;
        d = elm1;
    }

    fjq(Parcel parcel)
    {
        a = parcel.readInt();
        b = (fjz)parcel.readParcelable(fjz.getClassLoader());
        c = (fjs)parcel.readParcelable(ekq.getClassLoader());
        d = (elm)parcel.readParcelable(elm.getClassLoader());
    }

    public final ekf a(Class class1)
    {
        return d.a(class1);
    }

    public final String a()
    {
        return "ExternalMediaCore";
    }

    public final long b()
    {
        return (long)c.a(b, 17);
    }

    public final ekf b(Class class1)
    {
        return d.b(class1);
    }

    public final euv c()
    {
        return b.b;
    }

    public final long d()
    {
        return b.c;
    }

    public int describeContents()
    {
        return 0;
    }

    public final ekq e()
    {
        return c;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof fjq)
        {
            obj = (fjq)obj;
            flag = flag1;
            if (b.equals(((fjq) (obj)).b))
            {
                flag = flag1;
                if (a == ((fjq) (obj)).a)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    final Uri f()
    {
        return b.a;
    }

    public int hashCode()
    {
        return c.a(b, a + 527);
    }

    public String toString()
    {
        String s = String.valueOf("ExternalMedia{accountId=");
        String s1 = String.valueOf(Integer.toString(a));
        String s2 = String.valueOf(b.toString());
        return (new StringBuilder(String.valueOf(s).length() + 22 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(s1).append(", externalMediaState=").append(s2).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeParcelable(b, i);
        parcel.writeParcelable(c, i);
        parcel.writeParcelable(d, i);
    }

}
