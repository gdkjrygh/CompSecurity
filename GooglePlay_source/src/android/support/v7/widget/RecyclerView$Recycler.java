// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView, ChildHelper, AdapterHelper, RecyclerViewAccessibilityDelegate

public final class mViewCacheMax
{

    final ArrayList mAttachedScrap = new ArrayList();
    final ArrayList mCachedViews = new ArrayList();
    ArrayList mChangedScrap;
    private iewPool mRecyclerPool;
    final List mUnmodifiableAttachedScrap;
    private int mViewCacheMax;
    final RecyclerView this$0;

    private void addViewHolderToRecycledViewPool(r r)
    {
        ViewCompat.setAccessibilityDelegate(r.itemView, null);
        RecyclerView.access$4200$5185bdfe();
        if (RecyclerView.access$2200(RecyclerView.this) != null)
        {
            this._cls0 _tmp = RecyclerView.access$2200(RecyclerView.this);
        }
        pat pat = mState;
        mState.iewRecycled(r);
        r.mOwnerRecyclerView = null;
        getRecycledViewPool().putRecycledView(r);
    }

    private r getChangedScrapViewForPosition(int i)
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
            r r = (r)mChangedScrap.get(j);
            if (!r.wasReturnedFromScrap() && r.getLayoutPosition() == i)
            {
                r.addFlags(32);
                return r;
            }
        }

        r.addFlags _tmp = RecyclerView.access$2200(RecyclerView.this);
        return null;
    }

    private r getScrapViewForPosition$6d61fdc(int i, boolean flag)
    {
        ChildHelper childhelper;
        int k;
        int l;
        l = mAttachedScrap.size();
        for (int j = 0; j < l; j++)
        {
            r r = (r)mAttachedScrap.get(j);
            if (!r.wasReturnedFromScrap() && r.getLayoutPosition() == i && !r.isInvalid() && (mState.PreLayout || !r.isRemoved()))
            {
                r.addFlags(32);
                return r;
            }
        }

        childhelper = mChildHelper;
        l = childhelper.mHiddenViews.size();
        k = 0;
_L7:
        if (k >= l) goto _L2; else goto _L1
_L1:
        Object obj;
        r r1;
        obj = (View)childhelper.mHiddenViews.get(k);
        r1 = childhelper.mCallback.etChildViewHolder(((View) (obj)));
        if (r1.getLayoutPosition() != i || r1.isInvalid()) goto _L4; else goto _L3
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
        obj = (r)mCachedViews.get(k);
        if (!((r) (obj)).isInvalid() && ((r) (obj)).getLayoutPosition() == i)
        {
            mCachedViews.remove(k);
            return ((r) (obj));
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
        if (i < 0 || i >= mState.ItemCount())
        {
            throw new IndexOutOfBoundsException((new StringBuilder("invalid position ")).append(i).append(". State item count is ").append(mState.ItemCount()).toString());
        }
        if (!mState.PreLayout)
        {
            return i;
        } else
        {
            return mAdapterHelper.findPositionOffset(i);
        }
    }

    public final iewPool getRecycledViewPool()
    {
        if (mRecyclerPool == null)
        {
            mRecyclerPool = new iewPool();
        }
        return mRecyclerPool;
    }

    public final View getViewForPosition(int i)
    {
        boolean flag1 = true;
        if (i < 0 || i >= mState.ItemCount())
        {
            throw new IndexOutOfBoundsException((new StringBuilder("Invalid item position ")).append(i).append("(").append(i).append("). Item count:").append(mState.ItemCount()).toString());
        }
        Object obj;
        r r;
        r r1;
        boolean flag;
        int j;
        if (mState.PreLayout)
        {
            r = getChangedScrapViewForPosition(i);
            if (r != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            r = null;
            flag = false;
        }
        obj = r;
        if (r != null) goto _L2; else goto _L1
_L1:
        r = getScrapViewForPosition$6d61fdc(i, false);
        obj = r;
        if (r == null) goto _L2; else goto _L3
_L3:
        if (r.isRemoved()) goto _L5; else goto _L4
_L4:
        if (r.mPosition < 0 || r.mPosition >= RecyclerView.access$2200(RecyclerView.this).etItemCount())
        {
            throw new IndexOutOfBoundsException((new StringBuilder("Inconsistency detected. Invalid view holder adapter position")).append(r).toString());
        }
        if (mState.PreLayout || RecyclerView.access$2200(RecyclerView.this).etItemViewType(r.mPosition) == r.mItemViewType) goto _L7; else goto _L6
_L6:
        j = 0;
_L15:
        if (j == 0)
        {
            r.addFlags(4);
            if (r.isScrap())
            {
                removeDetachedView(r.itemView, false);
                r.unScrap();
            } else
            if (r.wasReturnedFromScrap())
            {
                r.clearReturnedFromScrapFlag();
            }
            recycleViewHolderInternal(r);
            obj = null;
        } else
        {
            flag = true;
            obj = r;
        }
_L2:
        r1 = ((r) (obj));
        if (obj != null) goto _L9; else goto _L8
_L8:
        j = mAdapterHelper.findPositionOffset(i);
        if (j < 0 || j >= RecyclerView.access$2200(RecyclerView.this).etItemCount())
        {
            throw new IndexOutOfBoundsException((new StringBuilder("Inconsistency detected. Invalid item position ")).append(i).append("(offset:").append(j).append(").state:").append(mState.ItemCount()).toString());
        }
        j = RecyclerView.access$2200(RecyclerView.this).etItemViewType(j);
        RecyclerView.access$2200(RecyclerView.this);
        r = ((r) (obj));
        if (obj == null)
        {
            r = getRecycledViewPool().getRecycledView(j);
            if (r != null)
            {
                r.resetInternal();
                if (RecyclerView.access$3700() && (r.itemView instanceof ViewGroup))
                {
                    invalidateDisplayListInt((ViewGroup)r.itemView, false);
                }
            }
        }
        r1 = r;
          goto _L10
_L7:
        RecyclerView.access$2200(RecyclerView.this);
_L5:
        j = 1;
        continue; /* Loop/switch isn't completed */
_L10:
        if (r != null) goto _L9; else goto _L11
_L11:
        r = RecyclerView.access$2200(RecyclerView.this).reateViewHolder(RecyclerView.this, j);
_L13:
        if (mState.PreLayout && r.isBound())
        {
            r.mPreLayoutPosition = i;
            i = 0;
        } else
        if (!r.isBound() || r.needsUpdate() || r.isInvalid())
        {
            j = mAdapterHelper.findPositionOffset(i);
            r.mOwnerRecyclerView = RecyclerView.this;
            RecyclerView.access$2200(RecyclerView.this).indViewHolder(r, j);
            obj = r.itemView;
            if (RecyclerView.access$3800(RecyclerView.this) != null && RecyclerView.access$3800(RecyclerView.this).isEnabled())
            {
                if (ViewCompat.getImportantForAccessibility(((View) (obj))) == 0)
                {
                    ViewCompat.setImportantForAccessibility(((View) (obj)), 1);
                }
                if (!ViewCompat.hasAccessibilityDelegate(((View) (obj))))
                {
                    ViewCompat.setAccessibilityDelegate(((View) (obj)), RecyclerView.access$3900(RecyclerView.this).mItemDelegate);
                }
            }
            if (mState.PreLayout)
            {
                r.mPreLayoutPosition = i;
            }
            i = 1;
        } else
        {
            i = 0;
        }
        obj = r.itemView.getLayoutParams();
        if (obj == null)
        {
            obj = (ams)generateDefaultLayoutParams();
            r.itemView.setLayoutParams(((android.view.) (obj)));
        } else
        if (!checkLayoutParams(((android.view.) (obj))))
        {
            obj = (ams)generateLayoutParams(((android.view.) (obj)));
            r.itemView.setLayoutParams(((android.view.) (obj)));
        } else
        {
            obj = (ams)obj;
        }
        obj.mViewHolder = r;
        if (!flag || i == 0)
        {
            flag1 = false;
        }
        obj.mPendingInvalidate = flag1;
        return r.itemView;
_L9:
        r = r1;
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
        addViewHolderToRecycledViewPool((r)mCachedViews.get(i));
        mCachedViews.remove(i);
    }

    public final void recycleView(View view)
    {
        r r;
        r = RecyclerView.getChildViewHolderInt(view);
        if (r.isTmpDetached())
        {
            removeDetachedView(view, false);
        }
        if (!r.isScrap()) goto _L2; else goto _L1
_L1:
        r.unScrap();
_L4:
        recycleViewHolderInternal(r);
        return;
_L2:
        if (r.wasReturnedFromScrap())
        {
            r.clearReturnedFromScrapFlag();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    final void recycleViewHolderInternal(r r)
    {
        boolean flag5 = true;
        if (r.isScrap() || r.itemView.getParent() != null)
        {
            StringBuilder stringbuilder = (new StringBuilder("Scrapped or attached views may not be recycled. isScrap:")).append(r.isScrap()).append(" isAttached:");
            if (r.itemView.getParent() == null)
            {
                flag5 = false;
            }
            throw new IllegalArgumentException(stringbuilder.append(flag5).toString());
        }
        if (r.isTmpDetached())
        {
            throw new IllegalArgumentException((new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ")).append(r).toString());
        }
        if (r.shouldIgnore())
        {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
        }
        boolean flag1;
        int i;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        if ((r.mFlags & 0x10) == 0 && ViewCompat.hasTransientState(r.itemView))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (RecyclerView.access$2200(RecyclerView.this) != null && flag1)
        {
            this._cls0 _tmp = RecyclerView.access$2200(RecyclerView.this);
        }
        i = 0;
        flag4 = false;
        flag3 = false;
        flag2 = flag3;
        if (r.isRecyclable())
        {
            boolean flag = flag4;
            if (!r.isInvalid())
            {
                flag = flag4;
                if (!r.isRemoved())
                {
                    flag = flag4;
                    if (!r.isChanged())
                    {
                        i = mCachedViews.size();
                        if (i == mViewCacheMax && i > 0)
                        {
                            recycleCachedViewAt(0);
                        }
                        flag = flag4;
                        if (i < mViewCacheMax)
                        {
                            mCachedViews.add(r);
                            flag = true;
                        }
                    }
                }
            }
            i = ((flag) ? 1 : 0);
            flag2 = flag3;
            if (!flag)
            {
                addViewHolderToRecycledViewPool(r);
                flag2 = true;
                i = ((flag) ? 1 : 0);
            }
        }
        mState.iewRecycled(r);
        if (i == 0 && !flag2 && flag1)
        {
            r.mOwnerRecyclerView = null;
        }
    }

    final void unscrapView(r r)
    {
        if (!r.isChanged() || !RecyclerView.access$2400(RecyclerView.this) || mChangedScrap == null)
        {
            mAttachedScrap.remove(r);
        } else
        {
            mChangedScrap.remove(r);
        }
        r.mScrapContainer = null;
        r.clearReturnedFromScrapFlag();
    }

    public r()
    {
        this$0 = RecyclerView.this;
        super();
        mChangedScrap = null;
        mUnmodifiableAttachedScrap = Collections.unmodifiableList(mAttachedScrap);
        mViewCacheMax = 2;
    }
}
