// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.MarginLayoutParamsCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.support.v7.widget.ChildHelper;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.play.utils.Compound;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public final class FlowLayoutManager extends android.support.v7.widget.RecyclerView.LayoutManager
{
    public static interface AutoRegisteredOnViewRenderedListener
        extends OnViewRenderedListener
    {
    }

    private static final class FillState
    {

        int mHeightFilled;
        int mNextAnchorPosition;
        ItemInfo mNextItem;
        int mNextItemChildIndex;
        LayoutParams mNextItemLayoutParams;
        int mNextItemPosition;

        public final ItemInfo takeNextItem()
        {
            ItemInfo iteminfo = mNextItem;
            mNextItem = null;
            return iteminfo;
        }

        public final String toString()
        {
            StringBuilder stringbuilder = (new StringBuilder("FillState{mHeightFilled=")).append(mHeightFilled).append(",mNextAnchorPosition=").append(mNextAnchorPosition).append(",mNextItem=");
            String s;
            if (mNextItem == null)
            {
                s = "null";
            } else
            {
                s = "notnull";
            }
            return stringbuilder.append(s).append(",mNextItemPosition=").append(mNextItemPosition).append(",mNextItemChildIndex=").append(mNextItemChildIndex).toString();
        }

        private FillState()
        {
        }

        FillState(byte byte0)
        {
            this();
        }
    }

    private static final class InlineFlowLineInfo extends LineInfo
    {

        private static final android.support.v4.util.Pools.Pool sPool = new android.support.v4.util.Pools.SimplePool(10);
        public final List mItems = new ArrayList();
        public int mLineWidth;
        public int mUsedWidth;

        public static InlineFlowLineInfo obtain(int i, int j, int k, ItemInfo iteminfo)
        {
            InlineFlowLineInfo inlineflowlineinfo1 = (InlineFlowLineInfo)sPool.acquire();
            InlineFlowLineInfo inlineflowlineinfo = inlineflowlineinfo1;
            if (inlineflowlineinfo1 == null)
            {
                inlineflowlineinfo = new InlineFlowLineInfo();
            }
            inlineflowlineinfo.mPositionStart = i;
            inlineflowlineinfo.mOffsetStart = k;
            inlineflowlineinfo.mLineWidth = j;
            inlineflowlineinfo.addMeasuredItem(iteminfo);
            return inlineflowlineinfo;
        }

        public final void addMeasuredItem(ItemInfo iteminfo)
        {
            if (!iteminfo.mMeasuredInCurrentPass)
            {
                throw new IllegalArgumentException("Item not measured");
            } else
            {
                mUsedWidth = mUsedWidth + (iteminfo.mDecoratedWidth + iteminfo.mMarginStart + iteminfo.mMarginEnd);
                mItems.add(iteminfo);
                super.mTotalHeight = -1;
                return;
            }
        }

        public final void clearMeasuredInCurrentPass()
        {
            for (int i = mItems.size() - 1; i >= 0; i--)
            {
                ((ItemInfo)mItems.get(i)).mMeasuredInCurrentPass = false;
            }

        }

        final void debugPrint$241f81bd(StringBuilder stringbuilder)
        {
            stringbuilder.append('@').append(mPositionStart).append('-').append(validPositionEnd());
        }

        public final int getItemTopOffset(int i)
        {
            return ((ItemInfo)mItems.get(i - mPositionStart)).mTopOffset;
        }

        protected final boolean invalidateFromInternal(int i)
        {
            int j = mItems.size();
            if (mPositionStart + j <= i)
            {
                return false;
            }
            int k = mPositionStart;
            for (j--; j >= i - k; j--)
            {
                ItemInfo iteminfo = (ItemInfo)mItems.remove(j);
                mUsedWidth = mUsedWidth - (iteminfo.mDecoratedWidth + iteminfo.mMarginStart + iteminfo.mMarginEnd);
                iteminfo.recycle();
            }

            return true;
        }

        protected final int onArrange(boolean flag, int i)
        {
            ItemInfo iteminfo1;
            int l;
            int l1;
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_298;
            }
            int j3 = mItems.size();
            int j2 = 0;
            int j = 0x80000000;
            l = 0;
            int j1 = 0;
            while (j2 < j3) 
            {
                ItemInfo iteminfo = (ItemInfo)mItems.get(j2);
                if (iteminfo.mVAlign == 0)
                {
                    int l2 = -iteminfo.mBaseline;
                    iteminfo.mTopOffset = l2;
                    int k1 = j1;
                    if (l2 < j1)
                    {
                        k1 = l2;
                    }
                    j1 = iteminfo.mDecoratedHeight + l2;
                    if (j1 > l)
                    {
                        l = j1;
                    }
                    j1 = k1;
                } else
                if (iteminfo.mDecoratedHeight > j)
                {
                    j = iteminfo.mDecoratedHeight;
                }
                j2++;
            }
            if (j == 0x80000000)
            {
                break MISSING_BLOCK_LABEL_298;
            }
            j2 = l - j1;
            l1 = j1;
            if (j2 < j)
            {
                if (j2 == 0)
                {
                    l = 0;
                } else
                {
                    float f = j;
                    l = (int)(((float)j1 / (float)j2) * f);
                }
                j = l + j;
                l1 = l;
                l = j;
            }
            j = 0;
            if (j >= j3)
            {
                break MISSING_BLOCK_LABEL_298;
            }
            iteminfo1 = (ItemInfo)mItems.get(j);
            switch (iteminfo1.mVAlign)
            {
            default:
                break;

            case 2: // '\002'
                break; /* Loop/switch isn't completed */

            case 1: // '\001'
                break;
            }
            break MISSING_BLOCK_LABEL_282;
_L4:
            j++;
            if (true) goto _L2; else goto _L1
_L2:
            break MISSING_BLOCK_LABEL_194;
_L1:
            iteminfo1.mTopOffset = l1;
            continue; /* Loop/switch isn't completed */
            iteminfo1.mTopOffset = l - iteminfo1.mDecoratedHeight;
            if (true) goto _L4; else goto _L3
_L3:
            boolean flag1;
            boolean flag2;
            int i3;
            if (mPositionStart == 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (mPositionStart + mItems.size() == i)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            i3 = mItems.size();
            if (i3 == 0)
            {
                return 0;
            }
            int k = 0x7fffffff;
            int i2 = 0;
            i = 0x80000000;
            while (i2 < i3) 
            {
                ItemInfo iteminfo2 = (ItemInfo)mItems.get(i2);
                int k3 = iteminfo2.mTopOffset;
                int k2;
                int l3;
                if (flag1)
                {
                    k2 = iteminfo2.mMarginTopForFirstLine;
                } else
                {
                    k2 = iteminfo2.mMarginTop;
                }
                k2 = k3 - k2;
                if (k2 < k)
                {
                    k = k2;
                }
                k3 = iteminfo2.mTopOffset;
                l3 = iteminfo2.mDecoratedHeight;
                if (flag2)
                {
                    k2 = iteminfo2.mMarginBottomForLastLine;
                } else
                {
                    k2 = iteminfo2.mMarginBottom;
                }
                k2 += k3 + l3;
                if (k2 > i)
                {
                    i = k2;
                }
                i2++;
            }
            int i1 = i;
            if (k != 0)
            {
                for (i1 = 0; i1 < i3; i1++)
                {
                    ItemInfo iteminfo3 = (ItemInfo)mItems.get(i1);
                    iteminfo3.mTopOffset = iteminfo3.mTopOffset - k;
                }

                i1 = i - k;
            }
            return Math.max(0, i1);
        }

        public final void recycle()
        {
            reset();
            sPool.release(this);
        }

        protected final void reset()
        {
            super.reset();
            mLineWidth = 0;
            mUsedWidth = 0;
            for (int i = mItems.size() - 1; i >= 0; i--)
            {
                ((ItemInfo)mItems.get(i)).recycle();
            }

            mItems.clear();
        }

        public final int validPositionEnd()
        {
            return mPositionStart + mItems.size();
        }


        private InlineFlowLineInfo()
        {
            super((byte)0);
            reset();
        }
    }

    private static final class ItemInfo
    {

        private static final android.support.v4.util.Pools.Pool sPool = new android.support.v4.util.Pools.SimplePool(30);
        public int mBaseline;
        public int mDecoratedHeight;
        public int mDecoratedWidth;
        public float mGridCellSize;
        public int mGridInsetEnd;
        public int mGridInsetStart;
        public int mMarginBottom;
        public int mMarginBottomForLastLine;
        public int mMarginEnd;
        public int mMarginStart;
        public int mMarginTop;
        public int mMarginTopForFirstLine;
        public boolean mMeasuredInCurrentPass;
        public int mTopOffset;
        public int mVAlign;

        public static ItemInfo obtain()
        {
            ItemInfo iteminfo = (ItemInfo)sPool.acquire();
            if (iteminfo != null)
            {
                return iteminfo;
            } else
            {
                return new ItemInfo();
            }
        }

        private void reset()
        {
            mDecoratedWidth = -1;
            mDecoratedHeight = -1;
            mMarginTop = 0;
            mMarginTopForFirstLine = 0;
            mMarginStart = 0;
            mMarginEnd = 0;
            mMarginBottom = 0;
            mMarginBottomForLastLine = 0;
            mBaseline = 0;
            mVAlign = 0;
            mGridInsetStart = 0;
            mGridInsetEnd = 0;
            mGridCellSize = (0.0F / 0.0F);
            mTopOffset = 0;
            mMeasuredInCurrentPass = false;
        }

        public final void loadMeasurements$cae6a1d(View view, boolean flag)
        {
            int k = FlowLayoutManager.getDecoratedMeasuredWidth(view);
            int j = FlowLayoutManager.getDecoratedMeasuredHeight(view);
            int i = view.getBaseline();
            if (i < 0 || i > view.getMeasuredHeight())
            {
                i = j;
            } else
            {
                i += FlowLayoutManager.getTopDecorationHeight(view);
            }
            if (flag && (k != mDecoratedWidth || j != mDecoratedHeight || i != mBaseline))
            {
                Log.w("FlowLayoutManager", "Child measurement changed without notifying from the adapter! Some layout may be incorrect.");
            }
            mDecoratedWidth = k;
            mDecoratedHeight = j;
            mBaseline = i;
            mMeasuredInCurrentPass = true;
        }

        public final void recycle()
        {
            reset();
            sPool.release(this);
        }


        private ItemInfo()
        {
            reset();
        }
    }

    public static final class LayoutParams extends android.support.v7.widget.RecyclerView.LayoutParams
    {

        static Field sViewHolderField;
        public int bottomMarginCompound;
        public int endMarginCompound;
        public int firstLineTopMarginCompound;
        public int flow;
        public int flowHeightCompound;
        public int flowInsetBottomCompound;
        public int flowInsetEndCompound;
        public int flowInsetStartCompound;
        public int flowInsetTopCompound;
        public int flowWidthCompound;
        public float gridColumnCount;
        public int gridInsetEnd;
        public int gridInsetStart;
        public int gridMinCellSize;
        public int heightCompound;
        public int lastLineBottomMarginCompound;
        public int lineWrap;
        public int maxGridWidth;
        public int startMarginCompound;
        public int topMarginCompound;
        public int vAlign;
        public int widthCompound;

        private static int getCompoundLayoutDimension(TypedArray typedarray, String s, int i, int j)
        {
            if (!typedarray.hasValue(i) && j != 0x7fffffff) goto _L2; else goto _L1
_L1:
            i = Compound.getCompound(typedarray, s, i, true);
_L4:
            return i;
_L2:
            if (-2 > j)
            {
                break; /* Loop/switch isn't completed */
            }
            i = j;
            if (j <= 0xffffff) goto _L4; else goto _L3
_L3:
            throw new IllegalArgumentException((new StringBuilder()).append(typedarray.getPositionDescription()).append(": out-of-range dimension length for ").append(s).toString());
        }

        private static int getCompoundMargin(TypedArray typedarray, String s, int i, int j)
        {
            if (typedarray.hasValue(i))
            {
                j = Compound.getCompound(typedarray, s, i, false);
            }
            return j;
        }

        static int getPixelSize(String s, int i, float f, boolean flag)
        {
            while (!Compound.isCompoundFloat(i) || flag && i < 0) 
            {
                return i;
            }
            if (Float.isNaN(f))
            {
                throw new IllegalArgumentException((new StringBuilder()).append(s).append(" uses grid-based measurement, which is disabled").toString());
            } else
            {
                return (int)(Float.intBitsToFloat(i) * f);
            }
        }

        final String debugGetViewHolderDump()
        {
            String s;
            if (sViewHolderField == null)
            {
                try
                {
                    Field field = android/support/v7/widget/RecyclerView$LayoutParams.getDeclaredField("mViewHolder");
                    field.setAccessible(true);
                    sViewHolderField = field;
                }
                catch (Exception exception)
                {
                    return (new StringBuilder("failed: ")).append(exception.getMessage()).toString();
                }
            }
            try
            {
                s = String.valueOf(sViewHolderField.get(this));
            }
            catch (Exception exception1)
            {
                return (new StringBuilder("failed: ")).append(exception1.getMessage()).toString();
            }
            return s;
        }

        final int getBottomMargin(float f)
        {
            if (bottomMarginCompound == 0x7fffffff)
            {
                return bottomMargin;
            } else
            {
                return getPixelSize("layout_flmMarginBottom", bottomMarginCompound, f, false);
            }
        }

        final int getEffectiveLineWrapAction()
        {
            if (widthCompound == -1 || flow != 0)
            {
                return 2;
            } else
            {
                return lineWrap & 3;
            }
        }

        final int getFlowHeight(float f)
        {
            return getPixelSize("layout_flmFlowHeight", flowHeightCompound, f, true);
        }

        final int getFlowInsetBottom(float f)
        {
            return getPixelSize("layout_flmFlowInsetBottom", flowInsetBottomCompound, f, false);
        }

        final int getFlowInsetTop(float f)
        {
            return getPixelSize("layout_flmFlowInsetTop", flowInsetTopCompound, f, false);
        }

        final int getTopMargin(float f)
        {
            if (topMarginCompound == 0x7fffffff)
            {
                return topMargin;
            } else
            {
                return getPixelSize("layout_flmMarginTop", topMarginCompound, f, false);
            }
        }

        final boolean isAnchorCandidate()
        {
            return getEffectiveLineWrapAction() == 2 && (lineWrap & 0xc) == 8;
        }

        protected final void setBaseAttributes(TypedArray typedarray, int i, int j)
        {
            width = typedarray.getLayoutDimension(i, 0x7fffffff);
            height = typedarray.getLayoutDimension(j, 0x7fffffff);
        }

        public LayoutParams()
        {
            super(-2, -2);
            gridInsetStart = 0;
            gridInsetEnd = 0;
            maxGridWidth = 0;
            gridColumnCount = 0.0F;
            gridMinCellSize = 0;
            topMarginCompound = 0x7fffffff;
            startMarginCompound = 0x7fffffff;
            endMarginCompound = 0x7fffffff;
            bottomMarginCompound = 0x7fffffff;
            firstLineTopMarginCompound = 0x7fffffff;
            lastLineBottomMarginCompound = 0x7fffffff;
            vAlign = 0;
            flow = 0;
            flowInsetTopCompound = 0;
            flowInsetStartCompound = 0;
            flowInsetEndCompound = 0;
            flowInsetBottomCompound = 0;
            flowWidthCompound = -1;
            flowHeightCompound = -1;
            lineWrap = 0;
            widthCompound = -2;
            heightCompound = -2;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            gridInsetStart = 0;
            gridInsetEnd = 0;
            maxGridWidth = 0;
            gridColumnCount = 0.0F;
            gridMinCellSize = 0;
            topMarginCompound = 0x7fffffff;
            startMarginCompound = 0x7fffffff;
            endMarginCompound = 0x7fffffff;
            bottomMarginCompound = 0x7fffffff;
            firstLineTopMarginCompound = 0x7fffffff;
            lastLineBottomMarginCompound = 0x7fffffff;
            vAlign = 0;
            flow = 0;
            flowInsetTopCompound = 0;
            flowInsetStartCompound = 0;
            flowInsetEndCompound = 0;
            flowInsetBottomCompound = 0;
            flowWidthCompound = -1;
            flowHeightCompound = -1;
            lineWrap = 0;
            TypedArray typedarray = context.obtainStyledAttributes(attributeset, com.google.android.play.R.styleable.FlowLayoutManager_Layout_Style);
            int i = typedarray.getResourceId(0, 0x7f110093);
            typedarray.recycle();
            context = context.obtainStyledAttributes(attributeset, com.google.android.play.R.styleable.FlowLayoutManager_Layout, 0, i);
            widthCompound = getCompoundLayoutDimension(context, "layout_flmWidth", 0, width);
            heightCompound = getCompoundLayoutDimension(context, "layout_flmHeight", 1, height);
            gridInsetStart = context.getDimensionPixelOffset(2, 0);
            gridInsetEnd = context.getDimensionPixelOffset(3, 0);
            maxGridWidth = context.getDimensionPixelSize(4, 0);
            gridColumnCount = context.getFloat(5, 0.0F);
            gridMinCellSize = context.getDimensionPixelSize(6, 0);
            i = Compound.getCompound(context, "layout_flmMargin", 7, false);
            topMarginCompound = getCompoundMargin(context, "layout_flmMarginTop", 8, i);
            startMarginCompound = getCompoundMargin(context, "layout_flmMarginStart", 9, i);
            endMarginCompound = getCompoundMargin(context, "layout_flmMarginEnd", 10, i);
            bottomMarginCompound = getCompoundMargin(context, "layout_flmMarginBottom", 11, i);
            firstLineTopMarginCompound = Compound.getCompound(context, "layout_flmMarginTopForFirstLine", 12, false);
            lastLineBottomMarginCompound = Compound.getCompound(context, "layout_flmMarginBottomForLastLine", 13, false);
            vAlign = context.getInteger(14, 0);
            flow = context.getInteger(15, 0);
            flowInsetTopCompound = Compound.getCompound(context, "layout_flmFlowInsetTop", 16, false);
            flowInsetStartCompound = Compound.getCompound(context, "layout_flmFlowInsetStart", 17, false);
            flowInsetEndCompound = Compound.getCompound(context, "layout_flmFlowInsetEnd", 18, false);
            flowInsetBottomCompound = Compound.getCompound(context, "layout_flmFlowInsetBottom", 19, false);
            flowWidthCompound = Compound.getCompound(context, "layout_flmFlowWidth", 20, true);
            flowHeightCompound = Compound.getCompound(context, "layout_flmFlowHeight", 21, true);
            lineWrap = context.getInteger(22, 0);
            context.recycle();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            gridInsetStart = 0;
            gridInsetEnd = 0;
            maxGridWidth = 0;
            gridColumnCount = 0.0F;
            gridMinCellSize = 0;
            topMarginCompound = 0x7fffffff;
            startMarginCompound = 0x7fffffff;
            endMarginCompound = 0x7fffffff;
            bottomMarginCompound = 0x7fffffff;
            firstLineTopMarginCompound = 0x7fffffff;
            lastLineBottomMarginCompound = 0x7fffffff;
            vAlign = 0;
            flow = 0;
            flowInsetTopCompound = 0;
            flowInsetStartCompound = 0;
            flowInsetEndCompound = 0;
            flowInsetBottomCompound = 0;
            flowWidthCompound = -1;
            flowHeightCompound = -1;
            lineWrap = 0;
            widthCompound = width;
            heightCompound = height;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            gridInsetStart = 0;
            gridInsetEnd = 0;
            maxGridWidth = 0;
            gridColumnCount = 0.0F;
            gridMinCellSize = 0;
            topMarginCompound = 0x7fffffff;
            startMarginCompound = 0x7fffffff;
            endMarginCompound = 0x7fffffff;
            bottomMarginCompound = 0x7fffffff;
            firstLineTopMarginCompound = 0x7fffffff;
            lastLineBottomMarginCompound = 0x7fffffff;
            vAlign = 0;
            flow = 0;
            flowInsetTopCompound = 0;
            flowInsetStartCompound = 0;
            flowInsetEndCompound = 0;
            flowInsetBottomCompound = 0;
            flowWidthCompound = -1;
            flowHeightCompound = -1;
            lineWrap = 0;
            widthCompound = width;
            heightCompound = height;
        }

        public LayoutParams(LayoutParams layoutparams)
        {
            super(layoutparams);
            gridInsetStart = 0;
            gridInsetEnd = 0;
            maxGridWidth = 0;
            gridColumnCount = 0.0F;
            gridMinCellSize = 0;
            topMarginCompound = 0x7fffffff;
            startMarginCompound = 0x7fffffff;
            endMarginCompound = 0x7fffffff;
            bottomMarginCompound = 0x7fffffff;
            firstLineTopMarginCompound = 0x7fffffff;
            lastLineBottomMarginCompound = 0x7fffffff;
            vAlign = 0;
            flow = 0;
            flowInsetTopCompound = 0;
            flowInsetStartCompound = 0;
            flowInsetEndCompound = 0;
            flowInsetBottomCompound = 0;
            flowWidthCompound = -1;
            flowHeightCompound = -1;
            lineWrap = 0;
            widthCompound = layoutparams.widthCompound;
            heightCompound = layoutparams.heightCompound;
            maxGridWidth = layoutparams.maxGridWidth;
            gridInsetStart = layoutparams.gridInsetStart;
            gridInsetEnd = layoutparams.gridInsetEnd;
            gridColumnCount = layoutparams.gridColumnCount;
            gridMinCellSize = layoutparams.gridMinCellSize;
            topMarginCompound = layoutparams.topMarginCompound;
            startMarginCompound = layoutparams.startMarginCompound;
            endMarginCompound = layoutparams.endMarginCompound;
            bottomMarginCompound = layoutparams.bottomMarginCompound;
            firstLineTopMarginCompound = layoutparams.firstLineTopMarginCompound;
            lastLineBottomMarginCompound = layoutparams.lastLineBottomMarginCompound;
            vAlign = layoutparams.vAlign;
            flow = layoutparams.flow;
            flowInsetTopCompound = layoutparams.flowInsetTopCompound;
            flowInsetStartCompound = layoutparams.flowInsetStartCompound;
            flowInsetEndCompound = layoutparams.flowInsetEndCompound;
            flowInsetBottomCompound = layoutparams.flowInsetBottomCompound;
            flowWidthCompound = layoutparams.flowWidthCompound;
            flowHeightCompound = layoutparams.flowHeightCompound;
            lineWrap = layoutparams.lineWrap;
        }
    }

    private static abstract class LineInfo extends MultiItemInfo
    {

        public int mOffsetStart;

        public abstract void clearMeasuredInCurrentPass();

        abstract void debugPrint$241f81bd(StringBuilder stringbuilder);

        public abstract int getItemTopOffset(int i);

        public abstract void recycle();

        private LineInfo()
        {
            super((byte)0);
        }

        LineInfo(byte byte0)
        {
            this();
        }
    }

    private static abstract class MultiItemInfo
    {

        public int mMeasureMode;
        public int mPositionStart;
        public int mTotalHeight;

        public final int arrangeIfNecessary(int i)
        {
            boolean flag = true;
            int j;
            byte byte0;
            if (mPositionStart == 0)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            if (validPositionEnd() == i)
            {
                byte0 = 2;
            } else
            {
                byte0 = 0;
            }
            j |= byte0;
            if (mTotalHeight == -1 || j != mMeasureMode)
            {
                if (mTotalHeight != -1)
                {
                    flag = false;
                }
                mTotalHeight = Math.max(0, onArrange(flag, i));
                mMeasureMode = j;
            }
            return mTotalHeight;
        }

        public final int invalidateFrom(int i)
        {
            if (i <= mPositionStart)
            {
                mTotalHeight = -1;
                return 2;
            }
            if (invalidateFromInternal(i))
            {
                mTotalHeight = -1;
                return 1;
            } else
            {
                return 0;
            }
        }

        protected abstract boolean invalidateFromInternal(int i);

        public void offsetPositions(int i)
        {
            mPositionStart = mPositionStart + i;
        }

        protected abstract int onArrange(boolean flag, int i);

        protected void reset()
        {
            mTotalHeight = -1;
            mPositionStart = -1;
            mMeasureMode = 0;
        }

        public abstract int validPositionEnd();

        private MultiItemInfo()
        {
        }

        MultiItemInfo(byte byte0)
        {
            this();
        }
    }

    private static final class NestedFlowLineInfo extends LineInfo
    {

        private static final android.support.v4.util.Pools.Pool sPool = new android.support.v4.util.Pools.SimplePool(10);
        public ItemInfo mCreator;
        public boolean mCreatorHeightWrapsChildFlow;
        public int mExtraHeight;
        public int mFlowHeight;
        public int mFlowInsetBottom;
        public int mFlowInsetTop;
        public int mFlowStartOffset;
        public int mFlowWidth;
        public ParagraphInfo mParagraph;

        public static NestedFlowLineInfo obtain(int i, int j, int k, ItemInfo iteminfo, LayoutParams layoutparams)
        {
            NestedFlowLineInfo nestedflowlineinfo1 = (NestedFlowLineInfo)sPool.acquire();
            NestedFlowLineInfo nestedflowlineinfo = nestedflowlineinfo1;
            if (nestedflowlineinfo1 == null)
            {
                nestedflowlineinfo = new NestedFlowLineInfo();
            }
            nestedflowlineinfo.mPositionStart = i;
            nestedflowlineinfo.mOffsetStart = k;
            if (!iteminfo.mMeasuredInCurrentPass)
            {
                throw new IllegalArgumentException("creator not measured");
            }
            boolean flag;
            if ((layoutparams.flow & 4) != 0)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            if ((layoutparams.flow & 2) != 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if ((layoutparams.flow & 1) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (k == 0 && i == 0 && !flag)
            {
                throw new IllegalArgumentException((new StringBuilder("Unknown flow value: 0x")).append(Integer.toHexString(layoutparams.flow)).toString());
            }
            nestedflowlineinfo.mCreator = iteminfo;
            float f;
            int l;
            int i1;
            int j1;
            boolean flag1;
            if (layoutparams.heightCompound == -4)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            nestedflowlineinfo.mCreatorHeightWrapsChildFlow = flag1;
            if (k != 0)
            {
                l = 0;
            } else
            {
                l = nestedflowlineinfo.mCreator.mMarginStart + nestedflowlineinfo.mCreator.mDecoratedWidth + nestedflowlineinfo.mCreator.mMarginEnd;
            }
            f = nestedflowlineinfo.mCreator.mGridCellSize;
            i1 = LayoutParams.getPixelSize("layout_flmFlowInsetStart", layoutparams.flowInsetStartCompound, f, false);
            f = nestedflowlineinfo.mCreator.mGridCellSize;
            j1 = LayoutParams.getPixelSize("layout_flmFlowInsetEnd", layoutparams.flowInsetEndCompound, f, false);
            if ((i != 0 || k != 0) && Compound.isCompoundFloat(layoutparams.flowInsetStartCompound) && nestedflowlineinfo.mCreator.mGridInsetStart != 0 && nestedflowlineinfo.mOffsetStart < nestedflowlineinfo.mCreator.mGridInsetStart)
            {
                k = (nestedflowlineinfo.mCreator.mGridInsetStart - nestedflowlineinfo.mOffsetStart) + i1;
            } else
            {
                k = i1;
            }
            f = nestedflowlineinfo.mCreator.mGridCellSize;
            nestedflowlineinfo.mFlowWidth = LayoutParams.getPixelSize("layout_flmFlowWidth", layoutparams.flowWidthCompound, f, true);
            if (nestedflowlineinfo.mFlowWidth < 0)
            {
                nestedflowlineinfo.mFlowWidth = Math.max(0, j - l - k - j1);
            }
            if (i != 0)
            {
                nestedflowlineinfo.mCreator.mMarginStart = j - nestedflowlineinfo.mCreator.mMarginEnd - nestedflowlineinfo.mCreator.mDecoratedWidth;
                nestedflowlineinfo.mFlowStartOffset = j - l - j1 - nestedflowlineinfo.mFlowWidth;
            } else
            {
                nestedflowlineinfo.mFlowStartOffset = k + l;
            }
            nestedflowlineinfo.mFlowInsetTop = layoutparams.getFlowInsetTop(nestedflowlineinfo.mCreator.mGridCellSize);
            nestedflowlineinfo.mFlowInsetBottom = layoutparams.getFlowInsetBottom(nestedflowlineinfo.mCreator.mGridCellSize);
            nestedflowlineinfo.mFlowHeight = layoutparams.getFlowHeight(nestedflowlineinfo.mCreator.mGridCellSize);
            if (nestedflowlineinfo.mFlowHeight < 0)
            {
                nestedflowlineinfo.mFlowHeight = Math.max(0, nestedflowlineinfo.mCreator.mDecoratedHeight - nestedflowlineinfo.mFlowInsetTop - nestedflowlineinfo.mFlowInsetBottom);
            }
            return nestedflowlineinfo;
        }

        public final void clearMeasuredInCurrentPass()
        {
            if (mCreator != null)
            {
                mCreator.mMeasuredInCurrentPass = false;
            }
            if (mParagraph != null)
            {
                mParagraph.clearMeasuredInCurrentPass();
            }
        }

        final void debugPrint$241f81bd(StringBuilder stringbuilder)
        {
            stringbuilder.append('@').append(mPositionStart).append("(flow");
            if (mParagraph != null)
            {
                mParagraph.debugPrint(stringbuilder);
            } else
            {
                stringbuilder.append("{}");
            }
            stringbuilder.append(')');
        }

        public final int getItemTopOffset(int i)
        {
            if (i == mPositionStart)
            {
                return mCreator.mTopOffset;
            }
            if (mParagraph != null)
            {
                return mCreator.mTopOffset + mFlowInsetTop + mParagraph.getItemTopOffset(i);
            } else
            {
                return 0;
            }
        }

        protected final boolean invalidateFromInternal(int i)
        {
            if (mParagraph != null) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            switch (mParagraph.invalidateFrom(i))
            {
            case 1: // '\001'
            default:
                return true;

            case 0: // '\0'
                break;

            case 2: // '\002'
                mParagraph.recycle();
                break; /* Loop/switch isn't completed */
            }
            if (true) goto _L1; else goto _L3
_L3:
            mParagraph = null;
            return true;
        }

        public final void offsetPositions(int i)
        {
            super.offsetPositions(i);
            if (mParagraph != null)
            {
                mParagraph.offsetPositions(i);
            }
        }

        protected final int onArrange(boolean flag, int i)
        {
            if (mCreator == null)
            {
                return 0;
            }
            ItemInfo iteminfo;
            int j;
            int k;
            int l;
            if (mPositionStart == 0)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            if (mPositionStart + 1 == i)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            iteminfo = mCreator;
            if (k != 0)
            {
                k = mCreator.mMarginTopForFirstLine;
            } else
            {
                k = mCreator.mMarginTop;
            }
            iteminfo.mTopOffset = k;
            k = mCreator.mTopOffset;
            l = mCreator.mDecoratedHeight;
            if (j != 0)
            {
                j = mCreator.mMarginBottomForLastLine;
            } else
            {
                j = mCreator.mMarginBottom;
            }
            j = Math.max(0, j + (l + k));
            if (mParagraph != null)
            {
                i = mParagraph.arrangeIfNecessary(i);
            } else
            {
                i = 0;
            }
            if (mCreatorHeightWrapsChildFlow)
            {
                mExtraHeight = Math.max(0, (mFlowInsetTop + i + mFlowInsetBottom) - mCreator.mDecoratedHeight);
                i = Math.max(mFlowHeight, i) + mFlowInsetBottom;
            } else
            {
                mExtraHeight = 0;
                i = Math.max(mFlowHeight + mFlowInsetBottom, i);
            }
            return Math.max(j, mCreator.mTopOffset + mFlowInsetTop + i);
        }

        public final void recycle()
        {
            reset();
            sPool.release(this);
        }

        protected final void reset()
        {
            super.reset();
            if (mCreator != null)
            {
                mCreator.recycle();
                mCreator = null;
            }
            mFlowWidth = 0;
            mFlowHeight = 0;
            mFlowStartOffset = 0;
            mFlowInsetTop = 0;
            mFlowInsetBottom = 0;
            mExtraHeight = 0;
            if (mParagraph != null)
            {
                mParagraph.recycle();
                mParagraph = null;
            }
        }

        public final int validPositionEnd()
        {
            if (mCreator == null)
            {
                return mPositionStart;
            }
            if (mParagraph == null)
            {
                return mPositionStart + 1;
            } else
            {
                return mParagraph.validPositionEnd();
            }
        }


        private NestedFlowLineInfo()
        {
            super((byte)0);
            reset();
        }
    }

    public static interface OnViewRenderedListener
    {
    }

    private static final class ParagraphInfo extends MultiItemInfo
    {

        private static final android.support.v4.util.Pools.Pool sPool = new android.support.v4.util.Pools.SimplePool(15);
        public final List mLines = new ArrayList();

        public static ParagraphInfo obtain(int i)
        {
            ParagraphInfo paragraphinfo1 = (ParagraphInfo)sPool.acquire();
            ParagraphInfo paragraphinfo = paragraphinfo1;
            if (paragraphinfo1 == null)
            {
                paragraphinfo = new ParagraphInfo();
            }
            paragraphinfo.mPositionStart = i;
            return paragraphinfo;
        }

        public final void addLine(LineInfo lineinfo)
        {
            mLines.add(lineinfo);
            super.mTotalHeight = -1;
        }

        public final void clearMeasuredInCurrentPass()
        {
            for (int i = mLines.size() - 1; i >= 0; i--)
            {
                ((LineInfo)mLines.get(i)).clearMeasuredInCurrentPass();
            }

        }

        final void debugPrint(StringBuilder stringbuilder)
        {
            stringbuilder.append('{');
            if (!mLines.isEmpty())
            {
                ((LineInfo)mLines.get(0))._mth241f81bd(stringbuilder);
                for (int i = 1; i < mLines.size(); i++)
                {
                    stringbuilder.append(',');
                    ((LineInfo)mLines.get(i))._mth241f81bd(stringbuilder);
                }

            }
            stringbuilder.append('}');
        }

        public final int getItemTopOffset(int i)
        {
            int j = 0;
            boolean flag = false;
            int k = mLines.size() - 1;
            while (k >= 0) 
            {
                LineInfo lineinfo = (LineInfo)mLines.get(k);
                if (flag)
                {
                    j += lineinfo.mTotalHeight;
                } else
                if (lineinfo.mPositionStart <= i)
                {
                    j = lineinfo.getItemTopOffset(i);
                    flag = true;
                }
                k--;
            }
            return j;
        }

        public final LineInfo getLastLine()
        {
            if (mLines.isEmpty())
            {
                return null;
            } else
            {
                return (LineInfo)mLines.get(mLines.size() - 1);
            }
        }

        protected final boolean invalidateFromInternal(int i)
        {
            int k = mLines.size();
            if (k != 0) goto _L2; else goto _L1
_L1:
            return false;
_L2:
            int j = k - 1;
_L10:
            if (j < 0) goto _L4; else goto _L3
_L3:
            LineInfo lineinfo = (LineInfo)mLines.get(j);
            lineinfo.invalidateFrom(i);
            JVM INSTR tableswitch 0 2: default 72
        //                       0 79
        //                       1 89
        //                       2 91;
               goto _L5 _L6 _L7 _L8
_L5:
            j--;
            continue; /* Loop/switch isn't completed */
_L6:
            if (j != k - 1)
            {
                return true;
            }
            continue; /* Loop/switch isn't completed */
_L7:
            return true;
_L8:
            lineinfo.recycle();
            mLines.remove(j);
            if (true) goto _L5; else goto _L4
_L4:
            throw new Error("Should not reach here");
            if (true) goto _L10; else goto _L9
_L9:
            if (true) goto _L1; else goto _L11
_L11:
        }

        public final void offsetPositions(int i)
        {
            super.offsetPositions(i);
            for (int j = mLines.size() - 1; j >= 0; j--)
            {
                ((LineInfo)mLines.get(j)).offsetPositions(i);
            }

        }

        protected final int onArrange(boolean flag, int i)
        {
            int k = 0;
            int l = mLines.size();
            for (int j = 0; j < l; j++)
            {
                k += ((LineInfo)mLines.get(j)).arrangeIfNecessary(i);
            }

            return k;
        }

        public final void recycle()
        {
            reset();
            sPool.release(this);
        }

        protected final void reset()
        {
            super.reset();
            for (int i = mLines.size() - 1; i >= 0; i--)
            {
                ((LineInfo)mLines.get(i)).recycle();
            }

            mLines.clear();
        }

        public final int validPositionEnd()
        {
            if (mLines.isEmpty())
            {
                return mPositionStart;
            } else
            {
                return ((LineInfo)mLines.get(mLines.size() - 1)).validPositionEnd();
            }
        }


        private ParagraphInfo()
        {
            super((byte)0);
            reset();
        }
    }

    private static class SavedState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return new SavedState[i];
            }

        };
        float mReferenceOffset;
        int mReferencePosition;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeInt(mReferencePosition);
            parcel.writeFloat(mReferenceOffset);
        }


        public SavedState()
        {
        }

        SavedState(Parcel parcel)
        {
            mReferencePosition = parcel.readInt();
            mReferenceOffset = parcel.readFloat();
        }

        public SavedState(SavedState savedstate)
        {
            mReferencePosition = savedstate.mReferencePosition;
            mReferenceOffset = savedstate.mReferenceOffset;
        }
    }


    public static final int HALF_VISIBLE_HEIGHT = Compound.floatLengthToCompound$133ade();
    private static final Rect sDecorInsets = new Rect();
    private int mComputedScrollExtent;
    private int mComputedScrollOffset;
    private int mComputedScrollRange;
    private FillState mFillState;
    private SavedState mPendingSavedState;
    private int mPendingScrollPosition;
    private int mPendingScrollPositionOffset;
    private final List mSections;
    private boolean mTrueAnchorAtPositionZero;
    private OnViewRenderedListener mViewRenderedListener;
    private boolean mWasViewRenderedListenerAutoRegistered;

    private int addLineToParagraph(android.support.v7.widget.RecyclerView.Recycler recycler, ParagraphInfo paragraphinfo, int i, int j, int k, int l, int i1, 
            boolean flag, int j1)
    {
        int k1 = paragraphinfo.validPositionEnd();
        if (k1 >= i)
        {
            if (k1 > i)
            {
                throw new IllegalArgumentException((new StringBuilder("p@[")).append(paragraphinfo.mPositionStart).append(",").append(k1).append(") should not cover nextSectionStart@").append(i).toString());
            } else
            {
                return k1;
            }
        }
        boolean flag1;
        if (paragraphinfo.mPositionStart == k1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!measureNextItem(recycler, k1, k, null, l, 0, i1, flag1, flag, j1))
        {
            return k1;
        }
        if (mFillState.mNextItemLayoutParams.flow == 0)
        {
            InlineFlowLineInfo inlineflowlineinfo = InlineFlowLineInfo.obtain(k1, l, i1, mFillState.takeNextItem());
            i = fillInlineFlowLine(recycler, inlineflowlineinfo, i, k, flag, j1);
            paragraphinfo.addLine(inlineflowlineinfo);
        } else
        {
            NestedFlowLineInfo nestedflowlineinfo = NestedFlowLineInfo.obtain(k1, l, i1, mFillState.takeNextItem(), mFillState.mNextItemLayoutParams);
            i = fillNestedFlowLine(recycler, nestedflowlineinfo, i, j, k);
            paragraphinfo.addLine(nestedflowlineinfo);
        }
        return i;
    }

    private void debugPrintChildren()
    {
        int j = getChildCount();
        Log.d("FlowLayoutManager", (new StringBuilder("current child list: ")).append(j).append(" child(ren)").toString());
        if (j > 0)
        {
            RecyclerView recyclerview = (RecyclerView)getChildAt(0).getParent();
            StringBuilder stringbuilder = new StringBuilder();
            for (int i = 0; i < j; i++)
            {
                stringbuilder.append("  #").append(i).append('@');
                View view = getChildAt(i);
                stringbuilder.append(getPosition(view)).append(',').append(recyclerview.getChildViewHolder(view));
                Log.d("FlowLayoutManager", stringbuilder.toString());
                stringbuilder.setLength(0);
            }

        }
    }

    private void debugPrintSections()
    {
        int j = mSections.size();
        Log.d("FlowLayoutManager", (new StringBuilder("Layout in bookkeeping: ")).append(j).append(" section(s)").toString());
        if (j > 0)
        {
            StringBuilder stringbuilder = new StringBuilder();
            ParagraphInfo paragraphinfo = (ParagraphInfo)mSections.get(0);
            stringbuilder.append("  $0@").append(paragraphinfo.mPositionStart);
            if (paragraphinfo.mPositionStart == 0)
            {
                Object obj;
                int i;
                if (mTrueAnchorAtPositionZero)
                {
                    obj = "(real)";
                } else
                {
                    obj = "(fake)";
                }
                stringbuilder.append(((String) (obj)));
            }
            stringbuilder.append(':');
            paragraphinfo.debugPrint(stringbuilder);
            Log.d("FlowLayoutManager", stringbuilder.toString());
            for (i = 1; i < j; i++)
            {
                stringbuilder.setLength(0);
                obj = (ParagraphInfo)mSections.get(i);
                stringbuilder.append("  $").append(i).append('@').append(((ParagraphInfo) (obj)).mPositionStart).append(':');
                ((ParagraphInfo) (obj)).debugPrint(stringbuilder);
                Log.d("FlowLayoutManager", stringbuilder.toString());
            }

        }
    }

    private int fillDownForHeight(android.support.v7.widget.RecyclerView.Recycler recycler, int i, int j, int k)
    {
        Object obj;
        int l;
        int i1;
        l = i;
        obj = (ParagraphInfo)mSections.get(l);
        i1 = j;
        resetFillState();
_L8:
        int j1 = i1;
        if (i1 <= 0) goto _L2; else goto _L1
_L1:
        ParagraphInfo paragraphinfo;
        int k1;
        paragraphinfo = ((ParagraphInfo) (obj));
        j1 = i1;
        k1 = l;
        if (l + 1 != mSections.size()) goto _L4; else goto _L3
_L3:
        Object obj1 = null;
          goto _L5
_L9:
        int l1;
        paragraphinfo = ((ParagraphInfo) (obj));
        j1 = i1;
        k1 = l;
        try
        {
            fillSection(recycler, ((ParagraphInfo) (obj)), -1, i1, l1, k);
        }
        // Misplaced declaration of an exception variable
        catch (android.support.v7.widget.RecyclerView.Recycler recycler)
        {
            obj = (new StringBuilder("fillDownForHeight() states at exception:\n\t startSectionIndex=")).append(i).append("\n\t height=").append(j).append("\n\t totalItemCount=").append(k).append("\n\t remainingHeight=").append(j1).append("\n\t lastSectionIndex=").append(k1).append("\n\t lastSection=");
            if (paragraphinfo == null)
            {
                ((StringBuilder) (obj)).append("null");
            } else
            {
                paragraphinfo.debugPrint(((StringBuilder) (obj)));
            }
            ((StringBuilder) (obj)).append("\n\t mFillState=").append(mFillState);
            Log.d("FlowLayoutManager", ((StringBuilder) (obj)).toString());
            throw recycler;
        }
        paragraphinfo = ((ParagraphInfo) (obj));
        j1 = i1;
        k1 = l;
        i1 -= mFillState.mHeightFilled;
        paragraphinfo = ((ParagraphInfo) (obj));
        j1 = i1;
        k1 = l;
        l1 = mFillState.mNextAnchorPosition;
        if (l1 == -1) goto _L7; else goto _L6
_L6:
        paragraphinfo = ((ParagraphInfo) (obj));
        j1 = i1;
        k1 = l;
        obj = ParagraphInfo.obtain(l1);
        paragraphinfo = ((ParagraphInfo) (obj));
        j1 = i1;
        k1 = l;
        obj1 = mSections;
        l++;
        paragraphinfo = ((ParagraphInfo) (obj));
        j1 = i1;
        k1 = l;
        ((List) (obj1)).add(l, obj);
          goto _L8
_L4:
        paragraphinfo = ((ParagraphInfo) (obj));
        j1 = i1;
        k1 = l;
        obj1 = (ParagraphInfo)mSections.get(l + 1);
          goto _L5
_L12:
        paragraphinfo = ((ParagraphInfo) (obj));
        j1 = i1;
        k1 = l;
        l1 = ((ParagraphInfo) (obj1)).mPositionStart;
          goto _L9
_L7:
        paragraphinfo = ((ParagraphInfo) (obj));
        j1 = i1;
        k1 = l;
        l1 = ((ParagraphInfo) (obj)).validPositionEnd();
        j1 = i1;
        if (l1 == k) goto _L2; else goto _L10
_L10:
        l++;
        obj = obj1;
          goto _L8
_L2:
        return j1;
_L5:
        if (obj1 != null) goto _L12; else goto _L11
_L11:
        l1 = k;
          goto _L9
    }

    private int fillExistingLine(android.support.v7.widget.RecyclerView.Recycler recycler, LineInfo lineinfo, int i, int j, int k, boolean flag, int l)
    {
        if (lineinfo instanceof InlineFlowLineInfo)
        {
            return fillInlineFlowLine(recycler, (InlineFlowLineInfo)lineinfo, i, k, flag, l);
        } else
        {
            return fillNestedFlowLine(recycler, (NestedFlowLineInfo)lineinfo, i, j, k);
        }
    }

    private int fillInlineFlowLine(android.support.v7.widget.RecyclerView.Recycler recycler, InlineFlowLineInfo inlineflowlineinfo, int i, int j, boolean flag, int k)
    {
        if (inlineflowlineinfo.mItems.isEmpty())
        {
            throw new IllegalArgumentException("Line must not be empty");
        }
        int l;
        for (l = inlineflowlineinfo.validPositionEnd(); l < i && inlineflowlineinfo.mLineWidth - inlineflowlineinfo.mUsedWidth > 1 && measureNextItem(recycler, l, j, inlineflowlineinfo.mItems, inlineflowlineinfo.mLineWidth, inlineflowlineinfo.mUsedWidth, inlineflowlineinfo.mOffsetStart, false, flag, k); l++)
        {
            inlineflowlineinfo.addMeasuredItem(mFillState.takeNextItem());
        }

        return l;
    }

    private int fillNestedFlowLine(android.support.v7.widget.RecyclerView.Recycler recycler, NestedFlowLineInfo nestedflowlineinfo, int i, int j, int k)
    {
        ParagraphInfo paragraphinfo;
        int l1;
        if (nestedflowlineinfo.mCreator == null)
        {
            throw new IllegalArgumentException("Line must not be empty");
        }
        l1 = nestedflowlineinfo.validPositionEnd();
        paragraphinfo = nestedflowlineinfo.mParagraph;
        if (paragraphinfo != null) goto _L2; else goto _L1
_L1:
        Object obj;
        int l;
        if (nestedflowlineinfo.mFlowWidth == 0 || nestedflowlineinfo.mFlowHeight == 0)
        {
            return l1;
        }
        obj = ParagraphInfo.obtain(l1);
        l = addLineToParagraph(recycler, ((ParagraphInfo) (obj)), i, j, k, nestedflowlineinfo.mFlowWidth, nestedflowlineinfo.mOffsetStart + nestedflowlineinfo.mFlowStartOffset, true, nestedflowlineinfo.mFlowHeight);
        if (l == ((ParagraphInfo) (obj)).mPositionStart)
        {
            ((ParagraphInfo) (obj)).recycle();
            return l;
        }
        nestedflowlineinfo.mParagraph = ((ParagraphInfo) (obj));
_L4:
        int i1;
        int k1;
        do
        {
            i1 = l;
            l = nestedflowlineinfo.mFlowHeight;
            k1 = ((ParagraphInfo) (obj)).arrangeIfNecessary(j);
            k1 = addLineToParagraph(recycler, ((ParagraphInfo) (obj)), i, j, k, nestedflowlineinfo.mFlowWidth, nestedflowlineinfo.mOffsetStart + nestedflowlineinfo.mFlowStartOffset, true, l - k1);
            l = k1;
        } while (k1 > i1);
        if (k1 > l1)
        {
            nestedflowlineinfo.mTotalHeight = -1;
        }
        return k1;
_L2:
        l = paragraphinfo.arrangeIfNecessary(j);
        obj = paragraphinfo.getLastLine();
        if (obj == null)
        {
            throw new IllegalStateException("Empty nested paragraph found!");
        }
        int j1 = ((LineInfo) (obj)).mTotalHeight;
        j1 = fillExistingLine(recycler, ((LineInfo) (obj)), i, j, k, true, nestedflowlineinfo.mFlowHeight - (l - j1));
        obj = paragraphinfo;
        l = j1;
        if (j1 > l1)
        {
            paragraphinfo.mTotalHeight = -1;
            obj = paragraphinfo;
            l = j1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void fillSection(android.support.v7.widget.RecyclerView.Recycler recycler, ParagraphInfo paragraphinfo, int i, int j, int k, int l)
    {
        LineInfo lineinfo;
        int i1;
        int k1;
        if (i == -1 && j <= 0)
        {
            throw new IllegalArgumentException("Both criteria met before any processing");
        }
        if (paragraphinfo.mPositionStart >= k)
        {
            throw new IllegalArgumentException("Section started after limit");
        }
        if (i >= k || k > l)
        {
            throw new IllegalArgumentException("positionToCover < nextSectionStart <= totalItemCount does not hold");
        }
        k1 = getWidth() - getPaddingLeft() - getPaddingRight();
        mFillState.mNextAnchorPosition = -1;
        mFillState.mHeightFilled = paragraphinfo.arrangeIfNecessary(l);
        i1 = paragraphinfo.mPositionStart;
        lineinfo = paragraphinfo.getLastLine();
        if (lineinfo == null) goto _L2; else goto _L1
_L1:
        FillState fillstate = mFillState;
        fillstate.mHeightFilled = fillstate.mHeightFilled - lineinfo.mTotalHeight;
        if (lineinfo.mPositionStart <= i || mFillState.mHeightFilled < j) goto _L4; else goto _L3
_L3:
        return;
_L4:
        int l1 = lineinfo.validPositionEnd();
        int j1 = fillExistingLine(recycler, lineinfo, k, l, k1, false, -1);
        i1 = j1;
        if (j1 != l1)
        {
            paragraphinfo.mTotalHeight = -1;
            i1 = j1;
        }
_L6:
        mFillState.mHeightFilled = paragraphinfo.arrangeIfNecessary(l);
_L2:
        if (i1 > i && mFillState.mHeightFilled >= j || mFillState.mNextAnchorPosition != -1 || i1 >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = addLineToParagraph(recycler, paragraphinfo, k, l, k1, k1, 0, false, -1);
        if (true) goto _L6; else goto _L5
_L5:
        if (mFillState.mNextAnchorPosition == -1 || i1 <= i || mFillState.mHeightFilled < j) goto _L3; else goto _L7
_L7:
        mFillState.mNextAnchorPosition = -1;
        return;
    }

    private int fillUpForPosition(android.support.v7.widget.RecyclerView.Recycler recycler, int i, int j, int k)
    {
        ParagraphInfo paragraphinfo;
        int l;
        int i1;
        int k1;
        int l1;
        if (i == -1)
        {
            paragraphinfo = null;
        } else
        {
            paragraphinfo = (ParagraphInfo)mSections.get(i);
        }
        if (paragraphinfo != null && paragraphinfo.mPositionStart > j)
        {
            throw new IllegalArgumentException((new StringBuilder("Section at ")).append(i).append(" impossible to cover position ").append(j).toString());
        }
        if (i + 1 < mSections.size() && j >= ((ParagraphInfo)mSections.get(i + 1)).mPositionStart)
        {
            throw new IllegalArgumentException((new StringBuilder("Section at ")).append(i).append(" impossible to cover position ").append(j).toString());
        }
        if (paragraphinfo == null)
        {
            i1 = 0;
        } else
        {
            i1 = paragraphinfo.validPositionEnd();
        }
        if (i1 > j)
        {
            paragraphinfo.arrangeIfNecessary(k);
            return i;
        }
        l1 = -1;
        k1 = -1;
        l = j;
_L8:
        Object obj;
        int j1;
        obj = paragraphinfo;
        j1 = i;
        if (l < i1) goto _L2; else goto _L1
_L1:
        j1 = i;
        ParagraphInfo paragraphinfo1;
        boolean flag;
        try
        {
            k1 = getOrAddChildWithHint(recycler, l, l1, k1);
        }
        // Misplaced declaration of an exception variable
        catch (android.support.v7.widget.RecyclerView.Recycler recycler)
        {
            Log.d("FlowLayoutManager", (new StringBuilder("fillUpForPosition() state at exception: finding anchor\n\r sectionIndex=")).append(j1).append("\n\r position=").append(j).append("\n\r totalItemCount=").append(k).toString());
            throw recycler;
        }
        j1 = i;
        flag = ((LayoutParams)getChildAt(k1).getLayoutParams()).isAnchorCandidate();
        if (!flag && l != 0) goto _L4; else goto _L3
_L3:
        j1 = i;
        paragraphinfo1 = ParagraphInfo.obtain(l);
        j1 = i;
        obj = mSections;
        i++;
        j1 = i;
        ((List) (obj)).add(i, paragraphinfo1);
        obj = paragraphinfo1;
        j1 = i;
        if (l != 0) goto _L2; else goto _L5
_L5:
        j1 = i;
        mTrueAnchorAtPositionZero = flag;
        j1 = i;
        obj = paragraphinfo1;
_L2:
        resetFillState();
        if (j1 + 1 != mSections.size())
        {
            break MISSING_BLOCK_LABEL_413;
        }
        i = k;
_L6:
        fillSection(recycler, ((ParagraphInfo) (obj)), j, 0, i, k);
        return j1;
_L4:
        l1 = l;
        l--;
        continue; /* Loop/switch isn't completed */
        i = ((ParagraphInfo)mSections.get(j1 + 1)).mPositionStart;
          goto _L6
        recycler;
        Log.d("FlowLayoutManager", (new StringBuilder("fillUpForPosition() state at exception: filling section\n\r sectionIndex=")).append(j1).append("\n\r position=").append(j).append("\n\r totalItemCount=").append(k).append("\n\r mFillState=").append(mFillState).toString());
        throw recycler;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private int findChildIndexByPosition(int i)
    {
        int k = getChildCount();
        if (k != 0 && getPosition(getChildAt(0)) <= i) goto _L2; else goto _L1
_L1:
        int l = -1;
_L4:
        return l;
_L2:
        int j;
        if (getPosition(getChildAt(k - 1)) < i)
        {
            return ~k;
        }
        j = 0;
label0:
        do
        {
label1:
            {
                if (j >= k)
                {
                    break label1;
                }
                int i1 = (j + k) / 2;
                int j1 = getPosition(getChildAt(i1));
                l = i1;
                if (j1 == i)
                {
                    break label0;
                }
                if (j1 < i)
                {
                    j = i1 + 1;
                } else
                {
                    k = i1;
                }
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return ~j;
    }

    private int getOrAddChildWithHint(android.support.v7.widget.RecyclerView.Recycler recycler, int i, int j, int k)
    {
        i - j;
        JVM INSTR tableswitch -1 1: default 28
    //                   -1 79
    //                   0 68
    //                   1 92;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_92;
_L1:
        int l;
        int k1;
        k1 = -1;
        l = -1;
        break MISSING_BLOCK_LABEL_34;
_L3:
        k1 = k;
        l = k;
          goto _L5
_L2:
        k1 = k - 1;
        l = k;
          goto _L5
        k1 = k + 1;
        l = k + 1;
_L5:
        int l1;
        if (k1 >= 0 && k1 < getChildCount())
        {
            int j2 = getPosition(getChildAt(k1));
            if (j2 == i)
            {
                return k1;
            }
            boolean flag;
            boolean flag1;
            if (k1 == l)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (j2 > i)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag != flag1)
            {
                throw new IllegalArgumentException((new StringBuilder("Wrong hint precondition.\n\t position=")).append(i).append("\n\t positionHint=").append(j).append("\n\t indexHint=").append(k).append("\n\t potentialIndex=").append(k1).append("\n\t insertIndex=").append(l).append("\n\t realChildPosition(potentialIndex)=").append(j2).toString());
            }
        }
        boolean flag2 = false;
        l1 = l;
        if (l < 0)
        {
            k1 = findChildIndexByPosition(i);
            flag2 = true;
            if (k1 >= 0)
            {
                return k1;
            }
            l1 = ~k1;
        }
        recycler = recycler.getViewForPosition(i);
        try
        {
            l = getPosition(recycler);
        }
        catch (RuntimeException runtimeexception)
        {
            recycler = (LayoutParams)recycler.getLayoutParams();
            View view;
            int i1;
            int l2;
            if (recycler == null)
            {
                recycler = "failed: no LayoutParams";
            } else
            {
                recycler = recycler.debugGetViewHolderDump();
            }
            Log.d("FlowLayoutManager", (new StringBuilder("getOrAddChildWithHint() states at exception:\n\t position=")).append(i).append("\n\t positionHint=").append(j).append("\n\t indexHint=").append(k).append("\n\t potentialIndex=").append(k1).append("\n\t insertIndex=").append(l1).append("\n\t usedBinarySearch=").append(flag2).append("\n\t child's viewHolderDump=").append(recycler).toString());
            throw runtimeexception;
        }
        if (l == i)
        {
            break MISSING_BLOCK_LABEL_422;
        }
        throw new IllegalStateException((new StringBuilder("Recycler.getViewForPosition(")).append(i).append(") returned a view @").append(l).toString());
        addViewInt(recycler, l1, false);
        i1 = Math.max(0, l1 - 1);
        recycler = getChildAt(i1);
        int i2 = getPosition(recycler);
        recycler = ((LayoutParams)recycler.getLayoutParams()).debugGetViewHolderDump();
        l2 = Math.min(l1 + 1, getChildCount() - 1);
        int j1;
        for (j1++; j1 <= l2; j1++)
        {
            view = getChildAt(j1);
            int k2 = getPosition(view);
            String s = ((LayoutParams)view.getLayoutParams()).debugGetViewHolderDump();
            if (k2 <= i2)
            {
                throw new IllegalStateException((new StringBuilder("Index/position monotonicity broken!\n\t position=")).append(i).append("\n\t positionHint=").append(j).append("\n\t indexHint=").append(k).append("\n\t potentialIndex=").append(k1).append("\n\t insertIndex=").append(l1).append("\n\t usedBinarySearch=").append(flag2).append("\n\t p(childAt(").append(j1 - 1).append("))=").append(i2).append("\n\t   viewHolderDump=").append(recycler).append("\n\t p(childAt(").append(j1).append("))=").append(k2).append("\n\t   viewHolderDump=").append(s).toString());
            }
            i2 = k2;
            recycler = s;
        }

        return l1;
    }

    private View getReferenceChild()
    {
        int i1 = getHeight();
        int j1 = getChildCount();
        View view = null;
        int k = 0x7fffffff;
        int j = 0;
        while (j < j1) 
        {
            View view2 = getChildAt(j);
            View view1 = view;
            int l = k;
            if (!((android.support.v7.widget.RecyclerView.LayoutParams) ((LayoutParams)view2.getLayoutParams())).mViewHolder.isRemoved())
            {
                int i = (getDecoratedTop(view2) + getDecoratedBottom(view2)) / 2;
                if (i >= 0 && i <= i1)
                {
                    return view2;
                }
                if (i < 0)
                {
                    i = -i;
                } else
                {
                    i -= i1;
                }
                view1 = view;
                l = k;
                if (i < k)
                {
                    view1 = view2;
                    l = i;
                }
            }
            j++;
            view = view1;
            k = l;
        }
        return view;
    }

    private void invalidateAndOffsetPositions(int i, int j, int k)
    {
        if (!mSections.isEmpty()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i1;
label0:
        {
            boolean flag = false;
            int l = mSections.size() - 1;
            do
            {
                i1 = ((flag) ? 1 : 0);
                if (l < 0)
                {
                    break label0;
                }
                ParagraphInfo paragraphinfo = (ParagraphInfo)mSections.get(l);
                if (paragraphinfo.mPositionStart < j || paragraphinfo.mPositionStart <= 0 && !mTrueAnchorAtPositionZero)
                {
                    break;
                }
                paragraphinfo.offsetPositions(k);
                l--;
            } while (true);
            i1 = l + 1;
        }
        j = i1 - 1;
        while (j >= 0 && ((ParagraphInfo)mSections.get(j)).invalidateFrom(i) == 2) 
        {
            removeSectionAt(j);
            j--;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private int layoutViewport(android.support.v7.widget.RecyclerView.Recycler recycler, android.support.v7.widget.RecyclerView.State state, int i, int j)
    {
        Object obj;
        Object obj1;
        LineInfo lineinfo;
        int k;
        int l;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        boolean flag;
        try
        {
            j4 = state.getItemCount();
        }
        // Misplaced declaration of an exception variable
        catch (android.support.v7.widget.RecyclerView.Recycler recycler)
        {
            Log.d("FlowLayoutManager", (new StringBuilder("layoutViewport() state at exception:\n\t referencePosition=")).append(i).append("\n\t referenceOffset=").append(j).append("\n\t state.getItemCount()=").append(state.getItemCount()).append("\n\t didStructureChange=").append(state.mStructureChanged).toString());
            debugPrintSections();
            debugPrintChildren();
            throw recycler;
        }
        if (j4 != 0) goto _L2; else goto _L1
_L1:
        removeAndRecycleAllViews(recycler);
        recycleAllSections();
        return 0;
_L60:
        k2 = getPaddingTop();
        i4 = Math.max(k2, getHeight() - getPaddingBottom());
        if (j3 != 0) goto _L4; else goto _L3
_L3:
        l = k2;
_L10:
        if (!Compound.isCompoundInt(0)) goto _L6; else goto _L5
_L5:
        k3 = i4 + 0;
_L11:
        if (state.mStructureChanged)
        {
            detachAndScrapAttachedViews(recycler);
        }
        k = getChildCount() - 1;
_L61:
        if (k < 0) goto _L8; else goto _L7
_L7:
        View view = getChildAt(k);
        if (((android.support.v7.widget.RecyclerView.LayoutParams) ((LayoutParams)view.getLayoutParams())).mViewHolder.needsUpdate())
        {
            super.scrapOrRecycleView(recycler, super.mChildHelper.indexOfChild(view), view);
        }
          goto _L9
_L4:
        if (!Compound.isCompoundInt(0))
        {
            break MISSING_BLOCK_LABEL_151;
        }
        l = k2 + 0;
          goto _L10
        l = k2 - (int)((float)(i4 - k2) * Float.intBitsToFloat(0) + 0.5F);
          goto _L10
_L6:
        k3 = i4 + (int)((float)(i4 - k2) * Float.intBitsToFloat(0) + 0.5F);
          goto _L11
_L8:
        obj = Integer.valueOf(getWidth());
        obj1 = Integer.valueOf(getPaddingStart());
        if (super.mRecyclerView == null) goto _L13; else goto _L12
_L12:
        k = ViewCompat.getPaddingEnd(super.mRecyclerView);
_L62:
        Integer integer = Integer.valueOf(k);
        if (!((Integer) (obj)).equals(state.get(0x7f0d0024)) || !((Integer) (obj1)).equals(state.get(0x7f0d0023)) || !integer.equals(state.get(0x7f0d0022)))
        {
            recycleAllSections();
            state.put(0x7f0d0024, obj);
            state.put(0x7f0d0023, obj1);
            state.put(0x7f0d0022, integer);
        }
        k = mSections.size() - 1;
_L15:
        if (k < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        ((ParagraphInfo)mSections.get(k)).clearMeasuredInCurrentPass();
        k--;
        if (true) goto _L15; else goto _L14
_L63:
        k1 = mSections.size();
        if (k1 == 0) goto _L17; else goto _L16
_L16:
        if (((ParagraphInfo)mSections.get(0)).mPositionStart <= j1) goto _L18; else goto _L17
_L64:
        i2 = fillUpForPosition(recycler, k1, j1, j4);
        obj = (ParagraphInfo)mSections.get(i2);
        if (j3 == 0) goto _L20; else goto _L19
_L19:
        j1 = j - ((ParagraphInfo) (obj)).getItemTopOffset(j1);
_L65:
        l1 = k3 - fillDownForHeight(recycler, i2, k3 - j1, j4);
        l2 = 0;
        k = l1;
        k1 = j1;
        if (j3 == 0) goto _L22; else goto _L21
_L21:
        l2 = Math.max(0, i4 - l1);
        k1 = j1 + l2;
        k = l1 + l2;
          goto _L22
_L26:
        if (l1 <= l) goto _L24; else goto _L23
_L23:
        if (((ParagraphInfo) (obj)).mPositionStart <= 0) goto _L24; else goto _L25
_L25:
        i2 = fillUpForPosition(recycler, j1 - 1, ((ParagraphInfo) (obj)).mPositionStart - 1, j4);
        if (i2 == j1)
        {
            l3++;
        } else
        {
            j1 = i2;
        }
        obj = (ParagraphInfo)mSections.get(j1);
        l1 -= ((ParagraphInfo) (obj)).mTotalHeight;
          goto _L26
_L18:
        if (((ParagraphInfo)mSections.get(k1 - 1)).validPositionEnd() > j1) goto _L28; else goto _L27
_L27:
        k = ~k1;
          goto _L29
_L32:
        if (k >= k1) goto _L31; else goto _L30
_L30:
        l1 = (k + k1) / 2;
        obj = (ParagraphInfo)mSections.get(l1);
        if (j1 >= ((ParagraphInfo) (obj)).mPositionStart)
        {
            break MISSING_BLOCK_LABEL_668;
        }
        k1 = l1;
          goto _L32
        k = l1;
        if (j1 < ((ParagraphInfo) (obj)).validPositionEnd()) goto _L29; else goto _L33
_L33:
        k = l1 + 1;
          goto _L32
_L24:
        i3 = 0;
        i2 = l1;
        j2 = k;
        if (j3 == 0)
        {
            break MISSING_BLOCK_LABEL_815;
        }
        j3 = Math.max(0, l1 - k2);
        l1 -= j3;
        k -= j3;
        i2 = l1;
        j2 = k;
        i3 = j3;
        if (j3 <= 0)
        {
            break MISSING_BLOCK_LABEL_815;
        }
        i2 = l1;
        j2 = k;
        i3 = j3;
        if (l2 != 0)
        {
            break MISSING_BLOCK_LABEL_815;
        }
        i2 = l1;
        j2 = k;
        i3 = j3;
        if (k >= k3)
        {
            break MISSING_BLOCK_LABEL_815;
        }
        j2 = k3 - fillDownForHeight(recycler, l3, k3 - (k1 - j3), j4);
        i3 = j3;
        i2 = l1;
        k3 = Math.min(j2, k3);
        if (ViewCompat.getLayoutDirection(super.mRecyclerView) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mComputedScrollRange = j4 << 8;
        mComputedScrollOffset = 0;
        mComputedScrollExtent = 0;
        j2 = j1;
        k = -1;
_L67:
        if (i2 >= k3) goto _L35; else goto _L34
_L34:
        if (j2 >= mSections.size()) goto _L35; else goto _L36
_L36:
        obj1 = (ParagraphInfo)mSections.get(j2);
        l3 = ((ParagraphInfo) (obj1)).mLines.size();
        l1 = 0;
        k1 = i2;
        i2 = l1;
_L66:
        if (k1 >= k3 || i2 >= l3) goto _L38; else goto _L37
_L37:
        lineinfo = (LineInfo)((ParagraphInfo) (obj1)).mLines.get(i2);
        j3 = k1 + lineinfo.mTotalHeight;
        if (k != -1 || j3 <= l) goto _L40; else goto _L39
_L39:
        l1 = findChildIndexByPosition(lineinfo.mPositionStart);
        break MISSING_BLOCK_LABEL_989;
_L43:
        if (k < 0) goto _L42; else goto _L41
_L41:
        removeAndRecycleViewAt(k, recycler);
        k--;
          goto _L43
_L59:
        k = l1;
        if (l1 == -1) goto _L45; else goto _L44
_L44:
        l1 = renderLineAt(k1, lineinfo, l1, recycler, flag);
        j4 = lineinfo.mTotalHeight + k1;
        k = l1;
        if (j4 <= k2) goto _L45; else goto _L46
_L46:
        if (k1 < i4) goto _L48; else goto _L47
_L47:
        k = l1;
          goto _L45
_L48:
        k = lineinfo.validPositionEnd() - lineinfo.mPositionStart << 8;
        if (k1 > k2)
        {
            break MISSING_BLOCK_LABEL_1138;
        }
        mComputedScrollOffset = (lineinfo.mPositionStart << 8) + ((k2 - k1) * k) / lineinfo.mTotalHeight;
        j4 = Math.min(j4, i4);
        k1 = Math.max(k1, k2);
        if (lineinfo.mTotalHeight != 0) goto _L50; else goto _L49
_L49:
        mComputedScrollExtent = mComputedScrollExtent + k;
        k = l1;
          goto _L45
_L50:
        int k4 = mComputedScrollExtent;
        mComputedScrollExtent = ((j4 - k1) * k) / lineinfo.mTotalHeight + k4;
        k = l1;
          goto _L45
_L35:
        i1 = getChildCount() - 1;
_L52:
        if (i1 < 0 || i1 < k)
        {
            break; /* Loop/switch isn't completed */
        }
        removeAndRecycleViewAt(i1, recycler);
        i1--;
        if (true) goto _L52; else goto _L51
_L51:
        if (j2 >= mSections.size()) goto _L54; else goto _L53
_L53:
        i1 = ((ParagraphInfo)mSections.get(j2)).mPositionStart;
        k = mSections.size() - 1;
_L55:
        if (k < j2 + 2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((ParagraphInfo)mSections.get(k)).mPositionStart < i1 + 5)
        {
            break; /* Loop/switch isn't completed */
        }
        removeSectionAt(k);
        k--;
        if (true) goto _L55; else goto _L54
_L54:
        i1 = ((ParagraphInfo) (obj)).mPositionStart;
        k = j1 - 2 - 1;
_L58:
        if (k < 0) goto _L57; else goto _L56
_L56:
        if (((ParagraphInfo)mSections.get(k)).mPositionStart < i1 - 5)
        {
            removeSectionAt(k);
        }
        k--;
          goto _L58
_L57:
        return l2 - i3;
_L40:
        l1 = k;
          goto _L59
_L2:
        if (i >= 0 && i < j4)
        {
            j3 = 1;
        } else
        {
            j3 = 0;
        }
          goto _L60
_L9:
        k--;
          goto _L61
_L13:
        k = 0;
          goto _L62
_L14:
        if (j3 != 0)
        {
            j1 = i;
        } else
        {
            j1 = 0;
        }
          goto _L63
_L17:
        k = -1;
_L29:
        k1 = k;
        if (k < 0)
        {
            k1 = ~k - 1;
        }
          goto _L64
_L22:
        j1 = i2;
        l1 = k1;
        l3 = i2;
          goto _L26
_L28:
        k = 0;
          goto _L32
_L31:
        k = ~k;
          goto _L29
_L20:
        j1 = k2;
          goto _L65
        k = l1;
        int i1;
        if (l1 < 0)
        {
            k = ~l1;
        }
        k--;
          goto _L43
_L42:
        l1 = 0;
          goto _L59
_L45:
        i2++;
        k1 = j3;
          goto _L66
_L38:
        j2++;
        i2 = k1;
          goto _L67
    }

    private void measureDecorated(View view, int i, int j)
    {
        calculateItemDecorationsForChild(view, sDecorInsets);
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i - sDecorInsets.left - sDecorInsets.right, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j - sDecorInsets.top - sDecorInsets.bottom, 0x40000000));
    }

    private boolean measureNextItem(android.support.v7.widget.RecyclerView.Recycler recycler, int i, int j, List list, int k, int l, int i1, 
            boolean flag, boolean flag1, int j1)
    {
        Object obj;
        ItemInfo iteminfo;
        int i2;
        int k2;
        int l2;
        int j3;
        int l3;
        boolean flag3;
        boolean flag4;
        boolean flag5;
label0:
        {
label1:
            {
                int k1 = getOrAddChildWithHint(recycler, i, mFillState.mNextItemPosition, mFillState.mNextItemChildIndex);
                recycler = getChildAt(k1);
                if (mFillState.mNextItemPosition == i)
                {
                    if (mFillState.mNextItemChildIndex != k1)
                    {
                        throw new IllegalStateException("Cached next child index incorrect");
                    }
                    if (mFillState.mNextItem == null)
                    {
                        throw new IllegalStateException("Cached next child missing ItemInfo");
                    }
                } else
                {
                    mFillState.mNextItemPosition = i;
                    mFillState.mNextItemChildIndex = k1;
                    if (mFillState.mNextItem != null)
                    {
                        throw new IllegalStateException("Did not consume previous ItemInfo");
                    }
                    mFillState.mNextItemLayoutParams = (LayoutParams)recycler.getLayoutParams();
                    mFillState.mNextItem = ItemInfo.obtain();
                    obj = mFillState.mNextItem;
                    LayoutParams layoutparams = mFillState.mNextItemLayoutParams;
                    int k3 = layoutparams.gridInsetStart;
                    int i3 = layoutparams.gridInsetEnd;
                    int i4 = j - k3 - i3;
                    l2 = i4;
                    int j2 = i3;
                    k1 = k3;
                    if (layoutparams.maxGridWidth > 0)
                    {
                        l2 = i4;
                        j2 = i3;
                        k1 = k3;
                        if (i4 > layoutparams.maxGridWidth)
                        {
                            j2 = i4 - layoutparams.maxGridWidth;
                            l2 = layoutparams.maxGridWidth;
                            k1 = k3 + (j2 >> 1);
                            j2 = i3 + ((j2 & 1) + (j2 >> 1));
                        }
                    }
                    float f;
                    if (layoutparams.gridMinCellSize <= 0)
                    {
                        if (layoutparams.gridColumnCount <= 0.0F)
                        {
                            f = (0.0F / 0.0F);
                        } else
                        {
                            f = layoutparams.gridColumnCount;
                        }
                    } else
                    {
                        f = (float)l2 / (float)layoutparams.gridMinCellSize;
                        if (0.0F < layoutparams.gridColumnCount && layoutparams.gridColumnCount <= f)
                        {
                            f = layoutparams.gridColumnCount;
                        } else
                        {
                            f = (float)Math.max(1.0D, Math.floor(f));
                        }
                    }
                    if (obj != null)
                    {
                        obj.mGridCellSize = (float)Math.max(0, l2) / f;
                        obj.mGridInsetStart = k1;
                        obj.mGridInsetEnd = j2;
                    }
                    obj.mMarginTop = layoutparams.getTopMargin(((ItemInfo) (obj)).mGridCellSize);
                    f = ((ItemInfo) (obj)).mGridCellSize;
                    if (layoutparams.firstLineTopMarginCompound == 0x7fffffff)
                    {
                        k1 = layoutparams.getTopMargin(f);
                    } else
                    {
                        k1 = LayoutParams.getPixelSize("layout_flmMarginTopForFirstLine", layoutparams.firstLineTopMarginCompound, f, false);
                    }
                    obj.mMarginTopForFirstLine = k1;
                    f = ((ItemInfo) (obj)).mGridCellSize;
                    if (layoutparams.startMarginCompound == 0x7fffffff)
                    {
                        k1 = MarginLayoutParamsCompat.getMarginStart(layoutparams);
                    } else
                    {
                        k1 = LayoutParams.getPixelSize("layout_flmMarginStart", layoutparams.startMarginCompound, f, false);
                    }
                    obj.mMarginStart = k1;
                    f = ((ItemInfo) (obj)).mGridCellSize;
                    if (layoutparams.endMarginCompound == 0x7fffffff)
                    {
                        k1 = MarginLayoutParamsCompat.getMarginEnd(layoutparams);
                    } else
                    {
                        k1 = LayoutParams.getPixelSize("layout_flmMarginEnd", layoutparams.endMarginCompound, f, false);
                    }
                    obj.mMarginEnd = k1;
                    obj.mMarginBottom = layoutparams.getBottomMargin(((ItemInfo) (obj)).mGridCellSize);
                    f = ((ItemInfo) (obj)).mGridCellSize;
                    if (layoutparams.lastLineBottomMarginCompound == 0x7fffffff)
                    {
                        k1 = layoutparams.getBottomMargin(f);
                    } else
                    {
                        k1 = LayoutParams.getPixelSize("layout_flmMarginBottomForLastLine", layoutparams.lastLineBottomMarginCompound, f, false);
                    }
                    obj.mMarginBottomForLastLine = k1;
                    obj.mVAlign = layoutparams.vAlign;
                }
                obj = mFillState.mNextItemLayoutParams;
                k1 = 1;
                if (list == null || list.isEmpty())
                {
                    l2 = 1;
                } else
                {
                    l2 = 0;
                }
                if (((LayoutParams) (obj)).isAnchorCandidate())
                {
                    if (flag1 || !flag)
                    {
                        break label1;
                    }
                    k1 = 0;
                }
                j2 = ((LayoutParams) (obj)).lineWrap;
                i = k1;
                if (flag1)
                {
                    switch (j2 & 0xc)
                    {
                    default:
                        i = k1;
                        if (l2 != 0)
                        {
                            i = k1;
                            if (j1 <= 1)
                            {
                                return false;
                            }
                        }
                        break;

                    case 8: // '\b'
                        return false;

                    case 4: // '\004'
                        i = k1;
                        if (l2 != 0)
                        {
                            i = 0;
                        }
                        break;
                    }
                }
                break label0;
            }
            mFillState.mNextAnchorPosition = i;
            return false;
        }
label2:
        {
label3:
            {
                iteminfo = mFillState.mNextItem;
                int l1 = ((LayoutParams) (obj)).getEffectiveLineWrapAction();
                j1 = i;
                if (l2 == 0)
                {
                    j1 = i;
                    switch (l1)
                    {
                    default:
                        list = (ItemInfo)list.get(list.size() - 1);
                        boolean flag2;
                        if (Float.compare(iteminfo.mGridCellSize, ((ItemInfo) (list)).mGridCellSize) == 0 && iteminfo.mGridInsetStart == ((ItemInfo) (list)).mGridInsetStart && iteminfo.mGridInsetEnd == ((ItemInfo) (list)).mGridInsetEnd)
                        {
                            flag2 = true;
                        } else
                        {
                            flag2 = false;
                        }
                        j1 = i;
                        if (!flag2)
                        {
                            return false;
                        }
                        break;

                    case 1: // '\001'
                        break;

                    case 2: // '\002'
                        break label3;

                    case 3: // '\003'
                        j1 = 0;
                        break;
                    }
                }
                if (((LayoutParams) (obj)).widthCompound == -1 && k < j)
                {
                    return false;
                }
                break label2;
            }
            return false;
        }
        i2 = j1;
        if (j1 != 0)
        {
            i2 = j1;
            if (l2 != 0)
            {
                i2 = j1;
                if (k >= j)
                {
                    i2 = 0;
                }
            }
        }
        l3 = Math.max(0, k - l - iteminfo.mMarginStart - iteminfo.mMarginEnd);
        i = 0;
        flag4 = false;
        flag5 = false;
        flag3 = false;
        k2 = ((flag5) ? 1 : 0);
        j1 = i;
        j3 = l3;
        if (!Compound.isCompoundFloat(((LayoutParams) (obj)).widthCompound)) goto _L2; else goto _L1
_L1:
        if (iteminfo.mGridInsetStart != 0) goto _L4; else goto _L3
_L3:
        k2 = ((flag5) ? 1 : 0);
        j1 = i;
        j3 = l3;
        if (iteminfo.mGridInsetEnd == 0) goto _L2; else goto _L4
_L4:
        if (iteminfo.mGridInsetStart <= 0) goto _L6; else goto _L5
_L5:
        i = Math.max(0, iteminfo.mGridInsetStart - i1 - l - iteminfo.mMarginStart);
_L18:
        float f1;
        k = j - i1 - k;
        if (iteminfo.mGridInsetEnd > 0)
        {
            j = Math.max(0, iteminfo.mGridInsetEnd - k - iteminfo.mMarginEnd);
        } else
        {
            j = ((flag3) ? 1 : 0);
            if (k == 0)
            {
                j = ((flag3) ? 1 : 0);
                if (iteminfo.mMarginEnd == 0)
                {
                    j = iteminfo.mGridInsetEnd;
                }
            }
        }
        j3 = Math.max(0, l3 - i - j);
        j1 = i;
        k2 = j;
_L2:
        calculateItemDecorationsForChild(recycler, sDecorInsets);
        i = sDecorInsets.left + sDecorInsets.right;
        l2 = sDecorInsets.top + sDecorInsets.bottom;
        k = Math.max(0, j3 - i);
        f1 = iteminfo.mGridCellSize;
        j = LayoutParams.getPixelSize("layout_flmWidth", ((LayoutParams) (obj)).widthCompound, f1, true);
        j;
        JVM INSTR tableswitch -3 -1: default 1244
    //                   -3 1484
    //                   -2 1501
    //                   -1 1468;
           goto _L7 _L8 _L9 _L10
_L7:
        if (Compound.isCompoundFloat(((LayoutParams) (obj)).widthCompound))
        {
            i = Math.max(0, j - i);
        } else
        {
            i = j;
            if (j < 0)
            {
                throw new IllegalArgumentException((new StringBuilder("Unknown enum value for layout_flmWidth: ")).append(j).toString());
            }
        }
        obj.width = i;
        l = 0x40000000;
        j = i;
        i = l;
_L16:
        i1 = android.view.View.MeasureSpec.makeMeasureSpec(j, i);
        f1 = iteminfo.mGridCellSize;
        j = LayoutParams.getPixelSize("layout_flmHeight", ((LayoutParams) (obj)).heightCompound, f1, true);
        j;
        JVM INSTR tableswitch -4 -1: default 1340
    //                   -4 1596
    //                   -3 1340
    //                   -2 1664
    //                   -1 1549;
           goto _L11 _L12 _L11 _L13 _L14
_L14:
        break; /* Loop/switch isn't completed */
_L11:
        if (Compound.isCompoundFloat(((LayoutParams) (obj)).heightCompound))
        {
            i = Math.max(0, j - l2);
        } else
        {
            i = j;
            if (j < 0)
            {
                throw new IllegalArgumentException((new StringBuilder("Unknown value for layout_flmHeight: ")).append(j).toString());
            }
        }
        obj.height = i;
        l = 0x40000000;
        j = i;
        i = l;
        i = android.view.View.MeasureSpec.makeMeasureSpec(j, i);
        if (i2 != 0 && (k == 0 || android.view.View.MeasureSpec.getSize(i1) > k))
        {
            return false;
        }
        recycler.measure(i1, i);
        if (i2 != 0)
        {
            if (recycler.getMeasuredWidth() > k)
            {
                return false;
            }
            if ((ViewCompat.getMeasuredWidthAndState(recycler) & 0x1000000) != 0)
            {
                return false;
            }
        }
        iteminfo.cae6a1d(recycler, false);
        if ((((LayoutParams) (obj)).flow & 2) == 2)
        {
            iteminfo.mMarginEnd = iteminfo.mMarginEnd + k2;
        } else
        {
            iteminfo.mMarginStart = iteminfo.mMarginStart + j1;
        }
        return true;
        continue; /* Loop/switch isn't completed */
_L6:
        i = ((flag4) ? 1 : 0);
        if (l2 != 0)
        {
            i = ((flag4) ? 1 : 0);
            if (i1 == 0)
            {
                i = ((flag4) ? 1 : 0);
                if (iteminfo.mMarginStart == 0)
                {
                    i = iteminfo.mGridInsetStart;
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L10:
        i = 0x40000000;
        obj.width = -1;
        j = k;
        continue; /* Loop/switch isn't completed */
_L8:
        i = 0x40000000;
        obj.width = k;
        j = k;
        continue; /* Loop/switch isn't completed */
_L9:
        i = 0x80000000;
        obj.width = -2;
        j = k;
        if (true) goto _L16; else goto _L15
_L15:
        j = getHeight() - getPaddingTop() - getPaddingBottom() - l2 - ((LayoutParams) (obj)).getTopMargin(f1) - ((LayoutParams) (obj)).getBottomMargin(f1);
        i = 0x40000000;
        obj.height = -1;
        break MISSING_BLOCK_LABEL_1376;
_L12:
        if (((LayoutParams) (obj)).flow != 0 && ((LayoutParams) (obj)).flowHeightCompound >= 0)
        {
            i = ((LayoutParams) (obj)).getFlowHeight(f1);
            j = ((LayoutParams) (obj)).getFlowInsetTop(f1);
            j = Math.max(0, ((LayoutParams) (obj)).getFlowInsetBottom(f1) + (i + j));
            i = 0x40000000;
        } else
        {
            j = 0;
            i = 0;
        }
        obj.height = -1;
        break MISSING_BLOCK_LABEL_1376;
_L13:
        j = 0;
        i = 0;
        obj.height = -2;
        break MISSING_BLOCK_LABEL_1376;
        if (true) goto _L18; else goto _L17
_L17:
    }

    private void recycleAllSections()
    {
        for (int i = mSections.size() - 1; i >= 0; i--)
        {
            ((ParagraphInfo)mSections.get(i)).recycle();
        }

        mSections.clear();
    }

    private void removeSectionAt(int i)
    {
        ((ParagraphInfo)mSections.remove(i)).recycle();
        if (i == 0)
        {
            mTrueAnchorAtPositionZero = true;
        }
    }

    private int renderItemAt(int i, int j, ItemInfo iteminfo, int k, int l, android.support.v7.widget.RecyclerView.Recycler recycler, boolean flag, 
            NestedFlowLineInfo nestedflowlineinfo)
    {
        int i1 = getOrAddChildWithHint(recycler, k, k, l);
        recycler = getChildAt(i1);
        k = iteminfo.mDecoratedHeight;
        int j1;
        if (nestedflowlineinfo != null && nestedflowlineinfo.mCreatorHeightWrapsChildFlow && nestedflowlineinfo.mExtraHeight > 0)
        {
            measureDecorated(recycler, iteminfo.mDecoratedWidth, iteminfo.mDecoratedHeight + nestedflowlineinfo.mExtraHeight);
            k = getDecoratedMeasuredHeight(recycler);
        } else
        if (!iteminfo.mMeasuredInCurrentPass)
        {
            measureDecorated(recycler, iteminfo.mDecoratedWidth, iteminfo.mDecoratedHeight);
            iteminfo.cae6a1d(recycler, true);
            k = iteminfo.mDecoratedHeight;
        }
        j1 = i + iteminfo.mTopOffset;
        j += iteminfo.mMarginStart;
        l = j + iteminfo.mDecoratedWidth;
        if (flag)
        {
            i = getWidth() - l;
        } else
        {
            i = j;
        }
        if (flag)
        {
            j = getWidth() - j;
        } else
        {
            j = l;
        }
        layoutDecorated(recycler, i, j1, j, j1 + k);
        if (mViewRenderedListener != null)
        {
            ((RecyclerView)recycler.getParent()).getChildViewHolder(recycler);
        }
        return i1;
    }

    private int renderLineAt(int i, LineInfo lineinfo, int j, android.support.v7.widget.RecyclerView.Recycler recycler, boolean flag)
    {
        int k1;
        if (lineinfo instanceof InlineFlowLineInfo)
        {
            lineinfo = (InlineFlowLineInfo)lineinfo;
            int i1 = getPaddingStart() + ((InlineFlowLineInfo) (lineinfo)).mOffsetStart;
            int l1 = ((InlineFlowLineInfo) (lineinfo)).mItems.size();
            int k = 0;
            do
            {
                k1 = j;
                if (k >= l1)
                {
                    break;
                }
                ItemInfo iteminfo = (ItemInfo)((InlineFlowLineInfo) (lineinfo)).mItems.get(k);
                j = renderItemAt(i, i1, iteminfo, ((InlineFlowLineInfo) (lineinfo)).mPositionStart + k, j, recycler, flag, null) + 1;
                i1 += iteminfo.mMarginStart + iteminfo.mDecoratedWidth + iteminfo.mMarginEnd;
                k++;
            } while (true);
        } else
        {
            lineinfo = (NestedFlowLineInfo)lineinfo;
            int j1 = renderItemAt(i, getPaddingStart() + ((NestedFlowLineInfo) (lineinfo)).mOffsetStart, ((NestedFlowLineInfo) (lineinfo)).mCreator, ((NestedFlowLineInfo) (lineinfo)).mPositionStart, j, recycler, flag, lineinfo) + 1;
            int l;
            if (((NestedFlowLineInfo) (lineinfo)).mParagraph == null)
            {
                j = 0;
            } else
            {
                j = ((NestedFlowLineInfo) (lineinfo)).mParagraph.mLines.size();
            }
            l = ((NestedFlowLineInfo) (lineinfo)).mCreator.mTopOffset;
            k1 = ((NestedFlowLineInfo) (lineinfo)).mFlowInsetTop + (l + i);
            l = 0;
            i = j1;
            j1 = k1;
            for (; l < j; l++)
            {
                LineInfo lineinfo1 = (LineInfo)((NestedFlowLineInfo) (lineinfo)).mParagraph.mLines.get(l);
                i = renderLineAt(j1, lineinfo1, i, recycler, flag);
                j1 += lineinfo1.mTotalHeight;
            }

            k1 = i;
        }
        return k1;
    }

    private void resetFillState()
    {
        if (mFillState == null)
        {
            mFillState = new FillState((byte)0);
        }
        FillState fillstate = mFillState;
        fillstate.mHeightFilled = 0;
        fillstate.mNextAnchorPosition = -1;
        fillstate.mNextItemPosition = -1;
        fillstate.mNextItemChildIndex = -1;
        fillstate.mNextItemLayoutParams = null;
        if (fillstate.mNextItem != null)
        {
            fillstate.mNextItem.recycle();
            fillstate.mNextItem = null;
        }
    }

    public final boolean canScrollVertically()
    {
        return true;
    }

    public final boolean checkLayoutParams(android.support.v7.widget.RecyclerView.LayoutParams layoutparams)
    {
        return layoutparams instanceof LayoutParams;
    }

    public final int computeVerticalScrollExtent(android.support.v7.widget.RecyclerView.State state)
    {
        return mComputedScrollExtent;
    }

    public final int computeVerticalScrollOffset(android.support.v7.widget.RecyclerView.State state)
    {
        return mComputedScrollOffset;
    }

    public final int computeVerticalScrollRange(android.support.v7.widget.RecyclerView.State state)
    {
        return mComputedScrollRange;
    }

    public final View findViewByPosition(int i)
    {
        i = findChildIndexByPosition(i);
        if (i < 0)
        {
            return null;
        } else
        {
            return getChildAt(i);
        }
    }

    public final volatile android.support.v7.widget.RecyclerView.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams();
    }

    public final volatile android.support.v7.widget.RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeset)
    {
        return new LayoutParams(context, attributeset);
    }

    public final volatile android.support.v7.widget.RecyclerView.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof LayoutParams)
        {
            return new LayoutParams((LayoutParams)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new LayoutParams(layoutparams);
        }
    }

    public final void measureChildWithMargins(View view, int i, int j)
    {
        if (view.getLayoutParams() instanceof LayoutParams)
        {
            throw new UnsupportedOperationException("Views using FlowLayoutManager.LayoutParams should not be measured with measureChildWithMargins()");
        } else
        {
            super.measureChildWithMargins(view, i, j);
            return;
        }
    }

    public final void onAdapterChanged(android.support.v7.widget.RecyclerView.Adapter adapter, android.support.v7.widget.RecyclerView.Adapter adapter1)
    {
        if (mWasViewRenderedListenerAutoRegistered)
        {
            mViewRenderedListener = null;
            mWasViewRenderedListenerAutoRegistered = false;
        }
        if (adapter1 instanceof AutoRegisteredOnViewRenderedListener)
        {
            mViewRenderedListener = (AutoRegisteredOnViewRenderedListener)adapter1;
            mWasViewRenderedListenerAutoRegistered = true;
        }
        recycleAllSections();
        super.onAdapterChanged(adapter, adapter1);
    }

    public final void onDetachedFromWindow(RecyclerView recyclerview, android.support.v7.widget.RecyclerView.Recycler recycler)
    {
        recycleAllSections();
        super.onDetachedFromWindow(recyclerview, recycler);
    }

    public final void onInitializeAccessibilityEvent(android.support.v7.widget.RecyclerView.Recycler recycler, android.support.v7.widget.RecyclerView.State state, AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(recycler, state, accessibilityevent);
        recycler = AccessibilityEventCompat.asRecord(accessibilityevent);
        if (AccessibilityRecordCompat.IMPL.getItemCount(((AccessibilityRecordCompat) (recycler)).mRecord) != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i = 0;
_L9:
        if (i >= getChildCount()) goto _L4; else goto _L3
_L3:
        state = getChildAt(i);
        if (state.getBottom() <= 0) goto _L6; else goto _L5
_L5:
        i = ((LayoutParams)state.getLayoutParams()).getViewAdapterPosition();
_L10:
        int j;
        int k;
        k = getHeight();
        j = getChildCount() - 1;
_L11:
        if (j < 0)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        state = getChildAt(j);
        if (state.getTop() >= k) goto _L8; else goto _L7
_L7:
        j = ((LayoutParams)state.getLayoutParams()).getViewAdapterPosition();
_L12:
        if (i != -1 && j != -1)
        {
            recycler.setFromIndex(i);
            recycler.setToIndex(j);
            return;
        }
          goto _L1
_L6:
        i++;
          goto _L9
_L4:
        i = -1;
          goto _L10
_L8:
        j--;
          goto _L11
        j = -1;
          goto _L12
    }

    public final void onItemsAdded(RecyclerView recyclerview, int i, int j)
    {
        invalidateAndOffsetPositions(i, i, j);
        super.onItemsAdded(recyclerview, i, j);
    }

    public final void onItemsChanged(RecyclerView recyclerview)
    {
        recycleAllSections();
        super.onItemsChanged(recyclerview);
    }

    public final void onItemsMoved(RecyclerView recyclerview, int i, int j, int k)
    {
        invalidateAndOffsetPositions(Math.min(i, j), Math.max(i + k, j + k), 0);
        super.onItemsMoved(recyclerview, i, j, k);
    }

    public final void onItemsRemoved(RecyclerView recyclerview, int i, int j)
    {
        invalidateAndOffsetPositions(i, i + j, -j);
        super.onItemsRemoved(recyclerview, i, j);
    }

    public final void onItemsUpdated(RecyclerView recyclerview, int i, int j)
    {
        super.onItemsUpdated(recyclerview, i, j);
    }

    public final void onLayoutChildren(android.support.v7.widget.RecyclerView.Recycler recycler, android.support.v7.widget.RecyclerView.State state)
    {
        if (mPendingSavedState != null)
        {
            mPendingScrollPosition = mPendingSavedState.mReferencePosition;
            mPendingScrollPositionOffset = (int)((float)getHeight() * mPendingSavedState.mReferenceOffset);
            mPendingSavedState = null;
        }
        int i;
        int j;
        if (mPendingScrollPosition != -1)
        {
            if (mPendingScrollPosition < 0 || mPendingScrollPosition >= state.getItemCount())
            {
                mPendingScrollPosition = -1;
                mPendingScrollPositionOffset = 0x80000000;
            } else
            if (mPendingScrollPositionOffset == 0x80000000)
            {
                mPendingScrollPositionOffset = getPaddingTop();
            }
        }
        if (mPendingScrollPosition != -1)
        {
            j = mPendingScrollPosition;
            i = mPendingScrollPositionOffset;
            mPendingScrollPosition = -1;
            mPendingScrollPositionOffset = 0x80000000;
        } else
        {
            View view = getReferenceChild();
            if (view != null)
            {
                j = getPosition(view);
                i = getDecoratedTop(view);
            } else
            {
                j = -1;
                i = 0;
            }
        }
        layoutViewport(recycler, state, j, i);
    }

    public final void onRestoreInstanceState(Parcelable parcelable)
    {
        if (parcelable instanceof SavedState)
        {
            mPendingSavedState = (SavedState)parcelable;
            requestLayout();
        }
    }

    public final Parcelable onSaveInstanceState()
    {
        if (mPendingSavedState != null)
        {
            return new SavedState(mPendingSavedState);
        }
        SavedState savedstate = new SavedState();
        View view = getReferenceChild();
        if (view == null)
        {
            savedstate.mReferencePosition = -1;
            savedstate.mReferenceOffset = 0.0F;
            return savedstate;
        } else
        {
            savedstate.mReferencePosition = getPosition(view);
            savedstate.mReferenceOffset = (float)getDecoratedTop(view) / (float)getHeight();
            return savedstate;
        }
    }

    public final void scrollToPosition(int i)
    {
        mPendingScrollPosition = i;
        mPendingScrollPositionOffset = 0x80000000;
        requestLayout();
    }

    public final int scrollVerticallyBy(int i, android.support.v7.widget.RecyclerView.Recycler recycler, android.support.v7.widget.RecyclerView.State state)
    {
        View view = getReferenceChild();
        if (view == null)
        {
            return 0;
        } else
        {
            return i - layoutViewport(recycler, state, getPosition(view), getDecoratedTop(view) - i);
        }
    }

}
