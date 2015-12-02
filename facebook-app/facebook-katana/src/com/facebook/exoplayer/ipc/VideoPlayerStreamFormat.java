// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.exoplayer.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.util.Assertions;

public final class VideoPlayerStreamFormat extends Format
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();

    public VideoPlayerStreamFormat(Parcel parcel)
    {
        super(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
    }

    public VideoPlayerStreamFormat(Format format)
    {
        this(format.a, format.b, format.d, format.e, format.f, format.g, format.h, format.c, format.j, format.i);
    }

    private VideoPlayerStreamFormat(String s, String s1, int i, int j, float f, int k, int l, 
            int i1, String s2, String s3)
    {
        super((String)Assertions.a(s), s1, i, j, f, k, l, i1, s2, s3);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            return ((VideoPlayerStreamFormat)obj).a.equals(a);
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeInt(d);
        parcel.writeInt(e);
        parcel.writeFloat(f);
        parcel.writeInt(g);
        parcel.writeInt(h);
        parcel.writeInt(c);
        parcel.writeString(j);
        parcel.writeString(this.i);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        private static VideoPlayerStreamFormat a(Parcel parcel)
        {
            return new VideoPlayerStreamFormat(parcel);
        }

        private static VideoPlayerStreamFormat[] a(int i)
        {
            return new VideoPlayerStreamFormat[i];
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
