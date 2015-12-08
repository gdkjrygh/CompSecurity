// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.grid;

import android.os.Parcel;
import android.os.Parcelable;

class <init> extends android.view.vedState
{

    public static final android.os.SavedState._cls1 CREATOR = new _cls1();
    float offset;

    public void writeToParcel(Parcel parcel, int i)
    {
        super.rcel(parcel, i);
        parcel.writeFloat(offset);
    }


    private _cls1(Parcel parcel)
    {
        super(parcel);
        offset = parcel.readFloat();
    }

    offset(Parcel parcel, offset offset1)
    {
        this(parcel);
    }

    <init>(Parcelable parcelable)
    {
        super(parcelable);
    }

    class _cls1
        implements android.os.Parcelable.Creator
    {

        public final PinterestGridView.SavedState createFromParcel(Parcel parcel)
        {
            return new PinterestGridView.SavedState(parcel, null);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final PinterestGridView.SavedState[] newArray(int i)
        {
            return new PinterestGridView.SavedState[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

            _cls1()
            {
            }
    }

}
