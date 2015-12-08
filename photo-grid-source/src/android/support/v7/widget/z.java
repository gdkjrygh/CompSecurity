// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Parcel;

final class z
    implements android.os.Parcelable.Creator
{

    z()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new LinearLayoutManager.SavedState(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new LinearLayoutManager.SavedState[i];
    }
}
