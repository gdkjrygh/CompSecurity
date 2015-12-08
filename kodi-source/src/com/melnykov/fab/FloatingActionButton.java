// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.melnykov.fab;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageButton;
import android.widget.ScrollView;
import com.nineoldandroids.view.ViewHelper;
import com.nineoldandroids.view.ViewPropertyAnimator;

// Referenced classes of package com.melnykov.fab:
//            ObservableScrollView, ScrollDirectionListener, ScrollViewScrollDetector

public class FloatingActionButton extends ImageButton
{
    private class ScrollViewScrollDetectorImpl extends ScrollViewScrollDetector
    {

        private ObservableScrollView.OnScrollChangedListener mOnScrollChangedListener;
        private ScrollDirectionListener mScrollDirectionListener;
        final FloatingActionButton this$0;

        private void setScrollDirectionListener(ScrollDirectionListener scrolldirectionlistener)
        {
            mScrollDirectionListener = scrolldirectionlistener;
        }

        public void onScrollChanged(ScrollView scrollview, int i, int j, int k, int l)
        {
            if (mOnScrollChangedListener != null)
            {
                mOnScrollChangedListener.onScrollChanged(scrollview, i, j, k, l);
            }
            super.onScrollChanged(scrollview, i, j, k, l);
        }

        public void onScrollDown()
        {
            show();
            if (mScrollDirectionListener != null)
            {
                mScrollDirectionListener.onScrollDown();
            }
        }

        public void onScrollUp()
        {
            hide();
            if (mScrollDirectionListener != null)
            {
                mScrollDirectionListener.onScrollUp();
            }
        }

        public void setOnScrollChangedListener(ObservableScrollView.OnScrollChangedListener onscrollchangedlistener)
        {
            mOnScrollChangedListener = onscrollchangedlistener;
        }


        private ScrollViewScrollDetectorImpl()
        {
            this$0 = FloatingActionButton.this;
            super();
        }

    }


    private int mColorDisabled;
    private int mColorNormal;
    private int mColorPressed;
    private int mColorRipple;
    private final Interpolator mInterpolator;
    private boolean mMarginsSet;
    private int mScrollThreshold;
    private boolean mShadow;
    private int mShadowSize;
    private int mType;
    private boolean mVisible;

    public FloatingActionButton(Context context)
    {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mInterpolator = new AccelerateDecelerateInterpolator();
        init(context, attributeset);
    }

    public FloatingActionButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mInterpolator = new AccelerateDecelerateInterpolator();
        init(context, attributeset);
    }

    private Drawable createDrawable(int i)
    {
        Object obj = new ShapeDrawable(new OvalShape());
        ((ShapeDrawable) (obj)).getPaint().setColor(i);
        if (mShadow && !hasLollipopApi())
        {
            Resources resources = getResources();
            if (mType == 0)
            {
                i = R.drawable.fab_shadow;
            } else
            {
                i = R.drawable.fab_shadow_mini;
            }
            obj = new LayerDrawable(new Drawable[] {
                resources.getDrawable(i), obj
            });
            ((LayerDrawable) (obj)).setLayerInset(1, mShadowSize, mShadowSize, mShadowSize, mShadowSize);
            return ((Drawable) (obj));
        } else
        {
            return ((Drawable) (obj));
        }
    }

    private static int darkenColor(int i)
    {
        float af[] = new float[3];
        Color.colorToHSV(i, af);
        af[2] = af[2] * 0.9F;
        return Color.HSVToColor(af);
    }

    private int getColor(int i)
    {
        return getResources().getColor(i);
    }

    private int getDimension(int i)
    {
        return getResources().getDimensionPixelSize(i);
    }

    private int getMarginBottom()
    {
        int i = 0;
        android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            i = ((android.view.ViewGroup.MarginLayoutParams)layoutparams).bottomMargin;
        }
        return i;
    }

    private TypedArray getTypedArray(Context context, AttributeSet attributeset, int ai[])
    {
        return context.obtainStyledAttributes(attributeset, ai, 0, 0);
    }

    private boolean hasHoneycombApi()
    {
        return android.os.Build.VERSION.SDK_INT >= 11;
    }

    private boolean hasJellyBeanApi()
    {
        return android.os.Build.VERSION.SDK_INT >= 16;
    }

    private boolean hasLollipopApi()
    {
        return android.os.Build.VERSION.SDK_INT >= 21;
    }

    private void init(Context context, AttributeSet attributeset)
    {
        mVisible = true;
        mColorNormal = getColor(R.color.material_blue_500);
        mColorPressed = darkenColor(mColorNormal);
        mColorRipple = lightenColor(mColorNormal);
        mColorDisabled = getColor(0x1060000);
        mType = 0;
        mShadow = true;
        mScrollThreshold = getResources().getDimensionPixelOffset(R.dimen.fab_scroll_threshold);
        mShadowSize = getDimension(R.dimen.fab_shadow_size);
        if (attributeset != null)
        {
            initAttributes(context, attributeset);
        }
        updateBackground();
    }

    private void initAttributes(Context context, AttributeSet attributeset)
    {
        context = getTypedArray(context, attributeset, R.styleable.FloatingActionButton);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        mColorNormal = context.getColor(R.styleable.FloatingActionButton_fab_colorNormal, getColor(R.color.material_blue_500));
        mColorPressed = context.getColor(R.styleable.FloatingActionButton_fab_colorPressed, darkenColor(mColorNormal));
        mColorRipple = context.getColor(R.styleable.FloatingActionButton_fab_colorRipple, lightenColor(mColorNormal));
        mColorDisabled = context.getColor(R.styleable.FloatingActionButton_fab_colorDisabled, mColorDisabled);
        mShadow = context.getBoolean(R.styleable.FloatingActionButton_fab_shadow, true);
        mType = context.getInt(R.styleable.FloatingActionButton_fab_type, 0);
        context.recycle();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    private static int lightenColor(int i)
    {
        float af[] = new float[3];
        Color.colorToHSV(i, af);
        af[2] = af[2] * 1.1F;
        return Color.HSVToColor(af);
    }

    private void setBackgroundCompat(Drawable drawable)
    {
        if (hasLollipopApi())
        {
            float f;
            int i;
            if (mShadow)
            {
                if (getElevation() > 0.0F)
                {
                    f = getElevation();
                } else
                {
                    f = getDimension(R.dimen.fab_elevation_lollipop);
                }
            } else
            {
                f = 0.0F;
            }
            setElevation(f);
            i = mColorRipple;
            drawable = new RippleDrawable(new ColorStateList(new int[][] {
                new int[0]
            }, new int[] {
                i
            }), drawable, null);
            setOutlineProvider(new ViewOutlineProvider() {

                final FloatingActionButton this$0;

                public void getOutline(View view, Outline outline)
                {
                    view = FloatingActionButton.this;
                    int j;
                    if (mType == 0)
                    {
                        j = R.dimen.fab_size_normal;
                    } else
                    {
                        j = R.dimen.fab_size_mini;
                    }
                    j = view.getDimension(j);
                    outline.setOval(0, 0, j, j);
                }

            
            {
                this$0 = FloatingActionButton.this;
                super();
            }
            });
            setClipToOutline(true);
            setBackground(drawable);
            return;
        }
        if (hasJellyBeanApi())
        {
            setBackground(drawable);
            return;
        } else
        {
            setBackgroundDrawable(drawable);
            return;
        }
    }

    private void setMarginsWithoutShadow()
    {
        if (!mMarginsSet && (getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams))
        {
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)getLayoutParams();
            marginlayoutparams.setMargins(marginlayoutparams.leftMargin - mShadowSize, marginlayoutparams.topMargin - mShadowSize, marginlayoutparams.rightMargin - mShadowSize, marginlayoutparams.bottomMargin - mShadowSize);
            requestLayout();
            mMarginsSet = true;
        }
    }

    private void toggle(final boolean visible, final boolean animate, boolean flag)
    {
        if (mVisible == visible && !flag) goto _L2; else goto _L1
_L1:
        int i;
        mVisible = visible;
        i = getHeight();
        if (i != 0 || flag) goto _L4; else goto _L3
_L3:
        ViewTreeObserver viewtreeobserver = getViewTreeObserver();
        if (!viewtreeobserver.isAlive()) goto _L4; else goto _L5
_L5:
        viewtreeobserver.addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener() {

            final FloatingActionButton this$0;
            final boolean val$animate;
            final boolean val$visible;

            public boolean onPreDraw()
            {
                ViewTreeObserver viewtreeobserver1 = getViewTreeObserver();
                if (viewtreeobserver1.isAlive())
                {
                    viewtreeobserver1.removeOnPreDrawListener(this);
                }
                toggle(visible, animate, true);
                return true;
            }

            
            {
                this$0 = FloatingActionButton.this;
                visible = flag;
                animate = flag1;
                super();
            }
        });
_L2:
        return;
_L4:
        if (visible)
        {
            i = 0;
        } else
        {
            i += getMarginBottom();
        }
        if (animate)
        {
            ViewPropertyAnimator.animate(this).setInterpolator(mInterpolator).setDuration(200L).translationY(i);
        } else
        {
            ViewHelper.setTranslationY(this, i);
        }
        if (!hasHoneycombApi())
        {
            setClickable(visible);
            return;
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    private void updateBackground()
    {
        StateListDrawable statelistdrawable = new StateListDrawable();
        Drawable drawable = createDrawable(mColorPressed);
        statelistdrawable.addState(new int[] {
            0x10100a7
        }, drawable);
        drawable = createDrawable(mColorDisabled);
        statelistdrawable.addState(new int[] {
            0xfefeff62
        }, drawable);
        drawable = createDrawable(mColorNormal);
        statelistdrawable.addState(new int[0], drawable);
        setBackgroundCompat(statelistdrawable);
    }

    public void attachToScrollView(ObservableScrollView observablescrollview)
    {
        attachToScrollView(observablescrollview, null, null);
    }

    public void attachToScrollView(ObservableScrollView observablescrollview, ScrollDirectionListener scrolldirectionlistener, ObservableScrollView.OnScrollChangedListener onscrollchangedlistener)
    {
        ScrollViewScrollDetectorImpl scrollviewscrolldetectorimpl = new ScrollViewScrollDetectorImpl();
        scrollviewscrolldetectorimpl.setScrollDirectionListener(scrolldirectionlistener);
        scrollviewscrolldetectorimpl.setOnScrollChangedListener(onscrollchangedlistener);
        scrollviewscrolldetectorimpl.setScrollThreshold(mScrollThreshold);
        observablescrollview.setOnScrollChangedListener(scrollviewscrolldetectorimpl);
    }

    public int getColorNormal()
    {
        return mColorNormal;
    }

    public int getColorPressed()
    {
        return mColorPressed;
    }

    public int getColorRipple()
    {
        return mColorRipple;
    }

    public int getType()
    {
        return mType;
    }

    public void hide()
    {
        hide(true);
    }

    public void hide(boolean flag)
    {
        toggle(false, flag, false);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (mType == 0)
        {
            i = R.dimen.fab_size_normal;
        } else
        {
            i = R.dimen.fab_size_mini;
        }
        j = getDimension(i);
        i = j;
        if (mShadow)
        {
            i = j;
            if (!hasLollipopApi())
            {
                i = j + mShadowSize * 2;
                setMarginsWithoutShadow();
            }
        }
        setMeasuredDimension(i, i);
    }

    public void setColorNormal(int i)
    {
        if (i != mColorNormal)
        {
            mColorNormal = i;
            updateBackground();
        }
    }

    public void setColorNormalResId(int i)
    {
        setColorNormal(getColor(i));
    }

    public void setColorPressed(int i)
    {
        if (i != mColorPressed)
        {
            mColorPressed = i;
            updateBackground();
        }
    }

    public void setColorPressedResId(int i)
    {
        setColorPressed(getColor(i));
    }

    public void setColorRipple(int i)
    {
        if (i != mColorRipple)
        {
            mColorRipple = i;
            updateBackground();
        }
    }

    public void setColorRippleResId(int i)
    {
        setColorRipple(getColor(i));
    }

    public void setShadow(boolean flag)
    {
        if (flag != mShadow)
        {
            mShadow = flag;
            updateBackground();
        }
    }

    public void setType(int i)
    {
        if (i != mType)
        {
            mType = i;
            updateBackground();
        }
    }

    public void show()
    {
        show(true);
    }

    public void show(boolean flag)
    {
        toggle(true, flag, false);
    }



}
