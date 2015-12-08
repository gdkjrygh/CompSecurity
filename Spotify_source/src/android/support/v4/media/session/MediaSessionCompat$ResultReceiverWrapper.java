// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

public final class a
    implements Parcelable
{

    public static final android.os.ResultReceiverWrapper.a CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new MediaSessionCompat.ResultReceiverWrapper(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new MediaSessionCompat.ResultReceiverWrapper[i];
        }

    };
    private ResultReceiver a;

    public static ResultReceiver a(a a1)
    {
        return a1.a;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        a.writeToParcel(parcel, i);
    }


    _cls1(Parcel parcel)
    {
        a = (ResultReceiver)ResultReceiver.CREATOR.a(parcel);
    }
}
