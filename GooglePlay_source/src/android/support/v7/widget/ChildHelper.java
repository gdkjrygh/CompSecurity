// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

public final class ChildHelper
{
    static final class Bucket
    {

        long mData;
        Bucket next;

        private void clear(int i)
        {
label0:
            {
                Bucket bucket = this;
                for (; i >= 64; i -= 64)
                {
                    if (bucket.next == null)
                    {
                        break label0;
                    }
                    bucket = bucket.next;
                }

                bucket.mData = bucket.mData & ~(1L << i);
            }
        }

        private void ensureNext()
        {
            if (next == null)
            {
                next = new Bucket();
            }
        }

        final int countOnesBefore(int i)
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

        final boolean get(int i)
        {
            Bucket bucket = this;
            for (; i >= 64; i -= 64)
            {
                bucket.ensureNext();
                bucket = bucket.next;
            }

            return (bucket.mData & 1L << i) != 0L;
        }

        final void insert(int i, boolean flag)
        {
            boolean flag1 = flag;
            Bucket bucket = this;
            do
            {
                for (; i >= 64; i -= 64)
                {
                    bucket.ensureNext();
                    bucket = bucket.next;
                }

                long l;
                if ((bucket.mData & 0x8000000000000000L) != 0L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                l = (1L << i) - 1L;
                bucket.mData = bucket.mData & l | (bucket.mData & (-1L ^ l)) << 1;
                if (flag1)
                {
                    bucket.set(i);
                } else
                {
                    bucket.clear(i);
                }
                if (flag || bucket.next != null)
                {
                    bucket.ensureNext();
                    bucket = bucket.next;
                    i = 0;
                    flag1 = flag;
                } else
                {
                    return;
                }
            } while (true);
        }

        final boolean remove(int i)
        {
            Bucket bucket = this;
            for (; i >= 64; i -= 64)
            {
                bucket.ensureNext();
                bucket = bucket.next;
            }

            long l = 1L << i;
            boolean flag;
            if ((bucket.mData & l) != 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            bucket.mData = bucket.mData & (-1L ^ l);
            l--;
            bucket.mData = bucket.mData & l | Long.rotateRight(bucket.mData & (-1L ^ l), 1);
            if (bucket.next != null)
            {
                if (bucket.next.get(0))
                {
                    bucket.set(63);
                }
                bucket.next.remove(0);
            }
            return flag;
        }

        final void set(int i)
        {
            Bucket bucket = this;
            for (; i >= 64; i -= 64)
            {
                bucket.ensureNext();
                bucket = bucket.next;
            }

            bucket.mData = bucket.mData | 1L << i;
        }

        public final String toString()
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

        public abstract void removeAllViews();

        public abstract void removeViewAt(int i);
    }


    final Bucket mBucket = new Bucket();
    final Callback mCallback;
    final List mHiddenViews = new ArrayList();

    ChildHelper(Callback callback)
    {
        mCallback = callback;
    }

    final void addView(View view, int i, boolean flag)
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
            mHiddenViews.add(view);
        }
        mCallback.addView(view, i);
    }

    final void attachViewToParent(View view, int i, android.view.ViewGroup.LayoutParams layoutparams, boolean flag)
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
            mHiddenViews.add(view);
        }
        mCallback.attachViewToParent(view, i, layoutparams);
    }

    final View getChildAt(int i)
    {
        i = getOffset(i);
        return mCallback.getChildAt(i);
    }

    final int getChildCount()
    {
        return mCallback.getChildCount() - mHiddenViews.size();
    }

    final int getOffset(int i)
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

    public final View getUnfilteredChildAt(int i)
    {
        return mCallback.getChildAt(i);
    }

    public final int getUnfilteredChildCount()
    {
        return mCallback.getChildCount();
    }

    public final int indexOfChild(View view)
    {
        int i;
        for (i = mCallback.indexOfChild(view); i == -1 || mBucket.get(i);)
        {
            return -1;
        }

        return i - mBucket.countOnesBefore(i);
    }

    final boolean isHidden(View view)
    {
        return mHiddenViews.contains(view);
    }

    public final String toString()
    {
        return (new StringBuilder()).append(mBucket.toString()).append(", hidden list:").append(mHiddenViews.size()).toString();
    }
}
