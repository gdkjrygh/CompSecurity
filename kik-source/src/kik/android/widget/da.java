// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.os.Parcel;

final class da
    implements android.os.Parcelable.Creator
{

    da()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new ProgressWheel.WheelSavedState(parcel, (byte)0);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ProgressWheel.WheelSavedState[i];
    }
}
