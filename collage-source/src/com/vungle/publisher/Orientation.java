// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher;

import android.os.Parcel;
import android.os.Parcelable;

public final class Orientation extends Enum
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private static final Orientation a[];
    public static final Orientation autoRotate;
    public static final Orientation matchVideo;

    private Orientation(String s, int i)
    {
        super(s, i);
    }

    public static Orientation valueOf(String s)
    {
        return (Orientation)Enum.valueOf(com/vungle/publisher/Orientation, s);
    }

    public static Orientation[] values()
    {
        return (Orientation[])a.clone();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(ordinal());
    }

    static 
    {
        autoRotate = new Orientation("autoRotate", 0);
        matchVideo = new Orientation("matchVideo", 1);
        a = (new Orientation[] {
            autoRotate, matchVideo
        });
    }

    /* member class not found */
    class _cls1 {}

}
