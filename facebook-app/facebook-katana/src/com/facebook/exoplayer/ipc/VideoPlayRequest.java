// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.exoplayer.ipc;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

public final class VideoPlayRequest
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public Uri a;
    public String b;
    public Uri c;
    public String d;
    public ParcelFileDescriptor e;

    public VideoPlayRequest()
    {
    }

    public VideoPlayRequest(Uri uri, String s, Uri uri1, String s1, ParcelFileDescriptor parcelfiledescriptor)
    {
        a = uri;
        b = s;
        c = uri1;
        d = s1;
        e = parcelfiledescriptor;
    }

    public VideoPlayRequest(Parcel parcel)
    {
        a = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        b = parcel.readString();
        c = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        d = parcel.readString();
        e = parcel.readFileDescriptor();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, 0);
        parcel.writeString(b);
        parcel.writeParcelable(c, 0);
        parcel.writeString(d);
        if (e != null)
        {
            parcel.writeFileDescriptor(e.getFileDescriptor());
        }
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        private static VideoPlayRequest a(Parcel parcel)
        {
            return new VideoPlayRequest(parcel);
        }

        private static VideoPlayRequest[] a(int i)
        {
            return new VideoPlayRequest[i];
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
