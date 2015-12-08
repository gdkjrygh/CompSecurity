// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.os.Parcel;

// Referenced classes of package com.amazon.device.associates:
//            Offset

final class aj
    implements android.os.Parcelable.Creator
{

    aj()
    {
    }

    public Offset a(Parcel parcel)
    {
        return new Offset(parcel, null);
    }

    public Offset[] a(int i)
    {
        return new Offset[i];
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
