// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.view;

import android.os.Parcel;

final class k
    implements android.os.Parcelable.Creator
{

    k()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new FixedDrawerLayout.SavedState(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new FixedDrawerLayout.SavedState[i];
    }
}
