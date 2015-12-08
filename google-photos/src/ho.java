// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

final class ho
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new hp();
    private ResultReceiver a;

    ho(Parcel parcel)
    {
        a = (ResultReceiver)ResultReceiver.CREATOR.createFromParcel(parcel);
    }

    static ResultReceiver a(ho ho1)
    {
        return ho1.a;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        a.writeToParcel(parcel, i);
    }

}
