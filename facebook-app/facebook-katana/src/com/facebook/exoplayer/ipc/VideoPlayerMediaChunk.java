// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.exoplayer.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer.chunk.MediaChunk;

// Referenced classes of package com.facebook.exoplayer.ipc:
//            VideoPlayerStreamFormat

public final class VideoPlayerMediaChunk
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public final int a;
    public VideoPlayerStreamFormat b;
    public final long c;
    public final long d;
    public final int e;
    public final boolean f;

    public VideoPlayerMediaChunk()
    {
        this(0, null, -1L, -1L, -1, true);
    }

    private VideoPlayerMediaChunk(int i, VideoPlayerStreamFormat videoplayerstreamformat, long l, long l1, int j, 
            boolean flag)
    {
        a = i;
        b = videoplayerstreamformat;
        c = l;
        d = l1;
        e = j;
        f = flag;
    }

    public VideoPlayerMediaChunk(Parcel parcel)
    {
        boolean flag = true;
        int i = parcel.readInt();
        VideoPlayerStreamFormat videoplayerstreamformat = (VideoPlayerStreamFormat)parcel.readParcelable(com/facebook/exoplayer/ipc/VideoPlayerStreamFormat.getClassLoader());
        long l = parcel.readLong();
        long l1 = parcel.readLong();
        int j = parcel.readInt();
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        this(i, videoplayerstreamformat, l, l1, j, flag);
    }

    public VideoPlayerMediaChunk(MediaChunk mediachunk)
    {
        this(mediachunk.c, new VideoPlayerStreamFormat(mediachunk.d), mediachunk.g, mediachunk.h, mediachunk.i, mediachunk.j);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeParcelable(b, i);
        parcel.writeLong(c);
        parcel.writeLong(d);
        parcel.writeInt(e);
        if (f)
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

        private static VideoPlayerMediaChunk a(Parcel parcel)
        {
            return new VideoPlayerMediaChunk(parcel);
        }

        private static VideoPlayerMediaChunk[] a(int i)
        {
            return new VideoPlayerMediaChunk[i];
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
