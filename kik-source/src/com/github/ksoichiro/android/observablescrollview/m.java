// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.ksoichiro.android.observablescrollview;

import android.os.Parcel;

final class m
    implements android.os.Parcelable.Creator
{

    m()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new ObservableWebView.SavedState(parcel, (byte)0);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ObservableWebView.SavedState[i];
    }
}
