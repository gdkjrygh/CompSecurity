// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.exoplayer.ipc;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.exoplayer.ipc:
//            VideoPlayerStreamFormat

public final class VideoPlayerStreamEvaluation
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public int a;
    public int b;
    public VideoPlayerStreamFormat c;

    public VideoPlayerStreamEvaluation()
    {
    }

    public VideoPlayerStreamEvaluation(Parcel parcel)
    {
        a(parcel);
    }

    public final void a(Parcel parcel)
    {
        a = parcel.readInt();
        b = parcel.readInt();
        c = (VideoPlayerStreamFormat)parcel.readParcelable(com/facebook/exoplayer/ipc/VideoPlayerStreamFormat.getClassLoader());
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeInt(b);
        parcel.writeParcelable(c, 0);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        private static VideoPlayerStreamEvaluation a(Parcel parcel)
        {
            return new VideoPlayerStreamEvaluation(parcel);
        }

        private static VideoPlayerStreamEvaluation[] a(int i)
        {
            return new VideoPlayerStreamEvaluation[i];
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
