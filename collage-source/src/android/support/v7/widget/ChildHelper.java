// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

class ChildHelper
{
    static class Bucket
    {

        static final int BITS_PER_WORD = 64;
        static final long LAST_BIT = 0x8000000000000000L;
        long mData;
        Bucket next;

        private void ensureNext()
        {
            if (next == null)
            {
                next = new Bucket();
            }
        }

        void clear(int i)
        {
            if (i >= 64)
            {
                if (next != null)
                {
                    next.clear(i - 64);
                }
                return;
            } else
            {
                mData = mData & ~(1L << i);
                return;
            }
        }

        int countOnesBefore(int i)
        {
            if (next == null)
            {
                if (i >= 64)
                {
                    return Long.bitCount(mData);
                } else
                {
                    return Long.bitCount(mData & (1L << i) - 1L);
                }
            }
            if (i < 64)
            {
                return Long.bitCount(mData & (1L << i) - 1L);
            } else
            {
                return next.countOnesBefore(i - 64) + Long.bitCount(mData);
            }
        }

        boolean get(int i)
        {
            if (i >= 64)
            {
                ensureNext();
                return next.get(i - 64);
            }
            return (mData & 1L << i) != 0L;
        }

        void insert(int i, boolean flag)
        {
            if (i >= 64)
            {
                ensureNext();
                next.insert(i - 64, flag);
            } else
            {
                long l;
                long l1;
                boolean flag1;
                if ((mData & 0x8000000000000000L) != 0L)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                l = (1L << i) - 1L;
                l1 = mData;
                mData = (~l & mData) << 1 | l1 & l;
                if (flag)
                {
                    set(i);
                } else
                {
                    clear(i);
                }
                if (flag1 || next != null)
                {
                    ensureNext();
                    next.insert(0, flag1);
                    return;
                }
            }
        }

        boolean remove(int i)
        {
            boolean flag1;
            if (i >= 64)
            {
                ensureNext();
                flag1 = next.remove(i - 64);
            } else
            {
                long l = 1L << i;
                long l1;
                boolean flag;
                if ((mData & l) != 0L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                mData = mData & ~l;
                l--;
                l1 = mData;
                mData = Long.rotateRight(~l & mData, 1) | l1 & l;
                flag1 = flag;
                if (next != null)
                {
                    if (next.get(0))
                    {
                        set(63);
                    }
                    next.remove(0);
                    return flag;
                }
            }
            return flag1;
        }

        void reset()
        {
            mData = 0L;
            if (next != null)
            {
                next.reset();
            }
        }

        void set(int i)
        {
            if (i >= 64)
            {
                ensureNext();
                next.set(i - 64);
                return;
            } else
            {
                mData = mData | 1L << i;
                return;
            }
        }

        public String toString()
        {
            if (next == null)
            {
                return Long.toBinaryString(mData);
            } else
            {
                return (new StringBuilder()).append(next.toString()).append("xx").append(Long.toBinaryString(mData)).toString();
            }
        }

        Bucket()
        {
            mData = 0L;
        }
    }

    static interface Callback
    {

        public abstract void addView(View view, int i);

        public abstract void attachViewToParent(View view, int i, android.view.ViewGroup.LayoutParams layoutparams);

        public abstract void detachViewFromParent(int i);

        public abstract View getChildAt(int i);

        public abstract int getChildCount();

        public abstract RecyclerView.ViewHolder getChildViewHolder(View view);

        public abstract int indexOfChild(View view);

        public abstract void onEnteredHiddenState(View view);

        public abstract void onLeftHiddenState(View view);

        public abstract void removeAllViews();

        public abstract void removeViewAt(int i);
    }


    private static final boolean DEBUG = false;
    private static final String TAG = "ChildrenHelper";
    final Bucket mBucket = new Bucket();
    final Callback mCallback;
    final List mHiddenViews = new ArrayList();

    ChildHelper(Callback callback)
    {
        mCallback = callback;
    }

    private int getOffset(int i)
    {
        if (i >= 0)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        i = -1;
        return i;
        int j;
        int k;
        int l;
        k = mCallback.getChildCount();
        j = i;
          goto _L1
        continue; /* Loop/switch isn't completed */
        j += l;
    }

    private void hideViewInternal(View view)
    {
        mHiddenViews.add(view);
        mCallback.onEnteredHiddenState(view);
    }

    private boolean unhideViewInternal(View view)
    {
        if (mHiddenViews.remove(view))
        {
            mCallback.onLeftHiddenState(view);
            return true;
        } else
        {
            return false;
        }
    }

    void addView(View view, int i, boolean flag)
    {
        if (i < 0)
        {
            i = mCallback.getChildCount();
        } else
        {
            i = getOffset(i);
        }
        mBucket.insert(i, flag);
        if (flag)
        {
            hideViewInternal(view);
        }
        mCallback.addView(view, i);
    }

    void addView(View view, boolean flag)
    {
        addView(view, -1, flag);
    }

    void attachViewToParent(View view, int i, android.view.ViewGroup.LayoutParams layoutparams, boolean flag)
    {
        if (i < 0)
        {
            i = mCallback.getChildCount();
        } else
        {
            i = getOffset(i);
        }
        mBucket.insert(i, flag);
        if (flag)
        {
            hideViewInternal(view);
        }
        mCallback.attachViewToParent(view, i, layoutparams);
    }

    void detachViewFromParent(int i)
    {
        i = getOffset(i);
        mBucket.remove(i);
        mCallback.detachViewFromParent(i);
    }

    View findHiddenNonRemovedView(int i, int j)
    {
        int l = mHiddenViews.size();
        for (int k = 0; k < l; k++)
        {
            View view = (View)mHiddenViews.get(k);
            RecyclerView.ViewHolder viewholder = mCallback.getChildViewHolder(view);
            if (viewholder.getLayoutPosition() == i && !viewholder.isInvalid() && !viewholder.isRemoved() && (j == -1 || viewholder.getItemViewType() == j))
            {
                return view;
            }
        }

        return null;
    }

    View getChildAt(int i)
    {
        i = getOffset(i);
        return mCallback.getChildAt(i);
    }

    int getChildCount()
    {
        return mCallback.getChildCount() - mHiddenViews.size();
    }

    View getUnfilteredChildAt(int i)
    {
        return mCallback.getChildAt(i);
    }

    int getUnfilteredChildCount()
    {
        return mCallback.getChildCount();
    }

    void hide(View view)
    {
        int i = mCallback.indexOfChild(view);
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("view is not a child, cannot hide ").append(view).toString());
        } else
        {
            mBucket.set(i);
            hideViewInternal(view);
            return;
        }
    }

    int indexOfChild(View view)
    {
        int i;
        for (i = mCallback.indexOfChild(view); i == -1 || mBucket.get(i);)
        {
            return -1;
        }

        return i - mBucket.countOnesBefore(i);
    }

    boolean isHidden(View view)
    {
        return mHiddenViews.contains(view);
    }

    void removeAllViewsUnfiltered()
    {
        mBucket.reset();
        for (int i = mHiddenViews.size() - 1; i >= 0; i--)
        {
            mCallback.onLeftHiddenState((View)mHiddenViews.get(i));
            mHiddenViews.remove(i);
        }

        mCallback.removeAllViews();
    }

    void removeView(View view)
    {
        int i = mCallback.indexOfChild(view);
        if (i < 0)
        {
            return;
        }
        if (mBucket.remove(i))
        {
            unhideViewInternal(view);
        }
        mCallback.removeViewAt(i);
    }

    void removeViewAt(int i)
    {
        i = getOffset(i);
        View view = mCallback.getChildAt(i);
        if (view == null)
        {
            return;
        }
        if (mBucket.remove(i))
        {
            unhideViewInternal(view);
        }
        mCallback.removeViewAt(i);
    }

    boolean removeViewIfHidden(View view)
    {
        int i = mCallback.indexOfChild(view);
        if (i == -1)
        {
            if (!unhideViewInternal(view));
            return true;
        }
        if (mBucket.get(i))
        {
            mBucket.remove(i);
            if (unhideViewInternal(view));
            mCallback.removeViewAt(i);
            return true;
        } else
        {
            return false;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append(mBucket.toString()).append(", hidden list:").append(mHiddenViews.size()).toString();
    }

    void unhide(View view)
    {
        int i = mCallback.indexOfChild(view);
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("view is not a child, cannot hide ").append(view).toString());
        }
        if (!mBucket.get(i))
        {
            throw new RuntimeException((new StringBuilder()).append("trying to unhide a view that was not hidden").append(view).toString());
        } else
        {
            mBucket.clear(i);
            unhideViewInternal(view);
            return;
        }
    }
}
