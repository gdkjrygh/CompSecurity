// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.skin;

import android.os.Parcel;

final class j
    implements android.os.Parcelable.Creator
{

    j()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new ColorPickerPreference.SavedState(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ColorPickerPreference.SavedState[i];
    }
}
