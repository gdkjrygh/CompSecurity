// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;

public class MediaSessionCompat
{
    public static final class QueueItem
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public QueueItem a(Parcel parcel)
            {
                return new QueueItem(parcel);
            }

            public QueueItem[] a(int i)
            {
                return new QueueItem[i];
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


        private QueueItem(Parcel parcel)
        {
            a = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            b = parcel.readLong();
        }

    }

    static final class ResultReceiverWrapper
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public ResultReceiverWrapper a(Parcel parcel)
            {
                return new ResultReceiverWrapper(parcel);
            }

            public ResultReceiverWrapper[] a(int i)
            {
                return new ResultReceiverWrapper[i];
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
        private ResultReceiver a;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
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

            public Token a(Parcel parcel)
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

            public Token[] a(int i)
            {
                return new Token[i];
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
        private final Object a;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
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
