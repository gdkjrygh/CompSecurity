// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            StaggeredGridLayoutManager

static class mFullSpanItems
    implements Parcelable
{

    public static final android.os.ger.SavedState._cls1 CREATOR = new _cls1();
    boolean mAnchorLayoutFromEnd;
    int mAnchorPosition;
    List mFullSpanItems;
    boolean mLastLayoutRTL;
    boolean mReverseLayout;
    int mSpanLookup[];
    int mSpanLookupSize;
    int mSpanOffsets[];
    int mSpanOffsetsSize;
    int mVisibleAnchorPosition;

    public int describeContents()
    {
        return 0;
    }

    void invalidateAnchorPositionInfo()
    {
        mSpanOffsets = null;
        mSpanOffsetsSize = 0;
        mAnchorPosition = -1;
        mVisibleAnchorPosition = -1;
    }

    void invalidateSpanInfo()
    {
        mSpanOffsets = null;
        mSpanOffsetsSize = 0;
        mSpanLookupSize = 0;
        mSpanLookup = null;
        mFullSpanItems = null;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeInt(mAnchorPosition);
        parcel.writeInt(mVisibleAnchorPosition);
        parcel.writeInt(mSpanOffsetsSize);
        if (mSpanOffsetsSize > 0)
        {
            parcel.writeIntArray(mSpanOffsets);
        }
        parcel.writeInt(mSpanLookupSize);
        if (mSpanLookupSize > 0)
        {
            parcel.writeIntArray(mSpanLookup);
        }
        if (mReverseLayout)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (mAnchorLayoutFromEnd)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (mLastLayoutRTL)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeList(mFullSpanItems);
    }


    public kup.FullSpanItem()
    {
    }

    kup.FullSpanItem(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        mAnchorPosition = parcel.readInt();
        mVisibleAnchorPosition = parcel.readInt();
        mSpanOffsetsSize = parcel.readInt();
        if (mSpanOffsetsSize > 0)
        {
            mSpanOffsets = new int[mSpanOffsetsSize];
            parcel.readIntArray(mSpanOffsets);
        }
        mSpanLookupSize = parcel.readInt();
        if (mSpanLookupSize > 0)
        {
            mSpanLookup = new int[mSpanLookupSize];
            parcel.readIntArray(mSpanLookup);
        }
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mReverseLayout = flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mAnchorLayoutFromEnd = flag;
        if (parcel.readInt() == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        mLastLayoutRTL = flag;
        mFullSpanItems = parcel.readArrayList(android/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.getClassLoader());
    }

    public mFullSpanItems(mFullSpanItems mfullspanitems)
    {
        mSpanOffsetsSize = mfullspanitems.mSpanOffsetsSize;
        mAnchorPosition = mfullspanitems.mAnchorPosition;
        mVisibleAnchorPosition = mfullspanitems.mVisibleAnchorPosition;
        mSpanOffsets = mfullspanitems.mSpanOffsets;
        mSpanLookupSize = mfullspanitems.mSpanLookupSize;
        mSpanLookup = mfullspanitems.mSpanLookup;
        mReverseLayout = mfullspanitems.mReverseLayout;
        mAnchorLayoutFromEnd = mfullspanitems.mAnchorLayoutFromEnd;
        mLastLayoutRTL = mfullspanitems.mLastLayoutRTL;
        mFullSpanItems = mfullspanitems.mFullSpanItems;
    }

    class _cls1
        implements android.os.Parcelable.Creator
    {

        public final StaggeredGridLayoutManager.SavedState createFromParcel(Parcel parcel)
        {
            return new StaggeredGridLayoutManager.SavedState(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final StaggeredGridLayoutManager.SavedState[] newArray(int i)
        {
            return new StaggeredGridLayoutManager.SavedState[i];
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
