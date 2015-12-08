// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.graphics;

import android.os.Parcel;

// Referenced classes of package com.aviary.android.feather.library.graphics:
//            RectD

static final class _cls9
    implements android.os.le.Creator
{

    public RectD a(Parcel parcel)
    {
        RectD rectd = new RectD();
        rectd.a(parcel);
        return rectd;
    }

    public RectD[] a(int i)
    {
        return new RectD[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    _cls9()
    {
    }
}
