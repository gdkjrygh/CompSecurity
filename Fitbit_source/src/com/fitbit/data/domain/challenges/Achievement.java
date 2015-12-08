// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.challenges;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public class Achievement
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private final String a;
    private final int b;
    private final int c;
    private final String d;
    private final String e;
    private final Uri f;
    private final String g;
    private final Uri h;

    public Achievement(String s, String s1, String s2, Uri uri, String s3, Uri uri1, int i, 
            int j)
    {
        a = s;
        d = s1;
        e = s2;
        f = uri;
        g = s3;
        h = uri1;
        b = 0xff000000 | i;
        c = 0xff000000 | j;
    }

    public String a()
    {
        return a;
    }

    public int b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public String d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return e;
    }

    public Uri f()
    {
        return f;
    }

    public String g()
    {
        return g;
    }

    public Uri h()
    {
        return h;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(d);
        parcel.writeString(e);
        parcel.writeParcelable(f, i);
        parcel.writeString(g);
        parcel.writeParcelable(h, i);
        parcel.writeInt(b);
        parcel.writeInt(c);
    }


    /* member class not found */
    class _cls1 {}

}
