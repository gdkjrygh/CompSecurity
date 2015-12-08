// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            EventParcelCreator, EventParams

public final class EventParcel
    implements SafeParcelable
{

    public static final EventParcelCreator CREATOR = new EventParcelCreator();
    public final long eventTimeInMilliseconds;
    public final String name;
    public final String origin;
    public final EventParams params;
    public final int versionCode;

    EventParcel(int i, String s, EventParams eventparams, String s1, long l)
    {
        versionCode = i;
        name = s;
        params = eventparams;
        origin = s1;
        eventTimeInMilliseconds = l;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return (new StringBuilder("origin=")).append(origin).append(",name=").append(name).append(",params=").append(params).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        EventParcelCreator.writeToParcel(this, parcel, i);
    }

}
