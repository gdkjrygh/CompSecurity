// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            q, EventParams

public final class EventParcel
    implements SafeParcelable
{

    public static final q CREATOR = new q();
    public final int a;
    public final String b;
    public final EventParams c;
    public final String d;
    public final long e;

    EventParcel(int i, String s, EventParams eventparams, String s1, long l)
    {
        a = i;
        b = s;
        c = eventparams;
        d = s1;
        e = l;
    }

    public EventParcel(String s, EventParams eventparams, String s1, long l)
    {
        a = 1;
        b = s;
        c = eventparams;
        d = s1;
        e = l;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return (new StringBuilder("origin=")).append(d).append(",name=").append(b).append(",params=").append(c).toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        q.a(this, parcel, i);
    }

}
