// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.widget.TintContextWrapper;
import android.support.v7.internal.widget.TintInfo;
import android.support.v7.internal.widget.TintManager;
import android.support.v7.internal.widget.TintTypedArray;
import android.util.AttributeSet;
import android.widget.EditText;

public final class AppCompatEditText extends EditText
{

    private static final int TINT_ATTRS[] = {
        0x10100d4
    };
    private TintInfo mInternalBackgroundTint;
    private TintManager mTintManager;

    public AppCompatEditText(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f010151);
    }

    private AppCompatEditText(Context context, AttributeSet attributeset, int i)
    {
        super(TintContextWrapper.wrap(context), attributeset, 0x7f010151);
        if (TintManager.SHOULD_BE_USED)
        {
            context = TintTypedArray.obtainStyledAttributes$1a6c1917(getContext(), attributeset, TINT_ATTRS, 0x7f010151);
            if (context.hasValue(0))
            {
                attributeset = context.getTintManager().getTintList(context.getResourceId(0, -1));
                if (attributeset != null)
                {
                    setInternalBackgroundTint(attributeset);
                }
            }
            mTintManager = context.getTintManager();
            ((TintTypedArray) (context)).mWrapped.recycle();
        }
    }

    private void applySupportBackgroundTint()
    {
        if (getBackground() != null && mInternalBackgroundTint != null)
        {
            TintManager.tintViewBackground(this, mInternalBackgroundTint);
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

    protected final void drawableStateChanged()
    {
        super.drawableStateChanged();
        applySupportBackgroundTint();
    }

    public final void setBackgroundDrawable(Drawable drawable)
    {
        super.setBackgroundDrawable(drawable);
        setInternalBackgroundTint(null);
    }

    public final void setBackgroundResource(int i)
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

}
