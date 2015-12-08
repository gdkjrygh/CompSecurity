// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.c.a.a;
import android.support.v4.widget.c;
import android.support.v7.graphics.drawable.DrawableUtils;
import android.support.v7.internal.widget.TintManager;
import android.util.AttributeSet;
import android.widget.CompoundButton;

class AppCompatCompoundButtonHelper
{
    static interface DirectSetButtonDrawableInterface
    {

        public abstract void setButtonDrawable(Drawable drawable);
    }


    private ColorStateList mButtonTintList;
    private android.graphics.PorterDuff.Mode mButtonTintMode;
    private boolean mHasButtonTint;
    private boolean mHasButtonTintMode;
    private boolean mSkipNextApply;
    private final TintManager mTintManager;
    private final CompoundButton mView;

    AppCompatCompoundButtonHelper(CompoundButton compoundbutton, TintManager tintmanager)
    {
        mButtonTintList = null;
        mButtonTintMode = null;
        mHasButtonTint = false;
        mHasButtonTintMode = false;
        mView = compoundbutton;
        mTintManager = tintmanager;
    }

    void applyButtonTint()
    {
        Drawable drawable = c.a(mView);
        if (drawable != null && (mHasButtonTint || mHasButtonTintMode))
        {
            drawable = a.c(drawable).mutate();
            if (mHasButtonTint)
            {
                a.a(drawable, mButtonTintList);
            }
            if (mHasButtonTintMode)
            {
                a.a(drawable, mButtonTintMode);
            }
            if (drawable.isStateful())
            {
                drawable.setState(mView.getDrawableState());
            }
            mView.setButtonDrawable(drawable);
        }
    }

    int getCompoundPaddingLeft(int i)
    {
        int j = i;
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            Drawable drawable = c.a(mView);
            j = i;
            if (drawable != null)
            {
                j = i + drawable.getIntrinsicWidth();
            }
        }
        return j;
    }

    ColorStateList getSupportButtonTintList()
    {
        return mButtonTintList;
    }

    android.graphics.PorterDuff.Mode getSupportButtonTintMode()
    {
        return mButtonTintMode;
    }

    void loadFromAttributes(AttributeSet attributeset, int i)
    {
        attributeset = mView.getContext().obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.CompoundButton, i, 0);
        if (!attributeset.hasValue(android.support.v7.appcompat.R.styleable.CompoundButton_android_button))
        {
            break MISSING_BLOCK_LABEL_55;
        }
        i = attributeset.getResourceId(android.support.v7.appcompat.R.styleable.CompoundButton_android_button, 0);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        mView.setButtonDrawable(mTintManager.getDrawable(i));
        if (attributeset.hasValue(android.support.v7.appcompat.R.styleable.CompoundButton_buttonTint))
        {
            c.a(mView, attributeset.getColorStateList(android.support.v7.appcompat.R.styleable.CompoundButton_buttonTint));
        }
        if (attributeset.hasValue(android.support.v7.appcompat.R.styleable.CompoundButton_buttonTintMode))
        {
            c.a(mView, DrawableUtils.parseTintMode(attributeset.getInt(android.support.v7.appcompat.R.styleable.CompoundButton_buttonTintMode, -1), null));
        }
        attributeset.recycle();
        return;
        Exception exception;
        exception;
        attributeset.recycle();
        throw exception;
    }

    void onSetButtonDrawable()
    {
        if (mSkipNextApply)
        {
            mSkipNextApply = false;
            return;
        } else
        {
            mSkipNextApply = true;
            applyButtonTint();
            return;
        }
    }

    void setSupportButtonTintList(ColorStateList colorstatelist)
    {
        mButtonTintList = colorstatelist;
        mHasButtonTint = true;
        applyButtonTint();
    }

    void setSupportButtonTintMode(android.graphics.PorterDuff.Mode mode)
    {
        mButtonTintMode = mode;
        mHasButtonTintMode = true;
        applyButtonTint();
    }
}
