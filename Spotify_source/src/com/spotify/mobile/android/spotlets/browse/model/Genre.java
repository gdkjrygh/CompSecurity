// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.browse.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public class Genre
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            String s = parcel.readString();
            String s1 = parcel.readString();
            String s2 = parcel.readString();
            return new Genre(s, s1, parcel.readString(), s2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final volatile Object[] newArray(int i)
        {
            return new Genre[i];
        }

    };
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    private String g;
    private String h;

    public Genre(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7)
    {
        g = s;
        a = s1;
        h = s3;
        if (TextUtils.isEmpty(s2))
        {
            b = null;
        } else
        {
            b = s2;
        }
        c = s4;
        d = s5;
        e = s6;
        f = s7;
    }

    public final String a()
    {
        if (h != null)
        {
            return h;
        } else
        {
            return "null";
        }
    }

    public final boolean b()
    {
        return b == null;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return a();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(g);
        parcel.writeString(a);
        parcel.writeString(h);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeString(e);
        parcel.writeString(f);
    }

}
