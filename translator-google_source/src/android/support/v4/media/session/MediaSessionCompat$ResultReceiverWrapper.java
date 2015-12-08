// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

// Referenced classes of package android.support.v4.media.session:
//            b

final class a
    implements Parcelable
{

    public static final android.os.ResultReceiverWrapper.a CREATOR = new b();
    private ResultReceiver a;

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        a.writeToParcel(parcel, i);
    }


    (Parcel parcel)
    {
        a = (ResultReceiver)ResultReceiver.CREATOR.a(parcel);
    }
}
