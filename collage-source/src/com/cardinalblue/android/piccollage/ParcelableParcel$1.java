// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage;

import android.os.Parcel;

// Referenced classes of package com.cardinalblue.android.piccollage:
//            ParcelableParcel

static final class 
    implements android.os.derCreator
{

    public ParcelableParcel a(Parcel parcel)
    {
        return new ParcelableParcel(parcel, null);
    }

    public ParcelableParcel a(Parcel parcel, ClassLoader classloader)
    {
        return new ParcelableParcel(parcel, classloader);
    }

    public ParcelableParcel[] a(int i)
    {
        return new ParcelableParcel[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object createFromParcel(Parcel parcel, ClassLoader classloader)
    {
        return a(parcel, classloader);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }

    ()
    {
    }
}
