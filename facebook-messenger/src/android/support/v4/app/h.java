// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Parcel;

final class h
    implements android.os.Parcelable.Creator
{

    h()
    {
    }

    public Fragment.SavedState a(Parcel parcel)
    {
        return new Fragment.SavedState(parcel, null);
    }

    public Fragment.SavedState[] a(int i)
    {
        return new Fragment.SavedState[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
