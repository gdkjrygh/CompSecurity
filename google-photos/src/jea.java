// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public final class jea
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new jeb();
    public final Uri a;
    final String b;
    private final jec c;
    private final boolean d;

    public jea(Uri uri, String s, jec jec1)
    {
        p.a(uri);
        p.a(jec1);
        a = uri;
        uri = uri.getScheme();
        boolean flag;
        if ("https".equalsIgnoreCase(uri) || "http".equalsIgnoreCase(uri) || "rtsp".equalsIgnoreCase(uri))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        c = jec1;
        b = s;
    }

    jea(Parcel parcel)
    {
        this((Uri)parcel.readParcelable(android/net/Uri.getClassLoader()), parcel.readString(), jec.valueOf(parcel.readString()));
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof jea)
        {
            if (a.equals(((jea) (obj = (jea)obj)).a) && d == ((jea) (obj)).d && c.equals(((jea) (obj)).c) && c.c(b, ((jea) (obj)).b))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        Uri uri = a;
        jec jec1 = c;
        int i;
        if (d)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return c.a(uri, c.a(jec1, i + c.a(b, 17) * 31));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
        parcel.writeString(b);
        parcel.writeString(c.name());
    }

}
