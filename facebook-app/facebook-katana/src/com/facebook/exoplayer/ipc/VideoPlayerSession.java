// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.exoplayer.ipc;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.exoplayer.ipc:
//            MediaRenderer

public final class VideoPlayerSession
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public String a;
    public Uri b;
    public String c;
    public MediaRenderer d;
    public MediaRenderer e;
    public Uri f;

    public VideoPlayerSession()
    {
    }

    public VideoPlayerSession(Parcel parcel)
    {
        a = parcel.readString();
        b = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        c = parcel.readString();
        d = (MediaRenderer)parcel.readParcelable(com/facebook/exoplayer/ipc/MediaRenderer.getClassLoader());
        e = (MediaRenderer)parcel.readParcelable(com/facebook/exoplayer/ipc/MediaRenderer.getClassLoader());
        f = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
    }

    public VideoPlayerSession(String s, Uri uri, String s1, MediaRenderer mediarenderer, MediaRenderer mediarenderer1, Uri uri1)
    {
        a = s;
        b = uri;
        c = s1;
        d = mediarenderer;
        e = mediarenderer1;
        f = uri1;
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
        int j = 0;
        int k = b.hashCode();
        int i;
        if (a != null)
        {
            i = a.hashCode();
        } else
        {
            i = 0;
        }
        if (f != null)
        {
            j = f.hashCode();
        }
        return (i + k * 31) * 31 + j;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeParcelable(b, 0);
        parcel.writeString(c);
        parcel.writeParcelable(d, 0);
        parcel.writeParcelable(e, 0);
        parcel.writeParcelable(f, 0);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        private static VideoPlayerSession a(Parcel parcel)
        {
            return new VideoPlayerSession(parcel);
        }

        private static VideoPlayerSession[] a(int i)
        {
            return new VideoPlayerSession[i];
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
