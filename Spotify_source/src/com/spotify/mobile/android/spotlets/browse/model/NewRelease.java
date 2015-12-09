// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.browse.model;

import android.os.Parcel;

// Referenced classes of package com.spotify.mobile.android.spotlets.browse.model:
//            Playable

public class NewRelease extends Playable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new NewRelease(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final volatile Object[] newArray(int i)
        {
            return new NewRelease[i];
        }

    };
    public String a;
    public String b;
    private String e;

    public NewRelease(String s, String s1, String s2, String s3)
    {
        super(s1);
        a = s;
        e = s2;
        b = s3;
    }

    public final String a()
    {
        return (new StringBuilder("https://d3rt1990lpmkn.cloudfront.net/300/")).append(e).toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(super.c);
        parcel.writeString(e);
        parcel.writeString(b);
    }

}
