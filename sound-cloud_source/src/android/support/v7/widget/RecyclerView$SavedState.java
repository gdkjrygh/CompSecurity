// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

static class mLayoutState extends android.view.w.SavedState
{

    public static final android.os.iew.SavedState._cls1 CREATOR = new _cls1();
    Parcelable mLayoutState;

    private void copyFrom(mLayoutState mlayoutstate)
    {
        mLayoutState = mlayoutstate.mLayoutState;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.eToParcel(parcel, i);
        parcel.writeParcelable(mLayoutState, 0);
    }



    er(Parcel parcel)
    {
        super(parcel);
        mLayoutState = parcel.readParcelable(android/support/v7/widget/RecyclerView$LayoutManager.getClassLoader());
    }

    mLayoutState(Parcelable parcelable)
    {
        super(parcelable);
    }

    class _cls1
        implements android.os.Parcelable.Creator
    {

        public final RecyclerView.SavedState createFromParcel(Parcel parcel)
        {
            return new RecyclerView.SavedState(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final RecyclerView.SavedState[] newArray(int i)
        {
            return new RecyclerView.SavedState[i];
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
