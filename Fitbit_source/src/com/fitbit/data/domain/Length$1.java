// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import android.os.Parcel;
import android.util.Pair;

// Referenced classes of package com.fitbit.data.domain:
//            Length, Measurable

static final class ngthUnits
    implements android.os.e.Creator
{

    public Length a(Parcel parcel)
    {
        parcel = Measurable.a(parcel);
        return new Length(((Double)((Pair) (parcel)).first).doubleValue(), (ngthUnits)((Pair) (parcel)).second);
    }

    public Length[] a(int i)
    {
        return new Length[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    ngthUnits()
    {
    }
}
