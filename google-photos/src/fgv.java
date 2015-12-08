// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class fgv
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new fgw();
    final String a;
    final String b;
    final boolean c;
    final Uri d;

    fgv(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = b.c(parcel);
        d = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
    }

    public fgv(String s, String s1, boolean flag, Uri uri)
    {
        a = s;
        b = s1;
        c = flag;
        d = uri;
    }

    public static fgv a(Uri uri)
    {
        List list = uri.getPathSegments();
        if (list.size() <= 1)
        {
            throw new IllegalArgumentException("Uri must have at least 2 segments");
        }
        String s = (String)list.get(1);
        String s1 = uri.getQueryParameter("key");
        boolean flag;
        if (list.size() > 2 && ((String)list.get(2)).equals("story"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new fgv(s, s1, flag, uri);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        b.a(parcel, c);
        parcel.writeParcelable(d, i);
    }

}
