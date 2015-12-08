// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack;

import android.os.Parcel;

// Referenced classes of package com.fitbit.runtrack:
//            Duration

static final class 
    implements android.os.Creator
{

    public Duration a(Parcel parcel)
    {
        return new Duration(parcel.readLong());
    }

    public Duration[] a(int i)
    {
        return new Duration[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    ()
    {
    }
}
