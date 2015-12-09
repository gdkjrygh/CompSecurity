// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model;

import android.os.Parcel;

// Referenced classes of package com.cardinalblue.android.piccollage.model:
//            Collage

public static class _cls9
    implements android.os..Creator
{

    public Collage a(Parcel parcel)
    {
        return new Collage(parcel);
    }

    public Collage[] a(int i)
    {
        return new Collage[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    public _cls9()
    {
    }
}
