// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.ksoichiro.android.observablescrollview;

import android.os.Parcel;

final class h
    implements android.os.Parcelable.Creator
{

    h()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new ObservableRecyclerView.SavedState(parcel, (byte)0);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ObservableRecyclerView.SavedState[i];
    }
}
