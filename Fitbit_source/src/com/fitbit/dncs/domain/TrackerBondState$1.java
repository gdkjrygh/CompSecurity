// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs.domain;

import android.os.Parcel;

// Referenced classes of package com.fitbit.dncs.domain:
//            TrackerBondState

static final class 
    implements android.os.BondState._cls1
{

    public TrackerBondState a(Parcel parcel)
    {
        return TrackerBondState.a(parcel.readInt());
    }

    public TrackerBondState[] a(int i)
    {
        return new TrackerBondState[i];
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
