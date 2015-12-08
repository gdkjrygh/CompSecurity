// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.view.TintableBackgroundView;
import android.support.v7.internal.widget.TintContextWrapper;
import android.support.v7.internal.widget.TintInfo;
import android.support.v7.internal.widget.TintManager;
import android.support.v7.internal.widget.TintTypedArray;
import android.util.AttributeSet;
import android.widget.EditText;

public class AppCompatEditText extends EditText
    implements TintableBackgroundView
{

    private static final int TINT_ATTRS[] = {
        0x10100d4
    };
    private TintInfo mBackgroundTint;
    private TintInfo mInternalBackgroundTint;
    private TintManager mTintManager;

    public AppCompatEditText(Context context)
    {
        this(context, null);
    }

    public AppCompatEditText(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, android.support.v7.appcompat.R.attr.editTextStyle);
    }

    public AppCompatEditText(Context context, AttributeSet attributeset, int i)
    {
        super(TintContextWrapper.wrap(context), attributeset, i);
        if (TintManager.SHOULD_BE_USED)
        {
            context = TintTypedArray.obtainStyledAttributes(getContext(), attributeset, TINT_ATTRS, i, 0);
            if (context.hasValue(0))
            {
                attributeset = context.getTintManager().getTintList(context.getResourceId(0, -1));
                if (attributeset != null)
                {
                    setInternalBackgroundTint(attributeset);
                }
            }
            mTintManager = context.getTintManager();
            context.recycle();
        }
    }

    private void applySupportBackgroundTint()
    {
        if (getBackground() != null)
        {
            if (mBackgroundTint != null)
            {
                TintManager.tintViewBackground(this, mBackgroundTint);
            } else
            if (mInternalBackgroundTint != null)
            {
                TintManager.tintViewBackground(this, mInternalBackgroundTint);
                return;
            }
        }
    }

    private void setInternalBackgroundTint(ColorStateList colorstatelist)
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

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        applySupportBackgroundTint();
    }

    public ColorStateList getSupportBackgroundTintList()
    {
        if (mBackgroundTint != null)
        {
            return mBackgroundTint.mTintList;
        } else
        {
            return null;
        }
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode()
    {
        if (mBackgroundTint != null)
        {
            return mBackgroundTint.mTintMode;
        } else
        {
            return null;
        }
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        super.setBackgroundDrawable(drawable);
        setInternalBackgroundTint(null);
    }

    public void setBackgroundResource(int i)
    {
        super.setBackgroundResource(i);
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

    public void setSupportBackgroundTintList(ColorStateList colorstatelist)
    {
        if (mBackgroundTint == null)
        {
            mBackgroundTint = new TintInfo();
        }
        mBackgroundTint.mTintList = colorstatelist;
        mBackgroundTint.mHasTintList = true;
        applySupportBackgroundTint();
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
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
