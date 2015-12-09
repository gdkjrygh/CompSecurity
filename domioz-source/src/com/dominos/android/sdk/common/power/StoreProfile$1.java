// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.power;

import android.os.Parcel;

// Referenced classes of package com.dominos.android.sdk.common.power:
//            StoreProfile

final class _cls9
    implements android.os.tor
{

    public final StoreProfile createFromParcel(Parcel parcel)
    {
        return new StoreProfile(parcel, null);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final StoreProfile[] newArray(int i)
    {
        return new StoreProfile[i];
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    _cls9()
    {
    }
}
