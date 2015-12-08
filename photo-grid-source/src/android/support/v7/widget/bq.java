// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Parcel;

final class bq
    implements android.os.Parcelable.Creator
{

    bq()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        return new StaggeredGridLayoutManager.SavedState(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new StaggeredGridLayoutManager.SavedState[i];
    }
}
