// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user;

import android.os.Parcel;

// Referenced classes of package com.facebook.user:
//            LastActive

final class f
    implements android.os.Parcelable.Creator
{

    f()
    {
    }

    public LastActive a(Parcel parcel)
    {
        return new LastActive(parcel);
    }

    public LastActive[] a(int i)
    {
        return new LastActive[i];
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
