// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nux.status;

import android.os.Parcel;

// Referenced classes of package com.facebook.nux.status:
//            NuxStep

final class k
    implements android.os.Parcelable.Creator
{

    k()
    {
    }

    public NuxStep a(Parcel parcel)
    {
        return new NuxStep(parcel, null);
    }

    public NuxStep[] a(int i)
    {
        return new NuxStep[i];
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
