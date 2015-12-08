// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

public final class <init>
    implements Parcelable
{

    public static final android.os.ssionCompat.QueueItem.b CREATOR = new android.os.Parcelable.Creator() {

        public MediaSessionCompat.QueueItem a(Parcel parcel)
        {
            return new MediaSessionCompat.QueueItem(parcel, null);
        }

        public MediaSessionCompat.QueueItem[] a(int i)
        {
            return new MediaSessionCompat.QueueItem[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    private final MediaDescriptionCompat a;
    private final long b;

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append("MediaSession.QueueItem {Description=").append(a).append(", Id=").append(b).append(" }").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a.writeToParcel(parcel, i);
        parcel.writeLong(b);
    }


    private _cls1(Parcel parcel)
    {
        a = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.Parcel(parcel);
        b = parcel.readLong();
    }

    b(Parcel parcel, b b1)
    {
        this(parcel);
    }
}
