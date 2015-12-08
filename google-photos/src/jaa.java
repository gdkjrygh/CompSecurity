// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;

public final class jaa
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new jab();
    public final String a;
    final String b;
    public final String c;
    final String d;
    public final ContentValues e;
    final boolean f;

    jaa(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
        e = (ContentValues)parcel.readParcelable(android/content/ContentValues.getClassLoader());
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
    }

    public jaa(String s, String s1, String s2, String s3, ContentValues contentvalues, boolean flag)
    {
        a = s;
        b = s1;
        c = s2;
        d = s3;
        e = contentvalues;
        f = flag;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof jaa)
        {
            obj = (jaa)obj;
            flag = flag1;
            if (a.equals(((jaa) (obj)).a))
            {
                flag = flag1;
                if (b.equals(((jaa) (obj)).b))
                {
                    flag = flag1;
                    if (c.equals(((jaa) (obj)).c))
                    {
                        flag = flag1;
                        if (d.equals(((jaa) (obj)).d))
                        {
                            flag = flag1;
                            if (c.c(e, ((jaa) (obj)).e))
                            {
                                flag = flag1;
                                if (f == ((jaa) (obj)).f)
                                {
                                    flag = true;
                                }
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
        return c.a(a, c.a(b, c.a(d, c.a(c, c.a(e, c.a(f, 17))))));
    }

    public final String toString()
    {
        return c.a("MetadataTrashMedia", new Object[] {
            a, b, c, d, e, Boolean.valueOf(f)
        });
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeParcelable(e, i);
        if (f)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

}
