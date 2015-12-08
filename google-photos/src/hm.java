// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;

public final class hm
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new hn();
    private final ft a;
    private final long b;

    hm(Parcel parcel)
    {
        a = (ft)ft.CREATOR.createFromParcel(parcel);
        b = parcel.readLong();
    }

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

}
