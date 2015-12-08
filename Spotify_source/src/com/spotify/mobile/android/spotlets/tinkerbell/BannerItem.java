// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.tinkerbell;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import gen;
import java.util.Locale;

public class BannerItem
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new BannerItem(parcel, (byte)0);
        }

        public final volatile Object[] newArray(int i)
        {
            return new BannerItem[i];
        }

    };
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final Intent e;
    public final boolean f;
    public boolean g;
    public final int h;

    public BannerItem(int i, String s, String s1, String s2, Intent intent, int j)
    {
        a = i;
        b = s;
        c = s1;
        d = s2;
        e = intent;
        f = false;
        h = j;
        g = true;
    }

    private BannerItem(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
        e = (Intent)parcel.readParcelable(android/content/Intent.getClassLoader());
        f = gen.a(parcel);
        h = parcel.readInt();
        g = gen.a(parcel);
    }

    BannerItem(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return String.format(Locale.US, "%s/%s/%s/#%08x", new Object[] {
            b, c, d, Integer.valueOf(h)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeParcelable(e, 0);
        gen.a(parcel, f);
        parcel.writeInt(h);
        gen.a(parcel, g);
    }

}
