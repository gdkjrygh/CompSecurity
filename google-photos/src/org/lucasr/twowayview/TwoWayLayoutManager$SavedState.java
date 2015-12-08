// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.lucasr.twowayview;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class superState
    implements Parcelable
{

    public static final android.os.SavedState._cls1 CREATOR = new _cls1();
    public static final _cls1 EMPTY_STATE = new <init>();
    private int anchorItemOffset;
    private int anchorItemPosition;
    private Bundle itemSelectionState;
    private final Parcelable superState;

    public int describeContents()
    {
        return 0;
    }

    public Parcelable getSuperState()
    {
        return superState;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(anchorItemPosition);
        parcel.writeInt(anchorItemOffset);
        parcel.writeParcelable(itemSelectionState, i);
    }




/*
    static Bundle access$002(_cls1 _pcls1, Bundle bundle)
    {
        _pcls1.itemSelectionState = bundle;
        return bundle;
    }

*/



/*
    static int access$202(itemSelectionState itemselectionstate, int i)
    {
        itemselectionstate.anchorItemPosition = i;
        return i;
    }

*/



/*
    static int access$302(anchorItemPosition anchoritemposition, int i)
    {
        anchoritemposition.anchorItemOffset = i;
        return i;
    }

*/

    private anchorItemOffset()
    {
        superState = null;
    }

    protected superState(Parcel parcel)
    {
        superState = EMPTY_STATE;
        anchorItemPosition = parcel.readInt();
        anchorItemOffset = parcel.readInt();
        itemSelectionState = (Bundle)parcel.readParcelable(getClass().getClassLoader());
    }

    protected itemSelectionState(Parcelable parcelable)
    {
        if (parcelable == null)
        {
            throw new IllegalArgumentException("superState must not be null");
        }
        if (parcelable == EMPTY_STATE)
        {
            parcelable = null;
        }
        superState = parcelable;
    }

    class _cls1
        implements android.os.Parcelable.Creator
    {

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final TwoWayLayoutManager.SavedState createFromParcel(Parcel parcel)
        {
            return new TwoWayLayoutManager.SavedState(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        public final TwoWayLayoutManager.SavedState[] newArray(int i)
        {
            return new TwoWayLayoutManager.SavedState[i];
        }

            _cls1()
            {
            }
    }

}
