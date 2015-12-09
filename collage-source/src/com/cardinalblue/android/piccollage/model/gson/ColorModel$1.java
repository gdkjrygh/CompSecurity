// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.gson;

import android.os.Parcel;

// Referenced classes of package com.cardinalblue.android.piccollage.model.gson:
//            ColorModel

static final class A
    implements android.os.eator
{

    public ColorModel createFromParcel(Parcel parcel)
    {
        return new ColorModel(parcel, null);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public ColorModel[] newArray(int i)
    {
        return new ColorModel[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    A()
    {
    }
}
