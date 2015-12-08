// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.astuetz;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.astuetz:
//            PagerSlidingTabStrip

static class <init> extends android.view.init>
{

    public static final android.os..currentPosition CREATOR = new android.os.Parcelable.Creator() {

        public PagerSlidingTabStrip.SavedState createFromParcel(Parcel parcel)
        {
            return new PagerSlidingTabStrip.SavedState(parcel, null);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public PagerSlidingTabStrip.SavedState[] newArray(int i)
        {
            return new PagerSlidingTabStrip.SavedState[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    int currentPosition;

    public void writeToParcel(Parcel parcel, int i)
    {
        super.l(parcel, i);
        parcel.writeInt(currentPosition);
    }


    private _cls1(Parcel parcel)
    {
        super(parcel);
        currentPosition = parcel.readInt();
    }

    currentPosition(Parcel parcel, currentPosition currentposition)
    {
        this(parcel);
    }

    public <init>(Parcelable parcelable)
    {
        super(parcelable);
    }
}
