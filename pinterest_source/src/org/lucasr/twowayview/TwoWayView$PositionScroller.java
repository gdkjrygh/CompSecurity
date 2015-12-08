// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.lucasr.twowayview;

import android.support.v4.view.ViewCompat;
import android.util.Log;
import android.view.ViewConfiguration;

// Referenced classes of package org.lucasr.twowayview:
//            TwoWayView

class Length
    implements Runnable
{

    private static final int MOVE_AFTER_BOUND = 3;
    private static final int MOVE_AFTER_POS = 1;
    private static final int MOVE_BEFORE_BOUND = 4;
    private static final int MOVE_BEFORE_POS = 2;
    private static final int MOVE_OFFSET = 5;
    private static final int SCROLL_DURATION = 200;
    private int mBoundPosition;
    private final int mExtraScroll;
    private int mLastSeenPosition;
    private int mMode;
    private int mOffsetFromStart;
    private int mScrollDuration;
    private int mTargetPosition;
    final TwoWayView this$0;

    public void run()
    {
        int i;
        int i1;
        int j2;
        int k2;
        k2 = TwoWayView.access$4700(TwoWayView.this);
        j2 = TwoWayView.access$3300(TwoWayView.this);
        if (TwoWayView.access$4800(TwoWayView.this))
        {
            i1 = getPaddingTop();
        } else
        {
            i1 = getPaddingLeft();
        }
        if (TwoWayView.access$4800(TwoWayView.this))
        {
            i = getPaddingBottom();
        } else
        {
            i = getPaddingRight();
        }
        mMode;
        JVM INSTR tableswitch 1 5: default 92
    //                   1 116
    //                   2 429
    //                   3 260
    //                   4 527
    //                   5 685;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return;
_L2:
        if ((i1 = getChildCount() - 1) >= 0)
        {
            j2 += i1;
            if (j2 == mLastSeenPosition)
            {
                ViewCompat.postOnAnimation(TwoWayView.this, this);
                return;
            }
            android.view.View view = getChildAt(i1);
            int i3 = TwoWayView.access$4900(TwoWayView.this, view);
            int l3 = TwoWayView.access$4400(TwoWayView.this, view);
            i1 = i;
            if (j2 < TwoWayView.access$1800(TwoWayView.this) - 1)
            {
                i1 = Math.max(i, mExtraScroll);
            }
            smoothScrollBy((i3 - (k2 - l3)) + i1, mScrollDuration);
            mLastSeenPosition = j2;
            if (j2 < mTargetPosition)
            {
                ViewCompat.postOnAnimation(TwoWayView.this, this);
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = getChildCount();
        if (j2 != mBoundPosition && i1 > 1 && i1 + j2 < TwoWayView.access$1800(TwoWayView.this))
        {
            i1 = j2 + 1;
            if (i1 == mLastSeenPosition)
            {
                ViewCompat.postOnAnimation(TwoWayView.this, this);
                return;
            }
            android.view.View view1 = getChildAt(1);
            j2 = TwoWayView.access$4900(TwoWayView.this, view1);
            k2 = TwoWayView.access$4400(TwoWayView.this, view1);
            i = Math.max(i, mExtraScroll);
            if (i1 < mBoundPosition)
            {
                smoothScrollBy(Math.max(0, (k2 + j2) - i), mScrollDuration);
                mLastSeenPosition = i1;
                ViewCompat.postOnAnimation(TwoWayView.this, this);
                return;
            }
            if (j2 > i)
            {
                smoothScrollBy(j2 - i, mScrollDuration);
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (j2 == mLastSeenPosition)
        {
            ViewCompat.postOnAnimation(TwoWayView.this, this);
            return;
        }
        android.view.View view2 = getChildAt(0);
        if (view2 != null)
        {
            k2 = TwoWayView.access$4400(TwoWayView.this, view2);
            int j = i1;
            if (j2 > 0)
            {
                j = Math.max(mExtraScroll, i1);
            }
            smoothScrollBy(k2 - j, mScrollDuration);
            mLastSeenPosition = j2;
            if (j2 > mTargetPosition)
            {
                ViewCompat.postOnAnimation(TwoWayView.this, this);
                return;
            }
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        int j3 = getChildCount() - 2;
        if (j3 >= 0)
        {
            int k = j2 + j3;
            if (k == mLastSeenPosition)
            {
                ViewCompat.postOnAnimation(TwoWayView.this, this);
                return;
            }
            android.view.View view3 = getChildAt(j3);
            j2 = TwoWayView.access$4900(TwoWayView.this, view3);
            j3 = TwoWayView.access$4400(TwoWayView.this, view3);
            i1 = Math.max(i1, mExtraScroll);
            mLastSeenPosition = k;
            if (k > mBoundPosition)
            {
                smoothScrollBy(-(k2 - j3 - i1), mScrollDuration);
                ViewCompat.postOnAnimation(TwoWayView.this, this);
                return;
            }
            k = k2 - i1;
            i1 = j3 + j2;
            if (k > i1)
            {
                smoothScrollBy(-(k - i1), mScrollDuration);
                return;
            }
        }
        if (true) goto _L1; else goto _L6
_L6:
        if (mLastSeenPosition == j2)
        {
            ViewCompat.postOnAnimation(TwoWayView.this, this);
            return;
        }
        mLastSeenPosition = j2;
        int j1 = getChildCount();
        int l2 = mTargetPosition;
        int k3 = (j2 + j1) - 1;
        float f;
        int l;
        if (l2 < j2)
        {
            l = (j2 - l2) + 1;
        } else
        if (l2 > k3)
        {
            l = l2 - k3;
        } else
        {
            l = 0;
        }
        f = Math.min(Math.abs((float)l / (float)j1), 1.0F);
        if (l2 < j2)
        {
            l = (int)((float)(-TwoWayView.access$5000(TwoWayView.this)) * f);
            int k1 = (int)(f * (float)mScrollDuration);
            smoothScrollBy(l, k1);
            ViewCompat.postOnAnimation(TwoWayView.this, this);
            return;
        }
        if (l2 > k3)
        {
            l = (int)((float)TwoWayView.access$5000(TwoWayView.this) * f);
            int l1 = (int)(f * (float)mScrollDuration);
            smoothScrollBy(l, l1);
            ViewCompat.postOnAnimation(TwoWayView.this, this);
            return;
        } else
        {
            android.view.View view4 = getChildAt(l2 - j2);
            l = TwoWayView.access$4400(TwoWayView.this, view4) - mOffsetFromStart;
            int i2 = (int)((float)mScrollDuration * ((float)Math.abs(l) / (float)TwoWayView.access$5000(TwoWayView.this)));
            smoothScrollBy(l, i2);
            return;
        }
    }

    void scrollToVisible(int i, int j, int k)
    {
        int l;
        int i1;
        int j1;
        int k1;
label0:
        {
            l = getChildCount();
            k1 = TwoWayView.access$3300(TwoWayView.this);
            int l1 = (l + k1) - 1;
            i1 = TwoWayView.access$4300(TwoWayView.this);
            j1 = TwoWayView.access$4500(TwoWayView.this);
            if (i < k1 || i > l1)
            {
                Log.w("TwoWayView", (new StringBuilder("scrollToVisible called with targetPosition ")).append(i).append(" not visible [").append(k1).append(", ").append(l1).append("]").toString());
            }
            if (j >= k1)
            {
                l = j;
                if (j <= l1)
                {
                    break label0;
                }
            }
            l = -1;
        }
        android.view.View view = getChildAt(i - k1);
        j = TwoWayView.access$4400(TwoWayView.this, view);
        i = TwoWayView.access$4600(TwoWayView.this, view);
        if (i > j1)
        {
            i -= j1;
        } else
        {
            i = 0;
        }
        if (j < i1)
        {
            i = j - i1;
        }
        if (i == 0)
        {
            return;
        }
        j = i;
        if (l < 0) goto _L2; else goto _L1
_L1:
        view = getChildAt(l - k1);
        l = TwoWayView.access$4400(TwoWayView.this, view);
        j = TwoWayView.access$4600(TwoWayView.this, view);
        k1 = Math.abs(i);
        if (i >= 0 || j + k1 <= j1) goto _L4; else goto _L3
_L3:
        j = Math.max(0, j - j1);
_L2:
        smoothScrollBy(j, k);
        return;
_L4:
        j = i;
        if (i > 0)
        {
            j = i;
            if (l - k1 < i1)
            {
                j = Math.min(0, l - i1);
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    void start(final int position)
    {
        stop();
        class _cls1
            implements Runnable
        {

            final TwoWayView.PositionScroller this$1;
            final int val$position;

            public void run()
            {
                start(position);
            }

            _cls1()
            {
                this$1 = TwoWayView.PositionScroller.this;
                position = i;
                super();
            }
        }

        if (TwoWayView.access$500(TwoWayView.this))
        {
            TwoWayView.access$4202(TwoWayView.this, new _cls1());
        } else
        {
            int i = getChildCount();
            if (i != 0)
            {
                int j = TwoWayView.access$3300(TwoWayView.this);
                int k = (i + j) - 1;
                i = Math.max(0, Math.min(getCount() - 1, position));
                if (i < j)
                {
                    position = (j - i) + 1;
                    mMode = 2;
                } else
                if (i > k)
                {
                    position = (i - k) + 1;
                    mMode = 1;
                } else
                {
                    scrollToVisible(i, -1, 200);
                    return;
                }
                if (position > 0)
                {
                    mScrollDuration = 200 / position;
                } else
                {
                    mScrollDuration = 200;
                }
                mTargetPosition = i;
                mBoundPosition = -1;
                mLastSeenPosition = -1;
                ViewCompat.postOnAnimation(TwoWayView.this, this);
                return;
            }
        }
    }

    void start(final int position, final int boundPosition)
    {
        stop();
        if (boundPosition != -1) goto _L2; else goto _L1
_L1:
        start(position);
_L4:
        return;
_L2:
        int j;
        if (TwoWayView.access$500(TwoWayView.this))
        {
            class _cls2
                implements Runnable
            {

                final TwoWayView.PositionScroller this$1;
                final int val$boundPosition;
                final int val$position;

                public void run()
                {
                    start(position, boundPosition);
                }

            _cls2()
            {
                this$1 = TwoWayView.PositionScroller.this;
                position = i;
                boundPosition = j;
                super();
            }
            }

            TwoWayView.access$4202(TwoWayView.this, new _cls2());
            return;
        }
        j = getChildCount();
        if (j == 0) goto _L4; else goto _L3
_L3:
        int i;
        int k;
        i = TwoWayView.access$3300(TwoWayView.this);
        k = (j + i) - 1;
        j = Math.max(0, Math.min(getCount() - 1, position));
        if (j >= i) goto _L6; else goto _L5
_L5:
        k -= boundPosition;
        if (k <= 0) goto _L4; else goto _L7
_L7:
        position = (i - j) + 1;
        i = k - 1;
        if (i < position)
        {
            mMode = 4;
            position = i;
        } else
        {
            mMode = 2;
        }
_L9:
        if (position > 0)
        {
            mScrollDuration = 200 / position;
        } else
        {
            mScrollDuration = 200;
        }
        mTargetPosition = j;
        mBoundPosition = boundPosition;
        mLastSeenPosition = -1;
        ViewCompat.postOnAnimation(TwoWayView.this, this);
        return;
_L6:
        if (j <= k)
        {
            break MISSING_BLOCK_LABEL_230;
        }
        i = boundPosition - i;
        if (i <= 0) goto _L4; else goto _L8
_L8:
        position = (j - k) + 1;
        i--;
        if (i < position)
        {
            mMode = 3;
            position = i;
        } else
        {
            mMode = 1;
        }
          goto _L9
        scrollToVisible(j, boundPosition, 200);
        return;
    }

    void startWithOffset(int i, int j)
    {
        startWithOffset(i, j, 200);
    }

    void startWithOffset(final int position, final int postOffset, final int duration)
    {
        stop();
        class _cls3
            implements Runnable
        {

            final TwoWayView.PositionScroller this$1;
            final int val$duration;
            final int val$position;
            final int val$postOffset;

            public void run()
            {
                startWithOffset(position, postOffset, duration);
            }

            _cls3()
            {
                this$1 = TwoWayView.PositionScroller.this;
                position = i;
                postOffset = j;
                duration = k;
                super();
            }
        }

        if (TwoWayView.access$500(TwoWayView.this))
        {
            TwoWayView.access$4202(TwoWayView.this, new _cls3());
        } else
        {
            int i = getChildCount();
            if (i != 0)
            {
                postOffset = TwoWayView.access$4300(TwoWayView.this) + postOffset;
                mTargetPosition = Math.max(0, Math.min(getCount() - 1, position));
                mOffsetFromStart = postOffset;
                mBoundPosition = -1;
                mLastSeenPosition = -1;
                mMode = 5;
                position = TwoWayView.access$3300(TwoWayView.this);
                int j = (position + i) - 1;
                float f;
                if (mTargetPosition < position)
                {
                    position -= mTargetPosition;
                } else
                if (mTargetPosition > j)
                {
                    position = mTargetPosition - j;
                } else
                {
                    android.view.View view = getChildAt(mTargetPosition - position);
                    position = TwoWayView.access$4400(TwoWayView.this, view);
                    smoothScrollBy(position - postOffset, duration);
                    return;
                }
                f = (float)position / (float)i;
                if (f >= 1.0F)
                {
                    duration = (int)((float)duration / f);
                }
                mScrollDuration = duration;
                mLastSeenPosition = -1;
                ViewCompat.postOnAnimation(TwoWayView.this, this);
                return;
            }
        }
    }

    void stop()
    {
        removeCallbacks(this);
    }

    _cls3()
    {
        this$0 = TwoWayView.this;
        super();
        mExtraScroll = ViewConfiguration.get(TwoWayView.access$4100(TwoWayView.this)).getScaledFadingEdgeLength();
    }
}
