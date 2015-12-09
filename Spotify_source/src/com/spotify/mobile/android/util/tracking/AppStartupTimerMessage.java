// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util.tracking;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import gen;

public final class AppStartupTimerMessage
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new AppStartupTimerMessage(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new AppStartupTimerMessage[i];
        }

    };
    public String a;
    public boolean b;
    public long c;

    protected AppStartupTimerMessage(Parcel parcel)
    {
        b = gen.a(parcel);
        a = parcel.readString();
        c = parcel.readLong();
    }

    private AppStartupTimerMessage(String s, boolean flag, long l)
    {
        b = flag;
        a = s;
        c = l;
    }

    public static AppStartupTimerMessage a(Intent intent)
    {
        return (AppStartupTimerMessage)intent.getParcelableExtra("app_startup_message");
    }

    public static AppStartupTimerMessage a(String s, boolean flag, long l)
    {
        return new AppStartupTimerMessage(s, flag, l);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        gen.a(parcel, b);
        parcel.writeString(a);
        parcel.writeLong(c);
    }

}
