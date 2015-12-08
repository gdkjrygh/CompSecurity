// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.os.Parcel;

final class bp
    implements android.os.Parcelable.Creator
{

    bp()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new SlidingPaneLayout.SavedState(parcel);
    }

    public final Object[] newArray(int i)
    {
        return new SlidingPaneLayout.SavedState[i];
    }
}
