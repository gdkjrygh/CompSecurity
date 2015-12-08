// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.astuetz;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;

public class PagerSlidingTabStrip extends HorizontalScrollView
{
    public static interface IconTabProvider
    {

        public abstract int getPageIconResId(int i);
    }

    private class PageListener
        implements android.support.v4.view.ViewPager.OnPageChangeListener
    {

        final PagerSlidingTabStrip this$0;

        public void onPageScrollStateChanged(int i)
        {
            if (i == 0)
            {
                scrollToChild(pager.getCurrentItem(), 0);
            }
            if (delegatePageListener != null)
            {
                delegatePageListener.onPageScrollStateChanged(i);
            }
        }

        public void onPageScrolled(int i, float f, int j)
        {
            currentPosition = i;
            currentPositionOffset = f;
            scrollToChild(i, (int)((float)tabsContainer.getChildAt(i).getWidth() * f));
            invalidate();
            if (delegatePageListener != null)
            {
                delegatePageListener.onPageScrolled(i, f, j);
            }
        }

        public void onPageSelected(int i)
        {
            if (delegatePageListener != null)
            {
                delegatePageListener.onPageSelected(i);
            }
        }

        private PageListener()
        {
            this$0 = PagerSlidingTabStrip.this;
            super();
        }

    }

    static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        int currentPosition;

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeInt(currentPosition);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            currentPosition = parcel.readInt();
        }


        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }


    private static final int ATTRS[] = {
        0x1010095, 0x1010098
    };
    private int currentPosition;
    private float currentPositionOffset;
    private android.widget.LinearLayout.LayoutParams defaultTabLayoutParams;
    public android.support.v4.view.ViewPager.OnPageChangeListener delegatePageListener;
    private int dividerColor;
    private int dividerPadding;
    private Paint dividerPaint;
    private int dividerWidth;
    private android.widget.LinearLayout.LayoutParams expandedTabLayoutParams;
    private int indicatorColor;
    private int indicatorHeight;
    private int lastScrollX;
    private Locale locale;
    private final PageListener pageListener;
    private ViewPager pager;
    private Paint rectPaint;
    private int scrollOffset;
    private boolean shouldExpand;
    private int tabBackgroundResId;
    private int tabCount;
    private int tabPadding;
    private int tabTextColor;
    private int tabTextSize;
    private Typeface tabTypeface;
    private int tabTypefaceStyle;
    private LinearLayout tabsContainer;
    private boolean textAllCaps;
    private int underlineColor;
    private int underlineHeight;

    public PagerSlidingTabStrip(Context context)
    {
        this(context, null);
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        pageListener = new PageListener();
        currentPosition = 0;
        currentPositionOffset = 0.0F;
        indicatorColor = 0xff666666;
        underlineColor = 0x1a000000;
        dividerColor = 0x1a000000;
        shouldExpand = false;
        textAllCaps = true;
        scrollOffset = 52;
        indicatorHeight = 8;
        underlineHeight = 2;
        dividerPadding = 12;
        tabPadding = 24;
        dividerWidth = 1;
        tabTextSize = 12;
        tabTextColor = 0xff666666;
        tabTypeface = null;
        tabTypefaceStyle = 1;
        lastScrollX = 0;
        tabBackgroundResId = com.astuetz.pagerslidingtabstrip.R.drawable.background_tab;
        setFillViewport(true);
        setWillNotDraw(false);
        tabsContainer = new LinearLayout(context);
        tabsContainer.setOrientation(0);
        tabsContainer.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        addView(tabsContainer);
        Object obj = getResources().getDisplayMetrics();
        scrollOffset = (int)TypedValue.applyDimension(1, scrollOffset, ((android.util.DisplayMetrics) (obj)));
        indicatorHeight = (int)TypedValue.applyDimension(1, indicatorHeight, ((android.util.DisplayMetrics) (obj)));
        underlineHeight = (int)TypedValue.applyDimension(1, underlineHeight, ((android.util.DisplayMetrics) (obj)));
        dividerPadding = (int)TypedValue.applyDimension(1, dividerPadding, ((android.util.DisplayMetrics) (obj)));
        tabPadding = (int)TypedValue.applyDimension(1, tabPadding, ((android.util.DisplayMetrics) (obj)));
        dividerWidth = (int)TypedValue.applyDimension(1, dividerWidth, ((android.util.DisplayMetrics) (obj)));
        tabTextSize = (int)TypedValue.applyDimension(2, tabTextSize, ((android.util.DisplayMetrics) (obj)));
        obj = context.obtainStyledAttributes(attributeset, ATTRS);
        tabTextSize = ((TypedArray) (obj)).getDimensionPixelSize(0, tabTextSize);
        tabTextColor = ((TypedArray) (obj)).getColor(1, tabTextColor);
        ((TypedArray) (obj)).recycle();
        context = context.obtainStyledAttributes(attributeset, com.astuetz.pagerslidingtabstrip.R.styleable.PagerSlidingTabStrip);
        indicatorColor = context.getColor(0, indicatorColor);
        underlineColor = context.getColor(1, underlineColor);
        dividerColor = context.getColor(2, dividerColor);
        indicatorHeight = context.getDimensionPixelSize(3, indicatorHeight);
        underlineHeight = context.getDimensionPixelSize(4, underlineHeight);
        dividerPadding = context.getDimensionPixelSize(5, dividerPadding);
        tabPadding = context.getDimensionPixelSize(6, tabPadding);
        tabBackgroundResId = context.getResourceId(8, tabBackgroundResId);
        shouldExpand = context.getBoolean(9, shouldExpand);
        scrollOffset = context.getDimensionPixelSize(7, scrollOffset);
        textAllCaps = context.getBoolean(10, textAllCaps);
        context.recycle();
        rectPaint = new Paint();
        rectPaint.setAntiAlias(true);
        rectPaint.setStyle(android.graphics.Paint.Style.FILL);
        dividerPaint = new Paint();
        dividerPaint.setAntiAlias(true);
        dividerPaint.setStrokeWidth(dividerWidth);
        defaultTabLayoutParams = new android.widget.LinearLayout.LayoutParams(-2, -1);
        expandedTabLayoutParams = new android.widget.LinearLayout.LayoutParams(0, -1, 1.0F);
        if (locale == null)
        {
            locale = getResources().getConfiguration().locale;
        }
    }

    private void addIconTab(int i, int j)
    {
        ImageButton imagebutton = new ImageButton(getContext());
        imagebutton.setImageResource(j);
        addTab(i, imagebutton);
    }

    private void addTab(final int position, View view)
    {
        view.setFocusable(true);
        view.setOnClickListener(new android.view.View.OnClickListener() {

            final PagerSlidingTabStrip this$0;
            final int val$position;

            public void onClick(View view1)
            {
                pager.setCurrentItem(position);
            }

            
            {
                this$0 = PagerSlidingTabStrip.this;
                position = i;
                super();
            }
        });
        view.setPadding(tabPadding, 0, tabPadding, 0);
        LinearLayout linearlayout = tabsContainer;
        android.widget.LinearLayout.LayoutParams layoutparams;
        if (shouldExpand)
        {
            layoutparams = expandedTabLayoutParams;
        } else
        {
            layoutparams = defaultTabLayoutParams;
        }
        linearlayout.addView(view, position, layoutparams);
    }

    private void addTextTab(int i, String s)
    {
        TextView textview = new TextView(getContext());
        textview.setText(s);
        textview.setGravity(17);
        textview.setSingleLine();
        addTab(i, textview);
    }

    private void scrollToChild(int i, int j)
    {
        if (tabCount != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int k = tabsContainer.getChildAt(i).getLeft() + j;
        if (i <= 0)
        {
            i = k;
            if (j <= 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        i = k - scrollOffset;
        if (i == lastScrollX) goto _L1; else goto _L3
_L3:
        lastScrollX = i;
        scrollTo(i, 0);
        return;
    }

    private void updateTabStyles()
    {
        int i = 0;
        while (i < tabCount) 
        {
            Object obj = tabsContainer.getChildAt(i);
            ((View) (obj)).setBackgroundResource(tabBackgroundResId);
            if (!(obj instanceof TextView))
            {
                continue;
            }
            obj = (TextView)obj;
            ((TextView) (obj)).setTextSize(0, tabTextSize);
            ((TextView) (obj)).setTypeface(tabTypeface, tabTypefaceStyle);
            ((TextView) (obj)).setTextColor(tabTextColor);
            if (textAllCaps)
            {
                if (android.os.Build.VERSION.SDK_INT >= 14)
                {
                    ((TextView) (obj)).setAllCaps(true);
                } else
                {
                    ((TextView) (obj)).setText(((TextView) (obj)).getText().toString().toUpperCase(locale));
                }
            }
            i++;
        }
    }

    public int getDividerColor()
    {
        return dividerColor;
    }

    public int getDividerPadding()
    {
        return dividerPadding;
    }

    public int getIndicatorColor()
    {
        return indicatorColor;
    }

    public int getIndicatorHeight()
    {
        return indicatorHeight;
    }

    public int getScrollOffset()
    {
        return scrollOffset;
    }

    public boolean getShouldExpand()
    {
        return shouldExpand;
    }

    public int getTabBackground()
    {
        return tabBackgroundResId;
    }

    public int getTabPaddingLeftRight()
    {
        return tabPadding;
    }

    public int getTextColor()
    {
        return tabTextColor;
    }

    public int getTextSize()
    {
        return tabTextSize;
    }

    public int getUnderlineColor()
    {
        return underlineColor;
    }

    public int getUnderlineHeight()
    {
        return underlineHeight;
    }

    public void notifyDataSetChanged()
    {
        tabsContainer.removeAllViews();
        tabCount = pager.getAdapter().getCount();
        int i = 0;
        while (i < tabCount) 
        {
            if (pager.getAdapter() instanceof IconTabProvider)
            {
                addIconTab(i, ((IconTabProvider)pager.getAdapter()).getPageIconResId(i));
            } else
            {
                addTextTab(i, pager.getAdapter().getPageTitle(i).toString());
            }
            i++;
        }
        updateTabStyles();
        getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final PagerSlidingTabStrip this$0;

            public void onGlobalLayout()
            {
                if (android.os.Build.VERSION.SDK_INT < 16)
                {
                    getViewTreeObserver().removeGlobalOnLayoutListener(this);
                } else
                {
                    getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                currentPosition = pager.getCurrentItem();
                scrollToChild(currentPosition, 0);
            }

            
            {
                this$0 = PagerSlidingTabStrip.this;
                super();
            }
        });
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (!isInEditMode() && tabCount != 0)
        {
            int j = getHeight();
            rectPaint.setColor(indicatorColor);
            View view = tabsContainer.getChildAt(currentPosition);
            float f3 = view.getLeft();
            float f2 = view.getRight();
            float f1 = f3;
            float f = f2;
            if (currentPositionOffset > 0.0F)
            {
                f1 = f3;
                f = f2;
                if (currentPosition < tabCount - 1)
                {
                    View view1 = tabsContainer.getChildAt(currentPosition + 1);
                    f1 = view1.getLeft();
                    f = view1.getRight();
                    f1 = currentPositionOffset * f1 + (1.0F - currentPositionOffset) * f3;
                    f = currentPositionOffset * f + (1.0F - currentPositionOffset) * f2;
                }
            }
            canvas.drawRect(f1, j - indicatorHeight, f, j, rectPaint);
            rectPaint.setColor(underlineColor);
            canvas.drawRect(0.0F, j - underlineHeight, tabsContainer.getWidth(), j, rectPaint);
            dividerPaint.setColor(dividerColor);
            int i = 0;
            while (i < tabCount - 1) 
            {
                View view2 = tabsContainer.getChildAt(i);
                canvas.drawLine(view2.getRight(), dividerPadding, view2.getRight(), j - dividerPadding, dividerPaint);
                i++;
            }
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        currentPosition = ((SavedState) (parcelable)).currentPosition;
        requestLayout();
    }

    public Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.currentPosition = currentPosition;
        return savedstate;
    }

    public void setAllCaps(boolean flag)
    {
        textAllCaps = flag;
    }

    public void setDividerColor(int i)
    {
        dividerColor = i;
        invalidate();
    }

    public void setDividerColorResource(int i)
    {
        dividerColor = getResources().getColor(i);
        invalidate();
    }

    public void setDividerPadding(int i)
    {
        dividerPadding = i;
        invalidate();
    }

    public void setIndicatorColor(int i)
    {
        indicatorColor = i;
        invalidate();
    }

    public void setIndicatorColorResource(int i)
    {
        indicatorColor = getResources().getColor(i);
        invalidate();
    }

    public void setIndicatorHeight(int i)
    {
        indicatorHeight = i;
        invalidate();
    }

    public void setOnPageChangeListener(android.support.v4.view.ViewPager.OnPageChangeListener onpagechangelistener)
    {
        delegatePageListener = onpagechangelistener;
    }

    public void setScrollOffset(int i)
    {
        scrollOffset = i;
        invalidate();
    }

    public void setShouldExpand(boolean flag)
    {
        shouldExpand = flag;
        requestLayout();
    }

    public void setTabBackground(int i)
    {
        tabBackgroundResId = i;
    }

    public void setTabPaddingLeftRight(int i)
    {
        tabPadding = i;
        updateTabStyles();
    }

    public void setTextColor(int i)
    {
        tabTextColor = i;
        updateTabStyles();
    }

    public void setTextColorResource(int i)
    {
        tabTextColor = getResources().getColor(i);
        updateTabStyles();
    }

    public void setTextSize(int i)
    {
        tabTextSize = i;
        updateTabStyles();
    }

    public void setUnderlineColor(int i)
    {
        underlineColor = i;
        invalidate();
    }

    public void setUnderlineColorResource(int i)
    {
        underlineColor = getResources().getColor(i);
        invalidate();
    }

    public void setUnderlineHeight(int i)
    {
        underlineHeight = i;
        invalidate();
    }

    public void setViewPager(ViewPager viewpager)
    {
        pager = viewpager;
        if (viewpager.getAdapter() == null)
        {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        } else
        {
            viewpager.setOnPageChangeListener(pageListener);
            notifyDataSetChanged();
            return;
        }
    }




/*
    static int access$102(PagerSlidingTabStrip pagerslidingtabstrip, int i)
    {
        pagerslidingtabstrip.currentPosition = i;
        return i;
    }

*/




/*
    static float access$402(PagerSlidingTabStrip pagerslidingtabstrip, float f)
    {
        pagerslidingtabstrip.currentPositionOffset = f;
        return f;
    }

*/

}
