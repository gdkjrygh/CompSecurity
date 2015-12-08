// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.weight;

import android.os.Parcel;
import android.util.Pair;

// Referenced classes of package com.fitbit.weight:
//            Fat

static final class eator
    implements android.os.able.Creator
{

    public Fat a(Parcel parcel)
    {
        return new Fat(((Double)Fat.b(parcel).first).doubleValue());
    }

    public Fat[] a(int i)
    {
        return new Fat[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    eator()
    {
    }
}
