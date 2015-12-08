// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jeremyfeinstein.slidingmenu.lib;

import android.os.Parcel;

final class p
    implements android.os.Parcelable.Creator
{

    p()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new SlidingMenu.SavedState(parcel, (byte)0);
    }

    public final volatile Object[] newArray(int i)
    {
        return new SlidingMenu.SavedState[i];
    }
}
