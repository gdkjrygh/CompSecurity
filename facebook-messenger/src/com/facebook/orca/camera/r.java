// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera;

import android.os.Parcel;

final class r
    implements android.os.Parcelable.Creator
{

    r()
    {
    }

    public ImageManager.ImageListParam a(Parcel parcel)
    {
        return new ImageManager.ImageListParam(parcel, null);
    }

    public ImageManager.ImageListParam[] a(int i)
    {
        return new ImageManager.ImageListParam[i];
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
