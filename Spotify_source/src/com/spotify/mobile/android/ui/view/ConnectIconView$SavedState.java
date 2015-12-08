// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.os.Parcel;
import android.os.Parcelable;

public class b extends android.view.ctIconView.SavedState
{

    public static final android.os.nectIconView.SavedState.b CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new ConnectIconView.SavedState(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new ConnectIconView.SavedState[i];
        }

    };
    public final _cls1 a;
    public final long b;

    public void writeToParcel(Parcel parcel, int i)
    {
        super.Parcel(parcel, i);
        parcel.writeInt(a.nal());
        parcel.writeLong(b);
    }


    _cls1(Parcel parcel)
    {
        super(parcel);
        a = es()[parcel.readInt()];
        b = parcel.readLong();
    }

    b(Parcelable parcelable, b b1, long l)
    {
        super(parcelable);
        a = b1;
        b = l;
    }
}
