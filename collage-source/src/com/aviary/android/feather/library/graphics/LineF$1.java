// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.graphics;

import android.os.Parcel;

// Referenced classes of package com.aviary.android.feather.library.graphics:
//            LineF

static final class _cls9
    implements android.os.le.Creator
{

    public LineF a(Parcel parcel)
    {
        LineF linef = new LineF();
        linef.a(parcel);
        return linef;
    }

    public LineF[] a(int i)
    {
        return new LineF[i];
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
