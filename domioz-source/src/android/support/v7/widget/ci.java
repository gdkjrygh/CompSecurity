// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Parcel;

final class ci
    implements android.os.Parcelable.Creator
{

    ci()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new Toolbar.SavedState(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new Toolbar.SavedState[i];
    }
}
