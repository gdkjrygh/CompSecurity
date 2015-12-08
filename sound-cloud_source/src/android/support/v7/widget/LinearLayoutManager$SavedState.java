// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v7.widget:
//            LinearLayoutManager

static class mAnchorLayoutFromEnd
    implements Parcelable
{

    public static final android.os.ger.SavedState._cls1 CREATOR = new _cls1();
    boolean mAnchorLayoutFromEnd;
    int mAnchorOffset;
    int mAnchorPosition;

    public int describeContents()
    {
        return 0;
    }

    boolean hasValidAnchor()
    {
        return mAnchorPosition >= 0;
    }

    void invalidateAnchor()
    {
        mAnchorPosition = -1;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(mAnchorPosition);
        parcel.writeInt(mAnchorOffset);
        if (mAnchorLayoutFromEnd)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }


    public _cls1()
    {
    }

    _cls1(Parcel parcel)
    {
        boolean flag = true;
        super();
        mAnchorPosition = parcel.readInt();
        mAnchorOffset = parcel.readInt();
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        mAnchorLayoutFromEnd = flag;
    }

    public mAnchorLayoutFromEnd(mAnchorLayoutFromEnd manchorlayoutfromend)
    {
        mAnchorPosition = manchorlayoutfromend.mAnchorPosition;
        mAnchorOffset = manchorlayoutfromend.mAnchorOffset;
        mAnchorLayoutFromEnd = manchorlayoutfromend.mAnchorLayoutFromEnd;
    }

    class _cls1
        implements android.os.Parcelable.Creator
    {

        public final LinearLayoutManager.SavedState createFromParcel(Parcel parcel)
        {
            return new LinearLayoutManager.SavedState(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final LinearLayoutManager.SavedState[] newArray(int i)
        {
            return new LinearLayoutManager.SavedState[i];
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
