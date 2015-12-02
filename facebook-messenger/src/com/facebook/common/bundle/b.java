// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.bundle;

import android.os.Parcel;

// Referenced classes of package com.facebook.common.bundle:
//            ImmutableBundle

final class b
    implements android.os.Parcelable.Creator
{

    b()
    {
    }

    public ImmutableBundle a(Parcel parcel)
    {
        return new ImmutableBundle(parcel, null);
    }

    public ImmutableBundle[] a(int i)
    {
        return new ImmutableBundle[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
