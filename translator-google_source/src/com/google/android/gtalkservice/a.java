// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gtalkservice;

import android.os.Parcel;

// Referenced classes of package com.google.android.gtalkservice:
//            ConnectionError

final class a
    implements android.os.Parcelable.Creator
{

    a()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new ConnectionError(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new ConnectionError[i];
    }
}
