// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.data;

import android.os.Parcel;

// Referenced classes of package com.pandora.android.data:
//            AlarmData

static final class 
    implements android.os.reator
{

    public AlarmData a(Parcel parcel)
    {
        return new AlarmData(parcel);
    }

    public AlarmData[] a(int i)
    {
        return new AlarmData[i];
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
