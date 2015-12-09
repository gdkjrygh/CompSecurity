// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;

public final class MediaSessionCompat
{
    public static final class QueueItem
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return new QueueItem(parcel, (byte)0);
            }

            public final volatile Object[] newArray(int i)
            {
                return new QueueItem[i];
            }

        };
        private final MediaDescriptionCompat mDescription;
        private final long mId;

        public final int describeContents()
        {
            return 0;
        }

        public final String toString()
        {
            return (new StringBuilder("MediaSession.QueueItem {Description=")).append(mDescription).append(", Id=").append(mId).append(" }").toString();
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            mDescription.writeToParcel(parcel, i);
            parcel.writeLong(mId);
        }


        private QueueItem(Parcel parcel)
        {
            mDescription = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            mId = parcel.readLong();
        }

        QueueItem(Parcel parcel, byte byte0)
        {
            this(parcel);
        }
    }

    static final class ResultReceiverWrapper
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return new ResultReceiverWrapper(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return new ResultReceiverWrapper[i];
            }

        };
        private ResultReceiver mResultReceiver;

        public final int describeContents()
        {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            mResultReceiver.writeToParcel(parcel, i);
        }


        ResultReceiverWrapper(Parcel parcel)
        {
            mResultReceiver = (ResultReceiver)ResultReceiver.CREATOR.createFromParcel(parcel);
        }
    }

    public static final class Token
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final volatile Object createFromParcel(Parcel parcel)
            {
                if (android.os.Build.VERSION.SDK_INT >= 21)
                {
                    parcel = parcel.readParcelable(null);
                } else
                {
                    parcel = parcel.readStrongBinder();
                }
                return new Token(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return new Token[i];
            }

        };
        private final Object mInner;

        public final int describeContents()
        {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                parcel.writeParcelable((Parcelable)mInner, i);
                return;
            } else
            {
                parcel.writeStrongBinder((IBinder)mInner);
                return;
            }
        }


        Token(Object obj)
        {
            mInner = obj;
        }
    }

}
