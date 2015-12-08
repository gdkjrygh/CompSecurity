// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.ui;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class SavedState extends android.view.View.BaseSavedState
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public SavedState createFromParcel(Parcel parcel)
        {
            return new SavedState(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public SavedState[] newArray(int i)
        {
            return new SavedState[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public Bundle bundle;

    private SavedState(Parcel parcel)
    {
        super(parcel);
        bundle = new Bundle();
        bundle = parcel.readBundle();
    }


    public SavedState(Parcelable parcelable)
    {
        super(parcelable);
        bundle = new Bundle();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(bundle);
    }

}
