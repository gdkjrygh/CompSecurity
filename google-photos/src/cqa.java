// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public final class cqa
    implements Parcelable, Comparable
{

    public static final android.os.Parcelable.Creator CREATOR = new cqb();
    public final String a;
    public final String b;
    public final String c;
    public final Uri d;
    public final cqc e;
    public final long f;
    public final long g;
    public final boolean h;

    cqa(Parcel parcel)
    {
        ClassLoader classloader = getClass().getClassLoader();
        a = a(parcel);
        b = parcel.readString();
        c = a(parcel);
        boolean flag;
        if (classloader != null)
        {
            d = (Uri)parcel.readParcelable(classloader);
            e = (cqc)parcel.readParcelable(classloader);
        } else
        {
            d = Uri.EMPTY;
            e = cqc.a;
        }
        f = parcel.readLong();
        g = parcel.readLong();
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
    }

    public cqa(String s, String s1, cqc cqc1, long l, boolean flag)
    {
        this(s, s1, null, null, cqc1, 0L, l, flag);
    }

    public cqa(String s, String s1, String s2, Uri uri, cqc cqc1, long l, 
            long l1, boolean flag)
    {
        a = s;
        b = (String)b.a(s1, "trackName", null);
        c = s2;
        s = uri;
        if (uri == null)
        {
            s = Uri.EMPTY;
        }
        d = s;
        e = cqc1;
        f = l;
        g = l1;
        h = flag;
    }

    private static String a(Parcel parcel)
    {
        if (parcel.readByte() == 0)
        {
            return null;
        } else
        {
            return parcel.readString();
        }
    }

    private static void a(Parcel parcel, String s)
    {
        int i;
        if (s != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
        if (s != null)
        {
            parcel.writeString(s);
        }
    }

    public final boolean a()
    {
        return TextUtils.isEmpty(e.c);
    }

    public final int compareTo(Object obj)
    {
        obj = (cqa)obj;
        return b.compareTo(((cqa) (obj)).b);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof cqa))
            {
                return false;
            }
            obj = (cqa)obj;
            if (!b.e(a, ((cqa) (obj)).a) || !b.e(b, ((cqa) (obj)).b) || !b.e(c, ((cqa) (obj)).c) || !b.e(d, ((cqa) (obj)).d) || !e.equals(((cqa) (obj)).e) || g != ((cqa) (obj)).g || h != ((cqa) (obj)).h)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return e.hashCode();
    }

    public final String toString()
    {
        String s = String.valueOf(e);
        String s1 = a;
        String s2 = b;
        String s3 = c;
        return (new StringBuilder(String.valueOf(s).length() + 8 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s).append("(").append(s1).append(" - ").append(s2).append(" - ").append(s3).append(")").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        i = 0;
        a(parcel, a);
        parcel.writeString(b);
        a(parcel, c);
        parcel.writeParcelable(d, 0);
        parcel.writeParcelable(e, 0);
        parcel.writeLong(f);
        parcel.writeLong(g);
        if (h)
        {
            i = 1;
        }
        parcel.writeByte((byte)i);
    }

}
