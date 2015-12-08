// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//            ThemeUtils, ViewUtils, HeaderBehavior, ValueAnimatorCompat, 
//            AnimationUtils, CoordinatorLayout, MathUtils, HeaderScrollingViewBehavior

public class AppBarLayout extends LinearLayout
{
    public static class Behavior extends HeaderBehavior
    {

        private static final int ANIMATE_OFFSET_DIPS_PER_SECOND = 300;
        private static final int INVALID_POSITION = -1;
        private ValueAnimatorCompat mAnimator;
        private WeakReference mLastNestedScrollingChildRef;
        private int mOffsetDelta;
        private int mOffsetToChildIndexOnLayout;
        private boolean mOffsetToChildIndexOnLayoutIsMinHeight;
        private float mOffsetToChildIndexOnLayoutPerc;
        private DragCallback mOnDragCallback;
        private boolean mSkipNestedPreScroll;
        private boolean mWasFlung;

        private void animateOffsetTo(final CoordinatorLayout coordinatorLayout, AppBarLayout appbarlayout, int i)
        {
            int j = getTopBottomOffsetForScrollingSibling();
            if (j == i)
            {
                if (mAnimator != null && mAnimator.isRunning())
                {
                    mAnimator.cancel();
                }
                return;
            }
            float f;
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
                        setHeaderTopBottomOffset(coordinatorLayout, child, valueanimatorcompat.getAnimatedIntValue());
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
            f = (float)Math.abs(j - i) / coordinatorLayout.getResources().getDisplayMetrics().density;
            mAnimator.setDuration(Math.round((f * 1000F) / 300F));
            mAnimator.setIntValues(j, i);
            mAnimator.start();
        }

        private void dispatchOffsetUpdates(AppBarLayout appbarlayout)
        {
            List list = appbarlayout.mListeners;
            int j = list.size();
            for (int i = 0; i < j; i++)
            {
                OnOffsetChangedListener onoffsetchangedlistener = (OnOffsetChangedListener)list.get(i);
                if (onoffsetchangedlistener != null)
                {
                    onoffsetchangedlistener.onOffsetChanged(appbarlayout, getTopAndBottomOffset());
                }
            }

        }

        private View getChildOnOffset(AppBarLayout appbarlayout, int i)
        {
            int k = appbarlayout.getChildCount();
            for (int j = 0; j < k; j++)
            {
                View view = appbarlayout.getChildAt(j);
                if (view.getTop() <= -i && view.getBottom() >= -i)
                {
                    return view;
                }
            }

            return null;
        }

        private int interpolateOffset(AppBarLayout appbarlayout, int i)
        {
            int l = Math.abs(i);
            int i1 = appbarlayout.getChildCount();
            int k = 0;
            do
            {
label0:
                {
                    int j = i;
                    if (k < i1)
                    {
                        View view = appbarlayout.getChildAt(k);
                        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                        Interpolator interpolator = layoutparams.getScrollInterpolator();
                        if (l < view.getTop() || l > view.getBottom())
                        {
                            break label0;
                        }
                        j = i;
                        if (interpolator != null)
                        {
                            int j1 = layoutparams.getScrollFlags();
                            if ((j1 & 1) != 0)
                            {
                                j = view.getHeight();
                                k = layoutparams.topMargin;
                                k = layoutparams.bottomMargin + (j + k) + 0;
                                j = k;
                                if ((j1 & 2) != 0)
                                {
                                    j = k - ViewCompat.getMinimumHeight(view);
                                }
                            } else
                            {
                                j = 0;
                            }
                            k = j;
                            if (ViewCompat.getFitsSystemWindows(view))
                            {
                                k = j - appbarlayout.getTopInset();
                            }
                            j = i;
                            if (k > 0)
                            {
                                j = view.getTop();
                                float f = k;
                                j = Math.round(interpolator.getInterpolation((float)(l - j) / (float)k) * f);
                                j = Integer.signum(i) * (j + view.getTop());
                            }
                        }
                    }
                    return j;
                }
                k++;
            } while (true);
        }

        private void snapToChildIfNeeded(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout)
        {
            int k = getTopBottomOffsetForScrollingSibling();
            View view = getChildOnOffset(appbarlayout, k);
            if (view != null)
            {
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                if ((layoutparams.getScrollFlags() & 0x11) == 17)
                {
                    int j = -view.getTop();
                    int i = -view.getBottom();
                    if ((layoutparams.getScrollFlags() & 2) == 2)
                    {
                        i = ViewCompat.getMinimumHeight(view) + i;
                    }
                    if (k >= (i + j) / 2)
                    {
                        i = j;
                    }
                    animateOffsetTo(coordinatorlayout, appbarlayout, MathUtils.constrain(i, -appbarlayout.getTotalScrollRange(), 0));
                }
            }
        }

        boolean canDragView(AppBarLayout appbarlayout)
        {
            if (mOnDragCallback != null)
            {
                return mOnDragCallback.canDrag(appbarlayout);
            }
            if (mLastNestedScrollingChildRef != null)
            {
                appbarlayout = (View)mLastNestedScrollingChildRef.get();
                return appbarlayout != null && appbarlayout.isShown() && !ViewCompat.canScrollVertically(appbarlayout, -1);
            } else
            {
                return true;
            }
        }

        volatile boolean canDragView(View view)
        {
            return canDragView((AppBarLayout)view);
        }

        public volatile int getLeftAndRightOffset()
        {
            return super.getLeftAndRightOffset();
        }

        int getMaxDragOffset(AppBarLayout appbarlayout)
        {
            return -appbarlayout.getDownNestedScrollRange();
        }

        volatile int getMaxDragOffset(View view)
        {
            return getMaxDragOffset((AppBarLayout)view);
        }

        int getScrollRangeForDragFling(AppBarLayout appbarlayout)
        {
            return appbarlayout.getTotalScrollRange();
        }

        volatile int getScrollRangeForDragFling(View view)
        {
            return getScrollRangeForDragFling((AppBarLayout)view);
        }

        public volatile int getTopAndBottomOffset()
        {
            return super.getTopAndBottomOffset();
        }

        int getTopBottomOffsetForScrollingSibling()
        {
            return getTopAndBottomOffset() + mOffsetDelta;
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i)
        {
            int j;
            boolean flag;
            flag = super.onLayoutChild(coordinatorlayout, appbarlayout, i);
            j = appbarlayout.getPendingAction();
            if (j == 0) goto _L2; else goto _L1
_L1:
            if ((j & 4) != 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if ((j & 2) == 0) goto _L4; else goto _L3
_L3:
            j = -appbarlayout.getUpNestedPreScrollRange();
            if (i != 0)
            {
                animateOffsetTo(coordinatorlayout, appbarlayout, j);
            } else
            {
                setHeaderTopBottomOffset(coordinatorlayout, appbarlayout, j);
            }
_L6:
            appbarlayout.resetPendingAction();
            mOffsetToChildIndexOnLayout = -1;
            dispatchOffsetUpdates(appbarlayout);
            return flag;
_L4:
            if ((j & 1) != 0)
            {
                if (i != 0)
                {
                    animateOffsetTo(coordinatorlayout, appbarlayout, 0);
                } else
                {
                    setHeaderTopBottomOffset(coordinatorlayout, appbarlayout, 0);
                }
            }
            continue; /* Loop/switch isn't completed */
_L2:
            if (mOffsetToChildIndexOnLayout >= 0)
            {
                coordinatorlayout = appbarlayout.getChildAt(mOffsetToChildIndexOnLayout);
                i = -coordinatorlayout.getBottom();
                if (mOffsetToChildIndexOnLayoutIsMinHeight)
                {
                    i = ViewCompat.getMinimumHeight(coordinatorlayout) + i;
                } else
                {
                    i = Math.round((float)coordinatorlayout.getHeight() * mOffsetToChildIndexOnLayoutPerc) + i;
                }
                setTopAndBottomOffset(i);
            }
            if (true) goto _L6; else goto _L5
_L5:
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
            mWasFlung = flag;
            return flag;
_L2:
            if (f1 < 0.0F)
            {
                int i = -appbarlayout.getTotalScrollRange() + appbarlayout.getDownNestedPreScrollRange();
                flag = flag1;
                if (getTopBottomOffsetForScrollingSibling() < i)
                {
                    animateOffsetTo(coordinatorlayout, appbarlayout, i);
                    flag = true;
                }
            } else
            {
                int j = -appbarlayout.getUpNestedPreScrollRange();
                flag = flag1;
                if (getTopBottomOffsetForScrollingSibling() > j)
                {
                    animateOffsetTo(coordinatorlayout, appbarlayout, j);
                    flag = true;
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
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
            boolean flag = false;
            Parcelable parcelable = super.onSaveInstanceState(coordinatorlayout, appbarlayout);
            int j = getTopAndBottomOffset();
            int k = appbarlayout.getChildCount();
            for (int i = 0; i < k; i++)
            {
                coordinatorlayout = appbarlayout.getChildAt(i);
                int l = coordinatorlayout.getBottom() + j;
                if (coordinatorlayout.getTop() + j <= 0 && l >= 0)
                {
                    appbarlayout = new SavedState(parcelable);
                    appbarlayout.firstVisibleChildIndex = i;
                    if (l == ViewCompat.getMinimumHeight(coordinatorlayout))
                    {
                        flag = true;
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
            if ((i & 2) != 0 && appbarlayout.hasScrollableChildren() && coordinatorlayout.getHeight() - view.getHeight() <= appbarlayout.getHeight())
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
            mLastNestedScrollingChildRef = null;
            return flag;
        }

        public volatile boolean onStartNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i)
        {
            return onStartNestedScroll(coordinatorlayout, (AppBarLayout)view, view1, view2, i);
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, View view)
        {
            if (!mWasFlung)
            {
                snapToChildIfNeeded(coordinatorlayout, appbarlayout);
            }
            mSkipNestedPreScroll = false;
            mWasFlung = false;
            mLastNestedScrollingChildRef = new WeakReference(view);
        }

        public volatile void onStopNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1)
        {
            onStopNestedScroll(coordinatorlayout, (AppBarLayout)view, view1);
        }

        public void setDragCallback(DragCallback dragcallback)
        {
            mOnDragCallback = dragcallback;
        }

        int setHeaderTopBottomOffset(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, int i, int j, int k)
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
                            mOffsetDelta = j - i;
                            if (!flag1 && appbarlayout.hasChildWithInterpolator())
                            {
                                coordinatorlayout.dispatchDependentViewsChanged(appbarlayout);
                            }
                            dispatchOffsetUpdates(appbarlayout);
                            l = i1 - j;
                        }
                    }
                }
            }
            return l;
        }

        volatile int setHeaderTopBottomOffset(CoordinatorLayout coordinatorlayout, View view, int i, int j, int k)
        {
            return setHeaderTopBottomOffset(coordinatorlayout, (AppBarLayout)view, i, j, k);
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

    public static abstract class Behavior.DragCallback
    {

        public abstract boolean canDrag(AppBarLayout appbarlayout);

        public Behavior.DragCallback()
        {
        }
    }

    protected static class Behavior.SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks() {

            public Behavior.SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
            {
                return new Behavior.SavedState(parcel, classloader);
            }

            public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
            {
                return createFromParcel(parcel, classloader);
            }

            public Behavior.SavedState[] newArray(int i)
            {
                return new Behavior.SavedState[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        });
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


        public Behavior.SavedState(Parcel parcel, ClassLoader classloader)
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
        static final int FLAG_SNAP = 17;
        public static final int SCROLL_FLAG_ENTER_ALWAYS = 4;
        public static final int SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED = 8;
        public static final int SCROLL_FLAG_EXIT_UNTIL_COLLAPSED = 2;
        public static final int SCROLL_FLAG_SCROLL = 1;
        public static final int SCROLL_FLAG_SNAP = 16;
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

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior
    {

        private int mOverlayTop;

        private int getOverlapForOffset(View view, int i)
        {
            if (mOverlayTop != 0 && (view instanceof AppBarLayout))
            {
                view = (AppBarLayout)view;
                int j = view.getTotalScrollRange();
                int k = view.getDownNestedPreScrollRange();
                if (k != 0 && j + i <= k)
                {
                    return 0;
                }
                j -= k;
                if (j != 0)
                {
                    return MathUtils.constrain(Math.round(((float)i / (float)j + 1.0F) * (float)mOverlayTop), 0, mOverlayTop);
                }
            }
            return mOverlayTop;
        }

        private boolean updateOffset(CoordinatorLayout coordinatorlayout, View view, View view1)
        {
            coordinatorlayout = ((CoordinatorLayout.LayoutParams)view1.getLayoutParams()).getBehavior();
            if (coordinatorlayout instanceof Behavior)
            {
                int i = ((Behavior)coordinatorlayout).getTopBottomOffsetForScrollingSibling();
                setTopAndBottomOffset((view1.getHeight() + i) - getOverlapForOffset(view1, i));
                return true;
            } else
            {
                return false;
            }
        }

        View findFirstDependency(List list)
        {
            int j = list.size();
            for (int i = 0; i < j; i++)
            {
                View view = (View)list.get(i);
                if (view instanceof AppBarLayout)
                {
                    return view;
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

        int getScrollRange(View view)
        {
            if (view instanceof AppBarLayout)
            {
                return ((AppBarLayout)view).getTotalScrollRange();
            } else
            {
                return super.getScrollRange(view);
            }
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
            updateOffset(coordinatorlayout, view, view1);
            return false;
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorlayout, View view, int i)
        {
            super.onLayoutChild(coordinatorlayout, view, i);
            List list = coordinatorlayout.getDependencies(view);
            int j = list.size();
            i = 0;
            do
            {
                if (i >= j || updateOffset(coordinatorlayout, view, (View)list.get(i)))
                {
                    return true;
                }
                i++;
            } while (true);
        }

        public volatile boolean onMeasureChild(CoordinatorLayout coordinatorlayout, View view, int i, int j, int k, int l)
        {
            return super.onMeasureChild(coordinatorlayout, view, i, j, k, l);
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
    private static final int PENDING_ACTION_ANIMATE_ENABLED = 4;
    private static final int PENDING_ACTION_COLLAPSED = 2;
    private static final int PENDING_ACTION_EXPANDED = 1;
    private static final int PENDING_ACTION_NONE = 0;
    private int mDownPreScrollRange;
    private int mDownScrollRange;
    boolean mHaveChildWithInterpolator;
    private WindowInsetsCompat mLastInsets;
    private final List mListeners;
    private int mPendingAction;
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
        mPendingAction = 0;
        setOrientation(1);
        ThemeUtils.checkAppCompatTheme(context);
        context = context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.AppBarLayout, 0, android.support.design.R.style.Widget_Design_AppBarLayout);
        mTargetElevation = context.getDimensionPixelSize(android.support.design.R.styleable.AppBarLayout_elevation, 0);
        setBackgroundDrawable(context.getDrawable(android.support.design.R.styleable.AppBarLayout_android_background));
        if (context.hasValue(android.support.design.R.styleable.AppBarLayout_expanded))
        {
            setExpanded(context.getBoolean(android.support.design.R.styleable.AppBarLayout_expanded, false));
        }
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

    private int getDownNestedPreScrollRange()
    {
        int i;
        int j;
        if (mDownPreScrollRange != -1)
        {
            return mDownPreScrollRange;
        }
        i = 0;
        j = getChildCount() - 1;
_L5:
        if (j < 0) goto _L2; else goto _L1
_L1:
        View view;
        LayoutParams layoutparams;
        int k;
        int l;
        view = getChildAt(j);
        layoutparams = (LayoutParams)view.getLayoutParams();
        k = view.getMeasuredHeight();
        l = layoutparams.mScrollFlags;
        if ((l & 5) != 5) goto _L4; else goto _L3
_L3:
        int i1 = layoutparams.topMargin;
        i = layoutparams.bottomMargin + i1 + i;
        if ((l & 8) != 0)
        {
            i += ViewCompat.getMinimumHeight(view);
        } else
        {
            i += k;
        }
_L6:
        j--;
          goto _L5
_L4:
        if (i <= 0) goto _L6; else goto _L2
_L2:
        mDownPreScrollRange = i;
        return i;
    }

    private int getDownNestedScrollRange()
    {
        if (mDownScrollRange != -1)
        {
            return mDownScrollRange;
        }
        int k = getChildCount();
        int j = 0;
        int i = 0;
        do
        {
label0:
            {
                if (j < k)
                {
                    View view = getChildAt(j);
                    LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                    int i1 = view.getMeasuredHeight();
                    int j1 = layoutparams.topMargin;
                    int k1 = layoutparams.bottomMargin;
                    int l = layoutparams.mScrollFlags;
                    if ((l & 1) != 0)
                    {
                        i += i1 + (j1 + k1);
                        if ((l & 2) == 0)
                        {
                            break label0;
                        }
                        i -= ViewCompat.getMinimumHeight(view) + getTopInset();
                    }
                }
                i = Math.max(0, i);
                mDownScrollRange = i;
                return i;
            }
            j++;
        } while (true);
    }

    private int getPendingAction()
    {
        return mPendingAction;
    }

    private int getTopInset()
    {
        if (mLastInsets != null)
        {
            return mLastInsets.getSystemWindowInsetTop();
        } else
        {
            return 0;
        }
    }

    private int getUpNestedPreScrollRange()
    {
        return getTotalScrollRange();
    }

    private boolean hasChildWithInterpolator()
    {
        return mHaveChildWithInterpolator;
    }

    private boolean hasScrollableChildren()
    {
        return getTotalScrollRange() != 0;
    }

    private void invalidateScrollRanges()
    {
        mTotalScrollRange = -1;
        mDownPreScrollRange = -1;
        mDownScrollRange = -1;
    }

    private void resetPendingAction()
    {
        mPendingAction = 0;
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
        if (onoffsetchangedlistener != null && !mListeners.contains(onoffsetchangedlistener))
        {
            mListeners.add(onoffsetchangedlistener);
        }
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
        int k = getChildCount();
        int j = 0;
        int i = 0;
        do
        {
label0:
            {
                if (j < k)
                {
                    View view = getChildAt(j);
                    LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                    int i1 = view.getMeasuredHeight();
                    int l = layoutparams.mScrollFlags;
                    if ((l & 1) != 0)
                    {
                        int j1 = layoutparams.topMargin;
                        i += layoutparams.bottomMargin + (i1 + j1);
                        if ((l & 2) == 0)
                        {
                            break label0;
                        }
                        i -= ViewCompat.getMinimumHeight(view);
                    }
                }
                i = Math.max(0, i - getTopInset());
                mTotalScrollRange = i;
                return i;
            }
            j++;
        } while (true);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        invalidateScrollRanges();
        mHaveChildWithInterpolator = false;
        j = getChildCount();
        i = 0;
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

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        invalidateScrollRanges();
    }

    public void removeOnOffsetChangedListener(OnOffsetChangedListener onoffsetchangedlistener)
    {
        if (onoffsetchangedlistener != null)
        {
            mListeners.remove(onoffsetchangedlistener);
        }
    }

    public void setExpanded(boolean flag)
    {
        setExpanded(flag, ViewCompat.isLaidOut(this));
    }

    public void setExpanded(boolean flag, boolean flag1)
    {
        byte byte0;
        byte byte1;
        if (flag)
        {
            byte0 = 1;
        } else
        {
            byte0 = 2;
        }
        if (flag1)
        {
            byte1 = 4;
        } else
        {
            byte1 = 0;
        }
        mPendingAction = byte1 | byte0;
        requestLayout();
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
