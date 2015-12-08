// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.browse.model;

import android.os.Parcel;

// Referenced classes of package com.spotify.mobile.android.spotlets.browse.model:
//            Playable

public class Playlist extends Playable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new Playlist(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        public final volatile Object[] newArray(int i)
        {
            return new Playlist[i];
        }

    };
    public String a;
    public String b;
    public String e;
    public int f;
    private String g;

    public Playlist(String s, String s1, String s2, String s3, String s4, int i)
    {
        super(s3);
        a = s;
        b = s1;
        e = s2;
        if (s4 != null && s4.startsWith("https://d3rt1990lpmkn.cloudfront.net/300/"))
        {
            g = s4.substring(41);
        } else
        {
            g = s4;
        }
        f = i;
    }

    public final String a()
    {
        if (g.startsWith("http"))
        {
            return g;
        } else
        {
            return (new StringBuilder("https://d3rt1990lpmkn.cloudfront.net/300/")).append(g).toString();
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(e);
        parcel.writeString(super.c);
        parcel.writeString(g);
        parcel.writeInt(f);
    }

}
