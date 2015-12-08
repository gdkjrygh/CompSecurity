// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package android.support.design.widget:
//            CircularBorderDrawable, ShadowViewDelegate

abstract class FloatingActionButtonImpl
{
    static interface InternalVisibilityChangedListener
    {

        public abstract void onHidden();

        public abstract void onShown();
    }


    static final int EMPTY_STATE_SET[] = new int[0];
    static final int FOCUSED_ENABLED_STATE_SET[] = {
        0x101009c, 0x101009e
    };
    static final int PRESSED_ENABLED_STATE_SET[] = {
        0x10100a7, 0x101009e
    };
    static final int SHOW_HIDE_ANIM_DURATION = 200;
    private android.view.ViewTreeObserver.OnPreDrawListener mPreDrawListener;
    final ShadowViewDelegate mShadowViewDelegate;
    final View mView;

    FloatingActionButtonImpl(View view, ShadowViewDelegate shadowviewdelegate)
    {
        mView = view;
        mShadowViewDelegate = shadowviewdelegate;
    }

    private void ensurePreDrawListener()
    {
        if (mPreDrawListener == null)
        {
            mPreDrawListener = new android.view.ViewTreeObserver.OnPreDrawListener() {

                final FloatingActionButtonImpl this$0;

                public boolean onPreDraw()
                {
                    FloatingActionButtonImpl.this.onPreDraw();
                    return true;
                }

            
            {
                this$0 = FloatingActionButtonImpl.this;
                super();
            }
            };
        }
    }

    CircularBorderDrawable createBorderDrawable(int i, ColorStateList colorstatelist)
    {
        Resources resources = mView.getResources();
        CircularBorderDrawable circularborderdrawable = newCircularDrawable();
        circularborderdrawable.setGradientColors(resources.getColor(android.support.design.R.color.design_fab_stroke_top_outer_color), resources.getColor(android.support.design.R.color.design_fab_stroke_top_inner_color), resources.getColor(android.support.design.R.color.design_fab_stroke_end_inner_color), resources.getColor(android.support.design.R.color.design_fab_stroke_end_outer_color));
        circularborderdrawable.setBorderWidth(i);
        circularborderdrawable.setBorderTint(colorstatelist);
        return circularborderdrawable;
    }

    GradientDrawable createShapeDrawable()
    {
        GradientDrawable gradientdrawable = new GradientDrawable();
        gradientdrawable.setShape(1);
        gradientdrawable.setColor(-1);
        return gradientdrawable;
    }

    abstract void hide(InternalVisibilityChangedListener internalvisibilitychangedlistener);

    abstract void jumpDrawableToCurrentState();

    CircularBorderDrawable newCircularDrawable()
    {
        return new CircularBorderDrawable();
    }

    void onAttachedToWindow()
    {
        if (requirePreDrawListener())
        {
            ensurePreDrawListener();
            mView.getViewTreeObserver().addOnPreDrawListener(mPreDrawListener);
        }
    }

    void onDetachedFromWindow()
    {
        if (mPreDrawListener != null)
        {
            mView.getViewTreeObserver().removeOnPreDrawListener(mPreDrawListener);
            mPreDrawListener = null;
        }
    }

    abstract void onDrawableStateChanged(int ai[]);

    void onPreDraw()
    {
    }

    boolean requirePreDrawListener()
    {
        return false;
    }

    abstract void setBackgroundDrawable(ColorStateList colorstatelist, android.graphics.PorterDuff.Mode mode, int i, int j);

    abstract void setBackgroundTintList(ColorStateList colorstatelist);

    abstract void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode);

    abstract void setElevation(float f);

    abstract void setPressedTranslationZ(float f);

    abstract void setRippleColor(int i);

    abstract void show(InternalVisibilityChangedListener internalvisibilitychangedlistener);

}
