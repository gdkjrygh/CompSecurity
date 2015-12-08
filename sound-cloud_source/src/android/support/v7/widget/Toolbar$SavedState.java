// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v7.widget:
//            Toolbar

public static class isOverflowOpen extends android.view.
{

    public static final android.os.bar.SavedState._cls1 CREATOR = new _cls1();
    int expandedMenuItemId;
    boolean isOverflowOpen;

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        parcel.writeInt(expandedMenuItemId);
        if (isOverflowOpen)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }


    public _cls1(Parcel parcel)
    {
        super(parcel);
        expandedMenuItemId = parcel.readInt();
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isOverflowOpen = flag;
    }

    public isOverflowOpen(Parcelable parcelable)
    {
        super(parcelable);
    }

    class _cls1
        implements android.os.Parcelable.Creator
    {

        public final Toolbar.SavedState createFromParcel(Parcel parcel)
        {
            return new Toolbar.SavedState(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final Toolbar.SavedState[] newArray(int i)
        {
            return new Toolbar.SavedState[i];
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
