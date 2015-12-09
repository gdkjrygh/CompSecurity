// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.TraceCompat;
import android.support.v4.util.ArrayMap;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.NestedScrollingChild;
import android.support.v4.view.NestedScrollingChildHelper;
import android.support.v4.view.ScrollingView;
import android.support.v4.view.VelocityTrackerCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.support.v4.widget.EdgeEffectCompat;
import android.support.v4.widget.ScrollerCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            DefaultItemAnimator, AdapterHelper, ChildHelper, RecyclerViewAccessibilityDelegate

public class RecyclerView extends ViewGroup
    implements NestedScrollingChild, ScrollingView
{
    private class ViewHolder
    {

        public final View itemView;
        int mFlags;
        private int mIsRecyclableCount;
        long mItemId;
        int mItemViewType;
        int mOldPosition;
        RecyclerView mOwnerRecyclerView;
        public int mPosition;
        public int mPreLayoutPosition;
        Recycler mScrapContainer;
        ViewHolder mShadowedHolder;
        ViewHolder mShadowingHolder;

        final void addFlags(int i)
        {
            mFlags = mFlags | i;
        }

        final void clearOldPosition()
        {
            mOldPosition = -1;
            mPreLayoutPosition = -1;
        }

        final void clearReturnedFromScrapFlag()
        {
            mFlags = mFlags & 0xffffffdf;
        }

        final void clearTmpDetachFlag()
        {
            mFlags = mFlags & 0xfffffeff;
        }

        public final int getLayoutPosition()
        {
            if (mPreLayoutPosition == -1)
            {
                return mPosition;
            } else
            {
                return mPreLayoutPosition;
            }
        }

        final boolean isBound()
        {
            return (mFlags & 1) != 0;
        }

        final boolean isChanged()
        {
            return (mFlags & 0x40) != 0;
        }

        final boolean isInvalid()
        {
            return (mFlags & 4) != 0;
        }

        public final boolean isRecyclable()
        {
            return (mFlags & 0x10) == 0 && !ViewCompat.hasTransientState(itemView);
        }

        public final boolean isRemoved()
        {
            return (mFlags & 8) != 0;
        }

        final boolean isScrap()
        {
            return mScrapContainer != null;
        }

        final boolean isTmpDetached()
        {
            return (mFlags & 0x100) != 0;
        }

        public final boolean needsUpdate()
        {
            return (mFlags & 2) != 0;
        }

        final void offsetPosition(int i, boolean flag)
        {
            if (mOldPosition == -1)
            {
                mOldPosition = mPosition;
            }
            if (mPreLayoutPosition == -1)
            {
                mPreLayoutPosition = mPosition;
            }
            if (flag)
            {
                mPreLayoutPosition = mPreLayoutPosition + i;
            }
            mPosition = mPosition + i;
            if (itemView.getLayoutParams() != null)
            {
                ((LayoutParams)itemView.getLayoutParams()).mInsetsDirty = true;
            }
        }

        final void resetInternal()
        {
            mFlags = 0;
            mPosition = -1;
            mOldPosition = -1;
            mItemId = -1L;
            mPreLayoutPosition = -1;
            mIsRecyclableCount = 0;
            mShadowedHolder = null;
            mShadowingHolder = null;
        }

        final void setFlags(int i, int j)
        {
            mFlags = mFlags & ~j | i & j;
        }

        public final void setIsRecyclable(boolean flag)
        {
            int i;
            if (flag)
            {
                i = mIsRecyclableCount - 1;
            } else
            {
                i = mIsRecyclableCount + 1;
            }
            mIsRecyclableCount = i;
            if (mIsRecyclableCount < 0)
            {
                mIsRecyclableCount = 0;
                Log.e("View", (new StringBuilder("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ")).append(this).toString());
            } else
            {
                if (!flag && mIsRecyclableCount == 1)
                {
                    mFlags = mFlags | 0x10;
                    return;
                }
                if (flag && mIsRecyclableCount == 0)
                {
                    mFlags = mFlags & 0xffffffef;
                    return;
                }
            }
        }

        final boolean shouldIgnore()
        {
            return (mFlags & 0x80) != 0;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder((new StringBuilder("ViewHolder{")).append(Integer.toHexString(hashCode())).append(" position=").append(mPosition).append(" id=").append(mItemId).append(", oldPos=").append(mOldPosition).append(", pLpos:").append(mPreLayoutPosition).toString());
            if (isScrap())
            {
                stringbuilder.append(" scrap");
            }
            if (isInvalid())
            {
                stringbuilder.append(" invalid");
            }
            if (!isBound())
            {
                stringbuilder.append(" unbound");
            }
            if (needsUpdate())
            {
                stringbuilder.append(" update");
            }
            if (isRemoved())
            {
                stringbuilder.append(" removed");
            }
            if (shouldIgnore())
            {
                stringbuilder.append(" ignored");
            }
            if (isChanged())
            {
                stringbuilder.append(" changed");
            }
            if (isTmpDetached())
            {
                stringbuilder.append(" tmpDetached");
            }
            if (!isRecyclable())
            {
                stringbuilder.append((new StringBuilder(" not recyclable(")).append(mIsRecyclableCount).append(")").toString());
            }
            boolean flag;
            if ((mFlags & 0x200) != 0 || isInvalid())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                stringbuilder.append("undefined adapter position");
            }
            if (itemView.getParent() == null)
            {
                stringbuilder.append(" no parent");
            }
            stringbuilder.append("}");
            return stringbuilder.toString();
        }

        final void unScrap()
        {
            mScrapContainer.unscrapView(this);
        }

        final boolean wasReturnedFromScrap()
        {
            return (mFlags & 0x20) != 0;
        }


        public ViewHolder(View view)
        {
            mPosition = -1;
            mOldPosition = -1;
            mItemId = -1L;
            mItemViewType = -1;
            mPreLayoutPosition = -1;
            mShadowedHolder = null;
            mShadowingHolder = null;
            mIsRecyclableCount = 0;
            mScrapContainer = null;
            if (view == null)
            {
                throw new IllegalArgumentException("itemView may not be null");
            } else
            {
                itemView = view;
                return;
            }
        }
    }

    private class Recycler
    {

        final ArrayList mAttachedScrap = new ArrayList();
        final ArrayList mCachedViews = new ArrayList();
        ArrayList mChangedScrap;
        private RecycledViewPool mRecyclerPool;
        final List mUnmodifiableAttachedScrap;
        private int mViewCacheMax;
        final RecyclerView this$0;

        private void addViewHolderToRecycledViewPool(ViewHolder viewholder)
        {
            ViewCompat.setAccessibilityDelegate(viewholder.itemView, null);
            null;
            if (mAdapter != null)
            {
                Adapter _tmp = mAdapter;
            }
            State state = mState;
            mState.onViewRecycled(viewholder);
            viewholder.mOwnerRecyclerView = null;
            getRecycledViewPool().putRecycledView(viewholder);
        }

        private ViewHolder getChangedScrapViewForPosition(int i)
        {
            int k;
label0:
            {
                if (mChangedScrap != null)
                {
                    k = mChangedScrap.size();
                    if (k != 0)
                    {
                        break label0;
                    }
                }
                return null;
            }
            for (int j = 0; j < k; j++)
            {
                ViewHolder viewholder = (ViewHolder)mChangedScrap.get(j);
                if (!viewholder.wasReturnedFromScrap() && viewholder.getLayoutPosition() == i)
                {
                    viewholder.addFlags(32);
                    return viewholder;
                }
            }

            Adapter _tmp = mAdapter;
            return null;
        }

        private ViewHolder getScrapViewForPosition$6d61fdc(int i, boolean flag)
        {
            ChildHelper childhelper;
            int k;
            int l;
            l = mAttachedScrap.size();
            for (int j = 0; j < l; j++)
            {
                ViewHolder viewholder = (ViewHolder)mAttachedScrap.get(j);
                if (!viewholder.wasReturnedFromScrap() && viewholder.getLayoutPosition() == i && !viewholder.isInvalid() && (mState.mInPreLayout || !viewholder.isRemoved()))
                {
                    viewholder.addFlags(32);
                    return viewholder;
                }
            }

            childhelper = mChildHelper;
            l = childhelper.mHiddenViews.size();
            k = 0;
_L7:
            if (k >= l) goto _L2; else goto _L1
_L1:
            Object obj;
            ViewHolder viewholder1;
            obj = (View)childhelper.mHiddenViews.get(k);
            viewholder1 = childhelper.mCallback.getChildViewHolder(((View) (obj)));
            if (viewholder1.getLayoutPosition() != i || viewholder1.isInvalid()) goto _L4; else goto _L3
_L3:
            if (obj != null)
            {
                mItemAnimator.endAnimation(getChildViewHolder(((View) (obj))));
            }
            l = mCachedViews.size();
            k = 0;
_L5:
            if (k >= l)
            {
                break MISSING_BLOCK_LABEL_272;
            }
            obj = (ViewHolder)mCachedViews.get(k);
            if (!((ViewHolder) (obj)).isInvalid() && ((ViewHolder) (obj)).getLayoutPosition() == i)
            {
                mCachedViews.remove(k);
                return ((ViewHolder) (obj));
            }
            break MISSING_BLOCK_LABEL_263;
_L4:
            k++;
            continue; /* Loop/switch isn't completed */
_L2:
            obj = null;
              goto _L3
            k++;
              goto _L5
            return null;
            if (true) goto _L7; else goto _L6
_L6:
        }

        private void invalidateDisplayListInt(ViewGroup viewgroup, boolean flag)
        {
            for (int i = viewgroup.getChildCount() - 1; i >= 0; i--)
            {
                View view = viewgroup.getChildAt(i);
                if (view instanceof ViewGroup)
                {
                    invalidateDisplayListInt((ViewGroup)view, true);
                }
            }

            if (!flag)
            {
                return;
            }
            if (viewgroup.getVisibility() == 4)
            {
                viewgroup.setVisibility(0);
                viewgroup.setVisibility(4);
                return;
            } else
            {
                int j = viewgroup.getVisibility();
                viewgroup.setVisibility(4);
                viewgroup.setVisibility(j);
                return;
            }
        }

        public final void clear()
        {
            mAttachedScrap.clear();
            recycleAndClearCachedViews();
        }

        public final int convertPreLayoutPositionToPostLayout(int i)
        {
            if (i < 0 || i >= mState.getItemCount())
            {
                throw new IndexOutOfBoundsException((new StringBuilder("invalid position ")).append(i).append(". State item count is ").append(mState.getItemCount()).toString());
            }
            if (!mState.mInPreLayout)
            {
                return i;
            } else
            {
                return mAdapterHelper.findPositionOffset(i);
            }
        }

        public final RecycledViewPool getRecycledViewPool()
        {
            if (mRecyclerPool == null)
            {
                mRecyclerPool = new RecycledViewPool();
            }
            return mRecyclerPool;
        }

        public final View getViewForPosition(int i)
        {
            boolean flag1 = true;
            if (i < 0 || i >= mState.getItemCount())
            {
                throw new IndexOutOfBoundsException((new StringBuilder("Invalid item position ")).append(i).append("(").append(i).append("). Item count:").append(mState.getItemCount()).toString());
            }
            Object obj;
            ViewHolder viewholder;
            ViewHolder viewholder1;
            boolean flag;
            int j;
            if (mState.mInPreLayout)
            {
                viewholder = getChangedScrapViewForPosition(i);
                if (viewholder != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                viewholder = null;
                flag = false;
            }
            obj = viewholder;
            if (viewholder != null) goto _L2; else goto _L1
_L1:
            viewholder = getScrapViewForPosition$6d61fdc(i, false);
            obj = viewholder;
            if (viewholder == null) goto _L2; else goto _L3
_L3:
            if (viewholder.isRemoved()) goto _L5; else goto _L4
_L4:
            if (viewholder.mPosition < 0 || viewholder.mPosition >= mAdapter.getItemCount())
            {
                throw new IndexOutOfBoundsException((new StringBuilder("Inconsistency detected. Invalid view holder adapter position")).append(viewholder).toString());
            }
            if (mState.mInPreLayout || mAdapter.getItemViewType(viewholder.mPosition) == viewholder.mItemViewType) goto _L7; else goto _L6
_L6:
            j = 0;
_L15:
            if (j == 0)
            {
                viewholder.addFlags(4);
                if (viewholder.isScrap())
                {
                    removeDetachedView(viewholder.itemView, false);
                    viewholder.unScrap();
                } else
                if (viewholder.wasReturnedFromScrap())
                {
                    viewholder.clearReturnedFromScrapFlag();
                }
                recycleViewHolderInternal(viewholder);
                obj = null;
            } else
            {
                flag = true;
                obj = viewholder;
            }
_L2:
            viewholder1 = ((ViewHolder) (obj));
            if (obj != null) goto _L9; else goto _L8
_L8:
            j = mAdapterHelper.findPositionOffset(i);
            if (j < 0 || j >= mAdapter.getItemCount())
            {
                throw new IndexOutOfBoundsException((new StringBuilder("Inconsistency detected. Invalid item position ")).append(i).append("(offset:").append(j).append(").state:").append(mState.getItemCount()).toString());
            }
            j = mAdapter.getItemViewType(j);
            mAdapter;
            viewholder = ((ViewHolder) (obj));
            if (obj == null)
            {
                viewholder = getRecycledViewPool().getRecycledView(j);
                if (viewholder != null)
                {
                    viewholder.resetInternal();
                    if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST && (viewholder.itemView instanceof ViewGroup))
                    {
                        invalidateDisplayListInt((ViewGroup)viewholder.itemView, false);
                    }
                }
            }
            viewholder1 = viewholder;
              goto _L10
_L7:
            mAdapter;
_L5:
            j = 1;
            continue; /* Loop/switch isn't completed */
_L10:
            if (viewholder != null) goto _L9; else goto _L11
_L11:
            viewholder = mAdapter.createViewHolder(RecyclerView.this, j);
_L13:
            if (mState.mInPreLayout && viewholder.isBound())
            {
                viewholder.mPreLayoutPosition = i;
                i = 0;
            } else
            if (!viewholder.isBound() || viewholder.needsUpdate() || viewholder.isInvalid())
            {
                j = mAdapterHelper.findPositionOffset(i);
                viewholder.mOwnerRecyclerView = RecyclerView.this;
                mAdapter.bindViewHolder(viewholder, j);
                obj = viewholder.itemView;
                if (mAccessibilityManager != null && mAccessibilityManager.isEnabled())
                {
                    if (ViewCompat.getImportantForAccessibility(((View) (obj))) == 0)
                    {
                        ViewCompat.setImportantForAccessibility(((View) (obj)), 1);
                    }
                    if (!ViewCompat.hasAccessibilityDelegate(((View) (obj))))
                    {
                        ViewCompat.setAccessibilityDelegate(((View) (obj)), mAccessibilityDelegate.mItemDelegate);
                    }
                }
                if (mState.mInPreLayout)
                {
                    viewholder.mPreLayoutPosition = i;
                }
                i = 1;
            } else
            {
                i = 0;
            }
            obj = viewholder.itemView.getLayoutParams();
            if (obj == null)
            {
                obj = (LayoutParams)generateDefaultLayoutParams();
                viewholder.itemView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            } else
            if (!checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj))))
            {
                obj = (LayoutParams)generateLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
                viewholder.itemView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            } else
            {
                obj = (LayoutParams)obj;
            }
            obj.mViewHolder = viewholder;
            if (!flag || i == 0)
            {
                flag1 = false;
            }
            obj.mPendingInvalidate = flag1;
            return viewholder.itemView;
_L9:
            viewholder = viewholder1;
            if (true) goto _L13; else goto _L12
_L12:
            if (true) goto _L15; else goto _L14
_L14:
        }

        final void recycleAndClearCachedViews()
        {
            for (int i = mCachedViews.size() - 1; i >= 0; i--)
            {
                recycleCachedViewAt(i);
            }

            mCachedViews.clear();
        }

        final void recycleCachedViewAt(int i)
        {
            addViewHolderToRecycledViewPool((ViewHolder)mCachedViews.get(i));
            mCachedViews.remove(i);
        }

        public final void recycleView(View view)
        {
            ViewHolder viewholder;
            viewholder = RecyclerView.getChildViewHolderInt(view);
            if (viewholder.isTmpDetached())
            {
                removeDetachedView(view, false);
            }
            if (!viewholder.isScrap()) goto _L2; else goto _L1
_L1:
            viewholder.unScrap();
_L4:
            recycleViewHolderInternal(viewholder);
            return;
_L2:
            if (viewholder.wasReturnedFromScrap())
            {
                viewholder.clearReturnedFromScrapFlag();
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        final void recycleViewHolderInternal(ViewHolder viewholder)
        {
            boolean flag5 = true;
            if (viewholder.isScrap() || viewholder.itemView.getParent() != null)
            {
                StringBuilder stringbuilder = (new StringBuilder("Scrapped or attached views may not be recycled. isScrap:")).append(viewholder.isScrap()).append(" isAttached:");
                if (viewholder.itemView.getParent() == null)
                {
                    flag5 = false;
                }
                throw new IllegalArgumentException(stringbuilder.append(flag5).toString());
            }
            if (viewholder.isTmpDetached())
            {
                throw new IllegalArgumentException((new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ")).append(viewholder).toString());
            }
            if (viewholder.shouldIgnore())
            {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
            }
            boolean flag1;
            int i;
            boolean flag2;
            boolean flag3;
            boolean flag4;
            if ((viewholder.mFlags & 0x10) == 0 && ViewCompat.hasTransientState(viewholder.itemView))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (mAdapter != null && flag1)
            {
                Adapter _tmp = mAdapter;
            }
            i = 0;
            flag4 = false;
            flag3 = false;
            flag2 = flag3;
            if (viewholder.isRecyclable())
            {
                boolean flag = flag4;
                if (!viewholder.isInvalid())
                {
                    flag = flag4;
                    if (!viewholder.isRemoved())
                    {
                        flag = flag4;
                        if (!viewholder.isChanged())
                        {
                            i = mCachedViews.size();
                            if (i == mViewCacheMax && i > 0)
                            {
                                recycleCachedViewAt(0);
                            }
                            flag = flag4;
                            if (i < mViewCacheMax)
                            {
                                mCachedViews.add(viewholder);
                                flag = true;
                            }
                        }
                    }
                }
                i = ((flag) ? 1 : 0);
                flag2 = flag3;
                if (!flag)
                {
                    addViewHolderToRecycledViewPool(viewholder);
                    flag2 = true;
                    i = ((flag) ? 1 : 0);
                }
            }
            mState.onViewRecycled(viewholder);
            if (i == 0 && !flag2 && flag1)
            {
                viewholder.mOwnerRecyclerView = null;
            }
        }

        final void unscrapView(ViewHolder viewholder)
        {
            if (!viewholder.isChanged() || !supportsChangeAnimations() || mChangedScrap == null)
            {
                mAttachedScrap.remove(viewholder);
            } else
            {
                mChangedScrap.remove(viewholder);
            }
            viewholder.mScrapContainer = null;
            viewholder.clearReturnedFromScrapFlag();
        }

        public Recycler()
        {
            this$0 = RecyclerView.this;
            super();
            mChangedScrap = null;
            mUnmodifiableAttachedScrap = Collections.unmodifiableList(mAttachedScrap);
            mViewCacheMax = 2;
        }
    }

    public static abstract class Adapter
    {

        private boolean mHasStableIds;
        public final AdapterDataObservable mObservable = new AdapterDataObservable();

        public final void bindViewHolder(ViewHolder viewholder, int i)
        {
            viewholder.mPosition = i;
            viewholder.setFlags(1, 519);
            TraceCompat.beginSection("RV OnBindView");
            onBindViewHolder(viewholder, i);
            TraceCompat.endSection();
        }

        public final ViewHolder createViewHolder(ViewGroup viewgroup, int i)
        {
            TraceCompat.beginSection("RV CreateView");
            viewgroup = onCreateViewHolder(viewgroup, i);
            viewgroup.mItemViewType = i;
            TraceCompat.endSection();
            return viewgroup;
        }

        public abstract int getItemCount();

        public int getItemViewType(int i)
        {
            return 0;
        }

        public final void notifyItemChanged(int i)
        {
            mObservable.notifyItemRangeChanged(i, 1);
        }

        public final void notifyItemInserted(int i)
        {
            mObservable.notifyItemRangeInserted(i, 1);
        }

        public final void notifyItemRangeChanged(int i, int j)
        {
            mObservable.notifyItemRangeChanged(i, j);
        }

        public final void notifyItemRangeInserted(int i, int j)
        {
            mObservable.notifyItemRangeInserted(i, j);
        }

        public final void notifyItemRangeRemoved(int i, int j)
        {
            mObservable.notifyItemRangeRemoved(i, j);
        }

        public final void notifyItemRemoved(int i)
        {
            mObservable.notifyItemRangeRemoved(i, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerview)
        {
        }

        public abstract void onBindViewHolder(ViewHolder viewholder, int i);

        public abstract ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerview)
        {
        }

        public final void registerAdapterDataObserver(AdapterDataObserver adapterdataobserver)
        {
            mObservable.registerObserver(adapterdataobserver);
        }

        public final void unregisterAdapterDataObserver(AdapterDataObserver adapterdataobserver)
        {
            mObservable.unregisterObserver(adapterdataobserver);
        }

        public Adapter()
        {
            mHasStableIds = false;
        }
    }

    public static final class AdapterDataObservable extends Observable
    {

        public final void notifyChanged()
        {
            for (int i = mObservers.size() - 1; i >= 0; i--)
            {
                ((AdapterDataObserver)mObservers.get(i)).onChanged();
            }

        }

        public final void notifyItemRangeChanged(int i, int j)
        {
            for (int k = mObservers.size() - 1; k >= 0; k--)
            {
                ((AdapterDataObserver)mObservers.get(k)).onItemRangeChanged(i, j);
            }

        }

        public final void notifyItemRangeInserted(int i, int j)
        {
            for (int k = mObservers.size() - 1; k >= 0; k--)
            {
                ((AdapterDataObserver)mObservers.get(k)).onItemRangeInserted(i, j);
            }

        }

        public final void notifyItemRangeRemoved(int i, int j)
        {
       