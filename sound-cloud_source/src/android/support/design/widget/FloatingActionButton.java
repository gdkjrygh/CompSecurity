// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//            FloatingActionButtonLollipop, FloatingActionButtonImpl, FloatingActionButtonHoneycombMr1, FloatingActionButtonEclairMr1, 
//            CoordinatorLayout, AppBarLayout, ViewGroupUtils, AnimationUtils

public class FloatingActionButton extends ImageView
{
    public static class Behavior extends CoordinatorLayout.Behavior
    {

        private static final boolean SNACKBAR_BEHAVIOR_ENABLED;
        private Rect mTmpRect;
        private float mTranslationY;

        private float getFabTranslationYForSnackbar(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton)
        {
            float f = 0.0F;
            List list = coordinatorlayout.getDependencies(floatingactionbutton);
            int j = list.size();
            for (int i = 0; i < j; i++)
            {
                View view = (View)list.get(i);
                if ((view instanceof Snackbar.SnackbarLayout) && coordinatorlayout.doViewsOverlap(floatingactionbutton, view))
                {
                    f = Math.min(f, ViewCompat.getTranslationY(view) - (float)view.getHeight());
                }
            }

            return f;
        }

        private void offsetIfNeeded(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton)
        {
            Rect rect;
            int j;
            j = 0;
            rect = floatingactionbutton.mShadowPadding;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) goto _L2; else goto _L1
_L1:
            CoordinatorLayout.LayoutParams layoutparams = (CoordinatorLayout.LayoutParams)floatingactionbutton.getLayoutParams();
            int i;
            if (floatingactionbutton.getRight() >= coordinatorlayout.getWidth() - layoutparams.rightMargin)
            {
                i = rect.right;
            } else
            if (floatingactionbutton.getLeft() <= layoutparams.leftMargin)
            {
                i = -rect.left;
            } else
            {
                i = 0;
            }
            if (floatingactionbutton.getBottom() < coordinatorlayout.getBottom() - layoutparams.bottomMargin) goto _L4; else goto _L3
_L3:
            j = rect.bottom;
_L6:
            floatingactionbutton.offsetTopAndBottom(j);
            floatingactionbutton.offsetLeftAndRight(i);
_L2:
            return;
_L4:
            if (floatingactionbutton.getTop() <= layoutparams.topMargin)
            {
                j = -rect.top;
            }
            if (true) goto _L6; else goto _L5
_L5:
        }

        private void updateFabTranslationForSnackbar(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton, View view)
        {
            float f;
            if (floatingactionbutton.getVisibility() == 0)
            {
                if ((f = getFabTranslationYForSnackbar(coordinatorlayout, floatingactionbutton)) != mTranslationY)
                {
                    ViewCompat.animate(floatingactionbutton).cancel();
                    ViewCompat.setTranslationY(floatingactionbutton, f);
                    mTranslationY = f;
                    return;
                }
            }
        }

        private boolean updateFabVisibility(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, FloatingActionButton floatingactionbutton)
        {
            if (((CoordinatorLayout.LayoutParams)floatingactionbutton.getLayoutParams()).getAnchorId() != appbarlayout.getId())
            {
                return false;
            }
            if (mTmpRect == null)
            {
                mTmpRect = new Rect();
            }
            Rect rect = mTmpRect;
            ViewGroupUtils.getDescendantRect(coordinatorlayout, appbarlayout, rect);
            if (rect.bottom <= appbarlayout.getMinimumHeightForVisibleOverlappingContent())
            {
                floatingactionbutton.hide();
            } else
            {
                floatingactionbutton.show();
            }
            return true;
        }

        public boolean layoutDependsOn(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton, View view)
        {
            return SNACKBAR_BEHAVIOR_ENABLED && (view instanceof Snackbar.SnackbarLayout);
        }

        public volatile boolean layoutDependsOn(CoordinatorLayout coordinatorlayout, View view, View view1)
        {
            return layoutDependsOn(coordinatorlayout, (FloatingActionButton)view, view1);
        }

        public boolean onDependentViewChanged(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton, View view)
        {
            if (!(view instanceof Snackbar.SnackbarLayout)) goto _L2; else goto _L1
_L1:
            updateFabTranslationForSnackbar(coordinatorlayout, floatingactionbutton, view);
_L4:
            return false;
_L2:
            if (view instanceof AppBarLayout)
            {
                updateFabVisibility(coordinatorlayout, (AppBarLayout)view, floatingactionbutton);
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public volatile boolean onDependentViewChanged(CoordinatorLayout coordinatorlayout, View view, View view1)
        {
            return onDependentViewChanged(coordinatorlayout, (FloatingActionButton)view, view1);
        }

        public void onDependentViewRemoved(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton, View view)
        {
            if (view instanceof Snackbar.SnackbarLayout)
            {
                ViewCompat.animate(floatingactionbutton).translationY(0.0F).setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR).setListener(null);
            }
        }

        public volatile void onDependentViewRemoved(CoordinatorLayout coordinatorlayout, View view, View view1)
        {
            onDependentViewRemoved(coordinatorlayout, (FloatingActionButton)view, view1);
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton, int i)
        {
            List list = coordinatorlayout.getDependencies(floatingactionbutton);
            int k = list.size();
            int j = 0;
            do
            {
                if (j >= k)
                {
                    break;
                }
                View view = (View)list.get(j);
                if ((view instanceof AppBarLayout) && updateFabVisibility(coordinatorlayout, (AppBarLayout)view, floatingactionbutton))
                {
                    break;
                }
                j++;
            } while (true);
            coordinatorlayout.onLayoutChild(floatingactionbutton, i);
            offsetIfNeeded(coordinatorlayout, floatingactionbutton);
            return true;
        }

        public volatile boolean onLayoutChild(CoordinatorLayout coordinatorlayout, View view, int i)
        {
            return onLayoutChild(coordinatorlayout, (FloatingActionButton)view, i);
        }

        static 
        {
            boolean flag;
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            SNACKBAR_BEHAVIOR_ENABLED = flag;
        }

        public Behavior()
        {
        }
    }


    private static final int SIZE_MINI = 1;
    private static final int SIZE_NORMAL = 0;
    private ColorStateList mBackgroundTint;
    private android.graphics.PorterDuff.Mode mBackgroundTintMode;
    private int mBorderWidth;
    private int mContentPadding;
    private final FloatingActionButtonImpl mImpl;
    private int mRippleColor;
    private final Rect mShadowPadding;
    private int mSize;

    public FloatingActionButton(Context context)
    {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public FloatingActionButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mShadowPadding = new Rect();
        attributeset = context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.FloatingActionButton, i, android.support.design.R.style.Widget_Design_FloatingActionButton);
        context = attributeset.getDrawable(android.support.design.R.styleable.FloatingActionButton_android_background);
        mBackgroundTint = attributeset.getColorStateList(android.support.design.R.styleable.FloatingActionButton_backgroundTint);
        mBackgroundTintMode = parseTintMode(attributeset.getInt(android.support.design.R.styleable.FloatingActionButton_backgroundTintMode, -1), null);
        mRippleColor = attributeset.getColor(android.support.design.R.styleable.FloatingActionButton_rippleColor, 0);
        mSize = attributeset.getInt(android.support.design.R.styleable.FloatingActionButton_fabSize, 0);
        mBorderWidth = attributeset.getDimensionPixelSize(android.support.design.R.styleable.FloatingActionButton_borderWidth, 0);
        float f = attributeset.getDimension(android.support.design.R.styleable.FloatingActionButton_elevation, 0.0F);
        float f1 = attributeset.getDimension(android.support.design.R.styleable.FloatingActionButton_pressedTranslationZ, 0.0F);
        attributeset.recycle();
        attributeset = new _cls1();
        i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            mImpl = new FloatingActionButtonLollipop(this, attributeset);
        } else
        if (i >= 12)
        {
            mImpl = new FloatingActionButtonHoneycombMr1(this, attributeset);
        } else
        {
            mImpl = new FloatingActionButtonEclairMr1(this, attributeset);
        }
        i = (int)getResources().getDimension(android.support.design.R.dimen.fab_content_size);
        mContentPadding = (getSizeDimension() - i) / 2;
        mImpl.setBackgroundDrawable(context, mBackgroundTint, mBackgroundTintMode, mRippleColor, mBorderWidth);
        mImpl.setElevation(f);
        mImpl.setPressedTranslationZ(f1);
        setClickable(true);
    }

    static android.graphics.PorterDuff.Mode parseTintMode(int i, android.graphics.PorterDuff.Mode mode)
    {
        switch (i)
        {
        default:
            return mode;

        case 3: // '\003'
            return android.graphics.PorterDuff.Mode.SRC_OVER;

        case 5: // '\005'
            return android.graphics.PorterDuff.Mode.SRC_IN;

        case 9: // '\t'
            return android.graphics.PorterDuff.Mode.SRC_ATOP;

        case 14: // '\016'
            return android.graphics.PorterDuff.Mode.MULTIPLY;

        case 15: // '\017'
            return android.graphics.PorterDuff.Mode.SCREEN;
        }
    }

    private static int resolveAdjustedSize(int i, int j)
    {
        int k = android.view.View.MeasureSpec.getMode(j);
        j = android.view.View.MeasureSpec.getSize(j);
        switch (k)
        {
        case 0: // '\0'
        default:
            return i;

        case -2147483648: 
            return Math.min(i, j);

        case 1073741824: 
            return j;
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        mImpl.onDrawableStateChanged(getDrawableState());
    }

    public ColorStateList getBackgroundTintList()
    {
        return mBackgroundTint;
    }

    public android.graphics.PorterDuff.Mode getBackgroundTintMode()
    {
        return mBackgroundTintMode;
    }

    final int getSizeDimension()
    {
        switch (mSize)
        {
        default:
            return getResources().getDimensionPixelSize(android.support.design.R.dimen.fab_size_normal);

        case 1: // '\001'
            return getResources().getDimensionPixelSize(android.support.design.R.dimen.fab_size_mini);
        }
    }

    public void hide()
    {
        if (getVisibility() != 0)
        {
            return;
        }
        if (ViewCompat.isLaidOut(this) && !isInEditMode())
        {
            mImpl.hide();
            return;
        } else
        {
            setVisibility(8);
            return;
        }
    }

    public void jumpDrawablesToCurrentState()
    {
        super.jumpDrawablesToCurrentState();
        mImpl.jumpDrawableToCurrentState();
    }

    protected void onMeasure(int i, int j)
    {
        int k = getSizeDimension();
        i = Math.min(resolveAdjustedSize(k, i), resolveAdjustedSize(k, j));
        setMeasuredDimension(mShadowPadding.left + i + mShadowPadding.right, i + mShadowPadding.top + mShadowPadding.bottom);
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        if (mImpl != null)
        {
            mImpl.setBackgroundDrawable(drawable, mBackgroundTint, mBackgroundTintMode, mRippleColor, mBorderWidth);
        }
    }

    public void setBackgroundTintList(ColorStateList colorstatelist)
    {
        mImpl.setBackgroundTintList(colorstatelist);
    }

    public void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
    {
        mImpl.setBackgroundTintMode(mode);
    }

    public void setRippleColor(int i)
    {
        if (mRippleColor != i)
        {
            mRippleColor = i;
            mImpl.setRippleColor(i);
        }
    }

    public void show()
    {
        if (getVisibility() != 0)
        {
            setVisibility(0);
            if (ViewCompat.isLaidOut(this))
            {
                mImpl.show();
                return;
            }
        }
    }




    private class _cls1
        implements ShadowViewDelegate
    {

        final FloatingActionButton this$0;

        public float getRadius()
        {
            return (float)getSizeDimension() / 2.0F;
        }

        public void setBackgroundDrawable(Drawable drawable)
        {
            View.this.setBackgroundDrawable(drawable);
        }

        public void setShadowPadding(int i, int j, int k, int l)
        {
            mShadowPadding.set(i, j, k, l);
            setPadding(mContentPadding + i, mContentPadding + j, mContentPadding + k, mContentPadding + l);
        }

        _cls1()
        {
            this$0 = FloatingActionButton.this;
            super();
        }
    }

}
