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
import android.support.v4.widget.TextViewCompat;
import android.support.v7.widget.TintManager;
import android.text.Layout;
import android.text.TextPaint;
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
//            ThemeUtils, ViewUtils, AnimationUtils, ValueAnimatorCompat

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

        private ValueAnimatorCompat mCurrentAnimator;
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
                i = k;
                j = l;
                if (mSelectionOffset > 0.0F)
                {
                    i = k;
                    j = l;
                    if (mSelectedPosition < getChildCount() - 1)
                    {
                        View view1 = getChildAt(mSelectedPosition + 1);
                        float f = mSelectionOffset;
                        float f1 = view1.getLeft();
                        float f2 = mSelectionOffset;
                        j = (int)((float)l * (1.0F - f2) + f * f1);
                        f = mSelectionOffset;
                        f1 = view1.getRight();
                        f2 = mSelectionOffset;
                        i = (int)((float)k * (1.0F - f2) + f1 * f);
                    }
                }
            } else
            {
                i = -1;
                j = -1;
            }
            setIndicatorPosition(j, i);
        }

        void animateIndicatorToPosition(int i, int j)
        {
            View view;
            final int startLeft;
            final int startRight;
            final int targetLeft;
            int k;
            if (ViewCompat.getLayoutDirection(this) == 1)
            {
                startLeft = 1;
            } else
            {
                startLeft = 0;
            }
            view = getChildAt(i);
            targetLeft = view.getLeft();
            k = view.getRight();
            if (Math.abs(i - mSelectedPosition) <= 1)
            {
                startLeft = mIndicatorLeft;
                startRight = mIndicatorRight;
            } else
            {
                startRight = dpToPx(24);
                if (i < mSelectedPosition)
                {
                    if (startLeft != 0)
                    {
                        startRight = targetLeft - startRight;
                        startLeft = startRight;
                    } else
                    {
                        startRight = k + startRight;
                        startLeft = startRight;
                    }
                } else
                if (startLeft != 0)
                {
                    startRight = k + startRight;
                    startLeft = startRight;
                } else
                {
                    startRight = targetLeft - startRight;
                    startLeft = startRight;
                }
            }
            if (startLeft != targetLeft || startRight != k)
            {
                ValueAnimatorCompat valueanimatorcompat = mIndicatorAnimator = ViewUtils.createAnimator();
                valueanimatorcompat.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
                valueanimatorcompat.setDuration(j);
                valueanimatorcompat.setFloatValues(0.0F, 1.0F);
                valueanimatorcompat.setUpdateListener(k. new ValueAnimatorCompat.AnimatorUpdateListener() {

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

            
            {
                this$1 = final_slidingtabstrip;
                startLeft = i;
                targetLeft = j;
                startRight = k;
                targetRight = I.this;
                super();
            }
                });
                valueanimatorcompat.setListener(i. new ValueAnimatorCompat.AnimatorListenerAdapter() {

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

            
            {
                this$1 = final_slidingtabstrip;
                position = I.this;
                super();
            }
                });
                valueanimatorcompat.start();
                mCurrentAnimator = valueanimatorcompat;
            }
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

        float getIndicatorPosition()
        {
            return (float)mSelectedPosition + mSelectionOffset;
        }

        protected void onLayout(boolean flag, int i, int j, int k, int l)
        {
            super.onLayout(flag, i, j, k, l);
            if (mCurrentAnimator != null && mCurrentAnimator.isRunning())
            {
                mCurrentAnimator.cancel();
                long l1 = mCurrentAnimator.getDuration();
                i = mSelectedPosition;
                float f = mCurrentAnimator.getAnimatedFraction();
                animateIndicatorToPosition(i, Math.round((float)l1 * (1.0F - f)));
                return;
            } else
            {
                updateIndicatorPosition();
                return;
            }
        }

        protected void onMeasure(int i, int j)
        {
            boolean flag;
            flag = false;
            super.onMeasure(i, j);
            break MISSING_BLOCK_LABEL_9;
label0:
            while (!flag) 
            {
                do
                {
                    do
                    {
                        return;
                    } while (android.view.View.MeasureSpec.getMode(i) != 0x40000000 || mMode != 1 || mTabGravity != 1);
                    int j1 = getChildCount();
                    int i1 = 0;
                    int l = 0;
                    while (i1 < j1) 
                    {
                        Object obj = getChildAt(i1);
                        int k;
                        if (((View) (obj)).getVisibility() == 0)
                        {
                            k = Math.max(l, ((View) (obj)).getMeasuredWidth());
                        } else
                        {
                            k = l;
                        }
                        i1++;
                        l = k;
                    }
                } while (l <= 0);
                k = dpToPx(16);
                if (l * j1 <= getMeasuredWidth() - k * 2)
                {
                    i1 = 0;
                    k = ((flag) ? 1 : 0);
                    do
                    {
                        flag = k;
                        if (i1 >= j1)
                        {
                            continue label0;
                        }
                        obj = (android.widget.LinearLayout.LayoutParams)getChildAt(i1).getLayoutParams();
                        if (((android.widget.LinearLayout.LayoutParams) (obj)).width != l || ((android.widget.LinearLayout.LayoutParams) (obj)).weight != 0.0F)
                        {
                            obj.width = l;
                            obj.weight = 0.0F;
                            k = 1;
                        }
                        i1++;
                    } while (true);
                }
                mTabGravity = 0;
                updateTabViews(false);
                flag = true;
            }
            super.onMeasure(i, j);
            return;
        }

        void setIndicatorPositionFromTabPosition(int i, float f)
        {
            mSelectedPosition = i;
            mSelectionOffset = f;
            updateIndicatorPosition();
        }

        void setSelectedIndicatorColor(int i)
        {
            if (mSelectedIndicatorPaint.getColor() != i)
            {
                mSelectedIndicatorPaint.setColor(i);
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        void setSelectedIndicatorHeight(int i)
        {
            if (mSelectedIndicatorHeight != i)
            {
                mSelectedIndicatorHeight = i;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }



/*
        static int access$2002(SlidingTabStrip slidingtabstrip, int i)
        {
            slidingtabstrip.mSelectedPosition = i;
            return i;
        }

*/


/*
        static float access$2102(SlidingTabStrip slidingtabstrip, float f)
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

        public CharSequence getContentDescription()
        {
            return mContentDesc;
        }

        public View getCustomView()
        {
            return mCustomView;
        }

        public Drawable getIcon()
        {
            return mIcon;
        }

        public int getPosition()
        {
            return mPosition;
        }

        public Object getTag()
        {
            return mTag;
        }

        public CharSequence getText()
        {
            return mText;
        }

        public boolean isSelected()
        {
            return mParent.getSelectedTabPosition() == mPosition;
        }

        public void select()
        {
            mParent.selectTab(this);
        }

        public Tab setContentDescription(int i)
        {
            return setContentDescription(mParent.getResources().getText(i));
        }

        public Tab setContentDescription(CharSequence charsequence)
        {
            mContentDesc = charsequence;
            if (mPosition >= 0)
            {
                mParent.updateTab(mPosition);
            }
            return this;
        }

        public Tab setCustomView(int i)
        {
            TabView tabview = mParent.getTabView(mPosition);
            return setCustomView(LayoutInflater.from(tabview.getContext()).inflate(i, tabview, false));
        }

        public Tab setCustomView(View view)
        {
            mCustomView = view;
            if (mPosition >= 0)
            {
                mParent.updateTab(mPosition);
            }
            return this;
        }

        public Tab setIcon(int i)
        {
            return setIcon(TintManager.getDrawable(mParent.getContext(), i));
        }

        public Tab setIcon(Drawable drawable)
        {
            mIcon = drawable;
            if (mPosition >= 0)
            {
                mParent.updateTab(mPosition);
            }
            return this;
        }

        void setPosition(int i)
        {
            mPosition = i;
        }

        public Tab setTag(Object obj)
        {
            mTag = obj;
            return this;
        }

        public Tab setText(int i)
        {
            return setText(mParent.getResources().getText(i));
        }

        public Tab setText(CharSequence charsequence)
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
            if (tablayout != null && tablayout.getSelectedTabPosition() != i)
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
        private int mDefaultMaxLines;
        private ImageView mIconView;
        private final Tab mTab;
        private TextView mTextView;
        final TabLayout this$0;

        private float approximateLineWidth(Layout layout, int i, float f)
        {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

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
            if (imageview != null)
            {
                textview = (android.view.ViewGroup.MarginLayoutParams)imageview.getLayoutParams();
                int i;
                if (flag && imageview.getVisibility() == 0)
                {
                    i = dpToPx(8);
                } else
                {
                    i = 0;
                }
                if (i != ((android.view.ViewGroup.MarginLayoutParams) (textview)).bottomMargin)
                {
                    textview.bottomMargin = i;
                    imageview.requestLayout();
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
            int k;
            boolean flag;
label0:
            {
                flag = true;
                int l = android.view.View.MeasureSpec.getSize(i);
                int j1 = android.view.View.MeasureSpec.getMode(i);
                int l1 = getTabMaxWidth();
                k = i;
                if (l1 <= 0)
                {
                    break label0;
                }
                if (j1 != 0)
                {
                    k = i;
                    if (l <= l1)
                    {
                        break label0;
                    }
                }
                k = android.view.View.MeasureSpec.makeMeasureSpec(mTabMaxWidth, j1);
            }
            super.onMeasure(k, j);
            if (mTextView == null) goto _L2; else goto _L1
_L1:
            float f1;
            int i1;
            getResources();
            f1 = mTabTextSize;
            i1 = mDefaultMaxLines;
            if (mIconView == null || mIconView.getVisibility() != 0) goto _L4; else goto _L3
_L3:
            float f;
            i = 1;
            f = f1;
_L6:
            f1 = mTextView.getTextSize();
            int k1 = mTextView.getLineCount();
            i1 = TextViewCompat.getMaxLines(mTextView);
            if (f != f1 || i1 >= 0 && i != i1)
            {
label1:
                {
                    i1 = ((flag) ? 1 : 0);
                    if (mMode != 1)
                    {
                        break label1;
                    }
                    i1 = ((flag) ? 1 : 0);
                    if (f <= f1)
                    {
                        break label1;
                    }
                    i1 = ((flag) ? 1 : 0);
                    if (k1 != 1)
                    {
                        break label1;
                    }
                    Layout layout = mTextView.getLayout();
                    if (layout != null)
                    {
                        i1 = ((flag) ? 1 : 0);
                        if (approximateLineWidth(layout, 0, f) <= (float)layout.getWidth())
                        {
                            break label1;
                        }
                    }
                    i1 = 0;
                }
                if (i1 != 0)
                {
                    mTextView.setTextSize(0, f);
                    mTextView.setMaxLines(i);
                    super.onMeasure(k, j);
                }
            }
_L2:
            return;
_L4:
            i = i1;
            f = f1;
            if (mTextView != null)
            {
                i = i1;
                f = f1;
                if (mTextView.getLineCount() > 1)
                {
                    f = mTabTextMultiLineSize;
                    i = i1;
                }
            }
            if (true) goto _L6; else goto _L5
_L5:
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
                if (mCustomTextView != null)
                {
                    mDefaultMaxLines = TextViewCompat.getMaxLines(mCustomTextView);
                }
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
                    ImageView imageview = (ImageView)LayoutInflater.from(getContext()).inflate(android.support.design.R.layout.design_layout_tab_icon, this, false);
                    addView(imageview, 0);
                    mIconView = imageview;
                }
                if (mTextView == null)
                {
                    TextView textview = (TextView)LayoutInflater.from(getContext()).inflate(android.support.design.R.layout.design_layout_tab_text, this, false);
                    addView(textview);
                    mTextView = textview;
                    mDefaultMaxLines = TextViewCompat.getMaxLines(mTextView);
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
            mDefaultMaxLines = 2;
            mTab = tab;
            if (mTabBackgroundResId != 0)
            {
                setBackgroundDrawable(TintManager.getDrawable(context, mTabBackgroundResId));
            }
            ViewCompat.setPaddingRelative(this, mTabPaddingStart, mTabPaddingTop, mTabPaddingEnd, mTabPaddingBottom);
            setGravity(17);
            setOrientation(1);
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
    private static final int DEFAULT_GAP_TEXT_ICON = 8;
    private static final int DEFAULT_HEIGHT = 48;
    private static final int DEFAULT_HEIGHT_WITH_TEXT_ICON = 72;
    private static final int FIXED_WRAP_GUTTER_MIN = 16;
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_FILL = 0;
    private static final int INVALID_WIDTH = -1;
    public static final int MODE_FIXED = 1;
    public static final int MODE_SCROLLABLE = 0;
    private static final int MOTION_NON_ADJACENT_OFFSET = 24;
    private static final int TAB_MIN_WIDTH_MARGIN = 56;
    private int mContentInsetStart;
    private ValueAnimatorCompat mIndicatorAnimator;
    private int mMode;
    private OnTabSelectedListener mOnTabSelectedListener;
    private final int mRequestedTabMaxWidth;
    private final int mRequestedTabMinWidth;
    private ValueAnimatorCompat mScrollAnimator;
    private final int mScrollableTabMinWidth;
    private Tab mSelectedTab;
    private final int mTabBackgroundResId;
    private android.view.View.OnClickListener mTabClickListener;
    private int mTabGravity;
    private int mTabMaxWidth;
    private int mTabPaddingBottom;
    private int mTabPaddingEnd;
    private int mTabPaddingStart;
    private int mTabPaddingTop;
    private final SlidingTabStrip mTabStrip;
    private int mTabTextAppearance;
    private ColorStateList mTabTextColors;
    private float mTabTextMultiLineSize;
    private float mTabTextSize;
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
        mTabMaxWidth = 0x7fffffff;
        ThemeUtils.checkAppCompatTheme(context);
        setHorizontalScrollBarEnabled(false);
        mTabStrip = new SlidingTabStrip(context);
        addView(mTabStrip, -2, -1);
        attributeset = context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.TabLayout, i, android.support.design.R.style.Widget_Design_TabLayout);
        mTabStrip.setSelectedIndicatorHeight(attributeset.getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabIndicatorHeight, 0));
        mTabStrip.setSelectedIndicatorColor(attributeset.getColor(android.support.design.R.styleable.TabLayout_tabIndicatorColor, 0));
        i = attributeset.getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabPadding, 0);
        mTabPaddingBottom = i;
        mTabPaddingEnd = i;
        mTabPaddingTop = i;
        mTabPaddingStart = i;
        mTabPaddingStart = attributeset.getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabPaddingStart, mTabPaddingStart);
        mTabPaddingTop = attributeset.getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabPaddingTop, mTabPaddingTop);
        mTabPaddingEnd = attributeset.getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabPaddingEnd, mTabPaddingEnd);
        mTabPaddingBottom = attributeset.getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabPaddingBottom, mTabPaddingBottom);
        mTabTextAppearance = attributeset.getResourceId(android.support.design.R.styleable.TabLayout_tabTextAppearance, android.support.design.R.style.TextAppearance_Design_Tab);
        context = context.obtainStyledAttributes(mTabTextAppearance, android.support.design.R.styleable.TextAppearance);
        mTabTextSize = context.getDimensionPixelSize(android.support.design.R.styleable.TextAppearance_android_textSize, 0);
        mTabTextColors = context.getColorStateList(android.support.design.R.styleable.TextAppearance_android_textColor);
        context.recycle();
        if (attributeset.hasValue(android.support.design.R.styleable.TabLayout_tabTextColor))
        {
            mTabTextColors = attributeset.getColorStateList(android.support.design.R.styleable.TabLayout_tabTextColor);
        }
        if (attributeset.hasValue(android.support.design.R.styleable.TabLayout_tabSelectedTextColor))
        {
            i = attributeset.getColor(android.support.design.R.styleable.TabLayout_tabSelectedTextColor, 0);
            mTabTextColors = createColorStateList(mTabTextColors.getDefaultColor(), i);
        }
        mRequestedTabMinWidth = attributeset.getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabMinWidth, -1);
        mRequestedTabMaxWidth = attributeset.getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabMaxWidth, -1);
        mTabBackgroundResId = attributeset.getResourceId(android.support.design.R.styleable.TabLayout_tabBackground, 0);
        mContentInsetStart = attributeset.getDimensionPixelSize(android.support.design.R.styleable.TabLayout_tabContentStart, 0);
        mMode = attributeset.getInt(android.support.design.R.styleable.TabLayout_tabMode, 1);
        mTabGravity = attributeset.getInt(android.support.design.R.styleable.TabLayout_tabGravity, 0);
        attributeset.recycle();
        context = getResources();
        mTabTextMultiLineSize = context.getDimensionPixelSize(android.support.design.R.dimen.design_tab_text_size_2line);
        mScrollableTabMinWidth = context.getDimensionPixelSize(android.support.design.R.dimen.design_tab_scrollable_min_width);
        applyModeAndGravity();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
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
                mScrollAnimator.setUpdateListener(new ValueAnimatorCompat.AnimatorUpdateListener() {

                    final TabLayout this$0;

                    public void onAnimationUpdate(ValueAnimatorCompat valueanimatorcompat)
                    {
                        scrollTo(valueanimatorcompat.getAnimatedIntValue(), 0);
                    }

            
            {
                this$0 = TabLayout.this;
                super();
            }
                });
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
    //                   0 77
    //                   1 66;
           goto _L1 _L2 _L3
_L1:
        updateTabViews(true);
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
        tab.setMinimumWidth(getTabMinWidth());
        if (mTabClickListener == null)
        {
            mTabClickListener = new android.view.View.OnClickListener() {

                final TabLayout this$0;

                public void onClick(View view)
                {
                    ((TabView)view).getTab().select();
                }

            
            {
                this$0 = TabLayout.this;
                super();
            }
            };
        }
        tab.setOnClickListener(mTabClickListener);
        return tab;
    }

    private int dpToPx(int i)
    {
        return Math.round(getResources().getDisplayMetrics().density * (float)i);
    }

    private int getDefaultHeight()
    {
        int i;
        int j;
        j = mTabs.size();
        i = 0;
_L3:
        Tab tab;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        tab = (Tab)mTabs.get(i);
        if (tab == null || tab.getIcon() == null || TextUtils.isEmpty(tab.getText())) goto _L2; else goto _L1
_L1:
        i = 1;
_L4:
        return i == 0 ? 48 : 72;
_L2:
        i++;
          goto _L3
        i = 0;
          goto _L4
    }

    private float getScrollPosition()
    {
        return mTabStrip.getIndicatorPosition();
    }

    private int getTabMaxWidth()
    {
        return mTabMaxWidth;
    }

    private int getTabMinWidth()
    {
        if (mRequestedTabMinWidth != -1)
        {
            return mRequestedTabMinWidth;
        }
        if (mMode == 0)
        {
            return mScrollableTabMinWidth;
        } else
        {
            return 0;
        }
    }

    private TabView getTabView(int i)
    {
        return (TabView)mTabStrip.getChildAt(i);
    }

    private void removeTabViewAt(int i)
    {
        mTabStrip.removeViewAt(i);
        requestLayout();
    }

    private void setSelectedTabView(int i)
    {
        int k = mTabStrip.getChildCount();
        if (i < k && !mTabStrip.getChildAt(i).isSelected())
        {
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
        TabView tabview = getTabView(i);
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

    private void updateTabViews(boolean flag)
    {
        for (int i = 0; i < mTabStrip.getChildCount(); i++)
        {
            View view = mTabStrip.getChildAt(i);
            view.setMinimumWidth(getTabMinWidth());
            updateTabViewLayoutParams((android.widget.LinearLayout.LayoutParams)view.getLayoutParams());
            if (flag)
            {
                view.requestLayout();
            }
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
        int k;
        boolean flag;
        flag = true;
        k = dpToPx(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
        android.view.View.MeasureSpec.getMode(j);
        JVM INSTR lookupswitch 2: default 52
    //                   -2147483648: 175
    //                   0: 194;
           goto _L1 _L2 _L3
_L1:
        View view;
        k = android.view.View.MeasureSpec.getSize(i);
        if (android.view.View.MeasureSpec.getMode(i) != 0)
        {
            if (mRequestedTabMaxWidth > 0)
            {
                k = mRequestedTabMaxWidth;
            } else
            {
                k -= dpToPx(56);
            }
            mTabMaxWidth = k;
        }
        super.onMeasure(i, j);
        if (getChildCount() != 1) goto _L5; else goto _L4
_L4:
        view = getChildAt(0);
        mMode;
        JVM INSTR tableswitch 0 1: default 132
    //                   0 220
    //                   1 241;
           goto _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_241;
_L6:
        i = 0;
_L9:
        if (i != 0)
        {
            i = getChildMeasureSpec(j, getPaddingTop() + getPaddingBottom(), view.getLayoutParams().height);
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0x40000000), i);
        }
_L5:
        return;
_L2:
        j = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(k, android.view.View.MeasureSpec.getSize(j)), 0x40000000);
          goto _L1
_L3:
        j = android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000);
          goto _L1
_L7:
        if (view.getMeasuredWidth() < getMeasuredWidth())
        {
            i = 1;
        } else
        {
            i = 0;
        }
          goto _L9
        if (view.getMeasuredWidth() != getMeasuredWidth())
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
          goto _L9
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
            if (flag)
            {
                int i;
                if (tab != null)
                {
                    i = tab.getPosition();
                } else
                {
                    i = -1;
                }
                if (i != -1)
                {
                    setSelectedTabView(i);
                }
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

    public void setSelectedTabIndicatorColor(int i)
    {
        mTabStrip.setSelectedIndicatorColor(i);
    }

    public void setSelectedTabIndicatorHeight(int i)
    {
        mTabStrip.setSelectedIndicatorHeight(i);
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
        if (pageradapter.getCount() > 0)
        {
            int i = viewpager.getCurrentItem();
            if (getSelectedTabPosition() != i)
            {
                selectTab(getTabAt(i));
            }
        }
    }










/*
    static int access$1602(TabLayout tablayout, int i)
    {
        tablayout.mTabGravity = i;
        return i;
    }

*/



/*
    static ValueAnimatorCompat access$1802(TabLayout tablayout, ValueAnimatorCompat valueanimatorcompat)
    {
        tablayout.mIndicatorAnimator = valueanimatorcompat;
        return valueanimatorcompat;
    }

*/








}
