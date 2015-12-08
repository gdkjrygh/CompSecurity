// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.support.v4.widget.ScrollerCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//            ViewUtils, ViewOffsetBehavior, AnimationUtils, ValueAnimatorCompat, 
//            CoordinatorLayout, MathUtils

public class AppBarLayout extends LinearLayout
{
    public static class Behavior extends ViewOffsetBehavior
    {

        private static final int INVALID_POSITION = -1;
        private ValueAnimatorCompat mAnimator;
        private Runnable mFlingRunnable;
        private int mOffsetDelta;
        private int mOffsetToChildIndexOnLayout;
        private boolean mOffsetToChildIndexOnLayoutIsMinHeight;
        private float mOffsetToChildIndexOnLayoutPerc;
        private ScrollerCompat mScroller;
        private boolean mSkipNestedPreScroll;

        private void animateOffsetTo(final CoordinatorLayout coordinatorLayout, AppBarLayout appbarlayout, int i)
        {
            if (mAnimator == null)
            {
                mAnimator = ViewUtils.createAnimator();
                mAnimator.setInterpolator(AnimationUtils.DECELERATE_INTERPOLATOR);
                mAnimator.setUpdateListener(appbarlayout. new ValueAnimatorCompat.AnimatorUpdateListener() {

                    final Behavior this$0;
                    final AppBarLayout val$child;
                    final CoordinatorLayout val$coordinatorLayout;

                    public void onAnimationUpdate(ValueAnimatorCompat valueanimatorcompat)
                    {
                        setAppBarTopBottomOffset(coordinatorLayout, child, valueanimatorcompat.getAnimatedIntValue());
                    }

            
            {
                this$0 = final_behavior;
                coordinatorLayout = coordinatorlayout;
                child = AppBarLayout.this;
                super();
            }
                });
            } else
            {
                mAnimator.cancel();
            }
            mAnimator.setIntValues(getTopBottomOffsetForScrollingSibling(), i);
            mAnimator.start();
        }

        private void dispatchOffsetUpdates(AppBarLayout appbarlayout)
        {
            List list = appbarlayout.mListeners;
            int i = 0;
            int j = list.size();
            while (i < j) 
            {
                Object obj = (WeakReference)list.get(i);
                if (obj != null)
                {
                    obj = (OnOffsetChangedListener)((WeakReference) (obj)).get();
                } else
                {
                    obj = null;
                }
                if (obj != null)
                {
                    ((OnOffsetChangedListener) (obj)).onOffsetChanged(appbarlayout, getTopAndBottomOffset());
                }
                i++;
            }
        }

        private boolean fling(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int j, float f)
        {
            if (mFlingRunnable != null)
            {
                appbarlayout.removeCallbacks(mFlingRunnable);
            }
            if (mScroller == null)
            {
                mScroller = ScrollerCompat.create(appbarlayout.getContext());
            }
            mScroller.fling(0, getTopBottomOffsetForScrollingSibling(), 0, Math.round(f), 0, 0, i, j);
            if (mScroller.computeScrollOffset())
            {
                mFlingRunnable = new FlingRunnable(coordinatorlayout, appbarlayout);
                ViewCompat.postOnAnimation(appbarlayout, mFlingRunnable);
                return true;
            } else
            {
                mFlingRunnable = null;
                return false;
            }
        }

        private int interpolateOffset(AppBarLayout appbarlayout, int i)
        {
            int l = Math.abs(i);
            int j = 0;
            int i1 = appbarlayout.getChildCount();
            do
            {
label0:
                {
                    int k = i;
                    if (j < i1)
                    {
                        View view = appbarlayout.getChildAt(j);
                        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                        Interpolator interpolator = layoutparams.getScrollInterpolator();
                        if (l < view.getTop() || l > view.getBottom())
                        {
                            break label0;
                        }
                        k = i;
                        if (interpolator != null)
                        {
                            j = 0;
                            int j1 = layoutparams.getScrollFlags();
                            if ((j1 & 1) != 0)
                            {
                                k = 0 + view.getHeight();
                                j = k;
                                if ((j1 & 2) != 0)
                                {
                                    j = k - ViewCompat.getMinimumHeight(view);
                                }
                            }
                            k = i;
                            if (j > 0)
                            {
                                k = view.getTop();
                                j = Math.round((float)j * interpolator.getInterpolation((float)(l - k) / (float)j));
                                k = Integer.signum(i) * (view.getTop() + j);
                            }
                        }
                    }
                    return k;
                }
                j++;
            } while (true);
        }

        private int scroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int j, int k)
        {
            return setAppBarTopBottomOffset(coordinatorlayout, appbarlayout, getTopBottomOffsetForScrollingSibling() - i, j, k);
        }

        public volatile int getLeftAndRightOffset()
        {
            return super.getLeftAndRightOffset();
        }

        public volatile int getTopAndBottomOffset()
        {
            return super.getTopAndBottomOffset();
        }

        final int getTopBottomOffsetForScrollingSibling()
        {
            return getTopAndBottomOffset() + mOffsetDelta;
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i)
        {
            boolean flag = super.onLayoutChild(coordinatorlayout, appbarlayout, i);
            if (mOffsetToChildIndexOnLayout >= 0)
            {
                coordinatorlayout = appbarlayout.getChildAt(mOffsetToChildIndexOnLayout);
                i = -coordinatorlayout.getBottom();
                if (mOffsetToChildIndexOnLayoutIsMinHeight)
                {
                    i += ViewCompat.getMinimumHeight(coordinatorlayout);
                } else
                {
                    i += Math.round((float)coordinatorlayout.getHeight() * mOffsetToChildIndexOnLayoutPerc);
                }
                setTopAndBottomOffset(i);
                mOffsetToChildIndexOnLayout = -1;
            }
            dispatchOffsetUpdates(appbarlayout);
            return flag;
        }

        public volatile boolean onLayoutChild(CoordinatorLayout coordinatorlayout, View view, int i)
        {
            return onLayoutChild(coordinatorlayout, (AppBarLayout)view, i);
        }

        public boolean onNestedFling(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, float f, float f1, boolean flag)
        {
            boolean flag1 = false;
            if (flag) goto _L2; else goto _L1
_L1:
            flag = fling(coordinatorlayout, appbarlayout, -appbarlayout.getTotalScrollRange(), 0, -f1);
_L4:
            return flag;
_L2:
            int i;
            if (f1 >= 0.0F)
            {
                break; /* Loop/switch isn't completed */
            }
            i = -appbarlayout.getTotalScrollRange() + appbarlayout.getDownNestedPreScrollRange();
            flag = flag1;
            if (getTopBottomOffsetForScrollingSibling() > i)
            {
                continue; /* Loop/switch isn't completed */
            }
_L5:
            flag = flag1;
            if (getTopBottomOffsetForScrollingSibling() != i)
            {
                animateOffsetTo(coordinatorlayout, appbarlayout, i);
                return true;
            }
            if (true) goto _L4; else goto _L3
_L3:
            int j = -appbarlayout.getUpNestedPreScrollRange();
            i = j;
            if (getTopBottomOffsetForScrollingSibling() < j)
            {
                return false;
            }
              goto _L5
            if (true) goto _L4; else goto _L6
_L6:
        }

        public volatile boolean onNestedFling(CoordinatorLayout coordinatorlayout, View view, View view1, float f, float f1, boolean flag)
        {
            return onNestedFling(coordinatorlayout, (AppBarLayout)view, view1, f, f1, flag);
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int i, int j, int ai[])
        {
            if (j != 0 && !mSkipNestedPreScroll)
            {
                int k;
                if (j < 0)
                {
                    i = -appbarlayout.getTotalScrollRange();
                    k = i + appbarlayout.getDownNestedPreScrollRange();
                } else
                {
                    i = -appbarlayout.getUpNestedPreScrollRange();
                    k = 0;
                }
                ai[1] = scroll(coordinatorlayout, appbarlayout, j, i, k);
            }
        }

        public volatile void onNestedPreScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int ai[])
        {
            onNestedPreScroll(coordinatorlayout, (AppBarLayout)view, view1, i, j, ai);
        }

        public void onNestedScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, int i, int j, int k, int l)
        {
            if (l < 0)
            {
                scroll(coordinatorlayout, appbarlayout, l, -appbarlayout.getDownNestedScrollRange(), 0);
                mSkipNestedPreScroll = true;
                return;
            } else
            {
                mSkipNestedPreScroll = false;
                return;
            }
        }

        public volatile void onNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int k, int l)
        {
            onNestedScroll(coordinatorlayout, (AppBarLayout)view, view1, i, j, k, l);
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, Parcelable parcelable)
        {
            if (parcelable instanceof SavedState)
            {
                parcelable = (SavedState)parcelable;
                super.onRestoreInstanceState(coordinatorlayout, appbarlayout, parcelable.getSuperState());
                mOffsetToChildIndexOnLayout = ((SavedState) (parcelable)).firstVisibleChildIndex;
                mOffsetToChildIndexOnLayoutPerc = ((SavedState) (parcelable)).firstVisibileChildPercentageShown;
                mOffsetToChildIndexOnLayoutIsMinHeight = ((SavedState) (parcelable)).firstVisibileChildAtMinimumHeight;
                return;
            } else
            {
                super.onRestoreInstanceState(coordinatorlayout, appbarlayout, parcelable);
                mOffsetToChildIndexOnLayout = -1;
                return;
            }
        }

        public volatile void onRestoreInstanceState(CoordinatorLayout coordinatorlayout, View view, Parcelable parcelable)
        {
            onRestoreInstanceState(coordinatorlayout, (AppBarLayout)view, parcelable);
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
        {
            Parcelable parcelable = super.onSaveInstanceState(coordinatorlayout, appbarlayout);
            int j = getTopAndBottomOffset();
            int i = 0;
            for (int k = appbarlayout.getChildCount(); i < k; i++)
            {
                coordinatorlayout = appbarlayout.getChildAt(i);
                int l = coordinatorlayout.getBottom() + j;
                if (coordinatorlayout.getTop() + j <= 0 && l >= 0)
                {
                    appbarlayout = new SavedState(parcelable);
                    appbarlayout.firstVisibleChildIndex = i;
                    boolean flag;
                    if (l == ViewCompat.getMinimumHeight(coordinatorlayout))
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    appbarlayout.firstVisibileChildAtMinimumHeight = flag;
                    appbarlayout.firstVisibileChildPercentageShown = (float)l / (float)coordinatorlayout.getHeight();
                    return appbarlayout;
                }
            }

            return parcelable;
        }

        public volatile Parcelable onSaveInstanceState(CoordinatorLayout coordinatorlayout, View view)
        {
            return onSaveInstanceState(coordinatorlayout, (AppBarLayout)view);
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view, View view1, int i)
        {
            boolean flag;
            if ((i & 2) != 0 && appbarlayout.hasScrollableChildren() && coordinatorlayout.getHeight() - view1.getHeight() <= appbarlayout.getHeight())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && mAnimator != null)
            {
                mAnimator.cancel();
            }
            return flag;
        }

        public volatile boolean onStartNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i)
        {
            return onStartNestedScroll(coordinatorlayout, (AppBarLayout)view, view1, view2, i);
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view)
        {
            mSkipNestedPreScroll = false;
        }

        public volatile void onStopNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1)
        {
            onStopNestedScroll(coordinatorlayout, (AppBarLayout)view, view1);
        }

        final int setAppBarTopBottomOffset(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i)
        {
            return setAppBarTopBottomOffset(coordinatorlayout, appbarlayout, i, 0x80000000, 0x7fffffff);
        }

        final int setAppBarTopBottomOffset(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int j, int k)
        {
            int i1 = getTopBottomOffsetForScrollingSibling();
            boolean flag = false;
            int l = ((flag) ? 1 : 0);
            if (j != 0)
            {
                l = ((flag) ? 1 : 0);
                if (i1 >= j)
                {
                    l = ((flag) ? 1 : 0);
                    if (i1 <= k)
                    {
                        j = MathUtils.constrain(i, j, k);
                        l = ((flag) ? 1 : 0);
                        if (i1 != j)
                        {
                            boolean flag1;
                            if (appbarlayout.hasChildWithInterpolator())
                            {
                                i = interpolateOffset(appbarlayout, j);
                            } else
                            {
                                i = j;
                            }
                            flag1 = setTopAndBottomOffset(i);
                            l = i1 - j;
                            mOffsetDelta = j - i;
                            if (!flag1 && appbarlayout.hasChildWithInterpolator())
                            {
                                coordinatorlayout.dispatchDependentViewsChanged(appbarlayout);
                            }
                            dispatchOffsetUpdates(appbarlayout);
                        }
                    }
                }
            }
            return l;
        }

        public volatile boolean setLeftAndRightOffset(int i)
        {
            return super.setLeftAndRightOffset(i);
        }

        public volatile boolean setTopAndBottomOffset(int i)
        {
            return super.setTopAndBottomOffset(i);
        }


        public Behavior()
        {
            mOffsetToChildIndexOnLayout = -1;
        }

        public Behavior(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            mOffsetToChildIndexOnLayout = -1;
        }
    }

    private class Behavior.FlingRunnable
        implements Runnable
    {

        private final AppBarLayout mLayout;
        private final CoordinatorLayout mParent;
        final Behavior this$0;

        public void run()
        {
            if (mLayout != null && mScroller != null && mScroller.computeScrollOffset())
            {
                setAppBarTopBottomOffset(mParent, mLayout, mScroller.getCurrY());
                ViewCompat.postOnAnimation(mLayout, this);
            }
        }

        Behavior.FlingRunnable(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
        {
            this$0 = Behavior.this;
            super();
            mParent = coordinatorlayout;
            mLayout = appbarlayout;
        }
    }

    protected static class Behavior.SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public Behavior.SavedState createFromParcel(Parcel parcel)
            {
                return new Behavior.SavedState(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public Behavior.SavedState[] newArray(int i)
            {
                return new Behavior.SavedState[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        boolean firstVisibileChildAtMinimumHeight;
        float firstVisibileChildPercentageShown;
        int firstVisibleChildIndex;

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeInt(firstVisibleChildIndex);
            parcel.writeFloat(firstVisibileChildPercentageShown);
            if (firstVisibileChildAtMinimumHeight)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            parcel.writeByte((byte)i);
        }


        public Behavior.SavedState(Parcel parcel)
        {
            super(parcel);
            firstVisibleChildIndex = parcel.readInt();
            firstVisibileChildPercentageShown = parcel.readFloat();
            boolean flag;
            if (parcel.readByte() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            firstVisibileChildAtMinimumHeight = flag;
        }

        public Behavior.SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams
    {

        static final int FLAG_QUICK_RETURN = 5;
        public static final int SCROLL_FLAG_ENTER_ALWAYS = 4;
        public static final int SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED = 8;
        public static final int SCROLL_FLAG_EXIT_UNTIL_COLLAPSED = 2;
        public static final int SCROLL_FLAG_SCROLL = 1;
        int mScrollFlags;
        Interpolator mScrollInterpolator;

        public int getScrollFlags()
        {
            return mScrollFlags;
        }

        public Interpolator getScrollInterpolator()
        {
            return mScrollInterpolator;
        }

        public void setScrollFlags(int i)
        {
            mScrollFlags = i;
        }

        public void setScrollInterpolator(Interpolator interpolator)
        {
            mScrollInterpolator = interpolator;
        }

        public LayoutParams(int i, int j)
        {
            super(i, j);
            mScrollFlags = 1;
        }

        public LayoutParams(int i, int j, float f)
        {
            super(i, j, f);
            mScrollFlags = 1;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            mScrollFlags = 1;
            attributeset = context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.AppBarLayout_LayoutParams);
            mScrollFlags = attributeset.getInt(android.support.design.R.styleable.AppBarLayout_LayoutParams_layout_scrollFlags, 0);
            if (attributeset.hasValue(android.support.design.R.styleable.AppBarLayout_LayoutParams_layout_scrollInterpolator))
            {
                mScrollInterpolator = AnimationUtils.loadInterpolator(context, attributeset.getResourceId(android.support.design.R.styleable.AppBarLayout_LayoutParams_layout_scrollInterpolator, 0));
            }
            attributeset.recycle();
        }

        public LayoutParams(LayoutParams layoutparams)
        {
            super(layoutparams);
            mScrollFlags = 1;
            mScrollFlags = layoutparams.mScrollFlags;
            mScrollInterpolator = layoutparams.mScrollInterpolator;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            mScrollFlags = 1;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            mScrollFlags = 1;
        }

        public LayoutParams(android.widget.LinearLayout.LayoutParams layoutparams)
        {
            super(layoutparams);
            mScrollFlags = 1;
        }
    }

    public static interface LayoutParams.ScrollFlags
        extends Annotation
    {
    }

    public static interface OnOffsetChangedListener
    {

        public abstract void onOffsetChanged(AppBarLayout appbarlayout, int i);
    }

    public static class ScrollingViewBehavior extends ViewOffsetBehavior
    {

        private int mOverlayTop;

        private static AppBarLayout findFirstAppBarLayout(List list)
        {
            int i = 0;
            for (int j = list.size(); i < j; i++)
            {
                View view = (View)list.get(i);
                if (view instanceof AppBarLayout)
                {
                    return (AppBarLayout)view;
                }
            }

            return null;
        }

        public volatile int getLeftAndRightOffset()
        {
            return super.getLeftAndRightOffset();
        }

        public int getOverlayTop()
        {
            return mOverlayTop;
        }

        public volatile int getTopAndBottomOffset()
        {
            return super.getTopAndBottomOffset();
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorlayout, View view, View view1)
        {
            return view1 instanceof AppBarLayout;
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorlayout, View view, View view1)
        {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams)view1.getLayoutParams()).getBehavior();
            if (behavior instanceof Behavior)
            {
                int i = ((Behavior)behavior).getTopBottomOffsetForScrollingSibling();
                int j = view1.getHeight();
                int k = mOverlayTop;
                int l = coordinatorlayout.getHeight();
                int i1 = view.getHeight();
                if (mOverlayTop != 0 && (view1 instanceof AppBarLayout))
                {
                    int j1 = ((AppBarLayout)view1).getTotalScrollRange();
                    setTopAndBottomOffset(AnimationUtils.lerp(j - k, l - i1, (float)Math.abs(i) / (float)j1));
                } else
                {
                    setTopAndBottomOffset((view1.getHeight() - mOverlayTop) + i);
                }
            }
            return false;
        }

        public volatile boolean onLayoutChild(CoordinatorLayout coordinatorlayout, View view, int i)
        {
            return super.onLayoutChild(coordinatorlayout, view, i);
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorlayout, View view, int i, int j, int k, int l)
        {
            if (view.getLayoutParams().height == -1)
            {
                Object obj = coordinatorlayout.getDependencies(view);
                if (((List) (obj)).isEmpty())
                {
                    return false;
                }
                obj = findFirstAppBarLayout(((List) (obj)));
                if (obj != null && ViewCompat.isLaidOut(((View) (obj))))
                {
                    if (ViewCompat.getFitsSystemWindows(((View) (obj))))
                    {
                        ViewCompat.setFitsSystemWindows(view, true);
                    }
                    int i1 = android.view.View.MeasureSpec.getSize(k);
                    k = i1;
                    if (i1 == 0)
                    {
                        k = coordinatorlayout.getHeight();
                    }
                    coordinatorlayout.onMeasureChild(view, i, j, android.view.View.MeasureSpec.makeMeasureSpec((k - ((AppBarLayout) (obj)).getMeasuredHeight()) + ((AppBarLayout) (obj)).getTotalScrollRange(), 0x80000000), l);
                    return true;
                }
            }
            return false;
        }

        public volatile boolean setLeftAndRightOffset(int i)
        {
            return super.setLeftAndRightOffset(i);
        }

        public void setOverlayTop(int i)
        {
            mOverlayTop = i;
        }

        public volatile boolean setTopAndBottomOffset(int i)
        {
            return super.setTopAndBottomOffset(i);
        }

        public ScrollingViewBehavior()
        {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            context = context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.ScrollingViewBehavior_Params);
            mOverlayTop = context.getDimensionPixelSize(android.support.design.R.styleable.ScrollingViewBehavior_Params_behavior_overlapTop, 0);
            context.recycle();
        }
    }


    private static final int INVALID_SCROLL_RANGE = -1;
    private int mDownPreScrollRange;
    private int mDownScrollRange;
    boolean mHaveChildWithInterpolator;
    private WindowInsetsCompat mLastInsets;
    private final List mListeners;
    private float mTargetElevation;
    private int mTotalScrollRange;

    public AppBarLayout(Context context)
    {
        this(context, null);
    }

    public AppBarLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mTotalScrollRange = -1;
        mDownPreScrollRange = -1;
        mDownScrollRange = -1;
        setOrientation(1);
        context = context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.AppBarLayout, 0, android.support.design.R.style.Widget_Design_AppBarLayout);
        mTargetElevation = context.getDimensionPixelSize(android.support.design.R.styleable.AppBarLayout_elevation, 0);
        setBackgroundDrawable(context.getDrawable(android.support.design.R.styleable.AppBarLayout_android_background));
        context.recycle();
        ViewUtils.setBoundsViewOutlineProvider(this);
        mListeners = new ArrayList();
        ViewCompat.setElevation(this, mTargetElevation);
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() {

            final AppBarLayout this$0;

            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
            {
                setWindowInsets(windowinsetscompat);
                return windowinsetscompat.consumeSystemWindowInsets();
            }

            
            {
                this$0 = AppBarLayout.this;
                super();
            }
        });
    }

    private void setWindowInsets(WindowInsetsCompat windowinsetscompat)
    {
        mTotalScrollRange = -1;
        mLastInsets = windowinsetscompat;
        int i = 0;
        int j = getChildCount();
        do
        {
label0:
            {
                if (i < j)
                {
                    windowinsetscompat = ViewCompat.dispatchApplyWindowInsets(getChildAt(i), windowinsetscompat);
                    if (!windowinsetscompat.isConsumed())
                    {
                        break label0;
                    }
                }
                return;
            }
            i++;
        } while (true);
    }

    public void addOnOffsetChangedListener(OnOffsetChangedListener onoffsetchangedlistener)
    {
        int i = 0;
        for (int j = mListeners.size(); i < j; i++)
        {
            WeakReference weakreference = (WeakReference)mListeners.get(i);
            if (weakreference != null && weakreference.get() == onoffsetchangedlistener)
            {
                return;
            }
        }

        mListeners.add(new WeakReference(onoffsetchangedlistener));
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof LayoutParams;
    }

    protected LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams(-1, -2);
    }

    protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return generateDefaultLayoutParams();
    }

    protected volatile android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams()
    {
        return generateDefaultLayoutParams();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof android.widget.LinearLayout.LayoutParams)
        {
            return new LayoutParams((android.widget.LinearLayout.LayoutParams)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new LayoutParams(layoutparams);
        }
    }

    public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return generateLayoutParams(attributeset);
    }

    protected volatile android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return generateLayoutParams(layoutparams);
    }

    public volatile android.widget.LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return generateLayoutParams(attributeset);
    }

    protected volatile android.widget.LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return generateLayoutParams(layoutparams);
    }

    final int getDownNestedPreScrollRange()
    {
        int j;
        int k;
        if (mDownPreScrollRange != -1)
        {
            return mDownPreScrollRange;
        }
        k = 0;
        j = getChildCount() - 1;
_L5:
        if (j < 0) goto _L2; else goto _L1
_L1:
        int i;
        View view = getChildAt(j);
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        int l;
        if (ViewCompat.isLaidOut(view))
        {
            i = view.getHeight();
        } else
        {
            i = view.getMeasuredHeight();
        }
        l = layoutparams.mScrollFlags;
        if ((l & 5) != 5) goto _L4; else goto _L3
_L3:
        if ((l & 8) != 0)
        {
            i = k + ViewCompat.getMinimumHeight(view);
        } else
        {
            i = k + i;
        }
_L6:
        j--;
        k = i;
          goto _L5
_L4:
        i = k;
        if (k <= 0) goto _L6; else goto _L2
_L2:
        mDownPreScrollRange = k;
        return k;
    }

    final int getDownNestedScrollRange()
    {
        if (mDownScrollRange != -1)
        {
            return mDownScrollRange;
        }
        int j = 0;
        int i = 0;
        int l = getChildCount();
        do
        {
            if (i >= l)
            {
                break;
            }
            View view = getChildAt(i);
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            int k;
            int i1;
            if (ViewCompat.isLaidOut(view))
            {
                k = view.getHeight();
            } else
            {
                k = view.getMeasuredHeight();
            }
            i1 = layoutparams.mScrollFlags;
            if ((i1 & 1) == 0)
            {
                break;
            }
            j += k;
            if ((i1 & 2) != 0)
            {
                return j - ViewCompat.getMinimumHeight(view);
            }
            i++;
        } while (true);
        mDownScrollRange = j;
        return j;
    }

    final int getMinimumHeightForVisibleOverlappingContent()
    {
        int j = 0;
        int i;
        int k;
        if (mLastInsets != null)
        {
            i = mLastInsets.getSystemWindowInsetTop();
        } else
        {
            i = 0;
        }
        k = ViewCompat.getMinimumHeight(this);
        if (k != 0)
        {
            j = k * 2 + i;
        } else
        {
            int l = getChildCount();
            if (l >= 1)
            {
                return ViewCompat.getMinimumHeight(getChildAt(l - 1)) * 2 + i;
            }
        }
        return j;
    }

    public float getTargetElevation()
    {
        return mTargetElevation;
    }

    public final int getTotalScrollRange()
    {
        if (mTotalScrollRange != -1)
        {
            return mTotalScrollRange;
        }
        int i = 0;
        int j = 0;
        int i1 = getChildCount();
        do
        {
label0:
            {
                int k = i;
                if (j < i1)
                {
                    View view = getChildAt(j);
                    LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                    int l;
                    int j1;
                    if (ViewCompat.isLaidOut(view))
                    {
                        l = view.getHeight();
                    } else
                    {
                        l = view.getMeasuredHeight();
                    }
                    j1 = layoutparams.mScrollFlags;
                    k = i;
                    if ((j1 & 1) != 0)
                    {
                        i += l;
                        if ((j1 & 2) == 0)
                        {
                            break label0;
                        }
                        k = i - ViewCompat.getMinimumHeight(view);
                    }
                }
                if (mLastInsets != null)
                {
                    i = mLastInsets.getSystemWindowInsetTop();
                } else
                {
                    i = 0;
                }
                i = k - i;
                mTotalScrollRange = i;
                return i;
            }
            j++;
        } while (true);
    }

    final int getUpNestedPreScrollRange()
    {
        return getTotalScrollRange();
    }

    final boolean hasChildWithInterpolator()
    {
        return mHaveChildWithInterpolator;
    }

    final boolean hasScrollableChildren()
    {
        return getTotalScrollRange() != 0;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        mTotalScrollRange = -1;
        mDownPreScrollRange = -1;
        mDownPreScrollRange = -1;
        mHaveChildWithInterpolator = false;
        i = 0;
        j = getChildCount();
        do
        {
label0:
            {
                if (i < j)
                {
                    if (((LayoutParams)getChildAt(i).getLayoutParams()).getScrollInterpolator() == null)
                    {
                        break label0;
                    }
                    mHaveChildWithInterpolator = true;
                }
                return;
            }
            i++;
        } while (true);
    }

    public void removeOnOffsetChangedListener(OnOffsetChangedListener onoffsetchangedlistener)
    {
        Iterator iterator = mListeners.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            OnOffsetChangedListener onoffsetchangedlistener1 = (OnOffsetChangedListener)((WeakReference)iterator.next()).get();
            if (onoffsetchangedlistener1 == onoffsetchangedlistener || onoffsetchangedlistener1 == null)
            {
                iterator.remove();
            }
        } while (true);
    }

    public void setOrientation(int i)
    {
        if (i != 1)
        {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        } else
        {
            super.setOrientation(i);
            return;
        }
    }

    public void setTargetElevation(float f)
    {
        mTargetElevation = f;
    }


}
