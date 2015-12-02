// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.exoplayer.ipc;

import android.os.Parcel;
import android.os.Parcelable;

public final class MediaRenderer
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public String a;
    public int b;
    public String c;
    public boolean d;

    public MediaRenderer()
    {
    }

    public MediaRenderer(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readInt();
        c = parcel.readString();
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
    }

    public MediaRenderer(String s, int i, String s1)
    {
        a = s;
        b = i;
        c = s1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return true;
    }

    public final int hashCode()
    {
        int j = b;
        int i;
        if (a != null)
        {
            i = a.hashCode();
        } else
        {
            i = 0;
        }
        return (i + j * 31) * 31 + c.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeInt(b);
        parcel.writeString(c);
        if (d)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        private static MediaRenderer a(Parcel parcel)
        {
            return new MediaRenderer(parcel);
        }

        private static MediaRenderer[] a(int i)
        {
            return new MediaRenderer[i];
        }

        public final Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public final Object[] newArray(int i)
        {
            return a(i);
        }

        _cls1()
        {
        }
    }

}
