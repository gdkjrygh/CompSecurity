// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import ds;
import er;
import es;
import fb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            OrientationHelper, LayoutState, ScrollbarHelper, RecyclerView, 
//            LinearSmoothScroller

public class StaggeredGridLayoutManager extends RecyclerView.LayoutManager
{
    class AnchorInfo
    {

        boolean mInvalidateOffsets;
        boolean mLayoutFromEnd;
        int mOffset;
        int mPosition;
        final StaggeredGridLayoutManager this$0;

        void assignCoordinateFromPadding()
        {
            int i;
            if (mLayoutFromEnd)
            {
                i = mPrimaryOrientation.getEndAfterPadding();
            } else
            {
                i = mPrimaryOrientation.getStartAfterPadding();
            }
            mOffset = i;
        }

        void assignCoordinateFromPadding(int i)
        {
            if (mLayoutFromEnd)
            {
                mOffset = mPrimaryOrientation.getEndAfterPadding() - i;
                return;
            } else
            {
                mOffset = mPrimaryOrientation.getStartAfterPadding() + i;
                return;
            }
        }

        void reset()
        {
            mPosition = -1;
            mOffset = 0x80000000;
            mLayoutFromEnd = false;
            mInvalidateOffsets = false;
        }

        private AnchorInfo()
        {
            this$0 = StaggeredGridLayoutManager.this;
            super();
        }

    }

    public static class LayoutParams extends RecyclerView.LayoutParams
    {

        public static final int INVALID_SPAN_ID = -1;
        boolean mFullSpan;
        Span mSpan;

        public final int getSpanIndex()
        {
            if (mSpan == null)
            {
                return -1;
            } else
            {
                return mSpan.mIndex;
            }
        }

        public boolean isFullSpan()
        {
            return mFullSpan;
        }

        public void setFullSpan(boolean flag)
        {
            mFullSpan = flag;
        }

        public LayoutParams(int i, int j)
        {
            super(i, j);
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
        }

        public LayoutParams(RecyclerView.LayoutParams layoutparams)
        {
            super(layoutparams);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
        }
    }

    static class LazySpanLookup
    {

        private static final int MIN_SIZE = 10;
        int mData[];
        List mFullSpanItems;

        private int invalidateFullSpansAfter(int i)
        {
            int j;
            int k;
            if (mFullSpanItems == null)
            {
                return -1;
            }
            FullSpanItem fullspanitem = getFullSpanItem(i);
            if (fullspanitem != null)
            {
                mFullSpanItems.remove(fullspanitem);
            }
            k = mFullSpanItems.size();
            j = 0;
_L3:
            if (j >= k)
            {
                break MISSING_BLOCK_LABEL_113;
            }
            if (((FullSpanItem)mFullSpanItems.get(j)).mPosition < i) goto _L2; else goto _L1
_L1:
            if (j != -1)
            {
                FullSpanItem fullspanitem1 = (FullSpanItem)mFullSpanItems.get(j);
                mFullSpanItems.remove(j);
                return fullspanitem1.mPosition;
            } else
            {
                return -1;
            }
_L2:
            j++;
              goto _L3
            j = -1;
              goto _L1
        }

        private void offsetFullSpansForAddition(int i, int j)
        {
            if (mFullSpanItems != null)
            {
                int k = mFullSpanItems.size() - 1;
                while (k >= 0) 
                {
                    FullSpanItem fullspanitem = (FullSpanItem)mFullSpanItems.get(k);
                    if (fullspanitem.mPosition >= i)
                    {
                        fullspanitem.mPosition = fullspanitem.mPosition + j;
                    }
                    k--;
                }
            }
        }

        private void offsetFullSpansForRemoval(int i, int j)
        {
            if (mFullSpanItems != null)
            {
                int k = mFullSpanItems.size() - 1;
                while (k >= 0) 
                {
                    FullSpanItem fullspanitem = (FullSpanItem)mFullSpanItems.get(k);
                    if (fullspanitem.mPosition >= i)
                    {
                        if (fullspanitem.mPosition < i + j)
                        {
                            mFullSpanItems.remove(k);
                        } else
                        {
                            fullspanitem.mPosition = fullspanitem.mPosition - j;
                        }
                    }
                    k--;
                }
            }
        }

        public void addFullSpanItem(FullSpanItem fullspanitem)
        {
            if (mFullSpanItems == null)
            {
                mFullSpanItems = new ArrayList();
            }
            int j = mFullSpanItems.size();
            for (int i = 0; i < j; i++)
            {
                FullSpanItem fullspanitem1 = (FullSpanItem)mFullSpanItems.get(i);
                if (fullspanitem1.mPosition == fullspanitem.mPosition)
                {
                    mFullSpanItems.remove(i);
                }
                if (fullspanitem1.mPosition >= fullspanitem.mPosition)
                {
                    mFullSpanItems.add(i, fullspanitem);
                    return;
                }
            }

            mFullSpanItems.add(fullspanitem);
        }

        void clear()
        {
            if (mData != null)
            {
                Arrays.fill(mData, -1);
            }
            mFullSpanItems = null;
        }

        void ensureSize(int i)
        {
            if (mData == null)
            {
                mData = new int[Math.max(i, 10) + 1];
                Arrays.fill(mData, -1);
            } else
            if (i >= mData.length)
            {
                int ai[] = mData;
                mData = new int[sizeForPosition(i)];
                System.arraycopy(ai, 0, mData, 0, ai.length);
                Arrays.fill(mData, ai.length, mData.length, -1);
                return;
            }
        }

        int forceInvalidateAfter(int i)
        {
            if (mFullSpanItems != null)
            {
                for (int j = mFullSpanItems.size() - 1; j >= 0; j--)
                {
                    if (((FullSpanItem)mFullSpanItems.get(j)).mPosition >= i)
                    {
                        mFullSpanItems.remove(j);
                    }
                }

            }
            return invalidateAfter(i);
        }

        public FullSpanItem getFirstFullSpanItemInRange(int i, int j, int k)
        {
            if (mFullSpanItems != null) goto _L2; else goto _L1
_L1:
            FullSpanItem fullspanitem = null;
_L6:
            return fullspanitem;
_L2:
            int l = 0;
_L8:
            if (l >= mFullSpanItems.size()) goto _L4; else goto _L3
_L3:
            FullSpanItem fullspanitem1;
            fullspanitem1 = (FullSpanItem)mFullSpanItems.get(l);
            if (fullspanitem1.mPosition >= j)
            {
                return null;
            }
            if (fullspanitem1.mPosition < i)
            {
                continue; /* Loop/switch isn't completed */
            }
            fullspanitem = fullspanitem1;
            if (k == 0) goto _L6; else goto _L5
_L5:
            fullspanitem = fullspanitem1;
            if (fullspanitem1.mGapDir == k) goto _L6; else goto _L7
_L7:
            l++;
              goto _L8
_L4:
            return null;
        }

        public FullSpanItem getFullSpanItem(int i)
        {
            if (mFullSpanItems != null) goto _L2; else goto _L1
_L1:
            FullSpanItem fullspanitem = null;
_L4:
            return fullspanitem;
_L2:
            int j = mFullSpanItems.size() - 1;
label0:
            do
            {
label1:
                {
                    if (j < 0)
                    {
                        break label1;
                    }
                    FullSpanItem fullspanitem1 = (FullSpanItem)mFullSpanItems.get(j);
                    fullspanitem = fullspanitem1;
                    if (fullspanitem1.mPosition == i)
                    {
                        break label0;
                    }
                    j--;
                }
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
            return null;
        }

        int getSpan(int i)
        {
            if (mData == null || i >= mData.length)
            {
                return -1;
            } else
            {
                return mData[i];
            }
        }

        int invalidateAfter(int i)
        {
            while (mData == null || i >= mData.length) 
            {
                return -1;
            }
            int j = invalidateFullSpansAfter(i);
            if (j == -1)
            {
                Arrays.fill(mData, i, mData.length, -1);
                return mData.length;
            } else
            {
                Arrays.fill(mData, i, j + 1, -1);
                return j + 1;
            }
        }

        void offsetForAddition(int i, int j)
        {
            if (mData == null || i >= mData.length)
            {
                return;
            } else
            {
                ensureSize(i + j);
                System.arraycopy(mData, i, mData, i + j, mData.length - i - j);
                Arrays.fill(mData, i, i + j, -1);
                offsetFullSpansForAddition(i, j);
                return;
            }
        }

        void offsetForRemoval(int i, int j)
        {
            if (mData == null || i >= mData.length)
            {
                return;
            } else
            {
                ensureSize(i + j);
                System.arraycopy(mData, i + j, mData, i, mData.length - i - j);
                Arrays.fill(mData, mData.length - j, mData.length, -1);
                offsetFullSpansForRemoval(i, j);
                return;
            }
        }

        void setSpan(int i, Span span)
        {
            ensureSize(i);
            mData[i] = span.mIndex;
        }

        int sizeForPosition(int i)
        {
            int j;
            for (j = mData.length; j <= i; j *= 2) { }
            return j;
        }

        LazySpanLookup()
        {
        }
    }

    static class LazySpanLookup.FullSpanItem
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public LazySpanLookup.FullSpanItem createFromParcel(Parcel parcel)
            {
                return new LazySpanLookup.FullSpanItem(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public LazySpanLookup.FullSpanItem[] newArray(int i)
            {
                return new LazySpanLookup.FullSpanItem[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        int mGapDir;
        int mGapPerSpan[];
        int mPosition;

        public int describeContents()
        {
            return 0;
        }

        int getGapForSpan(int i)
        {
            if (mGapPerSpan == null)
            {
                return 0;
            } else
            {
                return mGapPerSpan[i];
            }
        }

        public void invalidateSpanGaps()
        {
            mGapPerSpan = null;
        }

        public String toString()
        {
            return (new StringBuilder()).append("FullSpanItem{mPosition=").append(mPosition).append(", mGapDir=").append(mGapDir).append(", mGapPerSpan=").append(Arrays.toString(mGapPerSpan)).append('}').toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeInt(mPosition);
            parcel.writeInt(mGapDir);
            if (mGapPerSpan != null && mGapPerSpan.length > 0)
            {
                parcel.writeInt(mGapPerSpan.length);
                parcel.writeIntArray(mGapPerSpan);
                return;
            } else
            {
                parcel.writeInt(0);
                return;
            }
        }


        public LazySpanLookup.FullSpanItem()
        {
        }

        public LazySpanLookup.FullSpanItem(Parcel parcel)
        {
            mPosition = parcel.readInt();
            mGapDir = parcel.readInt();
            int i = parcel.readInt();
            if (i > 0)
            {
                mGapPerSpan = new int[i];
                parcel.readIntArray(mGapPerSpan);
            }
        }
    }

    static class SavedState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
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


        public SavedState()
        {
        }

        SavedState(Parcel parcel)
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

        public SavedState(SavedState savedstate)
        {
            mSpanOffsetsSize = savedstate.mSpanOffsetsSize;
            mAnchorPosition = savedstate.mAnchorPosition;
            mVisibleAnchorPosition = savedstate.mVisibleAnchorPosition;
            mSpanOffsets = savedstate.mSpanOffsets;
            mSpanLookupSize = savedstate.mSpanLookupSize;
            mSpanLookup = savedstate.mSpanLookup;
            mReverseLayout = savedstate.mReverseLayout;
            mAnchorLayoutFromEnd = savedstate.mAnchorLayoutFromEnd;
            mLastLayoutRTL = savedstate.mLastLayoutRTL;
            mFullSpanItems = savedstate.mFullSpanItems;
        }
    }

    class Span
    {

        static final int INVALID_LINE = 0x80000000;
        int mCachedEnd;
        int mCachedStart;
        int mDeletedSize;
        final int mIndex;
        private ArrayList mViews;
        final StaggeredGridLayoutManager this$0;

        void appendToSpan(View view)
        {
            LayoutParams layoutparams = getLayoutParams(view);
            layoutparams.mSpan = this;
            mViews.add(view);
            mCachedEnd = 0x80000000;
            if (mViews.size() == 1)
            {
                mCachedStart = 0x80000000;
            }
            if (layoutparams.isItemRemoved() || layoutparams.isItemChanged())
            {
                mDeletedSize = mDeletedSize + mPrimaryOrientation.getDecoratedMeasurement(view);
            }
        }

        void cacheReferenceLineAndClear(boolean flag, int i)
        {
            int j;
            if (flag)
            {
                j = getEndLine(0x80000000);
            } else
            {
                j = getStartLine(0x80000000);
            }
            clear();
            while (j == 0x80000000 || flag && j < mPrimaryOrientation.getEndAfterPadding() || !flag && j > mPrimaryOrientation.getStartAfterPadding()) 
            {
                return;
            }
            int k = j;
            if (i != 0x80000000)
            {
                k = j + i;
            }
            mCachedEnd = k;
            mCachedStart = k;
        }

        void calculateCachedEnd()
        {
            View view = (View)mViews.get(mViews.size() - 1);
            LayoutParams layoutparams = getLayoutParams(view);
            mCachedEnd = mPrimaryOrientation.getDecoratedEnd(view);
            if (layoutparams.mFullSpan)
            {
                LazySpanLookup.FullSpanItem fullspanitem = mLazySpanLookup.getFullSpanItem(layoutparams.getViewPosition());
                if (fullspanitem != null && fullspanitem.mGapDir == 1)
                {
                    int i = mCachedEnd;
                    mCachedEnd = fullspanitem.getGapForSpan(mIndex) + i;
                }
            }
        }

        void calculateCachedStart()
        {
            View view = (View)mViews.get(0);
            LayoutParams layoutparams = getLayoutParams(view);
            mCachedStart = mPrimaryOrientation.getDecoratedStart(view);
            if (layoutparams.mFullSpan)
            {
                LazySpanLookup.FullSpanItem fullspanitem = mLazySpanLookup.getFullSpanItem(layoutparams.getViewPosition());
                if (fullspanitem != null && fullspanitem.mGapDir == -1)
                {
                    mCachedStart = mCachedStart - fullspanitem.getGapForSpan(mIndex);
                }
            }
        }

        void clear()
        {
            mViews.clear();
            invalidateCache();
            mDeletedSize = 0;
        }

        public int findFirstCompletelyVisibleItemPosition()
        {
            if (mReverseLayout)
            {
                return findOneVisibleChild(mViews.size() - 1, -1, true);
            } else
            {
                return findOneVisibleChild(0, mViews.size(), true);
            }
        }

        public int findFirstVisibleItemPosition()
        {
            if (mReverseLayout)
            {
                return findOneVisibleChild(mViews.size() - 1, -1, false);
            } else
            {
                return findOneVisibleChild(0, mViews.size(), false);
            }
        }

        public int findLastCompletelyVisibleItemPosition()
        {
            if (mReverseLayout)
            {
                return findOneVisibleChild(0, mViews.size(), true);
            } else
            {
                return findOneVisibleChild(mViews.size() - 1, -1, true);
            }
        }

        public int findLastVisibleItemPosition()
        {
            if (mReverseLayout)
            {
                return findOneVisibleChild(0, mViews.size(), false);
            } else
            {
                return findOneVisibleChild(mViews.size() - 1, -1, false);
            }
        }

        int findOneVisibleChild(int i, int j, boolean flag)
        {
            byte byte1 = -1;
            int l = mPrimaryOrientation.getStartAfterPadding();
            int i1 = mPrimaryOrientation.getEndAfterPadding();
            byte byte0;
            if (j > i)
            {
                byte0 = 1;
            } else
            {
                byte0 = -1;
            }
            do
            {
label0:
                {
                    View view;
label1:
                    {
                        int k = byte1;
                        if (i != j)
                        {
                            view = (View)mViews.get(i);
                            k = mPrimaryOrientation.getDecoratedStart(view);
                            int j1 = mPrimaryOrientation.getDecoratedEnd(view);
                            if (k >= i1 || j1 <= l)
                            {
                                break label0;
                            }
                            if (!flag)
                            {
                                break label1;
                            }
                            if (k < l || j1 > i1)
                            {
                                break label0;
                            }
                            k = getPosition(view);
                        }
                        return k;
                    }
                    return getPosition(view);
                }
                i += byte0;
            } while (true);
        }

        public int getDeletedSize()
        {
            return mDeletedSize;
        }

        int getEndLine()
        {
            if (mCachedEnd != 0x80000000)
            {
                return mCachedEnd;
            } else
            {
                calculateCachedEnd();
                return mCachedEnd;
            }
        }

        int getEndLine(int i)
        {
            if (mCachedEnd != 0x80000000)
            {
                i = mCachedEnd;
            } else
            if (mViews.size() != 0)
            {
                calculateCachedEnd();
                return mCachedEnd;
            }
            return i;
        }

        LayoutParams getLayoutParams(View view)
        {
            return (LayoutParams)view.getLayoutParams();
        }

        int getNormalizedOffset(int i, int j, int k)
        {
            if (mViews.size() != 0) goto _L2; else goto _L1
_L1:
            j = 0;
_L4:
            return j;
_L2:
            if (i >= 0)
            {
                break; /* Loop/switch isn't completed */
            }
            k = getEndLine() - k;
            if (k <= 0)
            {
                return 0;
            }
            j = i;
            if (-i > k)
            {
                return -k;
            }
            if (true) goto _L4; else goto _L3
_L3:
            k = j - getStartLine();
            if (k <= 0)
            {
                return 0;
            }
            j = i;
            if (k < i)
            {
                return k;
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        int getStartLine()
        {
            if (mCachedStart != 0x80000000)
            {
                return mCachedStart;
            } else
            {
                calculateCachedStart();
                return mCachedStart;
            }
        }

        int getStartLine(int i)
        {
            if (mCachedStart != 0x80000000)
            {
                i = mCachedStart;
            } else
            if (mViews.size() != 0)
            {
                calculateCachedStart();
                return mCachedStart;
            }
            return i;
        }

        void invalidateCache()
        {
            mCachedStart = 0x80000000;
            mCachedEnd = 0x80000000;
        }

        boolean isEmpty(int i, int j)
        {
            int l = mViews.size();
            for (int k = 0; k < l; k++)
            {
                View view = (View)mViews.get(k);
                if (mPrimaryOrientation.getDecoratedStart(view) < j && mPrimaryOrientation.getDecoratedEnd(view) > i)
                {
                    return false;
                }
            }

            return true;
        }

        void onOffset(int i)
        {
            if (mCachedStart != 0x80000000)
            {
                mCachedStart = mCachedStart + i;
            }
            if (mCachedEnd != 0x80000000)
            {
                mCachedEnd = mCachedEnd + i;
            }
        }

        void popEnd()
        {
            int i = mViews.size();
            View view = (View)mViews.remove(i - 1);
            LayoutParams layoutparams = getLayoutParams(view);
            layoutparams.mSpan = null;
            if (layoutparams.isItemRemoved() || layoutparams.isItemChanged())
            {
                mDeletedSize = mDeletedSize - mPrimaryOrientation.getDecoratedMeasurement(view);
            }
            if (i == 1)
            {
                mCachedStart = 0x80000000;
            }
            mCachedEnd = 0x80000000;
        }

        void popStart()
        {
            View view = (View)mViews.remove(0);
            LayoutParams layoutparams = getLayoutParams(view);
            layoutparams.mSpan = null;
            if (mViews.size() == 0)
            {
                mCachedEnd = 0x80000000;
            }
            if (layoutparams.isItemRemoved() || layoutparams.isItemChanged())
            {
                mDeletedSize = mDeletedSize - mPrimaryOrientation.getDecoratedMeasurement(view);
            }
            mCachedStart = 0x80000000;
        }

        void prependToSpan(View view)
        {
            LayoutParams layoutparams = getLayoutParams(view);
            layoutparams.mSpan = this;
            mViews.add(0, view);
            mCachedStart = 0x80000000;
            if (mViews.size() == 1)
            {
                mCachedEnd = 0x80000000;
            }
            if (layoutparams.isItemRemoved() || layoutparams.isItemChanged())
            {
                mDeletedSize = mDeletedSize + mPrimaryOrientation.getDecoratedMeasurement(view);
            }
        }

        void setLine(int i)
        {
            mCachedStart = i;
            mCachedEnd = i;
        }


        private Span(int i)
        {
            this$0 = StaggeredGridLayoutManager.this;
            super();
            mViews = new ArrayList();
            mCachedStart = 0x80000000;
            mCachedEnd = 0x80000000;
            mDeletedSize = 0;
            mIndex = i;
        }

    }


    private static final boolean DEBUG = false;
    public static final int GAP_HANDLING_LAZY = 1;
    public static final int GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS = 2;
    public static final int GAP_HANDLING_NONE = 0;
    public static final int HORIZONTAL = 0;
    private static final int INVALID_OFFSET = 0x80000000;
    public static final String TAG = "StaggeredGridLayoutManager";
    public static final int VERTICAL = 1;
    private final Runnable checkForGapsRunnable = new Runnable() {

        final StaggeredGridLayoutManager this$0;

        public void run()
        {
            checkForGaps();
        }

            
            {
                this$0 = StaggeredGridLayoutManager.this;
                super();
            }
    };
    private final AnchorInfo mAnchorInfo = new AnchorInfo();
    private int mFullSizeSpec;
    private int mGapStrategy;
    private int mHeightSpec;
    private boolean mLaidOutInvalidFullSpan;
    private boolean mLastLayoutFromEnd;
    private boolean mLastLayoutRTL;
    private LayoutState mLayoutState;
    LazySpanLookup mLazySpanLookup;
    private int mOrientation;
    private SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    OrientationHelper mPrimaryOrientation;
    private BitSet mRemainingSpans;
    private boolean mReverseLayout;
    OrientationHelper mSecondaryOrientation;
    boolean mShouldReverseLayout;
    private int mSizePerSpan;
    private boolean mSmoothScrollbarEnabled;
    private int mSpanCount;
    private Span mSpans[];
    private int mWidthSpec;

    public StaggeredGridLayoutManager(int i, int j)
    {
        mSpanCount = -1;
        mReverseLayout = false;
        mShouldReverseLayout = false;
        mPendingScrollPosition = -1;
        mPendingScrollPositionOffset = 0x80000000;
        mLazySpanLookup = new LazySpanLookup();
        mGapStrategy = 2;
        mLaidOutInvalidFullSpan = false;
        mSmoothScrollbarEnabled = true;
        mOrientation = j;
        setSpanCount(i);
    }

    private void appendViewToAllSpans(View view)
    {
        for (int i = mSpanCount - 1; i >= 0; i--)
        {
            mSpans[i].appendToSpan(view);
        }

    }

    private void applyPendingSavedState(AnchorInfo anchorinfo)
    {
        if (mPendingSavedState.mSpanOffsetsSize > 0)
        {
            if (mPendingSavedState.mSpanOffsetsSize == mSpanCount)
            {
                int j = 0;
                while (j < mSpanCount) 
                {
                    mSpans[j].clear();
                    int k = mPendingSavedState.mSpanOffsets[j];
                    int i = k;
                    if (k != 0x80000000)
                    {
                        if (mPendingSavedState.mAnchorLayoutFromEnd)
                        {
                            i = k + mPrimaryOrientation.getEndAfterPadding();
                        } else
                        {
                            i = k + mPrimaryOrientation.getStartAfterPadding();
                        }
                    }
                    mSpans[j].setLine(i);
                    j++;
                }
            } else
            {
                mPendingSavedState.invalidateSpanInfo();
                mPendingSavedState.mAnchorPosition = mPendingSavedState.mVisibleAnchorPosition;
            }
        }
        mLastLayoutRTL = mPendingSavedState.mLastLayoutRTL;
        setReverseLayout(mPendingSavedState.mReverseLayout);
        resolveShouldLayoutReverse();
        if (mPendingSavedState.mAnchorPosition != -1)
        {
            mPendingScrollPosition = mPendingSavedState.mAnchorPosition;
            anchorinfo.mLayoutFromEnd = mPendingSavedState.mAnchorLayoutFromEnd;
        } else
        {
            anchorinfo.mLayoutFromEnd = mShouldReverseLayout;
        }
        if (mPendingSavedState.mSpanLookupSize > 1)
        {
            mLazySpanLookup.mData = mPendingSavedState.mSpanLookup;
            mLazySpanLookup.mFullSpanItems = mPendingSavedState.mFullSpanItems;
        }
    }

    private void attachViewToSpans(View view, LayoutParams layoutparams, LayoutState layoutstate)
    {
        if (layoutstate.mLayoutDirection == 1)
        {
            if (layoutparams.mFullSpan)
            {
                appendViewToAllSpans(view);
                return;
            } else
            {
                layoutparams.mSpan.appendToSpan(view);
                return;
            }
        }
        if (layoutparams.mFullSpan)
        {
            prependViewToAllSpans(view);
            return;
        } else
        {
            layoutparams.mSpan.prependToSpan(view);
            return;
        }
    }

    private int calculateScrollDirectionForPosition(int i)
    {
        byte byte0 = -1;
        if (getChildCount() == 0)
        {
            return !mShouldReverseLayout ? -1 : 1;
        }
        boolean flag;
        if (i < getFirstChildPosition())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag != mShouldReverseLayout)
        {
            i = byte0;
        } else
        {
            i = 1;
        }
        return i;
    }

    private void checkForGaps()
    {
        if (getChildCount() != 0 && mGapStrategy != 0)
        {
            int i;
            int j;
            if (mShouldReverseLayout)
            {
                j = getLastChildPosition();
                i = getFirstChildPosition();
            } else
            {
                j = getFirstChildPosition();
                i = getLastChildPosition();
            }
            if (j == 0 && hasGapsToFix() != null)
            {
                mLazySpanLookup.clear();
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return;
            }
            if (mLaidOutInvalidFullSpan)
            {
                LazySpanLookup.FullSpanItem fullspanitem;
                byte byte0;
                if (mShouldReverseLayout)
                {
                    byte0 = -1;
                } else
                {
                    byte0 = 1;
                }
                fullspanitem = mLazySpanLookup.getFirstFullSpanItemInRange(j, i + 1, byte0);
                if (fullspanitem == null)
                {
                    mLaidOutInvalidFullSpan = false;
                    mLazySpanLookup.forceInvalidateAfter(i + 1);
                    return;
                }
                LazySpanLookup.FullSpanItem fullspanitem1 = mLazySpanLookup.getFirstFullSpanItemInRange(j, fullspanitem.mPosition, byte0 * -1);
                if (fullspanitem1 == null)
                {
                    mLazySpanLookup.forceInvalidateAfter(fullspanitem.mPosition);
                } else
                {
                    mLazySpanLookup.forceInvalidateAfter(fullspanitem1.mPosition + 1);
                }
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return;
            }
        }
    }

    private boolean checkSpanForGap(Span span)
    {
        return mShouldReverseLayout ? span.getEndLine() < mPrimaryOrientation.getEndAfterPadding() : span.getStartLine() > mPrimaryOrientation.getStartAfterPadding();
    }

    private int computeScrollExtent(RecyclerView.State state)
    {
        boolean flag1 = true;
        if (getChildCount() == 0)
        {
            return 0;
        }
        ensureOrientationHelper();
        OrientationHelper orientationhelper = mPrimaryOrientation;
        View view;
        boolean flag;
        if (!mSmoothScrollbarEnabled)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = findFirstVisibleItemClosestToStart(flag);
        if (!mSmoothScrollbarEnabled)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return ScrollbarHelper.computeScrollExtent(state, orientationhelper, view, findFirstVisibleItemClosestToEnd(flag), this, mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.State state)
    {
        boolean flag1 = true;
        if (getChildCount() == 0)
        {
            return 0;
        }
        ensureOrientationHelper();
        OrientationHelper orientationhelper = mPrimaryOrientation;
        View view;
        boolean flag;
        if (!mSmoothScrollbarEnabled)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = findFirstVisibleItemClosestToStart(flag);
        if (!mSmoothScrollbarEnabled)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return ScrollbarHelper.computeScrollOffset(state, orientationhelper, view, findFirstVisibleItemClosestToEnd(flag), this, mSmoothScrollbarEnabled, mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.State state)
    {
        boolean flag1 = true;
        if (getChildCount() == 0)
        {
            return 0;
        }
        ensureOrientationHelper();
        OrientationHelper orientationhelper = mPrimaryOrientation;
        View view;
        boolean flag;
        if (!mSmoothScrollbarEnabled)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = findFirstVisibleItemClosestToStart(flag);
        if (!mSmoothScrollbarEnabled)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return ScrollbarHelper.computeScrollRange(state, orientationhelper, view, findFirstVisibleItemClosestToEnd(flag), this, mSmoothScrollbarEnabled);
    }

    private LazySpanLookup.FullSpanItem createFullSpanItemFromEnd(int i)
    {
        LazySpanLookup.FullSpanItem fullspanitem = new LazySpanLookup.FullSpanItem();
        fullspanitem.mGapPerSpan = new int[mSpanCount];
        for (int j = 0; j < mSpanCount; j++)
        {
            fullspanitem.mGapPerSpan[j] = i - mSpans[j].getEndLine(i);
        }

        return fullspanitem;
    }

    private LazySpanLookup.FullSpanItem createFullSpanItemFromStart(int i)
    {
        LazySpanLookup.FullSpanItem fullspanitem = new LazySpanLookup.FullSpanItem();
        fullspanitem.mGapPerSpan = new int[mSpanCount];
        for (int j = 0; j < mSpanCount; j++)
        {
            fullspanitem.mGapPerSpan[j] = mSpans[j].getStartLine(i) - i;
        }

        return fullspanitem;
    }

    private void ensureOrientationHelper()
    {
        if (mPrimaryOrientation == null)
        {
            mPrimaryOrientation = OrientationHelper.createOrientationHelper(this, mOrientation);
            mSecondaryOrientation = OrientationHelper.createOrientationHelper(this, 1 - mOrientation);
            mLayoutState = new LayoutState();
        }
    }

    private int fill(RecyclerView.Recycler recycler, LayoutState layoutstate, RecyclerView.State state)
    {
        mRemainingSpans.set(0, mSpanCount, true);
        int k;
        int l;
        int j1;
        if (layoutstate.mLayoutDirection == 1)
        {
            int i = mPrimaryOrientation.getEndAfterPadding() + mLayoutState.mAvailable;
            l = mLayoutState.mExtra;
            int i1 = mPrimaryOrientation.getEndPadding();
            k = i;
            l = l + i + i1;
        } else
        {
            j = mPrimaryOrientation.getStartAfterPadding() - mLayoutState.mAvailable;
            l = mLayoutState.mExtra;
            j1 = mPrimaryOrientation.getStartAfterPadding();
            k = j;
            l = j - l - j1;
        }
        updateAllRemainingSpans(layoutstate.mLayoutDirection, l);
        if (mShouldReverseLayout)
        {
            j1 = mPrimaryOrientation.getEndAfterPadding();
        } else
        {
            j1 = mPrimaryOrientation.getStartAfterPadding();
        }
        while (layoutstate.hasMore(state) && !mRemainingSpans.isEmpty()) 
        {
            View view = layoutstate.next(recycler);
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            Span span;
            int j;
            int k1;
            int l1;
            int i2;
            int j2;
            if (layoutstate.mLayoutDirection == 1)
            {
                addView(view);
            } else
            {
                addView(view, 0);
            }
            measureChildWithDecorationsAndMargin(view, layoutparams);
            j2 = layoutparams.getViewPosition();
            j = mLazySpanLookup.getSpan(j2);
            if (j == -1)
            {
                k1 = 1;
            } else
            {
                k1 = 0;
            }
            if (k1 != 0)
            {
                LazySpanLookup.FullSpanItem fullspanitem;
                if (layoutparams.mFullSpan)
                {
                    span = mSpans[0];
                } else
                {
                    span = getNextSpan(layoutstate);
                }
                mLazySpanLookup.setSpan(j2, span);
            } else
            {
                span = mSpans[j];
            }
            if (layoutstate.mLayoutDirection == 1)
            {
                if (layoutparams.mFullSpan)
                {
                    j = getMaxEnd(j1);
                } else
                {
                    j = span.getEndLine(j1);
                }
                l1 = j + mPrimaryOrientation.getDecoratedMeasurement(view);
                if (k1 != 0 && layoutparams.mFullSpan)
                {
                    fullspanitem = createFullSpanItemFromEnd(j);
                    fullspanitem.mGapDir = -1;
                    fullspanitem.mPosition = j2;
                    mLazySpanLookup.addFullSpanItem(fullspanitem);
                }
            } else
            {
                if (layoutparams.mFullSpan)
                {
                    j = getMinStart(j1);
                } else
                {
                    j = span.getStartLine(j1);
                }
                i2 = j - mPrimaryOrientation.getDecoratedMeasurement(view);
                if (k1 != 0 && layoutparams.mFullSpan)
                {
                    LazySpanLookup.FullSpanItem fullspanitem1 = createFullSpanItemFromStart(j);
                    fullspanitem1.mGapDir = 1;
                    fullspanitem1.mPosition = j2;
                    mLazySpanLookup.addFullSpanItem(fullspanitem1);
                }
                l1 = j;
                j = i2;
            }
            if (layoutparams.mFullSpan && layoutstate.mItemDirection == -1 && k1 != 0)
            {
                mLaidOutInvalidFullSpan = true;
            }
            layoutparams.mSpan = span;
            attachViewToSpans(view, layoutparams, layoutstate);
            if (layoutparams.mFullSpan)
            {
                k1 = mSecondaryOrientation.getStartAfterPadding();
            } else
            {
                k1 = span.mIndex;
                i2 = mSizePerSpan;
                k1 = mSecondaryOrientation.getStartAfterPadding() + k1 * i2;
            }
            i2 = k1 + mSecondaryOrientation.getDecoratedMeasurement(view);
            if (mOrientation == 1)
            {
                layoutDecoratedWithMargins(view, k1, j, i2, l1);
            } else
            {
                layoutDecoratedWithMargins(view, j, k1, l1, i2);
            }
            if (layoutparams.mFullSpan)
            {
                updateAllRemainingSpans(mLayoutState.mLayoutDirection, l);
            } else
            {
                updateRemainingSpans(span, mLayoutState.mLayoutDirection, l);
            }
            recycle(recycler, mLayoutState, span, k);
        }
        if (mLayoutState.mLayoutDirection == -1)
        {
            return Math.max(0, (k - getMinStart(mPrimaryOrientation.getStartAfterPadding())) + mLayoutState.mAvailable);
        } else
        {
            return Math.max(0, (getMaxEnd(mPrimaryOrientation.getEndAfterPadding()) - k) + mLayoutState.mAvailable);
        }
    }

    private int findFirstReferenceChildPosition(int i)
    {
        int k = getChildCount();
        for (int j = 0; j < k; j++)
        {
            int l = getPosition(getChildAt(j));
            if (l >= 0 && l < i)
            {
                return l;
            }
        }

        return 0;
    }

    private int findLastReferenceChildPosition(int i)
    {
        for (int j = getChildCount() - 1; j >= 0; j--)
        {
            int k = getPosition(getChildAt(j));
            if (k >= 0 && k < i)
            {
                return k;
            }
        }

        return 0;
    }

    private void fixEndGap(RecyclerView.Recycler recycler, RecyclerView.State state, boolean flag)
    {
        int i = getMaxEnd(mPrimaryOrientation.getEndAfterPadding());
        i = mPrimaryOrientation.getEndAfterPadding() - i;
        if (i > 0)
        {
            i -= -scrollBy(-i, recycler, state);
            if (flag && i > 0)
            {
                mPrimaryOrientation.offsetChildren(i);
            }
        }
    }

    private void fixStartGap(RecyclerView.Recycler recycler, RecyclerView.State state, boolean flag)
    {
        int i = getMinStart(mPrimaryOrientation.getStartAfterPadding()) - mPrimaryOrientation.getStartAfterPadding();
        if (i > 0)
        {
            i -= scrollBy(i, recycler, state);
            if (flag && i > 0)
            {
                mPrimaryOrientation.offsetChildren(-i);
            }
        }
    }

    private int getFirstChildPosition()
    {
        if (getChildCount() == 0)
        {
            return 0;
        } else
        {
            return getPosition(getChildAt(0));
        }
    }

    private int getLastChildPosition()
    {
        int i = getChildCount();
        if (i == 0)
        {
            return 0;
        } else
        {
            return getPosition(getChildAt(i - 1));
        }
    }

    private int getMaxEnd(int i)
    {
        int k = mSpans[0].getEndLine(i);
        for (int j = 1; j < mSpanCount;)
        {
            int i1 = mSpans[j].getEndLine(i);
            int l = k;
            if (i1 > k)
            {
                l = i1;
            }
            j++;
            k = l;
        }

        return k;
    }

    private int getMaxStart(int i)
    {
        int k = mSpans[0].getStartLine(i);
        for (int j = 1; j < mSpanCount;)
        {
            int i1 = mSpans[j].getStartLine(i);
            int l = k;
            if (i1 > k)
            {
                l = i1;
            }
            j++;
            k = l;
        }

        return k;
    }

    private int getMinEnd(int i)
    {
        int k = mSpans[0].getEndLine(i);
        for (int j = 1; j < mSpanCount;)
        {
            int i1 = mSpans[j].getEndLine(i);
            int l = k;
            if (i1 < k)
            {
                l = i1;
            }
            j++;
            k = l;
        }

        return k;
    }

    private int getMinStart(int i)
    {
        int k = mSpans[0].getStartLine(i);
        for (int j = 1; j < mSpanCount;)
        {
            int i1 = mSpans[j].getStartLine(i);
            int l = k;
            if (i1 < k)
            {
                l = i1;
            }
            j++;
            k = l;
        }

        return k;
    }

    private Span getNextSpan(LayoutState layoutstate)
    {
        Object obj1 = null;
        Object obj = null;
        byte byte0 = -1;
        int i;
        int j;
        if (preferLastSpan(layoutstate.mLayoutDirection))
        {
            i = mSpanCount - 1;
            j = -1;
        } else
        {
            j = mSpanCount;
            i = 0;
            byte0 = 1;
        }
        if (layoutstate.mLayoutDirection == 1)
        {
            int i2 = mPrimaryOrientation.getStartAfterPadding();
            int i1 = 0x7fffffff;
            int k = i;
            layoutstate = ((LayoutState) (obj));
            i = i1;
            do
            {
                obj = layoutstate;
                if (k == j)
                {
                    break;
                }
                obj = mSpans[k];
                int j1 = ((Span) (obj)).getEndLine(i2);
                if (j1 < i)
                {
                    layoutstate = ((LayoutState) (obj));
                    i = j1;
                }
                k += byte0;
            } while (true);
        } else
        {
            int j2 = mPrimaryOrientation.getEndAfterPadding();
            int k1 = 0x80000000;
            int l = i;
            layoutstate = obj1;
            i = k1;
            do
            {
                obj = layoutstate;
                if (l == j)
                {
                    break;
                }
                obj = mSpans[l];
                int l1 = ((Span) (obj)).getStartLine(j2);
                if (l1 > i)
                {
                    layoutstate = ((LayoutState) (obj));
                    i = l1;
                }
                l += byte0;
            } while (true);
        }
        return ((Span) (obj));
    }

    private void handleUpdate(int i, int j, int k)
    {
        int l;
        if (mShouldReverseLayout)
        {
            l = getLastChildPosition();
        } else
        {
            l = getFirstChildPosition();
        }
        mLazySpanLookup.invalidateAfter(i);
        k;
        JVM INSTR tableswitch 0 3: default 52
    //                   0 70
    //                   1 82
    //                   2 52
    //                   3 94;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        if (i + j > l) goto _L6; else goto _L5
_L5:
        return;
_L2:
        mLazySpanLookup.offsetForAddition(i, j);
        continue; /* Loop/switch isn't completed */
_L3:
        mLazySpanLookup.offsetForRemoval(i, j);
        continue; /* Loop/switch isn't completed */
_L4:
        mLazySpanLookup.offsetForRemoval(i, 1);
        mLazySpanLookup.offsetForAddition(j, 1);
        continue; /* Loop/switch isn't completed */
_L6:
        if (mShouldReverseLayout)
        {
            j = getFirstChildPosition();
        } else
        {
            j = getLastChildPosition();
        }
        if (i > j) goto _L5; else goto _L7
_L7:
        requestLayout();
        return;
        if (true) goto _L1; else goto _L8
_L8:
    }

    private void layoutDecoratedWithMargins(View view, int i, int j, int k, int l)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        layoutDecorated(view, i + layoutparams.leftMargin, j + layoutparams.topMargin, k - layoutparams.rightMargin, l - layoutparams.bottomMargin);
    }

    private void measureChildWithDecorationsAndMargin(View view, int i, int j)
    {
        Rect rect = mRecyclerView.getItemDecorInsetsForChild(view);
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        view.measure(updateSpecWithExtra(i, layoutparams.leftMargin + rect.left, layoutparams.rightMargin + rect.right), updateSpecWithExtra(j, layoutparams.topMargin + rect.top, layoutparams.bottomMargin + rect.bottom));
    }

    private void measureChildWithDecorationsAndMargin(View view, LayoutParams layoutparams)
    {
        if (layoutparams.mFullSpan)
        {
            if (mOrientation == 1)
            {
                measureChildWithDecorationsAndMargin(view, mFullSizeSpec, mHeightSpec);
                return;
            } else
            {
                measureChildWithDecorationsAndMargin(view, mWidthSpec, mFullSizeSpec);
                return;
            }
        } else
        {
            measureChildWithDecorationsAndMargin(view, mWidthSpec, mHeightSpec);
            return;
        }
    }

    private boolean preferLastSpan(int i)
    {
        if (mOrientation != 0) goto _L2; else goto _L1
_L1:
        boolean flag;
        if (i == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag == mShouldReverseLayout) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        boolean flag1;
        if (i == -1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 == mShouldReverseLayout)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 != isLayoutRTL())
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private void prependViewToAllSpans(View view)
    {
        for (int i = mSpanCount - 1; i >= 0; i--)
        {
            mSpans[i].prependToSpan(view);
        }

    }

    private void recycle(RecyclerView.Recycler recycler, LayoutState layoutstate, Span span, int i)
    {
        if (layoutstate.mLayoutDirection == -1)
        {
            recycleFromEnd(recycler, Math.max(i, getMaxStart(span.getStartLine())) + (mPrimaryOrientation.getEnd() - mPrimaryOrientation.getStartAfterPadding()));
            return;
        } else
        {
            recycleFromStart(recycler, Math.min(i, getMinEnd(span.getEndLine())) - (mPrimaryOrientation.getEnd() - mPrimaryOrientation.getStartAfterPadding()));
            return;
        }
    }

    private void recycleFromEnd(RecyclerView.Recycler recycler, int i)
    {
        int j = getChildCount() - 1;
        do
        {
            if (j < 0)
            {
                break;
            }
            View view = getChildAt(j);
            if (mPrimaryOrientation.getDecoratedStart(view) <= i)
            {
                break;
            }
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            if (layoutparams.mFullSpan)
            {
                for (int k = 0; k < mSpanCount; k++)
                {
                    mSpans[k].popEnd();
                }

            } else
            {
                layoutparams.mSpan.popEnd();
            }
            removeAndRecycleView(view, recycler);
            j--;
        } while (true);
    }

    private void recycleFromStart(RecyclerView.Recycler recycler, int i)
    {
        View view;
        for (; getChildCount() > 0; removeAndRecycleView(view, recycler))
        {
            view = getChildAt(0);
            if (mPrimaryOrientation.getDecoratedEnd(view) >= i)
            {
                break;
            }
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            if (layoutparams.mFullSpan)
            {
                for (int j = 0; j < mSpanCount; j++)
                {
                    mSpans[j].popStart();
                }

            } else
            {
                layoutparams.mSpan.popStart();
            }
        }

    }

    private void resolveShouldLayoutReverse()
    {
        boolean flag = true;
        if (mOrientation == 1 || !isLayoutRTL())
        {
            mShouldReverseLayout = mReverseLayout;
            return;
        }
        if (mReverseLayout)
        {
            flag = false;
        }
        mShouldReverseLayout = flag;
    }

    private void updateAllRemainingSpans(int i, int j)
    {
        int k = 0;
        while (k < mSpanCount) 
        {
            if (!mSpans[k].mViews.isEmpty())
            {
                updateRemainingSpans(mSpans[k], i, j);
            }
            k++;
        }
    }

    private boolean updateAnchorFromChildren(RecyclerView.State state, AnchorInfo anchorinfo)
    {
        int i;
        if (mLastLayoutFromEnd)
        {
            i = findLastReferenceChildPosition(state.getItemCount());
        } else
        {
            i = findFirstReferenceChildPosition(state.getItemCount());
        }
        anchorinfo.mPosition = i;
        anchorinfo.mOffset = 0x80000000;
        return true;
    }

    private void updateLayoutStateToFillEnd(int i, RecyclerView.State state)
    {
        boolean flag = true;
        mLayoutState.mAvailable = 0;
        mLayoutState.mCurrentPosition = i;
        if (isSmoothScrolling())
        {
            int j = state.getTargetScrollPosition();
            boolean flag2 = mShouldReverseLayout;
            boolean flag1;
            if (j > i)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag2 == flag1)
            {
                mLayoutState.mExtra = 0;
            } else
            {
                mLayoutState.mExtra = mPrimaryOrientation.getTotalSpace();
            }
        } else
        {
            mLayoutState.mExtra = 0;
        }
        mLayoutState.mLayoutDirection = 1;
        state = mLayoutState;
        i = ((flag) ? 1 : 0);
        if (mShouldReverseLayout)
        {
            i = -1;
        }
        state.mItemDirection = i;
    }

    private void updateLayoutStateToFillStart(int i, RecyclerView.State state)
    {
        boolean flag = true;
        mLayoutState.mAvailable = 0;
        mLayoutState.mCurrentPosition = i;
        if (isSmoothScrolling())
        {
            int j = state.getTargetScrollPosition();
            boolean flag2 = mShouldReverseLayout;
            boolean flag1;
            if (j < i)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag2 == flag1)
            {
                mLayoutState.mExtra = 0;
            } else
            {
                mLayoutState.mExtra = mPrimaryOrientation.getTotalSpace();
            }
        } else
        {
            mLayoutState.mExtra = 0;
        }
        mLayoutState.mLayoutDirection = -1;
        state = mLayoutState;
        if (mShouldReverseLayout)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = -1;
        }
        state.mItemDirection = i;
    }

    private void updateRemainingSpans(Span span, int i, int j)
    {
        int k = span.getDeletedSize();
        if (i == -1)
        {
            if (k + span.getStartLine() < j)
            {
                mRemainingSpans.set(span.mIndex, false);
            }
        } else
        if (span.getEndLine() - k > j)
        {
            mRemainingSpans.set(span.mIndex, false);
            return;
        }
    }

    private int updateSpecWithExtra(int i, int j, int k)
    {
        int l;
        if (j != 0 || k != 0)
        {
            if ((l = android.view.View.MeasureSpec.getMode(i)) == 0x80000000 || l == 0x40000000)
            {
                return android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i) - j - k, l);
            }
        }
        return i;
    }

    public void assertNotInLayoutOrScroll(String s)
    {
        if (mPendingSavedState == null)
        {
            super.assertNotInLayoutOrScroll(s);
        }
    }

    public boolean canScrollHorizontally()
    {
        return mOrientation == 0;
    }

    public boolean canScrollVertically()
    {
        return mOrientation == 1;
    }

    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutparams)
    {
        return layoutparams instanceof LayoutParams;
    }

    public int computeHorizontalScrollExtent(RecyclerView.State state)
    {
        return computeScrollExtent(state);
    }

    public int computeHorizontalScrollOffset(RecyclerView.State state)
    {
        return computeScrollOffset(state);
    }

    public int computeHorizontalScrollRange(RecyclerView.State state)
    {
        return computeScrollRange(state);
    }

    public int computeVerticalScrollExtent(RecyclerView.State state)
    {
        return computeScrollExtent(state);
    }

    public int computeVerticalScrollOffset(RecyclerView.State state)
    {
        return computeScrollOffset(state);
    }

    public int computeVerticalScrollRange(RecyclerView.State state)
    {
        return computeScrollRange(state);
    }

    public int[] findFirstCompletelyVisibleItemPositions(int ai[])
    {
        int ai1[];
        int i;
        if (ai == null)
        {
            ai1 = new int[mSpanCount];
        } else
        {
            ai1 = ai;
            if (ai.length < mSpanCount)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Provided int[]'s size must be more than or equal to span count. Expected:").append(mSpanCount).append(", array size:").append(ai.length).toString());
            }
        }
        for (i = 0; i < mSpanCount; i++)
        {
            ai1[i] = mSpans[i].findFirstCompletelyVisibleItemPosition();
        }

        return ai1;
    }

    View findFirstVisibleItemClosestToEnd(boolean flag)
    {
        ensureOrientationHelper();
        int j = mPrimaryOrientation.getStartAfterPadding();
        int k = mPrimaryOrientation.getEndAfterPadding();
        for (int i = getChildCount() - 1; i >= 0; i--)
        {
            View view = getChildAt(i);
            if (mPrimaryOrientation.getDecoratedStart(view) >= j && (!flag || mPrimaryOrientation.getDecoratedEnd(view) <= k))
            {
                return view;
            }
        }

        return null;
    }

    View findFirstVisibleItemClosestToStart(boolean flag)
    {
        ensureOrientationHelper();
        int j = mPrimaryOrientation.getStartAfterPadding();
        int k = mPrimaryOrientation.getEndAfterPadding();
        int l = getChildCount();
        for (int i = 0; i < l; i++)
        {
            View view = getChildAt(i);
            if ((!flag || mPrimaryOrientation.getDecoratedStart(view) >= j) && mPrimaryOrientation.getDecoratedEnd(view) <= k)
            {
                return view;
            }
        }

        return null;
    }

    int findFirstVisibleItemPositionInt()
    {
        View view;
        if (mShouldReverseLayout)
        {
            view = findFirstVisibleItemClosestToEnd(true);
        } else
        {
            view = findFirstVisibleItemClosestToStart(true);
        }
        if (view == null)
        {
            return -1;
        } else
        {
            return getPosition(view);
        }
    }

    public int[] findFirstVisibleItemPositions(int ai[])
    {
        int ai1[];
        int i;
        if (ai == null)
        {
            ai1 = new int[mSpanCount];
        } else
        {
            ai1 = ai;
            if (ai.length < mSpanCount)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Provided int[]'s size must be more than or equal to span count. Expected:").append(mSpanCount).append(", array size:").append(ai.length).toString());
            }
        }
        for (i = 0; i < mSpanCount; i++)
        {
            ai1[i] = mSpans[i].findFirstVisibleItemPosition();
        }

        return ai1;
    }

    public int[] findLastCompletelyVisibleItemPositions(int ai[])
    {
        int ai1[];
        int i;
        if (ai == null)
        {
            ai1 = new int[mSpanCount];
        } else
        {
            ai1 = ai;
            if (ai.length < mSpanCount)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Provided int[]'s size must be more than or equal to span count. Expected:").append(mSpanCount).append(", array size:").append(ai.length).toString());
            }
        }
        for (i = 0; i < mSpanCount; i++)
        {
            ai1[i] = mSpans[i].findLastCompletelyVisibleItemPosition();
        }

        return ai1;
    }

    public int[] findLastVisibleItemPositions(int ai[])
    {
        int ai1[];
        int i;
        if (ai == null)
        {
            ai1 = new int[mSpanCount];
        } else
        {
            ai1 = ai;
            if (ai.length < mSpanCount)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Provided int[]'s size must be more than or equal to span count. Expected:").append(mSpanCount).append(", array size:").append(ai.length).toString());
            }
        }
        for (i = 0; i < mSpanCount; i++)
        {
            ai1[i] = mSpans[i].findLastVisibleItemPosition();
        }

        return ai1;
    }

    public RecyclerView.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams(-2, -2);
    }

    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeset)
    {
        return new LayoutParams(context, attributeset);
    }

    public RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new LayoutParams(layoutparams);
        }
    }

    public int getColumnCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        if (mOrientation == 1)
        {
            return mSpanCount;
        } else
        {
            return super.getColumnCountForAccessibility(recycler, state);
        }
    }

    public int getGapStrategy()
    {
        return mGapStrategy;
    }

    public int getOrientation()
    {
        return mOrientation;
    }

    public boolean getReverseLayout()
    {
        return mReverseLayout;
    }

    public int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        if (mOrientation == 0)
        {
            return mSpanCount;
        } else
        {
            return super.getRowCountForAccessibility(recycler, state);
        }
    }

    public int getSpanCount()
    {
        return mSpanCount;
    }

    View hasGapsToFix()
    {
        BitSet bitset;
        View view;
        LayoutParams layoutparams;
        byte byte0;
        int k;
        byte byte1;
        int l;
        k = getChildCount() - 1;
        bitset = new BitSet(mSpanCount);
        bitset.set(0, mSpanCount, true);
        int i;
        if (mOrientation == 1 && isLayoutRTL())
        {
            byte0 = 1;
        } else
        {
            byte0 = -1;
        }
        if (mShouldReverseLayout)
        {
            i = k - 1;
            k = -1;
        } else
        {
            i = 0;
        }
        if (i < k)
        {
            byte1 = 1;
        } else
        {
            byte1 = -1;
        }
        l = i;
_L3:
        if (l == k)
        {
            break; /* Loop/switch isn't completed */
        }
        view = getChildAt(l);
        layoutparams = (LayoutParams)view.getLayoutParams();
        if (bitset.get(layoutparams.mSpan.mIndex))
        {
            if (checkSpanForGap(layoutparams.mSpan))
            {
                return view;
            }
            bitset.clear(layoutparams.mSpan.mIndex);
        }
          goto _L1
_L5:
        l += byte1;
        if (true) goto _L3; else goto _L2
_L1:
        if (layoutparams.mFullSpan || l + byte1 == k) goto _L5; else goto _L4
_L4:
        int j;
        Object obj = getChildAt(l + byte1);
        if (mShouldReverseLayout)
        {
            j = mPrimaryOrientation.getDecoratedEnd(view);
            int i1 = mPrimaryOrientation.getDecoratedEnd(((View) (obj)));
            if (j < i1)
            {
                return view;
            }
            if (j != i1)
            {
                break MISSING_BLOCK_LABEL_352;
            }
            j = 1;
        } else
        {
            j = mPrimaryOrientation.getDecoratedStart(view);
            j1 = mPrimaryOrientation.getDecoratedStart(((View) (obj)));
            if (j > j1)
            {
                return view;
            }
            if (j != j1)
            {
                break MISSING_BLOCK_LABEL_352;
            }
            j = 1;
        }
_L6:
        if (j != 0)
        {
            obj = (LayoutParams)((View) (obj)).getLayoutParams();
            int j1;
            if (layoutparams.mSpan.mIndex - ((LayoutParams) (obj)).mSpan.mIndex < 0)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            if (byte0 < 0)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            if (j != j1)
            {
                return view;
            }
        }
          goto _L5
_L2:
        return null;
        j = 0;
          goto _L6
    }

    public void invalidateSpanAssignments()
    {
        mLazySpanLookup.clear();
        requestLayout();
    }

    boolean isLayoutRTL()
    {
        return getLayoutDirection() == 1;
    }

    public void offsetChildrenHorizontal(int i)
    {
        super.offsetChildrenHorizontal(i);
        for (int j = 0; j < mSpanCount; j++)
        {
            mSpans[j].onOffset(i);
        }

    }

    public void offsetChildrenVertical(int i)
    {
        super.offsetChildrenVertical(i);
        for (int j = 0; j < mSpanCount; j++)
        {
            mSpans[j].onOffset(i);
        }

    }

    public void onDetachedFromWindow(RecyclerView recyclerview, RecyclerView.Recycler recycler)
    {
        for (int i = 0; i < mSpanCount; i++)
        {
            mSpans[i].clear();
        }

    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        View view;
        View view1;
label0:
        {
            super.onInitializeAccessibilityEvent(accessibilityevent);
            if (getChildCount() > 0)
            {
                accessibilityevent = er.a(accessibilityevent);
                view = findFirstVisibleItemClosestToStart(false);
                view1 = findFirstVisibleItemClosestToEnd(false);
                if (view != null && view1 != null)
                {
                    break label0;
                }
            }
            return;
        }
        int i = getPosition(view);
        int j = getPosition(view1);
        if (i < j)
        {
            accessibilityevent.b(i);
            accessibilityevent.c(j);
            return;
        } else
        {
            accessibilityevent.b(j);
            accessibilityevent.c(i);
            return;
        }
    }

    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, es es1)
    {
        recycler = view.getLayoutParams();
        if (!(recycler instanceof LayoutParams))
        {
            super.onInitializeAccessibilityNodeInfoForItem(view, es1);
            return;
        }
        recycler = (LayoutParams)recycler;
        if (mOrientation == 0)
        {
            int k = recycler.getSpanIndex();
            int i;
            if (((LayoutParams) (recycler)).mFullSpan)
            {
                i = mSpanCount;
            } else
            {
                i = 1;
            }
            es1.c(es.j.a(k, i, -1, -1, ((LayoutParams) (recycler)).mFullSpan, false));
            return;
        }
        int l = recycler.getSpanIndex();
        int j;
        if (((LayoutParams) (recycler)).mFullSpan)
        {
            j = mSpanCount;
        } else
        {
            j = 1;
        }
        es1.c(es.j.a(-1, -1, l, j, ((LayoutParams) (recycler)).mFullSpan, false));
    }

    public void onItemsAdded(RecyclerView recyclerview, int i, int j)
    {
        handleUpdate(i, j, 0);
    }

    public void onItemsChanged(RecyclerView recyclerview)
    {
        mLazySpanLookup.clear();
        requestLayout();
    }

    public void onItemsMoved(RecyclerView recyclerview, int i, int j, int k)
    {
        handleUpdate(i, j, 3);
    }

    public void onItemsRemoved(RecyclerView recyclerview, int i, int j)
    {
        handleUpdate(i, j, 1);
    }

    public void onItemsUpdated(RecyclerView recyclerview, int i, int j)
    {
        handleUpdate(i, j, 2);
    }

    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        ensureOrientationHelper();
        AnchorInfo anchorinfo = mAnchorInfo;
        anchorinfo.reset();
        if (mPendingSavedState != null)
        {
            applyPendingSavedState(anchorinfo);
        } else
        {
            resolveShouldLayoutReverse();
            anchorinfo.mLayoutFromEnd = mShouldReverseLayout;
        }
        updateAnchorInfoForLayout(state, anchorinfo);
        if (mPendingSavedState == null && (anchorinfo.mLayoutFromEnd != mLastLayoutFromEnd || isLayoutRTL() != mLastLayoutRTL))
        {
            mLazySpanLookup.clear();
            anchorinfo.mInvalidateOffsets = true;
        }
        if (getChildCount() > 0 && (mPendingSavedState == null || mPendingSavedState.mSpanOffsetsSize < 1))
        {
            if (anchorinfo.mInvalidateOffsets)
            {
                for (int i = 0; i < mSpanCount; i++)
                {
                    mSpans[i].clear();
                    if (anchorinfo.mOffset != 0x80000000)
                    {
                        mSpans[i].setLine(anchorinfo.mOffset);
                    }
                }

            } else
            {
                for (int j = 0; j < mSpanCount; j++)
                {
                    mSpans[j].cacheReferenceLineAndClear(mShouldReverseLayout, anchorinfo.mOffset);
                }

            }
        }
        detachAndScrapAttachedViews(recycler);
        mLaidOutInvalidFullSpan = false;
        updateMeasureSpecs();
        if (anchorinfo.mLayoutFromEnd)
        {
            updateLayoutStateToFillStart(anchorinfo.mPosition, state);
            fill(recycler, mLayoutState, state);
            updateLayoutStateToFillEnd(anchorinfo.mPosition, state);
            LayoutState layoutstate = mLayoutState;
            layoutstate.mCurrentPosition = layoutstate.mCurrentPosition + mLayoutState.mItemDirection;
            fill(recycler, mLayoutState, state);
        } else
        {
            updateLayoutStateToFillEnd(anchorinfo.mPosition, state);
            fill(recycler, mLayoutState, state);
            updateLayoutStateToFillStart(anchorinfo.mPosition, state);
            LayoutState layoutstate1 = mLayoutState;
            layoutstate1.mCurrentPosition = layoutstate1.mCurrentPosition + mLayoutState.mItemDirection;
            fill(recycler, mLayoutState, state);
        }
        if (getChildCount() > 0)
        {
            if (mShouldReverseLayout)
            {
                fixEndGap(recycler, state, true);
                fixStartGap(recycler, state, false);
            } else
            {
                fixStartGap(recycler, state, true);
                fixEndGap(recycler, state, false);
            }
        }
        if (!state.isPreLayout())
        {
            if (getChildCount() > 0 && mPendingScrollPosition != -1 && mLaidOutInvalidFullSpan)
            {
                ds.a(getChildAt(0), checkForGapsRunnable);
            }
            mPendingScrollPosition = -1;
            mPendingScrollPositionOffset = 0x80000000;
        }
        mLastLayoutFromEnd = anchorinfo.mLayoutFromEnd;
        mLastLayoutRTL = isLayoutRTL();
        mPendingSavedState = null;
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (parcelable instanceof SavedState)
        {
            mPendingSavedState = (SavedState)parcelable;
            requestLayout();
        }
    }

    public Parcelable onSaveInstanceState()
    {
        if (mPendingSavedState != null)
        {
            return new SavedState(mPendingSavedState);
        }
        SavedState savedstate = new SavedState();
        savedstate.mReverseLayout = mReverseLayout;
        savedstate.mAnchorLayoutFromEnd = mLastLayoutFromEnd;
        savedstate.mLastLayoutRTL = mLastLayoutRTL;
        if (mLazySpanLookup != null && mLazySpanLookup.mData != null)
        {
            savedstate.mSpanLookup = mLazySpanLookup.mData;
            savedstate.mSpanLookupSize = savedstate.mSpanLookup.length;
            savedstate.mFullSpanItems = mLazySpanLookup.mFullSpanItems;
        } else
        {
            savedstate.mSpanLookupSize = 0;
        }
        if (getChildCount() > 0)
        {
            ensureOrientationHelper();
            int i;
            int j;
            if (mLastLayoutFromEnd)
            {
                i = getLastChildPosition();
            } else
            {
                i = getFirstChildPosition();
            }
            savedstate.mAnchorPosition = i;
            savedstate.mVisibleAnchorPosition = findFirstVisibleItemPositionInt();
            savedstate.mSpanOffsetsSize = mSpanCount;
            savedstate.mSpanOffsets = new int[mSpanCount];
            j = 0;
            while (j < mSpanCount) 
            {
                if (mLastLayoutFromEnd)
                {
                    int k = mSpans[j].getEndLine(0x80000000);
                    i = k;
                    if (k != 0x80000000)
                    {
                        i = k - mPrimaryOrientation.getEndAfterPadding();
                    }
                } else
                {
                    int l = mSpans[j].getStartLine(0x80000000);
                    i = l;
                    if (l != 0x80000000)
                    {
                        i = l - mPrimaryOrientation.getStartAfterPadding();
                    }
                }
                savedstate.mSpanOffsets[j] = i;
                j++;
            }
        } else
        {
            savedstate.mAnchorPosition = -1;
            savedstate.mVisibleAnchorPosition = -1;
            savedstate.mSpanOffsetsSize = 0;
        }
        return savedstate;
    }

    public void onScrollStateChanged(int i)
    {
        if (i == 0)
        {
            checkForGaps();
        }
    }

    int scrollBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        int j = 1;
        int k = -1;
        ensureOrientationHelper();
        if (i > 0)
        {
            mLayoutState.mLayoutDirection = 1;
            LayoutState layoutstate = mLayoutState;
            if (mShouldReverseLayout)
            {
                j = k;
            } else
            {
                j = 1;
            }
            layoutstate.mItemDirection = j;
            j = getLastChildPosition();
        } else
        {
            mLayoutState.mLayoutDirection = -1;
            LayoutState layoutstate1 = mLayoutState;
            if (!mShouldReverseLayout)
            {
                j = -1;
            }
            layoutstate1.mItemDirection = j;
            j = getFirstChildPosition();
        }
        mLayoutState.mCurrentPosition = j + mLayoutState.mItemDirection;
        k = Math.abs(i);
        mLayoutState.mAvailable = k;
        layoutstate = mLayoutState;
        if (isSmoothScrolling())
        {
            j = mPrimaryOrientation.getTotalSpace();
        } else
        {
            j = 0;
        }
        layoutstate.mExtra = j;
        j = fill(recycler, mLayoutState, state);
        if (k >= j)
        {
            if (i < 0)
            {
                i = -j;
            } else
            {
                i = j;
            }
        }
        mPrimaryOrientation.offsetChildren(-i);
        mLastLayoutFromEnd = mShouldReverseLayout;
        return i;
    }

    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        return scrollBy(i, recycler, state);
    }

    public void scrollToPosition(int i)
    {
        if (mPendingSavedState != null && mPendingSavedState.mAnchorPosition != i)
        {
            mPendingSavedState.invalidateAnchorPositionInfo();
        }
        mPendingScrollPosition = i;
        mPendingScrollPositionOffset = 0x80000000;
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int j)
    {
        if (mPendingSavedState != null)
        {
            mPendingSavedState.invalidateAnchorPositionInfo();
        }
        mPendingScrollPosition = i;
        mPendingScrollPositionOffset = j;
        requestLayout();
    }

    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state)
    {
        return scrollBy(i, recycler, state);
    }

    public void setGapStrategy(int i)
    {
        assertNotInLayoutOrScroll(null);
        if (i == mGapStrategy)
        {
            return;
        }
        if (i != 0 && i != 2)
        {
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        } else
        {
            mGapStrategy = i;
            requestLayout();
            return;
        }
    }

    public void setOrientation(int i)
    {
        if (i != 0 && i != 1)
        {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i == mOrientation)
        {
            return;
        }
        mOrientation = i;
        if (mPrimaryOrientation != null && mSecondaryOrientation != null)
        {
            OrientationHelper orientationhelper = mPrimaryOrientation;
            mPrimaryOrientation = mSecondaryOrientation;
            mSecondaryOrientation = orientationhelper;
        }
        requestLayout();
    }

    public void setReverseLayout(boolean flag)
    {
        assertNotInLayoutOrScroll(null);
        if (mPendingSavedState != null && mPendingSavedState.mReverseLayout != flag)
        {
            mPendingSavedState.mReverseLayout = flag;
        }
        mReverseLayout = flag;
        requestLayout();
    }

    public void setSpanCount(int i)
    {
        assertNotInLayoutOrScroll(null);
        if (i != mSpanCount)
        {
            invalidateSpanAssignments();
            mSpanCount = i;
            mRemainingSpans = new BitSet(mSpanCount);
            mSpans = new Span[mSpanCount];
            for (i = 0; i < mSpanCount; i++)
            {
                mSpans[i] = new Span(i);
            }

            requestLayout();
        }
    }

    public void smoothScrollToPosition(RecyclerView recyclerview, RecyclerView.State state, int i)
    {
        recyclerview = new LinearSmoothScroller(recyclerview.getContext()) {

            final StaggeredGridLayoutManager this$0;

            public PointF computeScrollVectorForPosition(int j)
            {
                j = calculateScrollDirectionForPosition(j);
                if (j == 0)
                {
                    return null;
                }
                if (mOrientation == 0)
                {
                    return new PointF(j, 0.0F);
                } else
                {
                    return new PointF(0.0F, j);
                }
            }

            
            {
                this$0 = StaggeredGridLayoutManager.this;
                super(context);
            }
        };
        recyclerview.setTargetPosition(i);
        startSmoothScroll(recyclerview);
    }

    public boolean supportsPredictiveItemAnimations()
    {
        return mPendingSavedState == null;
    }

    boolean updateAnchorFromPendingData(RecyclerView.State state, AnchorInfo anchorinfo)
    {
        boolean flag = false;
        if (state.isPreLayout() || mPendingScrollPosition == -1)
        {
            return false;
        }
        if (mPendingScrollPosition < 0 || mPendingScrollPosition >= state.getItemCount())
        {
            mPendingScrollPosition = -1;
            mPendingScrollPositionOffset = 0x80000000;
            return false;
        }
        if (mPendingSavedState == null || mPendingSavedState.mAnchorPosition == -1 || mPendingSavedState.mSpanOffsetsSize < 1)
        {
            state = findViewByPosition(mPendingScrollPosition);
            if (state != null)
            {
                int i;
                if (mShouldReverseLayout)
                {
                    i = getLastChildPosition();
                } else
                {
                    i = getFirstChildPosition();
                }
                anchorinfo.mPosition = i;
                if (mPendingScrollPositionOffset != 0x80000000)
                {
                    if (anchorinfo.mLayoutFromEnd)
                    {
                        anchorinfo.mOffset = mPrimaryOrientation.getEndAfterPadding() - mPendingScrollPositionOffset - mPrimaryOrientation.getDecoratedEnd(state);
                        return true;
                    } else
                    {
                        anchorinfo.mOffset = (mPrimaryOrientation.getStartAfterPadding() + mPendingScrollPositionOffset) - mPrimaryOrientation.getDecoratedStart(state);
                        return true;
                    }
                }
                if (mPrimaryOrientation.getDecoratedMeasurement(state) > mPrimaryOrientation.getTotalSpace())
                {
                    if (anchorinfo.mLayoutFromEnd)
                    {
                        i = mPrimaryOrientation.getEndAfterPadding();
                    } else
                    {
                        i = mPrimaryOrientation.getStartAfterPadding();
                    }
                    anchorinfo.mOffset = i;
                    return true;
                }
                i = mPrimaryOrientation.getDecoratedStart(state) - mPrimaryOrientation.getStartAfterPadding();
                if (i < 0)
                {
                    anchorinfo.mOffset = -i;
                    return true;
                }
                i = mPrimaryOrientation.getEndAfterPadding() - mPrimaryOrientation.getDecoratedEnd(state);
                if (i < 0)
                {
                    anchorinfo.mOffset = i;
                    return true;
                } else
                {
                    anchorinfo.mOffset = 0x80000000;
                    return true;
                }
            }
            anchorinfo.mPosition = mPendingScrollPosition;
            if (mPendingScrollPositionOffset == 0x80000000)
            {
                if (calculateScrollDirectionForPosition(anchorinfo.mPosition) == 1)
                {
                    flag = true;
                }
                anchorinfo.mLayoutFromEnd = flag;
                anchorinfo.assignCoordinateFromPadding();
            } else
            {
                anchorinfo.assignCoordinateFromPadding(mPendingScrollPositionOffset);
            }
            anchorinfo.mInvalidateOffsets = true;
            return true;
        } else
        {
            anchorinfo.mOffset = 0x80000000;
            anchorinfo.mPosition = mPendingScrollPosition;
            return true;
        }
    }

    void updateAnchorInfoForLayout(RecyclerView.State state, AnchorInfo anchorinfo)
    {
        while (updateAnchorFromPendingData(state, anchorinfo) || updateAnchorFromChildren(state, anchorinfo)) 
        {
            return;
        }
        anchorinfo.assignCoordinateFromPadding();
        anchorinfo.mPosition = 0;
    }

    void updateMeasureSpecs()
    {
        mSizePerSpan = mSecondaryOrientation.getTotalSpace() / mSpanCount;
        mFullSizeSpec = android.view.View.MeasureSpec.makeMeasureSpec(mSecondaryOrientation.getTotalSpace(), 0x40000000);
        if (mOrientation == 1)
        {
            mWidthSpec = android.view.View.MeasureSpec.makeMeasureSpec(mSizePerSpan, 0x40000000);
            mHeightSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            return;
        } else
        {
            mHeightSpec = android.view.View.MeasureSpec.makeMeasureSpec(mSizePerSpan, 0x40000000);
            mWidthSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            return;
        }
    }




}
