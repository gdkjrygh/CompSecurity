// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.wearable.view;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.wearable.view:
//            GridViewPager

public static class <init> extends android.view.Pager.SavedState
{

    public static final android.os.ewPager.SavedState.currentY CREATOR = new android.os.Parcelable.Creator() {

        public GridViewPager.SavedState createFromParcel(Parcel parcel)
        {
            return new GridViewPager.SavedState(parcel, null);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public GridViewPager.SavedState[] newArray(int i)
        {
            return new GridViewPager.SavedState[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    int currentX;
    int currentY;

    public void writeToParcel(Parcel parcel, int i)
    {
        super.ToParcel(parcel, i);
        parcel.writeInt(currentX);
        parcel.writeInt(currentY);
    }


    private _cls1(Parcel parcel)
    {
        super(parcel);
        currentX = parcel.readInt();
        currentY = parcel.readInt();
    }

    currentY(Parcel parcel, currentY currenty)
    {
        this(parcel);
    }

    public <init>(Parcelable parcelable)
    {
        super(parcelable);
    }
}
