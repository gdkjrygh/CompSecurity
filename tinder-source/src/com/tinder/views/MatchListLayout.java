// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tinder.events.match.EventMatchHeaderSizeChanged;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.utils.v;
import de.greenrobot.event.c;
import java.text.NumberFormat;

// Referenced classes of package com.tinder.views:
//            RelativeLayoutInterceptor

public class MatchListLayout extends FrameLayout
{
    private class ScrollListener extends android.support.v7.widget.RecyclerView.OnScrollListener
    {

        private boolean onScreen;
        private int scrollAmount;
        final MatchListLayout this$0;

        public void onScrolled(RecyclerView recyclerview, int i, int j)
        {
            int k;
            int l;
            super.onScrolled(recyclerview, i, j);
            k = mHeaderHeight;
            l = ((LinearLayoutManager)recyclerview.getLayoutManager()).findFirstCompletelyVisibleItemPosition();
            if (l >= -1 && l <= 1)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i == 0) goto _L2; else goto _L1
_L1:
            if (!onScreen && j < 0)
            {
                scrollAmount = k;
            }
            (new StringBuilder("On Screen! Position = ")).append(l).append(", scrollAmount = ").append(scrollAmount);
            onScreen = true;
            scrollAmount = scrollAmount + j;
_L10:
            if (scrollAmount < 0)
            {
                scrollAmount = 0;
            }
            if ((!onScreen || l != 1) && l != -1) goto _L4; else goto _L3
_L3:
            if (scrollAmount < 0) goto _L6; else goto _L5
_L5:
            mHeader.setTranslationY(-scrollAmount);
_L8:
            return;
_L2:
            if (onScreen)
            {
                (new StringBuilder("Off Screen! Position = ")).append(l).append(", scrollAmount = ").append(scrollAmount);
                onScreen = false;
                mHeader.setTranslationY(-k);
            }
            continue; /* Loop/switch isn't completed */
_L6:
            scrollAmount = 0;
            mHeader.setTranslationY(0.0F);
            return;
_L4:
            if (l != 0) goto _L8; else goto _L7
_L7:
            scrollAmount = 0;
            mHeader.setTranslationY(0.0F);
            return;
            if (true) goto _L10; else goto _L9
_L9:
        }

        public void setScrollAmount(int i)
        {
            scrollAmount = i;
            mHeader.setTranslationY(-scrollAmount);
        }

        private ScrollListener()
        {
            this$0 = MatchListLayout.this;
            super();
            onScreen = true;
            scrollAmount = 0;
        }

    }


    private boolean isAnimatingCounters;
    private boolean isClosed;
    private boolean isClosing;
    private boolean isOpening;
    private boolean isShowingEmptyView;
    private boolean isShowingMoments;
    private View mEmpty;
    c mEventBus;
    private RelativeLayoutInterceptor mHeader;
    private int mHeaderHeight;
    private RecyclerView mMatchList;
    private TextView mMessageCount;
    private TextView mNewCount;
    private RecyclerView mNewMatchList;
    private int mScreenHeight;
    private ScrollListener mScrollListener;

    public MatchListLayout(Context context)
    {
        super(context);
        mHeaderHeight = 0;
        isAnimatingCounters = false;
        isClosed = false;
        isClosing = false;
        isOpening = false;
        isShowingEmptyView = false;
        isShowingMoments = true;
        init();
    }

    public MatchListLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mHeaderHeight = 0;
        isAnimatingCounters = false;
        isClosed = false;
        isClosing = false;
        isOpening = false;
        isShowingEmptyView = false;
        isShowingMoments = true;
        init();
    }

    public MatchListLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mHeaderHeight = 0;
        isAnimatingCounters = false;
        isClosed = false;
        isClosing = false;
        isOpening = false;
        isShowingEmptyView = false;
        isShowingMoments = true;
        init();
    }

    public MatchListLayout(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
        mHeaderHeight = 0;
        isAnimatingCounters = false;
        isClosed = false;
        isClosing = false;
        isOpening = false;
        isShowingEmptyView = false;
        isShowingMoments = true;
        init();
    }

    private void init()
    {
        inflate(getContext(), 0x7f030042, this);
        ManagerApp.h().a(this);
        mScreenHeight = getContext().getResources().getDisplayMetrics().heightPixels;
        mMatchList = (RecyclerView)findViewById(0x7f0e0116);
        mNewMatchList = (RecyclerView)findViewById(0x7f0e011e);
        mHeader = (RelativeLayoutInterceptor)findViewById(0x7f0e0117);
        mEmpty = findViewById(0x7f0e0123);
        mMessageCount = (TextView)findViewById(0x7f0e0122);
        mNewCount = (TextView)findViewById(0x7f0e011d);
        mScrollListener = new ScrollListener();
        mMatchList.addOnScrollListener(mScrollListener);
        mHeader.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() {

            final MatchListLayout this$0;

            public void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
                    int k1, int l1)
            {
                android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
                i = view.getMeasuredHeight();
                j = layoutparams.topMargin;
                i = layoutparams.bottomMargin + (i + j);
                if (mHeaderHeight != i)
                {
                    mHeaderHeight = i;
                    view = (android.widget.FrameLayout.LayoutParams)mEmpty.getLayoutParams();
                    view.topMargin = mHeaderHeight;
                    mEmpty.setLayoutParams(view);
                    view = mMatchList.findViewHolderForAdapterPosition(0);
                    Animation animation = view. new Animation() {

                        final _cls1 this$1;
                        final android.support.v7.widget.RecyclerView.ViewHolder val$rowZero;

                        protected void applyTransformation(float f, Transformation transformation)
                        {
                            transformation = rowZero.itemView;
                            android.view.ViewGroup.LayoutParams layoutparams = transformation.getLayoutParams();
                            int i;
                            if (f == 1.0F)
                            {
                                i = mHeaderHeight;
                            } else
                            {
                                i = (int)((float)mHeaderHeight * f);
                            }
                            layoutparams.height = i;
                            transformation.requestLayout();
                        }

                        public boolean willChangeBounds()
                        {
                            return true;
                        }

            
            {
                this$1 = final__pcls1;
                rowZero = android.support.v7.widget.RecyclerView.ViewHolder.this;
                super();
            }
                    };
                    if (view != null && ((android.support.v7.widget.RecyclerView.ViewHolder) (view)).itemView != null)
                    {
                        ((android.support.v7.widget.RecyclerView.ViewHolder) (view)).itemView.startAnimation(animation);
                    }
                    mEventBus.d(new EventMatchHeaderSizeChanged(mHeaderHeight));
                }
            }

            
            {
                this$0 = MatchListLayout.this;
                super();
            }
        });
        mHeader.setMotionEventListener(new RelativeLayoutInterceptor.MotionEventListener() {

            float firstY;
            boolean isScrolling;
            float lastY;
            int mTouchSlop;
            int pointerId;
            final MatchListLayout this$0;
            ViewConfiguration vc;

            public boolean onMotionEventIntercepted(MotionEvent motionevent)
            {
                motionevent.getActionMasked();
                JVM INSTR tableswitch 0 3: default 36
            //                           0 38
            //                           1 116
            //                           2 57
            //                           3 135;
                   goto _L1 _L2 _L3 _L4 _L5
_L1:
                return false;
_L2:
                firstY = motionevent.getRawY();
                lastY = motionevent.getRawY();
                continue; /* Loop/switch isn't completed */
_L4:
                int i = (int)(lastY - motionevent.getRawY());
                lastY = motionevent.getRawY();
                if (Math.abs(firstY - motionevent.getRawY()) > (float)mTouchSlop)
                {
                    isScrolling = true;
                    mMatchList.scrollBy(0, i);
                    return true;
                }
                continue; /* Loop/switch isn't completed */
_L3:
                isScrolling = false;
                pointerId = -1;
                lastY = -1F;
                continue; /* Loop/switch isn't completed */
_L5:
                isScrolling = false;
                pointerId = -1;
                lastY = -1F;
                if (true) goto _L1; else goto _L6
_L6:
            }

            
            {
                this$0 = MatchListLayout.this;
                super();
                isScrolling = false;
                vc = ViewConfiguration.get(getContext());
                mTouchSlop = vc.getScaledTouchSlop();
            }
        });
    }

    public RelativeLayout getHeader()
    {
        return mHeader;
    }

    public RecyclerView getMatchList()
    {
        return mMatchList;
    }

    public int getMaximumRequiredTopPadding()
    {
        (new StringBuilder("Not closed or closing, required top padding is header height: ")).append(mHeaderHeight);
        return mHeaderHeight;
    }

    public RecyclerView getNewMatchList()
    {
        return mNewMatchList;
    }

    public void hideCounters()
    {
        while (isAnimatingCounters || mNewCount.getAlpha() == 0.0F || mMessageCount.getAlpha() == 0.0F) 
        {
            return;
        }
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.playTogether(new Animator[] {
            ObjectAnimator.ofFloat(mNewCount, "alpha", new float[] {
                1.0F, 0.0F
            }), ObjectAnimator.ofFloat(mMessageCount, "alpha", new float[] {
                1.0F, 0.0F
            })
        });
        animatorset.addListener(new AnimatorListenerAdapter() {

            final MatchListLayout this$0;

            public void onAnimationEnd(Animator animator)
            {
                isAnimatingCounters = false;
            }

            public void onAnimationStart(Animator animator)
            {
                isAnimatingCounters = true;
            }

            
            {
                this$0 = MatchListLayout.this;
                super();
            }
        });
        animatorset.start();
    }

    public void hideEmptyView()
    {
        if (mMatchList.getVisibility() == 0)
        {
            v.a("Trying to hide empty view while RecyclerView is visible.");
        }
        if (mEmpty.getVisibility() != 0)
        {
            v.a("Trying to hide empty view while Empty View is not visbile");
        }
        if (!isShowingEmptyView)
        {
            v.b("Cannot hide empty view, it is not showing.");
            return;
        } else
        {
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(mMatchList, "alpha", new float[] {
                0.0F, 1.0F
            });
            ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(mEmpty, "alpha", new float[] {
                1.0F, 0.0F
            });
            AnimatorSet animatorset = new AnimatorSet();
            animatorset.playTogether(new Animator[] {
                objectanimator, objectanimator1
            });
            animatorset.addListener(new AnimatorListenerAdapter() {

                final MatchListLayout this$0;

                public void onAnimationEnd(Animator animator)
                {
                    mEmpty.setVisibility(8);
                    isShowingEmptyView = false;
                }

                public void onAnimationStart(Animator animator)
                {
                    mMatchList.setVisibility(0);
                    mEmpty.setVisibility(0);
                }

            
            {
                this$0 = MatchListLayout.this;
                super();
            }
            });
            animatorset.start();
            return;
        }
    }

    public void hideHeader()
    {
        if (isClosing)
        {
            v.b("Already closing the header, not doing it again.");
            return;
        }
        int j = mHeader.getChildCount();
        for (int i = 0; i < j; i++)
        {
            View view = mHeader.getChildAt(i);
            if (view.getId() != 0x7f0e0120)
            {
                view.setVisibility(8);
            }
        }

        isClosing = false;
        isClosed = true;
    }

    public boolean isHeaderVisible()
    {
        return !isClosed;
    }

    public boolean isHidingHeader()
    {
        return isClosing;
    }

    public boolean isOpeningHeader()
    {
        return isOpening;
    }

    public boolean isShowingEmptyView()
    {
        return isShowingEmptyView;
    }

    public void resetHeaderTranslation()
    {
        mScrollListener.setScrollAmount(0);
    }

    public void scrollToBeginningOfNewMatchList()
    {
        if (mNewMatchList.getLayoutManager() == null)
        {
            v.b("Cannot scroll new match list, no layout manager set.");
            return;
        } else
        {
            mNewMatchList.getLayoutManager().scrollToPosition(0);
            return;
        }
    }

    public void scrollToTopOfMatchList()
    {
        if (mMatchList.getLayoutManager() == null)
        {
            v.b("Cannot scroll match list, no layout manager set.");
            return;
        }
        if (isHeaderVisible())
        {
            resetHeaderTranslation();
        }
        mMatchList.getLayoutManager().scrollToPosition(0);
    }

    public void setMatchMessageCount(long l)
    {
        if (l > 0L)
        {
            NumberFormat numberformat = NumberFormat.getIntegerInstance();
            mMessageCount.setText(numberformat.format(l));
            mMessageCount.setVisibility(0);
            return;
        } else
        {
            mMessageCount.setVisibility(8);
            return;
        }
    }

    public void setNewMatchCount(long l)
    {
        if (l > 0L)
        {
            NumberFormat numberformat = NumberFormat.getIntegerInstance();
            mNewCount.setText(numberformat.format(l));
            mNewCount.setVisibility(0);
            return;
        } else
        {
            mNewCount.setVisibility(8);
            return;
        }
    }

    public void setShowingMoments(boolean flag)
    {
        int i;
        boolean flag1 = false;
        View view;
        int j;
        if (flag != isShowingMoments)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        isShowingMoments = flag;
        if (i == 0) goto _L2; else goto _L1
_L1:
        j = mHeader.getChildCount();
        i = 0;
_L7:
        if (i >= j) goto _L2; else goto _L3
_L3:
        view = mHeader.getChildAt(i);
        if (view.getId() != 0x7f0e0118) goto _L5; else goto _L4
_L4:
        if (isShowingMoments)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
_L2:
        return;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void showCounters()
    {
        while (isAnimatingCounters || mNewCount.getAlpha() == 1.0F || mMessageCount.getAlpha() == 1.0F) 
        {
            return;
        }
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.playTogether(new Animator[] {
            ObjectAnimator.ofFloat(mNewCount, "alpha", new float[] {
                0.0F, 1.0F
            }), ObjectAnimator.ofFloat(mMessageCount, "alpha", new float[] {
                0.0F, 1.0F
            })
        });
        animatorset.addListener(new AnimatorListenerAdapter() {

            final MatchListLayout this$0;

            public void onAnimationEnd(Animator animator)
            {
                isAnimatingCounters = false;
            }

            public void onAnimationStart(Animator animator)
            {
                isAnimatingCounters = true;
            }

            
            {
                this$0 = MatchListLayout.this;
                super();
            }
        });
        animatorset.start();
    }

    public void showEmptyView()
    {
        if (mMatchList.getVisibility() != 0)
        {
            v.a("Trying to show empty view while RecyclerView is not visible.");
        }
        if (mEmpty.getVisibility() != 8)
        {
            v.a("Trying to show empty view while Empty View is not gone");
        }
        if (isShowingEmptyView)
        {
            v.b("Cannot show empty view, it is already showing.");
            return;
        } else
        {
            mMatchList.setVisibility(8);
            mEmpty.setVisibility(0);
            ObjectAnimator objectanimator = ObjectAnimator.ofFloat(mMatchList, "alpha", new float[] {
                1.0F, 0.0F
            });
            ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(mEmpty, "alpha", new float[] {
                0.0F, 1.0F
            });
            AnimatorSet animatorset = new AnimatorSet();
            animatorset.playTogether(new Animator[] {
                objectanimator, objectanimator1
            });
            animatorset.addListener(new AnimatorListenerAdapter() {

                final MatchListLayout this$0;

                public void onAnimationEnd(Animator animator)
                {
                    mMatchList.setVisibility(8);
                }

                public void onAnimationStart(Animator animator)
                {
                    mEmpty.setVisibility(0);
                    isShowingEmptyView = true;
                }

            
            {
                this$0 = MatchListLayout.this;
                super();
            }
            });
            animatorset.start();
            return;
        }
    }

    public void showHeader()
    {
        if (isOpening)
        {
            v.b("Already showing the header, not doing it again.");
        } else
        if (isClosed)
        {
            int k = mHeader.getChildCount();
            int i = 0;
            while (i < k) 
            {
                View view = mHeader.getChildAt(i);
                if (view.getId() == 0x7f0e0118)
                {
                    int j;
                    if (isShowingMoments)
                    {
                        j = 0;
                    } else
                    {
                        j = 8;
                    }
                    view.setVisibility(j);
                } else
                {
                    view.setVisibility(0);
                }
                i++;
            }
            scrollToTopOfMatchList();
            isClosed = false;
            return;
        }
    }



/*
    static int access$002(MatchListLayout matchlistlayout, int i)
    {
        matchlistlayout.mHeaderHeight = i;
        return i;
    }

*/





/*
    static boolean access$502(MatchListLayout matchlistlayout, boolean flag)
    {
        matchlistlayout.isShowingEmptyView = flag;
        return flag;
    }

*/


/*
    static boolean access$602(MatchListLayout matchlistlayout, boolean flag)
    {
        matchlistlayout.isAnimatingCounters = flag;
        return flag;
    }

*/
}
