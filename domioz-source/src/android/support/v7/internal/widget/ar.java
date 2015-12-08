// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.os.Parcel;

final class ar
    implements android.os.Parcelable.Creator
{

    ar()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new SpinnerCompat.SavedState(parcel, (byte)0);
    }

    public final volatile Object[] newArray(int i)
    {
        return new SpinnerCompat.SavedState[i];
    }
}
