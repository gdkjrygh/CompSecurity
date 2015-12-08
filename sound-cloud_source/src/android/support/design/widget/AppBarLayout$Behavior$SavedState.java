// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.design.widget:
//            AppBarLayout

protected static class firstVisibileChildAtMinimumHeight extends android.view.avior.SavedState
{

    public static final android.os.ehavior.SavedState._cls1 CREATOR = new _cls1();
    boolean firstVisibileChildAtMinimumHeight;
    float firstVisibileChildPercentageShown;
    int firstVisibleChildIndex;

    public void writeToParcel(Parcel parcel, int i)
    {
        super.(parcel, i);
        parcel.writeInt(firstVisibleChildIndex);
        parcel.writeFloat(firstVisibileChildPercentageShown);
        if (firstVisibileChildAtMinimumHeight)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
    }


    public _cls1(Parcel parcel)
    {
        super(parcel);
        firstVisibleChildIndex = parcel.readInt();
        firstVisibileChildPercentageShown = parcel.readFloat();
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        firstVisibileChildAtMinimumHeight = flag;
    }

    public firstVisibileChildAtMinimumHeight(Parcelable parcelable)
    {
        super(parcelable);
    }

    class _cls1
        implements android.os.Parcelable.Creator
    {

        public final AppBarLayout.Behavior.SavedState createFromParcel(Parcel parcel)
        {
            return new AppBarLayout.Behavior.SavedState(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final AppBarLayout.Behavior.SavedState[] newArray(int i)
        {
            return new AppBarLayout.Behavior.SavedState[i];
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
