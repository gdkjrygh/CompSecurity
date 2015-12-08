// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class ikb
    implements ekp
{

    public static final android.os.Parcelable.Creator CREATOR = new ikc();
    final int a;
    final String b;
    final euv c;
    final long d;
    final ekq e;
    private final elm f;

    public ikb(int i, String s, euv euv1, long l, ekq ekq1, elm elm1)
    {
        a = i;
        b = s;
        c = euv1;
        d = l;
        e = ekq1;
        f = elm1;
    }

    ikb(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readString();
        c = euv.valueOf(parcel.readString());
        d = parcel.readLong();
        e = (ekq)parcel.readParcelable(ekq.getClassLoader());
        f = (elm)parcel.readParcelable(elm.getClassLoader());
    }

    public final ekf a(Class class1)
    {
        return f.a(class1);
    }

    public final String a()
    {
        return "com.google.android.apps.photos.sharedmedia.SharedCore";
    }

    public final long b()
    {
        return (long)(b.hashCode() + 527);
    }

    public final ekf b(Class class1)
    {
        return f.b(class1);
    }

    public final euv c()
    {
        return c;
    }

    public final long d()
    {
        return d;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final ekq e()
    {
        return e;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof ikb)
        {
            obj = (ikb)obj;
            return b.equals(((ikb) (obj)).b);
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
        String s = String.valueOf("SharedMedia{accountId='");
        int i = a;
        String s1 = b;
        String s2 = String.valueOf(c);
        long l = d;
        String s3 = String.valueOf(e);
        String s4 = String.valueOf(f);
        return (new StringBuilder(String.valueOf(s).length() + 88 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length())).append(s).append(i).append(", mediaKey='").append(s1).append("', avType=").append(s2).append(", timestamp=").append(l).append(", parent=").append(s3).append(", featureSet=").append(s4).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeString(b);
        parcel.writeString(c.name());
        parcel.writeLong(d);
        parcel.writeParcelable(e, i);
        parcel.writeParcelable(f, i);
    }

}
