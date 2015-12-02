// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.attachments;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.facebook.orca.attachments:
//            b

public class AudioAttachmentData
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    private final long a;
    private final Uri b;

    public AudioAttachmentData(long l, Uri uri)
    {
        a = l;
        b = uri;
    }

    private AudioAttachmentData(Parcel parcel)
    {
        a = parcel.readLong();
        b = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
    }

    AudioAttachmentData(Parcel parcel, b b1)
    {
        this(parcel);
    }

    public long a()
    {
        return a;
    }

    public Uri b()
    {
        return b;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(a);
        parcel.writeParcelable(b, i);
    }

}
