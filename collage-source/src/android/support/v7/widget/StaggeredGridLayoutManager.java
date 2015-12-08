// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            OrientationHelper, LayoutState, ScrollbarHelper, RecyclerView, 
//            LinearSmoothScroller

public class StaggeredGridLayoutManager extends RecyclerView.LayoutManager
{
    private class AnchorInfo
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

        public FullSpanItem getFirstFullSpanItemInRange(int i, int j, int k, boolean flag)
        {
            if (mFullSpanItems != null) goto _L2; else goto _L1
_L1:
            FullSpanItem fullspanitem = null;
_L6:
            return fullspanitem;
_L2:
            int l;
            int i1;
            i1 = mFullSpanItems.size();
            l = 0;
_L9:
            if (l >= i1) goto _L4; else goto _L3
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
            if (!flag)
            {
                continue; /* Loop/switch isn't completed */
            }
            fullspanitem = fullspanitem1;
            if (fullspanitem1.mHasUnwantedGapAfter) goto _L6; else goto _L8
_L8:
            l++;
              goto _L9
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
        boolean mHasUnwantedGapAfter;
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
            return (new StringBuilder()).append("FullSpanItem{mPosition=").append(mPosition).append(", mGapDir=").append(mGapDir).append(", mHasUnwantedGapAfter=").append(mHasUnwantedGapAfter).append(", mGapPerSpan=").append(Arrays.toString(mGapPerSpan)).append('}').toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeInt(mPosition);
            parcel.writeInt(mGapDir);
            if (mHasUnwantedGapAfter)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeInt(i);
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
            boolean flag = true;
            super();
            mPosition = parcel.readInt();
            mGapDir = parcel.readInt();
            int i;
            if (parcel.readInt() != 1)
            {
                flag = false;
            }
            mHasUnwantedGapAfter = flag;
            i = parcel.readInt();
            if (i > 0)
            {
                mGapPerSpan = new int[i];
                parcel.readIntArray(mGapPerSpan);
            }
        }
    }

    public static class SavedState
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
                LazySpanLookup.FullSpanItem fullspanitem = mLazySpanLookup.getFullSpanItem(layoutparams.getViewLayoutPosition());
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
                LazySpanLookup.FullSpanItem fullspanitem = mLazySpanLookup.getFullSpanItem(layoutparams.getViewLayoutPosition());
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
    private final AnchorInfo mAnchorInfo;
    private final Runnable mCheckForGapsRunnable;
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
    private final Rect mTmpRect;
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
        mTmpRect = new Rect();
        mAnchorInfo = new AnchorInfo();
        mLaidOutInvalidFullSpan = false;
        mSmoothScrollbarEnabled = true;
        mCheckForGapsRunnable = new Runnable() {

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
        mOrientation = j;
        setSpanCount(i);
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeset, int i, int j)
    {
        mSpanCount = -1;
        mReverseLayout = false;
        mShouldReverseLayout = false;
        mPendingScrollPosition = -1;
        mPendingScrollPositionOffset = 0x80000000;
        mLazySpanLookup = new LazySpanLookup();
        mGapStrategy = 2;
        mTmpRect = new Rect();
        mAnchorInfo = new AnchorInfo();
        mLaidOutInvalidFullSpan = false;
        mSmoothScrollbarEnabled = true;
        mCheckForGapsRunnable = new _cls1();
        context = getProperties(context, attributeset, i, j);
        setOrientation(((RecyclerView.LayoutManager.Properties) (context)).orientation);
        setSpanCount(((RecyclerView.LayoutManager.Properties) (context)).spanCount);
        setReverseLayout(((RecyclerView.LayoutManager.Properties) (context)).reverseLayout);
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

    private boolean checkForGaps()
    {
        if (getChildCount() == 0 || mGapStrategy == 0 || !isAttachedToWindow())
        {
            return false;
        }
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
            return true;
        }
        if (!mLaidOutInvalidFullSpan)
        {
            return false;
        }
        LazySpanLookup.FullSpanItem fullspanitem;
        byte byte0;
        if (mShouldReverseLayout)
        {
            byte0 = -1;
        } else
        {
            byte0 = 1;
        }
        fullspanitem = mLazySpanLookup.getFirstFullSpanItemInRange(j, i + 1, byte0, true);
        if (fullspanitem == null)
        {
            mLaidOutInvalidFullSpan = false;
            mLazySpanLookup.forceInvalidateAfter(i + 1);
            return false;
        }
        LazySpanLookup.FullSpanItem fullspanitem1 = mLazySpanLookup.getFirstFullSpanItemInRange(j, fullspanitem.mPosition, byte0 * -1, true);
        if (fullspanitem1 == null)
        {
            mLazySpanLookup.forceInvalidateAfter(fullspanitem.mPosition);
        } else
        {
            mLazySpanLookup.forceInvalidateAfter(fullspanitem1.mPosition + 1);
        }
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
    }

    private boolean checkSpanForGap(Span span)
    {
        return mShouldReverseLayout ? span.getEndLine() < mPrimaryOrientation.getEndAfterPadding() : span.getStartLine() > mPrimaryOrientation.getStartAfterPadding();
    }

    private int computeScrollExtent(RecyclerView.State state)
    {
        boolean flag1 = false;
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
        view = findFirstVisibleItemClosestToStart(flag, true);
        flag = flag1;
        if (!mSmoothScrollbarEnabled)
        {
            flag = true;
        }
        return ScrollbarHelper.computeScrollExtent(state, orientationhelper, view, findFirstVisibleItemClosestToEnd(flag, true), this, mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.State state)
    {
        boolean flag1 = false;
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
        view = findFirstVisibleItemClosestToStart(flag, true);
        flag = flag1;
        if (!mSmoothScrollbarEnabled)
        {
            flag = true;
        }
        return ScrollbarHelper.computeScrollOffset(state, orientationhelper, view, findFirstVisibleItemClosestToEnd(flag, true), this, mSmoothScrollbarEnabled, mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.State state)
    {
        boolean flag1 = false;
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
        view = findFirstVisibleItemClosestToStart(flag, true);
        flag = flag1;
        if (!mSmoothScrollbarEnabled)
        {
            flag = true;
        }
        return ScrollbarHelper.computeScrollRange(state, orientationhelper, view, findFirstVisibleItemClosestToEnd(flag, true), this, mSmoothScrollbarEnabled);
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
        int i;
        int k;
        int l;
        if (layoutstate.mLayoutDirection == 1)
        {
            k = layoutstate.mEndLine + layoutstate.mAvailable;
        } else
        {
            k = layoutstate.mStartLine - layoutstate.mAvailable;
        }
        updateAllRemainingSpans(layoutstate.mLayoutDirection, k);
        if (mShouldReverseLayout)
        {
            l = mPrimaryOrientation.getEndAfterPadding();
        } else
        {
            l = mPrimaryOrientation.getStartAfterPadding();
        }
        i = 0;
        do
        {
            if (layoutstate.hasMore(state) && !mRemainingSpans.isEmpty())
            {
                View view = layoutstate.next(recycler);
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                int k1 = layoutparams.getViewLayoutPosition();
                i = mLazySpanLookup.getSpan(k1);
                Span span;
                int i1;
                if (i == -1)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (i1 != 0)
                {
                    LazySpanLookup.FullSpanItem fullspanitem;
                    if (layoutparams.mFullSpan)
                    {
                        span = mSpans[0];
                    } else
                    {
                        span = getNextSpan(layoutstate);
                    }
                    mLazySpanLookup.setSpan(k1, span);
                } else
                {
                    span = mSpans[i];
                }
                layoutparams.mSpan = span;
                if (layoutstate.mLayoutDirection == 1)
                {
                    addView(view);
                } else
                {
                    addView(view, 0);
                }
                measureChildWithDecorationsAndMargin(view, layoutparams);
                if (layoutstate.mLayoutDirection == 1)
                {
                    int j;
                    int j1;
                    if (layoutparams.mFullSpan)
                    {
                        i = getMaxEnd(l);
                    } else
                    {
                        i = span.getEndLine(l);
                    }
                    j1 = i + mPrimaryOrientation.getDecoratedMeasurement(view);
                    LazySpanLookup.FullSpanItem fullspanitem1;
                    if (i1 != 0 && layoutparams.mFullSpan)
                    {
                        fullspanitem = createFullSpanItemFromEnd(i);
                        fullspanitem.mGapDir = -1;
                        fullspanitem.mPosition = k1;
                        mLazySpanLookup.addFullSpanItem(fullspanitem);
                        j = i;
                    } else
                    {
                        j = i;
                    }
                } else
                {
                    if (layoutparams.mFullSpan)
                    {
                        i = getMinStart(l);
                    } else
                    {
                        i = span.getStartLine(l);
                    }
                    j = i - mPrimaryOrientation.getDecoratedMeasurement(view);
                    if (i1 != 0 && layoutparams.mFullSpan)
                    {
                        fullspanitem1 = createFullSpanItemFromStart(i);
                        fullspanitem1.mGapDir = 1;
                        fullspanitem1.mPosition = k1;
                        mLazySpanLookup.addFullSpanItem(fullspanitem1);
                    }
                    j1 = i;
                }
                if (layoutparams.mFullSpan && layoutstate.mItemDirection == -1)
                {
                    if (i1 != 0)
                    {
                        mLaidOutInvalidFullSpan = true;
                    } else
                    {
                        if (layoutstate.mLayoutDirection == 1)
                        {
                            if (!areAllEndsEqual())
                            {
                                i = 1;
                            } else
                            {
                                i = 0;
                            }
                        } else
                        if (!areAllStartsEqual())
                        {
                            i = 1;
                        } else
                        {
                            i = 0;
                        }
                        if (i != 0)
                        {
                            fullspanitem1 = mLazySpanLookup.getFullSpanItem(k1);
                            if (fullspanitem1 != null)
                            {
                                fullspanitem1.mHasUnwantedGapAfter = true;
                            }
                            mLaidOutInvalidFullSpan = true;
                        }
                    }
                }
                attachViewToSpans(view, layoutparams, layoutstate);
                if (layoutparams.mFullSpan)
                {
                    i = mSecondaryOrientation.getStartAfterPadding();
                } else
                {
                    i = span.mIndex;
                    i1 = mSizePerSpan;
                    i = mSecondaryOrientation.getStartAfterPadding() + i * i1;
                }
                i1 = i + mSecondaryOrientation.getDecoratedMeasurement(view);
                if (mOrientation == 1)
                {
                    layoutDecoratedWithMargins(view, i, j, i1, j1);
                } else
                {
                    layoutDecoratedWithMargins(view, j, i, j1, i1);
                }
                if (layoutparams.mFullSpan)
                {
                    updateAllRemainingSpans(mLayoutState.mLayoutDirection, k);
                } else
                {
                    updateRemainingSpans(span, mLayoutState.mLayoutDirection, k);
                }
                recycle(recycler, mLayoutState);
                i = 1;
                continue;
            }
            if (i == 0)
            {
                recycle(recycler, mLayoutState);
            }
            if (mLayoutState.mLayoutDirection == -1)
            {
                i = getMinStart(mPrimaryOrientation.getStartAfterPadding());
                i = mPrimaryOrientation.getStartAfterPadding() - i;
            } else
            {
                i = getMaxEnd(mPrimaryOrientation.getEndAfterPadding()) - mPrimaryOrientation.getEndAfterPadding();
            }
            if (i > 0)
            {
                return Math.min(layoutstate.mAvailable, i);
            }
            return 0;
        } while (true);
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

    private int getSpecForDimension(int i, int j)
    {
        if (i < 0)
        {
            return j;
        } else
        {
            return android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
        }
    }

    private void handleUpdate(int i, int j, int k)
    {
        int l;
        int i1;
        int j1;
        if (mShouldReverseLayout)
        {
            j1 = getLastChildPosition();
        } else
        {
            j1 = getFirstChildPosition();
        }
        if (k == 8)
        {
            if (i < j)
            {
                i1 = j + 1;
                l = i;
            } else
            {
                i1 = i + 1;
                l = j;
            }
        } else
        {
            i1 = i + j;
            l = i;
        }
        mLazySpanLookup.invalidateAfter(l);
        k;
        JVM INSTR lookupswitch 3: default 76
    //                   1: 115
    //                   2: 127
    //                   8: 139;
           goto _L1 _L2 _L3 _L4
_L1:
        if (i1 > j1) goto _L6; else goto _L5
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
            i = getFirstChildPosition();
        } else
        {
            i = getLastChildPosition();
        }
        if (l > i) goto _L5; else goto _L7
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
        calculateItemDecorationsForChild(view, mTmpRect);
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        view.measure(updateSpecWithExtra(i, layoutparams.leftMargin + mTmpRect.left, layoutparams.rightMargin + mTmpRect.right), updateSpecWithExtra(j, layoutparams.topMargin + mTmpRect.top, layoutparams.bottomMargin + mTmpRect.bottom));
    }

    private void measureChildWithDecorationsAndMargin(View view, LayoutParams layoutparams)
    {
        if (layoutparams.mFullSpan)
        {
            if (mOrientation == 1)
            {
                measureChildWithDecorationsAndMargin(view, mFullSizeSpec, getSpecForDimension(layoutparams.height, mHeightSpec));
                return;
            } else
            {
                measureChildWithDecorationsAndMargin(view, getSpecForDimension(layoutparams.width, mWidthSpec), mFullSizeSpec);
                return;
            }
        }
        if (mOrientation == 1)
        {
            measureChildWithDecorationsAndMargin(view, mWidthSpec, getSpecForDimension(layoutparams.height, mHeightSpec));
            return;
        } else
        {
            measureChildWithDecorationsAndMargin(view, getSpecForDimension(layoutparams.width, mWidthSpec), mHeightSpec);
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

    private void recycle(RecyclerView.Recycler recycler, LayoutState layoutstate)
    {
        if (layoutstate.mAvailable == 0)
        {
            if (layoutstate.mLayoutDirection == -1)
            {
                recycleFromEnd(recycler, layoutstate.mEndLine);
                return;
            } else
            {
                recycleFromStart(recycler, layoutstate.mStartLine);
                return;
            }
        }
        if (layoutstate.mLayoutDirection == -1)
        {
            int i = layoutstate.mStartLine - getMaxStart(layoutstate.mStartLine);
            if (i < 0)
            {
                i = layoutstate.mEndLine;
            } else
            {
                i = layoutstate.mEndLine - Math.min(i, layoutstate.mAvailable);
            }
            recycleFromEnd(recycler, i);
            return;
        }
        int j = getMinEnd(layoutstate.mEndLine) - layoutstate.mEndLine;
        if (j < 0)
        {
            j = layoutstate.mStartLine;
        } else
        {
            int k = layoutstate.mStartLine;
            j = Math.min(j, layoutstate.mAvailable) + k;
        }
        recycleFromStart(recycler, j);
    }

    private void recycleFromEnd(RecyclerView.Recycler recycler, int i)
    {
        int j = getChildCount() - 1;
_L12:
        if (j < 0) goto _L2; else goto _L1
_L1:
        View view = getChildAt(j);
        if (mPrimaryOrientation.getDecoratedStart(view) < i) goto _L2; else goto _L3
_L3:
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.mFullSpan) goto _L5; else goto _L4
_L4:
        int k = 0;
_L9:
        if (k >= mSpanCount) goto _L7; else goto _L6
_L6:
        if (mSpans[k].mViews.size() != 1) goto _L8; else goto _L2
_L2:
        return;
_L8:
        k++;
          goto _L9
_L7:
        for (int l = 0; l < mSpanCount; l++)
        {
            mSpans[l].popEnd();
        }

        break; /* Loop/switch isn't completed */
_L5:
        if (layoutparams.mSpan.mViews.size() == 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        layoutparams.mSpan.popEnd();
        break; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L10
_L10:
        removeAndRecycleView(view, recycler);
        j--;
        if (true) goto _L12; else goto _L11
_L11:
    }

    private void recycleFromStart(RecyclerView.Recycler recycler, int i)
    {
_L12:
        if (getChildCount() <= 0) goto _L2; else goto _L1
_L1:
        View view = getChildAt(0);
        if (mPrimaryOrientation.getDecoratedEnd(view) > i) goto _L2; else goto _L3
_L3:
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.mFullSpan) goto _L5; else goto _L4
_L4:
        int j = 0;
_L9:
        if (j >= mSpanCount) goto _L7; else goto _L6
_L6:
        if (mSpans[j].mViews.size() != 1) goto _L8; else goto _L2
_L2:
        return;
_L8:
        j++;
          goto _L9
_L7:
        for (int k = 0; k < mSpanCount; k++)
        {
            mSpans[k].popStart();
        }

        break; /* Loop/switch isn't completed */
_L5:
        if (layoutparams.mSpan.mViews.size() == 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        layoutparams.mSpan.popStart();
        break; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L10
_L10:
        removeAndRecycleView(view, recycler);
        if (true) goto _L12; else goto _L11
_L11:
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

    private void setLayoutStateDirection(int i)
    {
        boolean flag = true;
        mLayoutState.mLayoutDirection = i;
        LayoutState layoutstate = mLayoutState;
        boolean flag2 = mShouldReverseLayout;
        boolean flag1;
        if (i == -1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag2 == flag1)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = -1;
        }
        layoutstate.mItemDirection = i;
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

    private void updateLayoutState(int i, RecyclerView.State state)
    {
        int j;
        j = 0;
        mLayoutState.mAvailable = 0;
        mLayoutState.mCurrentPosition = i;
        if (!isSmoothScrolling()) goto _L2; else goto _L1
_L1:
        int k = state.getTargetScrollPosition();
        if (k == -1) goto _L2; else goto _L3
_L3:
        boolean flag1 = mShouldReverseLayout;
        boolean flag;
        if (k < i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag1 == flag)
        {
            i = mPrimaryOrientation.getTotalSpace();
        } else
        {
            j = mPrimaryOrientation.getTotalSpace();
            i = 0;
        }
_L5:
        if (getClipToPadding())
        {
            mLayoutState.mStartLine = mPrimaryOrientation.getStartAfterPadding() - j;
            mLayoutState.mEndLine = i + mPrimaryOrientation.getEndAfterPadding();
            return;
        } else
        {
            mLayoutState.mEndLine = i + mPrimaryOrientation.getEnd();
            mLayoutState.mStartLine = -j;
            return;
        }
_L2:
        i = 0;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void updateRemainingSpans(Span span, int i, int j)
    {
        int k = span.getDeletedSize();
        if (i == -1)
        {
            if (k + span.getStartLine() <= j)
            {
                mRemainingSpans.set(span.mIndex, false);
            }
        } else
        if (span.getEndLine() - k >= j)
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
                return android.view.View.MeasureSpec.makeMeasureSpec(Math.max(0, android.view.View.MeasureSpec.getSize(i) - j - k), l);
            }
        }
        return i;
    }

    boolean areAllEndsEqual()
    {
        boolean flag1 = true;
        int j = mSpans[0].getEndLine(0x80000000);
        int i = 1;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < mSpanCount)
                {
                    if (mSpans[i].getEndLine(0x80000000) == j)
                    {
                        break label0;
                    }
                    flag = false;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    boolean areAllStartsEqual()
    {
        boolean flag1 = true;
        int j = mSpans[0].getStartLine(0x80000000);
        int i = 1;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < mSpanCount)
                {
                    if (mSpans[i].getStartLine(0x80000000) == j)
                    {
                        break label0;
                    }
                    flag = false;
                }
                return flag;
            }
            i++;
        } while (true);
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

    View findFirstVisibleItemClosestToEnd(boolean flag, boolean flag1)
    {
        ensureOrientationHelper();
        int j = mPrimaryOrientation.getStartAfterPadding();
        int k = mPrimaryOrientation.getEndAfterPadding();
        int i = getChildCount() - 1;
        View view = null;
        while (i >= 0) 
        {
            View view2 = getChildAt(i);
            int l = mPrimaryOrientation.getDecoratedStart(view2);
            int i1 = mPrimaryOrientation.getDecoratedEnd(view2);
            View view1 = view;
            if (i1 > j)
            {
                if (l >= k)
                {
                    view1 = view;
                } else
                {
                    if (i1 <= k || !flag)
                    {
                        return view2;
                    }
                    view1 = view;
                    if (flag1)
                    {
                        view1 = view;
                        if (view == null)
                        {
                            view1 = view2;
                        }
                    }
                }
            }
            i--;
            view = view1;
        }
        return view;
    }

    View findFirstVisibleItemClosestToStart(boolean flag, boolean flag1)
    {
        ensureOrientationHelper();
        int j = mPrimaryOrientation.getStartAfterPadding();
        int k = mPrimaryOrientation.getEndAfterPadding();
        int l = getChildCount();
        int i = 0;
        View view = null;
        while (i < l) 
        {
            View view2 = getChildAt(i);
            int i1 = mPrimaryOrientation.getDecoratedStart(view2);
            View view1 = view;
            if (mPrimaryOrientation.getDecoratedEnd(view2) > j)
            {
                if (i1 >= k)
                {
                    view1 = view;
                } else
                {
                    if (i1 >= j || !flag)
                    {
                        return view2;
                    }
                    view1 = view;
                    if (flag1)
                    {
                        view1 = view;
                        if (view == null)
                        {
                            view1 = view2;
                        }
                    }
                }
            }
            i++;
            view = view1;
        }
        return view;
    }

    int findFirstVisibleItemPositionInt()
    {
        View view;
        if (mShouldReverseLayout)
        {
            view = findFirstVisibleItemClosestToEnd(true, true);
        } else
        {
            view = findFirstVisibleItemClosestToStart(true, true);
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
        int i = getChildCount() - 1;
        bitset = new BitSet(mSpanCount);
        bitset.set(0, mSpanCount, true);
        if (mOrientation == 1 && isLayoutRTL())
        {
            byte0 = 1;
        } else
        {
            byte0 = -1;
        }
        if (mShouldReverseLayout)
        {
            k = -1;
        } else
        {
            k = i + 1;
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
        removeCallbacks(mCheckForGapsRunnable);
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
                accessibilityevent = AccessibilityEventCompat.asRecord(accessibilityevent);
                view = findFirstVisibleItemClosestToStart(false, true);
                view1 = findFirstVisibleItemClosestToEnd(false, true);
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
            accessibilityevent.setFromIndex(i);
            accessibilityevent.setToIndex(j);
            return;
        } else
        {
            accessibilityevent.setFromIndex(j);
            accessibilityevent.setToIndex(i);
            return;
        }
    }

    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        recycler = view.getLayoutParams();
        if (!(recycler instanceof LayoutParams))
        {
            super.onInitializeAccessibilityNodeInfoForItem(view, accessibilitynodeinfocompat);
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
            accessibilitynodeinfocompat.setCollectionItemInfo(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(k, i, -1, -1, ((LayoutParams) (recycler)).mFullSpan, false));
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
        accessibilitynodeinfocompat.setCollectionItemInfo(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(-1, -1, l, j, ((LayoutParams) (recycler)).mFullSpan, false));
    }

    public void onItemsAdded(RecyclerView recyclerview, int i, int j)
    {
        handleUpdate(i, j, 1);
    }

    public void onItemsChanged(RecyclerView recyclerview)
    {
        mLazySpanLookup.clear();
        requestLayout();
    }

    public void onItemsMoved(RecyclerView recyclerview, int i, int j, int k)
    {
        handleUpdate(i, j, 8);
    }

    public void onItemsRemoved(RecyclerView recyclerview, int i, int j)
    {
        handleUpdate(i, j, 2);
    }

    public void onItemsUpdated(RecyclerView recyclerview, int i, int j, Object obj)
    {
        handleUpdate(i, j, 4);
    }

    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state)
    {
label0:
        {
label1:
            {
                boolean flag1 = false;
                ensureOrientationHelper();
                AnchorInfo anchorinfo = mAnchorInfo;
                anchorinfo.reset();
                if ((mPendingSavedState != null || mPendingScrollPosition != -1) && state.getItemCount() == 0)
                {
                    removeAndRecycleAllViews(recycler);
                    return;
                }
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
                updateLayoutState(anchorinfo.mPosition, state);
                boolean flag;
                if (anchorinfo.mLayoutFromEnd)
                {
                    setLayoutStateDirection(-1);
                    fill(recycler, mLayoutState, state);
                    setLayoutStateDirection(1);
                    mLayoutState.mCurrentPosition = anchorinfo.mPosition + mLayoutState.mItemDirection;
                    fill(recycler, mLayoutState, state);
                } else
                {
                    setLayoutStateDirection(1);
                    fill(recycler, mLayoutState, state);
                    setLayoutStateDirection(-1);
                    mLayoutState.mCurrentPosition = anchorinfo.mPosition + mLayoutState.mItemDirection;
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
                if (state.isPreLayout())
                {
                    break label0;
                }
                flag = flag1;
                if (mGapStrategy == 0)
                {
                    break label1;
                }
                flag = flag1;
                if (getChildCount() <= 0)
                {
                    break label1;
                }
                if (!mLaidOutInvalidFullSpan)
                {
                    flag = flag1;
                    if (hasGapsToFix() == null)
                    {
                        break label1;
                    }
                }
                flag = true;
            }
            if (flag)
            {
                removeCallbacks(mCheckForGapsRunnable);
                postOnAnimation(mCheckForGapsRunnable);
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
        ensureOrientationHelper();
        int j;
        int k;
        if (i > 0)
        {
            j = 1;
            k = getLastChildPosition();
        } else
        {
            j = -1;
            k = getFirstChildPosition();
        }
        updateLayoutState(k, state);
        setLayoutStateDirection(j);
        mLayoutState.mCurrentPosition = k + mLayoutState.mItemDirection;
        k = Math.abs(i);
        mLayoutState.mAvailable = k;
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
