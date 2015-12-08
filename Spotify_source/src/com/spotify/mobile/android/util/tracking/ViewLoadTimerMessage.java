// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util.tracking;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import gen;
import gjd;

public final class ViewLoadTimerMessage
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new ViewLoadTimerMessage(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new ViewLoadTimerMessage[i];
        }

    };
    public String a;
    public String b;
    public boolean c;
    public boolean d;
    public String e;
    public long f;
    public String g;

    protected ViewLoadTimerMessage(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = gen.a(parcel);
        d = gen.a(parcel);
        e = parcel.readString();
        f = parcel.readLong();
        g = parcel.readString();
    }

    private ViewLoadTimerMessage(String s, boolean flag, boolean flag1, String s1, long l, String s2)
    {
        a = s;
        b = null;
        c = flag;
        d = flag1;
        e = s1;
        f = l;
        g = s2;
    }

    public ViewLoadTimerMessage(String s, boolean flag, boolean flag1, String s1, long l, String s2, 
            byte byte0)
    {
        this(s, flag, flag1, s1, l, s2);
    }

    public static ViewLoadTimerMessage a(Intent intent)
    {
        return (ViewLoadTimerMessage)intent.getParcelableExtra("view_load_timer_message");
    }

    public static gjd a(String s, String s1, long l)
    {
        return new gjd(s, s1, l, (byte)0);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        gen.a(parcel, c);
        gen.a(parcel, d);
        parcel.writeString(e);
        parcel.writeLong(f);
        parcel.writeString(g);
    }

}
