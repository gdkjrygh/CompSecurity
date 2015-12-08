// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sothree.slidinguppanel;

import android.os.Parcel;

final class c
    implements android.os.Parcelable.Creator
{

    c()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new SlidingUpPanelLayout.SavedState(parcel, (byte)0);
    }

    public final volatile Object[] newArray(int i)
    {
        return new SlidingUpPanelLayout.SavedState[i];
    }
}
