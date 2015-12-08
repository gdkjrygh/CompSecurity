// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.x;
import android.support.v7.graphics.drawable.DrawableUtils;
import android.support.v7.internal.widget.TintInfo;
import android.support.v7.internal.widget.TintManager;
import android.util.AttributeSet;
import android.view.View;

class AppCompatBackgroundHelper
{

    private TintInfo mBackgroundTint;
    private TintInfo mInternalBackgroundTint;
    private final TintManager mTintManager;
    private final View mView;

    AppCompatBackgroundHelper(View view, TintManager tintmanager)
    {
        mView = view;
        mTintManager = tintmanager;
    }

    void applySupportBackgroundTint()
    {
        if (mView.getBackground() != null)
        {
            if (mBackgroundTint != null)
            {
                TintManager.tintViewBackground(mView, mBackgroundTint);
            } else
            if (mInternalBackgroundTint != null)
            {
                TintManager.tintViewBackground(mView, mInternalBackgroundTint);
                return;
            }
        }
    }

    ColorStateList getSupportBackgroundTintList()
    {
        if (mBackgroundTint != null)
        {
            return mBackgroundTint.mTintList;
        } else
        {
            return null;
        }
    }

    android.graphics.PorterDuff.Mode getSupportBackgroundTintMode()
    {
        if (mBackgroundTint != null)
        {
            return mBackgroundTint.mTintMode;
        } else
        {
            return null;
        }
    }

    void loadFromAttributes(AttributeSet attributeset, int i)
    {
        attributeset = mView.getContext().obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ViewBackgroundHelper, i, 0);
        ColorStateList colorstatelist;
        if (!attributeset.hasValue(android.support.v7.appcompat.R.styleable.ViewBackgroundHelper_android_background))
        {
            break MISSING_BLOCK_LABEL_52;
        }
        colorstatelist = mTintManager.getTintList(attributeset.getResourceId(android.support.v7.appcompat.R.styleable.ViewBackgroundHelper_android_background, -1));
        if (colorstatelist == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        setInternalBackgroundTint(colorstatelist);
        if (attributeset.hasValue(android.support.v7.appcompat.R.styleable.ViewBackgroundHelper_backgroundTint))
        {
            x.a(mView, attributeset.getColorStateList(android.support.v7.appcompat.R.styleable.ViewBackgroundHelper_backgroundTint));
        }
        if (attributeset.hasValue(android.support.v7.appcompat.R.styleable.ViewBackgroundHelper_backgroundTintMode))
        {
            x.a(mView, DrawableUtils.parseTintMode(attributeset.getInt(android.support.v7.appcompat.R.styleable.ViewBackgroundHelper_backgroundTintMode, -1), null));
        }
        attributeset.recycle();
        return;
        Exception exception;
        exception;
        attributeset.recycle();
        throw exception;
    }

    void onSetBackgroundDrawable(Drawable drawable)
    {
        setInternalBackgroundTint(null);
    }

    void onSetBackgroundResource(int i)
    {
        ColorStateList colorstatelist;
        if (mTintManager != null)
        {
            colorstatelist = mTintManager.getTintList(i);
        } else
        {
            colorstatelist = null;
        }
        setInternalBackgroundTint(colorstatelist);
    }

    void setInternalBackgroundTint(ColorStateList colorstatelist)
    {
        if (colorstatelist != null)
        {
            if (mInternalBackgroundTint == null)
            {
                mInternalBackgroundTint = new TintInfo();
            }
            mInternalBackgroundTint.mTintList = colorstatelist;
            mInternalBackgroundTint.mHasTintList = true;
        } else
        {
            mInternalBackgroundTint = null;
        }
        applySupportBackgroundTint();
    }

    void setSupportBackgroundTintList(ColorStateList colorstatelist)
    {
        if (mBackgroundTint == null)
        {
            mBackgroundTint = new TintInfo();
        }
        mBackgroundTint.mTintList = colorstatelist;
        mBackgroundTint.mHasTintList = true;
        applySupportBackgroundTint();
    }

    void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
    {
        if (mBackgroundTint == null)
        {
            mBackgroundTint = new TintInfo();
        }
        mBackgroundTint.mTintMode = mode;
        mBackgroundTint.mHasTintMode = true;
        applySupportBackgroundTint();
    }
}
