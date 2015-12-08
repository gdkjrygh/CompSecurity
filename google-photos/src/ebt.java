// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

final class ebt
    implements ekp
{

    public static final android.os.Parcelable.Creator CREATOR = new ebu();
    final int a;
    final String b;
    final String c;
    final euv d;
    final long e;
    final ekq f;
    private final elm g;

    public ebt(int i, String s, String s1, elm elm1, euv euv1, ekq ekq1, long l)
    {
        a = i;
        c = s1;
        d = euv1;
        b = (String)p.a(s, "must provide a mediaKey");
        g = elm1;
        f = ekq1;
        e = l;
    }

    public ebt(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readString();
        c = parcel.readString();
        g = (elm)parcel.readParcelable(elm.getClassLoader());
        d = euv.valueOf(parcel.readString());
        f = (ekq)parcel.readParcelable(ebv.getClassLoader());
        e = parcel.readLong();
    }

    public final ekf a(Class class1)
    {
        return g.a(class1);
    }

    public final String a()
    {
        return "com.google.android.apps.photos.assistant.remote.provider";
    }

    public final long b()
    {
        return -1L;
    }

    public final ekf b(Class class1)
    {
        return g.b(class1);
    }

    public final euv c()
    {
        return d;
    }

    public final long d()
    {
        return e;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final ekq e()
    {
        return f;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof ebt)
        {
            obj = (ebt)obj;
            return b.equals(((ebt) (obj)).b);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return b.hashCode();
    }

    public final String toString()
    {
        return c.a("NotificationMedia", new Object[] {
            b, g, d, f, Long.valueOf(e)
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeParcelable(g, i);
        parcel.writeString(d.name());
        parcel.writeParcelable(f, i);
        parcel.writeLong(e);
    }

}
