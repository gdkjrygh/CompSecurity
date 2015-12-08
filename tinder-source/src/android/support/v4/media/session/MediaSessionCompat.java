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

            public final Object createFromParcel(Parcel parcel)
            {
                return new QueueItem(parcel, (byte)0);
            }

            public final volatile Object[] newArray(int i)
            {
                return new QueueItem[i];
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


        private QueueItem(Parcel parcel)
        {
            a = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            b = parcel.readLong();
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

            public final Object createFromParcel(Parcel parcel)
            {
                return new ResultReceiverWrapper(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return new ResultReceiverWrapper[i];
            }

        };
        private ResultReceiver a;

        public final int describeContents()
        {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            a.writeToParcel(parcel, i);
        }


        ResultReceiverWrapper(Parcel parcel)
        {
            a = (ResultReceiver)ResultReceiver.CREATOR.createFromParcel(parcel);
        }
    }

    public static final class Token
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
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
        public final Object a;

        public final int describeContents()
        {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                parcel.writeParcelable((Parcelable)a, i);
                return;
            } else
            {
                parcel.writeStrongBinder((IBinder)a);
                return;
            }
        }


        Token(Object obj)
        {
            a = obj;
        }
    }

}
