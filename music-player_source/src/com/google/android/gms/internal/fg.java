// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal:
//            di

final class fg
    implements android.os.Parcelable.Creator
{

    fg()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new di(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new di[i];
    }
}
