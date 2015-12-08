// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.hlistview;

import android.os.Parcel;

final class o
    implements android.os.Parcelable.Creator
{

    o()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new AbsHListView.SavedState(parcel, (byte)0);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AbsHListView.SavedState[i];
    }
}
