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

    public static final android.os.ssionCompat.QueueItem.mId CREATOR = new android.os.Parcelable.Creator() {

        public MediaSessionCompat.QueueItem createFromParcel(Parcel parcel)
        {
            return new MediaSessionCompat.QueueItem(parcel, null);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public MediaSessionCompat.QueueItem[] newArray(int i)
        {
            return new MediaSessionCompat.QueueItem[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private final MediaDescriptionCompat mDescription;
    private final long mId;

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append("MediaSession.QueueItem {Description=").append(mDescription).append(", Id=").append(mId).append(" }").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        mDescription.writeToParcel(parcel, i);
        parcel.writeLong(mId);
    }


    private _cls1(Parcel parcel)
    {
        mDescription = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.Parcel(parcel);
        mId = parcel.readLong();
    }

    mId(Parcel parcel, mId mid)
    {
        this(parcel);
    }
}
