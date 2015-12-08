// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.viewpagerindicator;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.viewpagerindicator:
//            CirclePageIndicator

static class <init> extends android.view.avedState
{

    public static final android.os..SavedState.currentPage CREATOR = new android.os.Parcelable.Creator() {

        public CirclePageIndicator.SavedState createFromParcel(Parcel parcel)
        {
            return new CirclePageIndicator.SavedState(parcel, null);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public CirclePageIndicator.SavedState[] newArray(int i)
        {
            return new CirclePageIndicator.SavedState[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    int currentPage;

    public void writeToParcel(Parcel parcel, int i)
    {
        super.el(parcel, i);
        parcel.writeInt(currentPage);
    }


    private _cls1(Parcel parcel)
    {
        super(parcel);
        currentPage = parcel.readInt();
    }

    currentPage(Parcel parcel, currentPage currentpage)
    {
        this(parcel);
    }

    public <init>(Parcelable parcelable)
    {
        super(parcelable);
    }
}
