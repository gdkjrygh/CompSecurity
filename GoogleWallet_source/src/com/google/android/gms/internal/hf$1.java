// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal:
//            hf

static final class 
    implements android.os.lable.Creator
{

    private static hf[] E(int i)
    {
        return new hf[i];
    }

    private static hf k(Parcel parcel)
    {
        return new hf(parcel);
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return k(parcel);
    }

    public final Object[] newArray(int i)
    {
        return E(i);
    }

    ()
    {
    }
}
