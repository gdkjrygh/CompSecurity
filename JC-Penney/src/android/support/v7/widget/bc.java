// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Parcel;

final class bc
    implements android.os.Parcelable.Creator
{

    bc()
    {
    }

    public Toolbar.SavedState a(Parcel parcel)
    {
        return new Toolbar.SavedState(parcel);
    }

    public Toolbar.SavedState[] a(int i)
    {
        return new Toolbar.SavedState[i];
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
