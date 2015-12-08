// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.internal.widget.TintManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.design.widget:
//            ViewUtils, AnimationUtils, ValueAnimatorCompat, MathUtils

public class TabLayout extends HorizontalScrollView
{
    public static interface Mode
        extends Annotation
    {
    }

    public static interface OnTabSelectedListener
    {

        public abstract void onTabReselected(Tab tab);

        public abstract void onTabSelected(Tab tab);

        public abstract void onTabUnselected(Tab tab);
    }

    private class SlidingTabStrip extends LinearLayout
    {

        private int mIndicatorLeft;
        private int mIndicatorRight;
        private int mSelectedIndicatorHeight;
        private final Paint mSelectedIndicatorPaint = new Paint();
        private int mSelectedPosition;
        private float mSelectionOffset;
        final TabLayout this$0;

        private void setIndicatorPosition(int i, int j)
        {
            if (i != mIndicatorLeft || j != mIndicatorRight)
            {
                mIndicatorLeft = i;
                mIndicatorRight = j;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        private void updateIndicatorPosition()
        {
            View view = getChildAt(mSelectedPosition);
            int i;
            int j;
            if (view != null && view.getWidth() > 0)
            {
                int l = view.getLeft();
                int k = view.getRight();
                i = l;
                j = k;
                if (mSelectionOffset > 0.0F)
                {
                    i = l;
                    j = k;
                    if (mSelectedPosition < getChildCount() - 1)
                    {
                        View view1 = getChildAt(mSelectedPosition + 1);
                        float f = mSelectionOffset;
                        float f1 = view1.getLeft();
                        float f2 = mSelectionOffset;
                        i = (int)((float)l * (1.0F - f2) + f * f1);
                        f = mSelectionOffset;
                        f1 = view1.getRight();
                        f2 = mSelectionOffset;
                        j = (int)((float)k * (1.0F - f2) + f1 * f);
                    }
                }
            } else
            {
                i = -1;
                j = -1;
            }
            setIndicatorPosition(i, j);
        }

        void animateIndicatorToPosition(final int position, int i)
        {
            final int startLeft;
            final int startRight;
            final int targetLeft;
            final int targetRight;
            class _cls1
                implements ValueAnimatorCompat.AnimatorUpdateListener
            {

                final SlidingTabStrip this$1;
                final int val$startLeft;
                final int val$startRight;
                final int val$targetLeft;
                final int val$targetRight;

                public void onAnimationUpdate(ValueAnimatorCompat valueanimatorcompat)
                {
                    float f = valueanimatorcompat.getAnimatedFraction();
                    setIndicatorPosition(AnimationUtils.lerp(startLeft, targetLeft, f), AnimationUtils.lerp(startRight, targetRight, f));
                }

                _cls1()
                {
                    this$1 = SlidingTabStrip.this;
                    startLeft = i;
                    targetLeft = j;
                    startRight = k;
                    targetRight = l;
                    super();
                }
            }

            class _cls2 extends ValueAnimatorCompat.AnimatorListenerAdapter
            {

                final SlidingTabStrip this$1;
                final int val$position;

                public void onAnimationCancel(ValueAnimatorCompat valueanimatorcompat)
                {
                    mSelectedPosition = position;
                    mSelectionOffset = 0.0F;
                }

                public void onAnimationEnd(ValueAnimatorCompat valueanimatorcompat)
                {
                    mSelectedPosition = position;
                    mSelectionOffset = 0.0F;
                }

                _cls2()
                {
                    this$1 = SlidingTabStrip.this;
                    position = i;
                    super();
                }
            }

            Object obj;
            if (ViewCompat.getLayoutDirection(this) == 1)
            {
                startLeft = 1;
            } else
            {
                startLeft = 0;
            }
            obj = getChildAt(position);
            targetLeft = ((View) (obj)).getLeft();
            targetRight = ((View) (obj)).getRight();
            if (Math.abs(position - mSelectedPosition) > 1) goto _L2; else goto _L1
_L1:
            startLeft = mIndicatorLeft;
            startRight = mIndicatorRight;
_L4:
            if (startLeft != targetLeft || startRight != targetRight)
            {
                obj = mIndicatorAnimator = ViewUtils.createAnimator();
                ((ValueAnimatorCompat) (obj)).setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
                ((ValueAnimatorCompat) (obj)).setDuration(i);
                ((ValueAnimatorCompat) (obj)).setFloatValues(0.0F, 1.0F);
                ((ValueAnimatorCompat) (obj)).setUpdateListener(new _cls1());
                ((ValueAnimatorCompat) (obj)).setListener(new _cls2());
                ((ValueAnimatorCompat) (obj)).start();
            }
            return;
_L2:
            startRight = dpToPx(24);
            if (position < mSelectedPosition)
            {
                if (startLeft == 0)
                {
                    startRight = targetRight + startRight;
                    startLeft = startRight;
                    continue; /* Loop/switch isn't completed */
                }
            } else
            if (startLeft != 0)
            {
                startRight = targetRight + startRight;
                startLeft = startRight;
                continue; /* Loop/switch isn't completed */
            }
            startRight = targetLeft - startRight;
            startLeft = startRight;
            if (true) goto _L4; else goto _L3
_L3:
        }

        boolean childrenNeedLayout()
        {
            boolean flag1 = false;
            int j = getChildCount();
            int i = 0;
            do
            {
label0:
                {
                    boolean flag = flag1;
                    if (i < j)
                    {
                        if (getChildAt(i).getWidth() > 0)
                        {
                            break label0;
                        }
                        flag = true;
                    }
                    return flag;
                }
                i++;
            } while (true);
        }

        public void draw(Canvas canvas)
        {
            super.draw(canvas);
            if (mIndicatorLeft >= 0 && mIndicatorRight > mIndicatorLeft)
            {
                canvas.drawRect(mIndicatorLeft, getHeight() - mSelectedIndicatorHeight, mIndicatorRight, getHeight(), mSelectedIndicatorPaint);
            }
        }

        protected void onLayout(boolean flag, int i, int j, int k, int l)
        {
            super.onLayout(flag, i, j, k, l);
            updateIndicatorPosition();
        }

        protected void onMeasure(int i, int j)
        {
            super.onMeasure(i, j);
            break MISSING_BLOCK_LABEL_6;
            if (android.view.View.MeasureSpec.getMode(i) == 0x40000000 && mMode == 1 && mTabGravity == 1)
            {
                int k1 = getChildCount();
                int l1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                int l = 0;
                int k = 0;
                for (; l < k1; l++)
                {
                    View view = getChildAt(l);
                    view.measure(l1, j);
                    k = Math.max(k, view.getMeasuredWidth());
                }

                if (k > 0)
                {
                    int i1 = dpToPx(16);
                    if (k * k1 <= getMeasuredWidth() - i1 * 2)
                    {
                        for (int j1 = 0; j1 < k1; j1++)
                        {
                            android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)getChildAt(j1).getLayoutParams();
                            layoutparams.width = k;
                            layoutparams.weight = 0.0F;
                        }

                    } else
                    {
                        mTabGravity = 0;
                        updateTabViewsLayoutParams();
                    }
                    super.onMeasure(i, j);
                    return;
                }
            }
            return;
        }

        void setIndicatorPositionFromTabPosition(int i, float f)
        {
            if (mIndicatorAnimator != null && mIndicatorAnimator.isRunning())
            {
                return;
            } else
            {
                mSelectedPosition = i;
                mSelectionOffset = f;
                updateIndicatorPosition();
                return;
            }
        }

        void setSelectedIndicatorColor(int i)
        {
            mSelectedIndicatorPaint.setColor(i);
            ViewCompat.postInvalidateOnAnimation(this);
        }

        void setSelectedIndicatorHeight(int i)
        {
            mSelectedIndicatorHeight = i;
            ViewCompat.postInvalidateOnAnimation(this);
        }



/*
        static int access$1702(SlidingTabStrip slidingtabstrip, int i)
        {
            slidingtabstrip.mSelectedPosition = i;
            return i;
        }

*/


/*
        static float access$1802(SlidingTabStrip slidingtabstrip, float f)
        {
            slidingtabstrip.mSelectionOffset = f;
            return f;
        }

*/

        SlidingTabStrip(Context context)
        {
            this$0 = TabLayout.this;
            super(context);
            mSelectedPosition = -1;
            mIndicatorLeft = -1;
            mIndicatorRight = -1;
            setWillNotDraw(false);
        }
    }

    public static final class Tab
    {

        public static final int INVALID_POSITION = -1;
        private CharSequence mContentDesc;
        private View mCustomView;
        private Drawable mIcon;
        private final TabLayout mParent;
        private int mPosition;
        private Object mTag;
        private CharSequence mText;

        public final CharSequence getContentDescription()
        {
            return mContentDesc;
        }

        final View getCustomView()
        {
            return mCustomView;
        }

        public final Drawable getIcon()
        {
            return mIcon;
        }

        public final int getPosition()
        {
            return mPosition;
        }

        public final Object getTag()
        {
            return mTag;
        }

        public final CharSequence getText()
        {
            return mText;
        }

        public final boolean isSelected()
        {
            return mParent.getSelectedTabPosition() == mPosition;
        }

        public final void select()
        {
            mParent.selectTab(this);
        }

        public final Tab setContentDescription(int i)
        {
            return setContentDescription(mParent.getResources().getText(i));
        }

        public final Tab setContentDescription(CharSequence charsequence)
        {
            mContentDesc = charsequence;
            if (mPosition >= 0)
            {
                mParent.updateTab(mPosition);
            }
            return this;
        }

        public final Tab setCustomView(int i)
        {
            return setCustomView(LayoutInflater.from(mParent.getContext()).inflate(i, null));
        }

        public final Tab setCustomView(View view)
        {
            mCustomView = view;
            if (mPosition >= 0)
            {
                mParent.updateTab(mPosition);
            }
            return this;
        }

        public final Tab setIcon(int i)
        {
            return setIcon(TintManager.getDrawable(mParent.getContext(), i));
        }

        public final Tab setIcon(Drawable drawable)
        {
            mIcon = drawable;
            if (mPosition >= 0)
            {
                mParent.updateTab(mPosition);
            }
            return this;
        }

        final void setPosition(int i)
        {
            mPosition = i;
        }

        public final Tab setTag(Object obj)
        {
            mTag = obj;
            return this;
        }

        public final Tab setText(int i)
        {
            return setText(mParent.getResources().getText(i));
        }

        public final Tab setText(CharSequence charsequence)
        {
            mText = charsequence;
            if (mPosition >= 0)
            {
                mParent.updateTab(mPosition);
            }
            return this;
        }


        Tab(TabLayout tablayout)
        {
            mPosition = -1;
            mParent = tablayout;
        }
    }

    public static interface TabGravity
        extends Annotation
    {
    }

    public static class TabLayoutOnPageChangeListener
        implements android.support.v4.view.ViewPager.OnPageChangeListener
    {

        private int mPreviousScrollState;
        private int mScrollState;
        private final WeakReference mTabLayoutRef;

        public void onPageScrollStateChanged(int i)
        {
            mPreviousScrollState = mScrollState;
            mScrollState = i;
        }

        public void onPageScrolled(int i, float f, int j)
        {
            boolean flag1 = true;
            TabLayout tablayout = (TabLayout)mTabLayoutRef.get();
            if (tablayout != null)
            {
                boolean flag = flag1;
                if (mScrollState != 1)
                {
                    if (mScrollState == 2 && mPreviousScrollState == 1)
                    {
                        flag = flag1;
                    } else
                    {
                        flag = false;
                    }
                }
                tablayout.setScrollPosition(i, f, flag);
            }
        }

        public void onPageSelected(int i)
        {
            TabLayout tablayout = (TabLayout)mTabLayoutRef.get();
            if (tablayout != null)
            {
                Tab tab = tablayout.getTabAt(i);
                boolean flag;
                if (mScrollState == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                tablayout.selectTab(tab, flag);
            }
        }

        public TabLayoutOnPageChangeListener(TabLayout tablayout)
        {
            mTabLayoutRef = new WeakReference(tablayout);
        }
    }

    class TabView extends LinearLayout
        implements android.view.View.OnLongClickListener
    {

        private ImageView mCustomIconView;
        private TextView mCustomTextView;
        private View mCustomView;
        private ImageView mIconView;
        private final Tab mTab;
        private TextView mTextView;
        final TabLayout this$0;

        private void updateTextAndIcon(Tab tab, TextView textview, ImageView imageview)
        {
            Drawable drawable = tab.getIcon();
            CharSequence charsequence = tab.getText();
            boolean flag;
            if (imageview != null)
            {
                if (drawable != null)
                {
                    imageview.setImageDrawable(drawable);
                    imageview.setVisibility(0);
                    setVisibility(0);
                } else
                {
                    imageview.setVisibility(8);
                    imageview.setImageDrawable(null);
                }
                imageview.setContentDescription(tab.getContentDescription());
            }
            if (!TextUtils.isEmpty(charsequence))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (textview != null)
            {
                if (flag)
                {
                    textview.setText(charsequence);
                    textview.setContentDescription(tab.getContentDescription());
                    textview.setVisibility(0);
                    setVisibility(0);
                } else
                {
                    textview.setVisibility(8);
                    textview.setText(null);
                }
            }
            if (!flag && !TextUtils.isEmpty(tab.getContentDescription()))
            {
                setOnLongClickListener(this);
                return;
            } else
            {
                setOnLongClickListener(null);
                setLongClickable(false);
                return;
            }
        }

        public Tab getTab()
        {
            return mTab;
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
        {
            super.onInitializeAccessibilityEvent(accessibilityevent);
            accessibilityevent.setClassName(android/support/v7/app/ActionBar$Tab.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
        {
            super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
            accessibilitynodeinfo.setClassName(android/support/v7/app/ActionBar$Tab.getName());
        }

        public boolean onLongClick(View view)
        {
            view = new int[2];
            getLocationOnScreen(view);
            Object obj = getContext();
            int i = getWidth();
            int j = getHeight();
            int k = ((Context) (obj)).getResources().getDisplayMetrics().widthPixels;
            obj = Toast.makeText(((Context) (obj)), mTab.getContentDescription(), 0);
            ((Toast) (obj)).setGravity(49, (view[0] + i / 2) - k / 2, j);
            ((Toast) (obj)).show();
            return true;
        }

        public void onMeasure(int i, int j)
        {
            super.onMeasure(i, j);
            i = getMeasuredWidth();
            if (i < mTabMinWidth || i > mTabMaxWidth)
            {
                super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(MathUtils.constrain(i, mTabMinWidth, mTabMaxWidth), 0x40000000), j);
            }
        }

        public void setSelected(boolean flag)
        {
            boolean flag1;
            if (isSelected() != flag)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            super.setSelected(flag);
            if (flag1 && flag)
            {
                sendAccessibilityEvent(4);
                if (mTextView != null)
                {
                    mTextView.setSelected(flag);
                }
                if (mIconView != null)
                {
                    mIconView.setSelected(flag);
                }
            }
        }

        final void update()
        {
            Tab tab = mTab;
            View view = tab.getCustomView();
            if (view != null)
            {
                android.view.ViewParent viewparent = view.getParent();
                if (viewparent != this)
                {
                    if (viewparent != null)
                    {
                        ((ViewGroup)viewparent).removeView(view);
                    }
                    addView(view);
                }
                mCustomView = view;
                if (mTextView != null)
                {
                    mTextView.setVisibility(8);
                }
                if (mIconView != null)
                {
                    mIconView.setVisibility(8);
                    mIconView.setImageDrawable(null);
                }
                mCustomTextView = (TextView)view.findViewById(0x1020014);
                mCustomIconView = (ImageView)view.findViewById(0x1020006);
            } else
            {
                if (mCustomView != null)
                {
                    removeView(mCustomView);
                    mCustomView = null;
                }
                mCustomTextView = null;
                mCustomIconView = null;
            }
            if (mCustomView == null)
            {
                if (mIconView == null)
                {
                    ImageView imageview = (ImageView)LayoutInflater.from(getContext()).inflate(android.support.design.R.layout.layout_tab_icon, this, false);
                    addView(imageview, 0);
                    mIconView = imageview;
                }
                if (mTextView == null)
                {
                    TextView textview = (TextView)LayoutInflater.from(getContext()).inflate(android.support.design.R.layout.layout_tab_text, this, false);
                    addView(textview);
                    mTextView = textview;
                }
                mTextView.setTextAppearance(getContext(), mTabTextAppearance);
                if (mTabTextColors != null)
                {
                    mTextView.setTextColor(mTabTextColors);
                }
                updateTextAndIcon(tab, mTextView, mIconView);
            } else
            if (mCustomTextView != null || mCustomIconView != null)
            {
                updateTextAndIcon(tab, mCustomTextView, mCustomIconView);
                return;
            }
        }

        public TabView(Context context, Tab tab)
        {
            this$0 = TabLayout.this;
            super(context);
            mTab = tab;
            if (mTabBackgroundResId != 0)
            {
                setBackgroundDrawable(TintManager.getDrawable(context, mTabBackgroundResId));
            }
            ViewCompat.setPaddingRelative(this, mTabPaddingStart, mTabPaddingTop, mTabPaddingEnd, mTabPaddingBottom);
            setGravity(17);
            update();
        }
    }

    public static class ViewPagerOnTabSelectedListener
        implements OnTabSelectedListener
    {

        private final ViewPager mViewPager;

        public void onTabReselected(Tab tab)
        {
        }

        public void onTabSelected(Tab tab)
        {
            mViewPager.setCurrentItem(tab.getPosition());
        }

        public void onTabUnselected(Tab tab)
        {
        }

        public ViewPagerOnTabSelectedListener(ViewPager viewpager)
        {
            mViewPager = viewpager;
        }
    }


    private static final int ANIMATION_DURATION = 300;
    private static final int DEFAULT_HEIGHT = 48;
    private static final int FIXED_WRAP_GUTTER_MIN = 16;
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_FILL = 0;
    private static final int MAX_TAB_TEXT_LINES = 2;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    private static final int MOTION_NON_ADJACENT_OFFSET = 24;
    private static final int TAB_MIN_WIDTH_MARGIN = 56;
    private int mContentInsetStart;
    private ValueAnimatorCompat mIndicatorAnimator;
    private int mMode;
    private OnTabSelectedListener mOnTabSelectedListener;
    private final int mRequestedTabMaxWidth;
    private ValueAnimatorCompat mScrollAnimator;
    private Tab mSelectedTab;
    private final int mTabBackgroundResId;
    private android.view.View.OnClickListener mTabClickListener;
    private int mTabGravity;
    private int mTabMaxWidth;
    private final int mTabMinWidth;
    private int mTabPaddingBottom;
    private int mTabPaddingEnd;
    private int mTabPaddingStart;
    private int mTabPaddingTop;
    private final SlidingTabStrip mTabStrip;
    private int mTabTextAppearance;
    private ColorStateList mTabTextColors;
    private final ArrayList mTabs;

    public TabLayout(Context context)
    {
        this(context, null);
    }

    public TabLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TabLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mTabs = new ArrayList();
        setHorizontalScrollBarEnabled(false);
        setFillViewport(true);
        mTabStrip = new SlidingTabStrip(context);
        addView(mTabStrip, -2, -1);
        context = context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.TabLayout, i, android.support.design.R.style.Widget_Design_TabLayout);
        mTabStrip.setSelectedIndicatorHeight(context.getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabIndicatorHeight, 0));
        mTabStrip.setSelectedIndicatorColor(context.getColor(android.support.design.R.styleable.TabLayout_tabIndicatorColor, 0));
        mTabTextAppearance = context.getResourceId(android.support.design.R.styleable.TabLayout_tabTextAppearance, android.support.design.R.style.TextAppearance_Design_Tab);
        i = context.getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabPadding, 0);
        mTabPaddingBottom = i;
        mTabPaddingEnd = i;
        mTabPaddingTop = i;
        mTabPaddingStart = i;
        mTabPaddingStart = context.getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabPaddingStart, mTabPaddingStart);
        mTabPaddingTop = context.getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabPaddingTop, mTabPaddingTop);
        mTabPaddingEnd = context.getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabPaddingEnd, mTabPaddingEnd);
        mTabPaddingBottom = context.getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabPaddingBottom, mTabPaddingBottom);
        mTabTextColors = loadTextColorFromTextAppearance(mTabTextAppearance);
        if (context.hasValue(android.support.design.R.styleable.TabLayout_tabTextColor))
        {
            mTabTextColors = context.getColorStateList(android.support.design.R.styleable.TabLayout_tabTextColor);
        }
        if (context.hasValue(android.support.design.R.styleable.TabLayout_tabSelectedTextColor))
        {
            i = context.getColor(android.support.design.R.styleable.TabLayout_tabSelectedTextColor, 0);
            mTabTextColors = createColorStateList(mTabTextColors.getDefaultColor(), i);
        }
        mTabMinWidth = context.getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabMinWidth, 0);
        mRequestedTabMaxWidth = context.getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabMaxWidth, 0);
        mTabBackgroundResId = context.getResourceId(android.support.design.R.styleable.TabLayout_tabBackground, 0);
        mContentInsetStart = context.getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabContentStart, 0);
        mMode = context.getInt(android.support.design.R.styleable.TabLayout_tabMode, 1);
        mTabGravity = context.getInt(android.support.design.R.styleable.TabLayout_tabGravity, 0);
        context.recycle();
        applyModeAndGravity();
    }

    private void addTabView(Tab tab, int i, boolean flag)
    {
        tab = createTabView(tab);
        mTabStrip.addView(tab, i, createLayoutParamsForTabs());
        if (flag)
        {
            tab.setSelected(true);
        }
    }

    private void addTabView(Tab tab, boolean flag)
    {
        tab = createTabView(tab);
        mTabStrip.addView(tab, createLayoutParamsForTabs());
        if (flag)
        {
            tab.setSelected(true);
        }
    }

    private void animateToTab(int i)
    {
        if (i == -1)
        {
            return;
        }
        if (getWindowToken() == null || !ViewCompat.isLaidOut(this) || mTabStrip.childrenNeedLayout())
        {
            setScrollPosition(i, 0.0F, true);
            return;
        }
        int j = getScrollX();
        int k = calculateScrollXForTab(i, 0.0F);
        if (j != k)
        {
            if (mScrollAnimator == null)
            {
                mScrollAnimator = ViewUtils.createAnimator();
                mScrollAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
                mScrollAnimator.setDuration(300);
                mScrollAnimator.setUpdateListener(new _cls2());
            }
            mScrollAnimator.setIntValues(j, k);
            mScrollAnimator.start();
        }
        mTabStrip.animateIndicatorToPosition(i, 300);
    }

    private void applyModeAndGravity()
    {
        int i;
        if (mMode == 0)
        {
            i = Math.max(0, mContentInsetStart - mTabPaddingStart);
        } else
        {
            i = 0;
        }
        ViewCompat.setPaddingRelative(mTabStrip, i, 0, 0, 0);
        mMode;
        JVM INSTR tableswitch 0 1: default 60
    //                   0 76
    //                   1 65;
           goto _L1 _L2 _L3
_L1:
        updateTabViewsLayoutParams();
        return;
_L3:
        mTabStrip.setGravity(1);
        continue; /* Loop/switch isn't completed */
_L2:
        mTabStrip.setGravity(0x800003);
        if (true) goto _L1; else goto _L4
_L4:
    }

    private int calculateScrollXForTab(int i, float f)
    {
        int j = 0;
        int k = 0;
        if (mMode == 0)
        {
            View view1 = mTabStrip.getChildAt(i);
            View view;
            if (i + 1 < mTabStrip.getChildCount())
            {
                view = mTabStrip.getChildAt(i + 1);
            } else
            {
                view = null;
            }
            if (view1 != null)
            {
                i = view1.getWidth();
            } else
            {
                i = 0;
            }
            j = k;
            if (view != null)
            {
                j = view.getWidth();
            }
            k = view1.getLeft();
            j = ((int)((float)(j + i) * f * 0.5F) + k + view1.getWidth() / 2) - getWidth() / 2;
        }
        return j;
    }

    private void configureTab(Tab tab, int i)
    {
        tab.setPosition(i);
        mTabs.add(i, tab);
        int j = mTabs.size();
        for (i++; i < j; i++)
        {
            ((Tab)mTabs.get(i)).setPosition(i);
        }

    }

    private static ColorStateList createColorStateList(int i, int j)
    {
        return new ColorStateList(new int[][] {
            SELECTED_STATE_SET, EMPTY_STATE_SET
        }, new int[] {
            j, i
        });
    }

    private android.widget.LinearLayout.LayoutParams createLayoutParamsForTabs()
    {
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -1);
        updateTabViewLayoutParams(layoutparams);
        return layoutparams;
    }

    private TabView createTabView(Tab tab)
    {
        tab = new TabView(getContext(), tab);
        tab.setFocusable(true);
        if (mTabClickListener == null)
        {
            mTabClickListener = new _cls1();
        }
        tab.setOnClickListener(mTabClickListener);
        return tab;
    }

    private int dpToPx(int i)
    {
        return Math.round(getResources().getDisplayMetrics().density * (float)i);
    }

    private ColorStateList loadTextColorFromTextAppearance(int i)
    {
        TypedArray typedarray = getContext().obtainStyledAttributes(i, android.support.design.R.styleable.TextAppearance);
        ColorStateList colorstatelist = typedarray.getColorStateList(android.support.design.R.styleable.TextAppearance_android_textColor);
        typedarray.recycle();
        return colorstatelist;
        Exception exception;
        exception;
        typedarray.recycle();
        throw exception;
    }

    private void removeTabViewAt(int i)
    {
        mTabStrip.removeViewAt(i);
        requestLayout();
    }

    private void setSelectedTabView(int i)
    {
        int k = mTabStrip.getChildCount();
        int j = 0;
        while (j < k) 
        {
            View view = mTabStrip.getChildAt(j);
            boolean flag;
            if (j == i)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setSelected(flag);
            j++;
        }
    }

    private void updateAllTabs()
    {
        int i = 0;
        for (int j = mTabStrip.getChildCount(); i < j; i++)
        {
            updateTab(i);
        }

    }

    private void updateTab(int i)
    {
        TabView tabview = (TabView)mTabStrip.getChildAt(i);
        if (tabview != null)
        {
            tabview.update();
        }
    }

    private void updateTabViewLayoutParams(android.widget.LinearLayout.LayoutParams layoutparams)
    {
        if (mMode == 1 && mTabGravity == 0)
        {
            layoutparams.width = 0;
            layoutparams.weight = 1.0F;
            return;
        } else
        {
            layoutparams.width = -2;
            layoutparams.weight = 0.0F;
            return;
        }
    }

    private void updateTabViewsLayoutParams()
    {
        for (int i = 0; i < mTabStrip.getChildCount(); i++)
        {
            View view = mTabStrip.getChildAt(i);
            updateTabViewLayoutParams((android.widget.LinearLayout.LayoutParams)view.getLayoutParams());
            view.requestLayout();
        }

    }

    public void addTab(Tab tab)
    {
        addTab(tab, mTabs.isEmpty());
    }

    public void addTab(Tab tab, int i)
    {
        addTab(tab, i, mTabs.isEmpty());
    }

    public void addTab(Tab tab, int i, boolean flag)
    {
        if (tab.mParent != this)
        {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        addTabView(tab, i, flag);
        configureTab(tab, i);
        if (flag)
        {
            tab.select();
        }
    }

    public void addTab(Tab tab, boolean flag)
    {
        if (tab.mParent != this)
        {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        addTabView(tab, flag);
        configureTab(tab, mTabs.size());
        if (flag)
        {
            tab.select();
        }
    }

    public int getSelectedTabPosition()
    {
        if (mSelectedTab != null)
        {
            return mSelectedTab.getPosition();
        } else
        {
            return -1;
        }
    }

    public Tab getTabAt(int i)
    {
        return (Tab)mTabs.get(i);
    }

    public int getTabCount()
    {
        return mTabs.size();
    }

    public int getTabGravity()
    {
        return mTabGravity;
    }

    public int getTabMode()
    {
        return mMode;
    }

    public ColorStateList getTabTextColors()
    {
        return mTabTextColors;
    }

    public Tab newTab()
    {
        return new Tab(this);
    }

    protected void onMeasure(int i, int j)
    {
        int k = dpToPx(48) + getPaddingTop() + getPaddingBottom();
        android.view.View.MeasureSpec.getMode(j);
        JVM INSTR lookupswitch 2: default 48
    //                   -2147483648: 161
    //                   0: 180;
           goto _L1 _L2 _L3
_L1:
label0:
        {
            super.onMeasure(i, j);
            if (mMode == 1 && getChildCount() == 1)
            {
                View view = getChildAt(0);
                i = getMeasuredWidth();
                if (view.getMeasuredWidth() > i)
                {
                    j = getChildMeasureSpec(j, getPaddingTop() + getPaddingBottom(), view.getLayoutParams().height);
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), j);
                }
            }
            j = mRequestedTabMaxWidth;
            k = getMeasuredWidth() - dpToPx(56);
            if (j != 0)
            {
                i = j;
                if (j <= k)
                {
                    break label0;
                }
            }
            i = k;
        }
        mTabMaxWidth = i;
        return;
_L2:
        j = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(k, android.view.View.MeasureSpec.getSize(j)), 0x40000000);
        continue; /* Loop/switch isn't completed */
_L3:
        j = android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000);
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void removeAllTabs()
    {
        mTabStrip.removeAllViews();
        for (Iterator iterator = mTabs.iterator(); iterator.hasNext(); iterator.remove())
        {
            ((Tab)iterator.next()).setPosition(-1);
        }

        mSelectedTab = null;
    }

    public void removeTab(Tab tab)
    {
        if (tab.mParent != this)
        {
            throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
        } else
        {
            removeTabAt(tab.getPosition());
            return;
        }
    }

    public void removeTabAt(int i)
    {
        Tab tab;
        int j;
        int l;
        if (mSelectedTab != null)
        {
            j = mSelectedTab.getPosition();
        } else
        {
            j = 0;
        }
        removeTabViewAt(i);
        tab = (Tab)mTabs.remove(i);
        if (tab != null)
        {
            tab.setPosition(-1);
        }
        l = mTabs.size();
        for (int k = i; k < l; k++)
        {
            ((Tab)mTabs.get(k)).setPosition(k);
        }

        if (j == i)
        {
            Tab tab1;
            if (mTabs.isEmpty())
            {
                tab1 = null;
            } else
            {
                tab1 = (Tab)mTabs.get(Math.max(0, i - 1));
            }
            selectTab(tab1);
        }
    }

    void selectTab(Tab tab)
    {
        selectTab(tab, true);
    }

    void selectTab(Tab tab, boolean flag)
    {
        if (mSelectedTab == tab)
        {
            if (mSelectedTab != null)
            {
                if (mOnTabSelectedListener != null)
                {
                    mOnTabSelectedListener.onTabReselected(mSelectedTab);
                }
                animateToTab(tab.getPosition());
            }
        } else
        {
            int i;
            if (tab != null)
            {
                i = tab.getPosition();
            } else
            {
                i = -1;
            }
            setSelectedTabView(i);
            if (flag)
            {
                if ((mSelectedTab == null || mSelectedTab.getPosition() == -1) && i != -1)
                {
                    setScrollPosition(i, 0.0F, true);
                } else
                {
                    animateToTab(i);
                }
            }
            if (mSelectedTab != null && mOnTabSelectedListener != null)
            {
                mOnTabSelectedListener.onTabUnselected(mSelectedTab);
            }
            mSelectedTab = tab;
            if (mSelectedTab != null && mOnTabSelectedListener != null)
            {
                mOnTabSelectedListener.onTabSelected(mSelectedTab);
                return;
            }
        }
    }

    public void setOnTabSelectedListener(OnTabSelectedListener ontabselectedlistener)
    {
        mOnTabSelectedListener = ontabselectedlistener;
    }

    public void setScrollPosition(int i, float f, boolean flag)
    {
        if ((mIndicatorAnimator == null || !mIndicatorAnimator.isRunning()) && i >= 0 && i < mTabStrip.getChildCount())
        {
            mTabStrip.setIndicatorPositionFromTabPosition(i, f);
            scrollTo(calculateScrollXForTab(i, f), 0);
            if (flag)
            {
                setSelectedTabView(Math.round((float)i + f));
                return;
            }
        }
    }

    public void setTabGravity(int i)
    {
        if (mTabGravity != i)
        {
            mTabGravity = i;
            applyModeAndGravity();
        }
    }

    public void setTabMode(int i)
    {
        if (i != mMode)
        {
            mMode = i;
            applyModeAndGravity();
        }
    }

    public void setTabTextColors(int i, int j)
    {
        setTabTextColors(createColorStateList(i, j));
    }

    public void setTabTextColors(ColorStateList colorstatelist)
    {
        if (mTabTextColors != colorstatelist)
        {
            mTabTextColors = colorstatelist;
            updateAllTabs();
        }
    }

    public void setTabsFromPagerAdapter(PagerAdapter pageradapter)
    {
        removeAllTabs();
        int i = 0;
        for (int j = pageradapter.getCount(); i < j; i++)
        {
            addTab(newTab().setText(pageradapter.getPageTitle(i)));
        }

    }

    public void setupWithViewPager(ViewPager viewpager)
    {
        PagerAdapter pageradapter = viewpager.getAdapter();
        if (pageradapter == null)
        {
            throw new IllegalArgumentException("ViewPager does not have a PagerAdapter set");
        }
        setTabsFromPagerAdapter(pageradapter);
        viewpager.addOnPageChangeListener(new TabLayoutOnPageChangeListener(this));
        setOnTabSelectedListener(new ViewPagerOnTabSelectedListener(viewpager));
        if (mSelectedTab == null || mSelectedTab.getPosition() != viewpager.getCurrentItem())
        {
            getTabAt(viewpager.getCurrentItem()).select();
        }
    }





/*
    static ValueAnimatorCompat access$1102(TabLayout tablayout, ValueAnimatorCompat valueanimatorcompat)
    {
        tablayout.mIndicatorAnimator = valueanimatorcompat;
        return valueanimatorcompat;
    }

*/




/*
    static int access$1302(TabLayout tablayout, int i)
    {
        tablayout.mTabGravity = i;
        return i;
    }

*/











    private class _cls2
        implements ValueAnimatorCompat.AnimatorUpdateListener
    {

        final TabLayout this$0;

        public void onAnimationUpdate(ValueAnimatorCompat valueanimatorcompat)
        {
            scrollTo(valueanimatorcompat.getAnimatedIntValue(), 0);
        }

        _cls2()
        {
            this$0 = TabLayout.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final TabLayout this$0;

        public void onClick(View view)
        {
            ((TabView)view).getTab().select();
        }

        _cls1()
        {
            this$0 = TabLayout.this;
            super();
        }
    }

}
