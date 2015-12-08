// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.NestedScrollingParent;
import android.support.v4.view.NestedScrollingParentHelper;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v4.widget.ScrollerCompat;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v7.internal.widget:
//            DecorContentParent, ContentFrameLayout, ActionBarContainer, DecorToolbar, 
//            ViewUtils

public class ActionBarOverlayLayout extends ViewGroup
    implements NestedScrollingParent, DecorContentParent
{
    public static interface ActionBarVisibilityCallback
    {

        public abstract void enableContentAnimations(boolean flag);

        public abstract void hideForSystem();

        public abstract void onContentScrollStarted();

        public abstract void onWindowVisibilityChanged(int i);

        public abstract void showForSystem();
    }

    public static final class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        public LayoutParams()
        {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
        }
    }


    static final int ATTRS[] = {
        0x7f010101, 0x1010059
    };
    private final int ACTION_BAR_ANIMATE_DELAY;
    private ActionBarContainer mActionBarBottom;
    private int mActionBarHeight;
    private ActionBarContainer mActionBarTop;
    public ActionBarVisibilityCallback mActionBarVisibilityCallback;
    private final Runnable mAddActionBarHideOffset;
    private boolean mAnimatingForFling;
    private final Rect mBaseContentInsets;
    private final Rect mBaseInnerInsets;
    private final ViewPropertyAnimatorListener mBottomAnimatorListener;
    private ContentFrameLayout mContent;
    private final Rect mContentInsets;
    private ViewPropertyAnimatorCompat mCurrentActionBarBottomAnimator;
    private ViewPropertyAnimatorCompat mCurrentActionBarTopAnimator;
    private DecorToolbar mDecorToolbar;
    private ScrollerCompat mFlingEstimator;
    public boolean mHasNonEmbeddedTabs;
    private boolean mHideOnContentScroll;
    private int mHideOnContentScrollReference;
    private boolean mIgnoreWindowContentOverlay;
    private final Rect mInnerInsets;
    private final Rect mLastBaseContentInsets;
    private final Rect mLastInnerInsets;
    public int mLastSystemUiVisibility;
    public boolean mOverlayMode;
    private final NestedScrollingParentHelper mParentHelper;
    private final Runnable mRemoveActionBarHideOffset;
    private final ViewPropertyAnimatorListener mTopAnimatorListener;
    private Drawable mWindowContentOverlay;
    public int mWindowVisibility;

    public ActionBarOverlayLayout(Context context)
    {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mWindowVisibility = 0;
        mBaseContentInsets = new Rect();
        mLastBaseContentInsets = new Rect();
        mContentInsets = new Rect();
        mBaseInnerInsets = new Rect();
        mInnerInsets = new Rect();
        mLastInnerInsets = new Rect();
        ACTION_BAR_ANIMATE_DELAY = 600;
        mTopAnimatorListener = new ViewPropertyAnimatorListenerAdapter() {

            final ActionBarOverlayLayout this$0;

            public final void onAnimationCancel(View view)
            {
                mCurrentActionBarTopAnimator = null;
                mAnimatingForFling;
            }

            public final void onAnimationEnd(View view)
            {
                mCurrentActionBarTopAnimator = null;
                mAnimatingForFling;
            }

            
            {
                this$0 = ActionBarOverlayLayout.this;
                super();
            }
        };
        mBottomAnimatorListener = new ViewPropertyAnimatorListenerAdapter() {

            final ActionBarOverlayLayout this$0;

            public final void onAnimationCancel(View view)
            {
                mCurrentActionBarBottomAnimator = null;
                mAnimatingForFling;
            }

            public final void onAnimationEnd(View view)
            {
                mCurrentActionBarBottomAnimator = null;
                mAnimatingForFling;
            }

            
            {
                this$0 = ActionBarOverlayLayout.this;
                super();
            }
        };
        mRemoveActionBarHideOffset = new Runnable() {

            final ActionBarOverlayLayout this$0;

            public final void run()
            {
                haltActionBarHideOffsetAnimations();
                mCurrentActionBarTopAnimator = ViewCompat.animate(mActionBarTop).translationY(0.0F).setListener(mTopAnimatorListener);
                if (mActionBarBottom != null && mActionBarBottom.getVisibility() != 8)
                {
                    mCurrentActionBarBottomAnimator = ViewCompat.animate(mActionBarBottom).translationY(0.0F).setListener(mBottomAnimatorListener);
                }
            }

            
            {
                this$0 = ActionBarOverlayLayout.this;
                super();
            }
        };
        mAddActionBarHideOffset = new Runnable() {

            final ActionBarOverlayLayout this$0;

            public final void run()
            {
                haltActionBarHideOffsetAnimations();
                mCurrentActionBarTopAnimator = ViewCompat.animate(mActionBarTop).translationY(-mActionBarTop.getHeight()).setListener(mTopAnimatorListener);
                if (mActionBarBottom != null && mActionBarBottom.getVisibility() != 8)
                {
                    mCurrentActionBarBottomAnimator = ViewCompat.animate(mActionBarBottom).translationY(mActionBarBottom.getHeight()).setListener(mBottomAnimatorListener);
                }
            }

            
            {
                this$0 = ActionBarOverlayLayout.this;
                super();
            }
        };
        init(context);
        mParentHelper = new NestedScrollingParentHelper(this);
    }

    private static boolean applyInsets$614d7dc0(View view, Rect rect, boolean flag, boolean flag1)
    {
        boolean flag2 = false;
        view = (LayoutParams)view.getLayoutParams();
        if (((LayoutParams) (view)).leftMargin != rect.left)
        {
            flag2 = true;
            view.leftMargin = rect.left;
        }
        boolean flag3 = flag2;
        if (flag)
        {
            flag3 = flag2;
            if (((LayoutParams) (view)).topMargin != rect.top)
            {
                flag3 = true;
                view.topMargin = rect.top;
            }
        }
        if (((LayoutParams) (view)).rightMargin != rect.right)
        {
            flag3 = true;
            view.rightMargin = rect.right;
        }
        flag = flag3;
        if (flag1)
        {
            flag = flag3;
            if (((LayoutParams) (view)).bottomMargin != rect.bottom)
            {
                flag = true;
                view.bottomMargin = rect.bottom;
            }
        }
        return flag;
    }

    private void haltActionBarHideOffsetAnimations()
    {
        removeCallbacks(mRemoveActionBarHideOffset);
        removeCallbacks(mAddActionBarHideOffset);
        if (mCurrentActionBarTopAnimator != null)
        {
            mCurrentActionBarTopAnimator.cancel();
        }
        if (mCurrentActionBarBottomAnimator != null)
        {
            mCurrentActionBarBottomAnimator.cancel();
        }
    }

    private void init(Context context)
    {
        boolean flag1 = true;
        TypedArray typedarray = getContext().getTheme().obtainStyledAttributes(ATTRS);
        mActionBarHeight = typedarray.getDimensionPixelSize(0, 0);
        mWindowContentOverlay = typedarray.getDrawable(1);
        boolean flag;
        if (mWindowContentOverlay == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setWillNotDraw(flag);
        typedarray.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        mIgnoreWindowContentOverlay = flag;
        mFlingEstimator = ScrollerCompat.create(context, null);
    }

    private void pullChildren()
    {
        if (mContent == null)
        {
            mContent = (ContentFrameLayout)findViewById(0x7f0d000c);
            mActionBarTop = (ActionBarContainer)findViewById(0x7f0d00ca);
            Object obj = findViewById(0x7f0d00cb);
            if (obj instanceof DecorToolbar)
            {
                obj = (DecorToolbar)obj;
            } else
            if (obj instanceof Toolbar)
            {
                obj = ((Toolbar)obj).getWrapper();
            } else
            {
                throw new IllegalStateException((new StringBuilder("Can't make a decor toolbar out of ")).append(obj.getClass().getSimpleName()).toString());
            }
            mDecorToolbar = ((DecorToolbar) (obj));
            mActionBarBottom = (ActionBarContainer)findViewById(0x7f0d0065);
        }
    }

    private void setActionBarHideOffset(int i)
    {
        haltActionBarHideOffsetAnimations();
        int j = mActionBarTop.getHeight();
        i = Math.max(0, Math.min(i, j));
        ViewCompat.setTranslationY(mActionBarTop, -i);
        if (mActionBarBottom != null && mActionBarBottom.getVisibility() != 8)
        {
            float f = (float)i / (float)j;
            i = (int)((float)mActionBarBottom.getHeight() * f);
            ViewCompat.setTranslationY(mActionBarBottom, i);
        }
    }

    public static void setShowingForActionMode$1385ff()
    {
    }

    public final boolean canShowOverflowMenu()
    {
        pullChildren();
        return mDecorToolbar.canShowOverflowMenu();
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof LayoutParams;
    }

    public final void dismissPopups()
    {
        pullChildren();
        mDecorToolbar.dismissPopupMenus();
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        if (mWindowContentOverlay != null && !mIgnoreWindowContentOverlay)
        {
            int i;
            if (mActionBarTop.getVisibility() == 0)
            {
                i = (int)((float)mActionBarTop.getBottom() + ViewCompat.getTranslationY(mActionBarTop) + 0.5F);
            } else
            {
                i = 0;
            }
            mWindowContentOverlay.setBounds(0, i, getWidth(), mWindowContentOverlay.getIntrinsicHeight() + i);
            mWindowContentOverlay.draw(canvas);
        }
    }

    protected boolean fitSystemWindows(Rect rect)
    {
        pullChildren();
        ViewCompat.getWindowSystemUiVisibility(this);
        boolean flag1 = applyInsets$614d7dc0(mActionBarTop, rect, true, false);
        boolean flag = flag1;
        if (mActionBarBottom != null)
        {
            flag = flag1 | applyInsets$614d7dc0(mActionBarBottom, rect, false, true);
        }
        mBaseInnerInsets.set(rect);
        ViewUtils.computeFitSystemWindows(this, mBaseInnerInsets, mBaseContentInsets);
        if (!mLastBaseContentInsets.equals(mBaseContentInsets))
        {
            flag = true;
            mLastBaseContentInsets.set(mBaseContentInsets);
        }
        if (flag)
        {
            requestLayout();
        }
        return true;
    }

    protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams();
    }

    public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return new LayoutParams(layoutparams);
    }

    public int getNestedScrollAxes()
    {
        return mParentHelper.mNestedScrollAxes;
    }

    public final boolean hideOverflowMenu()
    {
        pullChildren();
        return mDecorToolbar.hideOverflowMenu();
    }

    public final void initFeature(int i)
    {
        boolean flag = true;
        pullChildren();
        switch (i)
        {
        default:
            return;

        case 2: // '\002'
            mDecorToolbar.initProgress();
            return;

        case 5: // '\005'
            mDecorToolbar.initIndeterminateProgress();
            return;

        case 9: // '\t'
            mOverlayMode = true;
            break;
        }
        if (getContext().getApplicationInfo().targetSdkVersion >= 19)
        {
            flag = false;
        }
        mIgnoreWindowContentOverlay = flag;
    }

    public final boolean isOverflowMenuShowPending()
    {
        pullChildren();
        return mDecorToolbar.isOverflowMenuShowPending();
    }

    public final boolean isOverflowMenuShowing()
    {
        pullChildren();
        return mDecorToolbar.isOverflowMenuShowing();
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        init(getContext());
        ViewCompat.requestApplyInsets(this);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        haltActionBarHideOffsetAnimations();
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        int i1 = getChildCount();
        int j1 = getPaddingLeft();
        getPaddingRight();
        int k1 = getPaddingTop();
        int l1 = getPaddingBottom();
        i = 0;
        while (i < i1) 
        {
            View view = getChildAt(i);
            if (view.getVisibility() != 8)
            {
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                int i2 = view.getMeasuredWidth();
                int j2 = view.getMeasuredHeight();
                int k2 = j1 + layoutparams.leftMargin;
                if (view == mActionBarBottom)
                {
                    k = l - j - l1 - j2 - layoutparams.bottomMargin;
                } else
                {
                    k = k1 + layoutparams.topMargin;
                }
                view.layout(k2, k, k2 + i2, k + j2);
            }
            i++;
        }
    }

    protected void onMeasure(int i, int j)
    {
        pullChildren();
        int k = 0;
        measureChildWithMargins(mActionBarTop, i, 0, j, 0);
        Object obj = (LayoutParams)mActionBarTop.getLayoutParams();
        int j2 = Math.max(0, mActionBarTop.getMeasuredWidth() + ((LayoutParams) (obj)).leftMargin + ((LayoutParams) (obj)).rightMargin);
        int l1 = Math.max(0, mActionBarTop.getMeasuredHeight() + ((LayoutParams) (obj)).topMargin + ((LayoutParams) (obj)).bottomMargin);
        int k1 = ViewUtils.combineMeasuredStates(0, ViewCompat.getMeasuredState(mActionBarTop));
        int l = k1;
        int i1 = l1;
        int j1 = j2;
        if (mActionBarBottom != null)
        {
            measureChildWithMargins(mActionBarBottom, i, 0, j, 0);
            obj = (LayoutParams)mActionBarBottom.getLayoutParams();
            j1 = Math.max(j2, mActionBarBottom.getMeasuredWidth() + ((LayoutParams) (obj)).leftMargin + ((LayoutParams) (obj)).rightMargin);
            i1 = Math.max(l1, mActionBarBottom.getMeasuredHeight() + ((LayoutParams) (obj)).topMargin + ((LayoutParams) (obj)).bottomMargin);
            l = ViewUtils.combineMeasuredStates(k1, ViewCompat.getMeasuredState(mActionBarBottom));
        }
        if ((ViewCompat.getWindowSystemUiVisibility(this) & 0x100) != 0)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (k1 != 0)
        {
            int i2 = mActionBarHeight;
            k = i2;
            if (mHasNonEmbeddedTabs)
            {
                k = i2;
                if (mActionBarTop.mTabContainer != null)
                {
                    k = i2 + mActionBarHeight;
                }
            }
        } else
        if (mActionBarTop.getVisibility() != 8)
        {
            k = mActionBarTop.getMeasuredHeight();
        }
        mContentInsets.set(mBaseContentInsets);
        mInnerInsets.set(mBaseInnerInsets);
        if (!mOverlayMode && k1 == 0)
        {
            obj = mContentInsets;
            obj.top = ((Rect) (obj)).top + k;
            obj = mContentInsets;
            obj.bottom = ((Rect) (obj)).bottom + 0;
        } else
        {
            Rect rect = mInnerInsets;
            rect.top = rect.top + k;
            rect = mInnerInsets;
            rect.bottom = rect.bottom + 0;
        }
        applyInsets$614d7dc0(mContent, mContentInsets, true, true);
        if (!mLastInnerInsets.equals(mInnerInsets))
        {
            mLastInnerInsets.set(mInnerInsets);
            mContent.dispatchFitSystemWindows(mInnerInsets);
        }
        measureChildWithMargins(mContent, i, 0, j, 0);
        obj = (LayoutParams)mContent.getLayoutParams();
        k = Math.max(j1, mContent.getMeasuredWidth() + ((LayoutParams) (obj)).leftMargin + ((LayoutParams) (obj)).rightMargin);
        i1 = Math.max(i1, mContent.getMeasuredHeight() + ((LayoutParams) (obj)).topMargin + ((LayoutParams) (obj)).bottomMargin);
        l = ViewUtils.combineMeasuredStates(l, ViewCompat.getMeasuredState(mContent));
        j1 = getPaddingLeft();
        k1 = getPaddingRight();
        i1 = Math.max(getPaddingTop() + getPaddingBottom() + i1, getSuggestedMinimumHeight());
        setMeasuredDimension(ViewCompat.resolveSizeAndState(Math.max(k + (j1 + k1), getSuggestedMinimumWidth()), i, l), ViewCompat.resolveSizeAndState(i1, j, l << 16));
    }

    public boolean onNestedFling(View view, float f, float f1, boolean flag)
    {
        boolean flag1 = false;
        if (!mHideOnContentScroll || !flag)
        {
            return false;
        }
        mFlingEstimator.fling$69c647f5(0, (int)f1, 0, 0);
        if (mFlingEstimator.getFinalY() > mActionBarTop.getHeight())
        {
            flag1 = true;
        }
        if (flag1)
        {
            haltActionBarHideOffsetAnimations();
            mAddActionBarHideOffset.run();
        } else
        {
            haltActionBarHideOffsetAnimations();
            mRemoveActionBarHideOffset.run();
        }
        mAnimatingForFling = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f1)
    {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int j, int ai[])
    {
    }

    public void onNestedScroll(View view, int i, int j, int k, int l)
    {
        mHideOnContentScrollReference = mHideOnContentScrollReference + j;
        setActionBarHideOffset(mHideOnContentScrollReference);
    }

    public void onNestedScrollAccepted(View view, View view1, int i)
    {
        mParentHelper.mNestedScrollAxes = i;
        if (mActionBarTop != null)
        {
            i = -(int)ViewCompat.getTranslationY(mActionBarTop);
        } else
        {
            i = 0;
        }
        mHideOnContentScrollReference = i;
        haltActionBarHideOffsetAnimations();
        if (mActionBarVisibilityCallback != null)
        {
            mActionBarVisibilityCallback.onContentScrollStarted();
        }
    }

    public boolean onStartNestedScroll(View view, View view1, int i)
    {
        if ((i & 2) == 0 || mActionBarTop.getVisibility() != 0)
        {
            return false;
        } else
        {
            return mHideOnContentScroll;
        }
    }

    public void onStopNestedScroll(View view)
    {
label0:
        {
            if (mHideOnContentScroll && !mAnimatingForFling)
            {
                if (mHideOnContentScrollReference > mActionBarTop.getHeight())
                {
                    break label0;
                }
                haltActionBarHideOffsetAnimations();
                postDelayed(mRemoveActionBarHideOffset, 600L);
            }
            return;
        }
        haltActionBarHideOffsetAnimations();
        postDelayed(mAddActionBarHideOffset, 600L);
    }

    public void onWindowSystemUiVisibilityChanged(int i)
    {
        boolean flag2 = true;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        pullChildren();
        int j = mLastSystemUiVisibility;
        mLastSystemUiVisibility = i;
        boolean flag;
        boolean flag1;
        if ((i & 4) == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((i & 0x100) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (mActionBarVisibilityCallback != null)
        {
            ActionBarVisibilityCallback actionbarvisibilitycallback = mActionBarVisibilityCallback;
            if (flag1)
            {
                flag2 = false;
            }
            actionbarvisibilitycallback.enableContentAnimations(flag2);
            if (flag || !flag1)
            {
                mActionBarVisibilityCallback.showForSystem();
            } else
            {
                mActionBarVisibilityCallback.hideForSystem();
            }
        }
        if (((j ^ i) & 0x100) != 0 && mActionBarVisibilityCallback != null)
        {
            ViewCompat.requestApplyInsets(this);
        }
    }

    protected void onWindowVisibilityChanged(int i)
    {
        super.onWindowVisibilityChanged(i);
        mWindowVisibility = i;
        if (mActionBarVisibilityCallback != null)
        {
            mActionBarVisibilityCallback.onWindowVisibilityChanged(i);
        }
    }

    public final void setHideOnContentScrollEnabled(boolean flag)
    {
        if (flag != mHideOnContentScroll)
        {
            mHideOnContentScroll = flag;
            if (!flag)
            {
                haltActionBarHideOffsetAnimations();
                setActionBarHideOffset(0);
            }
        }
    }

    public final void setMenu(Menu menu, android.support.v7.internal.view.menu.MenuPresenter.Callback callback)
    {
        pullChildren();
        mDecorToolbar.setMenu(menu, callback);
    }

    public final void setMenuPrepared()
    {
        pullChildren();
        mDecorToolbar.setMenuPrepared();
    }

    public final void setWindowCallback(android.view.Window.Callback callback)
    {
        pullChildren();
        mDecorToolbar.setWindowCallback(callback);
    }

    public final void setWindowTitle(CharSequence charsequence)
    {
        pullChildren();
        mDecorToolbar.setWindowTitle(charsequence);
    }

    public boolean shouldDelayChildPressedState()
    {
        return false;
    }

    public final boolean showOverflowMenu()
    {
        pullChildren();
        return mDecorToolbar.showOverflowMenu();
    }



/*
    static ViewPropertyAnimatorCompat access$002(ActionBarOverlayLayout actionbaroverlaylayout, ViewPropertyAnimatorCompat viewpropertyanimatorcompat)
    {
        actionbaroverlaylayout.mCurrentActionBarTopAnimator = viewpropertyanimatorcompat;
        return viewpropertyanimatorcompat;
    }

*/


/*
    static boolean access$102$d909110(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        actionbaroverlaylayout.mAnimatingForFling = false;
        return false;
    }

*/


/*
    static ViewPropertyAnimatorCompat access$202(ActionBarOverlayLayout actionbaroverlaylayout, ViewPropertyAnimatorCompat viewpropertyanimatorcompat)
    {
        actionbaroverlaylayout.mCurrentActionBarBottomAnimator = viewpropertyanimatorcompat;
        return viewpropertyanimatorcompat;
    }

*/





}
