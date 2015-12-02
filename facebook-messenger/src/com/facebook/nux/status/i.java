// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nux.status;

import android.os.Parcel;

// Referenced classes of package com.facebook.nux.status:
//            NuxStatusResult

final class i
    implements android.os.Parcelable.Creator
{

    i()
    {
    }

    public NuxStatusResult a(Parcel parcel)
    {
        return new NuxStatusResult(parcel, null);
    }

    public NuxStatusResult[] a(int j)
    {
        return new NuxStatusResult[j];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int j)
    {
        return a(j);
    }
}
