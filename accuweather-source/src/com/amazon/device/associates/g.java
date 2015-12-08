// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.os.Parcel;

// Referenced classes of package com.amazon.device.associates:
//            Receipt

final class g
    implements android.os.Parcelable.Creator
{

    g()
    {
    }

    public Receipt a(Parcel parcel)
    {
        return new Receipt(parcel, null);
    }

    public Receipt[] a(int i)
    {
        return new Receipt[i];
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public volatile Object[] newArray(int i)
    {
        return a(i);
    }
}
