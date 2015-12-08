// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

// Referenced classes of package android.support.v4.media.session:
//            MediaSessionCompat

public static final class <init>
    implements Parcelable
{

    public static final android.os.ssionCompat.QueueItem.b CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new MediaSessionCompat.QueueItem(parcel, (byte)0);
        }

        public final volatile Object[] newArray(int i)
        {
            return new MediaSessionCompat.QueueItem[i];
        }

    };
    private final MediaDescriptionCompat a;
    private final long b;

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return (new StringBuilder("MediaSession.QueueItem {Description=")).append(a).append(", Id=").append(b).append(" }").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        a.writeToParcel(parcel, i);
        parcel.writeLong(b);
    }


    private _cls1(Parcel parcel)
    {
        a = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.Parcel(parcel);
        b = parcel.readLong();
    }

    b(Parcel parcel, byte byte0)
    {
        this(parcel);
    }
}
